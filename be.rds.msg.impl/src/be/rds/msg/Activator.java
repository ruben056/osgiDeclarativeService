package be.rds.msg;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import be.rds.msg.IMessageProvider;

public class Activator implements BundleActivator {

	public void start(BundleContext context) throws Exception {
		System.out.println("MsgImpl activator started");
		context.registerService(IMessageProvider.class.getName(), new MessageProvider(), null);
	}
	
	public void stop(BundleContext context) throws Exception {
	}

}