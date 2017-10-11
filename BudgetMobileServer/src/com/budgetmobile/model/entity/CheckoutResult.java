package com.budgetmobile.model.entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CheckoutResult {

	@JsonProperty("ORDERID")
	private String orderID;
	
	@JsonProperty("REFERENCEID")
    private Integer referenceID;
	
	@JsonProperty("TOTAL")
    private Double orderTotal;
	
	@JsonProperty("DESCRIPTION")
    private String topUpDescription;
	
	@JsonProperty("COST")
    private Double topUpCost;
	
	@JsonProperty("TAXESAPPLY")
    private Boolean taxesApply;

	@JsonProperty("TAXES")
	private Set<Tax> taxes = new HashSet<Tax>();
	
	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public Integer getReferenceID() {
		return referenceID;
	}

	public void setReferenceID(Integer referenceID) {
		this.referenceID = referenceID;
	}

	public Double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(Double orderTotal) {
		this.orderTotal = orderTotal;
	}

	public String getTopUpDescription() {
		return topUpDescription;
	}

	public void setTopUpDescription(String topUpDescription) {
		this.topUpDescription = topUpDescription;
	}

	public Double getTopUpCost() {
		return topUpCost;
	}

	public void setTopUpCost(Double topUpCost) {
		this.topUpCost = topUpCost;
	}

	public Boolean getTaxesApply() {
		return taxesApply;
	}

	public void setTaxesApply(Boolean taxesApply) {
		this.taxesApply = taxesApply;
	}

	public Set<Tax> getTaxes() {
		return taxes;
	}

	public void setTaxes(Set<Tax> taxes) {
		this.taxes = taxes;
	}
	
	public void addTax(final Tax tax) {
		this.taxes.add(tax);
	}
}
