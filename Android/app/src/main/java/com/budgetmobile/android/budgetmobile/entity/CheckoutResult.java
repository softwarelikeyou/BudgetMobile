package com.budgetmobile.android.budgetmobile.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class CheckoutResult implements Serializable {
    private String orderID;

    private Integer referenceID;

    private String orderTotal;

    private String topUpDescription;

    private String topUpCost;

    private Boolean taxesApply;

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

    public String getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(String orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getTopUpDescription() {
        return topUpDescription;
    }

    public void setTopUpDescription(String topUpDescription) {
        this.topUpDescription = topUpDescription;
    }

    public String getTopUpCost() {
        return topUpCost;
    }

    public void setTopUpCost(String topUpCost) {
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
