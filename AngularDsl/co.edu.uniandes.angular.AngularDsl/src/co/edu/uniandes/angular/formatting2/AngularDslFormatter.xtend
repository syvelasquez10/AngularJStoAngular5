/*
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.angular.formatting2

import angularjs2angular5.angular.AppAngular
import angularjs2angular5.angular.Componente
import angularjs2angular5.angular.Modelo
import angularjs2angular5.angular.Modulo
import angularjs2angular5.angular.SentenciaHTML
import angularjs2angular5.angular.Service
import angularjs2angular5.angular.Template
import co.edu.uniandes.angular.services.AngularDslGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class AngularDslFormatter extends AbstractFormatter2 {
	
	@Inject extension AngularDslGrammarAccess

	def dispatch void format(AppAngular appAngular, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Modulo modulo : appAngular.getModulos()) {
			modulo.format;
		}
		for (Template template : appAngular.getTemplates()) {
			template.format;
		}
		for (Service service : appAngular.getServices()) {
			service.format;
		}
		for (Modelo modelo : appAngular.getModelos()) {
			modelo.format;
		}
		for (Componente componente : appAngular.getComponentes()) {
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
