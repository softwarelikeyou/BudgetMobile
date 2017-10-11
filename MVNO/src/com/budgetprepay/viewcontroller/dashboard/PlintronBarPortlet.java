package com.budgetprepay.viewcontroller.dashboard;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.jfree.data.time.Quarter;
import org.zkoss.zk.ui.Components;
import org.zkoss.zkplus.databind.AnnotateDataBinder;
import org.zkoss.zul.CategoryModel;
import org.zkoss.zul.Chart;
import org.zkoss.zul.SimpleCategoryModel;

import com.budgetprepay.model.entity.Request.RequestType;
import com.budgetprepay.model.facade.RequestFacade;
import com.budgetprepay.model.facade.UserFacade;
import com.budgetprepay.viewcontroller.Labels;
import com.budgetprepay.viewcontroller.SessionUtil;

public class PlintronBarPortlet extends DashboardPortlet {

	private static final long serialVersionUID = 1L;

	private Chart plintronBarChart;
	private BarChartEngine engine;
	private CategoryModel model;
	
    public CategoryModel getData() throws Exception {
        CategoryModel model = new SimpleCategoryModel();
        model.setValue(RequestType.PLINTRON_SERVICE_ACTIVATE.asString(), "Q1", RequestFacade.retrievePlintronServiceActivateByUserBetweenDates(UserFacade.retrieveByGroup(SessionUtil.getCurrentUser().getGroup()), getQuarterStart(1), getQuarterEnd(1)));
        model.setValue(RequestType.PLINTRON_SERVICE_ACTIVATE.asString(), "Q2", RequestFacade.retrievePlintronServiceActivateByUserBetweenDates(UserFacade.retrieveByGroup(SessionUtil.getCurrentUser().getGroup()), getQuarterStart(2), getQuarterEnd(2)));
        model.setValue(RequestType.PLINTRON_SERVICE_ACTIVATE.asString(), "Q3", RequestFacade.retrievePlintronServiceActivateByUserBetweenDates(UserFacade.retrieveByGroup(SessionUtil.getCurrentUser().getGroup()), getQuarterStart(3), getQuarterEnd(3)));
        model.setValue(RequestType.PLINTRON_SERVICE_ACTIVATE.asString(), "Q4", RequestFacade.retrievePlintronServiceActivateByUserBetweenDates(UserFacade.retrieveByGroup(SessionUtil.getCurrentUser().getGroup()), getQuarterStart(4), getQuarterEnd(4)));
        
        model.setValue(RequestType.PLINTRON_SERVICE_DEACTIVATE.asString(), "Q1", RequestFacade.retrievePlintronServiceDeactivateByUserBetweenDates(UserFacade.retrieveByGroup(SessionUtil.getCurrentUser().getGroup()), getQuarterStart(1), getQuarterEnd(1)));
        model.setValue(RequestType.PLINTRON_SERVICE_DEACTIVATE.asString(), "Q2", RequestFacade.retrievePlintronServiceDeactivateByUserBetweenDates(UserFacade.retrieveByGroup(SessionUtil.getCurrentUser().getGroup()), getQuarterStart(2), getQuarterEnd(2)));
        model.setValue(RequestType.PLINTRON_SERVICE_DEACTIVATE.asString(), "Q3", RequestFacade.retrievePlintronServiceDeactivateByUserBetweenDates(UserFacade.retrieveByGroup(SessionUtil.getCurrentUser().getGroup()), getQuarterStart(3), getQuarterEnd(3)));
        model.setValue(RequestType.PLINTRON_SERVICE_DEACTIVATE.asString(), "Q4", RequestFacade.retrievePlintronServiceDeactivateByUserBetweenDates(UserFacade.retrieveByGroup(SessionUtil.getCurrentUser().getGroup()), getQuarterStart(4), getQuarterEnd(4)));
  
        return model;
    }
    	
    private Date getQuarterStart(final Integer quarter)throws Exception  {
    	DateFormat yearFormat = new SimpleDateFormat("YYYY");
    	String year = yearFormat.format(new Date());
    	Quarter q = new Quarter(quarter, Integer.valueOf(year));
    	return q.getStart();
    }
    
    private Date getQuarterEnd(final Integer quarter)throws Exception  {
    	DateFormat yearFormat = new SimpleDateFormat("YYYY");
    	String year = yearFormat.format(new Date());
    	Quarter q = new Quarter(quarter, Integer.valueOf(year));
    	return q.getEnd();
    }
    
	protected AnnotateDataBinder binder;
	
	@Override
	protected String getPanelTitleI18NKey() {
		return Labels.PLINTRON_ACTIVATE_DISCONNECT;
	}

	@Override
	public void onCreate() {
	    super.onCreate();
		
		Components.wireVariables(this, this);
		Components.addForwards(this, this);
		
		engine = new BarChartEngine();
		plintronBarChart.setEngine(engine);
		
		try {
		    model = getData();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		plintronBarChart.setModel(model);
		
		plintronBarChart.setBgColor("#ffffff");
		plintronBarChart.setBgAlpha(225);
		this.appendChild(plintronBarChart);
		
		binder = new AnnotateDataBinder(this);
		
		binder.loadAll();
	}

    public BarChartEngine getEngine() {
        return engine;
    }
 
    public CategoryModel getModel() {
        return model;
    }
}
