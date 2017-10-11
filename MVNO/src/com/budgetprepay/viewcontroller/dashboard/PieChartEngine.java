package com.budgetprepay.viewcontroller.dashboard;

import java.awt.Color;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.zkoss.zkex.zul.impl.JFreeChartEngine;
import org.zkoss.zul.Chart;
 
public class PieChartEngine extends JFreeChartEngine {
    
	private static final long serialVersionUID = 1L;
    
	@SuppressWarnings("unused")
	private boolean explode = false;
    
    public boolean prepareJFreeChart(JFreeChart jfchart, Chart chart) {
        jfchart.setBorderPaint(Color.WHITE);
        jfchart.removeLegend();
        jfchart.setBackgroundPaint(Color.WHITE);
        PiePlot piePlot = (PiePlot) jfchart.getPlot();
        piePlot.setBackgroundPaint(Color.WHITE);
        piePlot.setLabelBackgroundPaint(Color.WHITE);
        return false;
    }

    public void setExplode(boolean explode) {
        this.explode = explode;
    }
}