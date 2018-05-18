/**
 *
 * $Id$
 */
package angularjs2angular5.angular.validation;

import angularjs2angular5.angular.Anotacion;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link angularjs2angular5.angular.Variable}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface VariableValidator {
	boolean validate();

	boolean validateValor(String value);

	boolean validateAnotacion(EList<Anotacion> value);

	boolean validateName(String value);
}