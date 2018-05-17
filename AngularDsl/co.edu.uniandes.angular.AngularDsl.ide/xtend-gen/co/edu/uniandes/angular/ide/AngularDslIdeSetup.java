/**
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.angular.ide;

import co.edu.uniandes.angular.AngularDslRuntimeModule;
import co.edu.uniandes.angular.AngularDslStandaloneSetup;
import co.edu.uniandes.angular.ide.AngularDslIdeModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class AngularDslIdeSetup extends AngularDslStandaloneSetup {
  @Override
  public Injector createInjector() {
    AngularDslRuntimeModule _angularDslRuntimeModule = new AngularDslRuntimeModule();
    AngularDslIdeModule _angularDslIdeModule = new AngularDslIdeModule();
    return Guice.createInjector(Modules2.mixin(_angularDslRuntimeModule, _angularDslIdeModule));
  }
}