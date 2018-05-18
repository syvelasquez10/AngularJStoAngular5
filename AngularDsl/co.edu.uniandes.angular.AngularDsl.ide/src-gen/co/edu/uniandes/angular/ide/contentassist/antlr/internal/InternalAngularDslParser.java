package co.edu.uniandes.angular.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import co.edu.uniandes.angular.services.AngularDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAngularDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_ANGULAR", "RULE_PUNTO", "RULE_MODULE", "RULE_PARENTESIS_IZQUIERDO", "RULE_COMA", "RULE_PARENTESIS_CUADRADO_IZQUIERDO", "RULE_PARENTESIS_CUADRADO_DERECHO", "RULE_PARENTESIS_DERECHO", "RULE_PUNTO_Y_COMA", "RULE_COMILLAS", "RULE_USE", "RULE_STRICT", "RULE_COMPONENT", "RULE_LLAVE_IZQUIERDA", "RULE_TEMPLATE_URL", "RULE_DOS_PUNTOS", "RULE_CONTROLLER", "RULE_LLAVE_DERECHA", "RULE_FUNCTION", "RULE_VAR", "RULE_IGUAL", "RULE_MENOR_QUE", "RULE_SLASH", "RULE_MAYOR_QUE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'factory'", "'@anotacion_'", "'*'", "'ng-'", "'$'", "'|'"
    };
    public static final int RULE_LLAVE_IZQUIERDA=19;
    public static final int RULE_COMA=10;
    public static final int RULE_FUNCTION=24;
    public static final int RULE_TEMPLATE_URL=20;
    public static final int RULE_CONTROLLER=22;
    public static final int RULE_PARENTESIS_CUADRADO_IZQUIERDO=11;
    public static final int RULE_PARENTESIS_DERECHO=13;
    public static final int RULE_STRING=4;
    public static final int RULE_COMILLAS=15;
    public static final int RULE_COMPONENT=18;
    public static final int RULE_SL_COMMENT=32;
    public static final int RULE_STRICT=17;
    public static final int T__37=37;
    public static final int RULE_PUNTO_Y_COMA=14;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int RULE_USE=16;
    public static final int RULE_MENOR_QUE=27;
    public static final int RULE_ID=5;
    public static final int RULE_PARENTESIS_IZQUIERDO=9;
    public static final int RULE_WS=33;
    public static final int RULE_ANY_OTHER=34;
    public static final int RULE_SLASH=28;
    public static final int RULE_PUNTO=7;
    public static final int RULE_DOS_PUNTOS=21;
    public static final int RULE_IGUAL=26;
    public static final int RULE_INT=30;
    public static final int RULE_PARENTESIS_CUADRADO_DERECHO=12;
    public static final int RULE_ML_COMMENT=31;
    public static final int RULE_LLAVE_DERECHA=23;
    public static final int RULE_ANGULAR=6;
    public static final int RULE_MODULE=8;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int RULE_MAYOR_QUE=29;
    public static final int RULE_VAR=25;

    // delegates
    // delegators


        public InternalAngularDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAngularDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAngularDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAngularDsl.g"; }


    	private AngularDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(AngularDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleAppAngular"
    // InternalAngularDsl.g:53:1: entryRuleAppAngular : ruleAppAngular EOF ;
    public final void entryRuleAppAngular() throws RecognitionException {
        try {
            // InternalAngularDsl.g:54:1: ( ruleAppAngular EOF )
            // InternalAngularDsl.g:55:1: ruleAppAngular EOF
            {
             before(grammarAccess.getAppAngularRule()); 
            pushFollow(FOLLOW_1);
            ruleAppAngular();

            state._fsp--;

             after(grammarAccess.getAppAngularRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAppAngular"


    // $ANTLR start "ruleAppAngular"
    // InternalAngularDsl.g:62:1: ruleAppAngular : ( ( rule__AppAngular__Alternatives ) ) ;
    public final void ruleAppAngular() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:66:2: ( ( ( rule__AppAngular__Alternatives ) ) )
            // InternalAngularDsl.g:67:2: ( ( rule__AppAngular__Alternatives ) )
            {
            // InternalAngularDsl.g:67:2: ( ( rule__AppAngular__Alternatives ) )
            // InternalAngularDsl.g:68:3: ( rule__AppAngular__Alternatives )
            {
             before(grammarAccess.getAppAngularAccess().getAlternatives()); 
            // InternalAngularDsl.g:69:3: ( rule__AppAngular__Alternatives )
            // InternalAngularDsl.g:69:4: rule__AppAngular__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AppAngular__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAppAngularAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAppAngular"


    // $ANTLR start "entryRuleModulo"
    // InternalAngularDsl.g:78:1: entryRuleModulo : ruleModulo EOF ;
    public final void entryRuleModulo() throws RecognitionException {
        try {
            // InternalAngularDsl.g:79:1: ( ruleModulo EOF )
            // InternalAngularDsl.g:80:1: ruleModulo EOF
            {
             before(grammarAccess.getModuloRule()); 
            pushFollow(FOLLOW_1);
            ruleModulo();

            state._fsp--;

             after(grammarAccess.getModuloRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModulo"


    // $ANTLR start "ruleModulo"
    // InternalAngularDsl.g:87:1: ruleModulo : ( ( rule__Modulo__Group__0 ) ) ;
    public final void ruleModulo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:91:2: ( ( ( rule__Modulo__Group__0 ) ) )
            // InternalAngularDsl.g:92:2: ( ( rule__Modulo__Group__0 ) )
            {
            // InternalAngularDsl.g:92:2: ( ( rule__Modulo__Group__0 ) )
            // InternalAngularDsl.g:93:3: ( rule__Modulo__Group__0 )
            {
             before(grammarAccess.getModuloAccess().getGroup()); 
            // InternalAngularDsl.g:94:3: ( rule__Modulo__Group__0 )
            // InternalAngularDsl.g:94:4: rule__Modulo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Modulo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuloAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModulo"


    // $ANTLR start "entryRuleService"
    // InternalAngularDsl.g:103:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalAngularDsl.g:104:1: ( ruleService EOF )
            // InternalAngularDsl.g:105:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalAngularDsl.g:112:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:116:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalAngularDsl.g:117:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalAngularDsl.g:117:2: ( ( rule__Service__Group__0 ) )
            // InternalAngularDsl.g:118:3: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // InternalAngularDsl.g:119:3: ( rule__Service__Group__0 )
            // InternalAngularDsl.g:119:4: rule__Service__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleComponente"
    // InternalAngularDsl.g:128:1: entryRuleComponente : ruleComponente EOF ;
    public final void entryRuleComponente() throws RecognitionException {
        try {
            // InternalAngularDsl.g:129:1: ( ruleComponente EOF )
            // InternalAngularDsl.g:130:1: ruleComponente EOF
            {
             before(grammarAccess.getComponenteRule()); 
            pushFollow(FOLLOW_1);
            ruleComponente();

            state._fsp--;

             after(grammarAccess.getComponenteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponente"


    // $ANTLR start "ruleComponente"
    // InternalAngularDsl.g:137:1: ruleComponente : ( ( rule__Componente__Group__0 ) ) ;
    public final void ruleComponente() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:141:2: ( ( ( rule__Componente__Group__0 ) ) )
            // InternalAngularDsl.g:142:2: ( ( rule__Componente__Group__0 ) )
            {
            // InternalAngularDsl.g:142:2: ( ( rule__Componente__Group__0 ) )
            // InternalAngularDsl.g:143:3: ( rule__Componente__Group__0 )
            {
             before(grammarAccess.getComponenteAccess().getGroup()); 
            // InternalAngularDsl.g:144:3: ( rule__Componente__Group__0 )
            // InternalAngularDsl.g:144:4: rule__Componente__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Componente__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponenteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponente"


    // $ANTLR start "entryRuleFuncion"
    // InternalAngularDsl.g:153:1: entryRuleFuncion : ruleFuncion EOF ;
    public final void entryRuleFuncion() throws RecognitionException {
        try {
            // InternalAngularDsl.g:154:1: ( ruleFuncion EOF )
            // InternalAngularDsl.g:155:1: ruleFuncion EOF
            {
             before(grammarAccess.getFuncionRule()); 
            pushFollow(FOLLOW_1);
            ruleFuncion();

            state._fsp--;

             after(grammarAccess.getFuncionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFuncion"


    // $ANTLR start "ruleFuncion"
    // InternalAngularDsl.g:162:1: ruleFuncion : ( ( rule__Funcion__Group__0 ) ) ;
    public final void ruleFuncion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:166:2: ( ( ( rule__Funcion__Group__0 ) ) )
            // InternalAngularDsl.g:167:2: ( ( rule__Funcion__Group__0 ) )
            {
            // InternalAngularDsl.g:167:2: ( ( rule__Funcion__Group__0 ) )
            // InternalAngularDsl.g:168:3: ( rule__Funcion__Group__0 )
            {
             before(grammarAccess.getFuncionAccess().getGroup()); 
            // InternalAngularDsl.g:169:3: ( rule__Funcion__Group__0 )
            // InternalAngularDsl.g:169:4: rule__Funcion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Funcion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuncionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFuncion"


    // $ANTLR start "entryRuleVariable"
    // InternalAngularDsl.g:178:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalAngularDsl.g:179:1: ( ruleVariable EOF )
            // InternalAngularDsl.g:180:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalAngularDsl.g:187:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:191:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalAngularDsl.g:192:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalAngularDsl.g:192:2: ( ( rule__Variable__Group__0 ) )
            // InternalAngularDsl.g:193:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalAngularDsl.g:194:3: ( rule__Variable__Group__0 )
            // InternalAngularDsl.g:194:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleAnotacion"
    // InternalAngularDsl.g:203:1: entryRuleAnotacion : ruleAnotacion EOF ;
    public final void entryRuleAnotacion() throws RecognitionException {
        try {
            // InternalAngularDsl.g:204:1: ( ruleAnotacion EOF )
            // InternalAngularDsl.g:205:1: ruleAnotacion EOF
            {
             before(grammarAccess.getAnotacionRule()); 
            pushFollow(FOLLOW_1);
            ruleAnotacion();

            state._fsp--;

             after(grammarAccess.getAnotacionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnotacion"


    // $ANTLR start "ruleAnotacion"
    // InternalAngularDsl.g:212:1: ruleAnotacion : ( ( rule__Anotacion__Group__0 ) ) ;
    public final void ruleAnotacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:216:2: ( ( ( rule__Anotacion__Group__0 ) ) )
            // InternalAngularDsl.g:217:2: ( ( rule__Anotacion__Group__0 ) )
            {
            // InternalAngularDsl.g:217:2: ( ( rule__Anotacion__Group__0 ) )
            // InternalAngularDsl.g:218:3: ( rule__Anotacion__Group__0 )
            {
             before(grammarAccess.getAnotacionAccess().getGroup()); 
            // InternalAngularDsl.g:219:3: ( rule__Anotacion__Group__0 )
            // InternalAngularDsl.g:219:4: rule__Anotacion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Anotacion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnotacionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnotacion"


    // $ANTLR start "entryRuleTemplate"
    // InternalAngularDsl.g:228:1: entryRuleTemplate : ruleTemplate EOF ;
    public final void entryRuleTemplate() throws RecognitionException {
        try {
            // InternalAngularDsl.g:229:1: ( ruleTemplate EOF )
            // InternalAngularDsl.g:230:1: ruleTemplate EOF
            {
             before(grammarAccess.getTemplateRule()); 
            pushFollow(FOLLOW_1);
            ruleTemplate();

            state._fsp--;

             after(grammarAccess.getTemplateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTemplate"


    // $ANTLR start "ruleTemplate"
    // InternalAngularDsl.g:237:1: ruleTemplate : ( ( rule__Template__Group__0 ) ) ;
    public final void ruleTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:241:2: ( ( ( rule__Template__Group__0 ) ) )
            // InternalAngularDsl.g:242:2: ( ( rule__Template__Group__0 ) )
            {
            // InternalAngularDsl.g:242:2: ( ( rule__Template__Group__0 ) )
            // InternalAngularDsl.g:243:3: ( rule__Template__Group__0 )
            {
             before(grammarAccess.getTemplateAccess().getGroup()); 
            // InternalAngularDsl.g:244:3: ( rule__Template__Group__0 )
            // InternalAngularDsl.g:244:4: rule__Template__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Template__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemplate"


    // $ANTLR start "entryRuleSentenciaHTML"
    // InternalAngularDsl.g:253:1: entryRuleSentenciaHTML : ruleSentenciaHTML EOF ;
    public final void entryRuleSentenciaHTML() throws RecognitionException {
        try {
            // InternalAngularDsl.g:254:1: ( ruleSentenciaHTML EOF )
            // InternalAngularDsl.g:255:1: ruleSentenciaHTML EOF
            {
             before(grammarAccess.getSentenciaHTMLRule()); 
            pushFollow(FOLLOW_1);
            ruleSentenciaHTML();

            state._fsp--;

             after(grammarAccess.getSentenciaHTMLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSentenciaHTML"


    // $ANTLR start "ruleSentenciaHTML"
    // InternalAngularDsl.g:262:1: ruleSentenciaHTML : ( ( rule__SentenciaHTML__Group__0 ) ) ;
    public final void ruleSentenciaHTML() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:266:2: ( ( ( rule__SentenciaHTML__Group__0 ) ) )
            // InternalAngularDsl.g:267:2: ( ( rule__SentenciaHTML__Group__0 ) )
            {
            // InternalAngularDsl.g:267:2: ( ( rule__SentenciaHTML__Group__0 ) )
            // InternalAngularDsl.g:268:3: ( rule__SentenciaHTML__Group__0 )
            {
             before(grammarAccess.getSentenciaHTMLAccess().getGroup()); 
            // InternalAngularDsl.g:269:3: ( rule__SentenciaHTML__Group__0 )
            // InternalAngularDsl.g:269:4: rule__SentenciaHTML__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SentenciaHTML__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSentenciaHTMLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSentenciaHTML"


    // $ANTLR start "entryRuleDirectiva"
    // InternalAngularDsl.g:278:1: entryRuleDirectiva : ruleDirectiva EOF ;
    public final void entryRuleDirectiva() throws RecognitionException {
        try {
            // InternalAngularDsl.g:279:1: ( ruleDirectiva EOF )
            // InternalAngularDsl.g:280:1: ruleDirectiva EOF
            {
             before(grammarAccess.getDirectivaRule()); 
            pushFollow(FOLLOW_1);
            ruleDirectiva();

            state._fsp--;

             after(grammarAccess.getDirectivaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDirectiva"


    // $ANTLR start "ruleDirectiva"
    // InternalAngularDsl.g:287:1: ruleDirectiva : ( ( rule__Directiva__Group__0 ) ) ;
    public final void ruleDirectiva() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:291:2: ( ( ( rule__Directiva__Group__0 ) ) )
            // InternalAngularDsl.g:292:2: ( ( rule__Directiva__Group__0 ) )
            {
            // InternalAngularDsl.g:292:2: ( ( rule__Directiva__Group__0 ) )
            // InternalAngularDsl.g:293:3: ( rule__Directiva__Group__0 )
            {
             before(grammarAccess.getDirectivaAccess().getGroup()); 
            // InternalAngularDsl.g:294:3: ( rule__Directiva__Group__0 )
            // InternalAngularDsl.g:294:4: rule__Directiva__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Directiva__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDirectivaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirectiva"


    // $ANTLR start "entryRulePropiedad"
    // InternalAngularDsl.g:303:1: entryRulePropiedad : rulePropiedad EOF ;
    public final void entryRulePropiedad() throws RecognitionException {
        try {
            // InternalAngularDsl.g:304:1: ( rulePropiedad EOF )
            // InternalAngularDsl.g:305:1: rulePropiedad EOF
            {
             before(grammarAccess.getPropiedadRule()); 
            pushFollow(FOLLOW_1);
            rulePropiedad();

            state._fsp--;

             after(grammarAccess.getPropiedadRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropiedad"


    // $ANTLR start "rulePropiedad"
    // InternalAngularDsl.g:312:1: rulePropiedad : ( ( rule__Propiedad__Group__0 ) ) ;
    public final void rulePropiedad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:316:2: ( ( ( rule__Propiedad__Group__0 ) ) )
            // InternalAngularDsl.g:317:2: ( ( rule__Propiedad__Group__0 ) )
            {
            // InternalAngularDsl.g:317:2: ( ( rule__Propiedad__Group__0 ) )
            // InternalAngularDsl.g:318:3: ( rule__Propiedad__Group__0 )
            {
             before(grammarAccess.getPropiedadAccess().getGroup()); 
            // InternalAngularDsl.g:319:3: ( rule__Propiedad__Group__0 )
            // InternalAngularDsl.g:319:4: rule__Propiedad__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Propiedad__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropiedadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropiedad"


    // $ANTLR start "entryRuleCurlyBraces"
    // InternalAngularDsl.g:328:1: entryRuleCurlyBraces : ruleCurlyBraces EOF ;
    public final void entryRuleCurlyBraces() throws RecognitionException {
        try {
            // InternalAngularDsl.g:329:1: ( ruleCurlyBraces EOF )
            // InternalAngularDsl.g:330:1: ruleCurlyBraces EOF
            {
             before(grammarAccess.getCurlyBracesRule()); 
            pushFollow(FOLLOW_1);
            ruleCurlyBraces();

            state._fsp--;

             after(grammarAccess.getCurlyBracesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCurlyBraces"


    // $ANTLR start "ruleCurlyBraces"
    // InternalAngularDsl.g:337:1: ruleCurlyBraces : ( ( rule__CurlyBraces__Group__0 ) ) ;
    public final void ruleCurlyBraces() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:341:2: ( ( ( rule__CurlyBraces__Group__0 ) ) )
            // InternalAngularDsl.g:342:2: ( ( rule__CurlyBraces__Group__0 ) )
            {
            // InternalAngularDsl.g:342:2: ( ( rule__CurlyBraces__Group__0 ) )
            // InternalAngularDsl.g:343:3: ( rule__CurlyBraces__Group__0 )
            {
             before(grammarAccess.getCurlyBracesAccess().getGroup()); 
            // InternalAngularDsl.g:344:3: ( rule__CurlyBraces__Group__0 )
            // InternalAngularDsl.g:344:4: rule__CurlyBraces__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CurlyBraces__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCurlyBracesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCurlyBraces"


    // $ANTLR start "entryRuleExpresion"
    // InternalAngularDsl.g:353:1: entryRuleExpresion : ruleExpresion EOF ;
    public final void entryRuleExpresion() throws RecognitionException {
        try {
            // InternalAngularDsl.g:354:1: ( ruleExpresion EOF )
            // InternalAngularDsl.g:355:1: ruleExpresion EOF
            {
             before(grammarAccess.getExpresionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresion"


    // $ANTLR start "ruleExpresion"
    // InternalAngularDsl.g:362:1: ruleExpresion : ( ( rule__Expresion__Group__0 ) ) ;
    public final void ruleExpresion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:366:2: ( ( ( rule__Expresion__Group__0 ) ) )
            // InternalAngularDsl.g:367:2: ( ( rule__Expresion__Group__0 ) )
            {
            // InternalAngularDsl.g:367:2: ( ( rule__Expresion__Group__0 ) )
            // InternalAngularDsl.g:368:3: ( rule__Expresion__Group__0 )
            {
             before(grammarAccess.getExpresionAccess().getGroup()); 
            // InternalAngularDsl.g:369:3: ( rule__Expresion__Group__0 )
            // InternalAngularDsl.g:369:4: rule__Expresion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expresion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresion"


    // $ANTLR start "entryRuleFiltro"
    // InternalAngularDsl.g:378:1: entryRuleFiltro : ruleFiltro EOF ;
    public final void entryRuleFiltro() throws RecognitionException {
        try {
            // InternalAngularDsl.g:379:1: ( ruleFiltro EOF )
            // InternalAngularDsl.g:380:1: ruleFiltro EOF
            {
             before(grammarAccess.getFiltroRule()); 
            pushFollow(FOLLOW_1);
            ruleFiltro();

            state._fsp--;

             after(grammarAccess.getFiltroRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFiltro"


    // $ANTLR start "ruleFiltro"
    // InternalAngularDsl.g:387:1: ruleFiltro : ( ( rule__Filtro__Group__0 ) ) ;
    public final void ruleFiltro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:391:2: ( ( ( rule__Filtro__Group__0 ) ) )
            // InternalAngularDsl.g:392:2: ( ( rule__Filtro__Group__0 ) )
            {
            // InternalAngularDsl.g:392:2: ( ( rule__Filtro__Group__0 ) )
            // InternalAngularDsl.g:393:3: ( rule__Filtro__Group__0 )
            {
             before(grammarAccess.getFiltroAccess().getGroup()); 
            // InternalAngularDsl.g:394:3: ( rule__Filtro__Group__0 )
            // InternalAngularDsl.g:394:4: rule__Filtro__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Filtro__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFiltroAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFiltro"


    // $ANTLR start "entryRuleEString"
    // InternalAngularDsl.g:403:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalAngularDsl.g:404:1: ( ruleEString EOF )
            // InternalAngularDsl.g:405:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalAngularDsl.g:412:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:416:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalAngularDsl.g:417:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalAngularDsl.g:417:2: ( ( rule__EString__Alternatives ) )
            // InternalAngularDsl.g:418:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalAngularDsl.g:419:3: ( rule__EString__Alternatives )
            // InternalAngularDsl.g:419:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEBoolean"
    // InternalAngularDsl.g:428:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalAngularDsl.g:429:1: ( ruleEBoolean EOF )
            // InternalAngularDsl.g:430:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalAngularDsl.g:437:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:441:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalAngularDsl.g:442:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalAngularDsl.g:442:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalAngularDsl.g:443:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalAngularDsl.g:444:3: ( rule__EBoolean__Alternatives )
            // InternalAngularDsl.g:444:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "rule__AppAngular__Alternatives"
    // InternalAngularDsl.g:452:1: rule__AppAngular__Alternatives : ( ( ( rule__AppAngular__ModulosAssignment_0 ) ) | ( ( rule__AppAngular__ComponentesAssignment_1 ) ) | ( ( rule__AppAngular__ServicesAssignment_2 ) ) | ( ( rule__AppAngular__TemplatesAssignment_3 ) ) );
    public final void rule__AppAngular__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:456:1: ( ( ( rule__AppAngular__ModulosAssignment_0 ) ) | ( ( rule__AppAngular__ComponentesAssignment_1 ) ) | ( ( rule__AppAngular__ServicesAssignment_2 ) ) | ( ( rule__AppAngular__TemplatesAssignment_3 ) ) )
            int alt1=4;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalAngularDsl.g:457:2: ( ( rule__AppAngular__ModulosAssignment_0 ) )
                    {
                    // InternalAngularDsl.g:457:2: ( ( rule__AppAngular__ModulosAssignment_0 ) )
                    // InternalAngularDsl.g:458:3: ( rule__AppAngular__ModulosAssignment_0 )
                    {
                     before(grammarAccess.getAppAngularAccess().getModulosAssignment_0()); 
                    // InternalAngularDsl.g:459:3: ( rule__AppAngular__ModulosAssignment_0 )
                    // InternalAngularDsl.g:459:4: rule__AppAngular__ModulosAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AppAngular__ModulosAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAppAngularAccess().getModulosAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAngularDsl.g:463:2: ( ( rule__AppAngular__ComponentesAssignment_1 ) )
                    {
                    // InternalAngularDsl.g:463:2: ( ( rule__AppAngular__ComponentesAssignment_1 ) )
                    // InternalAngularDsl.g:464:3: ( rule__AppAngular__ComponentesAssignment_1 )
                    {
                     before(grammarAccess.getAppAngularAccess().getComponentesAssignment_1()); 
                    // InternalAngularDsl.g:465:3: ( rule__AppAngular__ComponentesAssignment_1 )
                    // InternalAngularDsl.g:465:4: rule__AppAngular__ComponentesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AppAngular__ComponentesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAppAngularAccess().getComponentesAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAngularDsl.g:469:2: ( ( rule__AppAngular__ServicesAssignment_2 ) )
                    {
                    // InternalAngularDsl.g:469:2: ( ( rule__AppAngular__ServicesAssignment_2 ) )
                    // InternalAngularDsl.g:470:3: ( rule__AppAngular__ServicesAssignment_2 )
                    {
                     before(grammarAccess.getAppAngularAccess().getServicesAssignment_2()); 
                    // InternalAngularDsl.g:471:3: ( rule__AppAngular__ServicesAssignment_2 )
                    // InternalAngularDsl.g:471:4: rule__AppAngular__ServicesAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__AppAngular__ServicesAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getAppAngularAccess().getServicesAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAngularDsl.g:475:2: ( ( rule__AppAngular__TemplatesAssignment_3 ) )
                    {
                    // InternalAngularDsl.g:475:2: ( ( rule__AppAngular__TemplatesAssignment_3 ) )
                    // InternalAngularDsl.g:476:3: ( rule__AppAngular__TemplatesAssignment_3 )
                    {
                     before(grammarAccess.getAppAngularAccess().getTemplatesAssignment_3()); 
                    // InternalAngularDsl.g:477:3: ( rule__AppAngular__TemplatesAssignment_3 )
                    // InternalAngularDsl.g:477:4: rule__AppAngular__TemplatesAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__AppAngular__TemplatesAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getAppAngularAccess().getTemplatesAssignment_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppAngular__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalAngularDsl.g:485:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:489:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAngularDsl.g:490:2: ( RULE_STRING )
                    {
                    // InternalAngularDsl.g:490:2: ( RULE_STRING )
                    // InternalAngularDsl.g:491:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAngularDsl.g:496:2: ( RULE_ID )
                    {
                    // InternalAngularDsl.g:496:2: ( RULE_ID )
                    // InternalAngularDsl.g:497:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalAngularDsl.g:506:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:510:1: ( ( 'true' ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            else if ( (LA3_0==36) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAngularDsl.g:511:2: ( 'true' )
                    {
                    // InternalAngularDsl.g:511:2: ( 'true' )
                    // InternalAngularDsl.g:512:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAngularDsl.g:517:2: ( 'false' )
                    {
                    // InternalAngularDsl.g:517:2: ( 'false' )
                    // InternalAngularDsl.g:518:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__Modulo__Group__0"
    // InternalAngularDsl.g:527:1: rule__Modulo__Group__0 : rule__Modulo__Group__0__Impl rule__Modulo__Group__1 ;
    public final void rule__Modulo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:531:1: ( rule__Modulo__Group__0__Impl rule__Modulo__Group__1 )
            // InternalAngularDsl.g:532:2: rule__Modulo__Group__0__Impl rule__Modulo__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Modulo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__0"


    // $ANTLR start "rule__Modulo__Group__0__Impl"
    // InternalAngularDsl.g:539:1: rule__Modulo__Group__0__Impl : ( () ) ;
    public final void rule__Modulo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:543:1: ( ( () ) )
            // InternalAngularDsl.g:544:1: ( () )
            {
            // InternalAngularDsl.g:544:1: ( () )
            // InternalAngularDsl.g:545:2: ()
            {
             before(grammarAccess.getModuloAccess().getModuloAction_0()); 
            // InternalAngularDsl.g:546:2: ()
            // InternalAngularDsl.g:546:3: 
            {
            }

             after(grammarAccess.getModuloAccess().getModuloAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__0__Impl"


    // $ANTLR start "rule__Modulo__Group__1"
    // InternalAngularDsl.g:554:1: rule__Modulo__Group__1 : rule__Modulo__Group__1__Impl rule__Modulo__Group__2 ;
    public final void rule__Modulo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:558:1: ( rule__Modulo__Group__1__Impl rule__Modulo__Group__2 )
            // InternalAngularDsl.g:559:2: rule__Modulo__Group__1__Impl rule__Modulo__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Modulo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__1"


    // $ANTLR start "rule__Modulo__Group__1__Impl"
    // InternalAngularDsl.g:566:1: rule__Modulo__Group__1__Impl : ( ( rule__Modulo__Group_1__0 )? ) ;
    public final void rule__Modulo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:570:1: ( ( ( rule__Modulo__Group_1__0 )? ) )
            // InternalAngularDsl.g:571:1: ( ( rule__Modulo__Group_1__0 )? )
            {
            // InternalAngularDsl.g:571:1: ( ( rule__Modulo__Group_1__0 )? )
            // InternalAngularDsl.g:572:2: ( rule__Modulo__Group_1__0 )?
            {
             before(grammarAccess.getModuloAccess().getGroup_1()); 
            // InternalAngularDsl.g:573:2: ( rule__Modulo__Group_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_COMILLAS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAngularDsl.g:573:3: rule__Modulo__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Modulo__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuloAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__1__Impl"


    // $ANTLR start "rule__Modulo__Group__2"
    // InternalAngularDsl.g:581:1: rule__Modulo__Group__2 : rule__Modulo__Group__2__Impl rule__Modulo__Group__3 ;
    public final void rule__Modulo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:585:1: ( rule__Modulo__Group__2__Impl rule__Modulo__Group__3 )
            // InternalAngularDsl.g:586:2: rule__Modulo__Group__2__Impl rule__Modulo__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Modulo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__2"


    // $ANTLR start "rule__Modulo__Group__2__Impl"
    // InternalAngularDsl.g:593:1: rule__Modulo__Group__2__Impl : ( RULE_ANGULAR ) ;
    public final void rule__Modulo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:597:1: ( ( RULE_ANGULAR ) )
            // InternalAngularDsl.g:598:1: ( RULE_ANGULAR )
            {
            // InternalAngularDsl.g:598:1: ( RULE_ANGULAR )
            // InternalAngularDsl.g:599:2: RULE_ANGULAR
            {
             before(grammarAccess.getModuloAccess().getANGULARTerminalRuleCall_2()); 
            match(input,RULE_ANGULAR,FOLLOW_2); 
             after(grammarAccess.getModuloAccess().getANGULARTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__2__Impl"


    // $ANTLR start "rule__Modulo__Group__3"
    // InternalAngularDsl.g:608:1: rule__Modulo__Group__3 : rule__Modulo__Group__3__Impl rule__Modulo__Group__4 ;
    public final void rule__Modulo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:612:1: ( rule__Modulo__Group__3__Impl rule__Modulo__Group__4 )
            // InternalAngularDsl.g:613:2: rule__Modulo__Group__3__Impl rule__Modulo__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Modulo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__3"


    // $ANTLR start "rule__Modulo__Group__3__Impl"
    // InternalAngularDsl.g:620:1: rule__Modulo__Group__3__Impl : ( RULE_PUNTO ) ;
    public final void rule__Modulo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:624:1: ( ( RULE_PUNTO ) )
            // InternalAngularDsl.g:625:1: ( RULE_PUNTO )
            {
            // InternalAngularDsl.g:625:1: ( RULE_PUNTO )
            // InternalAngularDsl.g:626:2: RULE_PUNTO
            {
             before(grammarAccess.getModuloAccess().getPUNTOTerminalRuleCall_3()); 
            match(input,RULE_PUNTO,FOLLOW_2); 
             after(grammarAccess.getModuloAccess().getPUNTOTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__3__Impl"


    // $ANTLR start "rule__Modulo__Group__4"
    // InternalAngularDsl.g:635:1: rule__Modulo__Group__4 : rule__Modulo__Group__4__Impl rule__Modulo__Group__5 ;
    public final void rule__Modulo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:639:1: ( rule__Modulo__Group__4__Impl rule__Modulo__Group__5 )
            // InternalAngularDsl.g:640:2: rule__Modulo__Group__4__Impl rule__Modulo__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Modulo__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__4"


    // $ANTLR start "rule__Modulo__Group__4__Impl"
    // InternalAngularDsl.g:647:1: rule__Modulo__Group__4__Impl : ( RULE_MODULE ) ;
    public final void rule__Modulo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:651:1: ( ( RULE_MODULE ) )
            // InternalAngularDsl.g:652:1: ( RULE_MODULE )
            {
            // InternalAngularDsl.g:652:1: ( RULE_MODULE )
            // InternalAngularDsl.g:653:2: RULE_MODULE
            {
             before(grammarAccess.getModuloAccess().getMODULETerminalRuleCall_4()); 
            match(input,RULE_MODULE,FOLLOW_2); 
             after(grammarAccess.getModuloAccess().getMODULETerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__4__Impl"


    // $ANTLR start "rule__Modulo__Group__5"
    // InternalAngularDsl.g:662:1: rule__Modulo__Group__5 : rule__Modulo__Group__5__Impl rule__Modulo__Group__6 ;
    public final void rule__Modulo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:666:1: ( rule__Modulo__Group__5__Impl rule__Modulo__Group__6 )
            // InternalAngularDsl.g:667:2: rule__Modulo__Group__5__Impl rule__Modulo__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Modulo__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__5"


    // $ANTLR start "rule__Modulo__Group__5__Impl"
    // InternalAngularDsl.g:674:1: rule__Modulo__Group__5__Impl : ( RULE_PARENTESIS_IZQUIERDO ) ;
    public final void rule__Modulo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:678:1: ( ( RULE_PARENTESIS_IZQUIERDO ) )
            // InternalAngularDsl.g:679:1: ( RULE_PARENTESIS_IZQUIERDO )
            {
            // InternalAngularDsl.g:679:1: ( RULE_PARENTESIS_IZQUIERDO )
            // InternalAngularDsl.g:680:2: RULE_PARENTESIS_IZQUIERDO
            {
             before(grammarAccess.getModuloAccess().getPARENTESIS_IZQUIERDOTerminalRuleCall_5()); 
            match(input,RULE_PARENTESIS_IZQUIERDO,FOLLOW_2); 
             after(grammarAccess.getModuloAccess().getPARENTESIS_IZQUIERDOTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__5__Impl"


    // $ANTLR start "rule__Modulo__Group__6"
    // InternalAngularDsl.g:689:1: rule__Modulo__Group__6 : rule__Modulo__Group__6__Impl rule__Modulo__Group__7 ;
    public final void rule__Modulo__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:693:1: ( rule__Modulo__Group__6__Impl rule__Modulo__Group__7 )
            // InternalAngularDsl.g:694:2: rule__Modulo__Group__6__Impl rule__Modulo__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Modulo__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__6"


    // $ANTLR start "rule__Modulo__Group__6__Impl"
    // InternalAngularDsl.g:701:1: rule__Modulo__Group__6__Impl : ( ( rule__Modulo__NameAssignment_6 ) ) ;
    public final void rule__Modulo__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:705:1: ( ( ( rule__Modulo__NameAssignment_6 ) ) )
            // InternalAngularDsl.g:706:1: ( ( rule__Modulo__NameAssignment_6 ) )
            {
            // InternalAngularDsl.g:706:1: ( ( rule__Modulo__NameAssignment_6 ) )
            // InternalAngularDsl.g:707:2: ( rule__Modulo__NameAssignment_6 )
            {
             before(grammarAccess.getModuloAccess().getNameAssignment_6()); 
            // InternalAngularDsl.g:708:2: ( rule__Modulo__NameAssignment_6 )
            // InternalAngularDsl.g:708:3: rule__Modulo__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Modulo__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getModuloAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__6__Impl"


    // $ANTLR start "rule__Modulo__Group__7"
    // InternalAngularDsl.g:716:1: rule__Modulo__Group__7 : rule__Modulo__Group__7__Impl rule__Modulo__Group__8 ;
    public final void rule__Modulo__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:720:1: ( rule__Modulo__Group__7__Impl rule__Modulo__Group__8 )
            // InternalAngularDsl.g:721:2: rule__Modulo__Group__7__Impl rule__Modulo__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Modulo__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__7"


    // $ANTLR start "rule__Modulo__Group__7__Impl"
    // InternalAngularDsl.g:728:1: rule__Modulo__Group__7__Impl : ( RULE_COMA ) ;
    public final void rule__Modulo__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:732:1: ( ( RULE_COMA ) )
            // InternalAngularDsl.g:733:1: ( RULE_COMA )
            {
            // InternalAngularDsl.g:733:1: ( RULE_COMA )
            // InternalAngularDsl.g:734:2: RULE_COMA
            {
             before(grammarAccess.getModuloAccess().getCOMATerminalRuleCall_7()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getModuloAccess().getCOMATerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__7__Impl"


    // $ANTLR start "rule__Modulo__Group__8"
    // InternalAngularDsl.g:743:1: rule__Modulo__Group__8 : rule__Modulo__Group__8__Impl rule__Modulo__Group__9 ;
    public final void rule__Modulo__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:747:1: ( rule__Modulo__Group__8__Impl rule__Modulo__Group__9 )
            // InternalAngularDsl.g:748:2: rule__Modulo__Group__8__Impl rule__Modulo__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Modulo__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__8"


    // $ANTLR start "rule__Modulo__Group__8__Impl"
    // InternalAngularDsl.g:755:1: rule__Modulo__Group__8__Impl : ( RULE_PARENTESIS_CUADRADO_IZQUIERDO ) ;
    public final void rule__Modulo__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:759:1: ( ( RULE_PARENTESIS_CUADRADO_IZQUIERDO ) )
            // InternalAngularDsl.g:760:1: ( RULE_PARENTESIS_CUADRADO_IZQUIERDO )
            {
            // InternalAngularDsl.g:760:1: ( RULE_PARENTESIS_CUADRADO_IZQUIERDO )
            // InternalAngularDsl.g:761:2: RULE_PARENTESIS_CUADRADO_IZQUIERDO
            {
             before(grammarAccess.getModuloAccess().getPARENTESIS_CUADRADO_IZQUIERDOTerminalRuleCall_8()); 
            match(input,RULE_PARENTESIS_CUADRADO_IZQUIERDO,FOLLOW_2); 
             after(grammarAccess.getModuloAccess().getPARENTESIS_CUADRADO_IZQUIERDOTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__8__Impl"


    // $ANTLR start "rule__Modulo__Group__9"
    // InternalAngularDsl.g:770:1: rule__Modulo__Group__9 : rule__Modulo__Group__9__Impl rule__Modulo__Group__10 ;
    public final void rule__Modulo__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:774:1: ( rule__Modulo__Group__9__Impl rule__Modulo__Group__10 )
            // InternalAngularDsl.g:775:2: rule__Modulo__Group__9__Impl rule__Modulo__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Modulo__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__9"


    // $ANTLR start "rule__Modulo__Group__9__Impl"
    // InternalAngularDsl.g:782:1: rule__Modulo__Group__9__Impl : ( ( rule__Modulo__Group_9__0 )* ) ;
    public final void rule__Modulo__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:786:1: ( ( ( rule__Modulo__Group_9__0 )* ) )
            // InternalAngularDsl.g:787:1: ( ( rule__Modulo__Group_9__0 )* )
            {
            // InternalAngularDsl.g:787:1: ( ( rule__Modulo__Group_9__0 )* )
            // InternalAngularDsl.g:788:2: ( rule__Modulo__Group_9__0 )*
            {
             before(grammarAccess.getModuloAccess().getGroup_9()); 
            // InternalAngularDsl.g:789:2: ( rule__Modulo__Group_9__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAngularDsl.g:789:3: rule__Modulo__Group_9__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Modulo__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModuloAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__9__Impl"


    // $ANTLR start "rule__Modulo__Group__10"
    // InternalAngularDsl.g:797:1: rule__Modulo__Group__10 : rule__Modulo__Group__10__Impl rule__Modulo__Group__11 ;
    public final void rule__Modulo__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:801:1: ( rule__Modulo__Group__10__Impl rule__Modulo__Group__11 )
            // InternalAngularDsl.g:802:2: rule__Modulo__Group__10__Impl rule__Modulo__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__Modulo__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__10"


    // $ANTLR start "rule__Modulo__Group__10__Impl"
    // InternalAngularDsl.g:809:1: rule__Modulo__Group__10__Impl : ( RULE_PARENTESIS_CUADRADO_DERECHO ) ;
    public final void rule__Modulo__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:813:1: ( ( RULE_PARENTESIS_CUADRADO_DERECHO ) )
            // InternalAngularDsl.g:814:1: ( RULE_PARENTESIS_CUADRADO_DERECHO )
            {
            // InternalAngularDsl.g:814:1: ( RULE_PARENTESIS_CUADRADO_DERECHO )
            // InternalAngularDsl.g:815:2: RULE_PARENTESIS_CUADRADO_DERECHO
            {
             before(grammarAccess.getModuloAccess().getPARENTESIS_CUADRADO_DERECHOTerminalRuleCall_10()); 
            match(input,RULE_PARENTESIS_CUADRADO_DERECHO,FOLLOW_2); 
             after(grammarAccess.getModuloAccess().getPARENTESIS_CUADRADO_DERECHOTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__10__Impl"


    // $ANTLR start "rule__Modulo__Group__11"
    // InternalAngularDsl.g:824:1: rule__Modulo__Group__11 : rule__Modulo__Group__11__Impl rule__Modulo__Group__12 ;
    public final void rule__Modulo__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:828:1: ( rule__Modulo__Group__11__Impl rule__Modulo__Group__12 )
            // InternalAngularDsl.g:829:2: rule__Modulo__Group__11__Impl rule__Modulo__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__Modulo__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__11"


    // $ANTLR start "rule__Modulo__Group__11__Impl"
    // InternalAngularDsl.g:836:1: rule__Modulo__Group__11__Impl : ( RULE_PARENTESIS_DERECHO ) ;
    public final void rule__Modulo__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:840:1: ( ( RULE_PARENTESIS_DERECHO ) )
            // InternalAngularDsl.g:841:1: ( RULE_PARENTESIS_DERECHO )
            {
            // InternalAngularDsl.g:841:1: ( RULE_PARENTESIS_DERECHO )
            // InternalAngularDsl.g:842:2: RULE_PARENTESIS_DERECHO
            {
             before(grammarAccess.getModuloAccess().getPARENTESIS_DERECHOTerminalRuleCall_11()); 
            match(input,RULE_PARENTESIS_DERECHO,FOLLOW_2); 
             after(grammarAccess.getModuloAccess().getPARENTESIS_DERECHOTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__11__Impl"


    // $ANTLR start "rule__Modulo__Group__12"
    // InternalAngularDsl.g:851:1: rule__Modulo__Group__12 : rule__Modulo__Group__12__Impl ;
    public final void rule__Modulo__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:855:1: ( rule__Modulo__Group__12__Impl )
            // InternalAngularDsl.g:856:2: rule__Modulo__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modulo__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__12"


    // $ANTLR start "rule__Modulo__Group__12__Impl"
    // InternalAngularDsl.g:862:1: rule__Modulo__Group__12__Impl : ( RULE_PUNTO_Y_COMA ) ;
    public final void rule__Modulo__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:866:1: ( ( RULE_PUNTO_Y_COMA ) )
            // InternalAngularDsl.g:867:1: ( RULE_PUNTO_Y_COMA )
            {
            // InternalAngularDsl.g:867:1: ( RULE_PUNTO_Y_COMA )
            // InternalAngularDsl.g:868:2: RULE_PUNTO_Y_COMA
            {
             before(grammarAccess.getModuloAccess().getPUNTO_Y_COMATerminalRuleCall_12()); 
            match(input,RULE_PUNTO_Y_COMA,FOLLOW_2); 
             after(grammarAccess.getModuloAccess().getPUNTO_Y_COMATerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__12__Impl"


    // $ANTLR start "rule__Modulo__Group_1__0"
    // InternalAngularDsl.g:878:1: rule__Modulo__Group_1__0 : rule__Modulo__Group_1__0__Impl rule__Modulo__Group_1__1 ;
    public final void rule__Modulo__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:882:1: ( rule__Modulo__Group_1__0__Impl rule__Modulo__Group_1__1 )
            // InternalAngularDsl.g:883:2: rule__Modulo__Group_1__0__Impl rule__Modulo__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Modulo__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_1__0"


    // $ANTLR start "rule__Modulo__Group_1__0__Impl"
    // InternalAngularDsl.g:890:1: rule__Modulo__Group_1__0__Impl : ( RULE_COMILLAS ) ;
    public final void rule__Modulo__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:894:1: ( ( RULE_COMILLAS ) )
            // InternalAngularDsl.g:895:1: ( RULE_COMILLAS )
            {
            // InternalAngularDsl.g:895:1: ( RULE_COMILLAS )
            // InternalAngularDsl.g:896:2: RULE_COMILLAS
            {
             before(grammarAccess.getModuloAccess().getCOMILLASTerminalRuleCall_1_0()); 
            match(input,RULE_COMILLAS,FOLLOW_2); 
             after(grammarAccess.getModuloAccess().getCOMILLASTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_1__0__Impl"


    // $ANTLR start "rule__Modulo__Group_1__1"
    // InternalAngularDsl.g:905:1: rule__Modulo__Group_1__1 : rule__Modulo__Group_1__1__Impl rule__Modulo__Group_1__2 ;
    public final void rule__Modulo__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:909:1: ( rule__Modulo__Group_1__1__Impl rule__Modulo__Group_1__2 )
            // InternalAngularDsl.g:910:2: rule__Modulo__Group_1__1__Impl rule__Modulo__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Modulo__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_1__1"


    // $ANTLR start "rule__Modulo__Group_1__1__Impl"
    // InternalAngularDsl.g:917:1: rule__Modulo__Group_1__1__Impl : ( RULE_USE ) ;
    public final void rule__Modulo__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:921:1: ( ( RULE_USE ) )
            // InternalAngularDsl.g:922:1: ( RULE_USE )
            {
            // InternalAngularDsl.g:922:1: ( RULE_USE )
            // InternalAngularDsl.g:923:2: RULE_USE
            {
             before(grammarAccess.getModuloAccess().getUSETerminalRuleCall_1_1()); 
            match(input,RULE_USE,FOLLOW_2); 
             after(grammarAccess.getModuloAccess().getUSETerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_1__1__Impl"


    // $ANTLR start "rule__Modulo__Group_1__2"
    // InternalAngularDsl.g:932:1: rule__Modulo__Group_1__2 : rule__Modulo__Group_1__2__Impl rule__Modulo__Group_1__3 ;
    public final void rule__Modulo__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:936:1: ( rule__Modulo__Group_1__2__Impl rule__Modulo__Group_1__3 )
            // InternalAngularDsl.g:937:2: rule__Modulo__Group_1__2__Impl rule__Modulo__Group_1__3
            {
            pushFollow(FOLLOW_16);
            rule__Modulo__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_1__2"


    // $ANTLR start "rule__Modulo__Group_1__2__Impl"
    // InternalAngularDsl.g:944:1: rule__Modulo__Group_1__2__Impl : ( RULE_STRICT ) ;
    public final void rule__Modulo__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:948:1: ( ( RULE_STRICT ) )
            // InternalAngularDsl.g:949:1: ( RULE_STRICT )
            {
            // InternalAngularDsl.g:949:1: ( RULE_STRICT )
            // InternalAngularDsl.g:950:2: RULE_STRICT
            {
             before(grammarAccess.getModuloAccess().getSTRICTTerminalRuleCall_1_2()); 
            match(input,RULE_STRICT,FOLLOW_2); 
             after(grammarAccess.getModuloAccess().getSTRICTTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_1__2__Impl"


    // $ANTLR start "rule__Modulo__Group_1__3"
    // InternalAngularDsl.g:959:1: rule__Modulo__Group_1__3 : rule__Modulo__Group_1__3__Impl rule__Modulo__Group_1__4 ;
    public final void rule__Modulo__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:963:1: ( rule__Modulo__Group_1__3__Impl rule__Modulo__Group_1__4 )
            // InternalAngularDsl.g:964:2: rule__Modulo__Group_1__3__Impl rule__Modulo__Group_1__4
            {
            pushFollow(FOLLOW_13);
            rule__Modulo__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_1__3"


    // $ANTLR start "rule__Modulo__Group_1__3__Impl"
    // InternalAngularDsl.g:971:1: rule__Modulo__Group_1__3__Impl : ( RULE_COMILLAS ) ;
    public final void rule__Modulo__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:975:1: ( ( RULE_COMILLAS ) )
            // InternalAngularDsl.g:976:1: ( RULE_COMILLAS )
            {
            // InternalAngularDsl.g:976:1: ( RULE_COMILLAS )
            // InternalAngularDsl.g:977:2: RULE_COMILLAS
            {
             before(grammarAccess.getModuloAccess().getCOMILLASTerminalRuleCall_1_3()); 
            match(input,RULE_COMILLAS,FOLLOW_2); 
             after(grammarAccess.getModuloAccess().getCOMILLASTerminalRuleCall_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_1__3__Impl"


    // $ANTLR start "rule__Modulo__Group_1__4"
    // InternalAngularDsl.g:986:1: rule__Modulo__Group_1__4 : rule__Modulo__Group_1__4__Impl ;
    public final void rule__Modulo__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:990:1: ( rule__Modulo__Group_1__4__Impl )
            // InternalAngularDsl.g:991:2: rule__Modulo__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modulo__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_1__4"


    // $ANTLR start "rule__Modulo__Group_1__4__Impl"
    // InternalAngularDsl.g:997:1: rule__Modulo__Group_1__4__Impl : ( RULE_PUNTO_Y_COMA ) ;
    public final void rule__Modulo__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1001:1: ( ( RULE_PUNTO_Y_COMA ) )
            // InternalAngularDsl.g:1002:1: ( RULE_PUNTO_Y_COMA )
            {
            // InternalAngularDsl.g:1002:1: ( RULE_PUNTO_Y_COMA )
            // InternalAngularDsl.g:1003:2: RULE_PUNTO_Y_COMA
            {
             before(grammarAccess.getModuloAccess().getPUNTO_Y_COMATerminalRuleCall_1_4()); 
            match(input,RULE_PUNTO_Y_COMA,FOLLOW_2); 
             after(grammarAccess.getModuloAccess().getPUNTO_Y_COMATerminalRuleCall_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_1__4__Impl"


    // $ANTLR start "rule__Modulo__Group_9__0"
    // InternalAngularDsl.g:1013:1: rule__Modulo__Group_9__0 : rule__Modulo__Group_9__0__Impl rule__Modulo__Group_9__1 ;
    public final void rule__Modulo__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1017:1: ( rule__Modulo__Group_9__0__Impl rule__Modulo__Group_9__1 )
            // InternalAngularDsl.g:1018:2: rule__Modulo__Group_9__0__Impl rule__Modulo__Group_9__1
            {
            pushFollow(FOLLOW_8);
            rule__Modulo__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_9__0"


    // $ANTLR start "rule__Modulo__Group_9__0__Impl"
    // InternalAngularDsl.g:1025:1: rule__Modulo__Group_9__0__Impl : ( ( rule__Modulo__ParametrosAssignment_9_0 ) ) ;
    public final void rule__Modulo__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1029:1: ( ( ( rule__Modulo__ParametrosAssignment_9_0 ) ) )
            // InternalAngularDsl.g:1030:1: ( ( rule__Modulo__ParametrosAssignment_9_0 ) )
            {
            // InternalAngularDsl.g:1030:1: ( ( rule__Modulo__ParametrosAssignment_9_0 ) )
            // InternalAngularDsl.g:1031:2: ( rule__Modulo__ParametrosAssignment_9_0 )
            {
             before(grammarAccess.getModuloAccess().getParametrosAssignment_9_0()); 
            // InternalAngularDsl.g:1032:2: ( rule__Modulo__ParametrosAssignment_9_0 )
            // InternalAngularDsl.g:1032:3: rule__Modulo__ParametrosAssignment_9_0
            {
            pushFollow(FOLLOW_2);
            rule__Modulo__ParametrosAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getModuloAccess().getParametrosAssignment_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_9__0__Impl"


    // $ANTLR start "rule__Modulo__Group_9__1"
    // InternalAngularDsl.g:1040:1: rule__Modulo__Group_9__1 : rule__Modulo__Group_9__1__Impl ;
    public final void rule__Modulo__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1044:1: ( rule__Modulo__Group_9__1__Impl )
            // InternalAngularDsl.g:1045:2: rule__Modulo__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modulo__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_9__1"


    // $ANTLR start "rule__Modulo__Group_9__1__Impl"
    // InternalAngularDsl.g:1051:1: rule__Modulo__Group_9__1__Impl : ( ( rule__Modulo__Group_9_1__0 )* ) ;
    public final void rule__Modulo__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1055:1: ( ( ( rule__Modulo__Group_9_1__0 )* ) )
            // InternalAngularDsl.g:1056:1: ( ( rule__Modulo__Group_9_1__0 )* )
            {
            // InternalAngularDsl.g:1056:1: ( ( rule__Modulo__Group_9_1__0 )* )
            // InternalAngularDsl.g:1057:2: ( rule__Modulo__Group_9_1__0 )*
            {
             before(grammarAccess.getModuloAccess().getGroup_9_1()); 
            // InternalAngularDsl.g:1058:2: ( rule__Modulo__Group_9_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAngularDsl.g:1058:3: rule__Modulo__Group_9_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Modulo__Group_9_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModuloAccess().getGroup_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_9__1__Impl"


    // $ANTLR start "rule__Modulo__Group_9_1__0"
    // InternalAngularDsl.g:1067:1: rule__Modulo__Group_9_1__0 : rule__Modulo__Group_9_1__0__Impl rule__Modulo__Group_9_1__1 ;
    public final void rule__Modulo__Group_9_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1071:1: ( rule__Modulo__Group_9_1__0__Impl rule__Modulo__Group_9_1__1 )
            // InternalAngularDsl.g:1072:2: rule__Modulo__Group_9_1__0__Impl rule__Modulo__Group_9_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Modulo__Group_9_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group_9_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_9_1__0"


    // $ANTLR start "rule__Modulo__Group_9_1__0__Impl"
    // InternalAngularDsl.g:1079:1: rule__Modulo__Group_9_1__0__Impl : ( RULE_COMA ) ;
    public final void rule__Modulo__Group_9_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1083:1: ( ( RULE_COMA ) )
            // InternalAngularDsl.g:1084:1: ( RULE_COMA )
            {
            // InternalAngularDsl.g:1084:1: ( RULE_COMA )
            // InternalAngularDsl.g:1085:2: RULE_COMA
            {
             before(grammarAccess.getModuloAccess().getCOMATerminalRuleCall_9_1_0()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getModuloAccess().getCOMATerminalRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_9_1__0__Impl"


    // $ANTLR start "rule__Modulo__Group_9_1__1"
    // InternalAngularDsl.g:1094:1: rule__Modulo__Group_9_1__1 : rule__Modulo__Group_9_1__1__Impl ;
    public final void rule__Modulo__Group_9_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1098:1: ( rule__Modulo__Group_9_1__1__Impl )
            // InternalAngularDsl.g:1099:2: rule__Modulo__Group_9_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modulo__Group_9_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_9_1__1"


    // $ANTLR start "rule__Modulo__Group_9_1__1__Impl"
    // InternalAngularDsl.g:1105:1: rule__Modulo__Group_9_1__1__Impl : ( ( rule__Modulo__ParametrosAssignment_9_1_1 ) ) ;
    public final void rule__Modulo__Group_9_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1109:1: ( ( ( rule__Modulo__ParametrosAssignment_9_1_1 ) ) )
            // InternalAngularDsl.g:1110:1: ( ( rule__Modulo__ParametrosAssignment_9_1_1 ) )
            {
            // InternalAngularDsl.g:1110:1: ( ( rule__Modulo__ParametrosAssignment_9_1_1 ) )
            // InternalAngularDsl.g:1111:2: ( rule__Modulo__ParametrosAssignment_9_1_1 )
            {
             before(grammarAccess.getModuloAccess().getParametrosAssignment_9_1_1()); 
            // InternalAngularDsl.g:1112:2: ( rule__Modulo__ParametrosAssignment_9_1_1 )
            // InternalAngularDsl.g:1112:3: rule__Modulo__ParametrosAssignment_9_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Modulo__ParametrosAssignment_9_1_1();

            state._fsp--;


            }

             after(grammarAccess.getModuloAccess().getParametrosAssignment_9_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_9_1__1__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // InternalAngularDsl.g:1121:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1125:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalAngularDsl.g:1126:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // InternalAngularDsl.g:1133:1: rule__Service__Group__0__Impl : ( () ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1137:1: ( ( () ) )
            // InternalAngularDsl.g:1138:1: ( () )
            {
            // InternalAngularDsl.g:1138:1: ( () )
            // InternalAngularDsl.g:1139:2: ()
            {
             before(grammarAccess.getServiceAccess().getServiceAction_0()); 
            // InternalAngularDsl.g:1140:2: ()
            // InternalAngularDsl.g:1140:3: 
            {
            }

             after(grammarAccess.getServiceAccess().getServiceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // InternalAngularDsl.g:1148:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1152:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalAngularDsl.g:1153:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // InternalAngularDsl.g:1160:1: rule__Service__Group__1__Impl : ( ( rule__Service__Group_1__0 )? ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1164:1: ( ( ( rule__Service__Group_1__0 )? ) )
            // InternalAngularDsl.g:1165:1: ( ( rule__Service__Group_1__0 )? )
            {
            // InternalAngularDsl.g:1165:1: ( ( rule__Service__Group_1__0 )? )
            // InternalAngularDsl.g:1166:2: ( rule__Service__Group_1__0 )?
            {
             before(grammarAccess.getServiceAccess().getGroup_1()); 
            // InternalAngularDsl.g:1167:2: ( rule__Service__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_COMILLAS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAngularDsl.g:1167:3: rule__Service__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Service__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // InternalAngularDsl.g:1175:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1179:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalAngularDsl.g:1180:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // InternalAngularDsl.g:1187:1: rule__Service__Group__2__Impl : ( RULE_ANGULAR ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1191:1: ( ( RULE_ANGULAR ) )
            // InternalAngularDsl.g:1192:1: ( RULE_ANGULAR )
            {
            // InternalAngularDsl.g:1192:1: ( RULE_ANGULAR )
            // InternalAngularDsl.g:1193:2: RULE_ANGULAR
            {
             before(grammarAccess.getServiceAccess().getANGULARTerminalRuleCall_2()); 
            match(input,RULE_ANGULAR,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getANGULARTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // InternalAngularDsl.g:1202:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1206:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalAngularDsl.g:1207:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // InternalAngularDsl.g:1214:1: rule__Service__Group__3__Impl : ( RULE_PUNTO ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1218:1: ( ( RULE_PUNTO ) )
            // InternalAngularDsl.g:1219:1: ( RULE_PUNTO )
            {
            // InternalAngularDsl.g:1219:1: ( RULE_PUNTO )
            // InternalAngularDsl.g:1220:2: RULE_PUNTO
            {
             before(grammarAccess.getServiceAccess().getPUNTOTerminalRuleCall_3()); 
            match(input,RULE_PUNTO,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getPUNTOTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // InternalAngularDsl.g:1229:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1233:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalAngularDsl.g:1234:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // InternalAngularDsl.g:1241:1: rule__Service__Group__4__Impl : ( RULE_MODULE ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1245:1: ( ( RULE_MODULE ) )
            // InternalAngularDsl.g:1246:1: ( RULE_MODULE )
            {
            // InternalAngularDsl.g:1246:1: ( RULE_MODULE )
            // InternalAngularDsl.g:1247:2: RULE_MODULE
            {
             before(grammarAccess.getServiceAccess().getMODULETerminalRuleCall_4()); 
            match(input,RULE_MODULE,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getMODULETerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // InternalAngularDsl.g:1256:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1260:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalAngularDsl.g:1261:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Service__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // InternalAngularDsl.g:1268:1: rule__Service__Group__5__Impl : ( RULE_PARENTESIS_IZQUIERDO ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1272:1: ( ( RULE_PARENTESIS_IZQUIERDO ) )
            // InternalAngularDsl.g:1273:1: ( RULE_PARENTESIS_IZQUIERDO )
            {
            // InternalAngularDsl.g:1273:1: ( RULE_PARENTESIS_IZQUIERDO )
            // InternalAngularDsl.g:1274:2: RULE_PARENTESIS_IZQUIERDO
            {
             before(grammarAccess.getServiceAccess().getPARENTESIS_IZQUIERDOTerminalRuleCall_5()); 
            match(input,RULE_PARENTESIS_IZQUIERDO,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getPARENTESIS_IZQUIERDOTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group__6"
    // InternalAngularDsl.g:1283:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1287:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // InternalAngularDsl.g:1288:2: rule__Service__Group__6__Impl rule__Service__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Service__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6"


    // $ANTLR start "rule__Service__Group__6__Impl"
    // InternalAngularDsl.g:1295:1: rule__Service__Group__6__Impl : ( ( rule__Service__ModuloAssignment_6 ) ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1299:1: ( ( ( rule__Service__ModuloAssignment_6 ) ) )
            // InternalAngularDsl.g:1300:1: ( ( rule__Service__ModuloAssignment_6 ) )
            {
            // InternalAngularDsl.g:1300:1: ( ( rule__Service__ModuloAssignment_6 ) )
            // InternalAngularDsl.g:1301:2: ( rule__Service__ModuloAssignment_6 )
            {
             before(grammarAccess.getServiceAccess().getModuloAssignment_6()); 
            // InternalAngularDsl.g:1302:2: ( rule__Service__ModuloAssignment_6 )
            // InternalAngularDsl.g:1302:3: rule__Service__ModuloAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Service__ModuloAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getModuloAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6__Impl"


    // $ANTLR start "rule__Service__Group__7"
    // InternalAngularDsl.g:1310:1: rule__Service__Group__7 : rule__Service__Group__7__Impl rule__Service__Group__8 ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1314:1: ( rule__Service__Group__7__Impl rule__Service__Group__8 )
            // InternalAngularDsl.g:1315:2: rule__Service__Group__7__Impl rule__Service__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Service__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__7"


    // $ANTLR start "rule__Service__Group__7__Impl"
    // InternalAngularDsl.g:1322:1: rule__Service__Group__7__Impl : ( RULE_PARENTESIS_DERECHO ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1326:1: ( ( RULE_PARENTESIS_DERECHO ) )
            // InternalAngularDsl.g:1327:1: ( RULE_PARENTESIS_DERECHO )
            {
            // InternalAngularDsl.g:1327:1: ( RULE_PARENTESIS_DERECHO )
            // InternalAngularDsl.g:1328:2: RULE_PARENTESIS_DERECHO
            {
             before(grammarAccess.getServiceAccess().getPARENTESIS_DERECHOTerminalRuleCall_7()); 
            match(input,RULE_PARENTESIS_DERECHO,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getPARENTESIS_DERECHOTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__7__Impl"


    // $ANTLR start "rule__Service__Group__8"
    // InternalAngularDsl.g:1337:1: rule__Service__Group__8 : rule__Service__Group__8__Impl rule__Service__Group__9 ;
    public final void rule__Service__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1341:1: ( rule__Service__Group__8__Impl rule__Service__Group__9 )
            // InternalAngularDsl.g:1342:2: rule__Service__Group__8__Impl rule__Service__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__Service__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__8"


    // $ANTLR start "rule__Service__Group__8__Impl"
    // InternalAngularDsl.g:1349:1: rule__Service__Group__8__Impl : ( RULE_PUNTO ) ;
    public final void rule__Service__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1353:1: ( ( RULE_PUNTO ) )
            // InternalAngularDsl.g:1354:1: ( RULE_PUNTO )
            {
            // InternalAngularDsl.g:1354:1: ( RULE_PUNTO )
            // InternalAngularDsl.g:1355:2: RULE_PUNTO
            {
             before(grammarAccess.getServiceAccess().getPUNTOTerminalRuleCall_8()); 
            match(input,RULE_PUNTO,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getPUNTOTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__8__Impl"


    // $ANTLR start "rule__Service__Group__9"
    // InternalAngularDsl.g:1364:1: rule__Service__Group__9 : rule__Service__Group__9__Impl rule__Service__Group__10 ;
    public final void rule__Service__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1368:1: ( rule__Service__Group__9__Impl rule__Service__Group__10 )
            // InternalAngularDsl.g:1369:2: rule__Service__Group__9__Impl rule__Service__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__Service__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__9"


    // $ANTLR start "rule__Service__Group__9__Impl"
    // InternalAngularDsl.g:1376:1: rule__Service__Group__9__Impl : ( 'factory' ) ;
    public final void rule__Service__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1380:1: ( ( 'factory' ) )
            // InternalAngularDsl.g:1381:1: ( 'factory' )
            {
            // InternalAngularDsl.g:1381:1: ( 'factory' )
            // InternalAngularDsl.g:1382:2: 'factory'
            {
             before(grammarAccess.getServiceAccess().getFactoryKeyword_9()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getFactoryKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__9__Impl"


    // $ANTLR start "rule__Service__Group__10"
    // InternalAngularDsl.g:1391:1: rule__Service__Group__10 : rule__Service__Group__10__Impl rule__Service__Group__11 ;
    public final void rule__Service__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1395:1: ( rule__Service__Group__10__Impl rule__Service__Group__11 )
            // InternalAngularDsl.g:1396:2: rule__Service__Group__10__Impl rule__Service__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__Service__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__10"


    // $ANTLR start "rule__Service__Group__10__Impl"
    // InternalAngularDsl.g:1403:1: rule__Service__Group__10__Impl : ( RULE_PARENTESIS_IZQUIERDO ) ;
    public final void rule__Service__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1407:1: ( ( RULE_PARENTESIS_IZQUIERDO ) )
            // InternalAngularDsl.g:1408:1: ( RULE_PARENTESIS_IZQUIERDO )
            {
            // InternalAngularDsl.g:1408:1: ( RULE_PARENTESIS_IZQUIERDO )
            // InternalAngularDsl.g:1409:2: RULE_PARENTESIS_IZQUIERDO
            {
             before(grammarAccess.getServiceAccess().getPARENTESIS_IZQUIERDOTerminalRuleCall_10()); 
            match(input,RULE_PARENTESIS_IZQUIERDO,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getPARENTESIS_IZQUIERDOTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__10__Impl"


    // $ANTLR start "rule__Service__Group__11"
    // InternalAngularDsl.g:1418:1: rule__Service__Group__11 : rule__Service__Group__11__Impl rule__Service__Group__12 ;
    public final void rule__Service__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1422:1: ( rule__Service__Group__11__Impl rule__Service__Group__12 )
            // InternalAngularDsl.g:1423:2: rule__Service__Group__11__Impl rule__Service__Group__12
            {
            pushFollow(FOLLOW_8);
            rule__Service__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__11"


    // $ANTLR start "rule__Service__Group__11__Impl"
    // InternalAngularDsl.g:1430:1: rule__Service__Group__11__Impl : ( ( rule__Service__NameAssignment_11 ) ) ;
    public final void rule__Service__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1434:1: ( ( ( rule__Service__NameAssignment_11 ) ) )
            // InternalAngularDsl.g:1435:1: ( ( rule__Service__NameAssignment_11 ) )
            {
            // InternalAngularDsl.g:1435:1: ( ( rule__Service__NameAssignment_11 ) )
            // InternalAngularDsl.g:1436:2: ( rule__Service__NameAssignment_11 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_11()); 
            // InternalAngularDsl.g:1437:2: ( rule__Service__NameAssignment_11 )
            // InternalAngularDsl.g:1437:3: rule__Service__NameAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Service__NameAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getNameAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__11__Impl"


    // $ANTLR start "rule__Service__Group__12"
    // InternalAngularDsl.g:1445:1: rule__Service__Group__12 : rule__Service__Group__12__Impl rule__Service__Group__13 ;
    public final void rule__Service__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1449:1: ( rule__Service__Group__12__Impl rule__Service__Group__13 )
            // InternalAngularDsl.g:1450:2: rule__Service__Group__12__Impl rule__Service__Group__13
            {
            pushFollow(FOLLOW_9);
            rule__Service__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__12"


    // $ANTLR start "rule__Service__Group__12__Impl"
    // InternalAngularDsl.g:1457:1: rule__Service__Group__12__Impl : ( RULE_COMA ) ;
    public final void rule__Service__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1461:1: ( ( RULE_COMA ) )
            // InternalAngularDsl.g:1462:1: ( RULE_COMA )
            {
            // InternalAngularDsl.g:1462:1: ( RULE_COMA )
            // InternalAngularDsl.g:1463:2: RULE_COMA
            {
             before(grammarAccess.getServiceAccess().getCOMATerminalRuleCall_12()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getCOMATerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__12__Impl"


    // $ANTLR start "rule__Service__Group__13"
    // InternalAngularDsl.g:1472:1: rule__Service__Group__13 : rule__Service__Group__13__Impl rule__Service__Group__14 ;
    public final void rule__Service__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1476:1: ( rule__Service__Group__13__Impl rule__Service__Group__14 )
            // InternalAngularDsl.g:1477:2: rule__Service__Group__13__Impl rule__Service__Group__14
            {
            pushFollow(FOLLOW_19);
            rule__Service__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__13"


    // $ANTLR start "rule__Service__Group__13__Impl"
    // InternalAngularDsl.g:1484:1: rule__Service__Group__13__Impl : ( RULE_PARENTESIS_CUADRADO_IZQUIERDO ) ;
    public final void rule__Service__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1488:1: ( ( RULE_PARENTESIS_CUADRADO_IZQUIERDO ) )
            // InternalAngularDsl.g:1489:1: ( RULE_PARENTESIS_CUADRADO_IZQUIERDO )
            {
            // InternalAngularDsl.g:1489:1: ( RULE_PARENTESIS_CUADRADO_IZQUIERDO )
            // InternalAngularDsl.g:1490:2: RULE_PARENTESIS_CUADRADO_IZQUIERDO
            {
             before(grammarAccess.getServiceAccess().getPARENTESIS_CUADRADO_IZQUIERDOTerminalRuleCall_13()); 
            match(input,RULE_PARENTESIS_CUADRADO_IZQUIERDO,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getPARENTESIS_CUADRADO_IZQUIERDOTerminalRuleCall_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__13__Impl"


    // $ANTLR start "rule__Service__Group__14"
    // InternalAngularDsl.g:1499:1: rule__Service__Group__14 : rule__Service__Group__14__Impl rule__Service__Group__15 ;
    public final void rule__Service__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1503:1: ( rule__Service__Group__14__Impl rule__Service__Group__15 )
            // InternalAngularDsl.g:1504:2: rule__Service__Group__14__Impl rule__Service__Group__15
            {
            pushFollow(FOLLOW_19);
            rule__Service__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__14"


    // $ANTLR start "rule__Service__Group__14__Impl"
    // InternalAngularDsl.g:1511:1: rule__Service__Group__14__Impl : ( ( rule__Service__Group_14__0 )* ) ;
    public final void rule__Service__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1515:1: ( ( ( rule__Service__Group_14__0 )* ) )
            // InternalAngularDsl.g:1516:1: ( ( rule__Service__Group_14__0 )* )
            {
            // InternalAngularDsl.g:1516:1: ( ( rule__Service__Group_14__0 )* )
            // InternalAngularDsl.g:1517:2: ( rule__Service__Group_14__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_14()); 
            // InternalAngularDsl.g:1518:2: ( rule__Service__Group_14__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAngularDsl.g:1518:3: rule__Service__Group_14__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Service__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__14__Impl"


    // $ANTLR start "rule__Service__Group__15"
    // InternalAngularDsl.g:1526:1: rule__Service__Group__15 : rule__Service__Group__15__Impl rule__Service__Group__16 ;
    public final void rule__Service__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1530:1: ( rule__Service__Group__15__Impl rule__Service__Group__16 )
            // InternalAngularDsl.g:1531:2: rule__Service__Group__15__Impl rule__Service__Group__16
            {
            pushFollow(FOLLOW_20);
            rule__Service__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__15"


    // $ANTLR start "rule__Service__Group__15__Impl"
    // InternalAngularDsl.g:1538:1: rule__Service__Group__15__Impl : ( RULE_COMA ) ;
    public final void rule__Service__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1542:1: ( ( RULE_COMA ) )
            // InternalAngularDsl.g:1543:1: ( RULE_COMA )
            {
            // InternalAngularDsl.g:1543:1: ( RULE_COMA )
            // InternalAngularDsl.g:1544:2: RULE_COMA
            {
             before(grammarAccess.getServiceAccess().getCOMATerminalRuleCall_15()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getCOMATerminalRuleCall_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__15__Impl"


    // $ANTLR start "rule__Service__Group__16"
    // InternalAngularDsl.g:1553:1: rule__Service__Group__16 : rule__Service__Group__16__Impl rule__Service__Group__17 ;
    public final void rule__Service__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1557:1: ( rule__Service__Group__16__Impl rule__Service__Group__17 )
            // InternalAngularDsl.g:1558:2: rule__Service__Group__16__Impl rule__Service__Group__17
            {
            pushFollow(FOLLOW_21);
            rule__Service__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__16"


    // $ANTLR start "rule__Service__Group__16__Impl"
    // InternalAngularDsl.g:1565:1: rule__Service__Group__16__Impl : ( ( rule__Service__FuncionAssignment_16 ) ) ;
    public final void rule__Service__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1569:1: ( ( ( rule__Service__FuncionAssignment_16 ) ) )
            // InternalAngularDsl.g:1570:1: ( ( rule__Service__FuncionAssignment_16 ) )
            {
            // InternalAngularDsl.g:1570:1: ( ( rule__Service__FuncionAssignment_16 ) )
            // InternalAngularDsl.g:1571:2: ( rule__Service__FuncionAssignment_16 )
            {
             before(grammarAccess.getServiceAccess().getFuncionAssignment_16()); 
            // InternalAngularDsl.g:1572:2: ( rule__Service__FuncionAssignment_16 )
            // InternalAngularDsl.g:1572:3: rule__Service__FuncionAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__Service__FuncionAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getFuncionAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__16__Impl"


    // $ANTLR start "rule__Service__Group__17"
    // InternalAngularDsl.g:1580:1: rule__Service__Group__17 : rule__Service__Group__17__Impl rule__Service__Group__18 ;
    public final void rule__Service__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1584:1: ( rule__Service__Group__17__Impl rule__Service__Group__18 )
            // InternalAngularDsl.g:1585:2: rule__Service__Group__17__Impl rule__Service__Group__18
            {
            pushFollow(FOLLOW_12);
            rule__Service__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__17"


    // $ANTLR start "rule__Service__Group__17__Impl"
    // InternalAngularDsl.g:1592:1: rule__Service__Group__17__Impl : ( RULE_PARENTESIS_CUADRADO_DERECHO ) ;
    public final void rule__Service__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1596:1: ( ( RULE_PARENTESIS_CUADRADO_DERECHO ) )
            // InternalAngularDsl.g:1597:1: ( RULE_PARENTESIS_CUADRADO_DERECHO )
            {
            // InternalAngularDsl.g:1597:1: ( RULE_PARENTESIS_CUADRADO_DERECHO )
            // InternalAngularDsl.g:1598:2: RULE_PARENTESIS_CUADRADO_DERECHO
            {
             before(grammarAccess.getServiceAccess().getPARENTESIS_CUADRADO_DERECHOTerminalRuleCall_17()); 
            match(input,RULE_PARENTESIS_CUADRADO_DERECHO,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getPARENTESIS_CUADRADO_DERECHOTerminalRuleCall_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__17__Impl"


    // $ANTLR start "rule__Service__Group__18"
    // InternalAngularDsl.g:1607:1: rule__Service__Group__18 : rule__Service__Group__18__Impl rule__Service__Group__19 ;
    public final void rule__Service__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1611:1: ( rule__Service__Group__18__Impl rule__Service__Group__19 )
            // InternalAngularDsl.g:1612:2: rule__Service__Group__18__Impl rule__Service__Group__19
            {
            pushFollow(FOLLOW_13);
            rule__Service__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__18"


    // $ANTLR start "rule__Service__Group__18__Impl"
    // InternalAngularDsl.g:1619:1: rule__Service__Group__18__Impl : ( RULE_PARENTESIS_DERECHO ) ;
    public final void rule__Service__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1623:1: ( ( RULE_PARENTESIS_DERECHO ) )
            // InternalAngularDsl.g:1624:1: ( RULE_PARENTESIS_DERECHO )
            {
            // InternalAngularDsl.g:1624:1: ( RULE_PARENTESIS_DERECHO )
            // InternalAngularDsl.g:1625:2: RULE_PARENTESIS_DERECHO
            {
             before(grammarAccess.getServiceAccess().getPARENTESIS_DERECHOTerminalRuleCall_18()); 
            match(input,RULE_PARENTESIS_DERECHO,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getPARENTESIS_DERECHOTerminalRuleCall_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__18__Impl"


    // $ANTLR start "rule__Service__Group__19"
    // InternalAngularDsl.g:1634:1: rule__Service__Group__19 : rule__Service__Group__19__Impl ;
    public final void rule__Service__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1638:1: ( rule__Service__Group__19__Impl )
            // InternalAngularDsl.g:1639:2: rule__Service__Group__19__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__19__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__19"


    // $ANTLR start "rule__Service__Group__19__Impl"
    // InternalAngularDsl.g:1645:1: rule__Service__Group__19__Impl : ( RULE_PUNTO_Y_COMA ) ;
    public final void rule__Service__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1649:1: ( ( RULE_PUNTO_Y_COMA ) )
            // InternalAngularDsl.g:1650:1: ( RULE_PUNTO_Y_COMA )
            {
            // InternalAngularDsl.g:1650:1: ( RULE_PUNTO_Y_COMA )
            // InternalAngularDsl.g:1651:2: RULE_PUNTO_Y_COMA
            {
             before(grammarAccess.getServiceAccess().getPUNTO_Y_COMATerminalRuleCall_19()); 
            match(input,RULE_PUNTO_Y_COMA,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getPUNTO_Y_COMATerminalRuleCall_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__19__Impl"


    // $ANTLR start "rule__Service__Group_1__0"
    // InternalAngularDsl.g:1661:1: rule__Service__Group_1__0 : rule__Service__Group_1__0__Impl rule__Service__Group_1__1 ;
    public final void rule__Service__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1665:1: ( rule__Service__Group_1__0__Impl rule__Service__Group_1__1 )
            // InternalAngularDsl.g:1666:2: rule__Service__Group_1__0__Impl rule__Service__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Service__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__0"


    // $ANTLR start "rule__Service__Group_1__0__Impl"
    // InternalAngularDsl.g:1673:1: rule__Service__Group_1__0__Impl : ( RULE_COMILLAS ) ;
    public final void rule__Service__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1677:1: ( ( RULE_COMILLAS ) )
            // InternalAngularDsl.g:1678:1: ( RULE_COMILLAS )
            {
            // InternalAngularDsl.g:1678:1: ( RULE_COMILLAS )
            // InternalAngularDsl.g:1679:2: RULE_COMILLAS
            {
             before(grammarAccess.getServiceAccess().getCOMILLASTerminalRuleCall_1_0()); 
            match(input,RULE_COMILLAS,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getCOMILLASTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__0__Impl"


    // $ANTLR start "rule__Service__Group_1__1"
    // InternalAngularDsl.g:1688:1: rule__Service__Group_1__1 : rule__Service__Group_1__1__Impl rule__Service__Group_1__2 ;
    public final void rule__Service__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1692:1: ( rule__Service__Group_1__1__Impl rule__Service__Group_1__2 )
            // InternalAngularDsl.g:1693:2: rule__Service__Group_1__1__Impl rule__Service__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Service__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__1"


    // $ANTLR start "rule__Service__Group_1__1__Impl"
    // InternalAngularDsl.g:1700:1: rule__Service__Group_1__1__Impl : ( RULE_USE ) ;
    public final void rule__Service__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1704:1: ( ( RULE_USE ) )
            // InternalAngularDsl.g:1705:1: ( RULE_USE )
            {
            // InternalAngularDsl.g:1705:1: ( RULE_USE )
            // InternalAngularDsl.g:1706:2: RULE_USE
            {
             before(grammarAccess.getServiceAccess().getUSETerminalRuleCall_1_1()); 
            match(input,RULE_USE,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getUSETerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__1__Impl"


    // $ANTLR start "rule__Service__Group_1__2"
    // InternalAngularDsl.g:1715:1: rule__Service__Group_1__2 : rule__Service__Group_1__2__Impl rule__Service__Group_1__3 ;
    public final void rule__Service__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1719:1: ( rule__Service__Group_1__2__Impl rule__Service__Group_1__3 )
            // InternalAngularDsl.g:1720:2: rule__Service__Group_1__2__Impl rule__Service__Group_1__3
            {
            pushFollow(FOLLOW_16);
            rule__Service__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__2"


    // $ANTLR start "rule__Service__Group_1__2__Impl"
    // InternalAngularDsl.g:1727:1: rule__Service__Group_1__2__Impl : ( RULE_STRICT ) ;
    public final void rule__Service__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1731:1: ( ( RULE_STRICT ) )
            // InternalAngularDsl.g:1732:1: ( RULE_STRICT )
            {
            // InternalAngularDsl.g:1732:1: ( RULE_STRICT )
            // InternalAngularDsl.g:1733:2: RULE_STRICT
            {
             before(grammarAccess.getServiceAccess().getSTRICTTerminalRuleCall_1_2()); 
            match(input,RULE_STRICT,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getSTRICTTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__2__Impl"


    // $ANTLR start "rule__Service__Group_1__3"
    // InternalAngularDsl.g:1742:1: rule__Service__Group_1__3 : rule__Service__Group_1__3__Impl rule__Service__Group_1__4 ;
    public final void rule__Service__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1746:1: ( rule__Service__Group_1__3__Impl rule__Service__Group_1__4 )
            // InternalAngularDsl.g:1747:2: rule__Service__Group_1__3__Impl rule__Service__Group_1__4
            {
            pushFollow(FOLLOW_13);
            rule__Service__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__3"


    // $ANTLR start "rule__Service__Group_1__3__Impl"
    // InternalAngularDsl.g:1754:1: rule__Service__Group_1__3__Impl : ( RULE_COMILLAS ) ;
    public final void rule__Service__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1758:1: ( ( RULE_COMILLAS ) )
            // InternalAngularDsl.g:1759:1: ( RULE_COMILLAS )
            {
            // InternalAngularDsl.g:1759:1: ( RULE_COMILLAS )
            // InternalAngularDsl.g:1760:2: RULE_COMILLAS
            {
             before(grammarAccess.getServiceAccess().getCOMILLASTerminalRuleCall_1_3()); 
            match(input,RULE_COMILLAS,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getCOMILLASTerminalRuleCall_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__3__Impl"


    // $ANTLR start "rule__Service__Group_1__4"
    // InternalAngularDsl.g:1769:1: rule__Service__Group_1__4 : rule__Service__Group_1__4__Impl ;
    public final void rule__Service__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1773:1: ( rule__Service__Group_1__4__Impl )
            // InternalAngularDsl.g:1774:2: rule__Service__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__4"


    // $ANTLR start "rule__Service__Group_1__4__Impl"
    // InternalAngularDsl.g:1780:1: rule__Service__Group_1__4__Impl : ( RULE_PUNTO_Y_COMA ) ;
    public final void rule__Service__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1784:1: ( ( RULE_PUNTO_Y_COMA ) )
            // InternalAngularDsl.g:1785:1: ( RULE_PUNTO_Y_COMA )
            {
            // InternalAngularDsl.g:1785:1: ( RULE_PUNTO_Y_COMA )
            // InternalAngularDsl.g:1786:2: RULE_PUNTO_Y_COMA
            {
             before(grammarAccess.getServiceAccess().getPUNTO_Y_COMATerminalRuleCall_1_4()); 
            match(input,RULE_PUNTO_Y_COMA,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getPUNTO_Y_COMATerminalRuleCall_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_1__4__Impl"


    // $ANTLR start "rule__Service__Group_14__0"
    // InternalAngularDsl.g:1796:1: rule__Service__Group_14__0 : rule__Service__Group_14__0__Impl rule__Service__Group_14__1 ;
    public final void rule__Service__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1800:1: ( rule__Service__Group_14__0__Impl rule__Service__Group_14__1 )
            // InternalAngularDsl.g:1801:2: rule__Service__Group_14__0__Impl rule__Service__Group_14__1
            {
            pushFollow(FOLLOW_8);
            rule__Service__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_14__0"


    // $ANTLR start "rule__Service__Group_14__0__Impl"
    // InternalAngularDsl.g:1808:1: rule__Service__Group_14__0__Impl : ( ( rule__Service__ParametrosAssignment_14_0 ) ) ;
    public final void rule__Service__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1812:1: ( ( ( rule__Service__ParametrosAssignment_14_0 ) ) )
            // InternalAngularDsl.g:1813:1: ( ( rule__Service__ParametrosAssignment_14_0 ) )
            {
            // InternalAngularDsl.g:1813:1: ( ( rule__Service__ParametrosAssignment_14_0 ) )
            // InternalAngularDsl.g:1814:2: ( rule__Service__ParametrosAssignment_14_0 )
            {
             before(grammarAccess.getServiceAccess().getParametrosAssignment_14_0()); 
            // InternalAngularDsl.g:1815:2: ( rule__Service__ParametrosAssignment_14_0 )
            // InternalAngularDsl.g:1815:3: rule__Service__ParametrosAssignment_14_0
            {
            pushFollow(FOLLOW_2);
            rule__Service__ParametrosAssignment_14_0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getParametrosAssignment_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_14__0__Impl"


    // $ANTLR start "rule__Service__Group_14__1"
    // InternalAngularDsl.g:1823:1: rule__Service__Group_14__1 : rule__Service__Group_14__1__Impl ;
    public final void rule__Service__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1827:1: ( rule__Service__Group_14__1__Impl )
            // InternalAngularDsl.g:1828:2: rule__Service__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_14__1"


    // $ANTLR start "rule__Service__Group_14__1__Impl"
    // InternalAngularDsl.g:1834:1: rule__Service__Group_14__1__Impl : ( ( rule__Service__Group_14_1__0 )* ) ;
    public final void rule__Service__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1838:1: ( ( ( rule__Service__Group_14_1__0 )* ) )
            // InternalAngularDsl.g:1839:1: ( ( rule__Service__Group_14_1__0 )* )
            {
            // InternalAngularDsl.g:1839:1: ( ( rule__Service__Group_14_1__0 )* )
            // InternalAngularDsl.g:1840:2: ( rule__Service__Group_14_1__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_14_1()); 
            // InternalAngularDsl.g:1841:2: ( rule__Service__Group_14_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_COMA) ) {
                    int LA9_1 = input.LA(2);

                    if ( ((LA9_1>=RULE_STRING && LA9_1<=RULE_ID)) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalAngularDsl.g:1841:3: rule__Service__Group_14_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Service__Group_14_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getGroup_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_14__1__Impl"


    // $ANTLR start "rule__Service__Group_14_1__0"
    // InternalAngularDsl.g:1850:1: rule__Service__Group_14_1__0 : rule__Service__Group_14_1__0__Impl rule__Service__Group_14_1__1 ;
    public final void rule__Service__Group_14_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1854:1: ( rule__Service__Group_14_1__0__Impl rule__Service__Group_14_1__1 )
            // InternalAngularDsl.g:1855:2: rule__Service__Group_14_1__0__Impl rule__Service__Group_14_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Service__Group_14_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_14_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_14_1__0"


    // $ANTLR start "rule__Service__Group_14_1__0__Impl"
    // InternalAngularDsl.g:1862:1: rule__Service__Group_14_1__0__Impl : ( RULE_COMA ) ;
    public final void rule__Service__Group_14_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1866:1: ( ( RULE_COMA ) )
            // InternalAngularDsl.g:1867:1: ( RULE_COMA )
            {
            // InternalAngularDsl.g:1867:1: ( RULE_COMA )
            // InternalAngularDsl.g:1868:2: RULE_COMA
            {
             before(grammarAccess.getServiceAccess().getCOMATerminalRuleCall_14_1_0()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getCOMATerminalRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_14_1__0__Impl"


    // $ANTLR start "rule__Service__Group_14_1__1"
    // InternalAngularDsl.g:1877:1: rule__Service__Group_14_1__1 : rule__Service__Group_14_1__1__Impl ;
    public final void rule__Service__Group_14_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1881:1: ( rule__Service__Group_14_1__1__Impl )
            // InternalAngularDsl.g:1882:2: rule__Service__Group_14_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_14_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_14_1__1"


    // $ANTLR start "rule__Service__Group_14_1__1__Impl"
    // InternalAngularDsl.g:1888:1: rule__Service__Group_14_1__1__Impl : ( ( rule__Service__ParametrosAssignment_14_1_1 ) ) ;
    public final void rule__Service__Group_14_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1892:1: ( ( ( rule__Service__ParametrosAssignment_14_1_1 ) ) )
            // InternalAngularDsl.g:1893:1: ( ( rule__Service__ParametrosAssignment_14_1_1 ) )
            {
            // InternalAngularDsl.g:1893:1: ( ( rule__Service__ParametrosAssignment_14_1_1 ) )
            // InternalAngularDsl.g:1894:2: ( rule__Service__ParametrosAssignment_14_1_1 )
            {
             before(grammarAccess.getServiceAccess().getParametrosAssignment_14_1_1()); 
            // InternalAngularDsl.g:1895:2: ( rule__Service__ParametrosAssignment_14_1_1 )
            // InternalAngularDsl.g:1895:3: rule__Service__ParametrosAssignment_14_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__ParametrosAssignment_14_1_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getParametrosAssignment_14_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_14_1__1__Impl"


    // $ANTLR start "rule__Componente__Group__0"
    // InternalAngularDsl.g:1904:1: rule__Componente__Group__0 : rule__Componente__Group__0__Impl rule__Componente__Group__1 ;
    public final void rule__Componente__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1908:1: ( rule__Componente__Group__0__Impl rule__Componente__Group__1 )
            // InternalAngularDsl.g:1909:2: rule__Componente__Group__0__Impl rule__Componente__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Componente__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__0"


    // $ANTLR start "rule__Componente__Group__0__Impl"
    // InternalAngularDsl.g:1916:1: rule__Componente__Group__0__Impl : ( () ) ;
    public final void rule__Componente__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1920:1: ( ( () ) )
            // InternalAngularDsl.g:1921:1: ( () )
            {
            // InternalAngularDsl.g:1921:1: ( () )
            // InternalAngularDsl.g:1922:2: ()
            {
             before(grammarAccess.getComponenteAccess().getComponenteAction_0()); 
            // InternalAngularDsl.g:1923:2: ()
            // InternalAngularDsl.g:1923:3: 
            {
            }

             after(grammarAccess.getComponenteAccess().getComponenteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__0__Impl"


    // $ANTLR start "rule__Componente__Group__1"
    // InternalAngularDsl.g:1931:1: rule__Componente__Group__1 : rule__Componente__Group__1__Impl rule__Componente__Group__2 ;
    public final void rule__Componente__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1935:1: ( rule__Componente__Group__1__Impl rule__Componente__Group__2 )
            // InternalAngularDsl.g:1936:2: rule__Componente__Group__1__Impl rule__Componente__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Componente__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__1"


    // $ANTLR start "rule__Componente__Group__1__Impl"
    // InternalAngularDsl.g:1943:1: rule__Componente__Group__1__Impl : ( ( rule__Componente__Group_1__0 )? ) ;
    public final void rule__Componente__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1947:1: ( ( ( rule__Componente__Group_1__0 )? ) )
            // InternalAngularDsl.g:1948:1: ( ( rule__Componente__Group_1__0 )? )
            {
            // InternalAngularDsl.g:1948:1: ( ( rule__Componente__Group_1__0 )? )
            // InternalAngularDsl.g:1949:2: ( rule__Componente__Group_1__0 )?
            {
             before(grammarAccess.getComponenteAccess().getGroup_1()); 
            // InternalAngularDsl.g:1950:2: ( rule__Componente__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_COMILLAS) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAngularDsl.g:1950:3: rule__Componente__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Componente__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponenteAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__1__Impl"


    // $ANTLR start "rule__Componente__Group__2"
    // InternalAngularDsl.g:1958:1: rule__Componente__Group__2 : rule__Componente__Group__2__Impl rule__Componente__Group__3 ;
    public final void rule__Componente__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1962:1: ( rule__Componente__Group__2__Impl rule__Componente__Group__3 )
            // InternalAngularDsl.g:1963:2: rule__Componente__Group__2__Impl rule__Componente__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Componente__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__2"


    // $ANTLR start "rule__Componente__Group__2__Impl"
    // InternalAngularDsl.g:1970:1: rule__Componente__Group__2__Impl : ( RULE_ANGULAR ) ;
    public final void rule__Componente__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1974:1: ( ( RULE_ANGULAR ) )
            // InternalAngularDsl.g:1975:1: ( RULE_ANGULAR )
            {
            // InternalAngularDsl.g:1975:1: ( RULE_ANGULAR )
            // InternalAngularDsl.g:1976:2: RULE_ANGULAR
            {
             before(grammarAccess.getComponenteAccess().getANGULARTerminalRuleCall_2()); 
            match(input,RULE_ANGULAR,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getANGULARTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__2__Impl"


    // $ANTLR start "rule__Componente__Group__3"
    // InternalAngularDsl.g:1985:1: rule__Componente__Group__3 : rule__Componente__Group__3__Impl rule__Componente__Group__4 ;
    public final void rule__Componente__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1989:1: ( rule__Componente__Group__3__Impl rule__Componente__Group__4 )
            // InternalAngularDsl.g:1990:2: rule__Componente__Group__3__Impl rule__Componente__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Componente__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__3"


    // $ANTLR start "rule__Componente__Group__3__Impl"
    // InternalAngularDsl.g:1997:1: rule__Componente__Group__3__Impl : ( RULE_PUNTO ) ;
    public final void rule__Componente__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2001:1: ( ( RULE_PUNTO ) )
            // InternalAngularDsl.g:2002:1: ( RULE_PUNTO )
            {
            // InternalAngularDsl.g:2002:1: ( RULE_PUNTO )
            // InternalAngularDsl.g:2003:2: RULE_PUNTO
            {
             before(grammarAccess.getComponenteAccess().getPUNTOTerminalRuleCall_3()); 
            match(input,RULE_PUNTO,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getPUNTOTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__3__Impl"


    // $ANTLR start "rule__Componente__Group__4"
    // InternalAngularDsl.g:2012:1: rule__Componente__Group__4 : rule__Componente__Group__4__Impl rule__Componente__Group__5 ;
    public final void rule__Componente__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2016:1: ( rule__Componente__Group__4__Impl rule__Componente__Group__5 )
            // InternalAngularDsl.g:2017:2: rule__Componente__Group__4__Impl rule__Componente__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Componente__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__4"


    // $ANTLR start "rule__Componente__Group__4__Impl"
    // InternalAngularDsl.g:2024:1: rule__Componente__Group__4__Impl : ( RULE_MODULE ) ;
    public final void rule__Componente__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2028:1: ( ( RULE_MODULE ) )
            // InternalAngularDsl.g:2029:1: ( RULE_MODULE )
            {
            // InternalAngularDsl.g:2029:1: ( RULE_MODULE )
            // InternalAngularDsl.g:2030:2: RULE_MODULE
            {
             before(grammarAccess.getComponenteAccess().getMODULETerminalRuleCall_4()); 
            match(input,RULE_MODULE,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getMODULETerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__4__Impl"


    // $ANTLR start "rule__Componente__Group__5"
    // InternalAngularDsl.g:2039:1: rule__Componente__Group__5 : rule__Componente__Group__5__Impl rule__Componente__Group__6 ;
    public final void rule__Componente__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2043:1: ( rule__Componente__Group__5__Impl rule__Componente__Group__6 )
            // InternalAngularDsl.g:2044:2: rule__Componente__Group__5__Impl rule__Componente__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Componente__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__5"


    // $ANTLR start "rule__Componente__Group__5__Impl"
    // InternalAngularDsl.g:2051:1: rule__Componente__Group__5__Impl : ( RULE_PARENTESIS_IZQUIERDO ) ;
    public final void rule__Componente__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2055:1: ( ( RULE_PARENTESIS_IZQUIERDO ) )
            // InternalAngularDsl.g:2056:1: ( RULE_PARENTESIS_IZQUIERDO )
            {
            // InternalAngularDsl.g:2056:1: ( RULE_PARENTESIS_IZQUIERDO )
            // InternalAngularDsl.g:2057:2: RULE_PARENTESIS_IZQUIERDO
            {
             before(grammarAccess.getComponenteAccess().getPARENTESIS_IZQUIERDOTerminalRuleCall_5()); 
            match(input,RULE_PARENTESIS_IZQUIERDO,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getPARENTESIS_IZQUIERDOTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__5__Impl"


    // $ANTLR start "rule__Componente__Group__6"
    // InternalAngularDsl.g:2066:1: rule__Componente__Group__6 : rule__Componente__Group__6__Impl rule__Componente__Group__7 ;
    public final void rule__Componente__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2070:1: ( rule__Componente__Group__6__Impl rule__Componente__Group__7 )
            // InternalAngularDsl.g:2071:2: rule__Componente__Group__6__Impl rule__Componente__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Componente__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__6"


    // $ANTLR start "rule__Componente__Group__6__Impl"
    // InternalAngularDsl.g:2078:1: rule__Componente__Group__6__Impl : ( ( rule__Componente__ModuloAssignment_6 ) ) ;
    public final void rule__Componente__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2082:1: ( ( ( rule__Componente__ModuloAssignment_6 ) ) )
            // InternalAngularDsl.g:2083:1: ( ( rule__Componente__ModuloAssignment_6 ) )
            {
            // InternalAngularDsl.g:2083:1: ( ( rule__Componente__ModuloAssignment_6 ) )
            // InternalAngularDsl.g:2084:2: ( rule__Componente__ModuloAssignment_6 )
            {
             before(grammarAccess.getComponenteAccess().getModuloAssignment_6()); 
            // InternalAngularDsl.g:2085:2: ( rule__Componente__ModuloAssignment_6 )
            // InternalAngularDsl.g:2085:3: rule__Componente__ModuloAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Componente__ModuloAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getComponenteAccess().getModuloAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__6__Impl"


    // $ANTLR start "rule__Componente__Group__7"
    // InternalAngularDsl.g:2093:1: rule__Componente__Group__7 : rule__Componente__Group__7__Impl rule__Componente__Group__8 ;
    public final void rule__Componente__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2097:1: ( rule__Componente__Group__7__Impl rule__Componente__Group__8 )
            // InternalAngularDsl.g:2098:2: rule__Componente__Group__7__Impl rule__Componente__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Componente__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__7"


    // $ANTLR start "rule__Componente__Group__7__Impl"
    // InternalAngularDsl.g:2105:1: rule__Componente__Group__7__Impl : ( RULE_PARENTESIS_DERECHO ) ;
    public final void rule__Componente__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2109:1: ( ( RULE_PARENTESIS_DERECHO ) )
            // InternalAngularDsl.g:2110:1: ( RULE_PARENTESIS_DERECHO )
            {
            // InternalAngularDsl.g:2110:1: ( RULE_PARENTESIS_DERECHO )
            // InternalAngularDsl.g:2111:2: RULE_PARENTESIS_DERECHO
            {
             before(grammarAccess.getComponenteAccess().getPARENTESIS_DERECHOTerminalRuleCall_7()); 
            match(input,RULE_PARENTESIS_DERECHO,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getPARENTESIS_DERECHOTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__7__Impl"


    // $ANTLR start "rule__Componente__Group__8"
    // InternalAngularDsl.g:2120:1: rule__Componente__Group__8 : rule__Componente__Group__8__Impl rule__Componente__Group__9 ;
    public final void rule__Componente__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2124:1: ( rule__Componente__Group__8__Impl rule__Componente__Group__9 )
            // InternalAngularDsl.g:2125:2: rule__Componente__Group__8__Impl rule__Componente__Group__9
            {
            pushFollow(FOLLOW_22);
            rule__Componente__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__8"


    // $ANTLR start "rule__Componente__Group__8__Impl"
    // InternalAngularDsl.g:2132:1: rule__Componente__Group__8__Impl : ( RULE_PUNTO ) ;
    public final void rule__Componente__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2136:1: ( ( RULE_PUNTO ) )
            // InternalAngularDsl.g:2137:1: ( RULE_PUNTO )
            {
            // InternalAngularDsl.g:2137:1: ( RULE_PUNTO )
            // InternalAngularDsl.g:2138:2: RULE_PUNTO
            {
             before(grammarAccess.getComponenteAccess().getPUNTOTerminalRuleCall_8()); 
            match(input,RULE_PUNTO,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getPUNTOTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__8__Impl"


    // $ANTLR start "rule__Componente__Group__9"
    // InternalAngularDsl.g:2147:1: rule__Componente__Group__9 : rule__Componente__Group__9__Impl rule__Componente__Group__10 ;
    public final void rule__Componente__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2151:1: ( rule__Componente__Group__9__Impl rule__Componente__Group__10 )
            // InternalAngularDsl.g:2152:2: rule__Componente__Group__9__Impl rule__Componente__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__Componente__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__9"


    // $ANTLR start "rule__Componente__Group__9__Impl"
    // InternalAngularDsl.g:2159:1: rule__Componente__Group__9__Impl : ( RULE_COMPONENT ) ;
    public final void rule__Componente__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2163:1: ( ( RULE_COMPONENT ) )
            // InternalAngularDsl.g:2164:1: ( RULE_COMPONENT )
            {
            // InternalAngularDsl.g:2164:1: ( RULE_COMPONENT )
            // InternalAngularDsl.g:2165:2: RULE_COMPONENT
            {
             before(grammarAccess.getComponenteAccess().getCOMPONENTTerminalRuleCall_9()); 
            match(input,RULE_COMPONENT,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getCOMPONENTTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__9__Impl"


    // $ANTLR start "rule__Componente__Group__10"
    // InternalAngularDsl.g:2174:1: rule__Componente__Group__10 : rule__Componente__Group__10__Impl rule__Componente__Group__11 ;
    public final void rule__Componente__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2178:1: ( rule__Componente__Group__10__Impl rule__Componente__Group__11 )
            // InternalAngularDsl.g:2179:2: rule__Componente__Group__10__Impl rule__Componente__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__Componente__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__10"


    // $ANTLR start "rule__Componente__Group__10__Impl"
    // InternalAngularDsl.g:2186:1: rule__Componente__Group__10__Impl : ( RULE_PARENTESIS_IZQUIERDO ) ;
    public final void rule__Componente__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2190:1: ( ( RULE_PARENTESIS_IZQUIERDO ) )
            // InternalAngularDsl.g:2191:1: ( RULE_PARENTESIS_IZQUIERDO )
            {
            // InternalAngularDsl.g:2191:1: ( RULE_PARENTESIS_IZQUIERDO )
            // InternalAngularDsl.g:2192:2: RULE_PARENTESIS_IZQUIERDO
            {
             before(grammarAccess.getComponenteAccess().getPARENTESIS_IZQUIERDOTerminalRuleCall_10()); 
            match(input,RULE_PARENTESIS_IZQUIERDO,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getPARENTESIS_IZQUIERDOTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__10__Impl"


    // $ANTLR start "rule__Componente__Group__11"
    // InternalAngularDsl.g:2201:1: rule__Componente__Group__11 : rule__Componente__Group__11__Impl rule__Componente__Group__12 ;
    public final void rule__Componente__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2205:1: ( rule__Componente__Group__11__Impl rule__Componente__Group__12 )
            // InternalAngularDsl.g:2206:2: rule__Componente__Group__11__Impl rule__Componente__Group__12
            {
            pushFollow(FOLLOW_8);
            rule__Componente__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__11"


    // $ANTLR start "rule__Componente__Group__11__Impl"
    // InternalAngularDsl.g:2213:1: rule__Componente__Group__11__Impl : ( ( rule__Componente__NameAssignment_11 ) ) ;
    public final void rule__Componente__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2217:1: ( ( ( rule__Componente__NameAssignment_11 ) ) )
            // InternalAngularDsl.g:2218:1: ( ( rule__Componente__NameAssignment_11 ) )
            {
            // InternalAngularDsl.g:2218:1: ( ( rule__Componente__NameAssignment_11 ) )
            // InternalAngularDsl.g:2219:2: ( rule__Componente__NameAssignment_11 )
            {
             before(grammarAccess.getComponenteAccess().getNameAssignment_11()); 
            // InternalAngularDsl.g:2220:2: ( rule__Componente__NameAssignment_11 )
            // InternalAngularDsl.g:2220:3: rule__Componente__NameAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Componente__NameAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getComponenteAccess().getNameAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__11__Impl"


    // $ANTLR start "rule__Componente__Group__12"
    // InternalAngularDsl.g:2228:1: rule__Componente__Group__12 : rule__Componente__Group__12__Impl rule__Componente__Group__13 ;
    public final void rule__Componente__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2232:1: ( rule__Componente__Group__12__Impl rule__Componente__Group__13 )
            // InternalAngularDsl.g:2233:2: rule__Componente__Group__12__Impl rule__Componente__Group__13
            {
            pushFollow(FOLLOW_23);
            rule__Componente__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__12"


    // $ANTLR start "rule__Componente__Group__12__Impl"
    // InternalAngularDsl.g:2240:1: rule__Componente__Group__12__Impl : ( RULE_COMA ) ;
    public final void rule__Componente__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2244:1: ( ( RULE_COMA ) )
            // InternalAngularDsl.g:2245:1: ( RULE_COMA )
            {
            // InternalAngularDsl.g:2245:1: ( RULE_COMA )
            // InternalAngularDsl.g:2246:2: RULE_COMA
            {
             before(grammarAccess.getComponenteAccess().getCOMATerminalRuleCall_12()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getCOMATerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__12__Impl"


    // $ANTLR start "rule__Componente__Group__13"
    // InternalAngularDsl.g:2255:1: rule__Componente__Group__13 : rule__Componente__Group__13__Impl rule__Componente__Group__14 ;
    public final void rule__Componente__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2259:1: ( rule__Componente__Group__13__Impl rule__Componente__Group__14 )
            // InternalAngularDsl.g:2260:2: rule__Componente__Group__13__Impl rule__Componente__Group__14
            {
            pushFollow(FOLLOW_24);
            rule__Componente__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__13"


    // $ANTLR start "rule__Componente__Group__13__Impl"
    // InternalAngularDsl.g:2267:1: rule__Componente__Group__13__Impl : ( RULE_LLAVE_IZQUIERDA ) ;
    public final void rule__Componente__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2271:1: ( ( RULE_LLAVE_IZQUIERDA ) )
            // InternalAngularDsl.g:2272:1: ( RULE_LLAVE_IZQUIERDA )
            {
            // InternalAngularDsl.g:2272:1: ( RULE_LLAVE_IZQUIERDA )
            // InternalAngularDsl.g:2273:2: RULE_LLAVE_IZQUIERDA
            {
             before(grammarAccess.getComponenteAccess().getLLAVE_IZQUIERDATerminalRuleCall_13()); 
            match(input,RULE_LLAVE_IZQUIERDA,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getLLAVE_IZQUIERDATerminalRuleCall_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__13__Impl"


    // $ANTLR start "rule__Componente__Group__14"
    // InternalAngularDsl.g:2282:1: rule__Componente__Group__14 : rule__Componente__Group__14__Impl rule__Componente__Group__15 ;
    public final void rule__Componente__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2286:1: ( rule__Componente__Group__14__Impl rule__Componente__Group__15 )
            // InternalAngularDsl.g:2287:2: rule__Componente__Group__14__Impl rule__Componente__Group__15
            {
            pushFollow(FOLLOW_25);
            rule__Componente__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__14"


    // $ANTLR start "rule__Componente__Group__14__Impl"
    // InternalAngularDsl.g:2294:1: rule__Componente__Group__14__Impl : ( RULE_TEMPLATE_URL ) ;
    public final void rule__Componente__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2298:1: ( ( RULE_TEMPLATE_URL ) )
            // InternalAngularDsl.g:2299:1: ( RULE_TEMPLATE_URL )
            {
            // InternalAngularDsl.g:2299:1: ( RULE_TEMPLATE_URL )
            // InternalAngularDsl.g:2300:2: RULE_TEMPLATE_URL
            {
             before(grammarAccess.getComponenteAccess().getTEMPLATE_URLTerminalRuleCall_14()); 
            match(input,RULE_TEMPLATE_URL,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getTEMPLATE_URLTerminalRuleCall_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__14__Impl"


    // $ANTLR start "rule__Componente__Group__15"
    // InternalAngularDsl.g:2309:1: rule__Componente__Group__15 : rule__Componente__Group__15__Impl rule__Componente__Group__16 ;
    public final void rule__Componente__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2313:1: ( rule__Componente__Group__15__Impl rule__Componente__Group__16 )
            // InternalAngularDsl.g:2314:2: rule__Componente__Group__15__Impl rule__Componente__Group__16
            {
            pushFollow(FOLLOW_7);
            rule__Componente__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__15"


    // $ANTLR start "rule__Componente__Group__15__Impl"
    // InternalAngularDsl.g:2321:1: rule__Componente__Group__15__Impl : ( RULE_DOS_PUNTOS ) ;
    public final void rule__Componente__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2325:1: ( ( RULE_DOS_PUNTOS ) )
            // InternalAngularDsl.g:2326:1: ( RULE_DOS_PUNTOS )
            {
            // InternalAngularDsl.g:2326:1: ( RULE_DOS_PUNTOS )
            // InternalAngularDsl.g:2327:2: RULE_DOS_PUNTOS
            {
             before(grammarAccess.getComponenteAccess().getDOS_PUNTOSTerminalRuleCall_15()); 
            match(input,RULE_DOS_PUNTOS,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getDOS_PUNTOSTerminalRuleCall_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__15__Impl"


    // $ANTLR start "rule__Componente__Group__16"
    // InternalAngularDsl.g:2336:1: rule__Componente__Group__16 : rule__Componente__Group__16__Impl rule__Componente__Group__17 ;
    public final void rule__Componente__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2340:1: ( rule__Componente__Group__16__Impl rule__Componente__Group__17 )
            // InternalAngularDsl.g:2341:2: rule__Componente__Group__16__Impl rule__Componente__Group__17
            {
            pushFollow(FOLLOW_8);
            rule__Componente__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__16"


    // $ANTLR start "rule__Componente__Group__16__Impl"
    // InternalAngularDsl.g:2348:1: rule__Componente__Group__16__Impl : ( ( rule__Componente__TemplateAssignment_16 ) ) ;
    public final void rule__Componente__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2352:1: ( ( ( rule__Componente__TemplateAssignment_16 ) ) )
            // InternalAngularDsl.g:2353:1: ( ( rule__Componente__TemplateAssignment_16 ) )
            {
            // InternalAngularDsl.g:2353:1: ( ( rule__Componente__TemplateAssignment_16 ) )
            // InternalAngularDsl.g:2354:2: ( rule__Componente__TemplateAssignment_16 )
            {
             before(grammarAccess.getComponenteAccess().getTemplateAssignment_16()); 
            // InternalAngularDsl.g:2355:2: ( rule__Componente__TemplateAssignment_16 )
            // InternalAngularDsl.g:2355:3: rule__Componente__TemplateAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__Componente__TemplateAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getComponenteAccess().getTemplateAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__16__Impl"


    // $ANTLR start "rule__Componente__Group__17"
    // InternalAngularDsl.g:2363:1: rule__Componente__Group__17 : rule__Componente__Group__17__Impl rule__Componente__Group__18 ;
    public final void rule__Componente__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2367:1: ( rule__Componente__Group__17__Impl rule__Componente__Group__18 )
            // InternalAngularDsl.g:2368:2: rule__Componente__Group__17__Impl rule__Componente__Group__18
            {
            pushFollow(FOLLOW_26);
            rule__Componente__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__17"


    // $ANTLR start "rule__Componente__Group__17__Impl"
    // InternalAngularDsl.g:2375:1: rule__Componente__Group__17__Impl : ( RULE_COMA ) ;
    public final void rule__Componente__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2379:1: ( ( RULE_COMA ) )
            // InternalAngularDsl.g:2380:1: ( RULE_COMA )
            {
            // InternalAngularDsl.g:2380:1: ( RULE_COMA )
            // InternalAngularDsl.g:2381:2: RULE_COMA
            {
             before(grammarAccess.getComponenteAccess().getCOMATerminalRuleCall_17()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getCOMATerminalRuleCall_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__17__Impl"


    // $ANTLR start "rule__Componente__Group__18"
    // InternalAngularDsl.g:2390:1: rule__Componente__Group__18 : rule__Componente__Group__18__Impl rule__Componente__Group__19 ;
    public final void rule__Componente__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2394:1: ( rule__Componente__Group__18__Impl rule__Componente__Group__19 )
            // InternalAngularDsl.g:2395:2: rule__Componente__Group__18__Impl rule__Componente__Group__19
            {
            pushFollow(FOLLOW_25);
            rule__Componente__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__18"


    // $ANTLR start "rule__Componente__Group__18__Impl"
    // InternalAngularDsl.g:2402:1: rule__Componente__Group__18__Impl : ( RULE_CONTROLLER ) ;
    public final void rule__Componente__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2406:1: ( ( RULE_CONTROLLER ) )
            // InternalAngularDsl.g:2407:1: ( RULE_CONTROLLER )
            {
            // InternalAngularDsl.g:2407:1: ( RULE_CONTROLLER )
            // InternalAngularDsl.g:2408:2: RULE_CONTROLLER
            {
             before(grammarAccess.getComponenteAccess().getCONTROLLERTerminalRuleCall_18()); 
            match(input,RULE_CONTROLLER,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getCONTROLLERTerminalRuleCall_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__18__Impl"


    // $ANTLR start "rule__Componente__Group__19"
    // InternalAngularDsl.g:2417:1: rule__Componente__Group__19 : rule__Componente__Group__19__Impl rule__Componente__Group__20 ;
    public final void rule__Componente__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2421:1: ( rule__Componente__Group__19__Impl rule__Componente__Group__20 )
            // InternalAngularDsl.g:2422:2: rule__Componente__Group__19__Impl rule__Componente__Group__20
            {
            pushFollow(FOLLOW_9);
            rule__Componente__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__19"


    // $ANTLR start "rule__Componente__Group__19__Impl"
    // InternalAngularDsl.g:2429:1: rule__Componente__Group__19__Impl : ( RULE_DOS_PUNTOS ) ;
    public final void rule__Componente__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2433:1: ( ( RULE_DOS_PUNTOS ) )
            // InternalAngularDsl.g:2434:1: ( RULE_DOS_PUNTOS )
            {
            // InternalAngularDsl.g:2434:1: ( RULE_DOS_PUNTOS )
            // InternalAngularDsl.g:2435:2: RULE_DOS_PUNTOS
            {
             before(grammarAccess.getComponenteAccess().getDOS_PUNTOSTerminalRuleCall_19()); 
            match(input,RULE_DOS_PUNTOS,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getDOS_PUNTOSTerminalRuleCall_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__19__Impl"


    // $ANTLR start "rule__Componente__Group__20"
    // InternalAngularDsl.g:2444:1: rule__Componente__Group__20 : rule__Componente__Group__20__Impl rule__Componente__Group__21 ;
    public final void rule__Componente__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2448:1: ( rule__Componente__Group__20__Impl rule__Componente__Group__21 )
            // InternalAngularDsl.g:2449:2: rule__Componente__Group__20__Impl rule__Componente__Group__21
            {
            pushFollow(FOLLOW_19);
            rule__Componente__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__20"


    // $ANTLR start "rule__Componente__Group__20__Impl"
    // InternalAngularDsl.g:2456:1: rule__Componente__Group__20__Impl : ( RULE_PARENTESIS_CUADRADO_IZQUIERDO ) ;
    public final void rule__Componente__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2460:1: ( ( RULE_PARENTESIS_CUADRADO_IZQUIERDO ) )
            // InternalAngularDsl.g:2461:1: ( RULE_PARENTESIS_CUADRADO_IZQUIERDO )
            {
            // InternalAngularDsl.g:2461:1: ( RULE_PARENTESIS_CUADRADO_IZQUIERDO )
            // InternalAngularDsl.g:2462:2: RULE_PARENTESIS_CUADRADO_IZQUIERDO
            {
             before(grammarAccess.getComponenteAccess().getPARENTESIS_CUADRADO_IZQUIERDOTerminalRuleCall_20()); 
            match(input,RULE_PARENTESIS_CUADRADO_IZQUIERDO,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getPARENTESIS_CUADRADO_IZQUIERDOTerminalRuleCall_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__20__Impl"


    // $ANTLR start "rule__Componente__Group__21"
    // InternalAngularDsl.g:2471:1: rule__Componente__Group__21 : rule__Componente__Group__21__Impl rule__Componente__Group__22 ;
    public final void rule__Componente__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2475:1: ( rule__Componente__Group__21__Impl rule__Componente__Group__22 )
            // InternalAngularDsl.g:2476:2: rule__Componente__Group__21__Impl rule__Componente__Group__22
            {
            pushFollow(FOLLOW_19);
            rule__Componente__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__21"


    // $ANTLR start "rule__Componente__Group__21__Impl"
    // InternalAngularDsl.g:2483:1: rule__Componente__Group__21__Impl : ( ( rule__Componente__Group_21__0 )* ) ;
    public final void rule__Componente__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2487:1: ( ( ( rule__Componente__Group_21__0 )* ) )
            // InternalAngularDsl.g:2488:1: ( ( rule__Componente__Group_21__0 )* )
            {
            // InternalAngularDsl.g:2488:1: ( ( rule__Componente__Group_21__0 )* )
            // InternalAngularDsl.g:2489:2: ( rule__Componente__Group_21__0 )*
            {
             before(grammarAccess.getComponenteAccess().getGroup_21()); 
            // InternalAngularDsl.g:2490:2: ( rule__Componente__Group_21__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAngularDsl.g:2490:3: rule__Componente__Group_21__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Componente__Group_21__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getComponenteAccess().getGroup_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__21__Impl"


    // $ANTLR start "rule__Componente__Group__22"
    // InternalAngularDsl.g:2498:1: rule__Componente__Group__22 : rule__Componente__Group__22__Impl rule__Componente__Group__23 ;
    public final void rule__Componente__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2502:1: ( rule__Componente__Group__22__Impl rule__Componente__Group__23 )
            // InternalAngularDsl.g:2503:2: rule__Componente__Group__22__Impl rule__Componente__Group__23
            {
            pushFollow(FOLLOW_20);
            rule__Componente__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__22"


    // $ANTLR start "rule__Componente__Group__22__Impl"
    // InternalAngularDsl.g:2510:1: rule__Componente__Group__22__Impl : ( RULE_COMA ) ;
    public final void rule__Componente__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2514:1: ( ( RULE_COMA ) )
            // InternalAngularDsl.g:2515:1: ( RULE_COMA )
            {
            // InternalAngularDsl.g:2515:1: ( RULE_COMA )
            // InternalAngularDsl.g:2516:2: RULE_COMA
            {
             before(grammarAccess.getComponenteAccess().getCOMATerminalRuleCall_22()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getCOMATerminalRuleCall_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__22__Impl"


    // $ANTLR start "rule__Componente__Group__23"
    // InternalAngularDsl.g:2525:1: rule__Componente__Group__23 : rule__Componente__Group__23__Impl rule__Componente__Group__24 ;
    public final void rule__Componente__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2529:1: ( rule__Componente__Group__23__Impl rule__Componente__Group__24 )
            // InternalAngularDsl.g:2530:2: rule__Componente__Group__23__Impl rule__Componente__Group__24
            {
            pushFollow(FOLLOW_21);
            rule__Componente__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__23"


    // $ANTLR start "rule__Componente__Group__23__Impl"
    // InternalAngularDsl.g:2537:1: rule__Componente__Group__23__Impl : ( ( rule__Componente__FuncionAssignment_23 ) ) ;
    public final void rule__Componente__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2541:1: ( ( ( rule__Componente__FuncionAssignment_23 ) ) )
            // InternalAngularDsl.g:2542:1: ( ( rule__Componente__FuncionAssignment_23 ) )
            {
            // InternalAngularDsl.g:2542:1: ( ( rule__Componente__FuncionAssignment_23 ) )
            // InternalAngularDsl.g:2543:2: ( rule__Componente__FuncionAssignment_23 )
            {
             before(grammarAccess.getComponenteAccess().getFuncionAssignment_23()); 
            // InternalAngularDsl.g:2544:2: ( rule__Componente__FuncionAssignment_23 )
            // InternalAngularDsl.g:2544:3: rule__Componente__FuncionAssignment_23
            {
            pushFollow(FOLLOW_2);
            rule__Componente__FuncionAssignment_23();

            state._fsp--;


            }

             after(grammarAccess.getComponenteAccess().getFuncionAssignment_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__23__Impl"


    // $ANTLR start "rule__Componente__Group__24"
    // InternalAngularDsl.g:2552:1: rule__Componente__Group__24 : rule__Componente__Group__24__Impl rule__Componente__Group__25 ;
    public final void rule__Componente__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2556:1: ( rule__Componente__Group__24__Impl rule__Componente__Group__25 )
            // InternalAngularDsl.g:2557:2: rule__Componente__Group__24__Impl rule__Componente__Group__25
            {
            pushFollow(FOLLOW_27);
            rule__Componente__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__24"


    // $ANTLR start "rule__Componente__Group__24__Impl"
    // InternalAngularDsl.g:2564:1: rule__Componente__Group__24__Impl : ( RULE_PARENTESIS_CUADRADO_DERECHO ) ;
    public final void rule__Componente__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2568:1: ( ( RULE_PARENTESIS_CUADRADO_DERECHO ) )
            // InternalAngularDsl.g:2569:1: ( RULE_PARENTESIS_CUADRADO_DERECHO )
            {
            // InternalAngularDsl.g:2569:1: ( RULE_PARENTESIS_CUADRADO_DERECHO )
            // InternalAngularDsl.g:2570:2: RULE_PARENTESIS_CUADRADO_DERECHO
            {
             before(grammarAccess.getComponenteAccess().getPARENTESIS_CUADRADO_DERECHOTerminalRuleCall_24()); 
            match(input,RULE_PARENTESIS_CUADRADO_DERECHO,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getPARENTESIS_CUADRADO_DERECHOTerminalRuleCall_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__24__Impl"


    // $ANTLR start "rule__Componente__Group__25"
    // InternalAngularDsl.g:2579:1: rule__Componente__Group__25 : rule__Componente__Group__25__Impl rule__Componente__Group__26 ;
    public final void rule__Componente__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2583:1: ( rule__Componente__Group__25__Impl rule__Componente__Group__26 )
            // InternalAngularDsl.g:2584:2: rule__Componente__Group__25__Impl rule__Componente__Group__26
            {
            pushFollow(FOLLOW_12);
            rule__Componente__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__26();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__25"


    // $ANTLR start "rule__Componente__Group__25__Impl"
    // InternalAngularDsl.g:2591:1: rule__Componente__Group__25__Impl : ( RULE_LLAVE_DERECHA ) ;
    public final void rule__Componente__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2595:1: ( ( RULE_LLAVE_DERECHA ) )
            // InternalAngularDsl.g:2596:1: ( RULE_LLAVE_DERECHA )
            {
            // InternalAngularDsl.g:2596:1: ( RULE_LLAVE_DERECHA )
            // InternalAngularDsl.g:2597:2: RULE_LLAVE_DERECHA
            {
             before(grammarAccess.getComponenteAccess().getLLAVE_DERECHATerminalRuleCall_25()); 
            match(input,RULE_LLAVE_DERECHA,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getLLAVE_DERECHATerminalRuleCall_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__25__Impl"


    // $ANTLR start "rule__Componente__Group__26"
    // InternalAngularDsl.g:2606:1: rule__Componente__Group__26 : rule__Componente__Group__26__Impl rule__Componente__Group__27 ;
    public final void rule__Componente__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2610:1: ( rule__Componente__Group__26__Impl rule__Componente__Group__27 )
            // InternalAngularDsl.g:2611:2: rule__Componente__Group__26__Impl rule__Componente__Group__27
            {
            pushFollow(FOLLOW_13);
            rule__Componente__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group__27();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__26"


    // $ANTLR start "rule__Componente__Group__26__Impl"
    // InternalAngularDsl.g:2618:1: rule__Componente__Group__26__Impl : ( RULE_PARENTESIS_DERECHO ) ;
    public final void rule__Componente__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2622:1: ( ( RULE_PARENTESIS_DERECHO ) )
            // InternalAngularDsl.g:2623:1: ( RULE_PARENTESIS_DERECHO )
            {
            // InternalAngularDsl.g:2623:1: ( RULE_PARENTESIS_DERECHO )
            // InternalAngularDsl.g:2624:2: RULE_PARENTESIS_DERECHO
            {
             before(grammarAccess.getComponenteAccess().getPARENTESIS_DERECHOTerminalRuleCall_26()); 
            match(input,RULE_PARENTESIS_DERECHO,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getPARENTESIS_DERECHOTerminalRuleCall_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__26__Impl"


    // $ANTLR start "rule__Componente__Group__27"
    // InternalAngularDsl.g:2633:1: rule__Componente__Group__27 : rule__Componente__Group__27__Impl ;
    public final void rule__Componente__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2637:1: ( rule__Componente__Group__27__Impl )
            // InternalAngularDsl.g:2638:2: rule__Componente__Group__27__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Componente__Group__27__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__27"


    // $ANTLR start "rule__Componente__Group__27__Impl"
    // InternalAngularDsl.g:2644:1: rule__Componente__Group__27__Impl : ( RULE_PUNTO_Y_COMA ) ;
    public final void rule__Componente__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2648:1: ( ( RULE_PUNTO_Y_COMA ) )
            // InternalAngularDsl.g:2649:1: ( RULE_PUNTO_Y_COMA )
            {
            // InternalAngularDsl.g:2649:1: ( RULE_PUNTO_Y_COMA )
            // InternalAngularDsl.g:2650:2: RULE_PUNTO_Y_COMA
            {
             before(grammarAccess.getComponenteAccess().getPUNTO_Y_COMATerminalRuleCall_27()); 
            match(input,RULE_PUNTO_Y_COMA,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getPUNTO_Y_COMATerminalRuleCall_27()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group__27__Impl"


    // $ANTLR start "rule__Componente__Group_1__0"
    // InternalAngularDsl.g:2660:1: rule__Componente__Group_1__0 : rule__Componente__Group_1__0__Impl rule__Componente__Group_1__1 ;
    public final void rule__Componente__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2664:1: ( rule__Componente__Group_1__0__Impl rule__Componente__Group_1__1 )
            // InternalAngularDsl.g:2665:2: rule__Componente__Group_1__0__Impl rule__Componente__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Componente__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group_1__0"


    // $ANTLR start "rule__Componente__Group_1__0__Impl"
    // InternalAngularDsl.g:2672:1: rule__Componente__Group_1__0__Impl : ( RULE_COMILLAS ) ;
    public final void rule__Componente__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2676:1: ( ( RULE_COMILLAS ) )
            // InternalAngularDsl.g:2677:1: ( RULE_COMILLAS )
            {
            // InternalAngularDsl.g:2677:1: ( RULE_COMILLAS )
            // InternalAngularDsl.g:2678:2: RULE_COMILLAS
            {
             before(grammarAccess.getComponenteAccess().getCOMILLASTerminalRuleCall_1_0()); 
            match(input,RULE_COMILLAS,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getCOMILLASTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group_1__0__Impl"


    // $ANTLR start "rule__Componente__Group_1__1"
    // InternalAngularDsl.g:2687:1: rule__Componente__Group_1__1 : rule__Componente__Group_1__1__Impl rule__Componente__Group_1__2 ;
    public final void rule__Componente__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2691:1: ( rule__Componente__Group_1__1__Impl rule__Componente__Group_1__2 )
            // InternalAngularDsl.g:2692:2: rule__Componente__Group_1__1__Impl rule__Componente__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Componente__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group_1__1"


    // $ANTLR start "rule__Componente__Group_1__1__Impl"
    // InternalAngularDsl.g:2699:1: rule__Componente__Group_1__1__Impl : ( RULE_USE ) ;
    public final void rule__Componente__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2703:1: ( ( RULE_USE ) )
            // InternalAngularDsl.g:2704:1: ( RULE_USE )
            {
            // InternalAngularDsl.g:2704:1: ( RULE_USE )
            // InternalAngularDsl.g:2705:2: RULE_USE
            {
             before(grammarAccess.getComponenteAccess().getUSETerminalRuleCall_1_1()); 
            match(input,RULE_USE,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getUSETerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group_1__1__Impl"


    // $ANTLR start "rule__Componente__Group_1__2"
    // InternalAngularDsl.g:2714:1: rule__Componente__Group_1__2 : rule__Componente__Group_1__2__Impl rule__Componente__Group_1__3 ;
    public final void rule__Componente__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2718:1: ( rule__Componente__Group_1__2__Impl rule__Componente__Group_1__3 )
            // InternalAngularDsl.g:2719:2: rule__Componente__Group_1__2__Impl rule__Componente__Group_1__3
            {
            pushFollow(FOLLOW_16);
            rule__Componente__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group_1__2"


    // $ANTLR start "rule__Componente__Group_1__2__Impl"
    // InternalAngularDsl.g:2726:1: rule__Componente__Group_1__2__Impl : ( RULE_STRICT ) ;
    public final void rule__Componente__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2730:1: ( ( RULE_STRICT ) )
            // InternalAngularDsl.g:2731:1: ( RULE_STRICT )
            {
            // InternalAngularDsl.g:2731:1: ( RULE_STRICT )
            // InternalAngularDsl.g:2732:2: RULE_STRICT
            {
             before(grammarAccess.getComponenteAccess().getSTRICTTerminalRuleCall_1_2()); 
            match(input,RULE_STRICT,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getSTRICTTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group_1__2__Impl"


    // $ANTLR start "rule__Componente__Group_1__3"
    // InternalAngularDsl.g:2741:1: rule__Componente__Group_1__3 : rule__Componente__Group_1__3__Impl rule__Componente__Group_1__4 ;
    public final void rule__Componente__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2745:1: ( rule__Componente__Group_1__3__Impl rule__Componente__Group_1__4 )
            // InternalAngularDsl.g:2746:2: rule__Componente__Group_1__3__Impl rule__Componente__Group_1__4
            {
            pushFollow(FOLLOW_13);
            rule__Componente__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group_1__3"


    // $ANTLR start "rule__Componente__Group_1__3__Impl"
    // InternalAngularDsl.g:2753:1: rule__Componente__Group_1__3__Impl : ( RULE_COMILLAS ) ;
    public final void rule__Componente__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2757:1: ( ( RULE_COMILLAS ) )
            // InternalAngularDsl.g:2758:1: ( RULE_COMILLAS )
            {
            // InternalAngularDsl.g:2758:1: ( RULE_COMILLAS )
            // InternalAngularDsl.g:2759:2: RULE_COMILLAS
            {
             before(grammarAccess.getComponenteAccess().getCOMILLASTerminalRuleCall_1_3()); 
            match(input,RULE_COMILLAS,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getCOMILLASTerminalRuleCall_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group_1__3__Impl"


    // $ANTLR start "rule__Componente__Group_1__4"
    // InternalAngularDsl.g:2768:1: rule__Componente__Group_1__4 : rule__Componente__Group_1__4__Impl ;
    public final void rule__Componente__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2772:1: ( rule__Componente__Group_1__4__Impl )
            // InternalAngularDsl.g:2773:2: rule__Componente__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Componente__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group_1__4"


    // $ANTLR start "rule__Componente__Group_1__4__Impl"
    // InternalAngularDsl.g:2779:1: rule__Componente__Group_1__4__Impl : ( RULE_PUNTO_Y_COMA ) ;
    public final void rule__Componente__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2783:1: ( ( RULE_PUNTO_Y_COMA ) )
            // InternalAngularDsl.g:2784:1: ( RULE_PUNTO_Y_COMA )
            {
            // InternalAngularDsl.g:2784:1: ( RULE_PUNTO_Y_COMA )
            // InternalAngularDsl.g:2785:2: RULE_PUNTO_Y_COMA
            {
             before(grammarAccess.getComponenteAccess().getPUNTO_Y_COMATerminalRuleCall_1_4()); 
            match(input,RULE_PUNTO_Y_COMA,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getPUNTO_Y_COMATerminalRuleCall_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group_1__4__Impl"


    // $ANTLR start "rule__Componente__Group_21__0"
    // InternalAngularDsl.g:2795:1: rule__Componente__Group_21__0 : rule__Componente__Group_21__0__Impl rule__Componente__Group_21__1 ;
    public final void rule__Componente__Group_21__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2799:1: ( rule__Componente__Group_21__0__Impl rule__Componente__Group_21__1 )
            // InternalAngularDsl.g:2800:2: rule__Componente__Group_21__0__Impl rule__Componente__Group_21__1
            {
            pushFollow(FOLLOW_8);
            rule__Componente__Group_21__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group_21__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group_21__0"


    // $ANTLR start "rule__Componente__Group_21__0__Impl"
    // InternalAngularDsl.g:2807:1: rule__Componente__Group_21__0__Impl : ( ( rule__Componente__ParametrosAssignment_21_0 ) ) ;
    public final void rule__Componente__Group_21__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2811:1: ( ( ( rule__Componente__ParametrosAssignment_21_0 ) ) )
            // InternalAngularDsl.g:2812:1: ( ( rule__Componente__ParametrosAssignment_21_0 ) )
            {
            // InternalAngularDsl.g:2812:1: ( ( rule__Componente__ParametrosAssignment_21_0 ) )
            // InternalAngularDsl.g:2813:2: ( rule__Componente__ParametrosAssignment_21_0 )
            {
             before(grammarAccess.getComponenteAccess().getParametrosAssignment_21_0()); 
            // InternalAngularDsl.g:2814:2: ( rule__Componente__ParametrosAssignment_21_0 )
            // InternalAngularDsl.g:2814:3: rule__Componente__ParametrosAssignment_21_0
            {
            pushFollow(FOLLOW_2);
            rule__Componente__ParametrosAssignment_21_0();

            state._fsp--;


            }

             after(grammarAccess.getComponenteAccess().getParametrosAssignment_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group_21__0__Impl"


    // $ANTLR start "rule__Componente__Group_21__1"
    // InternalAngularDsl.g:2822:1: rule__Componente__Group_21__1 : rule__Componente__Group_21__1__Impl ;
    public final void rule__Componente__Group_21__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2826:1: ( rule__Componente__Group_21__1__Impl )
            // InternalAngularDsl.g:2827:2: rule__Componente__Group_21__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Componente__Group_21__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group_21__1"


    // $ANTLR start "rule__Componente__Group_21__1__Impl"
    // InternalAngularDsl.g:2833:1: rule__Componente__Group_21__1__Impl : ( ( rule__Componente__Group_21_1__0 )* ) ;
    public final void rule__Componente__Group_21__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2837:1: ( ( ( rule__Componente__Group_21_1__0 )* ) )
            // InternalAngularDsl.g:2838:1: ( ( rule__Componente__Group_21_1__0 )* )
            {
            // InternalAngularDsl.g:2838:1: ( ( rule__Componente__Group_21_1__0 )* )
            // InternalAngularDsl.g:2839:2: ( rule__Componente__Group_21_1__0 )*
            {
             before(grammarAccess.getComponenteAccess().getGroup_21_1()); 
            // InternalAngularDsl.g:2840:2: ( rule__Componente__Group_21_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_COMA) ) {
                    int LA12_1 = input.LA(2);

                    if ( ((LA12_1>=RULE_STRING && LA12_1<=RULE_ID)) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalAngularDsl.g:2840:3: rule__Componente__Group_21_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Componente__Group_21_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getComponenteAccess().getGroup_21_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group_21__1__Impl"


    // $ANTLR start "rule__Componente__Group_21_1__0"
    // InternalAngularDsl.g:2849:1: rule__Componente__Group_21_1__0 : rule__Componente__Group_21_1__0__Impl rule__Componente__Group_21_1__1 ;
    public final void rule__Componente__Group_21_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2853:1: ( rule__Componente__Group_21_1__0__Impl rule__Componente__Group_21_1__1 )
            // InternalAngularDsl.g:2854:2: rule__Componente__Group_21_1__0__Impl rule__Componente__Group_21_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Componente__Group_21_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Componente__Group_21_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group_21_1__0"


    // $ANTLR start "rule__Componente__Group_21_1__0__Impl"
    // InternalAngularDsl.g:2861:1: rule__Componente__Group_21_1__0__Impl : ( RULE_COMA ) ;
    public final void rule__Componente__Group_21_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2865:1: ( ( RULE_COMA ) )
            // InternalAngularDsl.g:2866:1: ( RULE_COMA )
            {
            // InternalAngularDsl.g:2866:1: ( RULE_COMA )
            // InternalAngularDsl.g:2867:2: RULE_COMA
            {
             before(grammarAccess.getComponenteAccess().getCOMATerminalRuleCall_21_1_0()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getComponenteAccess().getCOMATerminalRuleCall_21_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group_21_1__0__Impl"


    // $ANTLR start "rule__Componente__Group_21_1__1"
    // InternalAngularDsl.g:2876:1: rule__Componente__Group_21_1__1 : rule__Componente__Group_21_1__1__Impl ;
    public final void rule__Componente__Group_21_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2880:1: ( rule__Componente__Group_21_1__1__Impl )
            // InternalAngularDsl.g:2881:2: rule__Componente__Group_21_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Componente__Group_21_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group_21_1__1"


    // $ANTLR start "rule__Componente__Group_21_1__1__Impl"
    // InternalAngularDsl.g:2887:1: rule__Componente__Group_21_1__1__Impl : ( ( rule__Componente__ParametrosAssignment_21_1_1 ) ) ;
    public final void rule__Componente__Group_21_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2891:1: ( ( ( rule__Componente__ParametrosAssignment_21_1_1 ) ) )
            // InternalAngularDsl.g:2892:1: ( ( rule__Componente__ParametrosAssignment_21_1_1 ) )
            {
            // InternalAngularDsl.g:2892:1: ( ( rule__Componente__ParametrosAssignment_21_1_1 ) )
            // InternalAngularDsl.g:2893:2: ( rule__Componente__ParametrosAssignment_21_1_1 )
            {
             before(grammarAccess.getComponenteAccess().getParametrosAssignment_21_1_1()); 
            // InternalAngularDsl.g:2894:2: ( rule__Componente__ParametrosAssignment_21_1_1 )
            // InternalAngularDsl.g:2894:3: rule__Componente__ParametrosAssignment_21_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Componente__ParametrosAssignment_21_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComponenteAccess().getParametrosAssignment_21_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__Group_21_1__1__Impl"


    // $ANTLR start "rule__Funcion__Group__0"
    // InternalAngularDsl.g:2903:1: rule__Funcion__Group__0 : rule__Funcion__Group__0__Impl rule__Funcion__Group__1 ;
    public final void rule__Funcion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2907:1: ( rule__Funcion__Group__0__Impl rule__Funcion__Group__1 )
            // InternalAngularDsl.g:2908:2: rule__Funcion__Group__0__Impl rule__Funcion__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Funcion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Funcion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__0"


    // $ANTLR start "rule__Funcion__Group__0__Impl"
    // InternalAngularDsl.g:2915:1: rule__Funcion__Group__0__Impl : ( () ) ;
    public final void rule__Funcion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2919:1: ( ( () ) )
            // InternalAngularDsl.g:2920:1: ( () )
            {
            // InternalAngularDsl.g:2920:1: ( () )
            // InternalAngularDsl.g:2921:2: ()
            {
             before(grammarAccess.getFuncionAccess().getFuncionAction_0()); 
            // InternalAngularDsl.g:2922:2: ()
            // InternalAngularDsl.g:2922:3: 
            {
            }

             after(grammarAccess.getFuncionAccess().getFuncionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__0__Impl"


    // $ANTLR start "rule__Funcion__Group__1"
    // InternalAngularDsl.g:2930:1: rule__Funcion__Group__1 : rule__Funcion__Group__1__Impl rule__Funcion__Group__2 ;
    public final void rule__Funcion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2934:1: ( rule__Funcion__Group__1__Impl rule__Funcion__Group__2 )
            // InternalAngularDsl.g:2935:2: rule__Funcion__Group__1__Impl rule__Funcion__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Funcion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Funcion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__1"


    // $ANTLR start "rule__Funcion__Group__1__Impl"
    // InternalAngularDsl.g:2942:1: rule__Funcion__Group__1__Impl : ( RULE_FUNCTION ) ;
    public final void rule__Funcion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2946:1: ( ( RULE_FUNCTION ) )
            // InternalAngularDsl.g:2947:1: ( RULE_FUNCTION )
            {
            // InternalAngularDsl.g:2947:1: ( RULE_FUNCTION )
            // InternalAngularDsl.g:2948:2: RULE_FUNCTION
            {
             before(grammarAccess.getFuncionAccess().getFUNCTIONTerminalRuleCall_1()); 
            match(input,RULE_FUNCTION,FOLLOW_2); 
             after(grammarAccess.getFuncionAccess().getFUNCTIONTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__1__Impl"


    // $ANTLR start "rule__Funcion__Group__2"
    // InternalAngularDsl.g:2957:1: rule__Funcion__Group__2 : rule__Funcion__Group__2__Impl rule__Funcion__Group__3 ;
    public final void rule__Funcion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2961:1: ( rule__Funcion__Group__2__Impl rule__Funcion__Group__3 )
            // InternalAngularDsl.g:2962:2: rule__Funcion__Group__2__Impl rule__Funcion__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Funcion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Funcion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__2"


    // $ANTLR start "rule__Funcion__Group__2__Impl"
    // InternalAngularDsl.g:2969:1: rule__Funcion__Group__2__Impl : ( ( rule__Funcion__NameAssignment_2 ) ) ;
    public final void rule__Funcion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2973:1: ( ( ( rule__Funcion__NameAssignment_2 ) ) )
            // InternalAngularDsl.g:2974:1: ( ( rule__Funcion__NameAssignment_2 ) )
            {
            // InternalAngularDsl.g:2974:1: ( ( rule__Funcion__NameAssignment_2 ) )
            // InternalAngularDsl.g:2975:2: ( rule__Funcion__NameAssignment_2 )
            {
             before(grammarAccess.getFuncionAccess().getNameAssignment_2()); 
            // InternalAngularDsl.g:2976:2: ( rule__Funcion__NameAssignment_2 )
            // InternalAngularDsl.g:2976:3: rule__Funcion__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Funcion__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFuncionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__2__Impl"


    // $ANTLR start "rule__Funcion__Group__3"
    // InternalAngularDsl.g:2984:1: rule__Funcion__Group__3 : rule__Funcion__Group__3__Impl rule__Funcion__Group__4 ;
    public final void rule__Funcion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2988:1: ( rule__Funcion__Group__3__Impl rule__Funcion__Group__4 )
            // InternalAngularDsl.g:2989:2: rule__Funcion__Group__3__Impl rule__Funcion__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Funcion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Funcion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__3"


    // $ANTLR start "rule__Funcion__Group__3__Impl"
    // InternalAngularDsl.g:2996:1: rule__Funcion__Group__3__Impl : ( RULE_PARENTESIS_IZQUIERDO ) ;
    public final void rule__Funcion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3000:1: ( ( RULE_PARENTESIS_IZQUIERDO ) )
            // InternalAngularDsl.g:3001:1: ( RULE_PARENTESIS_IZQUIERDO )
            {
            // InternalAngularDsl.g:3001:1: ( RULE_PARENTESIS_IZQUIERDO )
            // InternalAngularDsl.g:3002:2: RULE_PARENTESIS_IZQUIERDO
            {
             before(grammarAccess.getFuncionAccess().getPARENTESIS_IZQUIERDOTerminalRuleCall_3()); 
            match(input,RULE_PARENTESIS_IZQUIERDO,FOLLOW_2); 
             after(grammarAccess.getFuncionAccess().getPARENTESIS_IZQUIERDOTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__3__Impl"


    // $ANTLR start "rule__Funcion__Group__4"
    // InternalAngularDsl.g:3011:1: rule__Funcion__Group__4 : rule__Funcion__Group__4__Impl rule__Funcion__Group__5 ;
    public final void rule__Funcion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3015:1: ( rule__Funcion__Group__4__Impl rule__Funcion__Group__5 )
            // InternalAngularDsl.g:3016:2: rule__Funcion__Group__4__Impl rule__Funcion__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Funcion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Funcion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__4"


    // $ANTLR start "rule__Funcion__Group__4__Impl"
    // InternalAngularDsl.g:3023:1: rule__Funcion__Group__4__Impl : ( ( rule__Funcion__ParametrosAssignment_4 ) ) ;
    public final void rule__Funcion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3027:1: ( ( ( rule__Funcion__ParametrosAssignment_4 ) ) )
            // InternalAngularDsl.g:3028:1: ( ( rule__Funcion__ParametrosAssignment_4 ) )
            {
            // InternalAngularDsl.g:3028:1: ( ( rule__Funcion__ParametrosAssignment_4 ) )
            // InternalAngularDsl.g:3029:2: ( rule__Funcion__ParametrosAssignment_4 )
            {
             before(grammarAccess.getFuncionAccess().getParametrosAssignment_4()); 
            // InternalAngularDsl.g:3030:2: ( rule__Funcion__ParametrosAssignment_4 )
            // InternalAngularDsl.g:3030:3: rule__Funcion__ParametrosAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Funcion__ParametrosAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFuncionAccess().getParametrosAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__4__Impl"


    // $ANTLR start "rule__Funcion__Group__5"
    // InternalAngularDsl.g:3038:1: rule__Funcion__Group__5 : rule__Funcion__Group__5__Impl rule__Funcion__Group__6 ;
    public final void rule__Funcion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3042:1: ( rule__Funcion__Group__5__Impl rule__Funcion__Group__6 )
            // InternalAngularDsl.g:3043:2: rule__Funcion__Group__5__Impl rule__Funcion__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Funcion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Funcion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__5"


    // $ANTLR start "rule__Funcion__Group__5__Impl"
    // InternalAngularDsl.g:3050:1: rule__Funcion__Group__5__Impl : ( RULE_PARENTESIS_DERECHO ) ;
    public final void rule__Funcion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3054:1: ( ( RULE_PARENTESIS_DERECHO ) )
            // InternalAngularDsl.g:3055:1: ( RULE_PARENTESIS_DERECHO )
            {
            // InternalAngularDsl.g:3055:1: ( RULE_PARENTESIS_DERECHO )
            // InternalAngularDsl.g:3056:2: RULE_PARENTESIS_DERECHO
            {
             before(grammarAccess.getFuncionAccess().getPARENTESIS_DERECHOTerminalRuleCall_5()); 
            match(input,RULE_PARENTESIS_DERECHO,FOLLOW_2); 
             after(grammarAccess.getFuncionAccess().getPARENTESIS_DERECHOTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__5__Impl"


    // $ANTLR start "rule__Funcion__Group__6"
    // InternalAngularDsl.g:3065:1: rule__Funcion__Group__6 : rule__Funcion__Group__6__Impl rule__Funcion__Group__7 ;
    public final void rule__Funcion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3069:1: ( rule__Funcion__Group__6__Impl rule__Funcion__Group__7 )
            // InternalAngularDsl.g:3070:2: rule__Funcion__Group__6__Impl rule__Funcion__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__Funcion__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Funcion__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__6"


    // $ANTLR start "rule__Funcion__Group__6__Impl"
    // InternalAngularDsl.g:3077:1: rule__Funcion__Group__6__Impl : ( RULE_LLAVE_IZQUIERDA ) ;
    public final void rule__Funcion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3081:1: ( ( RULE_LLAVE_IZQUIERDA ) )
            // InternalAngularDsl.g:3082:1: ( RULE_LLAVE_IZQUIERDA )
            {
            // InternalAngularDsl.g:3082:1: ( RULE_LLAVE_IZQUIERDA )
            // InternalAngularDsl.g:3083:2: RULE_LLAVE_IZQUIERDA
            {
             before(grammarAccess.getFuncionAccess().getLLAVE_IZQUIERDATerminalRuleCall_6()); 
            match(input,RULE_LLAVE_IZQUIERDA,FOLLOW_2); 
             after(grammarAccess.getFuncionAccess().getLLAVE_IZQUIERDATerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__6__Impl"


    // $ANTLR start "rule__Funcion__Group__7"
    // InternalAngularDsl.g:3092:1: rule__Funcion__Group__7 : rule__Funcion__Group__7__Impl rule__Funcion__Group__8 ;
    public final void rule__Funcion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3096:1: ( rule__Funcion__Group__7__Impl rule__Funcion__Group__8 )
            // InternalAngularDsl.g:3097:2: rule__Funcion__Group__7__Impl rule__Funcion__Group__8
            {
            pushFollow(FOLLOW_28);
            rule__Funcion__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Funcion__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__7"


    // $ANTLR start "rule__Funcion__Group__7__Impl"
    // InternalAngularDsl.g:3104:1: rule__Funcion__Group__7__Impl : ( ( rule__Funcion__VariablesAssignment_7 )* ) ;
    public final void rule__Funcion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3108:1: ( ( ( rule__Funcion__VariablesAssignment_7 )* ) )
            // InternalAngularDsl.g:3109:1: ( ( rule__Funcion__VariablesAssignment_7 )* )
            {
            // InternalAngularDsl.g:3109:1: ( ( rule__Funcion__VariablesAssignment_7 )* )
            // InternalAngularDsl.g:3110:2: ( rule__Funcion__VariablesAssignment_7 )*
            {
             before(grammarAccess.getFuncionAccess().getVariablesAssignment_7()); 
            // InternalAngularDsl.g:3111:2: ( rule__Funcion__VariablesAssignment_7 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_VAR||LA13_0==38) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAngularDsl.g:3111:3: rule__Funcion__VariablesAssignment_7
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Funcion__VariablesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getFuncionAccess().getVariablesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__7__Impl"


    // $ANTLR start "rule__Funcion__Group__8"
    // InternalAngularDsl.g:3119:1: rule__Funcion__Group__8 : rule__Funcion__Group__8__Impl rule__Funcion__Group__9 ;
    public final void rule__Funcion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3123:1: ( rule__Funcion__Group__8__Impl rule__Funcion__Group__9 )
            // InternalAngularDsl.g:3124:2: rule__Funcion__Group__8__Impl rule__Funcion__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__Funcion__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Funcion__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__8"


    // $ANTLR start "rule__Funcion__Group__8__Impl"
    // InternalAngularDsl.g:3131:1: rule__Funcion__Group__8__Impl : ( ( rule__Funcion__BodyAssignment_8 ) ) ;
    public final void rule__Funcion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3135:1: ( ( ( rule__Funcion__BodyAssignment_8 ) ) )
            // InternalAngularDsl.g:3136:1: ( ( rule__Funcion__BodyAssignment_8 ) )
            {
            // InternalAngularDsl.g:3136:1: ( ( rule__Funcion__BodyAssignment_8 ) )
            // InternalAngularDsl.g:3137:2: ( rule__Funcion__BodyAssignment_8 )
            {
             before(grammarAccess.getFuncionAccess().getBodyAssignment_8()); 
            // InternalAngularDsl.g:3138:2: ( rule__Funcion__BodyAssignment_8 )
            // InternalAngularDsl.g:3138:3: rule__Funcion__BodyAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Funcion__BodyAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getFuncionAccess().getBodyAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__8__Impl"


    // $ANTLR start "rule__Funcion__Group__9"
    // InternalAngularDsl.g:3146:1: rule__Funcion__Group__9 : rule__Funcion__Group__9__Impl ;
    public final void rule__Funcion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3150:1: ( rule__Funcion__Group__9__Impl )
            // InternalAngularDsl.g:3151:2: rule__Funcion__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Funcion__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__9"


    // $ANTLR start "rule__Funcion__Group__9__Impl"
    // InternalAngularDsl.g:3157:1: rule__Funcion__Group__9__Impl : ( RULE_LLAVE_DERECHA ) ;
    public final void rule__Funcion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3161:1: ( ( RULE_LLAVE_DERECHA ) )
            // InternalAngularDsl.g:3162:1: ( RULE_LLAVE_DERECHA )
            {
            // InternalAngularDsl.g:3162:1: ( RULE_LLAVE_DERECHA )
            // InternalAngularDsl.g:3163:2: RULE_LLAVE_DERECHA
            {
             before(grammarAccess.getFuncionAccess().getLLAVE_DERECHATerminalRuleCall_9()); 
            match(input,RULE_LLAVE_DERECHA,FOLLOW_2); 
             after(grammarAccess.getFuncionAccess().getLLAVE_DERECHATerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__Group__9__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalAngularDsl.g:3173:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3177:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalAngularDsl.g:3178:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalAngularDsl.g:3185:1: rule__Variable__Group__0__Impl : ( () ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3189:1: ( ( () ) )
            // InternalAngularDsl.g:3190:1: ( () )
            {
            // InternalAngularDsl.g:3190:1: ( () )
            // InternalAngularDsl.g:3191:2: ()
            {
             before(grammarAccess.getVariableAccess().getVariableAction_0()); 
            // InternalAngularDsl.g:3192:2: ()
            // InternalAngularDsl.g:3192:3: 
            {
            }

             after(grammarAccess.getVariableAccess().getVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalAngularDsl.g:3200:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3204:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalAngularDsl.g:3205:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalAngularDsl.g:3212:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__AnotacionAssignment_1 )? ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3216:1: ( ( ( rule__Variable__AnotacionAssignment_1 )? ) )
            // InternalAngularDsl.g:3217:1: ( ( rule__Variable__AnotacionAssignment_1 )? )
            {
            // InternalAngularDsl.g:3217:1: ( ( rule__Variable__AnotacionAssignment_1 )? )
            // InternalAngularDsl.g:3218:2: ( rule__Variable__AnotacionAssignment_1 )?
            {
             before(grammarAccess.getVariableAccess().getAnotacionAssignment_1()); 
            // InternalAngularDsl.g:3219:2: ( rule__Variable__AnotacionAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAngularDsl.g:3219:3: rule__Variable__AnotacionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__AnotacionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getAnotacionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalAngularDsl.g:3227:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3231:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalAngularDsl.g:3232:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalAngularDsl.g:3239:1: rule__Variable__Group__2__Impl : ( RULE_VAR ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3243:1: ( ( RULE_VAR ) )
            // InternalAngularDsl.g:3244:1: ( RULE_VAR )
            {
            // InternalAngularDsl.g:3244:1: ( RULE_VAR )
            // InternalAngularDsl.g:3245:2: RULE_VAR
            {
             before(grammarAccess.getVariableAccess().getVARTerminalRuleCall_2()); 
            match(input,RULE_VAR,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVARTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__3"
    // InternalAngularDsl.g:3254:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl rule__Variable__Group__4 ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3258:1: ( rule__Variable__Group__3__Impl rule__Variable__Group__4 )
            // InternalAngularDsl.g:3259:2: rule__Variable__Group__3__Impl rule__Variable__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Variable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // InternalAngularDsl.g:3266:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__NameAssignment_3 ) ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3270:1: ( ( ( rule__Variable__NameAssignment_3 ) ) )
            // InternalAngularDsl.g:3271:1: ( ( rule__Variable__NameAssignment_3 ) )
            {
            // InternalAngularDsl.g:3271:1: ( ( rule__Variable__NameAssignment_3 ) )
            // InternalAngularDsl.g:3272:2: ( rule__Variable__NameAssignment_3 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_3()); 
            // InternalAngularDsl.g:3273:2: ( rule__Variable__NameAssignment_3 )
            // InternalAngularDsl.g:3273:3: rule__Variable__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__Variable__Group__4"
    // InternalAngularDsl.g:3281:1: rule__Variable__Group__4 : rule__Variable__Group__4__Impl rule__Variable__Group__5 ;
    public final void rule__Variable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3285:1: ( rule__Variable__Group__4__Impl rule__Variable__Group__5 )
            // InternalAngularDsl.g:3286:2: rule__Variable__Group__4__Impl rule__Variable__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Variable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__4"


    // $ANTLR start "rule__Variable__Group__4__Impl"
    // InternalAngularDsl.g:3293:1: rule__Variable__Group__4__Impl : ( RULE_IGUAL ) ;
    public final void rule__Variable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3297:1: ( ( RULE_IGUAL ) )
            // InternalAngularDsl.g:3298:1: ( RULE_IGUAL )
            {
            // InternalAngularDsl.g:3298:1: ( RULE_IGUAL )
            // InternalAngularDsl.g:3299:2: RULE_IGUAL
            {
             before(grammarAccess.getVariableAccess().getIGUALTerminalRuleCall_4()); 
            match(input,RULE_IGUAL,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getIGUALTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__4__Impl"


    // $ANTLR start "rule__Variable__Group__5"
    // InternalAngularDsl.g:3308:1: rule__Variable__Group__5 : rule__Variable__Group__5__Impl rule__Variable__Group__6 ;
    public final void rule__Variable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3312:1: ( rule__Variable__Group__5__Impl rule__Variable__Group__6 )
            // InternalAngularDsl.g:3313:2: rule__Variable__Group__5__Impl rule__Variable__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Variable__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__5"


    // $ANTLR start "rule__Variable__Group__5__Impl"
    // InternalAngularDsl.g:3320:1: rule__Variable__Group__5__Impl : ( ( rule__Variable__ValorAssignment_5 ) ) ;
    public final void rule__Variable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3324:1: ( ( ( rule__Variable__ValorAssignment_5 ) ) )
            // InternalAngularDsl.g:3325:1: ( ( rule__Variable__ValorAssignment_5 ) )
            {
            // InternalAngularDsl.g:3325:1: ( ( rule__Variable__ValorAssignment_5 ) )
            // InternalAngularDsl.g:3326:2: ( rule__Variable__ValorAssignment_5 )
            {
             before(grammarAccess.getVariableAccess().getValorAssignment_5()); 
            // InternalAngularDsl.g:3327:2: ( rule__Variable__ValorAssignment_5 )
            // InternalAngularDsl.g:3327:3: rule__Variable__ValorAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ValorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getValorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__5__Impl"


    // $ANTLR start "rule__Variable__Group__6"
    // InternalAngularDsl.g:3335:1: rule__Variable__Group__6 : rule__Variable__Group__6__Impl ;
    public final void rule__Variable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3339:1: ( rule__Variable__Group__6__Impl )
            // InternalAngularDsl.g:3340:2: rule__Variable__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__6"


    // $ANTLR start "rule__Variable__Group__6__Impl"
    // InternalAngularDsl.g:3346:1: rule__Variable__Group__6__Impl : ( RULE_PUNTO_Y_COMA ) ;
    public final void rule__Variable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3350:1: ( ( RULE_PUNTO_Y_COMA ) )
            // InternalAngularDsl.g:3351:1: ( RULE_PUNTO_Y_COMA )
            {
            // InternalAngularDsl.g:3351:1: ( RULE_PUNTO_Y_COMA )
            // InternalAngularDsl.g:3352:2: RULE_PUNTO_Y_COMA
            {
             before(grammarAccess.getVariableAccess().getPUNTO_Y_COMATerminalRuleCall_6()); 
            match(input,RULE_PUNTO_Y_COMA,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getPUNTO_Y_COMATerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__6__Impl"


    // $ANTLR start "rule__Anotacion__Group__0"
    // InternalAngularDsl.g:3362:1: rule__Anotacion__Group__0 : rule__Anotacion__Group__0__Impl rule__Anotacion__Group__1 ;
    public final void rule__Anotacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3366:1: ( rule__Anotacion__Group__0__Impl rule__Anotacion__Group__1 )
            // InternalAngularDsl.g:3367:2: rule__Anotacion__Group__0__Impl rule__Anotacion__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Anotacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Anotacion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anotacion__Group__0"


    // $ANTLR start "rule__Anotacion__Group__0__Impl"
    // InternalAngularDsl.g:3374:1: rule__Anotacion__Group__0__Impl : ( () ) ;
    public final void rule__Anotacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3378:1: ( ( () ) )
            // InternalAngularDsl.g:3379:1: ( () )
            {
            // InternalAngularDsl.g:3379:1: ( () )
            // InternalAngularDsl.g:3380:2: ()
            {
             before(grammarAccess.getAnotacionAccess().getAnotacionAction_0()); 
            // InternalAngularDsl.g:3381:2: ()
            // InternalAngularDsl.g:3381:3: 
            {
            }

             after(grammarAccess.getAnotacionAccess().getAnotacionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anotacion__Group__0__Impl"


    // $ANTLR start "rule__Anotacion__Group__1"
    // InternalAngularDsl.g:3389:1: rule__Anotacion__Group__1 : rule__Anotacion__Group__1__Impl rule__Anotacion__Group__2 ;
    public final void rule__Anotacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3393:1: ( rule__Anotacion__Group__1__Impl rule__Anotacion__Group__2 )
            // InternalAngularDsl.g:3394:2: rule__Anotacion__Group__1__Impl rule__Anotacion__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Anotacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Anotacion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anotacion__Group__1"


    // $ANTLR start "rule__Anotacion__Group__1__Impl"
    // InternalAngularDsl.g:3401:1: rule__Anotacion__Group__1__Impl : ( '@anotacion_' ) ;
    public final void rule__Anotacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3405:1: ( ( '@anotacion_' ) )
            // InternalAngularDsl.g:3406:1: ( '@anotacion_' )
            {
            // InternalAngularDsl.g:3406:1: ( '@anotacion_' )
            // InternalAngularDsl.g:3407:2: '@anotacion_'
            {
             before(grammarAccess.getAnotacionAccess().getAnotacion_Keyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAnotacionAccess().getAnotacion_Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anotacion__Group__1__Impl"


    // $ANTLR start "rule__Anotacion__Group__2"
    // InternalAngularDsl.g:3416:1: rule__Anotacion__Group__2 : rule__Anotacion__Group__2__Impl rule__Anotacion__Group__3 ;
    public final void rule__Anotacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3420:1: ( rule__Anotacion__Group__2__Impl rule__Anotacion__Group__3 )
            // InternalAngularDsl.g:3421:2: rule__Anotacion__Group__2__Impl rule__Anotacion__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Anotacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Anotacion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anotacion__Group__2"


    // $ANTLR start "rule__Anotacion__Group__2__Impl"
    // InternalAngularDsl.g:3428:1: rule__Anotacion__Group__2__Impl : ( ( rule__Anotacion__NameAssignment_2 ) ) ;
    public final void rule__Anotacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3432:1: ( ( ( rule__Anotacion__NameAssignment_2 ) ) )
            // InternalAngularDsl.g:3433:1: ( ( rule__Anotacion__NameAssignment_2 ) )
            {
            // InternalAngularDsl.g:3433:1: ( ( rule__Anotacion__NameAssignment_2 ) )
            // InternalAngularDsl.g:3434:2: ( rule__Anotacion__NameAssignment_2 )
            {
             before(grammarAccess.getAnotacionAccess().getNameAssignment_2()); 
            // InternalAngularDsl.g:3435:2: ( rule__Anotacion__NameAssignment_2 )
            // InternalAngularDsl.g:3435:3: rule__Anotacion__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Anotacion__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnotacionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anotacion__Group__2__Impl"


    // $ANTLR start "rule__Anotacion__Group__3"
    // InternalAngularDsl.g:3443:1: rule__Anotacion__Group__3 : rule__Anotacion__Group__3__Impl rule__Anotacion__Group__4 ;
    public final void rule__Anotacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3447:1: ( rule__Anotacion__Group__3__Impl rule__Anotacion__Group__4 )
            // InternalAngularDsl.g:3448:2: rule__Anotacion__Group__3__Impl rule__Anotacion__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Anotacion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Anotacion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anotacion__Group__3"


    // $ANTLR start "rule__Anotacion__Group__3__Impl"
    // InternalAngularDsl.g:3455:1: rule__Anotacion__Group__3__Impl : ( RULE_LLAVE_IZQUIERDA ) ;
    public final void rule__Anotacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3459:1: ( ( RULE_LLAVE_IZQUIERDA ) )
            // InternalAngularDsl.g:3460:1: ( RULE_LLAVE_IZQUIERDA )
            {
            // InternalAngularDsl.g:3460:1: ( RULE_LLAVE_IZQUIERDA )
            // InternalAngularDsl.g:3461:2: RULE_LLAVE_IZQUIERDA
            {
             before(grammarAccess.getAnotacionAccess().getLLAVE_IZQUIERDATerminalRuleCall_3()); 
            match(input,RULE_LLAVE_IZQUIERDA,FOLLOW_2); 
             after(grammarAccess.getAnotacionAccess().getLLAVE_IZQUIERDATerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anotacion__Group__3__Impl"


    // $ANTLR start "rule__Anotacion__Group__4"
    // InternalAngularDsl.g:3470:1: rule__Anotacion__Group__4 : rule__Anotacion__Group__4__Impl rule__Anotacion__Group__5 ;
    public final void rule__Anotacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3474:1: ( rule__Anotacion__Group__4__Impl rule__Anotacion__Group__5 )
            // InternalAngularDsl.g:3475:2: rule__Anotacion__Group__4__Impl rule__Anotacion__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Anotacion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Anotacion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anotacion__Group__4"


    // $ANTLR start "rule__Anotacion__Group__4__Impl"
    // InternalAngularDsl.g:3482:1: rule__Anotacion__Group__4__Impl : ( ( rule__Anotacion__PrimitivoAssignment_4 ) ) ;
    public final void rule__Anotacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3486:1: ( ( ( rule__Anotacion__PrimitivoAssignment_4 ) ) )
            // InternalAngularDsl.g:3487:1: ( ( rule__Anotacion__PrimitivoAssignment_4 ) )
            {
            // InternalAngularDsl.g:3487:1: ( ( rule__Anotacion__PrimitivoAssignment_4 ) )
            // InternalAngularDsl.g:3488:2: ( rule__Anotacion__PrimitivoAssignment_4 )
            {
             before(grammarAccess.getAnotacionAccess().getPrimitivoAssignment_4()); 
            // InternalAngularDsl.g:3489:2: ( rule__Anotacion__PrimitivoAssignment_4 )
            // InternalAngularDsl.g:3489:3: rule__Anotacion__PrimitivoAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Anotacion__PrimitivoAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAnotacionAccess().getPrimitivoAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anotacion__Group__4__Impl"


    // $ANTLR start "rule__Anotacion__Group__5"
    // InternalAngularDsl.g:3497:1: rule__Anotacion__Group__5 : rule__Anotacion__Group__5__Impl rule__Anotacion__Group__6 ;
    public final void rule__Anotacion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3501:1: ( rule__Anotacion__Group__5__Impl rule__Anotacion__Group__6 )
            // InternalAngularDsl.g:3502:2: rule__Anotacion__Group__5__Impl rule__Anotacion__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Anotacion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Anotacion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anotacion__Group__5"


    // $ANTLR start "rule__Anotacion__Group__5__Impl"
    // InternalAngularDsl.g:3509:1: rule__Anotacion__Group__5__Impl : ( RULE_COMA ) ;
    public final void rule__Anotacion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3513:1: ( ( RULE_COMA ) )
            // InternalAngularDsl.g:3514:1: ( RULE_COMA )
            {
            // InternalAngularDsl.g:3514:1: ( RULE_COMA )
            // InternalAngularDsl.g:3515:2: RULE_COMA
            {
             before(grammarAccess.getAnotacionAccess().getCOMATerminalRuleCall_5()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getAnotacionAccess().getCOMATerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anotacion__Group__5__Impl"


    // $ANTLR start "rule__Anotacion__Group__6"
    // InternalAngularDsl.g:3524:1: rule__Anotacion__Group__6 : rule__Anotacion__Group__6__Impl rule__Anotacion__Group__7 ;
    public final void rule__Anotacion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3528:1: ( rule__Anotacion__Group__6__Impl rule__Anotacion__Group__7 )
            // InternalAngularDsl.g:3529:2: rule__Anotacion__Group__6__Impl rule__Anotacion__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__Anotacion__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Anotacion__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anotacion__Group__6"


    // $ANTLR start "rule__Anotacion__Group__6__Impl"
    // InternalAngularDsl.g:3536:1: rule__Anotacion__Group__6__Impl : ( ( rule__Anotacion__ValueAssignment_6 ) ) ;
    public final void rule__Anotacion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3540:1: ( ( ( rule__Anotacion__ValueAssignment_6 ) ) )
            // InternalAngularDsl.g:3541:1: ( ( rule__Anotacion__ValueAssignment_6 ) )
            {
            // InternalAngularDsl.g:3541:1: ( ( rule__Anotacion__ValueAssignment_6 ) )
            // InternalAngularDsl.g:3542:2: ( rule__Anotacion__ValueAssignment_6 )
            {
             before(grammarAccess.getAnotacionAccess().getValueAssignment_6()); 
            // InternalAngularDsl.g:3543:2: ( rule__Anotacion__ValueAssignment_6 )
            // InternalAngularDsl.g:3543:3: rule__Anotacion__ValueAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Anotacion__ValueAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAnotacionAccess().getValueAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anotacion__Group__6__Impl"


    // $ANTLR start "rule__Anotacion__Group__7"
    // InternalAngularDsl.g:3551:1: rule__Anotacion__Group__7 : rule__Anotacion__Group__7__Impl ;
    public final void rule__Anotacion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3555:1: ( rule__Anotacion__Group__7__Impl )
            // InternalAngularDsl.g:3556:2: rule__Anotacion__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Anotacion__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anotacion__Group__7"


    // $ANTLR start "rule__Anotacion__Group__7__Impl"
    // InternalAngularDsl.g:3562:1: rule__Anotacion__Group__7__Impl : ( RULE_LLAVE_DERECHA ) ;
    public final void rule__Anotacion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3566:1: ( ( RULE_LLAVE_DERECHA ) )
            // InternalAngularDsl.g:3567:1: ( RULE_LLAVE_DERECHA )
            {
            // InternalAngularDsl.g:3567:1: ( RULE_LLAVE_DERECHA )
            // InternalAngularDsl.g:3568:2: RULE_LLAVE_DERECHA
            {
             before(grammarAccess.getAnotacionAccess().getLLAVE_DERECHATerminalRuleCall_7()); 
            match(input,RULE_LLAVE_DERECHA,FOLLOW_2); 
             after(grammarAccess.getAnotacionAccess().getLLAVE_DERECHATerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anotacion__Group__7__Impl"


    // $ANTLR start "rule__Template__Group__0"
    // InternalAngularDsl.g:3578:1: rule__Template__Group__0 : rule__Template__Group__0__Impl rule__Template__Group__1 ;
    public final void rule__Template__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3582:1: ( rule__Template__Group__0__Impl rule__Template__Group__1 )
            // InternalAngularDsl.g:3583:2: rule__Template__Group__0__Impl rule__Template__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Template__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Template__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__0"


    // $ANTLR start "rule__Template__Group__0__Impl"
    // InternalAngularDsl.g:3590:1: rule__Template__Group__0__Impl : ( () ) ;
    public final void rule__Template__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3594:1: ( ( () ) )
            // InternalAngularDsl.g:3595:1: ( () )
            {
            // InternalAngularDsl.g:3595:1: ( () )
            // InternalAngularDsl.g:3596:2: ()
            {
             before(grammarAccess.getTemplateAccess().getTemplateAction_0()); 
            // InternalAngularDsl.g:3597:2: ()
            // InternalAngularDsl.g:3597:3: 
            {
            }

             after(grammarAccess.getTemplateAccess().getTemplateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__0__Impl"


    // $ANTLR start "rule__Template__Group__1"
    // InternalAngularDsl.g:3605:1: rule__Template__Group__1 : rule__Template__Group__1__Impl rule__Template__Group__2 ;
    public final void rule__Template__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3609:1: ( rule__Template__Group__1__Impl rule__Template__Group__2 )
            // InternalAngularDsl.g:3610:2: rule__Template__Group__1__Impl rule__Template__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Template__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Template__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__1"


    // $ANTLR start "rule__Template__Group__1__Impl"
    // InternalAngularDsl.g:3617:1: rule__Template__Group__1__Impl : ( ( rule__Template__NameAssignment_1 ) ) ;
    public final void rule__Template__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3621:1: ( ( ( rule__Template__NameAssignment_1 ) ) )
            // InternalAngularDsl.g:3622:1: ( ( rule__Template__NameAssignment_1 ) )
            {
            // InternalAngularDsl.g:3622:1: ( ( rule__Template__NameAssignment_1 ) )
            // InternalAngularDsl.g:3623:2: ( rule__Template__NameAssignment_1 )
            {
             before(grammarAccess.getTemplateAccess().getNameAssignment_1()); 
            // InternalAngularDsl.g:3624:2: ( rule__Template__NameAssignment_1 )
            // InternalAngularDsl.g:3624:3: rule__Template__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Template__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__1__Impl"


    // $ANTLR start "rule__Template__Group__2"
    // InternalAngularDsl.g:3632:1: rule__Template__Group__2 : rule__Template__Group__2__Impl rule__Template__Group__3 ;
    public final void rule__Template__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3636:1: ( rule__Template__Group__2__Impl rule__Template__Group__3 )
            // InternalAngularDsl.g:3637:2: rule__Template__Group__2__Impl rule__Template__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Template__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Template__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__2"


    // $ANTLR start "rule__Template__Group__2__Impl"
    // InternalAngularDsl.g:3644:1: rule__Template__Group__2__Impl : ( '*' ) ;
    public final void rule__Template__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3648:1: ( ( '*' ) )
            // InternalAngularDsl.g:3649:1: ( '*' )
            {
            // InternalAngularDsl.g:3649:1: ( '*' )
            // InternalAngularDsl.g:3650:2: '*'
            {
             before(grammarAccess.getTemplateAccess().getAsteriskKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTemplateAccess().getAsteriskKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__2__Impl"


    // $ANTLR start "rule__Template__Group__3"
    // InternalAngularDsl.g:3659:1: rule__Template__Group__3 : rule__Template__Group__3__Impl ;
    public final void rule__Template__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3663:1: ( rule__Template__Group__3__Impl )
            // InternalAngularDsl.g:3664:2: rule__Template__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Template__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__3"


    // $ANTLR start "rule__Template__Group__3__Impl"
    // InternalAngularDsl.g:3670:1: rule__Template__Group__3__Impl : ( ( rule__Template__SentenciashtmlAssignment_3 )* ) ;
    public final void rule__Template__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3674:1: ( ( ( rule__Template__SentenciashtmlAssignment_3 )* ) )
            // InternalAngularDsl.g:3675:1: ( ( rule__Template__SentenciashtmlAssignment_3 )* )
            {
            // InternalAngularDsl.g:3675:1: ( ( rule__Template__SentenciashtmlAssignment_3 )* )
            // InternalAngularDsl.g:3676:2: ( rule__Template__SentenciashtmlAssignment_3 )*
            {
             before(grammarAccess.getTemplateAccess().getSentenciashtmlAssignment_3()); 
            // InternalAngularDsl.g:3677:2: ( rule__Template__SentenciashtmlAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_MENOR_QUE) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAngularDsl.g:3677:3: rule__Template__SentenciashtmlAssignment_3
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Template__SentenciashtmlAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getTemplateAccess().getSentenciashtmlAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__3__Impl"


    // $ANTLR start "rule__SentenciaHTML__Group__0"
    // InternalAngularDsl.g:3686:1: rule__SentenciaHTML__Group__0 : rule__SentenciaHTML__Group__0__Impl rule__SentenciaHTML__Group__1 ;
    public final void rule__SentenciaHTML__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3690:1: ( rule__SentenciaHTML__Group__0__Impl rule__SentenciaHTML__Group__1 )
            // InternalAngularDsl.g:3691:2: rule__SentenciaHTML__Group__0__Impl rule__SentenciaHTML__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__SentenciaHTML__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentenciaHTML__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group__0"


    // $ANTLR start "rule__SentenciaHTML__Group__0__Impl"
    // InternalAngularDsl.g:3698:1: rule__SentenciaHTML__Group__0__Impl : ( () ) ;
    public final void rule__SentenciaHTML__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3702:1: ( ( () ) )
            // InternalAngularDsl.g:3703:1: ( () )
            {
            // InternalAngularDsl.g:3703:1: ( () )
            // InternalAngularDsl.g:3704:2: ()
            {
             before(grammarAccess.getSentenciaHTMLAccess().getSentenciaHTMLAction_0()); 
            // InternalAngularDsl.g:3705:2: ()
            // InternalAngularDsl.g:3705:3: 
            {
            }

             after(grammarAccess.getSentenciaHTMLAccess().getSentenciaHTMLAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group__0__Impl"


    // $ANTLR start "rule__SentenciaHTML__Group__1"
    // InternalAngularDsl.g:3713:1: rule__SentenciaHTML__Group__1 : rule__SentenciaHTML__Group__1__Impl rule__SentenciaHTML__Group__2 ;
    public final void rule__SentenciaHTML__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3717:1: ( rule__SentenciaHTML__Group__1__Impl rule__SentenciaHTML__Group__2 )
            // InternalAngularDsl.g:3718:2: rule__SentenciaHTML__Group__1__Impl rule__SentenciaHTML__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__SentenciaHTML__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentenciaHTML__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group__1"


    // $ANTLR start "rule__SentenciaHTML__Group__1__Impl"
    // InternalAngularDsl.g:3725:1: rule__SentenciaHTML__Group__1__Impl : ( RULE_MENOR_QUE ) ;
    public final void rule__SentenciaHTML__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3729:1: ( ( RULE_MENOR_QUE ) )
            // InternalAngularDsl.g:3730:1: ( RULE_MENOR_QUE )
            {
            // InternalAngularDsl.g:3730:1: ( RULE_MENOR_QUE )
            // InternalAngularDsl.g:3731:2: RULE_MENOR_QUE
            {
             before(grammarAccess.getSentenciaHTMLAccess().getMENOR_QUETerminalRuleCall_1()); 
            match(input,RULE_MENOR_QUE,FOLLOW_2); 
             after(grammarAccess.getSentenciaHTMLAccess().getMENOR_QUETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group__1__Impl"


    // $ANTLR start "rule__SentenciaHTML__Group__2"
    // InternalAngularDsl.g:3740:1: rule__SentenciaHTML__Group__2 : rule__SentenciaHTML__Group__2__Impl rule__SentenciaHTML__Group__3 ;
    public final void rule__SentenciaHTML__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3744:1: ( rule__SentenciaHTML__Group__2__Impl rule__SentenciaHTML__Group__3 )
            // InternalAngularDsl.g:3745:2: rule__SentenciaHTML__Group__2__Impl rule__SentenciaHTML__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__SentenciaHTML__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentenciaHTML__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group__2"


    // $ANTLR start "rule__SentenciaHTML__Group__2__Impl"
    // InternalAngularDsl.g:3752:1: rule__SentenciaHTML__Group__2__Impl : ( ( rule__SentenciaHTML__NameAssignment_2 ) ) ;
    public final void rule__SentenciaHTML__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3756:1: ( ( ( rule__SentenciaHTML__NameAssignment_2 ) ) )
            // InternalAngularDsl.g:3757:1: ( ( rule__SentenciaHTML__NameAssignment_2 ) )
            {
            // InternalAngularDsl.g:3757:1: ( ( rule__SentenciaHTML__NameAssignment_2 ) )
            // InternalAngularDsl.g:3758:2: ( rule__SentenciaHTML__NameAssignment_2 )
            {
             before(grammarAccess.getSentenciaHTMLAccess().getNameAssignment_2()); 
            // InternalAngularDsl.g:3759:2: ( rule__SentenciaHTML__NameAssignment_2 )
            // InternalAngularDsl.g:3759:3: rule__SentenciaHTML__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SentenciaHTML__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSentenciaHTMLAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group__2__Impl"


    // $ANTLR start "rule__SentenciaHTML__Group__3"
    // InternalAngularDsl.g:3767:1: rule__SentenciaHTML__Group__3 : rule__SentenciaHTML__Group__3__Impl rule__SentenciaHTML__Group__4 ;
    public final void rule__SentenciaHTML__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3771:1: ( rule__SentenciaHTML__Group__3__Impl rule__SentenciaHTML__Group__4 )
            // InternalAngularDsl.g:3772:2: rule__SentenciaHTML__Group__3__Impl rule__SentenciaHTML__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__SentenciaHTML__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentenciaHTML__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group__3"


    // $ANTLR start "rule__SentenciaHTML__Group__3__Impl"
    // InternalAngularDsl.g:3779:1: rule__SentenciaHTML__Group__3__Impl : ( ( rule__SentenciaHTML__PropiedadesAssignment_3 )* ) ;
    public final void rule__SentenciaHTML__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3783:1: ( ( ( rule__SentenciaHTML__PropiedadesAssignment_3 )* ) )
            // InternalAngularDsl.g:3784:1: ( ( rule__SentenciaHTML__PropiedadesAssignment_3 )* )
            {
            // InternalAngularDsl.g:3784:1: ( ( rule__SentenciaHTML__PropiedadesAssignment_3 )* )
            // InternalAngularDsl.g:3785:2: ( rule__SentenciaHTML__PropiedadesAssignment_3 )*
            {
             before(grammarAccess.getSentenciaHTMLAccess().getPropiedadesAssignment_3()); 
            // InternalAngularDsl.g:3786:2: ( rule__SentenciaHTML__PropiedadesAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAngularDsl.g:3786:3: rule__SentenciaHTML__PropiedadesAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SentenciaHTML__PropiedadesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSentenciaHTMLAccess().getPropiedadesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group__3__Impl"


    // $ANTLR start "rule__SentenciaHTML__Group__4"
    // InternalAngularDsl.g:3794:1: rule__SentenciaHTML__Group__4 : rule__SentenciaHTML__Group__4__Impl rule__SentenciaHTML__Group__5 ;
    public final void rule__SentenciaHTML__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3798:1: ( rule__SentenciaHTML__Group__4__Impl rule__SentenciaHTML__Group__5 )
            // InternalAngularDsl.g:3799:2: rule__SentenciaHTML__Group__4__Impl rule__SentenciaHTML__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__SentenciaHTML__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentenciaHTML__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group__4"


    // $ANTLR start "rule__SentenciaHTML__Group__4__Impl"
    // InternalAngularDsl.g:3806:1: rule__SentenciaHTML__Group__4__Impl : ( ( rule__SentenciaHTML__DirectivasAssignment_4 )* ) ;
    public final void rule__SentenciaHTML__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3810:1: ( ( ( rule__SentenciaHTML__DirectivasAssignment_4 )* ) )
            // InternalAngularDsl.g:3811:1: ( ( rule__SentenciaHTML__DirectivasAssignment_4 )* )
            {
            // InternalAngularDsl.g:3811:1: ( ( rule__SentenciaHTML__DirectivasAssignment_4 )* )
            // InternalAngularDsl.g:3812:2: ( rule__SentenciaHTML__DirectivasAssignment_4 )*
            {
             before(grammarAccess.getSentenciaHTMLAccess().getDirectivasAssignment_4()); 
            // InternalAngularDsl.g:3813:2: ( rule__SentenciaHTML__DirectivasAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==40) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAngularDsl.g:3813:3: rule__SentenciaHTML__DirectivasAssignment_4
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__SentenciaHTML__DirectivasAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSentenciaHTMLAccess().getDirectivasAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group__4__Impl"


    // $ANTLR start "rule__SentenciaHTML__Group__5"
    // InternalAngularDsl.g:3821:1: rule__SentenciaHTML__Group__5 : rule__SentenciaHTML__Group__5__Impl rule__SentenciaHTML__Group__6 ;
    public final void rule__SentenciaHTML__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3825:1: ( rule__SentenciaHTML__Group__5__Impl rule__SentenciaHTML__Group__6 )
            // InternalAngularDsl.g:3826:2: rule__SentenciaHTML__Group__5__Impl rule__SentenciaHTML__Group__6
            {
            pushFollow(FOLLOW_37);
            rule__SentenciaHTML__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentenciaHTML__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group__5"


    // $ANTLR start "rule__SentenciaHTML__Group__5__Impl"
    // InternalAngularDsl.g:3833:1: rule__SentenciaHTML__Group__5__Impl : ( ( RULE_SLASH )* ) ;
    public final void rule__SentenciaHTML__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3837:1: ( ( ( RULE_SLASH )* ) )
            // InternalAngularDsl.g:3838:1: ( ( RULE_SLASH )* )
            {
            // InternalAngularDsl.g:3838:1: ( ( RULE_SLASH )* )
            // InternalAngularDsl.g:3839:2: ( RULE_SLASH )*
            {
             before(grammarAccess.getSentenciaHTMLAccess().getSLASHTerminalRuleCall_5()); 
            // InternalAngularDsl.g:3840:2: ( RULE_SLASH )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_SLASH) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAngularDsl.g:3840:3: RULE_SLASH
            	    {
            	    match(input,RULE_SLASH,FOLLOW_39); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSentenciaHTMLAccess().getSLASHTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group__5__Impl"


    // $ANTLR start "rule__SentenciaHTML__Group__6"
    // InternalAngularDsl.g:3848:1: rule__SentenciaHTML__Group__6 : rule__SentenciaHTML__Group__6__Impl rule__SentenciaHTML__Group__7 ;
    public final void rule__SentenciaHTML__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3852:1: ( rule__SentenciaHTML__Group__6__Impl rule__SentenciaHTML__Group__7 )
            // InternalAngularDsl.g:3853:2: rule__SentenciaHTML__Group__6__Impl rule__SentenciaHTML__Group__7
            {
            pushFollow(FOLLOW_40);
            rule__SentenciaHTML__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentenciaHTML__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group__6"


    // $ANTLR start "rule__SentenciaHTML__Group__6__Impl"
    // InternalAngularDsl.g:3860:1: rule__SentenciaHTML__Group__6__Impl : ( RULE_MAYOR_QUE ) ;
    public final void rule__SentenciaHTML__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3864:1: ( ( RULE_MAYOR_QUE ) )
            // InternalAngularDsl.g:3865:1: ( RULE_MAYOR_QUE )
            {
            // InternalAngularDsl.g:3865:1: ( RULE_MAYOR_QUE )
            // InternalAngularDsl.g:3866:2: RULE_MAYOR_QUE
            {
             before(grammarAccess.getSentenciaHTMLAccess().getMAYOR_QUETerminalRuleCall_6()); 
            match(input,RULE_MAYOR_QUE,FOLLOW_2); 
             after(grammarAccess.getSentenciaHTMLAccess().getMAYOR_QUETerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group__6__Impl"


    // $ANTLR start "rule__SentenciaHTML__Group__7"
    // InternalAngularDsl.g:3875:1: rule__SentenciaHTML__Group__7 : rule__SentenciaHTML__Group__7__Impl rule__SentenciaHTML__Group__8 ;
    public final void rule__SentenciaHTML__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3879:1: ( rule__SentenciaHTML__Group__7__Impl rule__SentenciaHTML__Group__8 )
            // InternalAngularDsl.g:3880:2: rule__SentenciaHTML__Group__7__Impl rule__SentenciaHTML__Group__8
            {
            pushFollow(FOLLOW_40);
            rule__SentenciaHTML__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentenciaHTML__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group__7"


    // $ANTLR start "rule__SentenciaHTML__Group__7__Impl"
    // InternalAngularDsl.g:3887:1: rule__SentenciaHTML__Group__7__Impl : ( ( rule__SentenciaHTML__CurlybracesAssignment_7 )* ) ;
    public final void rule__SentenciaHTML__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3891:1: ( ( ( rule__SentenciaHTML__CurlybracesAssignment_7 )* ) )
            // InternalAngularDsl.g:3892:1: ( ( rule__SentenciaHTML__CurlybracesAssignment_7 )* )
            {
            // InternalAngularDsl.g:3892:1: ( ( rule__SentenciaHTML__CurlybracesAssignment_7 )* )
            // InternalAngularDsl.g:3893:2: ( rule__SentenciaHTML__CurlybracesAssignment_7 )*
            {
             before(grammarAccess.getSentenciaHTMLAccess().getCurlybracesAssignment_7()); 
            // InternalAngularDsl.g:3894:2: ( rule__SentenciaHTML__CurlybracesAssignment_7 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_LLAVE_IZQUIERDA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAngularDsl.g:3894:3: rule__SentenciaHTML__CurlybracesAssignment_7
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__SentenciaHTML__CurlybracesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getSentenciaHTMLAccess().getCurlybracesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group__7__Impl"


    // $ANTLR start "rule__SentenciaHTML__Group__8"
    // InternalAngularDsl.g:3902:1: rule__SentenciaHTML__Group__8 : rule__SentenciaHTML__Group__8__Impl rule__SentenciaHTML__Group__9 ;
    public final void rule__SentenciaHTML__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3906:1: ( rule__SentenciaHTML__Group__8__Impl rule__SentenciaHTML__Group__9 )
            // InternalAngularDsl.g:3907:2: rule__SentenciaHTML__Group__8__Impl rule__SentenciaHTML__Group__9
            {
            pushFollow(FOLLOW_40);
            rule__SentenciaHTML__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentenciaHTML__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group__8"


    // $ANTLR start "rule__SentenciaHTML__Group__8__Impl"
    // InternalAngularDsl.g:3914:1: rule__SentenciaHTML__Group__8__Impl : ( ( rule__SentenciaHTML__SentenciashtmlAssignment_8 )* ) ;
    public final void rule__SentenciaHTML__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3918:1: ( ( ( rule__SentenciaHTML__SentenciashtmlAssignment_8 )* ) )
            // InternalAngularDsl.g:3919:1: ( ( rule__SentenciaHTML__SentenciashtmlAssignment_8 )* )
            {
            // InternalAngularDsl.g:3919:1: ( ( rule__SentenciaHTML__SentenciashtmlAssignment_8 )* )
            // InternalAngularDsl.g:3920:2: ( rule__SentenciaHTML__SentenciashtmlAssignment_8 )*
            {
             before(grammarAccess.getSentenciaHTMLAccess().getSentenciashtmlAssignment_8()); 
            // InternalAngularDsl.g:3921:2: ( rule__SentenciaHTML__SentenciashtmlAssignment_8 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAngularDsl.g:3921:3: rule__SentenciaHTML__SentenciashtmlAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SentenciaHTML__SentenciashtmlAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getSentenciaHTMLAccess().getSentenciashtmlAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group__8__Impl"


    // $ANTLR start "rule__SentenciaHTML__Group__9"
    // InternalAngularDsl.g:3929:1: rule__SentenciaHTML__Group__9 : rule__SentenciaHTML__Group__9__Impl ;
    public final void rule__SentenciaHTML__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3933:1: ( rule__SentenciaHTML__Group__9__Impl )
            // InternalAngularDsl.g:3934:2: rule__SentenciaHTML__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SentenciaHTML__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group__9"


    // $ANTLR start "rule__SentenciaHTML__Group__9__Impl"
    // InternalAngularDsl.g:3940:1: rule__SentenciaHTML__Group__9__Impl : ( ( rule__SentenciaHTML__Group_9__0 )? ) ;
    public final void rule__SentenciaHTML__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3944:1: ( ( ( rule__SentenciaHTML__Group_9__0 )? ) )
            // InternalAngularDsl.g:3945:1: ( ( rule__SentenciaHTML__Group_9__0 )? )
            {
            // InternalAngularDsl.g:3945:1: ( ( rule__SentenciaHTML__Group_9__0 )? )
            // InternalAngularDsl.g:3946:2: ( rule__SentenciaHTML__Group_9__0 )?
            {
             before(grammarAccess.getSentenciaHTMLAccess().getGroup_9()); 
            // InternalAngularDsl.g:3947:2: ( rule__SentenciaHTML__Group_9__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_MENOR_QUE) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==RULE_SLASH) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalAngularDsl.g:3947:3: rule__SentenciaHTML__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SentenciaHTML__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSentenciaHTMLAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group__9__Impl"


    // $ANTLR start "rule__SentenciaHTML__Group_9__0"
    // InternalAngularDsl.g:3956:1: rule__SentenciaHTML__Group_9__0 : rule__SentenciaHTML__Group_9__0__Impl rule__SentenciaHTML__Group_9__1 ;
    public final void rule__SentenciaHTML__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3960:1: ( rule__SentenciaHTML__Group_9__0__Impl rule__SentenciaHTML__Group_9__1 )
            // InternalAngularDsl.g:3961:2: rule__SentenciaHTML__Group_9__0__Impl rule__SentenciaHTML__Group_9__1
            {
            pushFollow(FOLLOW_42);
            rule__SentenciaHTML__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentenciaHTML__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group_9__0"


    // $ANTLR start "rule__SentenciaHTML__Group_9__0__Impl"
    // InternalAngularDsl.g:3968:1: rule__SentenciaHTML__Group_9__0__Impl : ( RULE_MENOR_QUE ) ;
    public final void rule__SentenciaHTML__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3972:1: ( ( RULE_MENOR_QUE ) )
            // InternalAngularDsl.g:3973:1: ( RULE_MENOR_QUE )
            {
            // InternalAngularDsl.g:3973:1: ( RULE_MENOR_QUE )
            // InternalAngularDsl.g:3974:2: RULE_MENOR_QUE
            {
             before(grammarAccess.getSentenciaHTMLAccess().getMENOR_QUETerminalRuleCall_9_0()); 
            match(input,RULE_MENOR_QUE,FOLLOW_2); 
             after(grammarAccess.getSentenciaHTMLAccess().getMENOR_QUETerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group_9__0__Impl"


    // $ANTLR start "rule__SentenciaHTML__Group_9__1"
    // InternalAngularDsl.g:3983:1: rule__SentenciaHTML__Group_9__1 : rule__SentenciaHTML__Group_9__1__Impl rule__SentenciaHTML__Group_9__2 ;
    public final void rule__SentenciaHTML__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3987:1: ( rule__SentenciaHTML__Group_9__1__Impl rule__SentenciaHTML__Group_9__2 )
            // InternalAngularDsl.g:3988:2: rule__SentenciaHTML__Group_9__1__Impl rule__SentenciaHTML__Group_9__2
            {
            pushFollow(FOLLOW_43);
            rule__SentenciaHTML__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentenciaHTML__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group_9__1"


    // $ANTLR start "rule__SentenciaHTML__Group_9__1__Impl"
    // InternalAngularDsl.g:3995:1: rule__SentenciaHTML__Group_9__1__Impl : ( RULE_SLASH ) ;
    public final void rule__SentenciaHTML__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3999:1: ( ( RULE_SLASH ) )
            // InternalAngularDsl.g:4000:1: ( RULE_SLASH )
            {
            // InternalAngularDsl.g:4000:1: ( RULE_SLASH )
            // InternalAngularDsl.g:4001:2: RULE_SLASH
            {
             before(grammarAccess.getSentenciaHTMLAccess().getSLASHTerminalRuleCall_9_1()); 
            match(input,RULE_SLASH,FOLLOW_2); 
             after(grammarAccess.getSentenciaHTMLAccess().getSLASHTerminalRuleCall_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group_9__1__Impl"


    // $ANTLR start "rule__SentenciaHTML__Group_9__2"
    // InternalAngularDsl.g:4010:1: rule__SentenciaHTML__Group_9__2 : rule__SentenciaHTML__Group_9__2__Impl rule__SentenciaHTML__Group_9__3 ;
    public final void rule__SentenciaHTML__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4014:1: ( rule__SentenciaHTML__Group_9__2__Impl rule__SentenciaHTML__Group_9__3 )
            // InternalAngularDsl.g:4015:2: rule__SentenciaHTML__Group_9__2__Impl rule__SentenciaHTML__Group_9__3
            {
            pushFollow(FOLLOW_44);
            rule__SentenciaHTML__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentenciaHTML__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group_9__2"


    // $ANTLR start "rule__SentenciaHTML__Group_9__2__Impl"
    // InternalAngularDsl.g:4022:1: rule__SentenciaHTML__Group_9__2__Impl : ( RULE_STRING ) ;
    public final void rule__SentenciaHTML__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4026:1: ( ( RULE_STRING ) )
            // InternalAngularDsl.g:4027:1: ( RULE_STRING )
            {
            // InternalAngularDsl.g:4027:1: ( RULE_STRING )
            // InternalAngularDsl.g:4028:2: RULE_STRING
            {
             before(grammarAccess.getSentenciaHTMLAccess().getSTRINGTerminalRuleCall_9_2()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSentenciaHTMLAccess().getSTRINGTerminalRuleCall_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group_9__2__Impl"


    // $ANTLR start "rule__SentenciaHTML__Group_9__3"
    // InternalAngularDsl.g:4037:1: rule__SentenciaHTML__Group_9__3 : rule__SentenciaHTML__Group_9__3__Impl ;
    public final void rule__SentenciaHTML__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4041:1: ( rule__SentenciaHTML__Group_9__3__Impl )
            // InternalAngularDsl.g:4042:2: rule__SentenciaHTML__Group_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SentenciaHTML__Group_9__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group_9__3"


    // $ANTLR start "rule__SentenciaHTML__Group_9__3__Impl"
    // InternalAngularDsl.g:4048:1: rule__SentenciaHTML__Group_9__3__Impl : ( RULE_MAYOR_QUE ) ;
    public final void rule__SentenciaHTML__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4052:1: ( ( RULE_MAYOR_QUE ) )
            // InternalAngularDsl.g:4053:1: ( RULE_MAYOR_QUE )
            {
            // InternalAngularDsl.g:4053:1: ( RULE_MAYOR_QUE )
            // InternalAngularDsl.g:4054:2: RULE_MAYOR_QUE
            {
             before(grammarAccess.getSentenciaHTMLAccess().getMAYOR_QUETerminalRuleCall_9_3()); 
            match(input,RULE_MAYOR_QUE,FOLLOW_2); 
             after(grammarAccess.getSentenciaHTMLAccess().getMAYOR_QUETerminalRuleCall_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__Group_9__3__Impl"


    // $ANTLR start "rule__Directiva__Group__0"
    // InternalAngularDsl.g:4064:1: rule__Directiva__Group__0 : rule__Directiva__Group__0__Impl rule__Directiva__Group__1 ;
    public final void rule__Directiva__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4068:1: ( rule__Directiva__Group__0__Impl rule__Directiva__Group__1 )
            // InternalAngularDsl.g:4069:2: rule__Directiva__Group__0__Impl rule__Directiva__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__Directiva__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Directiva__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directiva__Group__0"


    // $ANTLR start "rule__Directiva__Group__0__Impl"
    // InternalAngularDsl.g:4076:1: rule__Directiva__Group__0__Impl : ( () ) ;
    public final void rule__Directiva__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4080:1: ( ( () ) )
            // InternalAngularDsl.g:4081:1: ( () )
            {
            // InternalAngularDsl.g:4081:1: ( () )
            // InternalAngularDsl.g:4082:2: ()
            {
             before(grammarAccess.getDirectivaAccess().getDirectivaAction_0()); 
            // InternalAngularDsl.g:4083:2: ()
            // InternalAngularDsl.g:4083:3: 
            {
            }

             after(grammarAccess.getDirectivaAccess().getDirectivaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directiva__Group__0__Impl"


    // $ANTLR start "rule__Directiva__Group__1"
    // InternalAngularDsl.g:4091:1: rule__Directiva__Group__1 : rule__Directiva__Group__1__Impl rule__Directiva__Group__2 ;
    public final void rule__Directiva__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4095:1: ( rule__Directiva__Group__1__Impl rule__Directiva__Group__2 )
            // InternalAngularDsl.g:4096:2: rule__Directiva__Group__1__Impl rule__Directiva__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Directiva__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Directiva__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directiva__Group__1"


    // $ANTLR start "rule__Directiva__Group__1__Impl"
    // InternalAngularDsl.g:4103:1: rule__Directiva__Group__1__Impl : ( 'ng-' ) ;
    public final void rule__Directiva__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4107:1: ( ( 'ng-' ) )
            // InternalAngularDsl.g:4108:1: ( 'ng-' )
            {
            // InternalAngularDsl.g:4108:1: ( 'ng-' )
            // InternalAngularDsl.g:4109:2: 'ng-'
            {
             before(grammarAccess.getDirectivaAccess().getNgKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDirectivaAccess().getNgKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directiva__Group__1__Impl"


    // $ANTLR start "rule__Directiva__Group__2"
    // InternalAngularDsl.g:4118:1: rule__Directiva__Group__2 : rule__Directiva__Group__2__Impl rule__Directiva__Group__3 ;
    public final void rule__Directiva__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4122:1: ( rule__Directiva__Group__2__Impl rule__Directiva__Group__3 )
            // InternalAngularDsl.g:4123:2: rule__Directiva__Group__2__Impl rule__Directiva__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Directiva__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Directiva__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directiva__Group__2"


    // $ANTLR start "rule__Directiva__Group__2__Impl"
    // InternalAngularDsl.g:4130:1: rule__Directiva__Group__2__Impl : ( ( rule__Directiva__NameAssignment_2 ) ) ;
    public final void rule__Directiva__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4134:1: ( ( ( rule__Directiva__NameAssignment_2 ) ) )
            // InternalAngularDsl.g:4135:1: ( ( rule__Directiva__NameAssignment_2 ) )
            {
            // InternalAngularDsl.g:4135:1: ( ( rule__Directiva__NameAssignment_2 ) )
            // InternalAngularDsl.g:4136:2: ( rule__Directiva__NameAssignment_2 )
            {
             before(grammarAccess.getDirectivaAccess().getNameAssignment_2()); 
            // InternalAngularDsl.g:4137:2: ( rule__Directiva__NameAssignment_2 )
            // InternalAngularDsl.g:4137:3: rule__Directiva__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Directiva__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDirectivaAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directiva__Group__2__Impl"


    // $ANTLR start "rule__Directiva__Group__3"
    // InternalAngularDsl.g:4145:1: rule__Directiva__Group__3 : rule__Directiva__Group__3__Impl rule__Directiva__Group__4 ;
    public final void rule__Directiva__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4149:1: ( rule__Directiva__Group__3__Impl rule__Directiva__Group__4 )
            // InternalAngularDsl.g:4150:2: rule__Directiva__Group__3__Impl rule__Directiva__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Directiva__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Directiva__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directiva__Group__3"


    // $ANTLR start "rule__Directiva__Group__3__Impl"
    // InternalAngularDsl.g:4157:1: rule__Directiva__Group__3__Impl : ( RULE_IGUAL ) ;
    public final void rule__Directiva__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4161:1: ( ( RULE_IGUAL ) )
            // InternalAngularDsl.g:4162:1: ( RULE_IGUAL )
            {
            // InternalAngularDsl.g:4162:1: ( RULE_IGUAL )
            // InternalAngularDsl.g:4163:2: RULE_IGUAL
            {
             before(grammarAccess.getDirectivaAccess().getIGUALTerminalRuleCall_3()); 
            match(input,RULE_IGUAL,FOLLOW_2); 
             after(grammarAccess.getDirectivaAccess().getIGUALTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directiva__Group__3__Impl"


    // $ANTLR start "rule__Directiva__Group__4"
    // InternalAngularDsl.g:4172:1: rule__Directiva__Group__4 : rule__Directiva__Group__4__Impl rule__Directiva__Group__5 ;
    public final void rule__Directiva__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4176:1: ( rule__Directiva__Group__4__Impl rule__Directiva__Group__5 )
            // InternalAngularDsl.g:4177:2: rule__Directiva__Group__4__Impl rule__Directiva__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Directiva__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Directiva__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directiva__Group__4"


    // $ANTLR start "rule__Directiva__Group__4__Impl"
    // InternalAngularDsl.g:4184:1: rule__Directiva__Group__4__Impl : ( ( rule__Directiva__CurlybracesAssignment_4 )? ) ;
    public final void rule__Directiva__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4188:1: ( ( ( rule__Directiva__CurlybracesAssignment_4 )? ) )
            // InternalAngularDsl.g:4189:1: ( ( rule__Directiva__CurlybracesAssignment_4 )? )
            {
            // InternalAngularDsl.g:4189:1: ( ( rule__Directiva__CurlybracesAssignment_4 )? )
            // InternalAngularDsl.g:4190:2: ( rule__Directiva__CurlybracesAssignment_4 )?
            {
             before(grammarAccess.getDirectivaAccess().getCurlybracesAssignment_4()); 
            // InternalAngularDsl.g:4191:2: ( rule__Directiva__CurlybracesAssignment_4 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                int LA22_1 = input.LA(2);

                if ( ((LA22_1>=RULE_STRING && LA22_1<=RULE_ID)) ) {
                    alt22=1;
                }
            }
            else if ( (LA22_0==RULE_ID) ) {
                int LA22_2 = input.LA(2);

                if ( ((LA22_2>=RULE_STRING && LA22_2<=RULE_ID)) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalAngularDsl.g:4191:3: rule__Directiva__CurlybracesAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Directiva__CurlybracesAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDirectivaAccess().getCurlybracesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directiva__Group__4__Impl"


    // $ANTLR start "rule__Directiva__Group__5"
    // InternalAngularDsl.g:4199:1: rule__Directiva__Group__5 : rule__Directiva__Group__5__Impl ;
    public final void rule__Directiva__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4203:1: ( rule__Directiva__Group__5__Impl )
            // InternalAngularDsl.g:4204:2: rule__Directiva__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Directiva__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directiva__Group__5"


    // $ANTLR start "rule__Directiva__Group__5__Impl"
    // InternalAngularDsl.g:4210:1: rule__Directiva__Group__5__Impl : ( ( rule__Directiva__ReferenciaAssignment_5 ) ) ;
    public final void rule__Directiva__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4214:1: ( ( ( rule__Directiva__ReferenciaAssignment_5 ) ) )
            // InternalAngularDsl.g:4215:1: ( ( rule__Directiva__ReferenciaAssignment_5 ) )
            {
            // InternalAngularDsl.g:4215:1: ( ( rule__Directiva__ReferenciaAssignment_5 ) )
            // InternalAngularDsl.g:4216:2: ( rule__Directiva__ReferenciaAssignment_5 )
            {
             before(grammarAccess.getDirectivaAccess().getReferenciaAssignment_5()); 
            // InternalAngularDsl.g:4217:2: ( rule__Directiva__ReferenciaAssignment_5 )
            // InternalAngularDsl.g:4217:3: rule__Directiva__ReferenciaAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Directiva__ReferenciaAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDirectivaAccess().getReferenciaAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directiva__Group__5__Impl"


    // $ANTLR start "rule__Propiedad__Group__0"
    // InternalAngularDsl.g:4226:1: rule__Propiedad__Group__0 : rule__Propiedad__Group__0__Impl rule__Propiedad__Group__1 ;
    public final void rule__Propiedad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4230:1: ( rule__Propiedad__Group__0__Impl rule__Propiedad__Group__1 )
            // InternalAngularDsl.g:4231:2: rule__Propiedad__Group__0__Impl rule__Propiedad__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Propiedad__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Propiedad__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propiedad__Group__0"


    // $ANTLR start "rule__Propiedad__Group__0__Impl"
    // InternalAngularDsl.g:4238:1: rule__Propiedad__Group__0__Impl : ( () ) ;
    public final void rule__Propiedad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4242:1: ( ( () ) )
            // InternalAngularDsl.g:4243:1: ( () )
            {
            // InternalAngularDsl.g:4243:1: ( () )
            // InternalAngularDsl.g:4244:2: ()
            {
             before(grammarAccess.getPropiedadAccess().getPropiedadAction_0()); 
            // InternalAngularDsl.g:4245:2: ()
            // InternalAngularDsl.g:4245:3: 
            {
            }

             after(grammarAccess.getPropiedadAccess().getPropiedadAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propiedad__Group__0__Impl"


    // $ANTLR start "rule__Propiedad__Group__1"
    // InternalAngularDsl.g:4253:1: rule__Propiedad__Group__1 : rule__Propiedad__Group__1__Impl rule__Propiedad__Group__2 ;
    public final void rule__Propiedad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4257:1: ( rule__Propiedad__Group__1__Impl rule__Propiedad__Group__2 )
            // InternalAngularDsl.g:4258:2: rule__Propiedad__Group__1__Impl rule__Propiedad__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Propiedad__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Propiedad__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propiedad__Group__1"


    // $ANTLR start "rule__Propiedad__Group__1__Impl"
    // InternalAngularDsl.g:4265:1: rule__Propiedad__Group__1__Impl : ( ( rule__Propiedad__NameAssignment_1 ) ) ;
    public final void rule__Propiedad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4269:1: ( ( ( rule__Propiedad__NameAssignment_1 ) ) )
            // InternalAngularDsl.g:4270:1: ( ( rule__Propiedad__NameAssignment_1 ) )
            {
            // InternalAngularDsl.g:4270:1: ( ( rule__Propiedad__NameAssignment_1 ) )
            // InternalAngularDsl.g:4271:2: ( rule__Propiedad__NameAssignment_1 )
            {
             before(grammarAccess.getPropiedadAccess().getNameAssignment_1()); 
            // InternalAngularDsl.g:4272:2: ( rule__Propiedad__NameAssignment_1 )
            // InternalAngularDsl.g:4272:3: rule__Propiedad__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Propiedad__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropiedadAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propiedad__Group__1__Impl"


    // $ANTLR start "rule__Propiedad__Group__2"
    // InternalAngularDsl.g:4280:1: rule__Propiedad__Group__2 : rule__Propiedad__Group__2__Impl rule__Propiedad__Group__3 ;
    public final void rule__Propiedad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4284:1: ( rule__Propiedad__Group__2__Impl rule__Propiedad__Group__3 )
            // InternalAngularDsl.g:4285:2: rule__Propiedad__Group__2__Impl rule__Propiedad__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__Propiedad__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Propiedad__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propiedad__Group__2"


    // $ANTLR start "rule__Propiedad__Group__2__Impl"
    // InternalAngularDsl.g:4292:1: rule__Propiedad__Group__2__Impl : ( RULE_IGUAL ) ;
    public final void rule__Propiedad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4296:1: ( ( RULE_IGUAL ) )
            // InternalAngularDsl.g:4297:1: ( RULE_IGUAL )
            {
            // InternalAngularDsl.g:4297:1: ( RULE_IGUAL )
            // InternalAngularDsl.g:4298:2: RULE_IGUAL
            {
             before(grammarAccess.getPropiedadAccess().getIGUALTerminalRuleCall_2()); 
            match(input,RULE_IGUAL,FOLLOW_2); 
             after(grammarAccess.getPropiedadAccess().getIGUALTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propiedad__Group__2__Impl"


    // $ANTLR start "rule__Propiedad__Group__3"
    // InternalAngularDsl.g:4307:1: rule__Propiedad__Group__3 : rule__Propiedad__Group__3__Impl ;
    public final void rule__Propiedad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4311:1: ( rule__Propiedad__Group__3__Impl )
            // InternalAngularDsl.g:4312:2: rule__Propiedad__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Propiedad__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propiedad__Group__3"


    // $ANTLR start "rule__Propiedad__Group__3__Impl"
    // InternalAngularDsl.g:4318:1: rule__Propiedad__Group__3__Impl : ( RULE_STRING ) ;
    public final void rule__Propiedad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4322:1: ( ( RULE_STRING ) )
            // InternalAngularDsl.g:4323:1: ( RULE_STRING )
            {
            // InternalAngularDsl.g:4323:1: ( RULE_STRING )
            // InternalAngularDsl.g:4324:2: RULE_STRING
            {
             before(grammarAccess.getPropiedadAccess().getSTRINGTerminalRuleCall_3()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPropiedadAccess().getSTRINGTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propiedad__Group__3__Impl"


    // $ANTLR start "rule__CurlyBraces__Group__0"
    // InternalAngularDsl.g:4334:1: rule__CurlyBraces__Group__0 : rule__CurlyBraces__Group__0__Impl rule__CurlyBraces__Group__1 ;
    public final void rule__CurlyBraces__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4338:1: ( rule__CurlyBraces__Group__0__Impl rule__CurlyBraces__Group__1 )
            // InternalAngularDsl.g:4339:2: rule__CurlyBraces__Group__0__Impl rule__CurlyBraces__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__CurlyBraces__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CurlyBraces__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CurlyBraces__Group__0"


    // $ANTLR start "rule__CurlyBraces__Group__0__Impl"
    // InternalAngularDsl.g:4346:1: rule__CurlyBraces__Group__0__Impl : ( RULE_LLAVE_IZQUIERDA ) ;
    public final void rule__CurlyBraces__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4350:1: ( ( RULE_LLAVE_IZQUIERDA ) )
            // InternalAngularDsl.g:4351:1: ( RULE_LLAVE_IZQUIERDA )
            {
            // InternalAngularDsl.g:4351:1: ( RULE_LLAVE_IZQUIERDA )
            // InternalAngularDsl.g:4352:2: RULE_LLAVE_IZQUIERDA
            {
             before(grammarAccess.getCurlyBracesAccess().getLLAVE_IZQUIERDATerminalRuleCall_0()); 
            match(input,RULE_LLAVE_IZQUIERDA,FOLLOW_2); 
             after(grammarAccess.getCurlyBracesAccess().getLLAVE_IZQUIERDATerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CurlyBraces__Group__0__Impl"


    // $ANTLR start "rule__CurlyBraces__Group__1"
    // InternalAngularDsl.g:4361:1: rule__CurlyBraces__Group__1 : rule__CurlyBraces__Group__1__Impl rule__CurlyBraces__Group__2 ;
    public final void rule__CurlyBraces__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4365:1: ( rule__CurlyBraces__Group__1__Impl rule__CurlyBraces__Group__2 )
            // InternalAngularDsl.g:4366:2: rule__CurlyBraces__Group__1__Impl rule__CurlyBraces__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__CurlyBraces__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CurlyBraces__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CurlyBraces__Group__1"


    // $ANTLR start "rule__CurlyBraces__Group__1__Impl"
    // InternalAngularDsl.g:4373:1: rule__CurlyBraces__Group__1__Impl : ( RULE_LLAVE_IZQUIERDA ) ;
    public final void rule__CurlyBraces__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4377:1: ( ( RULE_LLAVE_IZQUIERDA ) )
            // InternalAngularDsl.g:4378:1: ( RULE_LLAVE_IZQUIERDA )
            {
            // InternalAngularDsl.g:4378:1: ( RULE_LLAVE_IZQUIERDA )
            // InternalAngularDsl.g:4379:2: RULE_LLAVE_IZQUIERDA
            {
             before(grammarAccess.getCurlyBracesAccess().getLLAVE_IZQUIERDATerminalRuleCall_1()); 
            match(input,RULE_LLAVE_IZQUIERDA,FOLLOW_2); 
             after(grammarAccess.getCurlyBracesAccess().getLLAVE_IZQUIERDATerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CurlyBraces__Group__1__Impl"


    // $ANTLR start "rule__CurlyBraces__Group__2"
    // InternalAngularDsl.g:4388:1: rule__CurlyBraces__Group__2 : rule__CurlyBraces__Group__2__Impl rule__CurlyBraces__Group__3 ;
    public final void rule__CurlyBraces__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4392:1: ( rule__CurlyBraces__Group__2__Impl rule__CurlyBraces__Group__3 )
            // InternalAngularDsl.g:4393:2: rule__CurlyBraces__Group__2__Impl rule__CurlyBraces__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__CurlyBraces__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CurlyBraces__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CurlyBraces__Group__2"


    // $ANTLR start "rule__CurlyBraces__Group__2__Impl"
    // InternalAngularDsl.g:4400:1: rule__CurlyBraces__Group__2__Impl : ( ( '$' )? ) ;
    public final void rule__CurlyBraces__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4404:1: ( ( ( '$' )? ) )
            // InternalAngularDsl.g:4405:1: ( ( '$' )? )
            {
            // InternalAngularDsl.g:4405:1: ( ( '$' )? )
            // InternalAngularDsl.g:4406:2: ( '$' )?
            {
             before(grammarAccess.getCurlyBracesAccess().getDollarSignKeyword_2()); 
            // InternalAngularDsl.g:4407:2: ( '$' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAngularDsl.g:4407:3: '$'
                    {
                    match(input,41,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCurlyBracesAccess().getDollarSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CurlyBraces__Group__2__Impl"


    // $ANTLR start "rule__CurlyBraces__Group__3"
    // InternalAngularDsl.g:4415:1: rule__CurlyBraces__Group__3 : rule__CurlyBraces__Group__3__Impl rule__CurlyBraces__Group__4 ;
    public final void rule__CurlyBraces__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4419:1: ( rule__CurlyBraces__Group__3__Impl rule__CurlyBraces__Group__4 )
            // InternalAngularDsl.g:4420:2: rule__CurlyBraces__Group__3__Impl rule__CurlyBraces__Group__4
            {
            pushFollow(FOLLOW_47);
            rule__CurlyBraces__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CurlyBraces__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CurlyBraces__Group__3"


    // $ANTLR start "rule__CurlyBraces__Group__3__Impl"
    // InternalAngularDsl.g:4427:1: rule__CurlyBraces__Group__3__Impl : ( ( rule__CurlyBraces__ExpresionAssignment_3 ) ) ;
    public final void rule__CurlyBraces__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4431:1: ( ( ( rule__CurlyBraces__ExpresionAssignment_3 ) ) )
            // InternalAngularDsl.g:4432:1: ( ( rule__CurlyBraces__ExpresionAssignment_3 ) )
            {
            // InternalAngularDsl.g:4432:1: ( ( rule__CurlyBraces__ExpresionAssignment_3 ) )
            // InternalAngularDsl.g:4433:2: ( rule__CurlyBraces__ExpresionAssignment_3 )
            {
             before(grammarAccess.getCurlyBracesAccess().getExpresionAssignment_3()); 
            // InternalAngularDsl.g:4434:2: ( rule__CurlyBraces__ExpresionAssignment_3 )
            // InternalAngularDsl.g:4434:3: rule__CurlyBraces__ExpresionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CurlyBraces__ExpresionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCurlyBracesAccess().getExpresionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CurlyBraces__Group__3__Impl"


    // $ANTLR start "rule__CurlyBraces__Group__4"
    // InternalAngularDsl.g:4442:1: rule__CurlyBraces__Group__4 : rule__CurlyBraces__Group__4__Impl rule__CurlyBraces__Group__5 ;
    public final void rule__CurlyBraces__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4446:1: ( rule__CurlyBraces__Group__4__Impl rule__CurlyBraces__Group__5 )
            // InternalAngularDsl.g:4447:2: rule__CurlyBraces__Group__4__Impl rule__CurlyBraces__Group__5
            {
            pushFollow(FOLLOW_47);
            rule__CurlyBraces__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CurlyBraces__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CurlyBraces__Group__4"


    // $ANTLR start "rule__CurlyBraces__Group__4__Impl"
    // InternalAngularDsl.g:4454:1: rule__CurlyBraces__Group__4__Impl : ( ( rule__CurlyBraces__FiltroAssignment_4 )? ) ;
    public final void rule__CurlyBraces__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4458:1: ( ( ( rule__CurlyBraces__FiltroAssignment_4 )? ) )
            // InternalAngularDsl.g:4459:1: ( ( rule__CurlyBraces__FiltroAssignment_4 )? )
            {
            // InternalAngularDsl.g:4459:1: ( ( rule__CurlyBraces__FiltroAssignment_4 )? )
            // InternalAngularDsl.g:4460:2: ( rule__CurlyBraces__FiltroAssignment_4 )?
            {
             before(grammarAccess.getCurlyBracesAccess().getFiltroAssignment_4()); 
            // InternalAngularDsl.g:4461:2: ( rule__CurlyBraces__FiltroAssignment_4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAngularDsl.g:4461:3: rule__CurlyBraces__FiltroAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__CurlyBraces__FiltroAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCurlyBracesAccess().getFiltroAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CurlyBraces__Group__4__Impl"


    // $ANTLR start "rule__CurlyBraces__Group__5"
    // InternalAngularDsl.g:4469:1: rule__CurlyBraces__Group__5 : rule__CurlyBraces__Group__5__Impl rule__CurlyBraces__Group__6 ;
    public final void rule__CurlyBraces__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4473:1: ( rule__CurlyBraces__Group__5__Impl rule__CurlyBraces__Group__6 )
            // InternalAngularDsl.g:4474:2: rule__CurlyBraces__Group__5__Impl rule__CurlyBraces__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__CurlyBraces__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CurlyBraces__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CurlyBraces__Group__5"


    // $ANTLR start "rule__CurlyBraces__Group__5__Impl"
    // InternalAngularDsl.g:4481:1: rule__CurlyBraces__Group__5__Impl : ( RULE_LLAVE_DERECHA ) ;
    public final void rule__CurlyBraces__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4485:1: ( ( RULE_LLAVE_DERECHA ) )
            // InternalAngularDsl.g:4486:1: ( RULE_LLAVE_DERECHA )
            {
            // InternalAngularDsl.g:4486:1: ( RULE_LLAVE_DERECHA )
            // InternalAngularDsl.g:4487:2: RULE_LLAVE_DERECHA
            {
             before(grammarAccess.getCurlyBracesAccess().getLLAVE_DERECHATerminalRuleCall_5()); 
            match(input,RULE_LLAVE_DERECHA,FOLLOW_2); 
             after(grammarAccess.getCurlyBracesAccess().getLLAVE_DERECHATerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CurlyBraces__Group__5__Impl"


    // $ANTLR start "rule__CurlyBraces__Group__6"
    // InternalAngularDsl.g:4496:1: rule__CurlyBraces__Group__6 : rule__CurlyBraces__Group__6__Impl ;
    public final void rule__CurlyBraces__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4500:1: ( rule__CurlyBraces__Group__6__Impl )
            // InternalAngularDsl.g:4501:2: rule__CurlyBraces__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CurlyBraces__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CurlyBraces__Group__6"


    // $ANTLR start "rule__CurlyBraces__Group__6__Impl"
    // InternalAngularDsl.g:4507:1: rule__CurlyBraces__Group__6__Impl : ( RULE_LLAVE_DERECHA ) ;
    public final void rule__CurlyBraces__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4511:1: ( ( RULE_LLAVE_DERECHA ) )
            // InternalAngularDsl.g:4512:1: ( RULE_LLAVE_DERECHA )
            {
            // InternalAngularDsl.g:4512:1: ( RULE_LLAVE_DERECHA )
            // InternalAngularDsl.g:4513:2: RULE_LLAVE_DERECHA
            {
             before(grammarAccess.getCurlyBracesAccess().getLLAVE_DERECHATerminalRuleCall_6()); 
            match(input,RULE_LLAVE_DERECHA,FOLLOW_2); 
             after(grammarAccess.getCurlyBracesAccess().getLLAVE_DERECHATerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CurlyBraces__Group__6__Impl"


    // $ANTLR start "rule__Expresion__Group__0"
    // InternalAngularDsl.g:4523:1: rule__Expresion__Group__0 : rule__Expresion__Group__0__Impl rule__Expresion__Group__1 ;
    public final void rule__Expresion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4527:1: ( rule__Expresion__Group__0__Impl rule__Expresion__Group__1 )
            // InternalAngularDsl.g:4528:2: rule__Expresion__Group__0__Impl rule__Expresion__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__Expresion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expresion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expresion__Group__0"


    // $ANTLR start "rule__Expresion__Group__0__Impl"
    // InternalAngularDsl.g:4535:1: rule__Expresion__Group__0__Impl : ( () ) ;
    public final void rule__Expresion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4539:1: ( ( () ) )
            // InternalAngularDsl.g:4540:1: ( () )
            {
            // InternalAngularDsl.g:4540:1: ( () )
            // InternalAngularDsl.g:4541:2: ()
            {
             before(grammarAccess.getExpresionAccess().getExpresionAction_0()); 
            // InternalAngularDsl.g:4542:2: ()
            // InternalAngularDsl.g:4542:3: 
            {
            }

             after(grammarAccess.getExpresionAccess().getExpresionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expresion__Group__0__Impl"


    // $ANTLR start "rule__Expresion__Group__1"
    // InternalAngularDsl.g:4550:1: rule__Expresion__Group__1 : rule__Expresion__Group__1__Impl rule__Expresion__Group__2 ;
    public final void rule__Expresion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4554:1: ( rule__Expresion__Group__1__Impl rule__Expresion__Group__2 )
            // InternalAngularDsl.g:4555:2: rule__Expresion__Group__1__Impl rule__Expresion__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Expresion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expresion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expresion__Group__1"


    // $ANTLR start "rule__Expresion__Group__1__Impl"
    // InternalAngularDsl.g:4562:1: rule__Expresion__Group__1__Impl : ( ( rule__Expresion__ValorAssignment_1 ) ) ;
    public final void rule__Expresion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4566:1: ( ( ( rule__Expresion__ValorAssignment_1 ) ) )
            // InternalAngularDsl.g:4567:1: ( ( rule__Expresion__ValorAssignment_1 ) )
            {
            // InternalAngularDsl.g:4567:1: ( ( rule__Expresion__ValorAssignment_1 ) )
            // InternalAngularDsl.g:4568:2: ( rule__Expresion__ValorAssignment_1 )
            {
             before(grammarAccess.getExpresionAccess().getValorAssignment_1()); 
            // InternalAngularDsl.g:4569:2: ( rule__Expresion__ValorAssignment_1 )
            // InternalAngularDsl.g:4569:3: rule__Expresion__ValorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Expresion__ValorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpresionAccess().getValorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expresion__Group__1__Impl"


    // $ANTLR start "rule__Expresion__Group__2"
    // InternalAngularDsl.g:4577:1: rule__Expresion__Group__2 : rule__Expresion__Group__2__Impl ;
    public final void rule__Expresion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4581:1: ( rule__Expresion__Group__2__Impl )
            // InternalAngularDsl.g:4582:2: rule__Expresion__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expresion__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expresion__Group__2"


    // $ANTLR start "rule__Expresion__Group__2__Impl"
    // InternalAngularDsl.g:4588:1: rule__Expresion__Group__2__Impl : ( ( rule__Expresion__ReferenciaAssignment_2 ) ) ;
    public final void rule__Expresion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4592:1: ( ( ( rule__Expresion__ReferenciaAssignment_2 ) ) )
            // InternalAngularDsl.g:4593:1: ( ( rule__Expresion__ReferenciaAssignment_2 ) )
            {
            // InternalAngularDsl.g:4593:1: ( ( rule__Expresion__ReferenciaAssignment_2 ) )
            // InternalAngularDsl.g:4594:2: ( rule__Expresion__ReferenciaAssignment_2 )
            {
             before(grammarAccess.getExpresionAccess().getReferenciaAssignment_2()); 
            // InternalAngularDsl.g:4595:2: ( rule__Expresion__ReferenciaAssignment_2 )
            // InternalAngularDsl.g:4595:3: rule__Expresion__ReferenciaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Expresion__ReferenciaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpresionAccess().getReferenciaAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expresion__Group__2__Impl"


    // $ANTLR start "rule__Filtro__Group__0"
    // InternalAngularDsl.g:4604:1: rule__Filtro__Group__0 : rule__Filtro__Group__0__Impl rule__Filtro__Group__1 ;
    public final void rule__Filtro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4608:1: ( rule__Filtro__Group__0__Impl rule__Filtro__Group__1 )
            // InternalAngularDsl.g:4609:2: rule__Filtro__Group__0__Impl rule__Filtro__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__Filtro__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filtro__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filtro__Group__0"


    // $ANTLR start "rule__Filtro__Group__0__Impl"
    // InternalAngularDsl.g:4616:1: rule__Filtro__Group__0__Impl : ( () ) ;
    public final void rule__Filtro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4620:1: ( ( () ) )
            // InternalAngularDsl.g:4621:1: ( () )
            {
            // InternalAngularDsl.g:4621:1: ( () )
            // InternalAngularDsl.g:4622:2: ()
            {
             before(grammarAccess.getFiltroAccess().getFiltroAction_0()); 
            // InternalAngularDsl.g:4623:2: ()
            // InternalAngularDsl.g:4623:3: 
            {
            }

             after(grammarAccess.getFiltroAccess().getFiltroAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filtro__Group__0__Impl"


    // $ANTLR start "rule__Filtro__Group__1"
    // InternalAngularDsl.g:4631:1: rule__Filtro__Group__1 : rule__Filtro__Group__1__Impl rule__Filtro__Group__2 ;
    public final void rule__Filtro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4635:1: ( rule__Filtro__Group__1__Impl rule__Filtro__Group__2 )
            // InternalAngularDsl.g:4636:2: rule__Filtro__Group__1__Impl rule__Filtro__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Filtro__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filtro__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filtro__Group__1"


    // $ANTLR start "rule__Filtro__Group__1__Impl"
    // InternalAngularDsl.g:4643:1: rule__Filtro__Group__1__Impl : ( '|' ) ;
    public final void rule__Filtro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4647:1: ( ( '|' ) )
            // InternalAngularDsl.g:4648:1: ( '|' )
            {
            // InternalAngularDsl.g:4648:1: ( '|' )
            // InternalAngularDsl.g:4649:2: '|'
            {
             before(grammarAccess.getFiltroAccess().getVerticalLineKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFiltroAccess().getVerticalLineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filtro__Group__1__Impl"


    // $ANTLR start "rule__Filtro__Group__2"
    // InternalAngularDsl.g:4658:1: rule__Filtro__Group__2 : rule__Filtro__Group__2__Impl ;
    public final void rule__Filtro__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4662:1: ( rule__Filtro__Group__2__Impl )
            // InternalAngularDsl.g:4663:2: rule__Filtro__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Filtro__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filtro__Group__2"


    // $ANTLR start "rule__Filtro__Group__2__Impl"
    // InternalAngularDsl.g:4669:1: rule__Filtro__Group__2__Impl : ( ( rule__Filtro__ParametrosAssignment_2 ) ) ;
    public final void rule__Filtro__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4673:1: ( ( ( rule__Filtro__ParametrosAssignment_2 ) ) )
            // InternalAngularDsl.g:4674:1: ( ( rule__Filtro__ParametrosAssignment_2 ) )
            {
            // InternalAngularDsl.g:4674:1: ( ( rule__Filtro__ParametrosAssignment_2 ) )
            // InternalAngularDsl.g:4675:2: ( rule__Filtro__ParametrosAssignment_2 )
            {
             before(grammarAccess.getFiltroAccess().getParametrosAssignment_2()); 
            // InternalAngularDsl.g:4676:2: ( rule__Filtro__ParametrosAssignment_2 )
            // InternalAngularDsl.g:4676:3: rule__Filtro__ParametrosAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Filtro__ParametrosAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFiltroAccess().getParametrosAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filtro__Group__2__Impl"


    // $ANTLR start "rule__AppAngular__ModulosAssignment_0"
    // InternalAngularDsl.g:4685:1: rule__AppAngular__ModulosAssignment_0 : ( ruleModulo ) ;
    public final void rule__AppAngular__ModulosAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4689:1: ( ( ruleModulo ) )
            // InternalAngularDsl.g:4690:2: ( ruleModulo )
            {
            // InternalAngularDsl.g:4690:2: ( ruleModulo )
            // InternalAngularDsl.g:4691:3: ruleModulo
            {
             before(grammarAccess.getAppAngularAccess().getModulosModuloParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleModulo();

            state._fsp--;

             after(grammarAccess.getAppAngularAccess().getModulosModuloParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppAngular__ModulosAssignment_0"


    // $ANTLR start "rule__AppAngular__ComponentesAssignment_1"
    // InternalAngularDsl.g:4700:1: rule__AppAngular__ComponentesAssignment_1 : ( ruleComponente ) ;
    public final void rule__AppAngular__ComponentesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4704:1: ( ( ruleComponente ) )
            // InternalAngularDsl.g:4705:2: ( ruleComponente )
            {
            // InternalAngularDsl.g:4705:2: ( ruleComponente )
            // InternalAngularDsl.g:4706:3: ruleComponente
            {
             before(grammarAccess.getAppAngularAccess().getComponentesComponenteParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponente();

            state._fsp--;

             after(grammarAccess.getAppAngularAccess().getComponentesComponenteParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppAngular__ComponentesAssignment_1"


    // $ANTLR start "rule__AppAngular__ServicesAssignment_2"
    // InternalAngularDsl.g:4715:1: rule__AppAngular__ServicesAssignment_2 : ( ruleService ) ;
    public final void rule__AppAngular__ServicesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4719:1: ( ( ruleService ) )
            // InternalAngularDsl.g:4720:2: ( ruleService )
            {
            // InternalAngularDsl.g:4720:2: ( ruleService )
            // InternalAngularDsl.g:4721:3: ruleService
            {
             before(grammarAccess.getAppAngularAccess().getServicesServiceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getAppAngularAccess().getServicesServiceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppAngular__ServicesAssignment_2"


    // $ANTLR start "rule__AppAngular__TemplatesAssignment_3"
    // InternalAngularDsl.g:4730:1: rule__AppAngular__TemplatesAssignment_3 : ( ruleTemplate ) ;
    public final void rule__AppAngular__TemplatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4734:1: ( ( ruleTemplate ) )
            // InternalAngularDsl.g:4735:2: ( ruleTemplate )
            {
            // InternalAngularDsl.g:4735:2: ( ruleTemplate )
            // InternalAngularDsl.g:4736:3: ruleTemplate
            {
             before(grammarAccess.getAppAngularAccess().getTemplatesTemplateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTemplate();

            state._fsp--;

             after(grammarAccess.getAppAngularAccess().getTemplatesTemplateParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppAngular__TemplatesAssignment_3"


    // $ANTLR start "rule__Modulo__NameAssignment_6"
    // InternalAngularDsl.g:4745:1: rule__Modulo__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__Modulo__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4749:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:4750:2: ( ruleEString )
            {
            // InternalAngularDsl.g:4750:2: ( ruleEString )
            // InternalAngularDsl.g:4751:3: ruleEString
            {
             before(grammarAccess.getModuloAccess().getNameEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModuloAccess().getNameEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__NameAssignment_6"


    // $ANTLR start "rule__Modulo__ParametrosAssignment_9_0"
    // InternalAngularDsl.g:4760:1: rule__Modulo__ParametrosAssignment_9_0 : ( ( ruleEString ) ) ;
    public final void rule__Modulo__ParametrosAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4764:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:4765:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:4765:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:4766:3: ( ruleEString )
            {
             before(grammarAccess.getModuloAccess().getParametrosObjetoAngularCrossReference_9_0_0()); 
            // InternalAngularDsl.g:4767:3: ( ruleEString )
            // InternalAngularDsl.g:4768:4: ruleEString
            {
             before(grammarAccess.getModuloAccess().getParametrosObjetoAngularEStringParserRuleCall_9_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModuloAccess().getParametrosObjetoAngularEStringParserRuleCall_9_0_0_1()); 

            }

             after(grammarAccess.getModuloAccess().getParametrosObjetoAngularCrossReference_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__ParametrosAssignment_9_0"


    // $ANTLR start "rule__Modulo__ParametrosAssignment_9_1_1"
    // InternalAngularDsl.g:4779:1: rule__Modulo__ParametrosAssignment_9_1_1 : ( ( ruleEString ) ) ;
    public final void rule__Modulo__ParametrosAssignment_9_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4783:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:4784:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:4784:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:4785:3: ( ruleEString )
            {
             before(grammarAccess.getModuloAccess().getParametrosObjetoAngularCrossReference_9_1_1_0()); 
            // InternalAngularDsl.g:4786:3: ( ruleEString )
            // InternalAngularDsl.g:4787:4: ruleEString
            {
             before(grammarAccess.getModuloAccess().getParametrosObjetoAngularEStringParserRuleCall_9_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModuloAccess().getParametrosObjetoAngularEStringParserRuleCall_9_1_1_0_1()); 

            }

             after(grammarAccess.getModuloAccess().getParametrosObjetoAngularCrossReference_9_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__ParametrosAssignment_9_1_1"


    // $ANTLR start "rule__Service__ModuloAssignment_6"
    // InternalAngularDsl.g:4798:1: rule__Service__ModuloAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Service__ModuloAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4802:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:4803:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:4803:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:4804:3: ( ruleEString )
            {
             before(grammarAccess.getServiceAccess().getModuloModuloCrossReference_6_0()); 
            // InternalAngularDsl.g:4805:3: ( ruleEString )
            // InternalAngularDsl.g:4806:4: ruleEString
            {
             before(grammarAccess.getServiceAccess().getModuloModuloEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getModuloModuloEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getServiceAccess().getModuloModuloCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__ModuloAssignment_6"


    // $ANTLR start "rule__Service__NameAssignment_11"
    // InternalAngularDsl.g:4817:1: rule__Service__NameAssignment_11 : ( ruleEString ) ;
    public final void rule__Service__NameAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4821:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:4822:2: ( ruleEString )
            {
            // InternalAngularDsl.g:4822:2: ( ruleEString )
            // InternalAngularDsl.g:4823:3: ruleEString
            {
             before(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__NameAssignment_11"


    // $ANTLR start "rule__Service__ParametrosAssignment_14_0"
    // InternalAngularDsl.g:4832:1: rule__Service__ParametrosAssignment_14_0 : ( ( ruleEString ) ) ;
    public final void rule__Service__ParametrosAssignment_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4836:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:4837:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:4837:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:4838:3: ( ruleEString )
            {
             before(grammarAccess.getServiceAccess().getParametrosObjetoAngularCrossReference_14_0_0()); 
            // InternalAngularDsl.g:4839:3: ( ruleEString )
            // InternalAngularDsl.g:4840:4: ruleEString
            {
             before(grammarAccess.getServiceAccess().getParametrosObjetoAngularEStringParserRuleCall_14_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getParametrosObjetoAngularEStringParserRuleCall_14_0_0_1()); 

            }

             after(grammarAccess.getServiceAccess().getParametrosObjetoAngularCrossReference_14_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__ParametrosAssignment_14_0"


    // $ANTLR start "rule__Service__ParametrosAssignment_14_1_1"
    // InternalAngularDsl.g:4851:1: rule__Service__ParametrosAssignment_14_1_1 : ( ( ruleEString ) ) ;
    public final void rule__Service__ParametrosAssignment_14_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4855:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:4856:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:4856:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:4857:3: ( ruleEString )
            {
             before(grammarAccess.getServiceAccess().getParametrosObjetoAngularCrossReference_14_1_1_0()); 
            // InternalAngularDsl.g:4858:3: ( ruleEString )
            // InternalAngularDsl.g:4859:4: ruleEString
            {
             before(grammarAccess.getServiceAccess().getParametrosObjetoAngularEStringParserRuleCall_14_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getParametrosObjetoAngularEStringParserRuleCall_14_1_1_0_1()); 

            }

             after(grammarAccess.getServiceAccess().getParametrosObjetoAngularCrossReference_14_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__ParametrosAssignment_14_1_1"


    // $ANTLR start "rule__Service__FuncionAssignment_16"
    // InternalAngularDsl.g:4870:1: rule__Service__FuncionAssignment_16 : ( ruleFuncion ) ;
    public final void rule__Service__FuncionAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4874:1: ( ( ruleFuncion ) )
            // InternalAngularDsl.g:4875:2: ( ruleFuncion )
            {
            // InternalAngularDsl.g:4875:2: ( ruleFuncion )
            // InternalAngularDsl.g:4876:3: ruleFuncion
            {
             before(grammarAccess.getServiceAccess().getFuncionFuncionParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleFuncion();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getFuncionFuncionParserRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__FuncionAssignment_16"


    // $ANTLR start "rule__Componente__ModuloAssignment_6"
    // InternalAngularDsl.g:4885:1: rule__Componente__ModuloAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Componente__ModuloAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4889:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:4890:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:4890:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:4891:3: ( ruleEString )
            {
             before(grammarAccess.getComponenteAccess().getModuloModuloCrossReference_6_0()); 
            // InternalAngularDsl.g:4892:3: ( ruleEString )
            // InternalAngularDsl.g:4893:4: ruleEString
            {
             before(grammarAccess.getComponenteAccess().getModuloModuloEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponenteAccess().getModuloModuloEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getComponenteAccess().getModuloModuloCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__ModuloAssignment_6"


    // $ANTLR start "rule__Componente__NameAssignment_11"
    // InternalAngularDsl.g:4904:1: rule__Componente__NameAssignment_11 : ( ruleEString ) ;
    public final void rule__Componente__NameAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4908:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:4909:2: ( ruleEString )
            {
            // InternalAngularDsl.g:4909:2: ( ruleEString )
            // InternalAngularDsl.g:4910:3: ruleEString
            {
             before(grammarAccess.getComponenteAccess().getNameEStringParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponenteAccess().getNameEStringParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__NameAssignment_11"


    // $ANTLR start "rule__Componente__TemplateAssignment_16"
    // InternalAngularDsl.g:4919:1: rule__Componente__TemplateAssignment_16 : ( ( ruleEString ) ) ;
    public final void rule__Componente__TemplateAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4923:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:4924:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:4924:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:4925:3: ( ruleEString )
            {
             before(grammarAccess.getComponenteAccess().getTemplateTemplateCrossReference_16_0()); 
            // InternalAngularDsl.g:4926:3: ( ruleEString )
            // InternalAngularDsl.g:4927:4: ruleEString
            {
             before(grammarAccess.getComponenteAccess().getTemplateTemplateEStringParserRuleCall_16_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponenteAccess().getTemplateTemplateEStringParserRuleCall_16_0_1()); 

            }

             after(grammarAccess.getComponenteAccess().getTemplateTemplateCrossReference_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__TemplateAssignment_16"


    // $ANTLR start "rule__Componente__ParametrosAssignment_21_0"
    // InternalAngularDsl.g:4938:1: rule__Componente__ParametrosAssignment_21_0 : ( ( ruleEString ) ) ;
    public final void rule__Componente__ParametrosAssignment_21_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4942:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:4943:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:4943:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:4944:3: ( ruleEString )
            {
             before(grammarAccess.getComponenteAccess().getParametrosObjetoAngularCrossReference_21_0_0()); 
            // InternalAngularDsl.g:4945:3: ( ruleEString )
            // InternalAngularDsl.g:4946:4: ruleEString
            {
             before(grammarAccess.getComponenteAccess().getParametrosObjetoAngularEStringParserRuleCall_21_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponenteAccess().getParametrosObjetoAngularEStringParserRuleCall_21_0_0_1()); 

            }

             after(grammarAccess.getComponenteAccess().getParametrosObjetoAngularCrossReference_21_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__ParametrosAssignment_21_0"


    // $ANTLR start "rule__Componente__ParametrosAssignment_21_1_1"
    // InternalAngularDsl.g:4957:1: rule__Componente__ParametrosAssignment_21_1_1 : ( ( ruleEString ) ) ;
    public final void rule__Componente__ParametrosAssignment_21_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4961:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:4962:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:4962:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:4963:3: ( ruleEString )
            {
             before(grammarAccess.getComponenteAccess().getParametrosObjetoAngularCrossReference_21_1_1_0()); 
            // InternalAngularDsl.g:4964:3: ( ruleEString )
            // InternalAngularDsl.g:4965:4: ruleEString
            {
             before(grammarAccess.getComponenteAccess().getParametrosObjetoAngularEStringParserRuleCall_21_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponenteAccess().getParametrosObjetoAngularEStringParserRuleCall_21_1_1_0_1()); 

            }

             after(grammarAccess.getComponenteAccess().getParametrosObjetoAngularCrossReference_21_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__ParametrosAssignment_21_1_1"


    // $ANTLR start "rule__Componente__FuncionAssignment_23"
    // InternalAngularDsl.g:4976:1: rule__Componente__FuncionAssignment_23 : ( ruleFuncion ) ;
    public final void rule__Componente__FuncionAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4980:1: ( ( ruleFuncion ) )
            // InternalAngularDsl.g:4981:2: ( ruleFuncion )
            {
            // InternalAngularDsl.g:4981:2: ( ruleFuncion )
            // InternalAngularDsl.g:4982:3: ruleFuncion
            {
             before(grammarAccess.getComponenteAccess().getFuncionFuncionParserRuleCall_23_0()); 
            pushFollow(FOLLOW_2);
            ruleFuncion();

            state._fsp--;

             after(grammarAccess.getComponenteAccess().getFuncionFuncionParserRuleCall_23_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Componente__FuncionAssignment_23"


    // $ANTLR start "rule__Funcion__NameAssignment_2"
    // InternalAngularDsl.g:4991:1: rule__Funcion__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Funcion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4995:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:4996:2: ( ruleEString )
            {
            // InternalAngularDsl.g:4996:2: ( ruleEString )
            // InternalAngularDsl.g:4997:3: ruleEString
            {
             before(grammarAccess.getFuncionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFuncionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__NameAssignment_2"


    // $ANTLR start "rule__Funcion__ParametrosAssignment_4"
    // InternalAngularDsl.g:5006:1: rule__Funcion__ParametrosAssignment_4 : ( ruleEString ) ;
    public final void rule__Funcion__ParametrosAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5010:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:5011:2: ( ruleEString )
            {
            // InternalAngularDsl.g:5011:2: ( ruleEString )
            // InternalAngularDsl.g:5012:3: ruleEString
            {
             before(grammarAccess.getFuncionAccess().getParametrosEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFuncionAccess().getParametrosEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__ParametrosAssignment_4"


    // $ANTLR start "rule__Funcion__VariablesAssignment_7"
    // InternalAngularDsl.g:5021:1: rule__Funcion__VariablesAssignment_7 : ( ruleVariable ) ;
    public final void rule__Funcion__VariablesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5025:1: ( ( ruleVariable ) )
            // InternalAngularDsl.g:5026:2: ( ruleVariable )
            {
            // InternalAngularDsl.g:5026:2: ( ruleVariable )
            // InternalAngularDsl.g:5027:3: ruleVariable
            {
             before(grammarAccess.getFuncionAccess().getVariablesVariableParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getFuncionAccess().getVariablesVariableParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__VariablesAssignment_7"


    // $ANTLR start "rule__Funcion__BodyAssignment_8"
    // InternalAngularDsl.g:5036:1: rule__Funcion__BodyAssignment_8 : ( ruleEString ) ;
    public final void rule__Funcion__BodyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5040:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:5041:2: ( ruleEString )
            {
            // InternalAngularDsl.g:5041:2: ( ruleEString )
            // InternalAngularDsl.g:5042:3: ruleEString
            {
             before(grammarAccess.getFuncionAccess().getBodyEStringParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFuncionAccess().getBodyEStringParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Funcion__BodyAssignment_8"


    // $ANTLR start "rule__Variable__AnotacionAssignment_1"
    // InternalAngularDsl.g:5051:1: rule__Variable__AnotacionAssignment_1 : ( ruleAnotacion ) ;
    public final void rule__Variable__AnotacionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5055:1: ( ( ruleAnotacion ) )
            // InternalAngularDsl.g:5056:2: ( ruleAnotacion )
            {
            // InternalAngularDsl.g:5056:2: ( ruleAnotacion )
            // InternalAngularDsl.g:5057:3: ruleAnotacion
            {
             before(grammarAccess.getVariableAccess().getAnotacionAnotacionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnotacion();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getAnotacionAnotacionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__AnotacionAssignment_1"


    // $ANTLR start "rule__Variable__NameAssignment_3"
    // InternalAngularDsl.g:5066:1: rule__Variable__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Variable__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5070:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:5071:2: ( ruleEString )
            {
            // InternalAngularDsl.g:5071:2: ( ruleEString )
            // InternalAngularDsl.g:5072:3: ruleEString
            {
             before(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_3"


    // $ANTLR start "rule__Variable__ValorAssignment_5"
    // InternalAngularDsl.g:5081:1: rule__Variable__ValorAssignment_5 : ( ruleEString ) ;
    public final void rule__Variable__ValorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5085:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:5086:2: ( ruleEString )
            {
            // InternalAngularDsl.g:5086:2: ( ruleEString )
            // InternalAngularDsl.g:5087:3: ruleEString
            {
             before(grammarAccess.getVariableAccess().getValorEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getValorEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__ValorAssignment_5"


    // $ANTLR start "rule__Anotacion__NameAssignment_2"
    // InternalAngularDsl.g:5096:1: rule__Anotacion__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Anotacion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5100:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:5101:2: ( ruleEString )
            {
            // InternalAngularDsl.g:5101:2: ( ruleEString )
            // InternalAngularDsl.g:5102:3: ruleEString
            {
             before(grammarAccess.getAnotacionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnotacionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anotacion__NameAssignment_2"


    // $ANTLR start "rule__Anotacion__PrimitivoAssignment_4"
    // InternalAngularDsl.g:5111:1: rule__Anotacion__PrimitivoAssignment_4 : ( ruleEBoolean ) ;
    public final void rule__Anotacion__PrimitivoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5115:1: ( ( ruleEBoolean ) )
            // InternalAngularDsl.g:5116:2: ( ruleEBoolean )
            {
            // InternalAngularDsl.g:5116:2: ( ruleEBoolean )
            // InternalAngularDsl.g:5117:3: ruleEBoolean
            {
             before(grammarAccess.getAnotacionAccess().getPrimitivoEBooleanParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getAnotacionAccess().getPrimitivoEBooleanParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anotacion__PrimitivoAssignment_4"


    // $ANTLR start "rule__Anotacion__ValueAssignment_6"
    // InternalAngularDsl.g:5126:1: rule__Anotacion__ValueAssignment_6 : ( ruleEString ) ;
    public final void rule__Anotacion__ValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5130:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:5131:2: ( ruleEString )
            {
            // InternalAngularDsl.g:5131:2: ( ruleEString )
            // InternalAngularDsl.g:5132:3: ruleEString
            {
             before(grammarAccess.getAnotacionAccess().getValueEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnotacionAccess().getValueEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anotacion__ValueAssignment_6"


    // $ANTLR start "rule__Template__NameAssignment_1"
    // InternalAngularDsl.g:5141:1: rule__Template__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Template__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5145:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:5146:2: ( ruleEString )
            {
            // InternalAngularDsl.g:5146:2: ( ruleEString )
            // InternalAngularDsl.g:5147:3: ruleEString
            {
             before(grammarAccess.getTemplateAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTemplateAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__NameAssignment_1"


    // $ANTLR start "rule__Template__SentenciashtmlAssignment_3"
    // InternalAngularDsl.g:5156:1: rule__Template__SentenciashtmlAssignment_3 : ( ruleSentenciaHTML ) ;
    public final void rule__Template__SentenciashtmlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5160:1: ( ( ruleSentenciaHTML ) )
            // InternalAngularDsl.g:5161:2: ( ruleSentenciaHTML )
            {
            // InternalAngularDsl.g:5161:2: ( ruleSentenciaHTML )
            // InternalAngularDsl.g:5162:3: ruleSentenciaHTML
            {
             before(grammarAccess.getTemplateAccess().getSentenciashtmlSentenciaHTMLParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSentenciaHTML();

            state._fsp--;

             after(grammarAccess.getTemplateAccess().getSentenciashtmlSentenciaHTMLParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__SentenciashtmlAssignment_3"


    // $ANTLR start "rule__SentenciaHTML__NameAssignment_2"
    // InternalAngularDsl.g:5171:1: rule__SentenciaHTML__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SentenciaHTML__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5175:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:5176:2: ( ruleEString )
            {
            // InternalAngularDsl.g:5176:2: ( ruleEString )
            // InternalAngularDsl.g:5177:3: ruleEString
            {
             before(grammarAccess.getSentenciaHTMLAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSentenciaHTMLAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__NameAssignment_2"


    // $ANTLR start "rule__SentenciaHTML__PropiedadesAssignment_3"
    // InternalAngularDsl.g:5186:1: rule__SentenciaHTML__PropiedadesAssignment_3 : ( rulePropiedad ) ;
    public final void rule__SentenciaHTML__PropiedadesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5190:1: ( ( rulePropiedad ) )
            // InternalAngularDsl.g:5191:2: ( rulePropiedad )
            {
            // InternalAngularDsl.g:5191:2: ( rulePropiedad )
            // InternalAngularDsl.g:5192:3: rulePropiedad
            {
             before(grammarAccess.getSentenciaHTMLAccess().getPropiedadesPropiedadParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePropiedad();

            state._fsp--;

             after(grammarAccess.getSentenciaHTMLAccess().getPropiedadesPropiedadParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__PropiedadesAssignment_3"


    // $ANTLR start "rule__SentenciaHTML__DirectivasAssignment_4"
    // InternalAngularDsl.g:5201:1: rule__SentenciaHTML__DirectivasAssignment_4 : ( ruleDirectiva ) ;
    public final void rule__SentenciaHTML__DirectivasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5205:1: ( ( ruleDirectiva ) )
            // InternalAngularDsl.g:5206:2: ( ruleDirectiva )
            {
            // InternalAngularDsl.g:5206:2: ( ruleDirectiva )
            // InternalAngularDsl.g:5207:3: ruleDirectiva
            {
             before(grammarAccess.getSentenciaHTMLAccess().getDirectivasDirectivaParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDirectiva();

            state._fsp--;

             after(grammarAccess.getSentenciaHTMLAccess().getDirectivasDirectivaParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__DirectivasAssignment_4"


    // $ANTLR start "rule__SentenciaHTML__CurlybracesAssignment_7"
    // InternalAngularDsl.g:5216:1: rule__SentenciaHTML__CurlybracesAssignment_7 : ( ruleCurlyBraces ) ;
    public final void rule__SentenciaHTML__CurlybracesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5220:1: ( ( ruleCurlyBraces ) )
            // InternalAngularDsl.g:5221:2: ( ruleCurlyBraces )
            {
            // InternalAngularDsl.g:5221:2: ( ruleCurlyBraces )
            // InternalAngularDsl.g:5222:3: ruleCurlyBraces
            {
             before(grammarAccess.getSentenciaHTMLAccess().getCurlybracesCurlyBracesParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleCurlyBraces();

            state._fsp--;

             after(grammarAccess.getSentenciaHTMLAccess().getCurlybracesCurlyBracesParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__CurlybracesAssignment_7"


    // $ANTLR start "rule__SentenciaHTML__SentenciashtmlAssignment_8"
    // InternalAngularDsl.g:5231:1: rule__SentenciaHTML__SentenciashtmlAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__SentenciaHTML__SentenciashtmlAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5235:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:5236:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:5236:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:5237:3: ( ruleEString )
            {
             before(grammarAccess.getSentenciaHTMLAccess().getSentenciashtmlSentenciaHTMLCrossReference_8_0()); 
            // InternalAngularDsl.g:5238:3: ( ruleEString )
            // InternalAngularDsl.g:5239:4: ruleEString
            {
             before(grammarAccess.getSentenciaHTMLAccess().getSentenciashtmlSentenciaHTMLEStringParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSentenciaHTMLAccess().getSentenciashtmlSentenciaHTMLEStringParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getSentenciaHTMLAccess().getSentenciashtmlSentenciaHTMLCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenciaHTML__SentenciashtmlAssignment_8"


    // $ANTLR start "rule__Directiva__NameAssignment_2"
    // InternalAngularDsl.g:5250:1: rule__Directiva__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Directiva__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5254:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:5255:2: ( ruleEString )
            {
            // InternalAngularDsl.g:5255:2: ( ruleEString )
            // InternalAngularDsl.g:5256:3: ruleEString
            {
             before(grammarAccess.getDirectivaAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDirectivaAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directiva__NameAssignment_2"


    // $ANTLR start "rule__Directiva__CurlybracesAssignment_4"
    // InternalAngularDsl.g:5265:1: rule__Directiva__CurlybracesAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Directiva__CurlybracesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5269:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:5270:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:5270:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:5271:3: ( ruleEString )
            {
             before(grammarAccess.getDirectivaAccess().getCurlybracesCurlyBracesCrossReference_4_0()); 
            // InternalAngularDsl.g:5272:3: ( ruleEString )
            // InternalAngularDsl.g:5273:4: ruleEString
            {
             before(grammarAccess.getDirectivaAccess().getCurlybracesCurlyBracesEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDirectivaAccess().getCurlybracesCurlyBracesEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDirectivaAccess().getCurlybracesCurlyBracesCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directiva__CurlybracesAssignment_4"


    // $ANTLR start "rule__Directiva__ReferenciaAssignment_5"
    // InternalAngularDsl.g:5284:1: rule__Directiva__ReferenciaAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Directiva__ReferenciaAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5288:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:5289:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:5289:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:5290:3: ( ruleEString )
            {
             before(grammarAccess.getDirectivaAccess().getReferenciaObjetoAngularCrossReference_5_0()); 
            // InternalAngularDsl.g:5291:3: ( ruleEString )
            // InternalAngularDsl.g:5292:4: ruleEString
            {
             before(grammarAccess.getDirectivaAccess().getReferenciaObjetoAngularEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDirectivaAccess().getReferenciaObjetoAngularEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getDirectivaAccess().getReferenciaObjetoAngularCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directiva__ReferenciaAssignment_5"


    // $ANTLR start "rule__Propiedad__NameAssignment_1"
    // InternalAngularDsl.g:5303:1: rule__Propiedad__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Propiedad__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5307:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:5308:2: ( ruleEString )
            {
            // InternalAngularDsl.g:5308:2: ( ruleEString )
            // InternalAngularDsl.g:5309:3: ruleEString
            {
             before(grammarAccess.getPropiedadAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropiedadAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propiedad__NameAssignment_1"


    // $ANTLR start "rule__CurlyBraces__ExpresionAssignment_3"
    // InternalAngularDsl.g:5318:1: rule__CurlyBraces__ExpresionAssignment_3 : ( ruleExpresion ) ;
    public final void rule__CurlyBraces__ExpresionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5322:1: ( ( ruleExpresion ) )
            // InternalAngularDsl.g:5323:2: ( ruleExpresion )
            {
            // InternalAngularDsl.g:5323:2: ( ruleExpresion )
            // InternalAngularDsl.g:5324:3: ruleExpresion
            {
             before(grammarAccess.getCurlyBracesAccess().getExpresionExpresionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getCurlyBracesAccess().getExpresionExpresionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CurlyBraces__ExpresionAssignment_3"


    // $ANTLR start "rule__CurlyBraces__FiltroAssignment_4"
    // InternalAngularDsl.g:5333:1: rule__CurlyBraces__FiltroAssignment_4 : ( ruleFiltro ) ;
    public final void rule__CurlyBraces__FiltroAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5337:1: ( ( ruleFiltro ) )
            // InternalAngularDsl.g:5338:2: ( ruleFiltro )
            {
            // InternalAngularDsl.g:5338:2: ( ruleFiltro )
            // InternalAngularDsl.g:5339:3: ruleFiltro
            {
             before(grammarAccess.getCurlyBracesAccess().getFiltroFiltroParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFiltro();

            state._fsp--;

             after(grammarAccess.getCurlyBracesAccess().getFiltroFiltroParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CurlyBraces__FiltroAssignment_4"


    // $ANTLR start "rule__Expresion__ValorAssignment_1"
    // InternalAngularDsl.g:5348:1: rule__Expresion__ValorAssignment_1 : ( ruleEString ) ;
    public final void rule__Expresion__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5352:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:5353:2: ( ruleEString )
            {
            // InternalAngularDsl.g:5353:2: ( ruleEString )
            // InternalAngularDsl.g:5354:3: ruleEString
            {
             before(grammarAccess.getExpresionAccess().getValorEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpresionAccess().getValorEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expresion__ValorAssignment_1"


    // $ANTLR start "rule__Expresion__ReferenciaAssignment_2"
    // InternalAngularDsl.g:5363:1: rule__Expresion__ReferenciaAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Expresion__ReferenciaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5367:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:5368:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:5368:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:5369:3: ( ruleEString )
            {
             before(grammarAccess.getExpresionAccess().getReferenciaObjetoAngularCrossReference_2_0()); 
            // InternalAngularDsl.g:5370:3: ( ruleEString )
            // InternalAngularDsl.g:5371:4: ruleEString
            {
             before(grammarAccess.getExpresionAccess().getReferenciaObjetoAngularEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpresionAccess().getReferenciaObjetoAngularEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getExpresionAccess().getReferenciaObjetoAngularCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expresion__ReferenciaAssignment_2"


    // $ANTLR start "rule__Filtro__ParametrosAssignment_2"
    // InternalAngularDsl.g:5382:1: rule__Filtro__ParametrosAssignment_2 : ( ruleEString ) ;
    public final void rule__Filtro__ParametrosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:5386:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:5387:2: ( ruleEString )
            {
            // InternalAngularDsl.g:5387:2: ( ruleEString )
            // InternalAngularDsl.g:5388:3: ruleEString
            {
             before(grammarAccess.getFiltroAccess().getParametrosEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFiltroAccess().getParametrosEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filtro__ParametrosAssignment_2"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\4\1\20\1\7\1\uffff\1\21\1\10\1\17\1\11\1\16\1\4\1\6\2\12\1\uffff\1\7\1\22\2\uffff";
    static final String dfa_3s = "\1\17\1\20\1\7\1\uffff\1\21\1\10\1\17\1\11\1\16\1\5\1\6\2\15\1\uffff\1\7\1\45\2\uffff";
    static final String dfa_4s = "\3\uffff\1\4\11\uffff\1\1\2\uffff\1\2\1\3";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\2\3\1\2\10\uffff\1\1",
            "\1\4",
            "\1\5",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13\1\14",
            "\1\2",
            "\1\15\2\uffff\1\16",
            "\1\15\2\uffff\1\16",
            "",
            "\1\17",
            "\1\20\22\uffff\1\21",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "452:1: rule__AppAngular__Alternatives : ( ( ( rule__AppAngular__ModulosAssignment_0 ) ) | ( ( rule__AppAngular__ComponentesAssignment_1 ) ) | ( ( rule__AppAngular__ServicesAssignment_2 ) ) | ( ( rule__AppAngular__TemplatesAssignment_3 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000430L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004002000030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004002000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004002000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010030000030L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000008080030L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000040000800000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000040000000000L});

}