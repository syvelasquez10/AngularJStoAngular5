/**
 *
 * $Id$
 */
package angularjs2angular5.angular.validation;

import angularjs2angular5.angular.Expresion;
import angularjs2angular5.angular.Filtro;

/**
 * A sample validator interface for {@link angularjs2angular5.angular.CurlyBraces}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CurlyBracesValidator {
	boolean validate();

	boolean validateExpresion(Expresion value);

	boolean validateFiltro(Filtro value);
}
