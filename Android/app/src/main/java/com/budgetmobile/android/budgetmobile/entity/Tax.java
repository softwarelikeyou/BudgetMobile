package com.budgetmobile.android.budgetmobile.entity;

import java.io.Serializable;

public class Tax implements Serializable {
    private String description;

    private Double amount;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
