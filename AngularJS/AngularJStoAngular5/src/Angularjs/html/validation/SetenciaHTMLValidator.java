/**
 *
 * $Id$
 */
package Angularjs.html.validation;

import Angularjs.html.CurlyBraces;
import Angularjs.html.Directiva;
import Angularjs.html.Propiedad;
import Angularjs.html.SetenciaHTML;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Angularjs.html.SetenciaHTML}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SetenciaHTMLValidator {
	boolean validate();

	boolean validateSetenciahtml(EList<SetenciaHTML> value);
	boolean validateName(String value);
	boolean validatePropiedades(EList<Propiedad> value);
	boolean validateSelfClosing(boolean value);
	boolean validateDirectivas(EList<Directiva> value);
	boolean validateCurlybraces(EList<CurlyBraces> value);
}