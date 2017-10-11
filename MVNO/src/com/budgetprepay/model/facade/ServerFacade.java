package com.budgetprepay.model.facade;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

import com.budgetprepay.ServerVersion;
import com.budgetprepay.model.upgrade.InitializeDatabase;
import com.sun.management.OperatingSystemMXBean;

public class ServerFacade {
	protected static final mazz.i18n.Logger logger = mazz.i18n.LoggerFactory.getLogger(ServerFacade.class);
	protected static final org.apache.log4j.Logger debug = org.apache.log4j.Logger.getLogger(ServerFacade.class);

	public static ServerInfoSpec getServerInfoSpec() { 
		
		ServerInfoSpec spec = new ServerInfoSpec();
		
		spec.setServerVersion(ServerVersion.SERVER_LONG_VERSION_STR);
		
		spec.setDbVersion(InitializeDatabase.CURRENT_OM_VERSION);
		
		spec.setOsName(System.getProperty("os.name"));
		spec.setOsArchitecture(System.getProperty("os.arch"));
		spec.setOsVersion(System.getProperty("os.version"));
		
		Runtime runtime = Runtime.getRuntime();
		
		spec.setMaxConfiguredHeap(runtime.maxMemory());
		spec.setAvailableProcessors(runtime.availableProcessors());
		
		MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
		MemoryUsage heapUsage = memoryMXBean.getHeapMemoryUsage();
		MemoryUsage nonHeapUsage = memoryMXBean.getNonHeapMemoryUsage();
		
		MemorySpec heap = new MemorySpec();
		heap.setInit(heapUsage.getInit());
		heap.setMax(heapUsage.getMax());
		heap.setCommitted(heapUsage.getCommitted());
		heap.setUsed(heapUsage.getUsed());
		spec.setHeap(heap);

		MemorySpec nonHeap = new MemorySpec();
		nonHeap.setInit(nonHeapUsage.getInit());
		nonHeap.setMax(nonHeapUsage.getMax());
		nonHeap.setCommitted(nonHeapUsage.getCommitted());
		nonHeap.setUsed(nonHeapUsage.getUsed());
		spec.setNonHeap(nonHeap);
		
		OperatingSystemMXBean osMXBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
		spec.setFreePhysicalMemorySize(osMXBean.getFreePhysicalMemorySize());
		spec.setTotalPhysicalMemorySize(osMXBean.getTotalPhysicalMemorySize());
		
		return spec;
	}

	
	
	
}
