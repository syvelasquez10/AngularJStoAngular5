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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_ANGULAR", "RULE_PUNTO", "RULE_MODULE", "RULE_PARENTESIS_IZQUIERDO", "RULE_COMA", "RULE_PARENTESIS_CUADRADO_IZQUIERDO", "RULE_PARENTESIS_CUADRADO_DERECHO", "RULE_PARENTESIS_DERECHO", "RULE_PUNTO_Y_COMA", "RULE_COMILLAS", "RULE_USE", "RULE_STRICT", "RULE_COMPONENT", "RULE_LLAVE_IZQUIERDA", "RULE_TEMPLATE_URL", "RULE_DOS_PUNTOS", "RULE_CONTROLLER", "RULE_LLAVE_DERECHA", "RULE_FUNCTION", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'factory'", "'var'", "'='", "'*'", "'<'", "'/'", "'>'", "'</'", "'ng-'", "'{{'", "'}}'", "'|'"
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
    public static final int RULE_SL_COMMENT=27;
    public static final int RULE_STRICT=17;
    public static final int T__37=37;
    public static final int RULE_PUNTO_Y_COMA=14;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_USE=16;
    public static final int RULE_ID=5;
    public static final int RULE_PARENTESIS_IZQUIERDO=9;
    public static final int RULE_WS=28;
    public static final int RULE_ANY_OTHER=29;
    public static final int RULE_PUNTO=7;
    public static final int RULE_DOS_PUNTOS=21;
    public static final int RULE_INT=25;
    public static final int RULE_PARENTESIS_CUADRADO_DERECHO=12;
    public static final int RULE_ML_COMMENT=26;
    public static final int RULE_LLAVE_DERECHA=23;
    public static final int RULE_ANGULAR=6;
    public static final int RULE_MODULE=8;
    public static final int T__40=40;
    public static final int T__41=41;

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


    // $ANTLR start "entryRuleTemplate"
    // InternalAngularDsl.g:203:1: entryRuleTemplate : ruleTemplate EOF ;
    public final void entryRuleTemplate() throws RecognitionException {
        try {
            // InternalAngularDsl.g:204:1: ( ruleTemplate EOF )
            // InternalAngularDsl.g:205:1: ruleTemplate EOF
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
    // InternalAngularDsl.g:212:1: ruleTemplate : ( ( rule__Template__Group__0 ) ) ;
    public final void ruleTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:216:2: ( ( ( rule__Template__Group__0 ) ) )
            // InternalAngularDsl.g:217:2: ( ( rule__Template__Group__0 ) )
            {
            // InternalAngularDsl.g:217:2: ( ( rule__Template__Group__0 ) )
            // InternalAngularDsl.g:218:3: ( rule__Template__Group__0 )
            {
             before(grammarAccess.getTemplateAccess().getGroup()); 
            // InternalAngularDsl.g:219:3: ( rule__Template__Group__0 )
            // InternalAngularDsl.g:219:4: rule__Template__Group__0
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
    // InternalAngularDsl.g:228:1: entryRuleSentenciaHTML : ruleSentenciaHTML EOF ;
    public final void entryRuleSentenciaHTML() throws RecognitionException {
        try {
            // InternalAngularDsl.g:229:1: ( ruleSentenciaHTML EOF )
            // InternalAngularDsl.g:230:1: ruleSentenciaHTML EOF
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
    // InternalAngularDsl.g:237:1: ruleSentenciaHTML : ( ( rule__SentenciaHTML__Group__0 ) ) ;
    public final void ruleSentenciaHTML() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:241:2: ( ( ( rule__SentenciaHTML__Group__0 ) ) )
            // InternalAngularDsl.g:242:2: ( ( rule__SentenciaHTML__Group__0 ) )
            {
            // InternalAngularDsl.g:242:2: ( ( rule__SentenciaHTML__Group__0 ) )
            // InternalAngularDsl.g:243:3: ( rule__SentenciaHTML__Group__0 )
            {
             before(grammarAccess.getSentenciaHTMLAccess().getGroup()); 
            // InternalAngularDsl.g:244:3: ( rule__SentenciaHTML__Group__0 )
            // InternalAngularDsl.g:244:4: rule__SentenciaHTML__Group__0
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
    // InternalAngularDsl.g:253:1: entryRuleDirectiva : ruleDirectiva EOF ;
    public final void entryRuleDirectiva() throws RecognitionException {
        try {
            // InternalAngularDsl.g:254:1: ( ruleDirectiva EOF )
            // InternalAngularDsl.g:255:1: ruleDirectiva EOF
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
    // InternalAngularDsl.g:262:1: ruleDirectiva : ( ( rule__Directiva__Group__0 ) ) ;
    public final void ruleDirectiva() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:266:2: ( ( ( rule__Directiva__Group__0 ) ) )
            // InternalAngularDsl.g:267:2: ( ( rule__Directiva__Group__0 ) )
            {
            // InternalAngularDsl.g:267:2: ( ( rule__Directiva__Group__0 ) )
            // InternalAngularDsl.g:268:3: ( rule__Directiva__Group__0 )
            {
             before(grammarAccess.getDirectivaAccess().getGroup()); 
            // InternalAngularDsl.g:269:3: ( rule__Directiva__Group__0 )
            // InternalAngularDsl.g:269:4: rule__Directiva__Group__0
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
    // InternalAngularDsl.g:278:1: entryRulePropiedad : rulePropiedad EOF ;
    public final void entryRulePropiedad() throws RecognitionException {
        try {
            // InternalAngularDsl.g:279:1: ( rulePropiedad EOF )
            // InternalAngularDsl.g:280:1: rulePropiedad EOF
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
    // InternalAngularDsl.g:287:1: rulePropiedad : ( ( rule__Propiedad__Group__0 ) ) ;
    public final void rulePropiedad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:291:2: ( ( ( rule__Propiedad__Group__0 ) ) )
            // InternalAngularDsl.g:292:2: ( ( rule__Propiedad__Group__0 ) )
            {
            // InternalAngularDsl.g:292:2: ( ( rule__Propiedad__Group__0 ) )
            // InternalAngularDsl.g:293:3: ( rule__Propiedad__Group__0 )
            {
             before(grammarAccess.getPropiedadAccess().getGroup()); 
            // InternalAngularDsl.g:294:3: ( rule__Propiedad__Group__0 )
            // InternalAngularDsl.g:294:4: rule__Propiedad__Group__0
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
    // InternalAngularDsl.g:303:1: entryRuleCurlyBraces : ruleCurlyBraces EOF ;
    public final void entryRuleCurlyBraces() throws RecognitionException {
        try {
            // InternalAngularDsl.g:304:1: ( ruleCurlyBraces EOF )
            // InternalAngularDsl.g:305:1: ruleCurlyBraces EOF
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
    // InternalAngularDsl.g:312:1: ruleCurlyBraces : ( ( rule__CurlyBraces__Group__0 ) ) ;
    public final void ruleCurlyBraces() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:316:2: ( ( ( rule__CurlyBraces__Group__0 ) ) )
            // InternalAngularDsl.g:317:2: ( ( rule__CurlyBraces__Group__0 ) )
            {
            // InternalAngularDsl.g:317:2: ( ( rule__CurlyBraces__Group__0 ) )
            // InternalAngularDsl.g:318:3: ( rule__CurlyBraces__Group__0 )
            {
             before(grammarAccess.getCurlyBracesAccess().getGroup()); 
            // InternalAngularDsl.g:319:3: ( rule__CurlyBraces__Group__0 )
            // InternalAngularDsl.g:319:4: rule__CurlyBraces__Group__0
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
    // InternalAngularDsl.g:328:1: entryRuleExpresion : ruleExpresion EOF ;
    public final void entryRuleExpresion() throws RecognitionException {
        try {
            // InternalAngularDsl.g:329:1: ( ruleExpresion EOF )
            // InternalAngularDsl.g:330:1: ruleExpresion EOF
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
    // InternalAngularDsl.g:337:1: ruleExpresion : ( ( rule__Expresion__Group__0 ) ) ;
    public final void ruleExpresion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:341:2: ( ( ( rule__Expresion__Group__0 ) ) )
            // InternalAngularDsl.g:342:2: ( ( rule__Expresion__Group__0 ) )
            {
            // InternalAngularDsl.g:342:2: ( ( rule__Expresion__Group__0 ) )
            // InternalAngularDsl.g:343:3: ( rule__Expresion__Group__0 )
            {
             before(grammarAccess.getExpresionAccess().getGroup()); 
            // InternalAngularDsl.g:344:3: ( rule__Expresion__Group__0 )
            // InternalAngularDsl.g:344:4: rule__Expresion__Group__0
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
    // InternalAngularDsl.g:353:1: entryRuleFiltro : ruleFiltro EOF ;
    public final void entryRuleFiltro() throws RecognitionException {
        try {
            // InternalAngularDsl.g:354:1: ( ruleFiltro EOF )
            // InternalAngularDsl.g:355:1: ruleFiltro EOF
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
    // InternalAngularDsl.g:362:1: ruleFiltro : ( ( rule__Filtro__Group__0 ) ) ;
    public final void ruleFiltro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:366:2: ( ( ( rule__Filtro__Group__0 ) ) )
            // InternalAngularDsl.g:367:2: ( ( rule__Filtro__Group__0 ) )
            {
            // InternalAngularDsl.g:367:2: ( ( rule__Filtro__Group__0 ) )
            // InternalAngularDsl.g:368:3: ( rule__Filtro__Group__0 )
            {
             before(grammarAccess.getFiltroAccess().getGroup()); 
            // InternalAngularDsl.g:369:3: ( rule__Filtro__Group__0 )
            // InternalAngularDsl.g:369:4: rule__Filtro__Group__0
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
    // InternalAngularDsl.g:378:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalAngularDsl.g:379:1: ( ruleEString EOF )
            // InternalAngularDsl.g:380:1: ruleEString EOF
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
    // InternalAngularDsl.g:387:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:391:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalAngularDsl.g:392:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalAngularDsl.g:392:2: ( ( rule__EString__Alternatives ) )
            // InternalAngularDsl.g:393:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalAngularDsl.g:394:3: ( rule__EString__Alternatives )
            // InternalAngularDsl.g:394:4: rule__EString__Alternatives
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


    // $ANTLR start "rule__AppAngular__Alternatives"
    // InternalAngularDsl.g:402:1: rule__AppAngular__Alternatives : ( ( ( rule__AppAngular__ModulosAssignment_0 ) ) | ( ( rule__AppAngular__ComponentesAssignment_1 ) ) | ( ( rule__AppAngular__ServicesAssignment_2 ) ) | ( ( rule__AppAngular__TemplatesAssignment_3 ) ) );
    public final void rule__AppAngular__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:406:1: ( ( ( rule__AppAngular__ModulosAssignment_0 ) ) | ( ( rule__AppAngular__ComponentesAssignment_1 ) ) | ( ( rule__AppAngular__ServicesAssignment_2 ) ) | ( ( rule__AppAngular__TemplatesAssignment_3 ) ) )
            int alt1=4;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalAngularDsl.g:407:2: ( ( rule__AppAngular__ModulosAssignment_0 ) )
                    {
                    // InternalAngularDsl.g:407:2: ( ( rule__AppAngular__ModulosAssignment_0 ) )
                    // InternalAngularDsl.g:408:3: ( rule__AppAngular__ModulosAssignment_0 )
                    {
                     before(grammarAccess.getAppAngularAccess().getModulosAssignment_0()); 
                    // InternalAngularDsl.g:409:3: ( rule__AppAngular__ModulosAssignment_0 )
                    // InternalAngularDsl.g:409:4: rule__AppAngular__ModulosAssignment_0
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
                    // InternalAngularDsl.g:413:2: ( ( rule__AppAngular__ComponentesAssignment_1 ) )
                    {
                    // InternalAngularDsl.g:413:2: ( ( rule__AppAngular__ComponentesAssignment_1 ) )
                    // InternalAngularDsl.g:414:3: ( rule__AppAngular__ComponentesAssignment_1 )
                    {
                     before(grammarAccess.getAppAngularAccess().getComponentesAssignment_1()); 
                    // InternalAngularDsl.g:415:3: ( rule__AppAngular__ComponentesAssignment_1 )
                    // InternalAngularDsl.g:415:4: rule__AppAngular__ComponentesAssignment_1
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
                    // InternalAngularDsl.g:419:2: ( ( rule__AppAngular__ServicesAssignment_2 ) )
                    {
                    // InternalAngularDsl.g:419:2: ( ( rule__AppAngular__ServicesAssignment_2 ) )
                    // InternalAngularDsl.g:420:3: ( rule__AppAngular__ServicesAssignment_2 )
                    {
                     before(grammarAccess.getAppAngularAccess().getServicesAssignment_2()); 
                    // InternalAngularDsl.g:421:3: ( rule__AppAngular__ServicesAssignment_2 )
                    // InternalAngularDsl.g:421:4: rule__AppAngular__ServicesAssignment_2
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
                    // InternalAngularDsl.g:425:2: ( ( rule__AppAngular__TemplatesAssignment_3 ) )
                    {
                    // InternalAngularDsl.g:425:2: ( ( rule__AppAngular__TemplatesAssignment_3 ) )
                    // InternalAngularDsl.g:426:3: ( rule__AppAngular__TemplatesAssignment_3 )
                    {
                     before(grammarAccess.getAppAngularAccess().getTemplatesAssignment_3()); 
                    // InternalAngularDsl.g:427:3: ( rule__AppAngular__TemplatesAssignment_3 )
                    // InternalAngularDsl.g:427:4: rule__AppAngular__TemplatesAssignment_3
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
    // InternalAngularDsl.g:435:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:439:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalAngularDsl.g:440:2: ( RULE_STRING )
                    {
                    // InternalAngularDsl.g:440:2: ( RULE_STRING )
                    // InternalAngularDsl.g:441:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAngularDsl.g:446:2: ( RULE_ID )
                    {
                    // InternalAngularDsl.g:446:2: ( RULE_ID )
                    // InternalAngularDsl.g:447:3: RULE_ID
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


    // $ANTLR start "rule__Modulo__Group__0"
    // InternalAngularDsl.g:456:1: rule__Modulo__Group__0 : rule__Modulo__Group__0__Impl rule__Modulo__Group__1 ;
    public final void rule__Modulo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:460:1: ( rule__Modulo__Group__0__Impl rule__Modulo__Group__1 )
            // InternalAngularDsl.g:461:2: rule__Modulo__Group__0__Impl rule__Modulo__Group__1
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
    // InternalAngularDsl.g:468:1: rule__Modulo__Group__0__Impl : ( () ) ;
    public final void rule__Modulo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:472:1: ( ( () ) )
            // InternalAngularDsl.g:473:1: ( () )
            {
            // InternalAngularDsl.g:473:1: ( () )
            // InternalAngularDsl.g:474:2: ()
            {
             before(grammarAccess.getModuloAccess().getModuloAction_0()); 
            // InternalAngularDsl.g:475:2: ()
            // InternalAngularDsl.g:475:3: 
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
    // InternalAngularDsl.g:483:1: rule__Modulo__Group__1 : rule__Modulo__Group__1__Impl rule__Modulo__Group__2 ;
    public final void rule__Modulo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:487:1: ( rule__Modulo__Group__1__Impl rule__Modulo__Group__2 )
            // InternalAngularDsl.g:488:2: rule__Modulo__Group__1__Impl rule__Modulo__Group__2
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
    // InternalAngularDsl.g:495:1: rule__Modulo__Group__1__Impl : ( ( rule__Modulo__Group_1__0 )? ) ;
    public final void rule__Modulo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:499:1: ( ( ( rule__Modulo__Group_1__0 )? ) )
            // InternalAngularDsl.g:500:1: ( ( rule__Modulo__Group_1__0 )? )
            {
            // InternalAngularDsl.g:500:1: ( ( rule__Modulo__Group_1__0 )? )
            // InternalAngularDsl.g:501:2: ( rule__Modulo__Group_1__0 )?
            {
             before(grammarAccess.getModuloAccess().getGroup_1()); 
            // InternalAngularDsl.g:502:2: ( rule__Modulo__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_COMILLAS) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAngularDsl.g:502:3: rule__Modulo__Group_1__0
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
    // InternalAngularDsl.g:510:1: rule__Modulo__Group__2 : rule__Modulo__Group__2__Impl rule__Modulo__Group__3 ;
    public final void rule__Modulo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:514:1: ( rule__Modulo__Group__2__Impl rule__Modulo__Group__3 )
            // InternalAngularDsl.g:515:2: rule__Modulo__Group__2__Impl rule__Modulo__Group__3
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
    // InternalAngularDsl.g:522:1: rule__Modulo__Group__2__Impl : ( RULE_ANGULAR ) ;
    public final void rule__Modulo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:526:1: ( ( RULE_ANGULAR ) )
            // InternalAngularDsl.g:527:1: ( RULE_ANGULAR )
            {
            // InternalAngularDsl.g:527:1: ( RULE_ANGULAR )
            // InternalAngularDsl.g:528:2: RULE_ANGULAR
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
    // InternalAngularDsl.g:537:1: rule__Modulo__Group__3 : rule__Modulo__Group__3__Impl rule__Modulo__Group__4 ;
    public final void rule__Modulo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:541:1: ( rule__Modulo__Group__3__Impl rule__Modulo__Group__4 )
            // InternalAngularDsl.g:542:2: rule__Modulo__Group__3__Impl rule__Modulo__Group__4
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
    // InternalAngularDsl.g:549:1: rule__Modulo__Group__3__Impl : ( RULE_PUNTO ) ;
    public final void rule__Modulo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:553:1: ( ( RULE_PUNTO ) )
            // InternalAngularDsl.g:554:1: ( RULE_PUNTO )
            {
            // InternalAngularDsl.g:554:1: ( RULE_PUNTO )
            // InternalAngularDsl.g:555:2: RULE_PUNTO
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
    // InternalAngularDsl.g:564:1: rule__Modulo__Group__4 : rule__Modulo__Group__4__Impl rule__Modulo__Group__5 ;
    public final void rule__Modulo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:568:1: ( rule__Modulo__Group__4__Impl rule__Modulo__Group__5 )
            // InternalAngularDsl.g:569:2: rule__Modulo__Group__4__Impl rule__Modulo__Group__5
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
    // InternalAngularDsl.g:576:1: rule__Modulo__Group__4__Impl : ( RULE_MODULE ) ;
    public final void rule__Modulo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:580:1: ( ( RULE_MODULE ) )
            // InternalAngularDsl.g:581:1: ( RULE_MODULE )
            {
            // InternalAngularDsl.g:581:1: ( RULE_MODULE )
            // InternalAngularDsl.g:582:2: RULE_MODULE
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
    // InternalAngularDsl.g:591:1: rule__Modulo__Group__5 : rule__Modulo__Group__5__Impl rule__Modulo__Group__6 ;
    public final void rule__Modulo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:595:1: ( rule__Modulo__Group__5__Impl rule__Modulo__Group__6 )
            // InternalAngularDsl.g:596:2: rule__Modulo__Group__5__Impl rule__Modulo__Group__6
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
    // InternalAngularDsl.g:603:1: rule__Modulo__Group__5__Impl : ( RULE_PARENTESIS_IZQUIERDO ) ;
    public final void rule__Modulo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:607:1: ( ( RULE_PARENTESIS_IZQUIERDO ) )
            // InternalAngularDsl.g:608:1: ( RULE_PARENTESIS_IZQUIERDO )
            {
            // InternalAngularDsl.g:608:1: ( RULE_PARENTESIS_IZQUIERDO )
            // InternalAngularDsl.g:609:2: RULE_PARENTESIS_IZQUIERDO
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
    // InternalAngularDsl.g:618:1: rule__Modulo__Group__6 : rule__Modulo__Group__6__Impl rule__Modulo__Group__7 ;
    public final void rule__Modulo__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:622:1: ( rule__Modulo__Group__6__Impl rule__Modulo__Group__7 )
            // InternalAngularDsl.g:623:2: rule__Modulo__Group__6__Impl rule__Modulo__Group__7
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
    // InternalAngularDsl.g:630:1: rule__Modulo__Group__6__Impl : ( ( rule__Modulo__NameAssignment_6 ) ) ;
    public final void rule__Modulo__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:634:1: ( ( ( rule__Modulo__NameAssignment_6 ) ) )
            // InternalAngularDsl.g:635:1: ( ( rule__Modulo__NameAssignment_6 ) )
            {
            // InternalAngularDsl.g:635:1: ( ( rule__Modulo__NameAssignment_6 ) )
            // InternalAngularDsl.g:636:2: ( rule__Modulo__NameAssignment_6 )
            {
             before(grammarAccess.getModuloAccess().getNameAssignment_6()); 
            // InternalAngularDsl.g:637:2: ( rule__Modulo__NameAssignment_6 )
            // InternalAngularDsl.g:637:3: rule__Modulo__NameAssignment_6
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
    // InternalAngularDsl.g:645:1: rule__Modulo__Group__7 : rule__Modulo__Group__7__Impl rule__Modulo__Group__8 ;
    public final void rule__Modulo__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:649:1: ( rule__Modulo__Group__7__Impl rule__Modulo__Group__8 )
            // InternalAngularDsl.g:650:2: rule__Modulo__Group__7__Impl rule__Modulo__Group__8
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
    // InternalAngularDsl.g:657:1: rule__Modulo__Group__7__Impl : ( RULE_COMA ) ;
    public final void rule__Modulo__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:661:1: ( ( RULE_COMA ) )
            // InternalAngularDsl.g:662:1: ( RULE_COMA )
            {
            // InternalAngularDsl.g:662:1: ( RULE_COMA )
            // InternalAngularDsl.g:663:2: RULE_COMA
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
    // InternalAngularDsl.g:672:1: rule__Modulo__Group__8 : rule__Modulo__Group__8__Impl rule__Modulo__Group__9 ;
    public final void rule__Modulo__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:676:1: ( rule__Modulo__Group__8__Impl rule__Modulo__Group__9 )
            // InternalAngularDsl.g:677:2: rule__Modulo__Group__8__Impl rule__Modulo__Group__9
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
    // InternalAngularDsl.g:684:1: rule__Modulo__Group__8__Impl : ( RULE_PARENTESIS_CUADRADO_IZQUIERDO ) ;
    public final void rule__Modulo__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:688:1: ( ( RULE_PARENTESIS_CUADRADO_IZQUIERDO ) )
            // InternalAngularDsl.g:689:1: ( RULE_PARENTESIS_CUADRADO_IZQUIERDO )
            {
            // InternalAngularDsl.g:689:1: ( RULE_PARENTESIS_CUADRADO_IZQUIERDO )
            // InternalAngularDsl.g:690:2: RULE_PARENTESIS_CUADRADO_IZQUIERDO
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
    // InternalAngularDsl.g:699:1: rule__Modulo__Group__9 : rule__Modulo__Group__9__Impl rule__Modulo__Group__10 ;
    public final void rule__Modulo__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:703:1: ( rule__Modulo__Group__9__Impl rule__Modulo__Group__10 )
            // InternalAngularDsl.g:704:2: rule__Modulo__Group__9__Impl rule__Modulo__Group__10
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
    // InternalAngularDsl.g:711:1: rule__Modulo__Group__9__Impl : ( ( rule__Modulo__Group_9__0 )* ) ;
    public final void rule__Modulo__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:715:1: ( ( ( rule__Modulo__Group_9__0 )* ) )
            // InternalAngularDsl.g:716:1: ( ( rule__Modulo__Group_9__0 )* )
            {
            // InternalAngularDsl.g:716:1: ( ( rule__Modulo__Group_9__0 )* )
            // InternalAngularDsl.g:717:2: ( rule__Modulo__Group_9__0 )*
            {
             before(grammarAccess.getModuloAccess().getGroup_9()); 
            // InternalAngularDsl.g:718:2: ( rule__Modulo__Group_9__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAngularDsl.g:718:3: rule__Modulo__Group_9__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Modulo__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalAngularDsl.g:726:1: rule__Modulo__Group__10 : rule__Modulo__Group__10__Impl rule__Modulo__Group__11 ;
    public final void rule__Modulo__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:730:1: ( rule__Modulo__Group__10__Impl rule__Modulo__Group__11 )
            // InternalAngularDsl.g:731:2: rule__Modulo__Group__10__Impl rule__Modulo__Group__11
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
    // InternalAngularDsl.g:738:1: rule__Modulo__Group__10__Impl : ( RULE_PARENTESIS_CUADRADO_DERECHO ) ;
    public final void rule__Modulo__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:742:1: ( ( RULE_PARENTESIS_CUADRADO_DERECHO ) )
            // InternalAngularDsl.g:743:1: ( RULE_PARENTESIS_CUADRADO_DERECHO )
            {
            // InternalAngularDsl.g:743:1: ( RULE_PARENTESIS_CUADRADO_DERECHO )
            // InternalAngularDsl.g:744:2: RULE_PARENTESIS_CUADRADO_DERECHO
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
    // InternalAngularDsl.g:753:1: rule__Modulo__Group__11 : rule__Modulo__Group__11__Impl rule__Modulo__Group__12 ;
    public final void rule__Modulo__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:757:1: ( rule__Modulo__Group__11__Impl rule__Modulo__Group__12 )
            // InternalAngularDsl.g:758:2: rule__Modulo__Group__11__Impl rule__Modulo__Group__12
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
    // InternalAngularDsl.g:765:1: rule__Modulo__Group__11__Impl : ( RULE_PARENTESIS_DERECHO ) ;
    public final void rule__Modulo__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:769:1: ( ( RULE_PARENTESIS_DERECHO ) )
            // InternalAngularDsl.g:770:1: ( RULE_PARENTESIS_DERECHO )
            {
            // InternalAngularDsl.g:770:1: ( RULE_PARENTESIS_DERECHO )
            // InternalAngularDsl.g:771:2: RULE_PARENTESIS_DERECHO
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
    // InternalAngularDsl.g:780:1: rule__Modulo__Group__12 : rule__Modulo__Group__12__Impl ;
    public final void rule__Modulo__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:784:1: ( rule__Modulo__Group__12__Impl )
            // InternalAngularDsl.g:785:2: rule__Modulo__Group__12__Impl
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
    // InternalAngularDsl.g:791:1: rule__Modulo__Group__12__Impl : ( RULE_PUNTO_Y_COMA ) ;
    public final void rule__Modulo__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:795:1: ( ( RULE_PUNTO_Y_COMA ) )
            // InternalAngularDsl.g:796:1: ( RULE_PUNTO_Y_COMA )
            {
            // InternalAngularDsl.g:796:1: ( RULE_PUNTO_Y_COMA )
            // InternalAngularDsl.g:797:2: RULE_PUNTO_Y_COMA
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
    // InternalAngularDsl.g:807:1: rule__Modulo__Group_1__0 : rule__Modulo__Group_1__0__Impl rule__Modulo__Group_1__1 ;
    public final void rule__Modulo__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:811:1: ( rule__Modulo__Group_1__0__Impl rule__Modulo__Group_1__1 )
            // InternalAngularDsl.g:812:2: rule__Modulo__Group_1__0__Impl rule__Modulo__Group_1__1
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
    // InternalAngularDsl.g:819:1: rule__Modulo__Group_1__0__Impl : ( RULE_COMILLAS ) ;
    public final void rule__Modulo__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:823:1: ( ( RULE_COMILLAS ) )
            // InternalAngularDsl.g:824:1: ( RULE_COMILLAS )
            {
            // InternalAngularDsl.g:824:1: ( RULE_COMILLAS )
            // InternalAngularDsl.g:825:2: RULE_COMILLAS
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
    // InternalAngularDsl.g:834:1: rule__Modulo__Group_1__1 : rule__Modulo__Group_1__1__Impl rule__Modulo__Group_1__2 ;
    public final void rule__Modulo__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:838:1: ( rule__Modulo__Group_1__1__Impl rule__Modulo__Group_1__2 )
            // InternalAngularDsl.g:839:2: rule__Modulo__Group_1__1__Impl rule__Modulo__Group_1__2
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
    // InternalAngularDsl.g:846:1: rule__Modulo__Group_1__1__Impl : ( RULE_USE ) ;
    public final void rule__Modulo__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:850:1: ( ( RULE_USE ) )
            // InternalAngularDsl.g:851:1: ( RULE_USE )
            {
            // InternalAngularDsl.g:851:1: ( RULE_USE )
            // InternalAngularDsl.g:852:2: RULE_USE
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
    // InternalAngularDsl.g:861:1: rule__Modulo__Group_1__2 : rule__Modulo__Group_1__2__Impl rule__Modulo__Group_1__3 ;
    public final void rule__Modulo__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:865:1: ( rule__Modulo__Group_1__2__Impl rule__Modulo__Group_1__3 )
            // InternalAngularDsl.g:866:2: rule__Modulo__Group_1__2__Impl rule__Modulo__Group_1__3
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
    // InternalAngularDsl.g:873:1: rule__Modulo__Group_1__2__Impl : ( RULE_STRICT ) ;
    public final void rule__Modulo__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:877:1: ( ( RULE_STRICT ) )
            // InternalAngularDsl.g:878:1: ( RULE_STRICT )
            {
            // InternalAngularDsl.g:878:1: ( RULE_STRICT )
            // InternalAngularDsl.g:879:2: RULE_STRICT
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
    // InternalAngularDsl.g:888:1: rule__Modulo__Group_1__3 : rule__Modulo__Group_1__3__Impl rule__Modulo__Group_1__4 ;
    public final void rule__Modulo__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:892:1: ( rule__Modulo__Group_1__3__Impl rule__Modulo__Group_1__4 )
            // InternalAngularDsl.g:893:2: rule__Modulo__Group_1__3__Impl rule__Modulo__Group_1__4
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
    // InternalAngularDsl.g:900:1: rule__Modulo__Group_1__3__Impl : ( RULE_COMILLAS ) ;
    public final void rule__Modulo__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:904:1: ( ( RULE_COMILLAS ) )
            // InternalAngularDsl.g:905:1: ( RULE_COMILLAS )
            {
            // InternalAngularDsl.g:905:1: ( RULE_COMILLAS )
            // InternalAngularDsl.g:906:2: RULE_COMILLAS
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
    // InternalAngularDsl.g:915:1: rule__Modulo__Group_1__4 : rule__Modulo__Group_1__4__Impl ;
    public final void rule__Modulo__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:919:1: ( rule__Modulo__Group_1__4__Impl )
            // InternalAngularDsl.g:920:2: rule__Modulo__Group_1__4__Impl
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
    // InternalAngularDsl.g:926:1: rule__Modulo__Group_1__4__Impl : ( RULE_PUNTO_Y_COMA ) ;
    public final void rule__Modulo__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:930:1: ( ( RULE_PUNTO_Y_COMA ) )
            // InternalAngularDsl.g:931:1: ( RULE_PUNTO_Y_COMA )
            {
            // InternalAngularDsl.g:931:1: ( RULE_PUNTO_Y_COMA )
            // InternalAngularDsl.g:932:2: RULE_PUNTO_Y_COMA
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
    // InternalAngularDsl.g:942:1: rule__Modulo__Group_9__0 : rule__Modulo__Group_9__0__Impl rule__Modulo__Group_9__1 ;
    public final void rule__Modulo__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:946:1: ( rule__Modulo__Group_9__0__Impl rule__Modulo__Group_9__1 )
            // InternalAngularDsl.g:947:2: rule__Modulo__Group_9__0__Impl rule__Modulo__Group_9__1
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
    // InternalAngularDsl.g:954:1: rule__Modulo__Group_9__0__Impl : ( ( rule__Modulo__ParametrosAssignment_9_0 ) ) ;
    public final void rule__Modulo__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:958:1: ( ( ( rule__Modulo__ParametrosAssignment_9_0 ) ) )
            // InternalAngularDsl.g:959:1: ( ( rule__Modulo__ParametrosAssignment_9_0 ) )
            {
            // InternalAngularDsl.g:959:1: ( ( rule__Modulo__ParametrosAssignment_9_0 ) )
            // InternalAngularDsl.g:960:2: ( rule__Modulo__ParametrosAssignment_9_0 )
            {
             before(grammarAccess.getModuloAccess().getParametrosAssignment_9_0()); 
            // InternalAngularDsl.g:961:2: ( rule__Modulo__ParametrosAssignment_9_0 )
            // InternalAngularDsl.g:961:3: rule__Modulo__ParametrosAssignment_9_0
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
    // InternalAngularDsl.g:969:1: rule__Modulo__Group_9__1 : rule__Modulo__Group_9__1__Impl ;
    public final void rule__Modulo__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:973:1: ( rule__Modulo__Group_9__1__Impl )
            // InternalAngularDsl.g:974:2: rule__Modulo__Group_9__1__Impl
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
    // InternalAngularDsl.g:980:1: rule__Modulo__Group_9__1__Impl : ( ( rule__Modulo__Group_9_1__0 )* ) ;
    public final void rule__Modulo__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:984:1: ( ( ( rule__Modulo__Group_9_1__0 )* ) )
            // InternalAngularDsl.g:985:1: ( ( rule__Modulo__Group_9_1__0 )* )
            {
            // InternalAngularDsl.g:985:1: ( ( rule__Modulo__Group_9_1__0 )* )
            // InternalAngularDsl.g:986:2: ( rule__Modulo__Group_9_1__0 )*
            {
             before(grammarAccess.getModuloAccess().getGroup_9_1()); 
            // InternalAngularDsl.g:987:2: ( rule__Modulo__Group_9_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAngularDsl.g:987:3: rule__Modulo__Group_9_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Modulo__Group_9_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalAngularDsl.g:996:1: rule__Modulo__Group_9_1__0 : rule__Modulo__Group_9_1__0__Impl rule__Modulo__Group_9_1__1 ;
    public final void rule__Modulo__Group_9_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1000:1: ( rule__Modulo__Group_9_1__0__Impl rule__Modulo__Group_9_1__1 )
            // InternalAngularDsl.g:1001:2: rule__Modulo__Group_9_1__0__Impl rule__Modulo__Group_9_1__1
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
    // InternalAngularDsl.g:1008:1: rule__Modulo__Group_9_1__0__Impl : ( RULE_COMA ) ;
    public final void rule__Modulo__Group_9_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1012:1: ( ( RULE_COMA ) )
            // InternalAngularDsl.g:1013:1: ( RULE_COMA )
            {
            // InternalAngularDsl.g:1013:1: ( RULE_COMA )
            // InternalAngularDsl.g:1014:2: RULE_COMA
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
    // InternalAngularDsl.g:1023:1: rule__Modulo__Group_9_1__1 : rule__Modulo__Group_9_1__1__Impl ;
    public final void rule__Modulo__Group_9_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1027:1: ( rule__Modulo__Group_9_1__1__Impl )
            // InternalAngularDsl.g:1028:2: rule__Modulo__Group_9_1__1__Impl
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
    // InternalAngularDsl.g:1034:1: rule__Modulo__Group_9_1__1__Impl : ( ( rule__Modulo__ParametrosAssignment_9_1_1 ) ) ;
    public final void rule__Modulo__Group_9_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1038:1: ( ( ( rule__Modulo__ParametrosAssignment_9_1_1 ) ) )
            // InternalAngularDsl.g:1039:1: ( ( rule__Modulo__ParametrosAssignment_9_1_1 ) )
            {
            // InternalAngularDsl.g:1039:1: ( ( rule__Modulo__ParametrosAssignment_9_1_1 ) )
            // InternalAngularDsl.g:1040:2: ( rule__Modulo__ParametrosAssignment_9_1_1 )
            {
             before(grammarAccess.getModuloAccess().getParametrosAssignment_9_1_1()); 
            // InternalAngularDsl.g:1041:2: ( rule__Modulo__ParametrosAssignment_9_1_1 )
            // InternalAngularDsl.g:1041:3: rule__Modulo__ParametrosAssignment_9_1_1
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
    // InternalAngularDsl.g:1050:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1054:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalAngularDsl.g:1055:2: rule__Service__Group__0__Impl rule__Service__Group__1
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
    // InternalAngularDsl.g:1062:1: rule__Service__Group__0__Impl : ( () ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1066:1: ( ( () ) )
            // InternalAngularDsl.g:1067:1: ( () )
            {
            // InternalAngularDsl.g:1067:1: ( () )
            // InternalAngularDsl.g:1068:2: ()
            {
             before(grammarAccess.getServiceAccess().getServiceAction_0()); 
            // InternalAngularDsl.g:1069:2: ()
            // InternalAngularDsl.g:1069:3: 
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
    // InternalAngularDsl.g:1077:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1081:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalAngularDsl.g:1082:2: rule__Service__Group__1__Impl rule__Service__Group__2
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
    // InternalAngularDsl.g:1089:1: rule__Service__Group__1__Impl : ( ( rule__Service__Group_1__0 )? ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1093:1: ( ( ( rule__Service__Group_1__0 )? ) )
            // InternalAngularDsl.g:1094:1: ( ( rule__Service__Group_1__0 )? )
            {
            // InternalAngularDsl.g:1094:1: ( ( rule__Service__Group_1__0 )? )
            // InternalAngularDsl.g:1095:2: ( rule__Service__Group_1__0 )?
            {
             before(grammarAccess.getServiceAccess().getGroup_1()); 
            // InternalAngularDsl.g:1096:2: ( rule__Service__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_COMILLAS) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAngularDsl.g:1096:3: rule__Service__Group_1__0
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
    // InternalAngularDsl.g:1104:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1108:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalAngularDsl.g:1109:2: rule__Service__Group__2__Impl rule__Service__Group__3
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
    // InternalAngularDsl.g:1116:1: rule__Service__Group__2__Impl : ( RULE_ANGULAR ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1120:1: ( ( RULE_ANGULAR ) )
            // InternalAngularDsl.g:1121:1: ( RULE_ANGULAR )
            {
            // InternalAngularDsl.g:1121:1: ( RULE_ANGULAR )
            // InternalAngularDsl.g:1122:2: RULE_ANGULAR
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
    // InternalAngularDsl.g:1131:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1135:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalAngularDsl.g:1136:2: rule__Service__Group__3__Impl rule__Service__Group__4
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
    // InternalAngularDsl.g:1143:1: rule__Service__Group__3__Impl : ( RULE_PUNTO ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1147:1: ( ( RULE_PUNTO ) )
            // InternalAngularDsl.g:1148:1: ( RULE_PUNTO )
            {
            // InternalAngularDsl.g:1148:1: ( RULE_PUNTO )
            // InternalAngularDsl.g:1149:2: RULE_PUNTO
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
    // InternalAngularDsl.g:1158:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1162:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalAngularDsl.g:1163:2: rule__Service__Group__4__Impl rule__Service__Group__5
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
    // InternalAngularDsl.g:1170:1: rule__Service__Group__4__Impl : ( RULE_MODULE ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1174:1: ( ( RULE_MODULE ) )
            // InternalAngularDsl.g:1175:1: ( RULE_MODULE )
            {
            // InternalAngularDsl.g:1175:1: ( RULE_MODULE )
            // InternalAngularDsl.g:1176:2: RULE_MODULE
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
    // InternalAngularDsl.g:1185:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1189:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalAngularDsl.g:1190:2: rule__Service__Group__5__Impl rule__Service__Group__6
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
    // InternalAngularDsl.g:1197:1: rule__Service__Group__5__Impl : ( RULE_PARENTESIS_IZQUIERDO ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1201:1: ( ( RULE_PARENTESIS_IZQUIERDO ) )
            // InternalAngularDsl.g:1202:1: ( RULE_PARENTESIS_IZQUIERDO )
            {
            // InternalAngularDsl.g:1202:1: ( RULE_PARENTESIS_IZQUIERDO )
            // InternalAngularDsl.g:1203:2: RULE_PARENTESIS_IZQUIERDO
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
    // InternalAngularDsl.g:1212:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1216:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // InternalAngularDsl.g:1217:2: rule__Service__Group__6__Impl rule__Service__Group__7
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
    // InternalAngularDsl.g:1224:1: rule__Service__Group__6__Impl : ( ( rule__Service__ModuloAssignment_6 ) ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1228:1: ( ( ( rule__Service__ModuloAssignment_6 ) ) )
            // InternalAngularDsl.g:1229:1: ( ( rule__Service__ModuloAssignment_6 ) )
            {
            // InternalAngularDsl.g:1229:1: ( ( rule__Service__ModuloAssignment_6 ) )
            // InternalAngularDsl.g:1230:2: ( rule__Service__ModuloAssignment_6 )
            {
             before(grammarAccess.getServiceAccess().getModuloAssignment_6()); 
            // InternalAngularDsl.g:1231:2: ( rule__Service__ModuloAssignment_6 )
            // InternalAngularDsl.g:1231:3: rule__Service__ModuloAssignment_6
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
    // InternalAngularDsl.g:1239:1: rule__Service__Group__7 : rule__Service__Group__7__Impl rule__Service__Group__8 ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1243:1: ( rule__Service__Group__7__Impl rule__Service__Group__8 )
            // InternalAngularDsl.g:1244:2: rule__Service__Group__7__Impl rule__Service__Group__8
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
    // InternalAngularDsl.g:1251:1: rule__Service__Group__7__Impl : ( RULE_PARENTESIS_DERECHO ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1255:1: ( ( RULE_PARENTESIS_DERECHO ) )
            // InternalAngularDsl.g:1256:1: ( RULE_PARENTESIS_DERECHO )
            {
            // InternalAngularDsl.g:1256:1: ( RULE_PARENTESIS_DERECHO )
            // InternalAngularDsl.g:1257:2: RULE_PARENTESIS_DERECHO
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
    // InternalAngularDsl.g:1266:1: rule__Service__Group__8 : rule__Service__Group__8__Impl rule__Service__Group__9 ;
    public final void rule__Service__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1270:1: ( rule__Service__Group__8__Impl rule__Service__Group__9 )
            // InternalAngularDsl.g:1271:2: rule__Service__Group__8__Impl rule__Service__Group__9
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
    // InternalAngularDsl.g:1278:1: rule__Service__Group__8__Impl : ( RULE_PUNTO ) ;
    public final void rule__Service__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1282:1: ( ( RULE_PUNTO ) )
            // InternalAngularDsl.g:1283:1: ( RULE_PUNTO )
            {
            // InternalAngularDsl.g:1283:1: ( RULE_PUNTO )
            // InternalAngularDsl.g:1284:2: RULE_PUNTO
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
    // InternalAngularDsl.g:1293:1: rule__Service__Group__9 : rule__Service__Group__9__Impl rule__Service__Group__10 ;
    public final void rule__Service__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1297:1: ( rule__Service__Group__9__Impl rule__Service__Group__10 )
            // InternalAngularDsl.g:1298:2: rule__Service__Group__9__Impl rule__Service__Group__10
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
    // InternalAngularDsl.g:1305:1: rule__Service__Group__9__Impl : ( 'factory' ) ;
    public final void rule__Service__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1309:1: ( ( 'factory' ) )
            // InternalAngularDsl.g:1310:1: ( 'factory' )
            {
            // InternalAngularDsl.g:1310:1: ( 'factory' )
            // InternalAngularDsl.g:1311:2: 'factory'
            {
             before(grammarAccess.getServiceAccess().getFactoryKeyword_9()); 
            match(input,30,FOLLOW_2); 
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
    // InternalAngularDsl.g:1320:1: rule__Service__Group__10 : rule__Service__Group__10__Impl rule__Service__Group__11 ;
    public final void rule__Service__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1324:1: ( rule__Service__Group__10__Impl rule__Service__Group__11 )
            // InternalAngularDsl.g:1325:2: rule__Service__Group__10__Impl rule__Service__Group__11
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
    // InternalAngularDsl.g:1332:1: rule__Service__Group__10__Impl : ( RULE_PARENTESIS_IZQUIERDO ) ;
    public final void rule__Service__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1336:1: ( ( RULE_PARENTESIS_IZQUIERDO ) )
            // InternalAngularDsl.g:1337:1: ( RULE_PARENTESIS_IZQUIERDO )
            {
            // InternalAngularDsl.g:1337:1: ( RULE_PARENTESIS_IZQUIERDO )
            // InternalAngularDsl.g:1338:2: RULE_PARENTESIS_IZQUIERDO
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
    // InternalAngularDsl.g:1347:1: rule__Service__Group__11 : rule__Service__Group__11__Impl rule__Service__Group__12 ;
    public final void rule__Service__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1351:1: ( rule__Service__Group__11__Impl rule__Service__Group__12 )
            // InternalAngularDsl.g:1352:2: rule__Service__Group__11__Impl rule__Service__Group__12
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
    // InternalAngularDsl.g:1359:1: rule__Service__Group__11__Impl : ( ( rule__Service__NameAssignment_11 ) ) ;
    public final void rule__Service__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1363:1: ( ( ( rule__Service__NameAssignment_11 ) ) )
            // InternalAngularDsl.g:1364:1: ( ( rule__Service__NameAssignment_11 ) )
            {
            // InternalAngularDsl.g:1364:1: ( ( rule__Service__NameAssignment_11 ) )
            // InternalAngularDsl.g:1365:2: ( rule__Service__NameAssignment_11 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_11()); 
            // InternalAngularDsl.g:1366:2: ( rule__Service__NameAssignment_11 )
            // InternalAngularDsl.g:1366:3: rule__Service__NameAssignment_11
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
    // InternalAngularDsl.g:1374:1: rule__Service__Group__12 : rule__Service__Group__12__Impl rule__Service__Group__13 ;
    public final void rule__Service__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1378:1: ( rule__Service__Group__12__Impl rule__Service__Group__13 )
            // InternalAngularDsl.g:1379:2: rule__Service__Group__12__Impl rule__Service__Group__13
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
    // InternalAngularDsl.g:1386:1: rule__Service__Group__12__Impl : ( RULE_COMA ) ;
    public final void rule__Service__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1390:1: ( ( RULE_COMA ) )
            // InternalAngularDsl.g:1391:1: ( RULE_COMA )
            {
            // InternalAngularDsl.g:1391:1: ( RULE_COMA )
            // InternalAngularDsl.g:1392:2: RULE_COMA
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
    // InternalAngularDsl.g:1401:1: rule__Service__Group__13 : rule__Service__Group__13__Impl rule__Service__Group__14 ;
    public final void rule__Service__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1405:1: ( rule__Service__Group__13__Impl rule__Service__Group__14 )
            // InternalAngularDsl.g:1406:2: rule__Service__Group__13__Impl rule__Service__Group__14
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
    // InternalAngularDsl.g:1413:1: rule__Service__Group__13__Impl : ( RULE_PARENTESIS_CUADRADO_IZQUIERDO ) ;
    public final void rule__Service__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1417:1: ( ( RULE_PARENTESIS_CUADRADO_IZQUIERDO ) )
            // InternalAngularDsl.g:1418:1: ( RULE_PARENTESIS_CUADRADO_IZQUIERDO )
            {
            // InternalAngularDsl.g:1418:1: ( RULE_PARENTESIS_CUADRADO_IZQUIERDO )
            // InternalAngularDsl.g:1419:2: RULE_PARENTESIS_CUADRADO_IZQUIERDO
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
    // InternalAngularDsl.g:1428:1: rule__Service__Group__14 : rule__Service__Group__14__Impl rule__Service__Group__15 ;
    public final void rule__Service__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1432:1: ( rule__Service__Group__14__Impl rule__Service__Group__15 )
            // InternalAngularDsl.g:1433:2: rule__Service__Group__14__Impl rule__Service__Group__15
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
    // InternalAngularDsl.g:1440:1: rule__Service__Group__14__Impl : ( ( rule__Service__Group_14__0 )* ) ;
    public final void rule__Service__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1444:1: ( ( ( rule__Service__Group_14__0 )* ) )
            // InternalAngularDsl.g:1445:1: ( ( rule__Service__Group_14__0 )* )
            {
            // InternalAngularDsl.g:1445:1: ( ( rule__Service__Group_14__0 )* )
            // InternalAngularDsl.g:1446:2: ( rule__Service__Group_14__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_14()); 
            // InternalAngularDsl.g:1447:2: ( rule__Service__Group_14__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAngularDsl.g:1447:3: rule__Service__Group_14__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Service__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalAngularDsl.g:1455:1: rule__Service__Group__15 : rule__Service__Group__15__Impl rule__Service__Group__16 ;
    public final void rule__Service__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1459:1: ( rule__Service__Group__15__Impl rule__Service__Group__16 )
            // InternalAngularDsl.g:1460:2: rule__Service__Group__15__Impl rule__Service__Group__16
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
    // InternalAngularDsl.g:1467:1: rule__Service__Group__15__Impl : ( RULE_COMA ) ;
    public final void rule__Service__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1471:1: ( ( RULE_COMA ) )
            // InternalAngularDsl.g:1472:1: ( RULE_COMA )
            {
            // InternalAngularDsl.g:1472:1: ( RULE_COMA )
            // InternalAngularDsl.g:1473:2: RULE_COMA
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
    // InternalAngularDsl.g:1482:1: rule__Service__Group__16 : rule__Service__Group__16__Impl rule__Service__Group__17 ;
    public final void rule__Service__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1486:1: ( rule__Service__Group__16__Impl rule__Service__Group__17 )
            // InternalAngularDsl.g:1487:2: rule__Service__Group__16__Impl rule__Service__Group__17
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
    // InternalAngularDsl.g:1494:1: rule__Service__Group__16__Impl : ( ( rule__Service__FuncionAssignment_16 ) ) ;
    public final void rule__Service__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1498:1: ( ( ( rule__Service__FuncionAssignment_16 ) ) )
            // InternalAngularDsl.g:1499:1: ( ( rule__Service__FuncionAssignment_16 ) )
            {
            // InternalAngularDsl.g:1499:1: ( ( rule__Service__FuncionAssignment_16 ) )
            // InternalAngularDsl.g:1500:2: ( rule__Service__FuncionAssignment_16 )
            {
             before(grammarAccess.getServiceAccess().getFuncionAssignment_16()); 
            // InternalAngularDsl.g:1501:2: ( rule__Service__FuncionAssignment_16 )
            // InternalAngularDsl.g:1501:3: rule__Service__FuncionAssignment_16
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
    // InternalAngularDsl.g:1509:1: rule__Service__Group__17 : rule__Service__Group__17__Impl rule__Service__Group__18 ;
    public final void rule__Service__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1513:1: ( rule__Service__Group__17__Impl rule__Service__Group__18 )
            // InternalAngularDsl.g:1514:2: rule__Service__Group__17__Impl rule__Service__Group__18
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
    // InternalAngularDsl.g:1521:1: rule__Service__Group__17__Impl : ( RULE_PARENTESIS_CUADRADO_DERECHO ) ;
    public final void rule__Service__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1525:1: ( ( RULE_PARENTESIS_CUADRADO_DERECHO ) )
            // InternalAngularDsl.g:1526:1: ( RULE_PARENTESIS_CUADRADO_DERECHO )
            {
            // InternalAngularDsl.g:1526:1: ( RULE_PARENTESIS_CUADRADO_DERECHO )
            // InternalAngularDsl.g:1527:2: RULE_PARENTESIS_CUADRADO_DERECHO
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
    // InternalAngularDsl.g:1536:1: rule__Service__Group__18 : rule__Service__Group__18__Impl rule__Service__Group__19 ;
    public final void rule__Service__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1540:1: ( rule__Service__Group__18__Impl rule__Service__Group__19 )
            // InternalAngularDsl.g:1541:2: rule__Service__Group__18__Impl rule__Service__Group__19
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
    // InternalAngularDsl.g:1548:1: rule__Service__Group__18__Impl : ( RULE_PARENTESIS_DERECHO ) ;
    public final void rule__Service__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1552:1: ( ( RULE_PARENTESIS_DERECHO ) )
            // InternalAngularDsl.g:1553:1: ( RULE_PARENTESIS_DERECHO )
            {
            // InternalAngularDsl.g:1553:1: ( RULE_PARENTESIS_DERECHO )
            // InternalAngularDsl.g:1554:2: RULE_PARENTESIS_DERECHO
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
    // InternalAngularDsl.g:1563:1: rule__Service__Group__19 : rule__Service__Group__19__Impl ;
    public final void rule__Service__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1567:1: ( rule__Service__Group__19__Impl )
            // InternalAngularDsl.g:1568:2: rule__Service__Group__19__Impl
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
    // InternalAngularDsl.g:1574:1: rule__Service__Group__19__Impl : ( RULE_PUNTO_Y_COMA ) ;
    public final void rule__Service__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1578:1: ( ( RULE_PUNTO_Y_COMA ) )
            // InternalAngularDsl.g:1579:1: ( RULE_PUNTO_Y_COMA )
            {
            // InternalAngularDsl.g:1579:1: ( RULE_PUNTO_Y_COMA )
            // InternalAngularDsl.g:1580:2: RULE_PUNTO_Y_COMA
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
    // InternalAngularDsl.g:1590:1: rule__Service__Group_1__0 : rule__Service__Group_1__0__Impl rule__Service__Group_1__1 ;
    public final void rule__Service__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1594:1: ( rule__Service__Group_1__0__Impl rule__Service__Group_1__1 )
            // InternalAngularDsl.g:1595:2: rule__Service__Group_1__0__Impl rule__Service__Group_1__1
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
    // InternalAngularDsl.g:1602:1: rule__Service__Group_1__0__Impl : ( RULE_COMILLAS ) ;
    public final void rule__Service__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1606:1: ( ( RULE_COMILLAS ) )
            // InternalAngularDsl.g:1607:1: ( RULE_COMILLAS )
            {
            // InternalAngularDsl.g:1607:1: ( RULE_COMILLAS )
            // InternalAngularDsl.g:1608:2: RULE_COMILLAS
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
    // InternalAngularDsl.g:1617:1: rule__Service__Group_1__1 : rule__Service__Group_1__1__Impl rule__Service__Group_1__2 ;
    public final void rule__Service__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1621:1: ( rule__Service__Group_1__1__Impl rule__Service__Group_1__2 )
            // InternalAngularDsl.g:1622:2: rule__Service__Group_1__1__Impl rule__Service__Group_1__2
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
    // InternalAngularDsl.g:1629:1: rule__Service__Group_1__1__Impl : ( RULE_USE ) ;
    public final void rule__Service__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1633:1: ( ( RULE_USE ) )
            // InternalAngularDsl.g:1634:1: ( RULE_USE )
            {
            // InternalAngularDsl.g:1634:1: ( RULE_USE )
            // InternalAngularDsl.g:1635:2: RULE_USE
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
    // InternalAngularDsl.g:1644:1: rule__Service__Group_1__2 : rule__Service__Group_1__2__Impl rule__Service__Group_1__3 ;
    public final void rule__Service__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1648:1: ( rule__Service__Group_1__2__Impl rule__Service__Group_1__3 )
            // InternalAngularDsl.g:1649:2: rule__Service__Group_1__2__Impl rule__Service__Group_1__3
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
    // InternalAngularDsl.g:1656:1: rule__Service__Group_1__2__Impl : ( RULE_STRICT ) ;
    public final void rule__Service__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1660:1: ( ( RULE_STRICT ) )
            // InternalAngularDsl.g:1661:1: ( RULE_STRICT )
            {
            // InternalAngularDsl.g:1661:1: ( RULE_STRICT )
            // InternalAngularDsl.g:1662:2: RULE_STRICT
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
    // InternalAngularDsl.g:1671:1: rule__Service__Group_1__3 : rule__Service__Group_1__3__Impl rule__Service__Group_1__4 ;
    public final void rule__Service__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1675:1: ( rule__Service__Group_1__3__Impl rule__Service__Group_1__4 )
            // InternalAngularDsl.g:1676:2: rule__Service__Group_1__3__Impl rule__Service__Group_1__4
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
    // InternalAngularDsl.g:1683:1: rule__Service__Group_1__3__Impl : ( RULE_COMILLAS ) ;
    public final void rule__Service__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1687:1: ( ( RULE_COMILLAS ) )
            // InternalAngularDsl.g:1688:1: ( RULE_COMILLAS )
            {
            // InternalAngularDsl.g:1688:1: ( RULE_COMILLAS )
            // InternalAngularDsl.g:1689:2: RULE_COMILLAS
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
    // InternalAngularDsl.g:1698:1: rule__Service__Group_1__4 : rule__Service__Group_1__4__Impl ;
    public final void rule__Service__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1702:1: ( rule__Service__Group_1__4__Impl )
            // InternalAngularDsl.g:1703:2: rule__Service__Group_1__4__Impl
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
    // InternalAngularDsl.g:1709:1: rule__Service__Group_1__4__Impl : ( RULE_PUNTO_Y_COMA ) ;
    public final void rule__Service__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1713:1: ( ( RULE_PUNTO_Y_COMA ) )
            // InternalAngularDsl.g:1714:1: ( RULE_PUNTO_Y_COMA )
            {
            // InternalAngularDsl.g:1714:1: ( RULE_PUNTO_Y_COMA )
            // InternalAngularDsl.g:1715:2: RULE_PUNTO_Y_COMA
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
    // InternalAngularDsl.g:1725:1: rule__Service__Group_14__0 : rule__Service__Group_14__0__Impl rule__Service__Group_14__1 ;
    public final void rule__Service__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1729:1: ( rule__Service__Group_14__0__Impl rule__Service__Group_14__1 )
            // InternalAngularDsl.g:1730:2: rule__Service__Group_14__0__Impl rule__Service__Group_14__1
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
    // InternalAngularDsl.g:1737:1: rule__Service__Group_14__0__Impl : ( ( rule__Service__ParametrosAssignment_14_0 ) ) ;
    public final void rule__Service__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1741:1: ( ( ( rule__Service__ParametrosAssignment_14_0 ) ) )
            // InternalAngularDsl.g:1742:1: ( ( rule__Service__ParametrosAssignment_14_0 ) )
            {
            // InternalAngularDsl.g:1742:1: ( ( rule__Service__ParametrosAssignment_14_0 ) )
            // InternalAngularDsl.g:1743:2: ( rule__Service__ParametrosAssignment_14_0 )
            {
             before(grammarAccess.getServiceAccess().getParametrosAssignment_14_0()); 
            // InternalAngularDsl.g:1744:2: ( rule__Service__ParametrosAssignment_14_0 )
            // InternalAngularDsl.g:1744:3: rule__Service__ParametrosAssignment_14_0
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
    // InternalAngularDsl.g:1752:1: rule__Service__Group_14__1 : rule__Service__Group_14__1__Impl ;
    public final void rule__Service__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1756:1: ( rule__Service__Group_14__1__Impl )
            // InternalAngularDsl.g:1757:2: rule__Service__Group_14__1__Impl
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
    // InternalAngularDsl.g:1763:1: rule__Service__Group_14__1__Impl : ( ( rule__Service__Group_14_1__0 )* ) ;
    public final void rule__Service__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1767:1: ( ( ( rule__Service__Group_14_1__0 )* ) )
            // InternalAngularDsl.g:1768:1: ( ( rule__Service__Group_14_1__0 )* )
            {
            // InternalAngularDsl.g:1768:1: ( ( rule__Service__Group_14_1__0 )* )
            // InternalAngularDsl.g:1769:2: ( rule__Service__Group_14_1__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_14_1()); 
            // InternalAngularDsl.g:1770:2: ( rule__Service__Group_14_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMA) ) {
                    int LA8_1 = input.LA(2);

                    if ( ((LA8_1>=RULE_STRING && LA8_1<=RULE_ID)) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalAngularDsl.g:1770:3: rule__Service__Group_14_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Service__Group_14_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalAngularDsl.g:1779:1: rule__Service__Group_14_1__0 : rule__Service__Group_14_1__0__Impl rule__Service__Group_14_1__1 ;
    public final void rule__Service__Group_14_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1783:1: ( rule__Service__Group_14_1__0__Impl rule__Service__Group_14_1__1 )
            // InternalAngularDsl.g:1784:2: rule__Service__Group_14_1__0__Impl rule__Service__Group_14_1__1
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
    // InternalAngularDsl.g:1791:1: rule__Service__Group_14_1__0__Impl : ( RULE_COMA ) ;
    public final void rule__Service__Group_14_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1795:1: ( ( RULE_COMA ) )
            // InternalAngularDsl.g:1796:1: ( RULE_COMA )
            {
            // InternalAngularDsl.g:1796:1: ( RULE_COMA )
            // InternalAngularDsl.g:1797:2: RULE_COMA
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
    // InternalAngularDsl.g:1806:1: rule__Service__Group_14_1__1 : rule__Service__Group_14_1__1__Impl ;
    public final void rule__Service__Group_14_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1810:1: ( rule__Service__Group_14_1__1__Impl )
            // InternalAngularDsl.g:1811:2: rule__Service__Group_14_1__1__Impl
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
    // InternalAngularDsl.g:1817:1: rule__Service__Group_14_1__1__Impl : ( ( rule__Service__ParametrosAssignment_14_1_1 ) ) ;
    public final void rule__Service__Group_14_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1821:1: ( ( ( rule__Service__ParametrosAssignment_14_1_1 ) ) )
            // InternalAngularDsl.g:1822:1: ( ( rule__Service__ParametrosAssignment_14_1_1 ) )
            {
            // InternalAngularDsl.g:1822:1: ( ( rule__Service__ParametrosAssignment_14_1_1 ) )
            // InternalAngularDsl.g:1823:2: ( rule__Service__ParametrosAssignment_14_1_1 )
            {
             before(grammarAccess.getServiceAccess().getParametrosAssignment_14_1_1()); 
            // InternalAngularDsl.g:1824:2: ( rule__Service__ParametrosAssignment_14_1_1 )
            // InternalAngularDsl.g:1824:3: rule__Service__ParametrosAssignment_14_1_1
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
    // InternalAngularDsl.g:1833:1: rule__Componente__Group__0 : rule__Componente__Group__0__Impl rule__Componente__Group__1 ;
    public final void rule__Componente__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1837:1: ( rule__Componente__Group__0__Impl rule__Componente__Group__1 )
            // InternalAngularDsl.g:1838:2: rule__Componente__Group__0__Impl rule__Componente__Group__1
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
    // InternalAngularDsl.g:1845:1: rule__Componente__Group__0__Impl : ( () ) ;
    public final void rule__Componente__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1849:1: ( ( () ) )
            // InternalAngularDsl.g:1850:1: ( () )
            {
            // InternalAngularDsl.g:1850:1: ( () )
            // InternalAngularDsl.g:1851:2: ()
            {
             before(grammarAccess.getComponenteAccess().getComponenteAction_0()); 
            // InternalAngularDsl.g:1852:2: ()
            // InternalAngularDsl.g:1852:3: 
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
    // InternalAngularDsl.g:1860:1: rule__Componente__Group__1 : rule__Componente__Group__1__Impl rule__Componente__Group__2 ;
    public final void rule__Componente__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1864:1: ( rule__Componente__Group__1__Impl rule__Componente__Group__2 )
            // InternalAngularDsl.g:1865:2: rule__Componente__Group__1__Impl rule__Componente__Group__2
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
    // InternalAngularDsl.g:1872:1: rule__Componente__Group__1__Impl : ( ( rule__Componente__Group_1__0 )? ) ;
    public final void rule__Componente__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1876:1: ( ( ( rule__Componente__Group_1__0 )? ) )
            // InternalAngularDsl.g:1877:1: ( ( rule__Componente__Group_1__0 )? )
            {
            // InternalAngularDsl.g:1877:1: ( ( rule__Componente__Group_1__0 )? )
            // InternalAngularDsl.g:1878:2: ( rule__Componente__Group_1__0 )?
            {
             before(grammarAccess.getComponenteAccess().getGroup_1()); 
            // InternalAngularDsl.g:1879:2: ( rule__Componente__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_COMILLAS) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAngularDsl.g:1879:3: rule__Componente__Group_1__0
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
    // InternalAngularDsl.g:1887:1: rule__Componente__Group__2 : rule__Componente__Group__2__Impl rule__Componente__Group__3 ;
    public final void rule__Componente__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1891:1: ( rule__Componente__Group__2__Impl rule__Componente__Group__3 )
            // InternalAngularDsl.g:1892:2: rule__Componente__Group__2__Impl rule__Componente__Group__3
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
    // InternalAngularDsl.g:1899:1: rule__Componente__Group__2__Impl : ( RULE_ANGULAR ) ;
    public final void rule__Componente__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1903:1: ( ( RULE_ANGULAR ) )
            // InternalAngularDsl.g:1904:1: ( RULE_ANGULAR )
            {
            // InternalAngularDsl.g:1904:1: ( RULE_ANGULAR )
            // InternalAngularDsl.g:1905:2: RULE_ANGULAR
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
    // InternalAngularDsl.g:1914:1: rule__Componente__Group__3 : rule__Componente__Group__3__Impl rule__Componente__Group__4 ;
    public final void rule__Componente__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1918:1: ( rule__Componente__Group__3__Impl rule__Componente__Group__4 )
            // InternalAngularDsl.g:1919:2: rule__Componente__Group__3__Impl rule__Componente__Group__4
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
    // InternalAngularDsl.g:1926:1: rule__Componente__Group__3__Impl : ( RULE_PUNTO ) ;
    public final void rule__Componente__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1930:1: ( ( RULE_PUNTO ) )
            // InternalAngularDsl.g:1931:1: ( RULE_PUNTO )
            {
            // InternalAngularDsl.g:1931:1: ( RULE_PUNTO )
            // InternalAngularDsl.g:1932:2: RULE_PUNTO
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
    // InternalAngularDsl.g:1941:1: rule__Componente__Group__4 : rule__Componente__Group__4__Impl rule__Componente__Group__5 ;
    public final void rule__Componente__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1945:1: ( rule__Componente__Group__4__Impl rule__Componente__Group__5 )
            // InternalAngularDsl.g:1946:2: rule__Componente__Group__4__Impl rule__Componente__Group__5
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
    // InternalAngularDsl.g:1953:1: rule__Componente__Group__4__Impl : ( RULE_MODULE ) ;
    public final void rule__Componente__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1957:1: ( ( RULE_MODULE ) )
            // InternalAngularDsl.g:1958:1: ( RULE_MODULE )
            {
            // InternalAngularDsl.g:1958:1: ( RULE_MODULE )
            // InternalAngularDsl.g:1959:2: RULE_MODULE
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
    // InternalAngularDsl.g:1968:1: rule__Componente__Group__5 : rule__Componente__Group__5__Impl rule__Componente__Group__6 ;
    public final void rule__Componente__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1972:1: ( rule__Componente__Group__5__Impl rule__Componente__Group__6 )
            // InternalAngularDsl.g:1973:2: rule__Componente__Group__5__Impl rule__Componente__Group__6
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
    // InternalAngularDsl.g:1980:1: rule__Componente__Group__5__Impl : ( RULE_PARENTESIS_IZQUIERDO ) ;
    public final void rule__Componente__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1984:1: ( ( RULE_PARENTESIS_IZQUIERDO ) )
            // InternalAngularDsl.g:1985:1: ( RULE_PARENTESIS_IZQUIERDO )
            {
            // InternalAngularDsl.g:1985:1: ( RULE_PARENTESIS_IZQUIERDO )
            // InternalAngularDsl.g:1986:2: RULE_PARENTESIS_IZQUIERDO
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
    // InternalAngularDsl.g:1995:1: rule__Componente__Group__6 : rule__Componente__Group__6__Impl rule__Componente__Group__7 ;
    public final void rule__Componente__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:1999:1: ( rule__Componente__Group__6__Impl rule__Componente__Group__7 )
            // InternalAngularDsl.g:2000:2: rule__Componente__Group__6__Impl rule__Componente__Group__7
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
    // InternalAngularDsl.g:2007:1: rule__Componente__Group__6__Impl : ( ( rule__Componente__ModuloAssignment_6 ) ) ;
    public final void rule__Componente__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2011:1: ( ( ( rule__Componente__ModuloAssignment_6 ) ) )
            // InternalAngularDsl.g:2012:1: ( ( rule__Componente__ModuloAssignment_6 ) )
            {
            // InternalAngularDsl.g:2012:1: ( ( rule__Componente__ModuloAssignment_6 ) )
            // InternalAngularDsl.g:2013:2: ( rule__Componente__ModuloAssignment_6 )
            {
             before(grammarAccess.getComponenteAccess().getModuloAssignment_6()); 
            // InternalAngularDsl.g:2014:2: ( rule__Componente__ModuloAssignment_6 )
            // InternalAngularDsl.g:2014:3: rule__Componente__ModuloAssignment_6
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
    // InternalAngularDsl.g:2022:1: rule__Componente__Group__7 : rule__Componente__Group__7__Impl rule__Componente__Group__8 ;
    public final void rule__Componente__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2026:1: ( rule__Componente__Group__7__Impl rule__Componente__Group__8 )
            // InternalAngularDsl.g:2027:2: rule__Componente__Group__7__Impl rule__Componente__Group__8
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
    // InternalAngularDsl.g:2034:1: rule__Componente__Group__7__Impl : ( RULE_PARENTESIS_DERECHO ) ;
    public final void rule__Componente__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2038:1: ( ( RULE_PARENTESIS_DERECHO ) )
            // InternalAngularDsl.g:2039:1: ( RULE_PARENTESIS_DERECHO )
            {
            // InternalAngularDsl.g:2039:1: ( RULE_PARENTESIS_DERECHO )
            // InternalAngularDsl.g:2040:2: RULE_PARENTESIS_DERECHO
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
    // InternalAngularDsl.g:2049:1: rule__Componente__Group__8 : rule__Componente__Group__8__Impl rule__Componente__Group__9 ;
    public final void rule__Componente__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2053:1: ( rule__Componente__Group__8__Impl rule__Componente__Group__9 )
            // InternalAngularDsl.g:2054:2: rule__Componente__Group__8__Impl rule__Componente__Group__9
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
    // InternalAngularDsl.g:2061:1: rule__Componente__Group__8__Impl : ( RULE_PUNTO ) ;
    public final void rule__Componente__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2065:1: ( ( RULE_PUNTO ) )
            // InternalAngularDsl.g:2066:1: ( RULE_PUNTO )
            {
            // InternalAngularDsl.g:2066:1: ( RULE_PUNTO )
            // InternalAngularDsl.g:2067:2: RULE_PUNTO
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
    // InternalAngularDsl.g:2076:1: rule__Componente__Group__9 : rule__Componente__Group__9__Impl rule__Componente__Group__10 ;
    public final void rule__Componente__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2080:1: ( rule__Componente__Group__9__Impl rule__Componente__Group__10 )
            // InternalAngularDsl.g:2081:2: rule__Componente__Group__9__Impl rule__Componente__Group__10
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
    // InternalAngularDsl.g:2088:1: rule__Componente__Group__9__Impl : ( RULE_COMPONENT ) ;
    public final void rule__Componente__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2092:1: ( ( RULE_COMPONENT ) )
            // InternalAngularDsl.g:2093:1: ( RULE_COMPONENT )
            {
            // InternalAngularDsl.g:2093:1: ( RULE_COMPONENT )
            // InternalAngularDsl.g:2094:2: RULE_COMPONENT
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
    // InternalAngularDsl.g:2103:1: rule__Componente__Group__10 : rule__Componente__Group__10__Impl rule__Componente__Group__11 ;
    public final void rule__Componente__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2107:1: ( rule__Componente__Group__10__Impl rule__Componente__Group__11 )
            // InternalAngularDsl.g:2108:2: rule__Componente__Group__10__Impl rule__Componente__Group__11
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
    // InternalAngularDsl.g:2115:1: rule__Componente__Group__10__Impl : ( RULE_PARENTESIS_IZQUIERDO ) ;
    public final void rule__Componente__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2119:1: ( ( RULE_PARENTESIS_IZQUIERDO ) )
            // InternalAngularDsl.g:2120:1: ( RULE_PARENTESIS_IZQUIERDO )
            {
            // InternalAngularDsl.g:2120:1: ( RULE_PARENTESIS_IZQUIERDO )
            // InternalAngularDsl.g:2121:2: RULE_PARENTESIS_IZQUIERDO
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
    // InternalAngularDsl.g:2130:1: rule__Componente__Group__11 : rule__Componente__Group__11__Impl rule__Componente__Group__12 ;
    public final void rule__Componente__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2134:1: ( rule__Componente__Group__11__Impl rule__Componente__Group__12 )
            // InternalAngularDsl.g:2135:2: rule__Componente__Group__11__Impl rule__Componente__Group__12
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
    // InternalAngularDsl.g:2142:1: rule__Componente__Group__11__Impl : ( ( rule__Componente__NameAssignment_11 ) ) ;
    public final void rule__Componente__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2146:1: ( ( ( rule__Componente__NameAssignment_11 ) ) )
            // InternalAngularDsl.g:2147:1: ( ( rule__Componente__NameAssignment_11 ) )
            {
            // InternalAngularDsl.g:2147:1: ( ( rule__Componente__NameAssignment_11 ) )
            // InternalAngularDsl.g:2148:2: ( rule__Componente__NameAssignment_11 )
            {
             before(grammarAccess.getComponenteAccess().getNameAssignment_11()); 
            // InternalAngularDsl.g:2149:2: ( rule__Componente__NameAssignment_11 )
            // InternalAngularDsl.g:2149:3: rule__Componente__NameAssignment_11
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
    // InternalAngularDsl.g:2157:1: rule__Componente__Group__12 : rule__Componente__Group__12__Impl rule__Componente__Group__13 ;
    public final void rule__Componente__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2161:1: ( rule__Componente__Group__12__Impl rule__Componente__Group__13 )
            // InternalAngularDsl.g:2162:2: rule__Componente__Group__12__Impl rule__Componente__Group__13
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
    // InternalAngularDsl.g:2169:1: rule__Componente__Group__12__Impl : ( RULE_COMA ) ;
    public final void rule__Componente__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2173:1: ( ( RULE_COMA ) )
            // InternalAngularDsl.g:2174:1: ( RULE_COMA )
            {
            // InternalAngularDsl.g:2174:1: ( RULE_COMA )
            // InternalAngularDsl.g:2175:2: RULE_COMA
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
    // InternalAngularDsl.g:2184:1: rule__Componente__Group__13 : rule__Componente__Group__13__Impl rule__Componente__Group__14 ;
    public final void rule__Componente__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2188:1: ( rule__Componente__Group__13__Impl rule__Componente__Group__14 )
            // InternalAngularDsl.g:2189:2: rule__Componente__Group__13__Impl rule__Componente__Group__14
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
    // InternalAngularDsl.g:2196:1: rule__Componente__Group__13__Impl : ( RULE_LLAVE_IZQUIERDA ) ;
    public final void rule__Componente__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2200:1: ( ( RULE_LLAVE_IZQUIERDA ) )
            // InternalAngularDsl.g:2201:1: ( RULE_LLAVE_IZQUIERDA )
            {
            // InternalAngularDsl.g:2201:1: ( RULE_LLAVE_IZQUIERDA )
            // InternalAngularDsl.g:2202:2: RULE_LLAVE_IZQUIERDA
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
    // InternalAngularDsl.g:2211:1: rule__Componente__Group__14 : rule__Componente__Group__14__Impl rule__Componente__Group__15 ;
    public final void rule__Componente__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2215:1: ( rule__Componente__Group__14__Impl rule__Componente__Group__15 )
            // InternalAngularDsl.g:2216:2: rule__Componente__Group__14__Impl rule__Componente__Group__15
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
    // InternalAngularDsl.g:2223:1: rule__Componente__Group__14__Impl : ( RULE_TEMPLATE_URL ) ;
    public final void rule__Componente__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2227:1: ( ( RULE_TEMPLATE_URL ) )
            // InternalAngularDsl.g:2228:1: ( RULE_TEMPLATE_URL )
            {
            // InternalAngularDsl.g:2228:1: ( RULE_TEMPLATE_URL )
            // InternalAngularDsl.g:2229:2: RULE_TEMPLATE_URL
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
    // InternalAngularDsl.g:2238:1: rule__Componente__Group__15 : rule__Componente__Group__15__Impl rule__Componente__Group__16 ;
    public final void rule__Componente__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2242:1: ( rule__Componente__Group__15__Impl rule__Componente__Group__16 )
            // InternalAngularDsl.g:2243:2: rule__Componente__Group__15__Impl rule__Componente__Group__16
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
    // InternalAngularDsl.g:2250:1: rule__Componente__Group__15__Impl : ( RULE_DOS_PUNTOS ) ;
    public final void rule__Componente__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2254:1: ( ( RULE_DOS_PUNTOS ) )
            // InternalAngularDsl.g:2255:1: ( RULE_DOS_PUNTOS )
            {
            // InternalAngularDsl.g:2255:1: ( RULE_DOS_PUNTOS )
            // InternalAngularDsl.g:2256:2: RULE_DOS_PUNTOS
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
    // InternalAngularDsl.g:2265:1: rule__Componente__Group__16 : rule__Componente__Group__16__Impl rule__Componente__Group__17 ;
    public final void rule__Componente__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2269:1: ( rule__Componente__Group__16__Impl rule__Componente__Group__17 )
            // InternalAngularDsl.g:2270:2: rule__Componente__Group__16__Impl rule__Componente__Group__17
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
    // InternalAngularDsl.g:2277:1: rule__Componente__Group__16__Impl : ( ( rule__Componente__TemplateAssignment_16 ) ) ;
    public final void rule__Componente__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2281:1: ( ( ( rule__Componente__TemplateAssignment_16 ) ) )
            // InternalAngularDsl.g:2282:1: ( ( rule__Componente__TemplateAssignment_16 ) )
            {
            // InternalAngularDsl.g:2282:1: ( ( rule__Componente__TemplateAssignment_16 ) )
            // InternalAngularDsl.g:2283:2: ( rule__Componente__TemplateAssignment_16 )
            {
             before(grammarAccess.getComponenteAccess().getTemplateAssignment_16()); 
            // InternalAngularDsl.g:2284:2: ( rule__Componente__TemplateAssignment_16 )
            // InternalAngularDsl.g:2284:3: rule__Componente__TemplateAssignment_16
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
    // InternalAngularDsl.g:2292:1: rule__Componente__Group__17 : rule__Componente__Group__17__Impl rule__Componente__Group__18 ;
    public final void rule__Componente__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2296:1: ( rule__Componente__Group__17__Impl rule__Componente__Group__18 )
            // InternalAngularDsl.g:2297:2: rule__Componente__Group__17__Impl rule__Componente__Group__18
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
    // InternalAngularDsl.g:2304:1: rule__Componente__Group__17__Impl : ( RULE_COMA ) ;
    public final void rule__Componente__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2308:1: ( ( RULE_COMA ) )
            // InternalAngularDsl.g:2309:1: ( RULE_COMA )
            {
            // InternalAngularDsl.g:2309:1: ( RULE_COMA )
            // InternalAngularDsl.g:2310:2: RULE_COMA
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
    // InternalAngularDsl.g:2319:1: rule__Componente__Group__18 : rule__Componente__Group__18__Impl rule__Componente__Group__19 ;
    public final void rule__Componente__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2323:1: ( rule__Componente__Group__18__Impl rule__Componente__Group__19 )
            // InternalAngularDsl.g:2324:2: rule__Componente__Group__18__Impl rule__Componente__Group__19
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
    // InternalAngularDsl.g:2331:1: rule__Componente__Group__18__Impl : ( RULE_CONTROLLER ) ;
    public final void rule__Componente__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2335:1: ( ( RULE_CONTROLLER ) )
            // InternalAngularDsl.g:2336:1: ( RULE_CONTROLLER )
            {
            // InternalAngularDsl.g:2336:1: ( RULE_CONTROLLER )
            // InternalAngularDsl.g:2337:2: RULE_CONTROLLER
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
    // InternalAngularDsl.g:2346:1: rule__Componente__Group__19 : rule__Componente__Group__19__Impl rule__Componente__Group__20 ;
    public final void rule__Componente__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2350:1: ( rule__Componente__Group__19__Impl rule__Componente__Group__20 )
            // InternalAngularDsl.g:2351:2: rule__Componente__Group__19__Impl rule__Componente__Group__20
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
    // InternalAngularDsl.g:2358:1: rule__Componente__Group__19__Impl : ( RULE_DOS_PUNTOS ) ;
    public final void rule__Componente__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2362:1: ( ( RULE_DOS_PUNTOS ) )
            // InternalAngularDsl.g:2363:1: ( RULE_DOS_PUNTOS )
            {
            // InternalAngularDsl.g:2363:1: ( RULE_DOS_PUNTOS )
            // InternalAngularDsl.g:2364:2: RULE_DOS_PUNTOS
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
    // InternalAngularDsl.g:2373:1: rule__Componente__Group__20 : rule__Componente__Group__20__Impl rule__Componente__Group__21 ;
    public final void rule__Componente__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2377:1: ( rule__Componente__Group__20__Impl rule__Componente__Group__21 )
            // InternalAngularDsl.g:2378:2: rule__Componente__Group__20__Impl rule__Componente__Group__21
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
    // InternalAngularDsl.g:2385:1: rule__Componente__Group__20__Impl : ( RULE_PARENTESIS_CUADRADO_IZQUIERDO ) ;
    public final void rule__Componente__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2389:1: ( ( RULE_PARENTESIS_CUADRADO_IZQUIERDO ) )
            // InternalAngularDsl.g:2390:1: ( RULE_PARENTESIS_CUADRADO_IZQUIERDO )
            {
            // InternalAngularDsl.g:2390:1: ( RULE_PARENTESIS_CUADRADO_IZQUIERDO )
            // InternalAngularDsl.g:2391:2: RULE_PARENTESIS_CUADRADO_IZQUIERDO
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
    // InternalAngularDsl.g:2400:1: rule__Componente__Group__21 : rule__Componente__Group__21__Impl rule__Componente__Group__22 ;
    public final void rule__Componente__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2404:1: ( rule__Componente__Group__21__Impl rule__Componente__Group__22 )
            // InternalAngularDsl.g:2405:2: rule__Componente__Group__21__Impl rule__Componente__Group__22
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
    // InternalAngularDsl.g:2412:1: rule__Componente__Group__21__Impl : ( ( rule__Componente__Group_21__0 )* ) ;
    public final void rule__Componente__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2416:1: ( ( ( rule__Componente__Group_21__0 )* ) )
            // InternalAngularDsl.g:2417:1: ( ( rule__Componente__Group_21__0 )* )
            {
            // InternalAngularDsl.g:2417:1: ( ( rule__Componente__Group_21__0 )* )
            // InternalAngularDsl.g:2418:2: ( rule__Componente__Group_21__0 )*
            {
             before(grammarAccess.getComponenteAccess().getGroup_21()); 
            // InternalAngularDsl.g:2419:2: ( rule__Componente__Group_21__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAngularDsl.g:2419:3: rule__Componente__Group_21__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Componente__Group_21__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalAngularDsl.g:2427:1: rule__Componente__Group__22 : rule__Componente__Group__22__Impl rule__Componente__Group__23 ;
    public final void rule__Componente__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2431:1: ( rule__Componente__Group__22__Impl rule__Componente__Group__23 )
            // InternalAngularDsl.g:2432:2: rule__Componente__Group__22__Impl rule__Componente__Group__23
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
    // InternalAngularDsl.g:2439:1: rule__Componente__Group__22__Impl : ( RULE_COMA ) ;
    public final void rule__Componente__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2443:1: ( ( RULE_COMA ) )
            // InternalAngularDsl.g:2444:1: ( RULE_COMA )
            {
            // InternalAngularDsl.g:2444:1: ( RULE_COMA )
            // InternalAngularDsl.g:2445:2: RULE_COMA
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
    // InternalAngularDsl.g:2454:1: rule__Componente__Group__23 : rule__Componente__Group__23__Impl rule__Componente__Group__24 ;
    public final void rule__Componente__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2458:1: ( rule__Componente__Group__23__Impl rule__Componente__Group__24 )
            // InternalAngularDsl.g:2459:2: rule__Componente__Group__23__Impl rule__Componente__Group__24
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
    // InternalAngularDsl.g:2466:1: rule__Componente__Group__23__Impl : ( ( rule__Componente__FuncionAssignment_23 ) ) ;
    public final void rule__Componente__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2470:1: ( ( ( rule__Componente__FuncionAssignment_23 ) ) )
            // InternalAngularDsl.g:2471:1: ( ( rule__Componente__FuncionAssignment_23 ) )
            {
            // InternalAngularDsl.g:2471:1: ( ( rule__Componente__FuncionAssignment_23 ) )
            // InternalAngularDsl.g:2472:2: ( rule__Componente__FuncionAssignment_23 )
            {
             before(grammarAccess.getComponenteAccess().getFuncionAssignment_23()); 
            // InternalAngularDsl.g:2473:2: ( rule__Componente__FuncionAssignment_23 )
            // InternalAngularDsl.g:2473:3: rule__Componente__FuncionAssignment_23
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
    // InternalAngularDsl.g:2481:1: rule__Componente__Group__24 : rule__Componente__Group__24__Impl rule__Componente__Group__25 ;
    public final void rule__Componente__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2485:1: ( rule__Componente__Group__24__Impl rule__Componente__Group__25 )
            // InternalAngularDsl.g:2486:2: rule__Componente__Group__24__Impl rule__Componente__Group__25
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
    // InternalAngularDsl.g:2493:1: rule__Componente__Group__24__Impl : ( RULE_PARENTESIS_CUADRADO_DERECHO ) ;
    public final void rule__Componente__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2497:1: ( ( RULE_PARENTESIS_CUADRADO_DERECHO ) )
            // InternalAngularDsl.g:2498:1: ( RULE_PARENTESIS_CUADRADO_DERECHO )
            {
            // InternalAngularDsl.g:2498:1: ( RULE_PARENTESIS_CUADRADO_DERECHO )
            // InternalAngularDsl.g:2499:2: RULE_PARENTESIS_CUADRADO_DERECHO
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
    // InternalAngularDsl.g:2508:1: rule__Componente__Group__25 : rule__Componente__Group__25__Impl rule__Componente__Group__26 ;
    public final void rule__Componente__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2512:1: ( rule__Componente__Group__25__Impl rule__Componente__Group__26 )
            // InternalAngularDsl.g:2513:2: rule__Componente__Group__25__Impl rule__Componente__Group__26
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
    // InternalAngularDsl.g:2520:1: rule__Componente__Group__25__Impl : ( RULE_LLAVE_DERECHA ) ;
    public final void rule__Componente__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2524:1: ( ( RULE_LLAVE_DERECHA ) )
            // InternalAngularDsl.g:2525:1: ( RULE_LLAVE_DERECHA )
            {
            // InternalAngularDsl.g:2525:1: ( RULE_LLAVE_DERECHA )
            // InternalAngularDsl.g:2526:2: RULE_LLAVE_DERECHA
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
    // InternalAngularDsl.g:2535:1: rule__Componente__Group__26 : rule__Componente__Group__26__Impl rule__Componente__Group__27 ;
    public final void rule__Componente__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2539:1: ( rule__Componente__Group__26__Impl rule__Componente__Group__27 )
            // InternalAngularDsl.g:2540:2: rule__Componente__Group__26__Impl rule__Componente__Group__27
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
    // InternalAngularDsl.g:2547:1: rule__Componente__Group__26__Impl : ( RULE_PARENTESIS_DERECHO ) ;
    public final void rule__Componente__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2551:1: ( ( RULE_PARENTESIS_DERECHO ) )
            // InternalAngularDsl.g:2552:1: ( RULE_PARENTESIS_DERECHO )
            {
            // InternalAngularDsl.g:2552:1: ( RULE_PARENTESIS_DERECHO )
            // InternalAngularDsl.g:2553:2: RULE_PARENTESIS_DERECHO
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
    // InternalAngularDsl.g:2562:1: rule__Componente__Group__27 : rule__Componente__Group__27__Impl ;
    public final void rule__Componente__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2566:1: ( rule__Componente__Group__27__Impl )
            // InternalAngularDsl.g:2567:2: rule__Componente__Group__27__Impl
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
    // InternalAngularDsl.g:2573:1: rule__Componente__Group__27__Impl : ( RULE_PUNTO_Y_COMA ) ;
    public final void rule__Componente__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2577:1: ( ( RULE_PUNTO_Y_COMA ) )
            // InternalAngularDsl.g:2578:1: ( RULE_PUNTO_Y_COMA )
            {
            // InternalAngularDsl.g:2578:1: ( RULE_PUNTO_Y_COMA )
            // InternalAngularDsl.g:2579:2: RULE_PUNTO_Y_COMA
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
    // InternalAngularDsl.g:2589:1: rule__Componente__Group_1__0 : rule__Componente__Group_1__0__Impl rule__Componente__Group_1__1 ;
    public final void rule__Componente__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2593:1: ( rule__Componente__Group_1__0__Impl rule__Componente__Group_1__1 )
            // InternalAngularDsl.g:2594:2: rule__Componente__Group_1__0__Impl rule__Componente__Group_1__1
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
    // InternalAngularDsl.g:2601:1: rule__Componente__Group_1__0__Impl : ( RULE_COMILLAS ) ;
    public final void rule__Componente__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2605:1: ( ( RULE_COMILLAS ) )
            // InternalAngularDsl.g:2606:1: ( RULE_COMILLAS )
            {
            // InternalAngularDsl.g:2606:1: ( RULE_COMILLAS )
            // InternalAngularDsl.g:2607:2: RULE_COMILLAS
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
    // InternalAngularDsl.g:2616:1: rule__Componente__Group_1__1 : rule__Componente__Group_1__1__Impl rule__Componente__Group_1__2 ;
    public final void rule__Componente__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2620:1: ( rule__Componente__Group_1__1__Impl rule__Componente__Group_1__2 )
            // InternalAngularDsl.g:2621:2: rule__Componente__Group_1__1__Impl rule__Componente__Group_1__2
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
    // InternalAngularDsl.g:2628:1: rule__Componente__Group_1__1__Impl : ( RULE_USE ) ;
    public final void rule__Componente__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2632:1: ( ( RULE_USE ) )
            // InternalAngularDsl.g:2633:1: ( RULE_USE )
            {
            // InternalAngularDsl.g:2633:1: ( RULE_USE )
            // InternalAngularDsl.g:2634:2: RULE_USE
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
    // InternalAngularDsl.g:2643:1: rule__Componente__Group_1__2 : rule__Componente__Group_1__2__Impl rule__Componente__Group_1__3 ;
    public final void rule__Componente__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2647:1: ( rule__Componente__Group_1__2__Impl rule__Componente__Group_1__3 )
            // InternalAngularDsl.g:2648:2: rule__Componente__Group_1__2__Impl rule__Componente__Group_1__3
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
    // InternalAngularDsl.g:2655:1: rule__Componente__Group_1__2__Impl : ( RULE_STRICT ) ;
    public final void rule__Componente__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2659:1: ( ( RULE_STRICT ) )
            // InternalAngularDsl.g:2660:1: ( RULE_STRICT )
            {
            // InternalAngularDsl.g:2660:1: ( RULE_STRICT )
            // InternalAngularDsl.g:2661:2: RULE_STRICT
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
    // InternalAngularDsl.g:2670:1: rule__Componente__Group_1__3 : rule__Componente__Group_1__3__Impl rule__Componente__Group_1__4 ;
    public final void rule__Componente__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2674:1: ( rule__Componente__Group_1__3__Impl rule__Componente__Group_1__4 )
            // InternalAngularDsl.g:2675:2: rule__Componente__Group_1__3__Impl rule__Componente__Group_1__4
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
    // InternalAngularDsl.g:2682:1: rule__Componente__Group_1__3__Impl : ( RULE_COMILLAS ) ;
    public final void rule__Componente__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2686:1: ( ( RULE_COMILLAS ) )
            // InternalAngularDsl.g:2687:1: ( RULE_COMILLAS )
            {
            // InternalAngularDsl.g:2687:1: ( RULE_COMILLAS )
            // InternalAngularDsl.g:2688:2: RULE_COMILLAS
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
    // InternalAngularDsl.g:2697:1: rule__Componente__Group_1__4 : rule__Componente__Group_1__4__Impl ;
    public final void rule__Componente__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2701:1: ( rule__Componente__Group_1__4__Impl )
            // InternalAngularDsl.g:2702:2: rule__Componente__Group_1__4__Impl
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
    // InternalAngularDsl.g:2708:1: rule__Componente__Group_1__4__Impl : ( RULE_PUNTO_Y_COMA ) ;
    public final void rule__Componente__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2712:1: ( ( RULE_PUNTO_Y_COMA ) )
            // InternalAngularDsl.g:2713:1: ( RULE_PUNTO_Y_COMA )
            {
            // InternalAngularDsl.g:2713:1: ( RULE_PUNTO_Y_COMA )
            // InternalAngularDsl.g:2714:2: RULE_PUNTO_Y_COMA
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
    // InternalAngularDsl.g:2724:1: rule__Componente__Group_21__0 : rule__Componente__Group_21__0__Impl rule__Componente__Group_21__1 ;
    public final void rule__Componente__Group_21__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2728:1: ( rule__Componente__Group_21__0__Impl rule__Componente__Group_21__1 )
            // InternalAngularDsl.g:2729:2: rule__Componente__Group_21__0__Impl rule__Componente__Group_21__1
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
    // InternalAngularDsl.g:2736:1: rule__Componente__Group_21__0__Impl : ( ( rule__Componente__ParametrosAssignment_21_0 ) ) ;
    public final void rule__Componente__Group_21__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2740:1: ( ( ( rule__Componente__ParametrosAssignment_21_0 ) ) )
            // InternalAngularDsl.g:2741:1: ( ( rule__Componente__ParametrosAssignment_21_0 ) )
            {
            // InternalAngularDsl.g:2741:1: ( ( rule__Componente__ParametrosAssignment_21_0 ) )
            // InternalAngularDsl.g:2742:2: ( rule__Componente__ParametrosAssignment_21_0 )
            {
             before(grammarAccess.getComponenteAccess().getParametrosAssignment_21_0()); 
            // InternalAngularDsl.g:2743:2: ( rule__Componente__ParametrosAssignment_21_0 )
            // InternalAngularDsl.g:2743:3: rule__Componente__ParametrosAssignment_21_0
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
    // InternalAngularDsl.g:2751:1: rule__Componente__Group_21__1 : rule__Componente__Group_21__1__Impl ;
    public final void rule__Componente__Group_21__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2755:1: ( rule__Componente__Group_21__1__Impl )
            // InternalAngularDsl.g:2756:2: rule__Componente__Group_21__1__Impl
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
    // InternalAngularDsl.g:2762:1: rule__Componente__Group_21__1__Impl : ( ( rule__Componente__Group_21_1__0 )* ) ;
    public final void rule__Componente__Group_21__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2766:1: ( ( ( rule__Componente__Group_21_1__0 )* ) )
            // InternalAngularDsl.g:2767:1: ( ( rule__Componente__Group_21_1__0 )* )
            {
            // InternalAngularDsl.g:2767:1: ( ( rule__Componente__Group_21_1__0 )* )
            // InternalAngularDsl.g:2768:2: ( rule__Componente__Group_21_1__0 )*
            {
             before(grammarAccess.getComponenteAccess().getGroup_21_1()); 
            // InternalAngularDsl.g:2769:2: ( rule__Componente__Group_21_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_COMA) ) {
                    int LA11_1 = input.LA(2);

                    if ( ((LA11_1>=RULE_STRING && LA11_1<=RULE_ID)) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalAngularDsl.g:2769:3: rule__Componente__Group_21_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Componente__Group_21_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalAngularDsl.g:2778:1: rule__Componente__Group_21_1__0 : rule__Componente__Group_21_1__0__Impl rule__Componente__Group_21_1__1 ;
    public final void rule__Componente__Group_21_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2782:1: ( rule__Componente__Group_21_1__0__Impl rule__Componente__Group_21_1__1 )
            // InternalAngularDsl.g:2783:2: rule__Componente__Group_21_1__0__Impl rule__Componente__Group_21_1__1
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
    // InternalAngularDsl.g:2790:1: rule__Componente__Group_21_1__0__Impl : ( RULE_COMA ) ;
    public final void rule__Componente__Group_21_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2794:1: ( ( RULE_COMA ) )
            // InternalAngularDsl.g:2795:1: ( RULE_COMA )
            {
            // InternalAngularDsl.g:2795:1: ( RULE_COMA )
            // InternalAngularDsl.g:2796:2: RULE_COMA
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
    // InternalAngularDsl.g:2805:1: rule__Componente__Group_21_1__1 : rule__Componente__Group_21_1__1__Impl ;
    public final void rule__Componente__Group_21_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2809:1: ( rule__Componente__Group_21_1__1__Impl )
            // InternalAngularDsl.g:2810:2: rule__Componente__Group_21_1__1__Impl
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
    // InternalAngularDsl.g:2816:1: rule__Componente__Group_21_1__1__Impl : ( ( rule__Componente__ParametrosAssignment_21_1_1 ) ) ;
    public final void rule__Componente__Group_21_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2820:1: ( ( ( rule__Componente__ParametrosAssignment_21_1_1 ) ) )
            // InternalAngularDsl.g:2821:1: ( ( rule__Componente__ParametrosAssignment_21_1_1 ) )
            {
            // InternalAngularDsl.g:2821:1: ( ( rule__Componente__ParametrosAssignment_21_1_1 ) )
            // InternalAngularDsl.g:2822:2: ( rule__Componente__ParametrosAssignment_21_1_1 )
            {
             before(grammarAccess.getComponenteAccess().getParametrosAssignment_21_1_1()); 
            // InternalAngularDsl.g:2823:2: ( rule__Componente__ParametrosAssignment_21_1_1 )
            // InternalAngularDsl.g:2823:3: rule__Componente__ParametrosAssignment_21_1_1
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
    // InternalAngularDsl.g:2832:1: rule__Funcion__Group__0 : rule__Funcion__Group__0__Impl rule__Funcion__Group__1 ;
    public final void rule__Funcion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2836:1: ( rule__Funcion__Group__0__Impl rule__Funcion__Group__1 )
            // InternalAngularDsl.g:2837:2: rule__Funcion__Group__0__Impl rule__Funcion__Group__1
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
    // InternalAngularDsl.g:2844:1: rule__Funcion__Group__0__Impl : ( () ) ;
    public final void rule__Funcion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2848:1: ( ( () ) )
            // InternalAngularDsl.g:2849:1: ( () )
            {
            // InternalAngularDsl.g:2849:1: ( () )
            // InternalAngularDsl.g:2850:2: ()
            {
             before(grammarAccess.getFuncionAccess().getFuncionAction_0()); 
            // InternalAngularDsl.g:2851:2: ()
            // InternalAngularDsl.g:2851:3: 
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
    // InternalAngularDsl.g:2859:1: rule__Funcion__Group__1 : rule__Funcion__Group__1__Impl rule__Funcion__Group__2 ;
    public final void rule__Funcion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2863:1: ( rule__Funcion__Group__1__Impl rule__Funcion__Group__2 )
            // InternalAngularDsl.g:2864:2: rule__Funcion__Group__1__Impl rule__Funcion__Group__2
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
    // InternalAngularDsl.g:2871:1: rule__Funcion__Group__1__Impl : ( RULE_FUNCTION ) ;
    public final void rule__Funcion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2875:1: ( ( RULE_FUNCTION ) )
            // InternalAngularDsl.g:2876:1: ( RULE_FUNCTION )
            {
            // InternalAngularDsl.g:2876:1: ( RULE_FUNCTION )
            // InternalAngularDsl.g:2877:2: RULE_FUNCTION
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
    // InternalAngularDsl.g:2886:1: rule__Funcion__Group__2 : rule__Funcion__Group__2__Impl rule__Funcion__Group__3 ;
    public final void rule__Funcion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2890:1: ( rule__Funcion__Group__2__Impl rule__Funcion__Group__3 )
            // InternalAngularDsl.g:2891:2: rule__Funcion__Group__2__Impl rule__Funcion__Group__3
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
    // InternalAngularDsl.g:2898:1: rule__Funcion__Group__2__Impl : ( ( rule__Funcion__NameAssignment_2 ) ) ;
    public final void rule__Funcion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2902:1: ( ( ( rule__Funcion__NameAssignment_2 ) ) )
            // InternalAngularDsl.g:2903:1: ( ( rule__Funcion__NameAssignment_2 ) )
            {
            // InternalAngularDsl.g:2903:1: ( ( rule__Funcion__NameAssignment_2 ) )
            // InternalAngularDsl.g:2904:2: ( rule__Funcion__NameAssignment_2 )
            {
             before(grammarAccess.getFuncionAccess().getNameAssignment_2()); 
            // InternalAngularDsl.g:2905:2: ( rule__Funcion__NameAssignment_2 )
            // InternalAngularDsl.g:2905:3: rule__Funcion__NameAssignment_2
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
    // InternalAngularDsl.g:2913:1: rule__Funcion__Group__3 : rule__Funcion__Group__3__Impl rule__Funcion__Group__4 ;
    public final void rule__Funcion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2917:1: ( rule__Funcion__Group__3__Impl rule__Funcion__Group__4 )
            // InternalAngularDsl.g:2918:2: rule__Funcion__Group__3__Impl rule__Funcion__Group__4
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
    // InternalAngularDsl.g:2925:1: rule__Funcion__Group__3__Impl : ( RULE_PARENTESIS_IZQUIERDO ) ;
    public final void rule__Funcion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2929:1: ( ( RULE_PARENTESIS_IZQUIERDO ) )
            // InternalAngularDsl.g:2930:1: ( RULE_PARENTESIS_IZQUIERDO )
            {
            // InternalAngularDsl.g:2930:1: ( RULE_PARENTESIS_IZQUIERDO )
            // InternalAngularDsl.g:2931:2: RULE_PARENTESIS_IZQUIERDO
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
    // InternalAngularDsl.g:2940:1: rule__Funcion__Group__4 : rule__Funcion__Group__4__Impl rule__Funcion__Group__5 ;
    public final void rule__Funcion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2944:1: ( rule__Funcion__Group__4__Impl rule__Funcion__Group__5 )
            // InternalAngularDsl.g:2945:2: rule__Funcion__Group__4__Impl rule__Funcion__Group__5
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
    // InternalAngularDsl.g:2952:1: rule__Funcion__Group__4__Impl : ( ( rule__Funcion__ParametrosAssignment_4 ) ) ;
    public final void rule__Funcion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2956:1: ( ( ( rule__Funcion__ParametrosAssignment_4 ) ) )
            // InternalAngularDsl.g:2957:1: ( ( rule__Funcion__ParametrosAssignment_4 ) )
            {
            // InternalAngularDsl.g:2957:1: ( ( rule__Funcion__ParametrosAssignment_4 ) )
            // InternalAngularDsl.g:2958:2: ( rule__Funcion__ParametrosAssignment_4 )
            {
             before(grammarAccess.getFuncionAccess().getParametrosAssignment_4()); 
            // InternalAngularDsl.g:2959:2: ( rule__Funcion__ParametrosAssignment_4 )
            // InternalAngularDsl.g:2959:3: rule__Funcion__ParametrosAssignment_4
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
    // InternalAngularDsl.g:2967:1: rule__Funcion__Group__5 : rule__Funcion__Group__5__Impl rule__Funcion__Group__6 ;
    public final void rule__Funcion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2971:1: ( rule__Funcion__Group__5__Impl rule__Funcion__Group__6 )
            // InternalAngularDsl.g:2972:2: rule__Funcion__Group__5__Impl rule__Funcion__Group__6
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
    // InternalAngularDsl.g:2979:1: rule__Funcion__Group__5__Impl : ( RULE_PARENTESIS_DERECHO ) ;
    public final void rule__Funcion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2983:1: ( ( RULE_PARENTESIS_DERECHO ) )
            // InternalAngularDsl.g:2984:1: ( RULE_PARENTESIS_DERECHO )
            {
            // InternalAngularDsl.g:2984:1: ( RULE_PARENTESIS_DERECHO )
            // InternalAngularDsl.g:2985:2: RULE_PARENTESIS_DERECHO
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
    // InternalAngularDsl.g:2994:1: rule__Funcion__Group__6 : rule__Funcion__Group__6__Impl rule__Funcion__Group__7 ;
    public final void rule__Funcion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:2998:1: ( rule__Funcion__Group__6__Impl rule__Funcion__Group__7 )
            // InternalAngularDsl.g:2999:2: rule__Funcion__Group__6__Impl rule__Funcion__Group__7
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
    // InternalAngularDsl.g:3006:1: rule__Funcion__Group__6__Impl : ( RULE_LLAVE_IZQUIERDA ) ;
    public final void rule__Funcion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3010:1: ( ( RULE_LLAVE_IZQUIERDA ) )
            // InternalAngularDsl.g:3011:1: ( RULE_LLAVE_IZQUIERDA )
            {
            // InternalAngularDsl.g:3011:1: ( RULE_LLAVE_IZQUIERDA )
            // InternalAngularDsl.g:3012:2: RULE_LLAVE_IZQUIERDA
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
    // InternalAngularDsl.g:3021:1: rule__Funcion__Group__7 : rule__Funcion__Group__7__Impl rule__Funcion__Group__8 ;
    public final void rule__Funcion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3025:1: ( rule__Funcion__Group__7__Impl rule__Funcion__Group__8 )
            // InternalAngularDsl.g:3026:2: rule__Funcion__Group__7__Impl rule__Funcion__Group__8
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
    // InternalAngularDsl.g:3033:1: rule__Funcion__Group__7__Impl : ( ( rule__Funcion__VariablesAssignment_7 )* ) ;
    public final void rule__Funcion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3037:1: ( ( ( rule__Funcion__VariablesAssignment_7 )* ) )
            // InternalAngularDsl.g:3038:1: ( ( rule__Funcion__VariablesAssignment_7 )* )
            {
            // InternalAngularDsl.g:3038:1: ( ( rule__Funcion__VariablesAssignment_7 )* )
            // InternalAngularDsl.g:3039:2: ( rule__Funcion__VariablesAssignment_7 )*
            {
             before(grammarAccess.getFuncionAccess().getVariablesAssignment_7()); 
            // InternalAngularDsl.g:3040:2: ( rule__Funcion__VariablesAssignment_7 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAngularDsl.g:3040:3: rule__Funcion__VariablesAssignment_7
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Funcion__VariablesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalAngularDsl.g:3048:1: rule__Funcion__Group__8 : rule__Funcion__Group__8__Impl rule__Funcion__Group__9 ;
    public final void rule__Funcion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3052:1: ( rule__Funcion__Group__8__Impl rule__Funcion__Group__9 )
            // InternalAngularDsl.g:3053:2: rule__Funcion__Group__8__Impl rule__Funcion__Group__9
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
    // InternalAngularDsl.g:3060:1: rule__Funcion__Group__8__Impl : ( ( rule__Funcion__BodyAssignment_8 ) ) ;
    public final void rule__Funcion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3064:1: ( ( ( rule__Funcion__BodyAssignment_8 ) ) )
            // InternalAngularDsl.g:3065:1: ( ( rule__Funcion__BodyAssignment_8 ) )
            {
            // InternalAngularDsl.g:3065:1: ( ( rule__Funcion__BodyAssignment_8 ) )
            // InternalAngularDsl.g:3066:2: ( rule__Funcion__BodyAssignment_8 )
            {
             before(grammarAccess.getFuncionAccess().getBodyAssignment_8()); 
            // InternalAngularDsl.g:3067:2: ( rule__Funcion__BodyAssignment_8 )
            // InternalAngularDsl.g:3067:3: rule__Funcion__BodyAssignment_8
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
    // InternalAngularDsl.g:3075:1: rule__Funcion__Group__9 : rule__Funcion__Group__9__Impl ;
    public final void rule__Funcion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3079:1: ( rule__Funcion__Group__9__Impl )
            // InternalAngularDsl.g:3080:2: rule__Funcion__Group__9__Impl
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
    // InternalAngularDsl.g:3086:1: rule__Funcion__Group__9__Impl : ( RULE_LLAVE_DERECHA ) ;
    public final void rule__Funcion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3090:1: ( ( RULE_LLAVE_DERECHA ) )
            // InternalAngularDsl.g:3091:1: ( RULE_LLAVE_DERECHA )
            {
            // InternalAngularDsl.g:3091:1: ( RULE_LLAVE_DERECHA )
            // InternalAngularDsl.g:3092:2: RULE_LLAVE_DERECHA
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
    // InternalAngularDsl.g:3102:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3106:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalAngularDsl.g:3107:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalAngularDsl.g:3114:1: rule__Variable__Group__0__Impl : ( () ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3118:1: ( ( () ) )
            // InternalAngularDsl.g:3119:1: ( () )
            {
            // InternalAngularDsl.g:3119:1: ( () )
            // InternalAngularDsl.g:3120:2: ()
            {
             before(grammarAccess.getVariableAccess().getVariableAction_0()); 
            // InternalAngularDsl.g:3121:2: ()
            // InternalAngularDsl.g:3121:3: 
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
    // InternalAngularDsl.g:3129:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3133:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalAngularDsl.g:3134:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalAngularDsl.g:3141:1: rule__Variable__Group__1__Impl : ( 'var' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3145:1: ( ( 'var' ) )
            // InternalAngularDsl.g:3146:1: ( 'var' )
            {
            // InternalAngularDsl.g:3146:1: ( 'var' )
            // InternalAngularDsl.g:3147:2: 'var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVarKeyword_1()); 

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
    // InternalAngularDsl.g:3156:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3160:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalAngularDsl.g:3161:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalAngularDsl.g:3168:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__NameAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3172:1: ( ( ( rule__Variable__NameAssignment_2 ) ) )
            // InternalAngularDsl.g:3173:1: ( ( rule__Variable__NameAssignment_2 ) )
            {
            // InternalAngularDsl.g:3173:1: ( ( rule__Variable__NameAssignment_2 ) )
            // InternalAngularDsl.g:3174:2: ( rule__Variable__NameAssignment_2 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_2()); 
            // InternalAngularDsl.g:3175:2: ( rule__Variable__NameAssignment_2 )
            // InternalAngularDsl.g:3175:3: rule__Variable__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_2()); 

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
    // InternalAngularDsl.g:3183:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl rule__Variable__Group__4 ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3187:1: ( rule__Variable__Group__3__Impl rule__Variable__Group__4 )
            // InternalAngularDsl.g:3188:2: rule__Variable__Group__3__Impl rule__Variable__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalAngularDsl.g:3195:1: rule__Variable__Group__3__Impl : ( '=' ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3199:1: ( ( '=' ) )
            // InternalAngularDsl.g:3200:1: ( '=' )
            {
            // InternalAngularDsl.g:3200:1: ( '=' )
            // InternalAngularDsl.g:3201:2: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getEqualsSignKeyword_3()); 

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
    // InternalAngularDsl.g:3210:1: rule__Variable__Group__4 : rule__Variable__Group__4__Impl rule__Variable__Group__5 ;
    public final void rule__Variable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3214:1: ( rule__Variable__Group__4__Impl rule__Variable__Group__5 )
            // InternalAngularDsl.g:3215:2: rule__Variable__Group__4__Impl rule__Variable__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalAngularDsl.g:3222:1: rule__Variable__Group__4__Impl : ( ( rule__Variable__ValorAssignment_4 ) ) ;
    public final void rule__Variable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3226:1: ( ( ( rule__Variable__ValorAssignment_4 ) ) )
            // InternalAngularDsl.g:3227:1: ( ( rule__Variable__ValorAssignment_4 ) )
            {
            // InternalAngularDsl.g:3227:1: ( ( rule__Variable__ValorAssignment_4 ) )
            // InternalAngularDsl.g:3228:2: ( rule__Variable__ValorAssignment_4 )
            {
             before(grammarAccess.getVariableAccess().getValorAssignment_4()); 
            // InternalAngularDsl.g:3229:2: ( rule__Variable__ValorAssignment_4 )
            // InternalAngularDsl.g:3229:3: rule__Variable__ValorAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ValorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getValorAssignment_4()); 

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
    // InternalAngularDsl.g:3237:1: rule__Variable__Group__5 : rule__Variable__Group__5__Impl ;
    public final void rule__Variable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3241:1: ( rule__Variable__Group__5__Impl )
            // InternalAngularDsl.g:3242:2: rule__Variable__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__5__Impl();

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
    // InternalAngularDsl.g:3248:1: rule__Variable__Group__5__Impl : ( RULE_PUNTO_Y_COMA ) ;
    public final void rule__Variable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3252:1: ( ( RULE_PUNTO_Y_COMA ) )
            // InternalAngularDsl.g:3253:1: ( RULE_PUNTO_Y_COMA )
            {
            // InternalAngularDsl.g:3253:1: ( RULE_PUNTO_Y_COMA )
            // InternalAngularDsl.g:3254:2: RULE_PUNTO_Y_COMA
            {
             before(grammarAccess.getVariableAccess().getPUNTO_Y_COMATerminalRuleCall_5()); 
            match(input,RULE_PUNTO_Y_COMA,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getPUNTO_Y_COMATerminalRuleCall_5()); 

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


    // $ANTLR start "rule__Template__Group__0"
    // InternalAngularDsl.g:3264:1: rule__Template__Group__0 : rule__Template__Group__0__Impl rule__Template__Group__1 ;
    public final void rule__Template__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3268:1: ( rule__Template__Group__0__Impl rule__Template__Group__1 )
            // InternalAngularDsl.g:3269:2: rule__Template__Group__0__Impl rule__Template__Group__1
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
    // InternalAngularDsl.g:3276:1: rule__Template__Group__0__Impl : ( () ) ;
    public final void rule__Template__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3280:1: ( ( () ) )
            // InternalAngularDsl.g:3281:1: ( () )
            {
            // InternalAngularDsl.g:3281:1: ( () )
            // InternalAngularDsl.g:3282:2: ()
            {
             before(grammarAccess.getTemplateAccess().getTemplateAction_0()); 
            // InternalAngularDsl.g:3283:2: ()
            // InternalAngularDsl.g:3283:3: 
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
    // InternalAngularDsl.g:3291:1: rule__Template__Group__1 : rule__Template__Group__1__Impl rule__Template__Group__2 ;
    public final void rule__Template__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3295:1: ( rule__Template__Group__1__Impl rule__Template__Group__2 )
            // InternalAngularDsl.g:3296:2: rule__Template__Group__1__Impl rule__Template__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalAngularDsl.g:3303:1: rule__Template__Group__1__Impl : ( ( rule__Template__NameAssignment_1 ) ) ;
    public final void rule__Template__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3307:1: ( ( ( rule__Template__NameAssignment_1 ) ) )
            // InternalAngularDsl.g:3308:1: ( ( rule__Template__NameAssignment_1 ) )
            {
            // InternalAngularDsl.g:3308:1: ( ( rule__Template__NameAssignment_1 ) )
            // InternalAngularDsl.g:3309:2: ( rule__Template__NameAssignment_1 )
            {
             before(grammarAccess.getTemplateAccess().getNameAssignment_1()); 
            // InternalAngularDsl.g:3310:2: ( rule__Template__NameAssignment_1 )
            // InternalAngularDsl.g:3310:3: rule__Template__NameAssignment_1
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
    // InternalAngularDsl.g:3318:1: rule__Template__Group__2 : rule__Template__Group__2__Impl rule__Template__Group__3 ;
    public final void rule__Template__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3322:1: ( rule__Template__Group__2__Impl rule__Template__Group__3 )
            // InternalAngularDsl.g:3323:2: rule__Template__Group__2__Impl rule__Template__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalAngularDsl.g:3330:1: rule__Template__Group__2__Impl : ( '*' ) ;
    public final void rule__Template__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3334:1: ( ( '*' ) )
            // InternalAngularDsl.g:3335:1: ( '*' )
            {
            // InternalAngularDsl.g:3335:1: ( '*' )
            // InternalAngularDsl.g:3336:2: '*'
            {
             before(grammarAccess.getTemplateAccess().getAsteriskKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalAngularDsl.g:3345:1: rule__Template__Group__3 : rule__Template__Group__3__Impl ;
    public final void rule__Template__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3349:1: ( rule__Template__Group__3__Impl )
            // InternalAngularDsl.g:3350:2: rule__Template__Group__3__Impl
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
    // InternalAngularDsl.g:3356:1: rule__Template__Group__3__Impl : ( ( rule__Template__SentenciashtmlAssignment_3 )* ) ;
    public final void rule__Template__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3360:1: ( ( ( rule__Template__SentenciashtmlAssignment_3 )* ) )
            // InternalAngularDsl.g:3361:1: ( ( rule__Template__SentenciashtmlAssignment_3 )* )
            {
            // InternalAngularDsl.g:3361:1: ( ( rule__Template__SentenciashtmlAssignment_3 )* )
            // InternalAngularDsl.g:3362:2: ( rule__Template__SentenciashtmlAssignment_3 )*
            {
             before(grammarAccess.getTemplateAccess().getSentenciashtmlAssignment_3()); 
            // InternalAngularDsl.g:3363:2: ( rule__Template__SentenciashtmlAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAngularDsl.g:3363:3: rule__Template__SentenciashtmlAssignment_3
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Template__SentenciashtmlAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalAngularDsl.g:3372:1: rule__SentenciaHTML__Group__0 : rule__SentenciaHTML__Group__0__Impl rule__SentenciaHTML__Group__1 ;
    public final void rule__SentenciaHTML__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3376:1: ( rule__SentenciaHTML__Group__0__Impl rule__SentenciaHTML__Group__1 )
            // InternalAngularDsl.g:3377:2: rule__SentenciaHTML__Group__0__Impl rule__SentenciaHTML__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalAngularDsl.g:3384:1: rule__SentenciaHTML__Group__0__Impl : ( () ) ;
    public final void rule__SentenciaHTML__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3388:1: ( ( () ) )
            // InternalAngularDsl.g:3389:1: ( () )
            {
            // InternalAngularDsl.g:3389:1: ( () )
            // InternalAngularDsl.g:3390:2: ()
            {
             before(grammarAccess.getSentenciaHTMLAccess().getSentenciaHTMLAction_0()); 
            // InternalAngularDsl.g:3391:2: ()
            // InternalAngularDsl.g:3391:3: 
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
    // InternalAngularDsl.g:3399:1: rule__SentenciaHTML__Group__1 : rule__SentenciaHTML__Group__1__Impl rule__SentenciaHTML__Group__2 ;
    public final void rule__SentenciaHTML__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3403:1: ( rule__SentenciaHTML__Group__1__Impl rule__SentenciaHTML__Group__2 )
            // InternalAngularDsl.g:3404:2: rule__SentenciaHTML__Group__1__Impl rule__SentenciaHTML__Group__2
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
    // InternalAngularDsl.g:3411:1: rule__SentenciaHTML__Group__1__Impl : ( '<' ) ;
    public final void rule__SentenciaHTML__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3415:1: ( ( '<' ) )
            // InternalAngularDsl.g:3416:1: ( '<' )
            {
            // InternalAngularDsl.g:3416:1: ( '<' )
            // InternalAngularDsl.g:3417:2: '<'
            {
             before(grammarAccess.getSentenciaHTMLAccess().getLessThanSignKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSentenciaHTMLAccess().getLessThanSignKeyword_1()); 

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
    // InternalAngularDsl.g:3426:1: rule__SentenciaHTML__Group__2 : rule__SentenciaHTML__Group__2__Impl rule__SentenciaHTML__Group__3 ;
    public final void rule__SentenciaHTML__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3430:1: ( rule__SentenciaHTML__Group__2__Impl rule__SentenciaHTML__Group__3 )
            // InternalAngularDsl.g:3431:2: rule__SentenciaHTML__Group__2__Impl rule__SentenciaHTML__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalAngularDsl.g:3438:1: rule__SentenciaHTML__Group__2__Impl : ( ( rule__SentenciaHTML__NameAssignment_2 ) ) ;
    public final void rule__SentenciaHTML__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3442:1: ( ( ( rule__SentenciaHTML__NameAssignment_2 ) ) )
            // InternalAngularDsl.g:3443:1: ( ( rule__SentenciaHTML__NameAssignment_2 ) )
            {
            // InternalAngularDsl.g:3443:1: ( ( rule__SentenciaHTML__NameAssignment_2 ) )
            // InternalAngularDsl.g:3444:2: ( rule__SentenciaHTML__NameAssignment_2 )
            {
             before(grammarAccess.getSentenciaHTMLAccess().getNameAssignment_2()); 
            // InternalAngularDsl.g:3445:2: ( rule__SentenciaHTML__NameAssignment_2 )
            // InternalAngularDsl.g:3445:3: rule__SentenciaHTML__NameAssignment_2
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
    // InternalAngularDsl.g:3453:1: rule__SentenciaHTML__Group__3 : rule__SentenciaHTML__Group__3__Impl rule__SentenciaHTML__Group__4 ;
    public final void rule__SentenciaHTML__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3457:1: ( rule__SentenciaHTML__Group__3__Impl rule__SentenciaHTML__Group__4 )
            // InternalAngularDsl.g:3458:2: rule__SentenciaHTML__Group__3__Impl rule__SentenciaHTML__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalAngularDsl.g:3465:1: rule__SentenciaHTML__Group__3__Impl : ( ( rule__SentenciaHTML__PropiedadesAssignment_3 )* ) ;
    public final void rule__SentenciaHTML__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3469:1: ( ( ( rule__SentenciaHTML__PropiedadesAssignment_3 )* ) )
            // InternalAngularDsl.g:3470:1: ( ( rule__SentenciaHTML__PropiedadesAssignment_3 )* )
            {
            // InternalAngularDsl.g:3470:1: ( ( rule__SentenciaHTML__PropiedadesAssignment_3 )* )
            // InternalAngularDsl.g:3471:2: ( rule__SentenciaHTML__PropiedadesAssignment_3 )*
            {
             before(grammarAccess.getSentenciaHTMLAccess().getPropiedadesAssignment_3()); 
            // InternalAngularDsl.g:3472:2: ( rule__SentenciaHTML__PropiedadesAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAngularDsl.g:3472:3: rule__SentenciaHTML__PropiedadesAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SentenciaHTML__PropiedadesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalAngularDsl.g:3480:1: rule__SentenciaHTML__Group__4 : rule__SentenciaHTML__Group__4__Impl rule__SentenciaHTML__Group__5 ;
    public final void rule__SentenciaHTML__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3484:1: ( rule__SentenciaHTML__Group__4__Impl rule__SentenciaHTML__Group__5 )
            // InternalAngularDsl.g:3485:2: rule__SentenciaHTML__Group__4__Impl rule__SentenciaHTML__Group__5
            {
            pushFollow(FOLLOW_35);
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
    // InternalAngularDsl.g:3492:1: rule__SentenciaHTML__Group__4__Impl : ( ( rule__SentenciaHTML__DirectivasAssignment_4 )* ) ;
    public final void rule__SentenciaHTML__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3496:1: ( ( ( rule__SentenciaHTML__DirectivasAssignment_4 )* ) )
            // InternalAngularDsl.g:3497:1: ( ( rule__SentenciaHTML__DirectivasAssignment_4 )* )
            {
            // InternalAngularDsl.g:3497:1: ( ( rule__SentenciaHTML__DirectivasAssignment_4 )* )
            // InternalAngularDsl.g:3498:2: ( rule__SentenciaHTML__DirectivasAssignment_4 )*
            {
             before(grammarAccess.getSentenciaHTMLAccess().getDirectivasAssignment_4()); 
            // InternalAngularDsl.g:3499:2: ( rule__SentenciaHTML__DirectivasAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==38) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAngularDsl.g:3499:3: rule__SentenciaHTML__DirectivasAssignment_4
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__SentenciaHTML__DirectivasAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalAngularDsl.g:3507:1: rule__SentenciaHTML__Group__5 : rule__SentenciaHTML__Group__5__Impl rule__SentenciaHTML__Group__6 ;
    public final void rule__SentenciaHTML__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3511:1: ( rule__SentenciaHTML__Group__5__Impl rule__SentenciaHTML__Group__6 )
            // InternalAngularDsl.g:3512:2: rule__SentenciaHTML__Group__5__Impl rule__SentenciaHTML__Group__6
            {
            pushFollow(FOLLOW_35);
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
    // InternalAngularDsl.g:3519:1: rule__SentenciaHTML__Group__5__Impl : ( ( '/' )* ) ;
    public final void rule__SentenciaHTML__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3523:1: ( ( ( '/' )* ) )
            // InternalAngularDsl.g:3524:1: ( ( '/' )* )
            {
            // InternalAngularDsl.g:3524:1: ( ( '/' )* )
            // InternalAngularDsl.g:3525:2: ( '/' )*
            {
             before(grammarAccess.getSentenciaHTMLAccess().getSolidusKeyword_5()); 
            // InternalAngularDsl.g:3526:2: ( '/' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==35) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAngularDsl.g:3526:3: '/'
            	    {
            	    match(input,35,FOLLOW_37); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSentenciaHTMLAccess().getSolidusKeyword_5()); 

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
    // InternalAngularDsl.g:3534:1: rule__SentenciaHTML__Group__6 : rule__SentenciaHTML__Group__6__Impl rule__SentenciaHTML__Group__7 ;
    public final void rule__SentenciaHTML__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3538:1: ( rule__SentenciaHTML__Group__6__Impl rule__SentenciaHTML__Group__7 )
            // InternalAngularDsl.g:3539:2: rule__SentenciaHTML__Group__6__Impl rule__SentenciaHTML__Group__7
            {
            pushFollow(FOLLOW_38);
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
    // InternalAngularDsl.g:3546:1: rule__SentenciaHTML__Group__6__Impl : ( '>' ) ;
    public final void rule__SentenciaHTML__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3550:1: ( ( '>' ) )
            // InternalAngularDsl.g:3551:1: ( '>' )
            {
            // InternalAngularDsl.g:3551:1: ( '>' )
            // InternalAngularDsl.g:3552:2: '>'
            {
             before(grammarAccess.getSentenciaHTMLAccess().getGreaterThanSignKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSentenciaHTMLAccess().getGreaterThanSignKeyword_6()); 

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
    // InternalAngularDsl.g:3561:1: rule__SentenciaHTML__Group__7 : rule__SentenciaHTML__Group__7__Impl rule__SentenciaHTML__Group__8 ;
    public final void rule__SentenciaHTML__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3565:1: ( rule__SentenciaHTML__Group__7__Impl rule__SentenciaHTML__Group__8 )
            // InternalAngularDsl.g:3566:2: rule__SentenciaHTML__Group__7__Impl rule__SentenciaHTML__Group__8
            {
            pushFollow(FOLLOW_38);
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
    // InternalAngularDsl.g:3573:1: rule__SentenciaHTML__Group__7__Impl : ( ( rule__SentenciaHTML__CurlybracesAssignment_7 )* ) ;
    public final void rule__SentenciaHTML__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3577:1: ( ( ( rule__SentenciaHTML__CurlybracesAssignment_7 )* ) )
            // InternalAngularDsl.g:3578:1: ( ( rule__SentenciaHTML__CurlybracesAssignment_7 )* )
            {
            // InternalAngularDsl.g:3578:1: ( ( rule__SentenciaHTML__CurlybracesAssignment_7 )* )
            // InternalAngularDsl.g:3579:2: ( rule__SentenciaHTML__CurlybracesAssignment_7 )*
            {
             before(grammarAccess.getSentenciaHTMLAccess().getCurlybracesAssignment_7()); 
            // InternalAngularDsl.g:3580:2: ( rule__SentenciaHTML__CurlybracesAssignment_7 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==39) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAngularDsl.g:3580:3: rule__SentenciaHTML__CurlybracesAssignment_7
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__SentenciaHTML__CurlybracesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalAngularDsl.g:3588:1: rule__SentenciaHTML__Group__8 : rule__SentenciaHTML__Group__8__Impl rule__SentenciaHTML__Group__9 ;
    public final void rule__SentenciaHTML__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3592:1: ( rule__SentenciaHTML__Group__8__Impl rule__SentenciaHTML__Group__9 )
            // InternalAngularDsl.g:3593:2: rule__SentenciaHTML__Group__8__Impl rule__SentenciaHTML__Group__9
            {
            pushFollow(FOLLOW_38);
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
    // InternalAngularDsl.g:3600:1: rule__SentenciaHTML__Group__8__Impl : ( ( rule__SentenciaHTML__SentenciashtmlAssignment_8 )* ) ;
    public final void rule__SentenciaHTML__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3604:1: ( ( ( rule__SentenciaHTML__SentenciashtmlAssignment_8 )* ) )
            // InternalAngularDsl.g:3605:1: ( ( rule__SentenciaHTML__SentenciashtmlAssignment_8 )* )
            {
            // InternalAngularDsl.g:3605:1: ( ( rule__SentenciaHTML__SentenciashtmlAssignment_8 )* )
            // InternalAngularDsl.g:3606:2: ( rule__SentenciaHTML__SentenciashtmlAssignment_8 )*
            {
             before(grammarAccess.getSentenciaHTMLAccess().getSentenciashtmlAssignment_8()); 
            // InternalAngularDsl.g:3607:2: ( rule__SentenciaHTML__SentenciashtmlAssignment_8 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAngularDsl.g:3607:3: rule__SentenciaHTML__SentenciashtmlAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SentenciaHTML__SentenciashtmlAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalAngularDsl.g:3615:1: rule__SentenciaHTML__Group__9 : rule__SentenciaHTML__Group__9__Impl ;
    public final void rule__SentenciaHTML__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3619:1: ( rule__SentenciaHTML__Group__9__Impl )
            // InternalAngularDsl.g:3620:2: rule__SentenciaHTML__Group__9__Impl
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
    // InternalAngularDsl.g:3626:1: rule__SentenciaHTML__Group__9__Impl : ( ( rule__SentenciaHTML__Group_9__0 )? ) ;
    public final void rule__SentenciaHTML__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3630:1: ( ( ( rule__SentenciaHTML__Group_9__0 )? ) )
            // InternalAngularDsl.g:3631:1: ( ( rule__SentenciaHTML__Group_9__0 )? )
            {
            // InternalAngularDsl.g:3631:1: ( ( rule__SentenciaHTML__Group_9__0 )? )
            // InternalAngularDsl.g:3632:2: ( rule__SentenciaHTML__Group_9__0 )?
            {
             before(grammarAccess.getSentenciaHTMLAccess().getGroup_9()); 
            // InternalAngularDsl.g:3633:2: ( rule__SentenciaHTML__Group_9__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAngularDsl.g:3633:3: rule__SentenciaHTML__Group_9__0
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
    // InternalAngularDsl.g:3642:1: rule__SentenciaHTML__Group_9__0 : rule__SentenciaHTML__Group_9__0__Impl rule__SentenciaHTML__Group_9__1 ;
    public final void rule__SentenciaHTML__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3646:1: ( rule__SentenciaHTML__Group_9__0__Impl rule__SentenciaHTML__Group_9__1 )
            // InternalAngularDsl.g:3647:2: rule__SentenciaHTML__Group_9__0__Impl rule__SentenciaHTML__Group_9__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalAngularDsl.g:3654:1: rule__SentenciaHTML__Group_9__0__Impl : ( '</' ) ;
    public final void rule__SentenciaHTML__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3658:1: ( ( '</' ) )
            // InternalAngularDsl.g:3659:1: ( '</' )
            {
            // InternalAngularDsl.g:3659:1: ( '</' )
            // InternalAngularDsl.g:3660:2: '</'
            {
             before(grammarAccess.getSentenciaHTMLAccess().getLessThanSignSolidusKeyword_9_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSentenciaHTMLAccess().getLessThanSignSolidusKeyword_9_0()); 

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
    // InternalAngularDsl.g:3669:1: rule__SentenciaHTML__Group_9__1 : rule__SentenciaHTML__Group_9__1__Impl rule__SentenciaHTML__Group_9__2 ;
    public final void rule__SentenciaHTML__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3673:1: ( rule__SentenciaHTML__Group_9__1__Impl rule__SentenciaHTML__Group_9__2 )
            // InternalAngularDsl.g:3674:2: rule__SentenciaHTML__Group_9__1__Impl rule__SentenciaHTML__Group_9__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalAngularDsl.g:3681:1: rule__SentenciaHTML__Group_9__1__Impl : ( RULE_STRING ) ;
    public final void rule__SentenciaHTML__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3685:1: ( ( RULE_STRING ) )
            // InternalAngularDsl.g:3686:1: ( RULE_STRING )
            {
            // InternalAngularDsl.g:3686:1: ( RULE_STRING )
            // InternalAngularDsl.g:3687:2: RULE_STRING
            {
             before(grammarAccess.getSentenciaHTMLAccess().getSTRINGTerminalRuleCall_9_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSentenciaHTMLAccess().getSTRINGTerminalRuleCall_9_1()); 

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
    // InternalAngularDsl.g:3696:1: rule__SentenciaHTML__Group_9__2 : rule__SentenciaHTML__Group_9__2__Impl ;
    public final void rule__SentenciaHTML__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3700:1: ( rule__SentenciaHTML__Group_9__2__Impl )
            // InternalAngularDsl.g:3701:2: rule__SentenciaHTML__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SentenciaHTML__Group_9__2__Impl();

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
    // InternalAngularDsl.g:3707:1: rule__SentenciaHTML__Group_9__2__Impl : ( '>' ) ;
    public final void rule__SentenciaHTML__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3711:1: ( ( '>' ) )
            // InternalAngularDsl.g:3712:1: ( '>' )
            {
            // InternalAngularDsl.g:3712:1: ( '>' )
            // InternalAngularDsl.g:3713:2: '>'
            {
             before(grammarAccess.getSentenciaHTMLAccess().getGreaterThanSignKeyword_9_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSentenciaHTMLAccess().getGreaterThanSignKeyword_9_2()); 

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


    // $ANTLR start "rule__Directiva__Group__0"
    // InternalAngularDsl.g:3723:1: rule__Directiva__Group__0 : rule__Directiva__Group__0__Impl rule__Directiva__Group__1 ;
    public final void rule__Directiva__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3727:1: ( rule__Directiva__Group__0__Impl rule__Directiva__Group__1 )
            // InternalAngularDsl.g:3728:2: rule__Directiva__Group__0__Impl rule__Directiva__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalAngularDsl.g:3735:1: rule__Directiva__Group__0__Impl : ( () ) ;
    public final void rule__Directiva__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3739:1: ( ( () ) )
            // InternalAngularDsl.g:3740:1: ( () )
            {
            // InternalAngularDsl.g:3740:1: ( () )
            // InternalAngularDsl.g:3741:2: ()
            {
             before(grammarAccess.getDirectivaAccess().getDirectivaAction_0()); 
            // InternalAngularDsl.g:3742:2: ()
            // InternalAngularDsl.g:3742:3: 
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
    // InternalAngularDsl.g:3750:1: rule__Directiva__Group__1 : rule__Directiva__Group__1__Impl rule__Directiva__Group__2 ;
    public final void rule__Directiva__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3754:1: ( rule__Directiva__Group__1__Impl rule__Directiva__Group__2 )
            // InternalAngularDsl.g:3755:2: rule__Directiva__Group__1__Impl rule__Directiva__Group__2
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
    // InternalAngularDsl.g:3762:1: rule__Directiva__Group__1__Impl : ( 'ng-' ) ;
    public final void rule__Directiva__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3766:1: ( ( 'ng-' ) )
            // InternalAngularDsl.g:3767:1: ( 'ng-' )
            {
            // InternalAngularDsl.g:3767:1: ( 'ng-' )
            // InternalAngularDsl.g:3768:2: 'ng-'
            {
             before(grammarAccess.getDirectivaAccess().getNgKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAngularDsl.g:3777:1: rule__Directiva__Group__2 : rule__Directiva__Group__2__Impl rule__Directiva__Group__3 ;
    public final void rule__Directiva__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3781:1: ( rule__Directiva__Group__2__Impl rule__Directiva__Group__3 )
            // InternalAngularDsl.g:3782:2: rule__Directiva__Group__2__Impl rule__Directiva__Group__3
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
    // InternalAngularDsl.g:3789:1: rule__Directiva__Group__2__Impl : ( ( rule__Directiva__NameAssignment_2 ) ) ;
    public final void rule__Directiva__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3793:1: ( ( ( rule__Directiva__NameAssignment_2 ) ) )
            // InternalAngularDsl.g:3794:1: ( ( rule__Directiva__NameAssignment_2 ) )
            {
            // InternalAngularDsl.g:3794:1: ( ( rule__Directiva__NameAssignment_2 ) )
            // InternalAngularDsl.g:3795:2: ( rule__Directiva__NameAssignment_2 )
            {
             before(grammarAccess.getDirectivaAccess().getNameAssignment_2()); 
            // InternalAngularDsl.g:3796:2: ( rule__Directiva__NameAssignment_2 )
            // InternalAngularDsl.g:3796:3: rule__Directiva__NameAssignment_2
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
    // InternalAngularDsl.g:3804:1: rule__Directiva__Group__3 : rule__Directiva__Group__3__Impl rule__Directiva__Group__4 ;
    public final void rule__Directiva__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3808:1: ( rule__Directiva__Group__3__Impl rule__Directiva__Group__4 )
            // InternalAngularDsl.g:3809:2: rule__Directiva__Group__3__Impl rule__Directiva__Group__4
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
    // InternalAngularDsl.g:3816:1: rule__Directiva__Group__3__Impl : ( '=' ) ;
    public final void rule__Directiva__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3820:1: ( ( '=' ) )
            // InternalAngularDsl.g:3821:1: ( '=' )
            {
            // InternalAngularDsl.g:3821:1: ( '=' )
            // InternalAngularDsl.g:3822:2: '='
            {
             before(grammarAccess.getDirectivaAccess().getEqualsSignKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDirectivaAccess().getEqualsSignKeyword_3()); 

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
    // InternalAngularDsl.g:3831:1: rule__Directiva__Group__4 : rule__Directiva__Group__4__Impl rule__Directiva__Group__5 ;
    public final void rule__Directiva__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3835:1: ( rule__Directiva__Group__4__Impl rule__Directiva__Group__5 )
            // InternalAngularDsl.g:3836:2: rule__Directiva__Group__4__Impl rule__Directiva__Group__5
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
    // InternalAngularDsl.g:3843:1: rule__Directiva__Group__4__Impl : ( ( rule__Directiva__CurlybracesAssignment_4 )? ) ;
    public final void rule__Directiva__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3847:1: ( ( ( rule__Directiva__CurlybracesAssignment_4 )? ) )
            // InternalAngularDsl.g:3848:1: ( ( rule__Directiva__CurlybracesAssignment_4 )? )
            {
            // InternalAngularDsl.g:3848:1: ( ( rule__Directiva__CurlybracesAssignment_4 )? )
            // InternalAngularDsl.g:3849:2: ( rule__Directiva__CurlybracesAssignment_4 )?
            {
             before(grammarAccess.getDirectivaAccess().getCurlybracesAssignment_4()); 
            // InternalAngularDsl.g:3850:2: ( rule__Directiva__CurlybracesAssignment_4 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                int LA20_1 = input.LA(2);

                if ( ((LA20_1>=RULE_STRING && LA20_1<=RULE_ID)) ) {
                    alt20=1;
                }
            }
            else if ( (LA20_0==RULE_ID) ) {
                int LA20_2 = input.LA(2);

                if ( ((LA20_2>=RULE_STRING && LA20_2<=RULE_ID)) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalAngularDsl.g:3850:3: rule__Directiva__CurlybracesAssignment_4
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
    // InternalAngularDsl.g:3858:1: rule__Directiva__Group__5 : rule__Directiva__Group__5__Impl ;
    public final void rule__Directiva__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3862:1: ( rule__Directiva__Group__5__Impl )
            // InternalAngularDsl.g:3863:2: rule__Directiva__Group__5__Impl
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
    // InternalAngularDsl.g:3869:1: rule__Directiva__Group__5__Impl : ( ( rule__Directiva__ReferenciaAssignment_5 ) ) ;
    public final void rule__Directiva__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3873:1: ( ( ( rule__Directiva__ReferenciaAssignment_5 ) ) )
            // InternalAngularDsl.g:3874:1: ( ( rule__Directiva__ReferenciaAssignment_5 ) )
            {
            // InternalAngularDsl.g:3874:1: ( ( rule__Directiva__ReferenciaAssignment_5 ) )
            // InternalAngularDsl.g:3875:2: ( rule__Directiva__ReferenciaAssignment_5 )
            {
             before(grammarAccess.getDirectivaAccess().getReferenciaAssignment_5()); 
            // InternalAngularDsl.g:3876:2: ( rule__Directiva__ReferenciaAssignment_5 )
            // InternalAngularDsl.g:3876:3: rule__Directiva__ReferenciaAssignment_5
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
    // InternalAngularDsl.g:3885:1: rule__Propiedad__Group__0 : rule__Propiedad__Group__0__Impl rule__Propiedad__Group__1 ;
    public final void rule__Propiedad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3889:1: ( rule__Propiedad__Group__0__Impl rule__Propiedad__Group__1 )
            // InternalAngularDsl.g:3890:2: rule__Propiedad__Group__0__Impl rule__Propiedad__Group__1
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
    // InternalAngularDsl.g:3897:1: rule__Propiedad__Group__0__Impl : ( () ) ;
    public final void rule__Propiedad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3901:1: ( ( () ) )
            // InternalAngularDsl.g:3902:1: ( () )
            {
            // InternalAngularDsl.g:3902:1: ( () )
            // InternalAngularDsl.g:3903:2: ()
            {
             before(grammarAccess.getPropiedadAccess().getPropiedadAction_0()); 
            // InternalAngularDsl.g:3904:2: ()
            // InternalAngularDsl.g:3904:3: 
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
    // InternalAngularDsl.g:3912:1: rule__Propiedad__Group__1 : rule__Propiedad__Group__1__Impl rule__Propiedad__Group__2 ;
    public final void rule__Propiedad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3916:1: ( rule__Propiedad__Group__1__Impl rule__Propiedad__Group__2 )
            // InternalAngularDsl.g:3917:2: rule__Propiedad__Group__1__Impl rule__Propiedad__Group__2
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
    // InternalAngularDsl.g:3924:1: rule__Propiedad__Group__1__Impl : ( ( rule__Propiedad__NameAssignment_1 ) ) ;
    public final void rule__Propiedad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3928:1: ( ( ( rule__Propiedad__NameAssignment_1 ) ) )
            // InternalAngularDsl.g:3929:1: ( ( rule__Propiedad__NameAssignment_1 ) )
            {
            // InternalAngularDsl.g:3929:1: ( ( rule__Propiedad__NameAssignment_1 ) )
            // InternalAngularDsl.g:3930:2: ( rule__Propiedad__NameAssignment_1 )
            {
             before(grammarAccess.getPropiedadAccess().getNameAssignment_1()); 
            // InternalAngularDsl.g:3931:2: ( rule__Propiedad__NameAssignment_1 )
            // InternalAngularDsl.g:3931:3: rule__Propiedad__NameAssignment_1
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
    // InternalAngularDsl.g:3939:1: rule__Propiedad__Group__2 : rule__Propiedad__Group__2__Impl rule__Propiedad__Group__3 ;
    public final void rule__Propiedad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3943:1: ( rule__Propiedad__Group__2__Impl rule__Propiedad__Group__3 )
            // InternalAngularDsl.g:3944:2: rule__Propiedad__Group__2__Impl rule__Propiedad__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalAngularDsl.g:3951:1: rule__Propiedad__Group__2__Impl : ( '=' ) ;
    public final void rule__Propiedad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3955:1: ( ( '=' ) )
            // InternalAngularDsl.g:3956:1: ( '=' )
            {
            // InternalAngularDsl.g:3956:1: ( '=' )
            // InternalAngularDsl.g:3957:2: '='
            {
             before(grammarAccess.getPropiedadAccess().getEqualsSignKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPropiedadAccess().getEqualsSignKeyword_2()); 

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
    // InternalAngularDsl.g:3966:1: rule__Propiedad__Group__3 : rule__Propiedad__Group__3__Impl ;
    public final void rule__Propiedad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3970:1: ( rule__Propiedad__Group__3__Impl )
            // InternalAngularDsl.g:3971:2: rule__Propiedad__Group__3__Impl
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
    // InternalAngularDsl.g:3977:1: rule__Propiedad__Group__3__Impl : ( RULE_STRING ) ;
    public final void rule__Propiedad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3981:1: ( ( RULE_STRING ) )
            // InternalAngularDsl.g:3982:1: ( RULE_STRING )
            {
            // InternalAngularDsl.g:3982:1: ( RULE_STRING )
            // InternalAngularDsl.g:3983:2: RULE_STRING
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
    // InternalAngularDsl.g:3993:1: rule__CurlyBraces__Group__0 : rule__CurlyBraces__Group__0__Impl rule__CurlyBraces__Group__1 ;
    public final void rule__CurlyBraces__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:3997:1: ( rule__CurlyBraces__Group__0__Impl rule__CurlyBraces__Group__1 )
            // InternalAngularDsl.g:3998:2: rule__CurlyBraces__Group__0__Impl rule__CurlyBraces__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalAngularDsl.g:4005:1: rule__CurlyBraces__Group__0__Impl : ( () ) ;
    public final void rule__CurlyBraces__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4009:1: ( ( () ) )
            // InternalAngularDsl.g:4010:1: ( () )
            {
            // InternalAngularDsl.g:4010:1: ( () )
            // InternalAngularDsl.g:4011:2: ()
            {
             before(grammarAccess.getCurlyBracesAccess().getCurlyBracesAction_0()); 
            // InternalAngularDsl.g:4012:2: ()
            // InternalAngularDsl.g:4012:3: 
            {
            }

             after(grammarAccess.getCurlyBracesAccess().getCurlyBracesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CurlyBraces__Group__0__Impl"


    // $ANTLR start "rule__CurlyBraces__Group__1"
    // InternalAngularDsl.g:4020:1: rule__CurlyBraces__Group__1 : rule__CurlyBraces__Group__1__Impl rule__CurlyBraces__Group__2 ;
    public final void rule__CurlyBraces__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4024:1: ( rule__CurlyBraces__Group__1__Impl rule__CurlyBraces__Group__2 )
            // InternalAngularDsl.g:4025:2: rule__CurlyBraces__Group__1__Impl rule__CurlyBraces__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalAngularDsl.g:4032:1: rule__CurlyBraces__Group__1__Impl : ( '{{' ) ;
    public final void rule__CurlyBraces__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4036:1: ( ( '{{' ) )
            // InternalAngularDsl.g:4037:1: ( '{{' )
            {
            // InternalAngularDsl.g:4037:1: ( '{{' )
            // InternalAngularDsl.g:4038:2: '{{'
            {
             before(grammarAccess.getCurlyBracesAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCurlyBracesAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_1()); 

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
    // InternalAngularDsl.g:4047:1: rule__CurlyBraces__Group__2 : rule__CurlyBraces__Group__2__Impl rule__CurlyBraces__Group__3 ;
    public final void rule__CurlyBraces__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4051:1: ( rule__CurlyBraces__Group__2__Impl rule__CurlyBraces__Group__3 )
            // InternalAngularDsl.g:4052:2: rule__CurlyBraces__Group__2__Impl rule__CurlyBraces__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalAngularDsl.g:4059:1: rule__CurlyBraces__Group__2__Impl : ( ( rule__CurlyBraces__ExpresionAssignment_2 ) ) ;
    public final void rule__CurlyBraces__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4063:1: ( ( ( rule__CurlyBraces__ExpresionAssignment_2 ) ) )
            // InternalAngularDsl.g:4064:1: ( ( rule__CurlyBraces__ExpresionAssignment_2 ) )
            {
            // InternalAngularDsl.g:4064:1: ( ( rule__CurlyBraces__ExpresionAssignment_2 ) )
            // InternalAngularDsl.g:4065:2: ( rule__CurlyBraces__ExpresionAssignment_2 )
            {
             before(grammarAccess.getCurlyBracesAccess().getExpresionAssignment_2()); 
            // InternalAngularDsl.g:4066:2: ( rule__CurlyBraces__ExpresionAssignment_2 )
            // InternalAngularDsl.g:4066:3: rule__CurlyBraces__ExpresionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CurlyBraces__ExpresionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCurlyBracesAccess().getExpresionAssignment_2()); 

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
    // InternalAngularDsl.g:4074:1: rule__CurlyBraces__Group__3 : rule__CurlyBraces__Group__3__Impl rule__CurlyBraces__Group__4 ;
    public final void rule__CurlyBraces__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4078:1: ( rule__CurlyBraces__Group__3__Impl rule__CurlyBraces__Group__4 )
            // InternalAngularDsl.g:4079:2: rule__CurlyBraces__Group__3__Impl rule__CurlyBraces__Group__4
            {
            pushFollow(FOLLOW_44);
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
    // InternalAngularDsl.g:4086:1: rule__CurlyBraces__Group__3__Impl : ( ( rule__CurlyBraces__FiltroAssignment_3 )? ) ;
    public final void rule__CurlyBraces__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4090:1: ( ( ( rule__CurlyBraces__FiltroAssignment_3 )? ) )
            // InternalAngularDsl.g:4091:1: ( ( rule__CurlyBraces__FiltroAssignment_3 )? )
            {
            // InternalAngularDsl.g:4091:1: ( ( rule__CurlyBraces__FiltroAssignment_3 )? )
            // InternalAngularDsl.g:4092:2: ( rule__CurlyBraces__FiltroAssignment_3 )?
            {
             before(grammarAccess.getCurlyBracesAccess().getFiltroAssignment_3()); 
            // InternalAngularDsl.g:4093:2: ( rule__CurlyBraces__FiltroAssignment_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==41) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAngularDsl.g:4093:3: rule__CurlyBraces__FiltroAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__CurlyBraces__FiltroAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCurlyBracesAccess().getFiltroAssignment_3()); 

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
    // InternalAngularDsl.g:4101:1: rule__CurlyBraces__Group__4 : rule__CurlyBraces__Group__4__Impl ;
    public final void rule__CurlyBraces__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4105:1: ( rule__CurlyBraces__Group__4__Impl )
            // InternalAngularDsl.g:4106:2: rule__CurlyBraces__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CurlyBraces__Group__4__Impl();

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
    // InternalAngularDsl.g:4112:1: rule__CurlyBraces__Group__4__Impl : ( '}}' ) ;
    public final void rule__CurlyBraces__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4116:1: ( ( '}}' ) )
            // InternalAngularDsl.g:4117:1: ( '}}' )
            {
            // InternalAngularDsl.g:4117:1: ( '}}' )
            // InternalAngularDsl.g:4118:2: '}}'
            {
             before(grammarAccess.getCurlyBracesAccess().getRightCurlyBracketRightCurlyBracketKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCurlyBracesAccess().getRightCurlyBracketRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__Expresion__Group__0"
    // InternalAngularDsl.g:4128:1: rule__Expresion__Group__0 : rule__Expresion__Group__0__Impl rule__Expresion__Group__1 ;
    public final void rule__Expresion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4132:1: ( rule__Expresion__Group__0__Impl rule__Expresion__Group__1 )
            // InternalAngularDsl.g:4133:2: rule__Expresion__Group__0__Impl rule__Expresion__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalAngularDsl.g:4140:1: rule__Expresion__Group__0__Impl : ( () ) ;
    public final void rule__Expresion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4144:1: ( ( () ) )
            // InternalAngularDsl.g:4145:1: ( () )
            {
            // InternalAngularDsl.g:4145:1: ( () )
            // InternalAngularDsl.g:4146:2: ()
            {
             before(grammarAccess.getExpresionAccess().getExpresionAction_0()); 
            // InternalAngularDsl.g:4147:2: ()
            // InternalAngularDsl.g:4147:3: 
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
    // InternalAngularDsl.g:4155:1: rule__Expresion__Group__1 : rule__Expresion__Group__1__Impl rule__Expresion__Group__2 ;
    public final void rule__Expresion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4159:1: ( rule__Expresion__Group__1__Impl rule__Expresion__Group__2 )
            // InternalAngularDsl.g:4160:2: rule__Expresion__Group__1__Impl rule__Expresion__Group__2
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
    // InternalAngularDsl.g:4167:1: rule__Expresion__Group__1__Impl : ( ( rule__Expresion__ValorAssignment_1 ) ) ;
    public final void rule__Expresion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4171:1: ( ( ( rule__Expresion__ValorAssignment_1 ) ) )
            // InternalAngularDsl.g:4172:1: ( ( rule__Expresion__ValorAssignment_1 ) )
            {
            // InternalAngularDsl.g:4172:1: ( ( rule__Expresion__ValorAssignment_1 ) )
            // InternalAngularDsl.g:4173:2: ( rule__Expresion__ValorAssignment_1 )
            {
             before(grammarAccess.getExpresionAccess().getValorAssignment_1()); 
            // InternalAngularDsl.g:4174:2: ( rule__Expresion__ValorAssignment_1 )
            // InternalAngularDsl.g:4174:3: rule__Expresion__ValorAssignment_1
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
    // InternalAngularDsl.g:4182:1: rule__Expresion__Group__2 : rule__Expresion__Group__2__Impl ;
    public final void rule__Expresion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4186:1: ( rule__Expresion__Group__2__Impl )
            // InternalAngularDsl.g:4187:2: rule__Expresion__Group__2__Impl
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
    // InternalAngularDsl.g:4193:1: rule__Expresion__Group__2__Impl : ( ( rule__Expresion__ReferenciaAssignment_2 ) ) ;
    public final void rule__Expresion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4197:1: ( ( ( rule__Expresion__ReferenciaAssignment_2 ) ) )
            // InternalAngularDsl.g:4198:1: ( ( rule__Expresion__ReferenciaAssignment_2 ) )
            {
            // InternalAngularDsl.g:4198:1: ( ( rule__Expresion__ReferenciaAssignment_2 ) )
            // InternalAngularDsl.g:4199:2: ( rule__Expresion__ReferenciaAssignment_2 )
            {
             before(grammarAccess.getExpresionAccess().getReferenciaAssignment_2()); 
            // InternalAngularDsl.g:4200:2: ( rule__Expresion__ReferenciaAssignment_2 )
            // InternalAngularDsl.g:4200:3: rule__Expresion__ReferenciaAssignment_2
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
    // InternalAngularDsl.g:4209:1: rule__Filtro__Group__0 : rule__Filtro__Group__0__Impl rule__Filtro__Group__1 ;
    public final void rule__Filtro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4213:1: ( rule__Filtro__Group__0__Impl rule__Filtro__Group__1 )
            // InternalAngularDsl.g:4214:2: rule__Filtro__Group__0__Impl rule__Filtro__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalAngularDsl.g:4221:1: rule__Filtro__Group__0__Impl : ( () ) ;
    public final void rule__Filtro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4225:1: ( ( () ) )
            // InternalAngularDsl.g:4226:1: ( () )
            {
            // InternalAngularDsl.g:4226:1: ( () )
            // InternalAngularDsl.g:4227:2: ()
            {
             before(grammarAccess.getFiltroAccess().getFiltroAction_0()); 
            // InternalAngularDsl.g:4228:2: ()
            // InternalAngularDsl.g:4228:3: 
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
    // InternalAngularDsl.g:4236:1: rule__Filtro__Group__1 : rule__Filtro__Group__1__Impl rule__Filtro__Group__2 ;
    public final void rule__Filtro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4240:1: ( rule__Filtro__Group__1__Impl rule__Filtro__Group__2 )
            // InternalAngularDsl.g:4241:2: rule__Filtro__Group__1__Impl rule__Filtro__Group__2
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
    // InternalAngularDsl.g:4248:1: rule__Filtro__Group__1__Impl : ( '|' ) ;
    public final void rule__Filtro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4252:1: ( ( '|' ) )
            // InternalAngularDsl.g:4253:1: ( '|' )
            {
            // InternalAngularDsl.g:4253:1: ( '|' )
            // InternalAngularDsl.g:4254:2: '|'
            {
             before(grammarAccess.getFiltroAccess().getVerticalLineKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalAngularDsl.g:4263:1: rule__Filtro__Group__2 : rule__Filtro__Group__2__Impl ;
    public final void rule__Filtro__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4267:1: ( rule__Filtro__Group__2__Impl )
            // InternalAngularDsl.g:4268:2: rule__Filtro__Group__2__Impl
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
    // InternalAngularDsl.g:4274:1: rule__Filtro__Group__2__Impl : ( ( rule__Filtro__ParametrosAssignment_2 ) ) ;
    public final void rule__Filtro__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4278:1: ( ( ( rule__Filtro__ParametrosAssignment_2 ) ) )
            // InternalAngularDsl.g:4279:1: ( ( rule__Filtro__ParametrosAssignment_2 ) )
            {
            // InternalAngularDsl.g:4279:1: ( ( rule__Filtro__ParametrosAssignment_2 ) )
            // InternalAngularDsl.g:4280:2: ( rule__Filtro__ParametrosAssignment_2 )
            {
             before(grammarAccess.getFiltroAccess().getParametrosAssignment_2()); 
            // InternalAngularDsl.g:4281:2: ( rule__Filtro__ParametrosAssignment_2 )
            // InternalAngularDsl.g:4281:3: rule__Filtro__ParametrosAssignment_2
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
    // InternalAngularDsl.g:4290:1: rule__AppAngular__ModulosAssignment_0 : ( ruleModulo ) ;
    public final void rule__AppAngular__ModulosAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4294:1: ( ( ruleModulo ) )
            // InternalAngularDsl.g:4295:2: ( ruleModulo )
            {
            // InternalAngularDsl.g:4295:2: ( ruleModulo )
            // InternalAngularDsl.g:4296:3: ruleModulo
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
    // InternalAngularDsl.g:4305:1: rule__AppAngular__ComponentesAssignment_1 : ( ruleComponente ) ;
    public final void rule__AppAngular__ComponentesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4309:1: ( ( ruleComponente ) )
            // InternalAngularDsl.g:4310:2: ( ruleComponente )
            {
            // InternalAngularDsl.g:4310:2: ( ruleComponente )
            // InternalAngularDsl.g:4311:3: ruleComponente
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
    // InternalAngularDsl.g:4320:1: rule__AppAngular__ServicesAssignment_2 : ( ruleService ) ;
    public final void rule__AppAngular__ServicesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4324:1: ( ( ruleService ) )
            // InternalAngularDsl.g:4325:2: ( ruleService )
            {
            // InternalAngularDsl.g:4325:2: ( ruleService )
            // InternalAngularDsl.g:4326:3: ruleService
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
    // InternalAngularDsl.g:4335:1: rule__AppAngular__TemplatesAssignment_3 : ( ruleTemplate ) ;
    public final void rule__AppAngular__TemplatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4339:1: ( ( ruleTemplate ) )
            // InternalAngularDsl.g:4340:2: ( ruleTemplate )
            {
            // InternalAngularDsl.g:4340:2: ( ruleTemplate )
            // InternalAngularDsl.g:4341:3: ruleTemplate
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
    // InternalAngularDsl.g:4350:1: rule__Modulo__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__Modulo__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4354:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:4355:2: ( ruleEString )
            {
            // InternalAngularDsl.g:4355:2: ( ruleEString )
            // InternalAngularDsl.g:4356:3: ruleEString
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
    // InternalAngularDsl.g:4365:1: rule__Modulo__ParametrosAssignment_9_0 : ( ( ruleEString ) ) ;
    public final void rule__Modulo__ParametrosAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4369:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:4370:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:4370:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:4371:3: ( ruleEString )
            {
             before(grammarAccess.getModuloAccess().getParametrosObjetoAngularCrossReference_9_0_0()); 
            // InternalAngularDsl.g:4372:3: ( ruleEString )
            // InternalAngularDsl.g:4373:4: ruleEString
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
    // InternalAngularDsl.g:4384:1: rule__Modulo__ParametrosAssignment_9_1_1 : ( ( ruleEString ) ) ;
    public final void rule__Modulo__ParametrosAssignment_9_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4388:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:4389:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:4389:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:4390:3: ( ruleEString )
            {
             before(grammarAccess.getModuloAccess().getParametrosObjetoAngularCrossReference_9_1_1_0()); 
            // InternalAngularDsl.g:4391:3: ( ruleEString )
            // InternalAngularDsl.g:4392:4: ruleEString
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
    // InternalAngularDsl.g:4403:1: rule__Service__ModuloAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Service__ModuloAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4407:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:4408:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:4408:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:4409:3: ( ruleEString )
            {
             before(grammarAccess.getServiceAccess().getModuloModuloCrossReference_6_0()); 
            // InternalAngularDsl.g:4410:3: ( ruleEString )
            // InternalAngularDsl.g:4411:4: ruleEString
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
    // InternalAngularDsl.g:4422:1: rule__Service__NameAssignment_11 : ( ruleEString ) ;
    public final void rule__Service__NameAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4426:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:4427:2: ( ruleEString )
            {
            // InternalAngularDsl.g:4427:2: ( ruleEString )
            // InternalAngularDsl.g:4428:3: ruleEString
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
    // InternalAngularDsl.g:4437:1: rule__Service__ParametrosAssignment_14_0 : ( ( ruleEString ) ) ;
    public final void rule__Service__ParametrosAssignment_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4441:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:4442:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:4442:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:4443:3: ( ruleEString )
            {
             before(grammarAccess.getServiceAccess().getParametrosObjetoAngularCrossReference_14_0_0()); 
            // InternalAngularDsl.g:4444:3: ( ruleEString )
            // InternalAngularDsl.g:4445:4: ruleEString
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
    // InternalAngularDsl.g:4456:1: rule__Service__ParametrosAssignment_14_1_1 : ( ( ruleEString ) ) ;
    public final void rule__Service__ParametrosAssignment_14_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4460:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:4461:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:4461:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:4462:3: ( ruleEString )
            {
             before(grammarAccess.getServiceAccess().getParametrosObjetoAngularCrossReference_14_1_1_0()); 
            // InternalAngularDsl.g:4463:3: ( ruleEString )
            // InternalAngularDsl.g:4464:4: ruleEString
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
    // InternalAngularDsl.g:4475:1: rule__Service__FuncionAssignment_16 : ( ruleFuncion ) ;
    public final void rule__Service__FuncionAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4479:1: ( ( ruleFuncion ) )
            // InternalAngularDsl.g:4480:2: ( ruleFuncion )
            {
            // InternalAngularDsl.g:4480:2: ( ruleFuncion )
            // InternalAngularDsl.g:4481:3: ruleFuncion
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
    // InternalAngularDsl.g:4490:1: rule__Componente__ModuloAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Componente__ModuloAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4494:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:4495:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:4495:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:4496:3: ( ruleEString )
            {
             before(grammarAccess.getComponenteAccess().getModuloModuloCrossReference_6_0()); 
            // InternalAngularDsl.g:4497:3: ( ruleEString )
            // InternalAngularDsl.g:4498:4: ruleEString
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
    // InternalAngularDsl.g:4509:1: rule__Componente__NameAssignment_11 : ( ruleEString ) ;
    public final void rule__Componente__NameAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4513:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:4514:2: ( ruleEString )
            {
            // InternalAngularDsl.g:4514:2: ( ruleEString )
            // InternalAngularDsl.g:4515:3: ruleEString
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
    // InternalAngularDsl.g:4524:1: rule__Componente__TemplateAssignment_16 : ( ( ruleEString ) ) ;
    public final void rule__Componente__TemplateAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4528:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:4529:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:4529:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:4530:3: ( ruleEString )
            {
             before(grammarAccess.getComponenteAccess().getTemplateTemplateCrossReference_16_0()); 
            // InternalAngularDsl.g:4531:3: ( ruleEString )
            // InternalAngularDsl.g:4532:4: ruleEString
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
    // InternalAngularDsl.g:4543:1: rule__Componente__ParametrosAssignment_21_0 : ( ( ruleEString ) ) ;
    public final void rule__Componente__ParametrosAssignment_21_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4547:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:4548:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:4548:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:4549:3: ( ruleEString )
            {
             before(grammarAccess.getComponenteAccess().getParametrosObjetoAngularCrossReference_21_0_0()); 
            // InternalAngularDsl.g:4550:3: ( ruleEString )
            // InternalAngularDsl.g:4551:4: ruleEString
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
    // InternalAngularDsl.g:4562:1: rule__Componente__ParametrosAssignment_21_1_1 : ( ( ruleEString ) ) ;
    public final void rule__Componente__ParametrosAssignment_21_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4566:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:4567:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:4567:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:4568:3: ( ruleEString )
            {
             before(grammarAccess.getComponenteAccess().getParametrosObjetoAngularCrossReference_21_1_1_0()); 
            // InternalAngularDsl.g:4569:3: ( ruleEString )
            // InternalAngularDsl.g:4570:4: ruleEString
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
    // InternalAngularDsl.g:4581:1: rule__Componente__FuncionAssignment_23 : ( ruleFuncion ) ;
    public final void rule__Componente__FuncionAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4585:1: ( ( ruleFuncion ) )
            // InternalAngularDsl.g:4586:2: ( ruleFuncion )
            {
            // InternalAngularDsl.g:4586:2: ( ruleFuncion )
            // InternalAngularDsl.g:4587:3: ruleFuncion
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
    // InternalAngularDsl.g:4596:1: rule__Funcion__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Funcion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4600:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:4601:2: ( ruleEString )
            {
            // InternalAngularDsl.g:4601:2: ( ruleEString )
            // InternalAngularDsl.g:4602:3: ruleEString
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
    // InternalAngularDsl.g:4611:1: rule__Funcion__ParametrosAssignment_4 : ( ruleEString ) ;
    public final void rule__Funcion__ParametrosAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4615:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:4616:2: ( ruleEString )
            {
            // InternalAngularDsl.g:4616:2: ( ruleEString )
            // InternalAngularDsl.g:4617:3: ruleEString
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
    // InternalAngularDsl.g:4626:1: rule__Funcion__VariablesAssignment_7 : ( ruleVariable ) ;
    public final void rule__Funcion__VariablesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4630:1: ( ( ruleVariable ) )
            // InternalAngularDsl.g:4631:2: ( ruleVariable )
            {
            // InternalAngularDsl.g:4631:2: ( ruleVariable )
            // InternalAngularDsl.g:4632:3: ruleVariable
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
    // InternalAngularDsl.g:4641:1: rule__Funcion__BodyAssignment_8 : ( ruleEString ) ;
    public final void rule__Funcion__BodyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4645:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:4646:2: ( ruleEString )
            {
            // InternalAngularDsl.g:4646:2: ( ruleEString )
            // InternalAngularDsl.g:4647:3: ruleEString
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


    // $ANTLR start "rule__Variable__NameAssignment_2"
    // InternalAngularDsl.g:4656:1: rule__Variable__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Variable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4660:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:4661:2: ( ruleEString )
            {
            // InternalAngularDsl.g:4661:2: ( ruleEString )
            // InternalAngularDsl.g:4662:3: ruleEString
            {
             before(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Variable__NameAssignment_2"


    // $ANTLR start "rule__Variable__ValorAssignment_4"
    // InternalAngularDsl.g:4671:1: rule__Variable__ValorAssignment_4 : ( ruleEString ) ;
    public final void rule__Variable__ValorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4675:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:4676:2: ( ruleEString )
            {
            // InternalAngularDsl.g:4676:2: ( ruleEString )
            // InternalAngularDsl.g:4677:3: ruleEString
            {
             before(grammarAccess.getVariableAccess().getValorEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getValorEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Variable__ValorAssignment_4"


    // $ANTLR start "rule__Template__NameAssignment_1"
    // InternalAngularDsl.g:4686:1: rule__Template__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Template__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4690:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:4691:2: ( ruleEString )
            {
            // InternalAngularDsl.g:4691:2: ( ruleEString )
            // InternalAngularDsl.g:4692:3: ruleEString
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
    // InternalAngularDsl.g:4701:1: rule__Template__SentenciashtmlAssignment_3 : ( ruleSentenciaHTML ) ;
    public final void rule__Template__SentenciashtmlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4705:1: ( ( ruleSentenciaHTML ) )
            // InternalAngularDsl.g:4706:2: ( ruleSentenciaHTML )
            {
            // InternalAngularDsl.g:4706:2: ( ruleSentenciaHTML )
            // InternalAngularDsl.g:4707:3: ruleSentenciaHTML
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
    // InternalAngularDsl.g:4716:1: rule__SentenciaHTML__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SentenciaHTML__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4720:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:4721:2: ( ruleEString )
            {
            // InternalAngularDsl.g:4721:2: ( ruleEString )
            // InternalAngularDsl.g:4722:3: ruleEString
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
    // InternalAngularDsl.g:4731:1: rule__SentenciaHTML__PropiedadesAssignment_3 : ( rulePropiedad ) ;
    public final void rule__SentenciaHTML__PropiedadesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4735:1: ( ( rulePropiedad ) )
            // InternalAngularDsl.g:4736:2: ( rulePropiedad )
            {
            // InternalAngularDsl.g:4736:2: ( rulePropiedad )
            // InternalAngularDsl.g:4737:3: rulePropiedad
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
    // InternalAngularDsl.g:4746:1: rule__SentenciaHTML__DirectivasAssignment_4 : ( ruleDirectiva ) ;
    public final void rule__SentenciaHTML__DirectivasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4750:1: ( ( ruleDirectiva ) )
            // InternalAngularDsl.g:4751:2: ( ruleDirectiva )
            {
            // InternalAngularDsl.g:4751:2: ( ruleDirectiva )
            // InternalAngularDsl.g:4752:3: ruleDirectiva
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
    // InternalAngularDsl.g:4761:1: rule__SentenciaHTML__CurlybracesAssignment_7 : ( ruleCurlyBraces ) ;
    public final void rule__SentenciaHTML__CurlybracesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4765:1: ( ( ruleCurlyBraces ) )
            // InternalAngularDsl.g:4766:2: ( ruleCurlyBraces )
            {
            // InternalAngularDsl.g:4766:2: ( ruleCurlyBraces )
            // InternalAngularDsl.g:4767:3: ruleCurlyBraces
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
    // InternalAngularDsl.g:4776:1: rule__SentenciaHTML__SentenciashtmlAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__SentenciaHTML__SentenciashtmlAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4780:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:4781:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:4781:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:4782:3: ( ruleEString )
            {
             before(grammarAccess.getSentenciaHTMLAccess().getSentenciashtmlSentenciaHTMLCrossReference_8_0()); 
            // InternalAngularDsl.g:4783:3: ( ruleEString )
            // InternalAngularDsl.g:4784:4: ruleEString
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
    // InternalAngularDsl.g:4795:1: rule__Directiva__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Directiva__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4799:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:4800:2: ( ruleEString )
            {
            // InternalAngularDsl.g:4800:2: ( ruleEString )
            // InternalAngularDsl.g:4801:3: ruleEString
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
    // InternalAngularDsl.g:4810:1: rule__Directiva__CurlybracesAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Directiva__CurlybracesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4814:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:4815:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:4815:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:4816:3: ( ruleEString )
            {
             before(grammarAccess.getDirectivaAccess().getCurlybracesCurlyBracesCrossReference_4_0()); 
            // InternalAngularDsl.g:4817:3: ( ruleEString )
            // InternalAngularDsl.g:4818:4: ruleEString
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
    // InternalAngularDsl.g:4829:1: rule__Directiva__ReferenciaAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Directiva__ReferenciaAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4833:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:4834:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:4834:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:4835:3: ( ruleEString )
            {
             before(grammarAccess.getDirectivaAccess().getReferenciaObjetoAngularCrossReference_5_0()); 
            // InternalAngularDsl.g:4836:3: ( ruleEString )
            // InternalAngularDsl.g:4837:4: ruleEString
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
    // InternalAngularDsl.g:4848:1: rule__Propiedad__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Propiedad__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4852:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:4853:2: ( ruleEString )
            {
            // InternalAngularDsl.g:4853:2: ( ruleEString )
            // InternalAngularDsl.g:4854:3: ruleEString
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


    // $ANTLR start "rule__CurlyBraces__ExpresionAssignment_2"
    // InternalAngularDsl.g:4863:1: rule__CurlyBraces__ExpresionAssignment_2 : ( ruleExpresion ) ;
    public final void rule__CurlyBraces__ExpresionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4867:1: ( ( ruleExpresion ) )
            // InternalAngularDsl.g:4868:2: ( ruleExpresion )
            {
            // InternalAngularDsl.g:4868:2: ( ruleExpresion )
            // InternalAngularDsl.g:4869:3: ruleExpresion
            {
             before(grammarAccess.getCurlyBracesAccess().getExpresionExpresionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getCurlyBracesAccess().getExpresionExpresionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__CurlyBraces__ExpresionAssignment_2"


    // $ANTLR start "rule__CurlyBraces__FiltroAssignment_3"
    // InternalAngularDsl.g:4878:1: rule__CurlyBraces__FiltroAssignment_3 : ( ruleFiltro ) ;
    public final void rule__CurlyBraces__FiltroAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4882:1: ( ( ruleFiltro ) )
            // InternalAngularDsl.g:4883:2: ( ruleFiltro )
            {
            // InternalAngularDsl.g:4883:2: ( ruleFiltro )
            // InternalAngularDsl.g:4884:3: ruleFiltro
            {
             before(grammarAccess.getCurlyBracesAccess().getFiltroFiltroParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFiltro();

            state._fsp--;

             after(grammarAccess.getCurlyBracesAccess().getFiltroFiltroParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__CurlyBraces__FiltroAssignment_3"


    // $ANTLR start "rule__Expresion__ValorAssignment_1"
    // InternalAngularDsl.g:4893:1: rule__Expresion__ValorAssignment_1 : ( ruleEString ) ;
    public final void rule__Expresion__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4897:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:4898:2: ( ruleEString )
            {
            // InternalAngularDsl.g:4898:2: ( ruleEString )
            // InternalAngularDsl.g:4899:3: ruleEString
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
    // InternalAngularDsl.g:4908:1: rule__Expresion__ReferenciaAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Expresion__ReferenciaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4912:1: ( ( ( ruleEString ) ) )
            // InternalAngularDsl.g:4913:2: ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:4913:2: ( ( ruleEString ) )
            // InternalAngularDsl.g:4914:3: ( ruleEString )
            {
             before(grammarAccess.getExpresionAccess().getReferenciaObjetoAngularCrossReference_2_0()); 
            // InternalAngularDsl.g:4915:3: ( ruleEString )
            // InternalAngularDsl.g:4916:4: ruleEString
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
    // InternalAngularDsl.g:4927:1: rule__Filtro__ParametrosAssignment_2 : ( ruleEString ) ;
    public final void rule__Filtro__ParametrosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAngularDsl.g:4931:1: ( ( ruleEString ) )
            // InternalAngularDsl.g:4932:2: ( ruleEString )
            {
            // InternalAngularDsl.g:4932:2: ( ruleEString )
            // InternalAngularDsl.g:4933:3: ruleEString
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
    static final String dfa_3s = "\1\17\1\20\1\7\1\uffff\1\21\1\10\1\17\1\11\1\16\1\5\1\6\2\15\1\uffff\1\7\1\36\2\uffff";
    static final String dfa_4s = "\3\uffff\1\4\11\uffff\1\1\2\uffff\1\3\1\2";
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
            "\1\21\13\uffff\1\20",
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
            return "402:1: rule__AppAngular__Alternatives : ( ( ( rule__AppAngular__ModulosAssignment_0 ) ) | ( ( rule__AppAngular__ComponentesAssignment_1 ) ) | ( ( rule__AppAngular__ServicesAssignment_2 ) ) | ( ( rule__AppAngular__TemplatesAssignment_3 ) ) );";
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
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000430L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000005800000030L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000A000000030L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000020000000000L});

}