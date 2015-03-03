package be.rds.msg.consumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import be.rds.msg.IMessageProvider;

public class Activator implements BundleActivator {

	public void start(BundleContext context) throws Exception {
		
		System.out.println("MsgConsumer activator started");
		ServiceReference serviceRef = context.getServiceReference(IMessageProvider.class.getName());
		final IMessageProvider msgProvider = (IMessageProvider)context.getService(serviceRef);
	
		new Thread() {
					
					@Override
					public void run() {
						while(true){
							try {								
								System.out.println("RDM TEST Consumer: " +  msgProvider.getMsg());
								Thread.sleep(1000*10);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				}.run();	
	}

	public void stop(BundleContext context) throws Exception {
	}

}