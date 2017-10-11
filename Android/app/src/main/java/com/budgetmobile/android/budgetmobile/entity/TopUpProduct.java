package com.budgetmobile.android.budgetmobile.entity;

import java.io.Serializable;
import java.util.Comparator;

public class TopUpProduct implements Serializable, Comparable<TopUpProduct> {
    private Integer topUpProductID;

    private Integer type;

    private String description;

    private Double faceValue;

    private Integer creditsRequired;

    public Integer getTopUpProductID() {
        return topUpProductID;
    }

    public void setTopUpProductID(Integer topUpProductID) {
        this.topUpProductID = topUpProductID;
    }

    public Double getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(Double faceValue) {
        this.faceValue = faceValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCreditsRequired() {
        return creditsRequired;
    }

    public void setCreditsRequired(Integer value) {
        this.creditsRequired = value;
    }

    @Override
    public int compareTo(TopUpProduct o) {
        return Comparators.FACEVALUE.compare(this, o);
    }

    public static class Comparators {

        public static Comparator<TopUpProduct> DESCRIPTION = new Comparator<TopUpProduct>() {
            @Override
            public int compare(TopUpProduct o1, TopUpProduct o2) {
                return o1.description.compareTo(o2.description);
            }
        };

        public static Comparator<TopUpProduct> FACEVALUE = new Comparator<TopUpProduct>() {
            @Override
            public int compare(TopUpProduct o1, TopUpProduct o2) {
                if (o1.faceValue < o2.faceValue) return -1;
                if (o1.faceValue > o2.faceValue) return 1;
                return 0;
            }
        };
    }

}
