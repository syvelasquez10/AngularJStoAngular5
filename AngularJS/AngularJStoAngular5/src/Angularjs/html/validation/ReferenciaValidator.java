/**
 *
 * $Id$
 */
package Angularjs.html.validation;

import Angularjs.mvc.ObjetoJavaScript;

/**
 * A sample validator interface for {@link Angularjs.html.Referencia}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ReferenciaValidator {
	boolean validate();

	boolean validateObjeto(ObjetoJavaScript value);
	boolean validateName(String value);
}