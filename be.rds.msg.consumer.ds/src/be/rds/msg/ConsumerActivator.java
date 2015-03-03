package be.rds.msg;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import be.rds.msg.IMessageProvider;

public class ConsumerActivator implements BundleActivator {

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		System.out.println("Starting bundle consumer");
		ServiceReference ref = context.getServiceReference(IMessageProvider.class.getName());
		IMessageProvider provider = (IMessageProvider)context.getService(ref);
		System.out.println(provider.getMsg());
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println("Stopping bundle consumer");
	}

}
