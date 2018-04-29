/**
 *
 * $Id$
 */
package Angularjs.validation;

import Angularjs.Funcion;
import Angularjs.Parametro;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Angularjs.Service}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ServiceValidator {
	boolean validate();

	boolean validateFuncion(EList<Funcion> value);
	boolean validateParametro(Parametro value);
}
