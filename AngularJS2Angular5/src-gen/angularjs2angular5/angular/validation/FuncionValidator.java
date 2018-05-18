/**
 *
 * $Id$
 */
package angularjs2angular5.angular.validation;

import angularjs2angular5.angular.Variable;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link angularjs2angular5.angular.Funcion}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FuncionValidator {
	boolean validate();

	boolean validateName(String value);

	boolean validateBody(String value);

	boolean validateParametros(String value);

	boolean validateVariables(EList<Variable> value);
}