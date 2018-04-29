/*
 * generated by Xtext 2.12.0
 */
package co.edu.uniandes.angularJsDsl.parser.antlr;

import co.edu.uniandes.angularJsDsl.parser.antlr.internal.InternalAngularJSDSLParser;
import co.edu.uniandes.angularJsDsl.services.AngularJSDSLGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class AngularJSDSLParser extends AbstractAntlrParser {

	@Inject
	private AngularJSDSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAngularJSDSLParser createParser(XtextTokenStream stream) {
		return new InternalAngularJSDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "AngularJSApp";
	}

	public AngularJSDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AngularJSDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
