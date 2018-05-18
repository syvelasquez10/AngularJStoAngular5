/**
 *
 * $Id$
 */
package Angularjs.html.validation;

import Angularjs.html.Expresion;
import Angularjs.html.Filtro;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Angularjs.html.CurlyBraces}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CurlyBracesValidator {
	boolean validate();

	boolean validateExpresion(Expresion value);
	boolean validateFiltro(EList<Filtro> value);
}
