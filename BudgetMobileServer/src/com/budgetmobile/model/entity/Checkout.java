package com.budgetmobile.model.entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Checkout {

	@JsonProperty("BMID")
	private Integer bmid;
	
	@JsonProperty("TOPUPS")
	private Set<Integer> topups = new HashSet<Integer>();

	public Integer getBmid() {
		return bmid;
	}

	public void setBmid(Integer bmid) {
		this.bmid = bmid;
	}

	public Set<Integer> getTopups() {
		return topups;
	}

	public void setTopups(Set<Integer> topups) {
		this.topups = topups;
	}
	
	public void addToptup(final Integer topup) {
		this.topups.add(topup);
	}
}
