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

public class BarPortlet extends DashboardPortlet {

	private static final long serialVersionUID = 1L;

	private Chart barChart;
	private BarChartEngine engine;
	private CategoryModel model;
	
    public CategoryModel getData() throws Exception {
        CategoryModel model = new SimpleCategoryModel();
        model.setValue(RequestType.DEVICE_ACTIVATION.asString(), "Q1", RequestFacade.retrieveActivationsByUserBetweenDates(UserFacade.retrieveByGroup(SessionUtil.getCurrentUser().getGroup()), getQuarterStart(1), getQuarterEnd(1)));
        model.setValue(RequestType.DEVICE_ACTIVATION.asString(), "Q2", RequestFacade.retrieveActivationsByUserBetweenDates(UserFacade.retrieveByGroup(SessionUtil.getCurrentUser().getGroup()), getQuarterStart(2), getQuarterEnd(2)));
        model.setValue(RequestType.DEVICE_ACTIVATION.asString(), "Q3", RequestFacade.retrieveActivationsByUserBetweenDates(UserFacade.retrieveByGroup(SessionUtil.getCurrentUser().getGroup()), getQuarterStart(3), getQuarterEnd(3)));
        model.setValue(RequestType.DEVICE_ACTIVATION.asString(), "Q4", RequestFacade.retrieveActivationsByUserBetweenDates(UserFacade.retrieveByGroup(SessionUtil.getCurrentUser().getGroup()), getQuarterStart(4), getQuarterEnd(4)));
        
        model.setValue(RequestType.DEVICE_ACTIVATION_PORTIN.asString(), "Q1", RequestFacade.retrieveActivationPortInsByUserBetweenDates(UserFacade.retrieveByGroup(SessionUtil.getCurrentUser().getGroup()), getQuarterStart(1), getQuarterEnd(1)));
        model.setValue(RequestType.DEVICE_ACTIVATION_PORTIN.asString(), "Q2", RequestFacade.retrieveActivationPortInsByUserBetweenDates(UserFacade.retrieveByGroup(SessionUtil.getCurrentUser().getGroup()), getQuarterStart(2), getQuarterEnd(2)));
        model.setValue(RequestType.DEVICE_ACTIVATION_PORTIN.asString(), "Q3", RequestFacade.retrieveActivationPortInsByUserBetweenDates(UserFacade.retrieveByGroup(SessionUtil.getCurrentUser().getGroup()), getQuarterStart(3), getQuarterEnd(3)));
        model.setValue(RequestType.DEVICE_ACTIVATION_PORTIN.asString(), "Q4", RequestFacade.retrieveActivationPortInsByUserBetweenDates(UserFacade.retrieveByGroup(SessionUtil.getCurrentUser().getGroup()), getQuarterStart(4), getQuarterEnd(4)));
  
        model.setValue(RequestType.DELETE_SUBSCRIBER.asString(), "Q1", RequestFacade.retrieveDeactivationsByUserBetweenDates(UserFacade.retrieveByGroup(SessionUtil.getCurrentUser().getGroup()), getQuarterStart(1), getQuarterEnd(1)));
        model.setValue(RequestType.DELETE_SUBSCRIBER.asString(), "Q2", RequestFacade.retrieveDeactivationsByUserBetweenDates(UserFacade.retrieveByGroup(SessionUtil.getCurrentUser().getGroup()), getQuarterStart(2), getQuarterEnd(2)));
        model.setValue(RequestType.DELETE_SUBSCRIBER.asString(), "Q3", RequestFacade.retrieveDeactivationsByUserBetweenDates(UserFacade.retrieveByGroup(SessionUtil.getCurrentUser().getGroup()), getQuarterStart(3), getQuarterEnd(3)));
        model.setValue(RequestType.DELETE_SUBSCRIBER.asString(), "Q4", RequestFacade.retrieveDeactivationsByUserBetweenDates(UserFacade.retrieveByGroup(SessionUtil.getCurrentUser().getGroup()), getQuarterStart(4), getQuarterEnd(4)));
        
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
		return Labels.ACTIVATIONS_DEACTIVATIONS;
	}

	@Override
	public void onCreate() {
	    super.onCreate();
		
		Components.wireVariables(this, this);
		Components.addForwards(this, this);
		
		engine = new BarChartEngine();
		barChart.setEngine(engine);
		
		try {
		    model = getData();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		barChart.setModel(model);
		
		barChart.setBgColor("#ffffff");
		barChart.setBgAlpha(225);
		this.appendChild(barChart);
		
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
