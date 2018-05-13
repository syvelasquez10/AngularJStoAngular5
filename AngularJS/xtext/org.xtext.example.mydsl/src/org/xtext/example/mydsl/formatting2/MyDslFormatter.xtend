/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.formatting2

import angularjs.AppAngularJS
import angularjs.Componente
import angularjs.Modelo
import angularjs.Modulo
import angularjs.SentenciaHTML
import angularjs.Service
import angularjs.Template
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.example.mydsl.services.MyDslGrammarAccess

class MyDslFormatter extends AbstractFormatter2 {
	
	@Inject extension MyDslGrammarAccess

	def dispatch void format(AppAngularJS appAngularJS, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Modulo modulo : appAngularJS.getModulos()) {
			modulo.format;
		}
		for (Template template : appAngularJS.getTemplates()) {
			template.format;
		}
		for (Service service : appAngularJS.getServices()) {
			service.format;
		}
		for (Modelo modelo : appAngularJS.getModelos()) {
			modelo.format;
		}
		for (Componente componente : appAngularJS.getComponentes()) {
			componente.format;
		}
	}

	def dispatch void format(Template template, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (SentenciaHTML sentenciaHTML : template.getSentenciashtml()) {
			sentenciaHTML.format;
		}
	}
	
	// TODO: implement for Service, Componente, Funcion, SentenciaHTML, CurlyBraces
}
