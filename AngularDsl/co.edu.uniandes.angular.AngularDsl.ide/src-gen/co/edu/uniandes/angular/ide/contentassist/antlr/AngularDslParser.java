/*
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.angular.ide.contentassist.antlr;

import co.edu.uniandes.angular.ide.contentassist.antlr.internal.InternalAngularDslParser;
import co.edu.uniandes.angular.services.AngularDslGrammarAccess;
import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class AngularDslParser extends AbstractContentAssistParser {

	@Inject
	private AngularDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalAngularDslParser createParser() {
		InternalAngularDslParser result = new InternalAngularDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAppAngularAccess().getAlternatives(), "rule__AppAngular__Alternatives");
					put(grammarAccess.getObjetoAngularAccess().getAlternatives(), "rule__ObjetoAngular__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getModuloAccess().getGroup(), "rule__Modulo__Group__0");
					put(grammarAccess.getModuloAccess().getGroup_1(), "rule__Modulo__Group_1__0");
					put(grammarAccess.getModuloAccess().getGroup_9(), "rule__Modulo__Group_9__0");
					put(grammarAccess.getModuloAccess().getGroup_9_1(), "rule__Modulo__Group_9_1__0");
					put(grammarAccess.getServiceAccess().getGroup(), "rule__Service__Group__0");
					put(grammarAccess.getServiceAccess().getGroup_1(), "rule__Service__Group_1__0");
					put(grammarAccess.getServiceAccess().getGroup_14(), "rule__Service__Group_14__0");
					put(grammarAccess.getServiceAccess().getGroup_14_1(), "rule__Service__Group_14_1__0");
					put(grammarAccess.getComponenteAccess().getGroup(), "rule__Componente__Group__0");
					put(grammarAccess.getComponenteAccess().getGroup_1(), "rule__Componente__Group_1__0");
					put(grammarAccess.getComponenteAccess().getGroup_21(), "rule__Componente__Group_21__0");
					put(grammarAccess.getComponenteAccess().getGroup_21_1(), "rule__Componente__Group_21_1__0");
					put(grammarAccess.getFuncionAccess().getGroup(), "rule__Funcion__Group__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getAnotacionAccess().getGroup(), "rule__Anotacion__Group__0");
					put(grammarAccess.getTemplateAccess().getGroup(), "rule__Template__Group__0");
					put(grammarAccess.getSentenciaHTMLAccess().getGroup(), "rule__SentenciaHTML__Group__0");
					put(grammarAccess.getSentenciaHTMLAccess().getGroup_9(), "rule__SentenciaHTML__Group_9__0");
					put(grammarAccess.getDirectivaAccess().getGroup(), "rule__Directiva__Group__0");
					put(grammarAccess.getPropiedadAccess().getGroup(), "rule__Propiedad__Group__0");
					put(grammarAccess.getCurlyBracesAccess().getGroup(), "rule__CurlyBraces__Group__0");
					put(grammarAccess.getExpresionAccess().getGroup(), "rule__Expresion__Group__0");
					put(grammarAccess.getFiltroAccess().getGroup(), "rule__Filtro__Group__0");
					put(grammarAccess.getAppAngularAccess().getModulosAssignment_0(), "rule__AppAngular__ModulosAssignment_0");
					put(grammarAccess.getAppAngularAccess().getComponentesAssignment_1(), "rule__AppAngular__ComponentesAssignment_1");
					put(grammarAccess.getAppAngularAccess().getServicesAssignment_2(), "rule__AppAngular__ServicesAssignment_2");
					put(grammarAccess.getAppAngularAccess().getTemplatesAssignment_3(), "rule__AppAngular__TemplatesAssignment_3");
					put(grammarAccess.getModuloAccess().getNameAssignment_6(), "rule__Modulo__NameAssignment_6");
					put(grammarAccess.getModuloAccess().getParametrosAssignment_9_0(), "rule__Modulo__ParametrosAssignment_9_0");
					put(grammarAccess.getModuloAccess().getParametrosAssignment_9_1_1(), "rule__Modulo__ParametrosAssignment_9_1_1");
					put(grammarAccess.getServiceAccess().getModuloAssignment_6(), "rule__Service__ModuloAssignment_6");
					put(grammarAccess.getServiceAccess().getNameAssignment_11(), "rule__Service__NameAssignment_11");
					put(grammarAccess.getServiceAccess().getParametrosAssignment_14_0(), "rule__Service__ParametrosAssignment_14_0");
					put(grammarAccess.getServiceAccess().getParametrosAssignment_14_1_1(), "rule__Service__ParametrosAssignment_14_1_1");
					put(grammarAccess.getServiceAccess().getFuncionAssignment_16(), "rule__Service__FuncionAssignment_16");
					put(grammarAccess.getComponenteAccess().getModuloAssignment_6(), "rule__Componente__ModuloAssignment_6");
					put(grammarAccess.getComponenteAccess().getNameAssignment_11(), "rule__Componente__NameAssignment_11");
					put(grammarAccess.getComponenteAccess().getTemplateAssignment_16(), "rule__Componente__TemplateAssignment_16");
					put(grammarAccess.getComponenteAccess().getParametrosAssignment_21_0(), "rule__Componente__ParametrosAssignment_21_0");
					put(grammarAccess.getComponenteAccess().getParametrosAssignment_21_1_1(), "rule__Componente__ParametrosAssignment_21_1_1");
					put(grammarAccess.getComponenteAccess().getFuncionAssignment_23(), "rule__Componente__FuncionAssignment_23");
					put(grammarAccess.getFuncionAccess().getNameAssignment_2(), "rule__Funcion__NameAssignment_2");
					put(grammarAccess.getFuncionAccess().getParametrosAssignment_4(), "rule__Funcion__ParametrosAssignment_4");
					put(grammarAccess.getFuncionAccess().getVariablesAssignment_7(), "rule__Funcion__VariablesAssignment_7");
					put(grammarAccess.getFuncionAccess().getBodyAssignment_8(), "rule__Funcion__BodyAssignment_8");
					put(grammarAccess.getVariableAccess().getAnotacionAssignment_1(), "rule__Variable__AnotacionAssignment_1");
					put(grammarAccess.getVariableAccess().getNameAssignment_3(), "rule__Variable__NameAssignment_3");
					put(grammarAccess.getVariableAccess().getValorAssignment_5(), "rule__Variable__ValorAssignment_5");
					put(grammarAccess.getAnotacionAccess().getNameAssignment_2(), "rule__Anotacion__NameAssignment_2");
					put(grammarAccess.getAnotacionAccess().getPrimitivoAssignment_4(), "rule__Anotacion__PrimitivoAssignment_4");
					put(grammarAccess.getAnotacionAccess().getValueAssignment_6(), "rule__Anotacion__ValueAssignment_6");
					put(grammarAccess.getTemplateAccess().getNameAssignment_1(), "rule__Template__NameAssignment_1");
					put(grammarAccess.getTemplateAccess().getSentenciashtmlAssignment_3(), "rule__Template__SentenciashtmlAssignment_3");
					put(grammarAccess.getSentenciaHTMLAccess().getNameAssignment_2(), "rule__SentenciaHTML__NameAssignment_2");
					put(grammarAccess.getSentenciaHTMLAccess().getPropiedadesAssignment_3(), "rule__SentenciaHTML__PropiedadesAssignment_3");
					put(grammarAccess.getSentenciaHTMLAccess().getDirectivasAssignment_4(), "rule__SentenciaHTML__DirectivasAssignment_4");
					put(grammarAccess.getSentenciaHTMLAccess().getCurlybracesAssignment_7(), "rule__SentenciaHTML__CurlybracesAssignment_7");
					put(grammarAccess.getSentenciaHTMLAccess().getSentenciashtmlAssignment_8(), "rule__SentenciaHTML__SentenciashtmlAssignment_8");
					put(grammarAccess.getDirectivaAccess().getNameAssignment_2(), "rule__Directiva__NameAssignment_2");
					put(grammarAccess.getDirectivaAccess().getCurlybracesAssignment_4(), "rule__Directiva__CurlybracesAssignment_4");
					put(grammarAccess.getDirectivaAccess().getReferenciaAssignment_5(), "rule__Directiva__ReferenciaAssignment_5");
					put(grammarAccess.getPropiedadAccess().getNameAssignment_1(), "rule__Propiedad__NameAssignment_1");
					put(grammarAccess.getCurlyBracesAccess().getExpresionAssignment_3(), "rule__CurlyBraces__ExpresionAssignment_3");
					put(grammarAccess.getCurlyBracesAccess().getFiltroAssignment_4(), "rule__CurlyBraces__FiltroAssignment_4");
					put(grammarAccess.getExpresionAccess().getValorAssignment_1(), "rule__Expresion__ValorAssignment_1");
					put(grammarAccess.getExpresionAccess().getReferenciaAssignment_2(), "rule__Expresion__ReferenciaAssignment_2");
					put(grammarAccess.getFiltroAccess().getParametrosAssignment_2(), "rule__Filtro__ParametrosAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AngularDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AngularDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
