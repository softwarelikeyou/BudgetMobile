package com.budgetprepay.viewcontroller.converter;

import java.util.HashMap;
import java.util.Map;

import com.budgetprepay.viewcontroller.ELFunctions;
import com.budgetprepay.viewcontroller.Labels;

public enum ByteUnit {

	BYTES(0, Labels.BYTES, Labels.BPS),
	KB(10, Labels.KB, Labels.KBPS),
	MB(20, Labels.MB, Labels.MBPS),
	GB(30, Labels.GB, Labels.GBPS),
	TB(40, Labels.TB, Labels.TBPS),
	PB(50, Labels.PB, Labels.PBPS),
	EB(60, Labels.EB, Labels.EBPS),
	ZB(70, Labels.ZB, Labels.ZBPS),
	YB(80, Labels.YB, Labels.YBPS);
	
	private static Map<String, ByteUnit> labelMap = new HashMap<String, ByteUnit>();
	
	static { 
		for( ByteUnit unit : ByteUnit.values() ) {
			labelMap.put(unit.getLabel(), unit);
			labelMap.put(unit.getPerSecondLabel(), unit);
		}
	}
	
	private String label;
	private String perSecondLabel;
	private double numberOfBytes; 
	
	private ByteUnit(int exp, String label, String perSecondLabel) {
		this.label          = label;
		this.numberOfBytes  = Math.pow(2, exp);
		this.perSecondLabel = perSecondLabel;
	}
	
	public String getLabel() {
		return label;
	}
	
	public String getPerSecondLabel() {
		return perSecondLabel;
	}
	
	public Double getNumberOfBytes() {
		return numberOfBytes;
	}
	
	public static ByteUnit fromLabel(String label) {
		
		ByteUnit selectedUnit = null;
		
		for( ByteUnit unit : ByteUnit.values() ) { 
			
			String formattedLabel = ELFunctions.getLabel(unit.getLabel());
			String formattedPSLabel = ELFunctions.getLabel(unit.getPerSecondLabel());
			
			if( formattedLabel.equals(label) || formattedPSLabel.equals(label) ) {
				selectedUnit = unit;
				break;
			}			
		}
		
		return selectedUnit;
	}
	
}
