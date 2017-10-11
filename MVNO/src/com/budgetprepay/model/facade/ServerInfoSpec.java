package com.budgetprepay.model.facade;

import java.io.Serializable;
import java.util.Date;

public class ServerInfoSpec implements Serializable {

	static final long serialVersionUID = 1L;
	
	protected String serverVersion;
	protected Integer dbVersion;
	protected Date serverBuildDate;
	
	protected String osName;
	protected String osArchitecture;
	protected String osVersion;
	
	protected Long maxConfiguredHeap;
	protected Integer availableProcessors;
	
	protected MemorySpec heap;
	protected MemorySpec nonHeap;
	
	protected Long freePhysicalMemorySize;
	protected Long totalPhysicalMemorySize;		
	
	public ServerInfoSpec() { 
		
	}
	
	public String getServerVersion() {
		return serverVersion;
	}
	
	public void setServerVersion(String serverVersion) {
		this.serverVersion = serverVersion;
	}

	public Integer getDbVersion() {
		return dbVersion;
	}
	
	public void setDbVersion(Integer dbVersion) {
		this.dbVersion = dbVersion;
	}
	
	public Date getServerBuildDate() {
		return serverBuildDate;
	}
	
	public void setServerBuildDate(Date serverBuildDate) {
		this.serverBuildDate = serverBuildDate;
	}
	
	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getOsArchitecture() {
		return osArchitecture;
	}

	public void setOsArchitecture(String osArchitecture) {
		this.osArchitecture = osArchitecture;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public Integer getAvailableProcessors() {
		return availableProcessors;
	}
	
	public void setAvailableProcessors(Integer availableProcessors) {
		this.availableProcessors = availableProcessors;
	}
	
	public Long getMaxConfiguredHeap() {
		return maxConfiguredHeap;
	}

	public void setMaxConfiguredHeap(Long maxConfiguredHeap) {
		this.maxConfiguredHeap = maxConfiguredHeap;
	}

	public MemorySpec getHeap() {
		return heap;
	}

	public void setHeap(MemorySpec heap) {
		this.heap = heap;
	}

	public MemorySpec getNonHeap() {
		return nonHeap;
	}

	public void setNonHeap(MemorySpec nonHeap) {
		this.nonHeap = nonHeap;
	}

	public Long getFreePhysicalMemorySize() {
		return freePhysicalMemorySize;
	}

	public void setFreePhysicalMemorySize(Long freePhysicalMemorySize) {
		this.freePhysicalMemorySize = freePhysicalMemorySize;
	}

	public Long getTotalPhysicalMemorySize() {
		return totalPhysicalMemorySize;
	}

	public void setTotalPhysicalMemorySize(Long totalPhysicalMemorySize) {
		this.totalPhysicalMemorySize = totalPhysicalMemorySize;
	}	
	
}
