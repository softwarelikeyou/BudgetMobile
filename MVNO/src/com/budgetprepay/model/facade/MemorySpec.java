package com.budgetprepay.model.facade;

import java.io.Serializable;

public class MemorySpec implements Serializable {

	static final long serialVersionUID = 1L;
	
	protected Long init;
	protected Long max;
	protected Long committed;
	protected Long used;
	
	public Long getInit() {
		return init;
	}
	
	public void setInit(Long init) {
		this.init = init;
	}
	
	public Long getMax() {
		return max;
	}
	
	public void setMax(Long max) {
		this.max = max;
	}
	
	public Long getCommitted() {
		return committed;
	}
	
	public void setCommitted(Long committed) {
		this.committed = committed;
	}
	
	public Long getUsed() {
		return used;
	}
	
	public void setUsed(Long used) {
		this.used = used;
	}	
	
}
