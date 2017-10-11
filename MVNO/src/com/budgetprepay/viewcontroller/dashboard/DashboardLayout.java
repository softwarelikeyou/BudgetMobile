package com.budgetprepay.viewcontroller.dashboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.ComponentNotFoundException;
import org.zkoss.zk.ui.Components;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.OpenEvent;
import org.zkoss.zk.ui.ext.AfterCompose;
import org.zkoss.zkmax.zul.Portalchildren;
import org.zkoss.zkmax.zul.Portallayout;
import org.zkoss.zul.Center;
import org.zkoss.zul.Panel;
import org.zkoss.zul.Toolbarbutton;
import org.zkoss.zul.Vbox;

import com.budgetprepay.model.entity.User;
import com.budgetprepay.model.entity.UserData;
import com.budgetprepay.viewcontroller.Messages;
import com.budgetprepay.viewcontroller.SessionUtil;
import com.budgetprepay.viewcontroller.WebUtil;
import com.budgetprepay.viewcontroller.component.GenericBorderlayout;

public class DashboardLayout extends GenericBorderlayout implements AfterCompose {

	static final long serialVersionUID = 1L;

	static final String PORTAL_CHILDREN_STYLE = "padding: 5px; text-align: center; vertical-align: top;";
	static final String PORTAL_CHILDREN_ID_PREFIX = "portalChildrenColumn-";

	static final char SAVED_USER_SETTING_LIST_SEPARATOR = ',';

	static final String PORTAL_CHILDREN_LIST_KEY_PREFIX = "dashboard.portal.column.list-";
	static final String PORTAL_CHILDREN_COLUMN_COUNT_KEY = "dashboard.portal.column.count";

	public static final String PIE_PORTLET = "piePortlet";
	public static final String BAR_PORTLET = "barPortlet";
	public static final String DOWNLOAD_PORTLET = "downloadPortlet";
	//public static final String TOPUP_PORTLET = "topupPortlet";
	//public static final String BEQUICK_PORTLET = "bequickPortlet";
	public static final String PLINTRON_BAR_PORTLET = "plintronBarPortlet";

	static final List<String> SUPER_USER_ONLY_PANELS = new ArrayList<String>();
	static final List<String> POWER_USER_OR_ABOVE_PANELS = new ArrayList<String>();

	static final int DEFAULT_COLUMN_COUNT = 2;
	static final int MAX_COLUMNS = 3;

	static final String EMPTY_PORTLET = "emptyPortlet";

	static final Map<String, String> COMPONENT_URL_MAP = new HashMap<String, String>();
	static final List<String> SUPER_USER_DEFAULT_CHILDREN_COLUMN_0 = new ArrayList<String>();
	static final List<String> SUPER_USER_DEFAULT_CHILDREN_COLUMN_1 = new ArrayList<String>();

	static final List<String> POWER_USER_DEFAULT_CHILDREN_COLUMN_0 = new ArrayList<String>();
	static final List<String> POWER_USER_DEFAULT_CHILDREN_COLUMN_1 = new ArrayList<String>();

	static {
		COMPONENT_URL_MAP.put(EMPTY_PORTLET, "/Dashboard/empty-portlet.zul");
		COMPONENT_URL_MAP.put(PLINTRON_BAR_PORTLET, "/Dashboard/plintron-bar-portlet.zul");
		//COMPONENT_URL_MAP.put(TOPUP_PORTLET, "/Dashboard/topup-portlet.zul");
		COMPONENT_URL_MAP.put(BAR_PORTLET, "/Dashboard/bar-portlet.zul");
		COMPONENT_URL_MAP.put(DOWNLOAD_PORTLET, "/Dashboard/download-portlet.zul");
		COMPONENT_URL_MAP.put(PIE_PORTLET, "/Dashboard/pie-portlet.zul");
		//COMPONENT_URL_MAP.put(BEQUICK_PORTLET, "/Dashboard/bequick-portlet.zul");
		
		SUPER_USER_ONLY_PANELS.add(EMPTY_PORTLET);
	}

	protected Center dashboardCenter;
	protected Vbox dashboardVbox;
	protected Toolbarbutton layout1Button;
	protected Toolbarbutton layout2Button;
	protected Toolbarbutton layout3Button;
	protected Portallayout portalLayout;
	protected Portallayout invisiblePortalLayout;

	protected int columnCount = 2;
	protected List<List<String>> portalChildrenColumnLayout = new ArrayList<List<String>>();

	@Override
	public void afterCompose() {

		super.afterCompose();

		Components.wireVariables(this, this);
		Components.addForwards(this, this);

		invisiblePortalLayout = new Portallayout();
		invisiblePortalLayout.setVisible(false);

		loadSavedLayout();
		createColumns();
		loadColumns();
		createPortlets();
		checkEmptyPortlet();

		portalLayout.addEventListener("onPortalMove", new EventListener() {
			public void onEvent(Event event) throws Exception {
				checkEmptyPortlet();
				savePortalLayout();
			};
		});

	}

	public void onClick$layout1Button(Event event) {
		changeColumnCount(1);
	}

	public void onClick$layout2Button(Event event) {
		changeColumnCount(2);
	}

	public void onClick$layout3Button(Event event) {
		changeColumnCount(3);
	}

	private boolean panelAllowed(String panelName) {

		if( panelName.equals(EMPTY_PORTLET) ) return false;

		User currentUser = SessionUtil.getCurrentUser();

		if( SUPER_USER_ONLY_PANELS.contains(panelName) && !currentUser.isAdministrator() ) return false;

		return true;
	}

	private List<String> sanitizeColumnList(List<String> listToSanitize, List<String> globalUnique) {

		List<String> sanitizedList = new ArrayList<String>();

		for( String panel : listToSanitize ) {
			// is the panel name invalid?
			if( !COMPONENT_URL_MAP.keySet().contains(panel) ) continue;

			if( !panelAllowed(panel) ) continue;

			// is the panel unique for all of the columns?
			if( !globalUnique.contains(panel) ) {
				globalUnique.add(panel);
				sanitizedList.add(panel);
			}

		}

		return sanitizedList;
	}

	private void sanitizeLists(List<List<String>> loadedColumnLists) {

		portalChildrenColumnLayout = new ArrayList<List<String>>();
		List<String> uniqueList = new ArrayList<String>();

		for( List<String> loadedColumnList : loadedColumnLists ) {
			portalChildrenColumnLayout.add(sanitizeColumnList(loadedColumnList, uniqueList));
		}

		// if there are any missing panels not saved to a location add them to first (west) column
		for( String panelName : COMPONENT_URL_MAP.keySet() ) {
			if( !uniqueList.contains(panelName) ) {
				if( !panelAllowed(panelName) ) continue;
				portalChildrenColumnLayout.get(0).add(panelName);
			}
		}
	}

	private List<String> getDefaultColumnList(int column) {

		User currentUser = SessionUtil.getCurrentUser();

		switch( currentUser.getType() ) {
			case ADMINISTRATOR:
				switch( column ) {
					case 0:
						return SUPER_USER_DEFAULT_CHILDREN_COLUMN_0;
					case 1:
						return SUPER_USER_DEFAULT_CHILDREN_COLUMN_1;
				}
				break;
			case SALES:
				switch( column ) {
					case 0:
						return POWER_USER_DEFAULT_CHILDREN_COLUMN_0;
					case 1:
						return POWER_USER_DEFAULT_CHILDREN_COLUMN_1;
				}
				break;
			case READ_ONLY:
				switch( column ) {
					case 0:
						return POWER_USER_DEFAULT_CHILDREN_COLUMN_0;
					case 1:
						return POWER_USER_DEFAULT_CHILDREN_COLUMN_1;
				}
				break;
		}

		return new ArrayList<String>();
	}

	private List<String> getSavedColumnLayout(int column) {
		List<String> columnList = null;

		StringBuffer sb = new StringBuffer(PORTAL_CHILDREN_COLUMN_COUNT_KEY);
		sb.append(column);
		String savedColumnList = null;
		UserData userData = SessionUtil.getUserData(sb.toString());
		if (userData != null)
			savedColumnList = userData.getValue();
		if( savedColumnList != null ) {
			try {
				columnList = Arrays.asList(StringUtils.split(savedColumnList, ','));
				if( columnList == null ) columnList = new ArrayList<String>();
				return columnList;
			}
			catch( Exception e ) {
				return getDefaultColumnList(column);
			}
		}
		else {
			return getDefaultColumnList(column);
		}
	}

	private void loadSavedLayout() {

		List<List<String>> loadedColumnLists = new ArrayList<List<String>>();
		String savedColumnCount = null;
		UserData userData = SessionUtil.getUserData(PORTAL_CHILDREN_COLUMN_COUNT_KEY);
		if (userData != null)
			savedColumnCount = userData.getValue();
		
		if( savedColumnCount != null ) {
			try {
				columnCount = Integer.parseInt(savedColumnCount);
			}
			catch( Exception e ) {
				columnCount = DEFAULT_COLUMN_COUNT;
			}
		}
		else {
			columnCount = DEFAULT_COLUMN_COUNT;
		}

		if( columnCount < 1 ) columnCount = DEFAULT_COLUMN_COUNT;
		if( columnCount > MAX_COLUMNS ) columnCount = MAX_COLUMNS;

		// load each of the lists
		for( int column = 0; column < columnCount; column++ ) {
			loadedColumnLists.add(getSavedColumnLayout(column));
		}

		sanitizeLists(loadedColumnLists);
	}

	@SuppressWarnings("unchecked")
	private List<String> getLiveColumnList(Portalchildren column) {
		List<String> list = new ArrayList<String>();

		List<Component> portalChildren = column.getChildren();
		for( Component c : portalChildren ) {
			if( c instanceof Panel ) list.add(c.getId());
		}

		return list;
	}

	public void createPortlets() {
		int column = 0;
		for( List<String> list : portalChildrenColumnLayout ) {
			int row = 0;
			for( String panelName : list ) {

				Panel panel = new Panel();
				panel.setId(panelName);

				panel.setTitle("");
				panel.setBorder("normal");
				panel.setWidth("100%");

				panel.addEventListener("onOpen", new EventListener() {
					public void onEvent(Event event) throws Exception {
						if( !(event instanceof OpenEvent) ) return;
						OpenEvent oe = (OpenEvent) event;
						if( !(oe.getTarget() instanceof Panel) ) return;
						Panel panel = (Panel) oe.getTarget();
						if( panel.getChildren().isEmpty() ) return;
						if( !(panel.getChildren().get(0) instanceof DashboardPortlet) ) return;
						DashboardPortlet portlet = (DashboardPortlet) panel.getChildren().get(0);
						portlet.handleOpenCloseEvent(oe);
					};
				});

				panel.appendChild(Executions.createComponents(COMPONENT_URL_MAP.get(panelName), panel, null));

				portalLayout.setPanel(panel, column, row);
				row++ ;
			}
			column++ ;
		}
	}

	private void updateColumnButtons() {
		layout1Button.setDisabled(false);
		layout2Button.setDisabled(false);
		layout3Button.setDisabled(false);

		switch( columnCount ) {
			case 1:
				layout1Button.setDisabled(true);
				break;
			case 2:
				layout2Button.setDisabled(true);
				break;
			case 3:
				layout3Button.setDisabled(true);
				break;
			default:
				break;
		}
	}

	private void createColumns() {

		for( int i = 0; i < MAX_COLUMNS; i++ ) {

			final Portalchildren pc = new Portalchildren();
			StringBuffer pcId = new StringBuffer(PORTAL_CHILDREN_ID_PREFIX);
			pcId.append(i);
			pc.setId(pcId.toString());

			pc.setStyle(PORTAL_CHILDREN_STYLE);
			portalLayout.appendChild(pc);
		}
	}

	@SuppressWarnings("unchecked")
	private void loadColumns() {
		updateColumnButtons();

		// we leave 2% for the scrollbar as a kludge to workaround a zk bug
		Integer portalChildrenWidthInt = Integer.valueOf(98 / columnCount);
		StringBuffer sb = new StringBuffer(portalChildrenWidthInt.toString());
		sb.append("%");
		String portalChildrenWidth = sb.toString();

		List<Portalchildren> columns = new ArrayList<Portalchildren>();
		columns.addAll(portalLayout.getChildren());

		// add all hidden columns to our list
		columns.addAll(invisiblePortalLayout.getChildren());

		// make all columns visible
		for( Portalchildren pc : columns ) {
			pc.setParent(portalLayout);
		}

		// move unwanted columns to hidden portallayout
		for( int column = columnCount; column < MAX_COLUMNS; column++ ) {
			columns.get(column).setParent(invisiblePortalLayout);
		}

		// set the widths
		for( Portalchildren pc : (List<Portalchildren>) portalLayout.getChildren() ) {
			pc.setWidth(portalChildrenWidth);
		}
	}

	private void changeColumnCount(int newCount) {
		if( columnCount == newCount ) return;

		int oldColumnCount = columnCount;

		// sane to prevent divide by 0 and madness
		if( newCount < 1 ) {
			columnCount = 1;
		}
		else if( newCount > MAX_COLUMNS ) {
			columnCount = MAX_COLUMNS;
		}
		else {
			columnCount = newCount;
		}

		/*
		 *  Does the current or saved layout have more columns than we want? 
		 *  If so append the panels form the columns that don't fit to the left most visible column
		 */
		if( oldColumnCount > columnCount ) {
			// column we are shifting to
			int shiftToColumn = columnCount - 1;

			// determine the row we start shifting to
			List<String> shiftToColumnList = portalChildrenColumnLayout.get(shiftToColumn);
			int shiftToRow = !shiftToColumnList.isEmpty() ? shiftToColumnList.size() : 0;

			// shift panels in hidden columns
			for( int column = (portalChildrenColumnLayout.size() - 1); column >= columnCount; column-- ) {
				for( String panelId : portalChildrenColumnLayout.get(column) ) {
					try {
						Panel p = (Panel) portalLayout.getFellow(panelId);
						portalLayout.setPanel(p, shiftToColumn, shiftToRow);
						shiftToRow++ ;
					}
					catch( ComponentNotFoundException ex ) {
						// Do nothing
					}
				}
			}
		}

		loadColumns();

		checkEmptyPortlet();
		savePortalLayout();

	}

	@SuppressWarnings("unchecked")
	private void savePortalLayout() {
		portalChildrenColumnLayout = new ArrayList<List<String>>();

		List<Component> portalLayoutChildren = portalLayout.getChildren();
		for( Component c : portalLayoutChildren ) {
			if( c != null && c instanceof Portalchildren && !(c.getChildren().get(0) instanceof EmptyPortlet) ) {
				Portalchildren portalChildren = (Portalchildren) c;
				portalChildrenColumnLayout.add(getLiveColumnList(portalChildren));
			}
		}

		int column = 0;
		try {
			for( List<String> columnList : portalChildrenColumnLayout ) {
				String savedList = StringUtils.join(columnList.toArray(), SAVED_USER_SETTING_LIST_SEPARATOR);
				StringBuffer sb = new StringBuffer(PORTAL_CHILDREN_COLUMN_COUNT_KEY);
				sb.append(column);
				SessionUtil.setUserData(sb.toString(), savedList);
				column++ ;
			}

			// save column count
			Integer integerColumnCount = Integer.valueOf(columnCount);
			String savedColumnCount = integerColumnCount.toString();
			SessionUtil.setUserData(PORTAL_CHILDREN_COLUMN_COUNT_KEY, savedColumnCount);

		}
		catch( Exception ex ) {
			WebUtil.showErrorBox(false, ex, Messages.COULD_NOT_SAVE_DASHBOARD_LAYOUT_FOR_USER);
		}
	}

	protected Panel createEmptyPortlet() {

		Panel panel = new Panel();
		panel.setBorder("none");
		panel.setWidth("100%");
		panel.appendChild(Executions.createComponents(COMPONENT_URL_MAP.get(EMPTY_PORTLET), panel, null));

		return panel;

	}

	@SuppressWarnings("unchecked")
	protected void checkEmptyPortlet() {

		for( Component portalComponent : (List<Component>) portalLayout.getChildren() )
			if( portalComponent instanceof Portalchildren ) checkEmptyPortlet((Portalchildren) portalComponent);

	}

	@SuppressWarnings("unchecked")
	protected void checkEmptyPortlet(Portalchildren portalChild) {

		List<Component> components = portalChild.getChildren();

		if( components.isEmpty() ) {
			components.add(createEmptyPortlet());
		}
		else if( components.size() > 1 ) {
			removeEmptyPortlet(components);
		}
	}

	protected void removeEmptyPortlet(List<Component> components) {

		for( Component component : components ) {
			if( component instanceof Panel && component.getChildren().get(0) instanceof EmptyPortlet ) {
				components.remove(component);
				return;
			}
		}
	}

}
