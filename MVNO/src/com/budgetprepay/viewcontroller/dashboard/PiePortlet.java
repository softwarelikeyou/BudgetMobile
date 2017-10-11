package com.budgetprepay.viewcontroller.dashboard;

import java.awt.Color;

import org.zkoss.zk.ui.Components;
import org.zkoss.zkplus.databind.AnnotateDataBinder;
import org.zkoss.zul.Chart;
import org.zkoss.zul.SimplePieModel;
import org.zkoss.zul.PieModel;

import com.budgetprepay.model.entity.Request.RequestType;
import com.budgetprepay.model.facade.RequestFacade;
import com.budgetprepay.model.facade.UserFacade;
import com.budgetprepay.viewcontroller.Labels;
import com.budgetprepay.viewcontroller.SessionUtil;

public class PiePortlet extends DashboardPortlet {

	private static final long serialVersionUID = 1L;

	private Chart chart;
	private PieChartEngine engine;
	private PieModel model;
	
    public PieModel getData(){
        PieModel model = new SimplePieModel();
        try {
            for (RequestType type : RequestType.values()) {
            	if (type.equals(RequestType.SEARCH_BUCKET))
            		continue;
                Long value = RequestFacade.retrieveByUserTypeCurrentYear(UserFacade.retrieveByGroup(SessionUtil.getCurrentUser().getGroup()), type);
                if (value > 0)
                    model.setValue(type.asString(), value);
            }
        }
        catch (Exception e) {
        	e.printStackTrace();
        }
        
        if (model.getCategories().isEmpty())
        	this.getParent().setVisible(false);
        
        return model;
    }
    
	public static final Color DISK_USAGE_COLOR = new Color(106, 136, 180);					// green 118, 200, 45    203, 217, 237
	public static final Color DISK_FREE_SPACE_COLOR = new Color(203, 217, 237);				// purple 186, 163, 240   106, 136, 180
	
	protected AnnotateDataBinder binder;
	
	@Override
	protected String getPanelTitleI18NKey() {
		return Labels.REQUEST_TYPES;
	}

	@Override
	public void onCreate() {
	    super.onCreate();
		
		Components.wireVariables(this, this);
		Components.addForwards(this, this);
		
		engine = new PieChartEngine();
		chart.setEngine(engine);
		
		model = getData();
		chart.setModel(model);
		
		chart.setBgColor("#ffffff");
		chart.setBgAlpha(225);
		this.appendChild(chart);
		
		binder = new AnnotateDataBinder(this);
		
		binder.loadAll();
	}

    public PieChartEngine getEngine() {
        return engine;
    }
 
    public PieModel getModel() {
        return model;
    }
}
