/*
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.angular.ui;

import co.edu.uniandes.angular.AngularDsl.ui.internal.AngularDslActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AngularDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return AngularDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return AngularDslActivator.getInstance().getInjector(AngularDslActivator.CO_EDU_UNIANDES_ANGULAR_ANGULARDSL);
	}
	
}
