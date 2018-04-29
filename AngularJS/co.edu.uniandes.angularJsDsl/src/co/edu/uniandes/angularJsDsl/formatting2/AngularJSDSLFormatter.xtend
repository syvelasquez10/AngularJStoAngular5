/*
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.angularJsDsl.formatting2

import .Angularjs
import .Angularjs.AngularJSApp
import .Angularjs.Directiva
import .Angularjs.Parametro
import .Angularjs.SetenciaHTML
import co.edu.uniandes.angularJsDsl.services.AngularJSDSLGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class AngularJSDSLFormatter extends AbstractFormatter2 {
	
	@Inject extension AngularJSDSLGrammarAccess

	def dispatch void format(AngularJSApp angularJSApp, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Angularjs.Template template : angularJSApp.getTemplates()) {
			template.format;
		}
		for (Angularjs.Module module : angularJSApp.getModules()) {
			module.format;
		}
		for (Parametro parametro : angularJSApp.getParametros()) {
			parametro.format;
		}
	}

	def dispatch void format(Angularjs.Template template, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (SetenciaHTML setenciaHTML : template.getSetenciahtml()) {
			setenciaHTML.format;
		}
		for (Directiva directiva : template.getDirectiva()) {
			directiva.format;
		}
	}
	
	// TODO: implement for Module, SetenciaHTML, Directiva, CurlyBraces, Expresion, Funcion, Controller, Service
}
