package actiivator;

import org.eclipse.e4.core.di.InjectorFactory;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.packtpub.e4.application.service.IStringService;
import com.packtpub.e4.application.service.StringService;

public class Activator implements BundleActivator {

	private static BundleContext context;
	static BundleContext getContext() {
		return context;
		
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		
		
		Activator.context = bundleContext;
		 InjectorFactory.getDefault().
		 addBinding(IStringService.class).
		 implementedBy(StringService.class);
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
