package co.edu.uniandes.angular.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.edu.uniandes.angular.services.AngularDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAngularDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMILLAS", "RULE_USE", "RULE_STRICT", "RULE_PUNTO_Y_COMA", "RULE_ANGULAR", "RULE_PUNTO", "RULE_MODULE", "RULE_PARENTESIS_IZQUIERDO", "RULE_COMA", "RULE_PARENTESIS_CUADRADO_IZQUIERDO", "RULE_PARENTESIS_CUADRADO_DERECHO", "RULE_PARENTESIS_DERECHO", "RULE_COMPONENT", "RULE_LLAVE_IZQUIERDA", "RULE_TEMPLATE_URL", "RULE_DOS_PUNTOS", "RULE_CONTROLLER", "RULE_LLAVE_DERECHA", "RULE_FUNCTION", "RULE_VAR", "RULE_IGUAL", "RULE_MENOR_QUE", "RULE_SLASH", "RULE_MAYOR_QUE", "RULE_STRING", "RULE_DOBLE_LLAVE_IZQUIERDA", "RULE_DOBLE_LLAVE_DERECHA", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'factory'", "'*'", "'ng-'", "'$'", "'|'"
    };
    public static final int RULE_LLAVE_IZQUIERDA=17;
    public static final int RULE_COMA=12;
    public static final int RULE_FUNCTION=22;
    public static final int RULE_TEMPLATE_URL=18;
    public static final int RULE_CONTROLLER=20;
    public static final int RULE_PARENTESIS_CUADRADO_IZQUIERDO=13;
    public static final int RULE_PARENTESIS_DERECHO=15;
    public static final int RULE_STRING=28;
    public static final int RULE_COMILLAS=4;
    public static final int RULE_COMPONENT=16;
    public static final int RULE_SL_COMMENT=34;
    public static final int RULE_STRICT=6;
    public static final int T__37=37;
    public static final int RULE_PUNTO_Y_COMA=7;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int EOF=-1;
    public static final int RULE_USE=5;
    public static final int RULE_MENOR_QUE=25;
    public static final int RULE_DOBLE_LLAVE_IZQUIERDA=29;
    public static final int RULE_ID=31;
    public static final int RULE_PARENTESIS_IZQUIERDO=11;
    public static final int RULE_WS=35;
    public static final int RULE_ANY_OTHER=36;
    public static final int RULE_SLASH=26;
    public static final int RULE_PUNTO=9;
    public static final int RULE_DOS_PUNTOS=19;
    public static final int RULE_IGUAL=24;
    public static final int RULE_DOBLE_LLAVE_DERECHA=30;
    public static final int RULE_INT=32;
    public static final int RULE_PARENTESIS_CUADRADO_DERECHO=14;
    public static final int RULE_ML_COMMENT=33;
    public static final int RULE_LLAVE_DERECHA=21;
    public static final int RULE_ANGULAR=8;
    public static final int RULE_MODULE=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_MAYOR_QUE=27;
    public static final int RULE_VAR=23;

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

        public InternalAngularDslParser(TokenStream input, AngularDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AppAngular";
       	}

       	@Override
       	protected AngularDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAppAngular"
    // InternalAngularDsl.g:64:1: entryRuleAppAngular returns [EObject current=null] : iv_ruleAppAngular= ruleAppAngular EOF ;
    public final EObject entryRuleAppAngular() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppAngular = null;


        try {
            // InternalAngularDsl.g:64:51: (iv_ruleAppAngular= ruleAppAngular EOF )
            // InternalAngularDsl.g:65:2: iv_ruleAppAngular= ruleAppAngular EOF
            {
             newCompositeNode(grammarAccess.getAppAngularRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppAngular=ruleAppAngular();

            state._fsp--;

             current =iv_ruleAppAngular; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAppAngular"


    // $ANTLR start "ruleAppAngular"
    // InternalAngularDsl.g:71:1: ruleAppAngular returns [EObject current=null] : ( ( (lv_modulos_0_0= ruleModulo ) ) | ( (lv_componentes_1_0= ruleComponente ) ) | ( (lv_services_2_0= ruleService ) ) | ( (lv_templates_3_0= ruleTemplate ) ) ) ;
    public final EObject ruleAppAngular() throws RecognitionException {
        EObject current = null;

        EObject lv_modulos_0_0 = null;

        EObject lv_componentes_1_0 = null;

        EObject lv_services_2_0 = null;

        EObject lv_templates_3_0 = null;



        	enterRule();

        try {
            // InternalAngularDsl.g:77:2: ( ( ( (lv_modulos_0_0= ruleModulo ) ) | ( (lv_componentes_1_0= ruleComponente ) ) | ( (lv_services_2_0= ruleService ) ) | ( (lv_templates_3_0= ruleTemplate ) ) ) )
            // InternalAngularDsl.g:78:2: ( ( (lv_modulos_0_0= ruleModulo ) ) | ( (lv_componentes_1_0= ruleComponente ) ) | ( (lv_services_2_0= ruleService ) ) | ( (lv_templates_3_0= ruleTemplate ) ) )
            {
            // InternalAngularDsl.g:78:2: ( ( (lv_modulos_0_0= ruleModulo ) ) | ( (lv_componentes_1_0= ruleComponente ) ) | ( (lv_services_2_0= ruleService ) ) | ( (lv_templates_3_0= ruleTemplate ) ) )
            int alt1=4;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalAngularDsl.g:79:3: ( (lv_modulos_0_0= ruleModulo ) )
                    {
                    // InternalAngularDsl.g:79:3: ( (lv_modulos_0_0= ruleModulo ) )
                    // InternalAngularDsl.g:80:4: (lv_modulos_0_0= ruleModulo )
                    {
                    // InternalAngularDsl.g:80:4: (lv_modulos_0_0= ruleModulo )
                    // InternalAngularDsl.g:81:5: lv_modulos_0_0= ruleModulo
                    {

                    					newCompositeNode(grammarAccess.getAppAngularAccess().getModulosModuloParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_modulos_0_0=ruleModulo();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAppAngularRule());
                    					}
                    					add(
                    						current,
                    						"modulos",
                    						lv_modulos_0_0,
                    						"co.edu.uniandes.angular.AngularDsl.Modulo");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAngularDsl.g:99:3: ( (lv_componentes_1_0= ruleComponente ) )
                    {
                    // InternalAngularDsl.g:99:3: ( (lv_componentes_1_0= ruleComponente ) )
                    // InternalAngularDsl.g:100:4: (lv_componentes_1_0= ruleComponente )
                    {
                    // InternalAngularDsl.g:100:4: (lv_componentes_1_0= ruleComponente )
                    // InternalAngularDsl.g:101:5: lv_componentes_1_0= ruleComponente
                    {

                    					newCompositeNode(grammarAccess.getAppAngularAccess().getComponentesComponenteParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_componentes_1_0=ruleComponente();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAppAngularRule());
                    					}
                    					add(
                    						current,
                    						"componentes",
                    						lv_componentes_1_0,
                    						"co.edu.uniandes.angular.AngularDsl.Componente");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAngularDsl.g:119:3: ( (lv_services_2_0= ruleService ) )
                    {
                    // InternalAngularDsl.g:119:3: ( (lv_services_2_0= ruleService ) )
                    // InternalAngularDsl.g:120:4: (lv_services_2_0= ruleService )
                    {
                    // InternalAngularDsl.g:120:4: (lv_services_2_0= ruleService )
                    // InternalAngularDsl.g:121:5: lv_services_2_0= ruleService
                    {

                    					newCompositeNode(grammarAccess.getAppAngularAccess().getServicesServiceParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_services_2_0=ruleService();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAppAngularRule());
                    					}
                    					add(
                    						current,
                    						"services",
                    						lv_services_2_0,
                    						"co.edu.uniandes.angular.AngularDsl.Service");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAngularDsl.g:139:3: ( (lv_templates_3_0= ruleTemplate ) )
                    {
                    // InternalAngularDsl.g:139:3: ( (lv_templates_3_0= ruleTemplate ) )
                    // InternalAngularDsl.g:140:4: (lv_templates_3_0= ruleTemplate )
                    {
                    // InternalAngularDsl.g:140:4: (lv_templates_3_0= ruleTemplate )
                    // InternalAngularDsl.g:141:5: lv_templates_3_0= ruleTemplate
                    {

                    					newCompositeNode(grammarAccess.getAppAngularAccess().getTemplatesTemplateParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_templates_3_0=ruleTemplate();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAppAngularRule());
                    					}
                    					add(
                    						current,
                    						"templates",
                    						lv_templates_3_0,
                    						"co.edu.uniandes.angular.AngularDsl.Template");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAppAngular"


    // $ANTLR start "entryRuleModulo"
    // InternalAngularDsl.g:162:1: entryRuleModulo returns [EObject current=null] : iv_ruleModulo= ruleModulo EOF ;
    public final EObject entryRuleModulo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulo = null;


        try {
            // InternalAngularDsl.g:162:47: (iv_ruleModulo= ruleModulo EOF )
            // InternalAngularDsl.g:163:2: iv_ruleModulo= ruleModulo EOF
            {
             newCompositeNode(grammarAccess.getModuloRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModulo=ruleModulo();

            state._fsp--;

             current =iv_ruleModulo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModulo"


    // $ANTLR start "ruleModulo"
    // InternalAngularDsl.g:169:1: ruleModulo returns [EObject current=null] : ( () (this_COMILLAS_1= RULE_COMILLAS this_USE_2= RULE_USE this_STRICT_3= RULE_STRICT this_COMILLAS_4= RULE_COMILLAS this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA )? this_ANGULAR_6= RULE_ANGULAR this_PUNTO_7= RULE_PUNTO this_MODULE_8= RULE_MODULE this_PARENTESIS_IZQUIERDO_9= RULE_PARENTESIS_IZQUIERDO ( (lv_name_10_0= ruleEString ) ) this_COMA_11= RULE_COMA this_PARENTESIS_CUADRADO_IZQUIERDO_12= RULE_PARENTESIS_CUADRADO_IZQUIERDO ( ( ( ruleEString ) ) (this_COMA_14= RULE_COMA ( ( ruleEString ) ) )* )* this_PARENTESIS_CUADRADO_DERECHO_16= RULE_PARENTESIS_CUADRADO_DERECHO this_PARENTESIS_DERECHO_17= RULE_PARENTESIS_DERECHO this_PUNTO_Y_COMA_18= RULE_PUNTO_Y_COMA ) ;
    public final EObject ruleModulo() throws RecognitionException {
        EObject current = null;

        Token this_COMILLAS_1=null;
        Token this_USE_2=null;
        Token this_STRICT_3=null;
        Token this_COMILLAS_4=null;
        Token this_PUNTO_Y_COMA_5=null;
        Token this_ANGULAR_6=null;
        Token this_PUNTO_7=null;
        Token this_MODULE_8=null;
        Token this_PARENTESIS_IZQUIERDO_9=null;
        Token this_COMA_11=null;
        Token this_PARENTESIS_CUADRADO_IZQUIERDO_12=null;
        Token this_COMA_14=null;
        Token this_PARENTESIS_CUADRADO_DERECHO_16=null;
        Token this_PARENTESIS_DERECHO_17=null;
        Token this_PUNTO_Y_COMA_18=null;
        AntlrDatatypeRuleToken lv_name_10_0 = null;



        	enterRule();

        try {
            // InternalAngularDsl.g:175:2: ( ( () (this_COMILLAS_1= RULE_COMILLAS this_USE_2= RULE_USE this_STRICT_3= RULE_STRICT this_COMILLAS_4= RULE_COMILLAS this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA )? this_ANGULAR_6= RULE_ANGULAR this_PUNTO_7= RULE_PUNTO this_MODULE_8= RULE_MODULE this_PARENTESIS_IZQUIERDO_9= RULE_PARENTESIS_IZQUIERDO ( (lv_name_10_0= ruleEString ) ) this_COMA_11= RULE_COMA this_PARENTESIS_CUADRADO_IZQUIERDO_12= RULE_PARENTESIS_CUADRADO_IZQUIERDO ( ( ( ruleEString ) ) (this_COMA_14= RULE_COMA ( ( ruleEString ) ) )* )* this_PARENTESIS_CUADRADO_DERECHO_16= RULE_PARENTESIS_CUADRADO_DERECHO this_PARENTESIS_DERECHO_17= RULE_PARENTESIS_DERECHO this_PUNTO_Y_COMA_18= RULE_PUNTO_Y_COMA ) )
            // InternalAngularDsl.g:176:2: ( () (this_COMILLAS_1= RULE_COMILLAS this_USE_2= RULE_USE this_STRICT_3= RULE_STRICT this_COMILLAS_4= RULE_COMILLAS this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA )? this_ANGULAR_6= RULE_ANGULAR this_PUNTO_7= RULE_PUNTO this_MODULE_8= RULE_MODULE this_PARENTESIS_IZQUIERDO_9= RULE_PARENTESIS_IZQUIERDO ( (lv_name_10_0= ruleEString ) ) this_COMA_11= RULE_COMA this_PARENTESIS_CUADRADO_IZQUIERDO_12= RULE_PARENTESIS_CUADRADO_IZQUIERDO ( ( ( ruleEString ) ) (this_COMA_14= RULE_COMA ( ( ruleEString ) ) )* )* this_PARENTESIS_CUADRADO_DERECHO_16= RULE_PARENTESIS_CUADRADO_DERECHO this_PARENTESIS_DERECHO_17= RULE_PARENTESIS_DERECHO this_PUNTO_Y_COMA_18= RULE_PUNTO_Y_COMA )
            {
            // InternalAngularDsl.g:176:2: ( () (this_COMILLAS_1= RULE_COMILLAS this_USE_2= RULE_USE this_STRICT_3= RULE_STRICT this_COMILLAS_4= RULE_COMILLAS this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA )? this_ANGULAR_6= RULE_ANGULAR this_PUNTO_7= RULE_PUNTO this_MODULE_8= RULE_MODULE this_PARENTESIS_IZQUIERDO_9= RULE_PARENTESIS_IZQUIERDO ( (lv_name_10_0= ruleEString ) ) this_COMA_11= RULE_COMA this_PARENTESIS_CUADRADO_IZQUIERDO_12= RULE_PARENTESIS_CUADRADO_IZQUIERDO ( ( ( ruleEString ) ) (this_COMA_14= RULE_COMA ( ( ruleEString ) ) )* )* this_PARENTESIS_CUADRADO_DERECHO_16= RULE_PARENTESIS_CUADRADO_DERECHO this_PARENTESIS_DERECHO_17= RULE_PARENTESIS_DERECHO this_PUNTO_Y_COMA_18= RULE_PUNTO_Y_COMA )
            // InternalAngularDsl.g:177:3: () (this_COMILLAS_1= RULE_COMILLAS this_USE_2= RULE_USE this_STRICT_3= RULE_STRICT this_COMILLAS_4= RULE_COMILLAS this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA )? this_ANGULAR_6= RULE_ANGULAR this_PUNTO_7= RULE_PUNTO this_MODULE_8= RULE_MODULE this_PARENTESIS_IZQUIERDO_9= RULE_PARENTESIS_IZQUIERDO ( (lv_name_10_0= ruleEString ) ) this_COMA_11= RULE_COMA this_PARENTESIS_CUADRADO_IZQUIERDO_12= RULE_PARENTESIS_CUADRADO_IZQUIERDO ( ( ( ruleEString ) ) (this_COMA_14= RULE_COMA ( ( ruleEString ) ) )* )* this_PARENTESIS_CUADRADO_DERECHO_16= RULE_PARENTESIS_CUADRADO_DERECHO this_PARENTESIS_DERECHO_17= RULE_PARENTESIS_DERECHO this_PUNTO_Y_COMA_18= RULE_PUNTO_Y_COMA
            {
            // InternalAngularDsl.g:177:3: ()
            // InternalAngularDsl.g:178:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModuloAccess().getModuloAction_0(),
            					current);
            			

            }

            // InternalAngularDsl.g:184:3: (this_COMILLAS_1= RULE_COMILLAS this_USE_2= RULE_USE this_STRICT_3= RULE_STRICT this_COMILLAS_4= RULE_COMILLAS this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_COMILLAS) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAngularDsl.g:185:4: this_COMILLAS_1= RULE_COMILLAS this_USE_2= RULE_USE this_STRICT_3= RULE_STRICT this_COMILLAS_4= RULE_COMILLAS this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA
                    {
                    this_COMILLAS_1=(Token)match(input,RULE_COMILLAS,FOLLOW_3); 

                    				newLeafNode(this_COMILLAS_1, grammarAccess.getModuloAccess().getCOMILLASTerminalRuleCall_1_0());
                    			
                    this_USE_2=(Token)match(input,RULE_USE,FOLLOW_4); 

                    				newLeafNode(this_USE_2, grammarAccess.getModuloAccess().getUSETerminalRuleCall_1_1());
                    			
                    this_STRICT_3=(Token)match(input,RULE_STRICT,FOLLOW_5); 

                    				newLeafNode(this_STRICT_3, grammarAccess.getModuloAccess().getSTRICTTerminalRuleCall_1_2());
                    			
                    this_COMILLAS_4=(Token)match(input,RULE_COMILLAS,FOLLOW_6); 

                    				newLeafNode(this_COMILLAS_4, grammarAccess.getModuloAccess().getCOMILLASTerminalRuleCall_1_3());
                    			
                    this_PUNTO_Y_COMA_5=(Token)match(input,RULE_PUNTO_Y_COMA,FOLLOW_7); 

                    				newLeafNode(this_PUNTO_Y_COMA_5, grammarAccess.getModuloAccess().getPUNTO_Y_COMATerminalRuleCall_1_4());
                    			

                    }
                    break;

            }

            this_ANGULAR_6=(Token)match(input,RULE_ANGULAR,FOLLOW_8); 

            			newLeafNode(this_ANGULAR_6, grammarAccess.getModuloAccess().getANGULARTerminalRuleCall_2());
            		
            this_PUNTO_7=(Token)match(input,RULE_PUNTO,FOLLOW_9); 

            			newLeafNode(this_PUNTO_7, grammarAccess.getModuloAccess().getPUNTOTerminalRuleCall_3());
            		
            this_MODULE_8=(Token)match(input,RULE_MODULE,FOLLOW_10); 

            			newLeafNode(this_MODULE_8, grammarAccess.getModuloAccess().getMODULETerminalRuleCall_4());
            		
            this_PARENTESIS_IZQUIERDO_9=(Token)match(input,RULE_PARENTESIS_IZQUIERDO,FOLLOW_11); 

            			newLeafNode(this_PARENTESIS_IZQUIERDO_9, grammarAccess.getModuloAccess().getPARENTESIS_IZQUIERDOTerminalRuleCall_5());
            		
            // InternalAngularDsl.g:222:3: ( (lv_name_10_0= ruleEString ) )
            // InternalAngularDsl.g:223:4: (lv_name_10_0= ruleEString )
            {
            // InternalAngularDsl.g:223:4: (lv_name_10_0= ruleEString )
            // InternalAngularDsl.g:224:5: lv_name_10_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModuloAccess().getNameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_10_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModuloRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_10_0,
            						"co.edu.uniandes.angular.AngularDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMA_11=(Token)match(input,RULE_COMA,FOLLOW_13); 

            			newLeafNode(this_COMA_11, grammarAccess.getModuloAccess().getCOMATerminalRuleCall_7());
            		
            this_PARENTESIS_CUADRADO_IZQUIERDO_12=(Token)match(input,RULE_PARENTESIS_CUADRADO_IZQUIERDO,FOLLOW_14); 

            			newLeafNode(this_PARENTESIS_CUADRADO_IZQUIERDO_12, grammarAccess.getModuloAccess().getPARENTESIS_CUADRADO_IZQUIERDOTerminalRuleCall_8());
            		
            // InternalAngularDsl.g:249:3: ( ( ( ruleEString ) ) (this_COMA_14= RULE_COMA ( ( ruleEString ) ) )* )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING||LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAngularDsl.g:250:4: ( ( ruleEString ) ) (this_COMA_14= RULE_COMA ( ( ruleEString ) ) )*
            	    {
            	    // InternalAngularDsl.g:250:4: ( ( ruleEString ) )
            	    // InternalAngularDsl.g:251:5: ( ruleEString )
            	    {
            	    // InternalAngularDsl.g:251:5: ( ruleEString )
            	    // InternalAngularDsl.g:252:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getModuloRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getModuloAccess().getParametrosObjetoAngularCrossReference_9_0_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAngularDsl.g:266:4: (this_COMA_14= RULE_COMA ( ( ruleEString ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==RULE_COMA) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalAngularDsl.g:267:5: this_COMA_14= RULE_COMA ( ( ruleEString ) )
            	    	    {
            	    	    this_COMA_14=(Token)match(input,RULE_COMA,FOLLOW_11); 

            	    	    					newLeafNode(this_COMA_14, grammarAccess.getModuloAccess().getCOMATerminalRuleCall_9_1_0());
            	    	    				
            	    	    // InternalAngularDsl.g:271:5: ( ( ruleEString ) )
            	    	    // InternalAngularDsl.g:272:6: ( ruleEString )
            	    	    {
            	    	    // InternalAngularDsl.g:272:6: ( ruleEString )
            	    	    // InternalAngularDsl.g:273:7: ruleEString
            	    	    {

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getModuloRule());
            	    	    							}
            	    	    						

            	    	    							newCompositeNode(grammarAccess.getModuloAccess().getParametrosObjetoAngularCrossReference_9_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_15);
            	    	    ruleEString();

            	    	    state._fsp--;


            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            this_PARENTESIS_CUADRADO_DERECHO_16=(Token)match(input,RULE_PARENTESIS_CUADRADO_DERECHO,FOLLOW_16); 

            			newLeafNode(this_PARENTESIS_CUADRADO_DERECHO_16, grammarAccess.getModuloAccess().getPARENTESIS_CUADRADO_DERECHOTerminalRuleCall_10());
            		
            this_PARENTESIS_DERECHO_17=(Token)match(input,RULE_PARENTESIS_DERECHO,FOLLOW_6); 

            			newLeafNode(this_PARENTESIS_DERECHO_17, grammarAccess.getModuloAccess().getPARENTESIS_DERECHOTerminalRuleCall_11());
            		
            this_PUNTO_Y_COMA_18=(Token)match(input,RULE_PUNTO_Y_COMA,FOLLOW_2); 

            			newLeafNode(this_PUNTO_Y_COMA_18, grammarAccess.getModuloAccess().getPUNTO_Y_COMATerminalRuleCall_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModulo"


    // $ANTLR start "entryRuleService"
    // InternalAngularDsl.g:305:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalAngularDsl.g:305:48: (iv_ruleService= ruleService EOF )
            // InternalAngularDsl.g:306:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalAngularDsl.g:312:1: ruleService returns [EObject current=null] : ( () (this_COMILLAS_1= RULE_COMILLAS this_USE_2= RULE_USE this_STRICT_3= RULE_STRICT this_COMILLAS_4= RULE_COMILLAS this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA )? this_ANGULAR_6= RULE_ANGULAR this_PUNTO_7= RULE_PUNTO this_MODULE_8= RULE_MODULE this_PARENTESIS_IZQUIERDO_9= RULE_PARENTESIS_IZQUIERDO ( ( ruleEString ) ) this_PARENTESIS_DERECHO_11= RULE_PARENTESIS_DERECHO this_PUNTO_12= RULE_PUNTO otherlv_13= 'factory' this_PARENTESIS_IZQUIERDO_14= RULE_PARENTESIS_IZQUIERDO ( (lv_name_15_0= ruleEString ) ) this_COMA_16= RULE_COMA this_PARENTESIS_CUADRADO_IZQUIERDO_17= RULE_PARENTESIS_CUADRADO_IZQUIERDO ( ( ( ruleEString ) ) (this_COMA_19= RULE_COMA ( ( ruleEString ) ) )* )* this_COMA_21= RULE_COMA ( (lv_funcion_22_0= ruleFuncion ) ) this_PARENTESIS_CUADRADO_DERECHO_23= RULE_PARENTESIS_CUADRADO_DERECHO this_PARENTESIS_DERECHO_24= RULE_PARENTESIS_DERECHO this_PUNTO_Y_COMA_25= RULE_PUNTO_Y_COMA ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token this_COMILLAS_1=null;
        Token this_USE_2=null;
        Token this_STRICT_3=null;
        Token this_COMILLAS_4=null;
        Token this_PUNTO_Y_COMA_5=null;
        Token this_ANGULAR_6=null;
        Token this_PUNTO_7=null;
        Token this_MODULE_8=null;
        Token this_PARENTESIS_IZQUIERDO_9=null;
        Token this_PARENTESIS_DERECHO_11=null;
        Token this_PUNTO_12=null;
        Token otherlv_13=null;
        Token this_PARENTESIS_IZQUIERDO_14=null;
        Token this_COMA_16=null;
        Token this_PARENTESIS_CUADRADO_IZQUIERDO_17=null;
        Token this_COMA_19=null;
        Token this_COMA_21=null;
        Token this_PARENTESIS_CUADRADO_DERECHO_23=null;
        Token this_PARENTESIS_DERECHO_24=null;
        Token this_PUNTO_Y_COMA_25=null;
        AntlrDatatypeRuleToken lv_name_15_0 = null;

        EObject lv_funcion_22_0 = null;



        	enterRule();

        try {
            // InternalAngularDsl.g:318:2: ( ( () (this_COMILLAS_1= RULE_COMILLAS this_USE_2= RULE_USE this_STRICT_3= RULE_STRICT this_COMILLAS_4= RULE_COMILLAS this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA )? this_ANGULAR_6= RULE_ANGULAR this_PUNTO_7= RULE_PUNTO this_MODULE_8= RULE_MODULE this_PARENTESIS_IZQUIERDO_9= RULE_PARENTESIS_IZQUIERDO ( ( ruleEString ) ) this_PARENTESIS_DERECHO_11= RULE_PARENTESIS_DERECHO this_PUNTO_12= RULE_PUNTO otherlv_13= 'factory' this_PARENTESIS_IZQUIERDO_14= RULE_PARENTESIS_IZQUIERDO ( (lv_name_15_0= ruleEString ) ) this_COMA_16= RULE_COMA this_PARENTESIS_CUADRADO_IZQUIERDO_17= RULE_PARENTESIS_CUADRADO_IZQUIERDO ( ( ( ruleEString ) ) (this_COMA_19= RULE_COMA ( ( ruleEString ) ) )* )* this_COMA_21= RULE_COMA ( (lv_funcion_22_0= ruleFuncion ) ) this_PARENTESIS_CUADRADO_DERECHO_23= RULE_PARENTESIS_CUADRADO_DERECHO this_PARENTESIS_DERECHO_24= RULE_PARENTESIS_DERECHO this_PUNTO_Y_COMA_25= RULE_PUNTO_Y_COMA ) )
            // InternalAngularDsl.g:319:2: ( () (this_COMILLAS_1= RULE_COMILLAS this_USE_2= RULE_USE this_STRICT_3= RULE_STRICT this_COMILLAS_4= RULE_COMILLAS this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA )? this_ANGULAR_6= RULE_ANGULAR this_PUNTO_7= RULE_PUNTO this_MODULE_8= RULE_MODULE this_PARENTESIS_IZQUIERDO_9= RULE_PARENTESIS_IZQUIERDO ( ( ruleEString ) ) this_PARENTESIS_DERECHO_11= RULE_PARENTESIS_DERECHO this_PUNTO_12= RULE_PUNTO otherlv_13= 'factory' this_PARENTESIS_IZQUIERDO_14= RULE_PARENTESIS_IZQUIERDO ( (lv_name_15_0= ruleEString ) ) this_COMA_16= RULE_COMA this_PARENTESIS_CUADRADO_IZQUIERDO_17= RULE_PARENTESIS_CUADRADO_IZQUIERDO ( ( ( ruleEString ) ) (this_COMA_19= RULE_COMA ( ( ruleEString ) ) )* )* this_COMA_21= RULE_COMA ( (lv_funcion_22_0= ruleFuncion ) ) this_PARENTESIS_CUADRADO_DERECHO_23= RULE_PARENTESIS_CUADRADO_DERECHO this_PARENTESIS_DERECHO_24= RULE_PARENTESIS_DERECHO this_PUNTO_Y_COMA_25= RULE_PUNTO_Y_COMA )
            {
            // InternalAngularDsl.g:319:2: ( () (this_COMILLAS_1= RULE_COMILLAS this_USE_2= RULE_USE this_STRICT_3= RULE_STRICT this_COMILLAS_4= RULE_COMILLAS this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA )? this_ANGULAR_6= RULE_ANGULAR this_PUNTO_7= RULE_PUNTO this_MODULE_8= RULE_MODULE this_PARENTESIS_IZQUIERDO_9= RULE_PARENTESIS_IZQUIERDO ( ( ruleEString ) ) this_PARENTESIS_DERECHO_11= RULE_PARENTESIS_DERECHO this_PUNTO_12= RULE_PUNTO otherlv_13= 'factory' this_PARENTESIS_IZQUIERDO_14= RULE_PARENTESIS_IZQUIERDO ( (lv_name_15_0= ruleEString ) ) this_COMA_16= RULE_COMA this_PARENTESIS_CUADRADO_IZQUIERDO_17= RULE_PARENTESIS_CUADRADO_IZQUIERDO ( ( ( ruleEString ) ) (this_COMA_19= RULE_COMA ( ( ruleEString ) ) )* )* this_COMA_21= RULE_COMA ( (lv_funcion_22_0= ruleFuncion ) ) this_PARENTESIS_CUADRADO_DERECHO_23= RULE_PARENTESIS_CUADRADO_DERECHO this_PARENTESIS_DERECHO_24= RULE_PARENTESIS_DERECHO this_PUNTO_Y_COMA_25= RULE_PUNTO_Y_COMA )
            // InternalAngularDsl.g:320:3: () (this_COMILLAS_1= RULE_COMILLAS this_USE_2= RULE_USE this_STRICT_3= RULE_STRICT this_COMILLAS_4= RULE_COMILLAS this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA )? this_ANGULAR_6= RULE_ANGULAR this_PUNTO_7= RULE_PUNTO this_MODULE_8= RULE_MODULE this_PARENTESIS_IZQUIERDO_9= RULE_PARENTESIS_IZQUIERDO ( ( ruleEString ) ) this_PARENTESIS_DERECHO_11= RULE_PARENTESIS_DERECHO this_PUNTO_12= RULE_PUNTO otherlv_13= 'factory' this_PARENTESIS_IZQUIERDO_14= RULE_PARENTESIS_IZQUIERDO ( (lv_name_15_0= ruleEString ) ) this_COMA_16= RULE_COMA this_PARENTESIS_CUADRADO_IZQUIERDO_17= RULE_PARENTESIS_CUADRADO_IZQUIERDO ( ( ( ruleEString ) ) (this_COMA_19= RULE_COMA ( ( ruleEString ) ) )* )* this_COMA_21= RULE_COMA ( (lv_funcion_22_0= ruleFuncion ) ) this_PARENTESIS_CUADRADO_DERECHO_23= RULE_PARENTESIS_CUADRADO_DERECHO this_PARENTESIS_DERECHO_24= RULE_PARENTESIS_DERECHO this_PUNTO_Y_COMA_25= RULE_PUNTO_Y_COMA
            {
            // InternalAngularDsl.g:320:3: ()
            // InternalAngularDsl.g:321:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceAccess().getServiceAction_0(),
            					current);
            			

            }

            // InternalAngularDsl.g:327:3: (this_COMILLAS_1= RULE_COMILLAS this_USE_2= RULE_USE this_STRICT_3= RULE_STRICT this_COMILLAS_4= RULE_COMILLAS this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_COMILLAS) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAngularDsl.g:328:4: this_COMILLAS_1= RULE_COMILLAS this_USE_2= RULE_USE this_STRICT_3= RULE_STRICT this_COMILLAS_4= RULE_COMILLAS this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA
                    {
                    this_COMILLAS_1=(Token)match(input,RULE_COMILLAS,FOLLOW_3); 

                    				newLeafNode(this_COMILLAS_1, grammarAccess.getServiceAccess().getCOMILLASTerminalRuleCall_1_0());
                    			
                    this_USE_2=(Token)match(input,RULE_USE,FOLLOW_4); 

                    				newLeafNode(this_USE_2, grammarAccess.getServiceAccess().getUSETerminalRuleCall_1_1());
                    			
                    this_STRICT_3=(Token)match(input,RULE_STRICT,FOLLOW_5); 

                    				newLeafNode(this_STRICT_3, grammarAccess.getServiceAccess().getSTRICTTerminalRuleCall_1_2());
                    			
                    this_COMILLAS_4=(Token)match(input,RULE_COMILLAS,FOLLOW_6); 

                    				newLeafNode(this_COMILLAS_4, grammarAccess.getServiceAccess().getCOMILLASTerminalRuleCall_1_3());
                    			
                    this_PUNTO_Y_COMA_5=(Token)match(input,RULE_PUNTO_Y_COMA,FOLLOW_7); 

                    				newLeafNode(this_PUNTO_Y_COMA_5, grammarAccess.getServiceAccess().getPUNTO_Y_COMATerminalRuleCall_1_4());
                    			

                    }
                    break;

            }

            this_ANGULAR_6=(Token)match(input,RULE_ANGULAR,FOLLOW_8); 

            			newLeafNode(this_ANGULAR_6, grammarAccess.getServiceAccess().getANGULARTerminalRuleCall_2());
            		
            this_PUNTO_7=(Token)match(input,RULE_PUNTO,FOLLOW_9); 

            			newLeafNode(this_PUNTO_7, grammarAccess.getServiceAccess().getPUNTOTerminalRuleCall_3());
            		
            this_MODULE_8=(Token)match(input,RULE_MODULE,FOLLOW_10); 

            			newLeafNode(this_MODULE_8, grammarAccess.getServiceAccess().getMODULETerminalRuleCall_4());
            		
            this_PARENTESIS_IZQUIERDO_9=(Token)match(input,RULE_PARENTESIS_IZQUIERDO,FOLLOW_11); 

            			newLeafNode(this_PARENTESIS_IZQUIERDO_9, grammarAccess.getServiceAccess().getPARENTESIS_IZQUIERDOTerminalRuleCall_5());
            		
            // InternalAngularDsl.g:365:3: ( ( ruleEString ) )
            // InternalAngularDsl.g:366:4: ( ruleEString )
            {
            // InternalAngularDsl.g:366:4: ( ruleEString )
            // InternalAngularDsl.g:367:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceAccess().getModuloModuloCrossReference_6_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_PARENTESIS_DERECHO_11=(Token)match(input,RULE_PARENTESIS_DERECHO,FOLLOW_8); 

            			newLeafNode(this_PARENTESIS_DERECHO_11, grammarAccess.getServiceAccess().getPARENTESIS_DERECHOTerminalRuleCall_7());
            		
            this_PUNTO_12=(Token)match(input,RULE_PUNTO,FOLLOW_17); 

            			newLeafNode(this_PUNTO_12, grammarAccess.getServiceAccess().getPUNTOTerminalRuleCall_8());
            		
            otherlv_13=(Token)match(input,37,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getServiceAccess().getFactoryKeyword_9());
            		
            this_PARENTESIS_IZQUIERDO_14=(Token)match(input,RULE_PARENTESIS_IZQUIERDO,FOLLOW_11); 

            			newLeafNode(this_PARENTESIS_IZQUIERDO_14, grammarAccess.getServiceAccess().getPARENTESIS_IZQUIERDOTerminalRuleCall_10());
            		
            // InternalAngularDsl.g:397:3: ( (lv_name_15_0= ruleEString ) )
            // InternalAngularDsl.g:398:4: (lv_name_15_0= ruleEString )
            {
            // InternalAngularDsl.g:398:4: (lv_name_15_0= ruleEString )
            // InternalAngularDsl.g:399:5: lv_name_15_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_15_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_15_0,
            						"co.edu.uniandes.angular.AngularDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMA_16=(Token)match(input,RULE_COMA,FOLLOW_13); 

            			newLeafNode(this_COMA_16, grammarAccess.getServiceAccess().getCOMATerminalRuleCall_12());
            		
            this_PARENTESIS_CUADRADO_IZQUIERDO_17=(Token)match(input,RULE_PARENTESIS_CUADRADO_IZQUIERDO,FOLLOW_18); 

            			newLeafNode(this_PARENTESIS_CUADRADO_IZQUIERDO_17, grammarAccess.getServiceAccess().getPARENTESIS_CUADRADO_IZQUIERDOTerminalRuleCall_13());
            		
            // InternalAngularDsl.g:424:3: ( ( ( ruleEString ) ) (this_COMA_19= RULE_COMA ( ( ruleEString ) ) )* )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING||LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAngularDsl.g:425:4: ( ( ruleEString ) ) (this_COMA_19= RULE_COMA ( ( ruleEString ) ) )*
            	    {
            	    // InternalAngularDsl.g:425:4: ( ( ruleEString ) )
            	    // InternalAngularDsl.g:426:5: ( ruleEString )
            	    {
            	    // InternalAngularDsl.g:426:5: ( ruleEString )
            	    // InternalAngularDsl.g:427:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getServiceRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getServiceAccess().getParametrosObjetoAngularCrossReference_14_0_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAngularDsl.g:441:4: (this_COMA_19= RULE_COMA ( ( ruleEString ) ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==RULE_COMA) ) {
            	            int LA6_1 = input.LA(2);

            	            if ( (LA6_1==RULE_STRING||LA6_1==RULE_ID) ) {
            	                alt6=1;
            	            }


            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalAngularDsl.g:442:5: this_COMA_19= RULE_COMA ( ( ruleEString ) )
            	    	    {
            	    	    this_COMA_19=(Token)match(input,RULE_COMA,FOLLOW_11); 

            	    	    					newLeafNode(this_COMA_19, grammarAccess.getServiceAccess().getCOMATerminalRuleCall_14_1_0());
            	    	    				
            	    	    // InternalAngularDsl.g:446:5: ( ( ruleEString ) )
            	    	    // InternalAngularDsl.g:447:6: ( ruleEString )
            	    	    {
            	    	    // InternalAngularDsl.g:447:6: ( ruleEString )
            	    	    // InternalAngularDsl.g:448:7: ruleEString
            	    	    {

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getServiceRule());
            	    	    							}
            	    	    						

            	    	    							newCompositeNode(grammarAccess.getServiceAccess().getParametrosObjetoAngularCrossReference_14_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_18);
            	    	    ruleEString();

            	    	    state._fsp--;


            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            this_COMA_21=(Token)match(input,RULE_COMA,FOLLOW_19); 

            			newLeafNode(this_COMA_21, grammarAccess.getServiceAccess().getCOMATerminalRuleCall_15());
            		
            // InternalAngularDsl.g:468:3: ( (lv_funcion_22_0= ruleFuncion ) )
            // InternalAngularDsl.g:469:4: (lv_funcion_22_0= ruleFuncion )
            {
            // InternalAngularDsl.g:469:4: (lv_funcion_22_0= ruleFuncion )
            // InternalAngularDsl.g:470:5: lv_funcion_22_0= ruleFuncion
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getFuncionFuncionParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_20);
            lv_funcion_22_0=ruleFuncion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"funcion",
            						lv_funcion_22_0,
            						"co.edu.uniandes.angular.AngularDsl.Funcion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_PARENTESIS_CUADRADO_DERECHO_23=(Token)match(input,RULE_PARENTESIS_CUADRADO_DERECHO,FOLLOW_16); 

            			newLeafNode(this_PARENTESIS_CUADRADO_DERECHO_23, grammarAccess.getServiceAccess().getPARENTESIS_CUADRADO_DERECHOTerminalRuleCall_17());
            		
            this_PARENTESIS_DERECHO_24=(Token)match(input,RULE_PARENTESIS_DERECHO,FOLLOW_6); 

            			newLeafNode(this_PARENTESIS_DERECHO_24, grammarAccess.getServiceAccess().getPARENTESIS_DERECHOTerminalRuleCall_18());
            		
            this_PUNTO_Y_COMA_25=(Token)match(input,RULE_PUNTO_Y_COMA,FOLLOW_2); 

            			newLeafNode(this_PUNTO_Y_COMA_25, grammarAccess.getServiceAccess().getPUNTO_Y_COMATerminalRuleCall_19());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleComponente"
    // InternalAngularDsl.g:503:1: entryRuleComponente returns [EObject current=null] : iv_ruleComponente= ruleComponente EOF ;
    public final EObject entryRuleComponente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponente = null;


        try {
            // InternalAngularDsl.g:503:51: (iv_ruleComponente= ruleComponente EOF )
            // InternalAngularDsl.g:504:2: iv_ruleComponente= ruleComponente EOF
            {
             newCompositeNode(grammarAccess.getComponenteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponente=ruleComponente();

            state._fsp--;

             current =iv_ruleComponente; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponente"


    // $ANTLR start "ruleComponente"
    // InternalAngularDsl.g:510:1: ruleComponente returns [EObject current=null] : ( () (this_COMILLAS_1= RULE_COMILLAS this_USE_2= RULE_USE this_STRICT_3= RULE_STRICT this_COMILLAS_4= RULE_COMILLAS this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA )? this_ANGULAR_6= RULE_ANGULAR this_PUNTO_7= RULE_PUNTO this_MODULE_8= RULE_MODULE this_PARENTESIS_IZQUIERDO_9= RULE_PARENTESIS_IZQUIERDO ( ( ruleEString ) ) this_PARENTESIS_DERECHO_11= RULE_PARENTESIS_DERECHO this_PUNTO_12= RULE_PUNTO this_COMPONENT_13= RULE_COMPONENT this_PARENTESIS_IZQUIERDO_14= RULE_PARENTESIS_IZQUIERDO ( (lv_name_15_0= ruleEString ) ) this_COMA_16= RULE_COMA this_LLAVE_IZQUIERDA_17= RULE_LLAVE_IZQUIERDA this_TEMPLATE_URL_18= RULE_TEMPLATE_URL this_DOS_PUNTOS_19= RULE_DOS_PUNTOS ( ( ruleEString ) ) this_COMA_21= RULE_COMA this_CONTROLLER_22= RULE_CONTROLLER this_DOS_PUNTOS_23= RULE_DOS_PUNTOS this_PARENTESIS_CUADRADO_IZQUIERDO_24= RULE_PARENTESIS_CUADRADO_IZQUIERDO ( ( ( ruleEString ) ) (this_COMA_26= RULE_COMA ( ( ruleEString ) ) )* )* this_COMA_28= RULE_COMA ( (lv_funcion_29_0= ruleFuncion ) ) this_PARENTESIS_CUADRADO_DERECHO_30= RULE_PARENTESIS_CUADRADO_DERECHO this_LLAVE_DERECHA_31= RULE_LLAVE_DERECHA this_PARENTESIS_DERECHO_32= RULE_PARENTESIS_DERECHO this_PUNTO_Y_COMA_33= RULE_PUNTO_Y_COMA ) ;
    public final EObject ruleComponente() throws RecognitionException {
        EObject current = null;

        Token this_COMILLAS_1=null;
        Token this_USE_2=null;
        Token this_STRICT_3=null;
        Token this_COMILLAS_4=null;
        Token this_PUNTO_Y_COMA_5=null;
        Token this_ANGULAR_6=null;
        Token this_PUNTO_7=null;
        Token this_MODULE_8=null;
        Token this_PARENTESIS_IZQUIERDO_9=null;
        Token this_PARENTESIS_DERECHO_11=null;
        Token this_PUNTO_12=null;
        Token this_COMPONENT_13=null;
        Token this_PARENTESIS_IZQUIERDO_14=null;
        Token this_COMA_16=null;
        Token this_LLAVE_IZQUIERDA_17=null;
        Token this_TEMPLATE_URL_18=null;
        Token this_DOS_PUNTOS_19=null;
        Token this_COMA_21=null;
        Token this_CONTROLLER_22=null;
        Token this_DOS_PUNTOS_23=null;
        Token this_PARENTESIS_CUADRADO_IZQUIERDO_24=null;
        Token this_COMA_26=null;
        Token this_COMA_28=null;
        Token this_PARENTESIS_CUADRADO_DERECHO_30=null;
        Token this_LLAVE_DERECHA_31=null;
        Token this_PARENTESIS_DERECHO_32=null;
        Token this_PUNTO_Y_COMA_33=null;
        AntlrDatatypeRuleToken lv_name_15_0 = null;

        EObject lv_funcion_29_0 = null;



        	enterRule();

        try {
            // InternalAngularDsl.g:516:2: ( ( () (this_COMILLAS_1= RULE_COMILLAS this_USE_2= RULE_USE this_STRICT_3= RULE_STRICT this_COMILLAS_4= RULE_COMILLAS this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA )? this_ANGULAR_6= RULE_ANGULAR this_PUNTO_7= RULE_PUNTO this_MODULE_8= RULE_MODULE this_PARENTESIS_IZQUIERDO_9= RULE_PARENTESIS_IZQUIERDO ( ( ruleEString ) ) this_PARENTESIS_DERECHO_11= RULE_PARENTESIS_DERECHO this_PUNTO_12= RULE_PUNTO this_COMPONENT_13= RULE_COMPONENT this_PARENTESIS_IZQUIERDO_14= RULE_PARENTESIS_IZQUIERDO ( (lv_name_15_0= ruleEString ) ) this_COMA_16= RULE_COMA this_LLAVE_IZQUIERDA_17= RULE_LLAVE_IZQUIERDA this_TEMPLATE_URL_18= RULE_TEMPLATE_URL this_DOS_PUNTOS_19= RULE_DOS_PUNTOS ( ( ruleEString ) ) this_COMA_21= RULE_COMA this_CONTROLLER_22= RULE_CONTROLLER this_DOS_PUNTOS_23= RULE_DOS_PUNTOS this_PARENTESIS_CUADRADO_IZQUIERDO_24= RULE_PARENTESIS_CUADRADO_IZQUIERDO ( ( ( ruleEString ) ) (this_COMA_26= RULE_COMA ( ( ruleEString ) ) )* )* this_COMA_28= RULE_COMA ( (lv_funcion_29_0= ruleFuncion ) ) this_PARENTESIS_CUADRADO_DERECHO_30= RULE_PARENTESIS_CUADRADO_DERECHO this_LLAVE_DERECHA_31= RULE_LLAVE_DERECHA this_PARENTESIS_DERECHO_32= RULE_PARENTESIS_DERECHO this_PUNTO_Y_COMA_33= RULE_PUNTO_Y_COMA ) )
            // InternalAngularDsl.g:517:2: ( () (this_COMILLAS_1= RULE_COMILLAS this_USE_2= RULE_USE this_STRICT_3= RULE_STRICT this_COMILLAS_4= RULE_COMILLAS this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA )? this_ANGULAR_6= RULE_ANGULAR this_PUNTO_7= RULE_PUNTO this_MODULE_8= RULE_MODULE this_PARENTESIS_IZQUIERDO_9= RULE_PARENTESIS_IZQUIERDO ( ( ruleEString ) ) this_PARENTESIS_DERECHO_11= RULE_PARENTESIS_DERECHO this_PUNTO_12= RULE_PUNTO this_COMPONENT_13= RULE_COMPONENT this_PARENTESIS_IZQUIERDO_14= RULE_PARENTESIS_IZQUIERDO ( (lv_name_15_0= ruleEString ) ) this_COMA_16= RULE_COMA this_LLAVE_IZQUIERDA_17= RULE_LLAVE_IZQUIERDA this_TEMPLATE_URL_18= RULE_TEMPLATE_URL this_DOS_PUNTOS_19= RULE_DOS_PUNTOS ( ( ruleEString ) ) this_COMA_21= RULE_COMA this_CONTROLLER_22= RULE_CONTROLLER this_DOS_PUNTOS_23= RULE_DOS_PUNTOS this_PARENTESIS_CUADRADO_IZQUIERDO_24= RULE_PARENTESIS_CUADRADO_IZQUIERDO ( ( ( ruleEString ) ) (this_COMA_26= RULE_COMA ( ( ruleEString ) ) )* )* this_COMA_28= RULE_COMA ( (lv_funcion_29_0= ruleFuncion ) ) this_PARENTESIS_CUADRADO_DERECHO_30= RULE_PARENTESIS_CUADRADO_DERECHO this_LLAVE_DERECHA_31= RULE_LLAVE_DERECHA this_PARENTESIS_DERECHO_32= RULE_PARENTESIS_DERECHO this_PUNTO_Y_COMA_33= RULE_PUNTO_Y_COMA )
            {
            // InternalAngularDsl.g:517:2: ( () (this_COMILLAS_1= RULE_COMILLAS this_USE_2= RULE_USE this_STRICT_3= RULE_STRICT this_COMILLAS_4= RULE_COMILLAS this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA )? this_ANGULAR_6= RULE_ANGULAR this_PUNTO_7= RULE_PUNTO this_MODULE_8= RULE_MODULE this_PARENTESIS_IZQUIERDO_9= RULE_PARENTESIS_IZQUIERDO ( ( ruleEString ) ) this_PARENTESIS_DERECHO_11= RULE_PARENTESIS_DERECHO this_PUNTO_12= RULE_PUNTO this_COMPONENT_13= RULE_COMPONENT this_PARENTESIS_IZQUIERDO_14= RULE_PARENTESIS_IZQUIERDO ( (lv_name_15_0= ruleEString ) ) this_COMA_16= RULE_COMA this_LLAVE_IZQUIERDA_17= RULE_LLAVE_IZQUIERDA this_TEMPLATE_URL_18= RULE_TEMPLATE_URL this_DOS_PUNTOS_19= RULE_DOS_PUNTOS ( ( ruleEString ) ) this_COMA_21= RULE_COMA this_CONTROLLER_22= RULE_CONTROLLER this_DOS_PUNTOS_23= RULE_DOS_PUNTOS this_PARENTESIS_CUADRADO_IZQUIERDO_24= RULE_PARENTESIS_CUADRADO_IZQUIERDO ( ( ( ruleEString ) ) (this_COMA_26= RULE_COMA ( ( ruleEString ) ) )* )* this_COMA_28= RULE_COMA ( (lv_funcion_29_0= ruleFuncion ) ) this_PARENTESIS_CUADRADO_DERECHO_30= RULE_PARENTESIS_CUADRADO_DERECHO this_LLAVE_DERECHA_31= RULE_LLAVE_DERECHA this_PARENTESIS_DERECHO_32= RULE_PARENTESIS_DERECHO this_PUNTO_Y_COMA_33= RULE_PUNTO_Y_COMA )
            // InternalAngularDsl.g:518:3: () (this_COMILLAS_1= RULE_COMILLAS this_USE_2= RULE_USE this_STRICT_3= RULE_STRICT this_COMILLAS_4= RULE_COMILLAS this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA )? this_ANGULAR_6= RULE_ANGULAR this_PUNTO_7= RULE_PUNTO this_MODULE_8= RULE_MODULE this_PARENTESIS_IZQUIERDO_9= RULE_PARENTESIS_IZQUIERDO ( ( ruleEString ) ) this_PARENTESIS_DERECHO_11= RULE_PARENTESIS_DERECHO this_PUNTO_12= RULE_PUNTO this_COMPONENT_13= RULE_COMPONENT this_PARENTESIS_IZQUIERDO_14= RULE_PARENTESIS_IZQUIERDO ( (lv_name_15_0= ruleEString ) ) this_COMA_16= RULE_COMA this_LLAVE_IZQUIERDA_17= RULE_LLAVE_IZQUIERDA this_TEMPLATE_URL_18= RULE_TEMPLATE_URL this_DOS_PUNTOS_19= RULE_DOS_PUNTOS ( ( ruleEString ) ) this_COMA_21= RULE_COMA this_CONTROLLER_22= RULE_CONTROLLER this_DOS_PUNTOS_23= RULE_DOS_PUNTOS this_PARENTESIS_CUADRADO_IZQUIERDO_24= RULE_PARENTESIS_CUADRADO_IZQUIERDO ( ( ( ruleEString ) ) (this_COMA_26= RULE_COMA ( ( ruleEString ) ) )* )* this_COMA_28= RULE_COMA ( (lv_funcion_29_0= ruleFuncion ) ) this_PARENTESIS_CUADRADO_DERECHO_30= RULE_PARENTESIS_CUADRADO_DERECHO this_LLAVE_DERECHA_31= RULE_LLAVE_DERECHA this_PARENTESIS_DERECHO_32= RULE_PARENTESIS_DERECHO this_PUNTO_Y_COMA_33= RULE_PUNTO_Y_COMA
            {
            // InternalAngularDsl.g:518:3: ()
            // InternalAngularDsl.g:519:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponenteAccess().getComponenteAction_0(),
            					current);
            			

            }

            // InternalAngularDsl.g:525:3: (this_COMILLAS_1= RULE_COMILLAS this_USE_2= RULE_USE this_STRICT_3= RULE_STRICT this_COMILLAS_4= RULE_COMILLAS this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_COMILLAS) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAngularDsl.g:526:4: this_COMILLAS_1= RULE_COMILLAS this_USE_2= RULE_USE this_STRICT_3= RULE_STRICT this_COMILLAS_4= RULE_COMILLAS this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA
                    {
                    this_COMILLAS_1=(Token)match(input,RULE_COMILLAS,FOLLOW_3); 

                    				newLeafNode(this_COMILLAS_1, grammarAccess.getComponenteAccess().getCOMILLASTerminalRuleCall_1_0());
                    			
                    this_USE_2=(Token)match(input,RULE_USE,FOLLOW_4); 

                    				newLeafNode(this_USE_2, grammarAccess.getComponenteAccess().getUSETerminalRuleCall_1_1());
                    			
                    this_STRICT_3=(Token)match(input,RULE_STRICT,FOLLOW_5); 

                    				newLeafNode(this_STRICT_3, grammarAccess.getComponenteAccess().getSTRICTTerminalRuleCall_1_2());
                    			
                    this_COMILLAS_4=(Token)match(input,RULE_COMILLAS,FOLLOW_6); 

                    				newLeafNode(this_COMILLAS_4, grammarAccess.getComponenteAccess().getCOMILLASTerminalRuleCall_1_3());
                    			
                    this_PUNTO_Y_COMA_5=(Token)match(input,RULE_PUNTO_Y_COMA,FOLLOW_7); 

                    				newLeafNode(this_PUNTO_Y_COMA_5, grammarAccess.getComponenteAccess().getPUNTO_Y_COMATerminalRuleCall_1_4());
                    			

                    }
                    break;

            }

            this_ANGULAR_6=(Token)match(input,RULE_ANGULAR,FOLLOW_8); 

            			newLeafNode(this_ANGULAR_6, grammarAccess.getComponenteAccess().getANGULARTerminalRuleCall_2());
            		
            this_PUNTO_7=(Token)match(input,RULE_PUNTO,FOLLOW_9); 

            			newLeafNode(this_PUNTO_7, grammarAccess.getComponenteAccess().getPUNTOTerminalRuleCall_3());
            		
            this_MODULE_8=(Token)match(input,RULE_MODULE,FOLLOW_10); 

            			newLeafNode(this_MODULE_8, grammarAccess.getComponenteAccess().getMODULETerminalRuleCall_4());
            		
            this_PARENTESIS_IZQUIERDO_9=(Token)match(input,RULE_PARENTESIS_IZQUIERDO,FOLLOW_11); 

            			newLeafNode(this_PARENTESIS_IZQUIERDO_9, grammarAccess.getComponenteAccess().getPARENTESIS_IZQUIERDOTerminalRuleCall_5());
            		
            // InternalAngularDsl.g:563:3: ( ( ruleEString ) )
            // InternalAngularDsl.g:564:4: ( ruleEString )
            {
            // InternalAngularDsl.g:564:4: ( ruleEString )
            // InternalAngularDsl.g:565:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponenteRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponenteAccess().getModuloModuloCrossReference_6_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_PARENTESIS_DERECHO_11=(Token)match(input,RULE_PARENTESIS_DERECHO,FOLLOW_8); 

            			newLeafNode(this_PARENTESIS_DERECHO_11, grammarAccess.getComponenteAccess().getPARENTESIS_DERECHOTerminalRuleCall_7());
            		
            this_PUNTO_12=(Token)match(input,RULE_PUNTO,FOLLOW_21); 

            			newLeafNode(this_PUNTO_12, grammarAccess.getComponenteAccess().getPUNTOTerminalRuleCall_8());
            		
            this_COMPONENT_13=(Token)match(input,RULE_COMPONENT,FOLLOW_10); 

            			newLeafNode(this_COMPONENT_13, grammarAccess.getComponenteAccess().getCOMPONENTTerminalRuleCall_9());
            		
            this_PARENTESIS_IZQUIERDO_14=(Token)match(input,RULE_PARENTESIS_IZQUIERDO,FOLLOW_11); 

            			newLeafNode(this_PARENTESIS_IZQUIERDO_14, grammarAccess.getComponenteAccess().getPARENTESIS_IZQUIERDOTerminalRuleCall_10());
            		
            // InternalAngularDsl.g:595:3: ( (lv_name_15_0= ruleEString ) )
            // InternalAngularDsl.g:596:4: (lv_name_15_0= ruleEString )
            {
            // InternalAngularDsl.g:596:4: (lv_name_15_0= ruleEString )
            // InternalAngularDsl.g:597:5: lv_name_15_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponenteAccess().getNameEStringParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_15_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponenteRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_15_0,
            						"co.edu.uniandes.angular.AngularDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMA_16=(Token)match(input,RULE_COMA,FOLLOW_22); 

            			newLeafNode(this_COMA_16, grammarAccess.getComponenteAccess().getCOMATerminalRuleCall_12());
            		
            this_LLAVE_IZQUIERDA_17=(Token)match(input,RULE_LLAVE_IZQUIERDA,FOLLOW_23); 

            			newLeafNode(this_LLAVE_IZQUIERDA_17, grammarAccess.getComponenteAccess().getLLAVE_IZQUIERDATerminalRuleCall_13());
            		
            this_TEMPLATE_URL_18=(Token)match(input,RULE_TEMPLATE_URL,FOLLOW_24); 

            			newLeafNode(this_TEMPLATE_URL_18, grammarAccess.getComponenteAccess().getTEMPLATE_URLTerminalRuleCall_14());
            		
            this_DOS_PUNTOS_19=(Token)match(input,RULE_DOS_PUNTOS,FOLLOW_11); 

            			newLeafNode(this_DOS_PUNTOS_19, grammarAccess.getComponenteAccess().getDOS_PUNTOSTerminalRuleCall_15());
            		
            // InternalAngularDsl.g:630:3: ( ( ruleEString ) )
            // InternalAngularDsl.g:631:4: ( ruleEString )
            {
            // InternalAngularDsl.g:631:4: ( ruleEString )
            // InternalAngularDsl.g:632:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponenteRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponenteAccess().getTemplateTemplateCrossReference_16_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMA_21=(Token)match(input,RULE_COMA,FOLLOW_25); 

            			newLeafNode(this_COMA_21, grammarAccess.getComponenteAccess().getCOMATerminalRuleCall_17());
            		
            this_CONTROLLER_22=(Token)match(input,RULE_CONTROLLER,FOLLOW_24); 

            			newLeafNode(this_CONTROLLER_22, grammarAccess.getComponenteAccess().getCONTROLLERTerminalRuleCall_18());
            		
            this_DOS_PUNTOS_23=(Token)match(input,RULE_DOS_PUNTOS,FOLLOW_13); 

            			newLeafNode(this_DOS_PUNTOS_23, grammarAccess.getComponenteAccess().getDOS_PUNTOSTerminalRuleCall_19());
            		
            this_PARENTESIS_CUADRADO_IZQUIERDO_24=(Token)match(input,RULE_PARENTESIS_CUADRADO_IZQUIERDO,FOLLOW_18); 

            			newLeafNode(this_PARENTESIS_CUADRADO_IZQUIERDO_24, grammarAccess.getComponenteAccess().getPARENTESIS_CUADRADO_IZQUIERDOTerminalRuleCall_20());
            		
            // InternalAngularDsl.g:662:3: ( ( ( ruleEString ) ) (this_COMA_26= RULE_COMA ( ( ruleEString ) ) )* )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING||LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAngularDsl.g:663:4: ( ( ruleEString ) ) (this_COMA_26= RULE_COMA ( ( ruleEString ) ) )*
            	    {
            	    // InternalAngularDsl.g:663:4: ( ( ruleEString ) )
            	    // InternalAngularDsl.g:664:5: ( ruleEString )
            	    {
            	    // InternalAngularDsl.g:664:5: ( ruleEString )
            	    // InternalAngularDsl.g:665:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getComponenteRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getComponenteAccess().getParametrosObjetoAngularCrossReference_21_0_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAngularDsl.g:679:4: (this_COMA_26= RULE_COMA ( ( ruleEString ) ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==RULE_COMA) ) {
            	            int LA9_1 = input.LA(2);

            	            if ( (LA9_1==RULE_STRING||LA9_1==RULE_ID) ) {
            	                alt9=1;
            	            }


            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalAngularDsl.g:680:5: this_COMA_26= RULE_COMA ( ( ruleEString ) )
            	    	    {
            	    	    this_COMA_26=(Token)match(input,RULE_COMA,FOLLOW_11); 

            	    	    					newLeafNode(this_COMA_26, grammarAccess.getComponenteAccess().getCOMATerminalRuleCall_21_1_0());
            	    	    				
            	    	    // InternalAngularDsl.g:684:5: ( ( ruleEString ) )
            	    	    // InternalAngularDsl.g:685:6: ( ruleEString )
            	    	    {
            	    	    // InternalAngularDsl.g:685:6: ( ruleEString )
            	    	    // InternalAngularDsl.g:686:7: ruleEString
            	    	    {

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getComponenteRule());
            	    	    							}
            	    	    						

            	    	    							newCompositeNode(grammarAccess.getComponenteAccess().getParametrosObjetoAngularCrossReference_21_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_18);
            	    	    ruleEString();

            	    	    state._fsp--;


            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            this_COMA_28=(Token)match(input,RULE_COMA,FOLLOW_19); 

            			newLeafNode(this_COMA_28, grammarAccess.getComponenteAccess().getCOMATerminalRuleCall_22());
            		
            // InternalAngularDsl.g:706:3: ( (lv_funcion_29_0= ruleFuncion ) )
            // InternalAngularDsl.g:707:4: (lv_funcion_29_0= ruleFuncion )
            {
            // InternalAngularDsl.g:707:4: (lv_funcion_29_0= ruleFuncion )
            // InternalAngularDsl.g:708:5: lv_funcion_29_0= ruleFuncion
            {

            					newCompositeNode(grammarAccess.getComponenteAccess().getFuncionFuncionParserRuleCall_23_0());
            				
            pushFollow(FOLLOW_20);
            lv_funcion_29_0=ruleFuncion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponenteRule());
            					}
            					set(
            						current,
            						"funcion",
            						lv_funcion_29_0,
            						"co.edu.uniandes.angular.AngularDsl.Funcion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_PARENTESIS_CUADRADO_DERECHO_30=(Token)match(input,RULE_PARENTESIS_CUADRADO_DERECHO,FOLLOW_26); 

            			newLeafNode(this_PARENTESIS_CUADRADO_DERECHO_30, grammarAccess.getComponenteAccess().getPARENTESIS_CUADRADO_DERECHOTerminalRuleCall_24());
            		
            this_LLAVE_DERECHA_31=(Token)match(input,RULE_LLAVE_DERECHA,FOLLOW_16); 

            			newLeafNode(this_LLAVE_DERECHA_31, grammarAccess.getComponenteAccess().getLLAVE_DERECHATerminalRuleCall_25());
            		
            this_PARENTESIS_DERECHO_32=(Token)match(input,RULE_PARENTESIS_DERECHO,FOLLOW_6); 

            			newLeafNode(this_PARENTESIS_DERECHO_32, grammarAccess.getComponenteAccess().getPARENTESIS_DERECHOTerminalRuleCall_26());
            		
            this_PUNTO_Y_COMA_33=(Token)match(input,RULE_PUNTO_Y_COMA,FOLLOW_2); 

            			newLeafNode(this_PUNTO_Y_COMA_33, grammarAccess.getComponenteAccess().getPUNTO_Y_COMATerminalRuleCall_27());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponente"


    // $ANTLR start "entryRuleFuncion"
    // InternalAngularDsl.g:745:1: entryRuleFuncion returns [EObject current=null] : iv_ruleFuncion= ruleFuncion EOF ;
    public final EObject entryRuleFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncion = null;


        try {
            // InternalAngularDsl.g:745:48: (iv_ruleFuncion= ruleFuncion EOF )
            // InternalAngularDsl.g:746:2: iv_ruleFuncion= ruleFuncion EOF
            {
             newCompositeNode(grammarAccess.getFuncionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncion=ruleFuncion();

            state._fsp--;

             current =iv_ruleFuncion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuncion"


    // $ANTLR start "ruleFuncion"
    // InternalAngularDsl.g:752:1: ruleFuncion returns [EObject current=null] : ( () this_FUNCTION_1= RULE_FUNCTION ( (lv_name_2_0= ruleEString ) ) this_PARENTESIS_IZQUIERDO_3= RULE_PARENTESIS_IZQUIERDO ( (lv_parametros_4_0= ruleEString ) ) this_PARENTESIS_DERECHO_5= RULE_PARENTESIS_DERECHO this_LLAVE_IZQUIERDA_6= RULE_LLAVE_IZQUIERDA ( (lv_variables_7_0= ruleVariable ) )* ( (lv_body_8_0= ruleEString ) ) this_LLAVE_DERECHA_9= RULE_LLAVE_DERECHA ) ;
    public final EObject ruleFuncion() throws RecognitionException {
        EObject current = null;

        Token this_FUNCTION_1=null;
        Token this_PARENTESIS_IZQUIERDO_3=null;
        Token this_PARENTESIS_DERECHO_5=null;
        Token this_LLAVE_IZQUIERDA_6=null;
        Token this_LLAVE_DERECHA_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_parametros_4_0 = null;

        EObject lv_variables_7_0 = null;

        AntlrDatatypeRuleToken lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalAngularDsl.g:758:2: ( ( () this_FUNCTION_1= RULE_FUNCTION ( (lv_name_2_0= ruleEString ) ) this_PARENTESIS_IZQUIERDO_3= RULE_PARENTESIS_IZQUIERDO ( (lv_parametros_4_0= ruleEString ) ) this_PARENTESIS_DERECHO_5= RULE_PARENTESIS_DERECHO this_LLAVE_IZQUIERDA_6= RULE_LLAVE_IZQUIERDA ( (lv_variables_7_0= ruleVariable ) )* ( (lv_body_8_0= ruleEString ) ) this_LLAVE_DERECHA_9= RULE_LLAVE_DERECHA ) )
            // InternalAngularDsl.g:759:2: ( () this_FUNCTION_1= RULE_FUNCTION ( (lv_name_2_0= ruleEString ) ) this_PARENTESIS_IZQUIERDO_3= RULE_PARENTESIS_IZQUIERDO ( (lv_parametros_4_0= ruleEString ) ) this_PARENTESIS_DERECHO_5= RULE_PARENTESIS_DERECHO this_LLAVE_IZQUIERDA_6= RULE_LLAVE_IZQUIERDA ( (lv_variables_7_0= ruleVariable ) )* ( (lv_body_8_0= ruleEString ) ) this_LLAVE_DERECHA_9= RULE_LLAVE_DERECHA )
            {
            // InternalAngularDsl.g:759:2: ( () this_FUNCTION_1= RULE_FUNCTION ( (lv_name_2_0= ruleEString ) ) this_PARENTESIS_IZQUIERDO_3= RULE_PARENTESIS_IZQUIERDO ( (lv_parametros_4_0= ruleEString ) ) this_PARENTESIS_DERECHO_5= RULE_PARENTESIS_DERECHO this_LLAVE_IZQUIERDA_6= RULE_LLAVE_IZQUIERDA ( (lv_variables_7_0= ruleVariable ) )* ( (lv_body_8_0= ruleEString ) ) this_LLAVE_DERECHA_9= RULE_LLAVE_DERECHA )
            // InternalAngularDsl.g:760:3: () this_FUNCTION_1= RULE_FUNCTION ( (lv_name_2_0= ruleEString ) ) this_PARENTESIS_IZQUIERDO_3= RULE_PARENTESIS_IZQUIERDO ( (lv_parametros_4_0= ruleEString ) ) this_PARENTESIS_DERECHO_5= RULE_PARENTESIS_DERECHO this_LLAVE_IZQUIERDA_6= RULE_LLAVE_IZQUIERDA ( (lv_variables_7_0= ruleVariable ) )* ( (lv_body_8_0= ruleEString ) ) this_LLAVE_DERECHA_9= RULE_LLAVE_DERECHA
            {
            // InternalAngularDsl.g:760:3: ()
            // InternalAngularDsl.g:761:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFuncionAccess().getFuncionAction_0(),
            					current);
            			

            }

            this_FUNCTION_1=(Token)match(input,RULE_FUNCTION,FOLLOW_11); 

            			newLeafNode(this_FUNCTION_1, grammarAccess.getFuncionAccess().getFUNCTIONTerminalRuleCall_1());
            		
            // InternalAngularDsl.g:771:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAngularDsl.g:772:4: (lv_name_2_0= ruleEString )
            {
            // InternalAngularDsl.g:772:4: (lv_name_2_0= ruleEString )
            // InternalAngularDsl.g:773:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFuncionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"co.edu.uniandes.angular.AngularDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_PARENTESIS_IZQUIERDO_3=(Token)match(input,RULE_PARENTESIS_IZQUIERDO,FOLLOW_11); 

            			newLeafNode(this_PARENTESIS_IZQUIERDO_3, grammarAccess.getFuncionAccess().getPARENTESIS_IZQUIERDOTerminalRuleCall_3());
            		
            // InternalAngularDsl.g:794:3: ( (lv_parametros_4_0= ruleEString ) )
            // InternalAngularDsl.g:795:4: (lv_parametros_4_0= ruleEString )
            {
            // InternalAngularDsl.g:795:4: (lv_parametros_4_0= ruleEString )
            // InternalAngularDsl.g:796:5: lv_parametros_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFuncionAccess().getParametrosEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
            lv_parametros_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncionRule());
            					}
            					set(
            						current,
            						"parametros",
            						lv_parametros_4_0,
            						"co.edu.uniandes.angular.AngularDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_PARENTESIS_DERECHO_5=(Token)match(input,RULE_PARENTESIS_DERECHO,FOLLOW_22); 

            			newLeafNode(this_PARENTESIS_DERECHO_5, grammarAccess.getFuncionAccess().getPARENTESIS_DERECHOTerminalRuleCall_5());
            		
            this_LLAVE_IZQUIERDA_6=(Token)match(input,RULE_LLAVE_IZQUIERDA,FOLLOW_27); 

            			newLeafNode(this_LLAVE_IZQUIERDA_6, grammarAccess.getFuncionAccess().getLLAVE_IZQUIERDATerminalRuleCall_6());
            		
            // InternalAngularDsl.g:821:3: ( (lv_variables_7_0= ruleVariable ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_VAR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAngularDsl.g:822:4: (lv_variables_7_0= ruleVariable )
            	    {
            	    // InternalAngularDsl.g:822:4: (lv_variables_7_0= ruleVariable )
            	    // InternalAngularDsl.g:823:5: lv_variables_7_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getFuncionAccess().getVariablesVariableParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_variables_7_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFuncionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_7_0,
            	    						"co.edu.uniandes.angular.AngularDsl.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalAngularDsl.g:840:3: ( (lv_body_8_0= ruleEString ) )
            // InternalAngularDsl.g:841:4: (lv_body_8_0= ruleEString )
            {
            // InternalAngularDsl.g:841:4: (lv_body_8_0= ruleEString )
            // InternalAngularDsl.g:842:5: lv_body_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFuncionAccess().getBodyEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_26);
            lv_body_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncionRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_8_0,
            						"co.edu.uniandes.angular.AngularDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_LLAVE_DERECHA_9=(Token)match(input,RULE_LLAVE_DERECHA,FOLLOW_2); 

            			newLeafNode(this_LLAVE_DERECHA_9, grammarAccess.getFuncionAccess().getLLAVE_DERECHATerminalRuleCall_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuncion"


    // $ANTLR start "entryRuleVariable"
    // InternalAngularDsl.g:867:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalAngularDsl.g:867:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalAngularDsl.g:868:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalAngularDsl.g:874:1: ruleVariable returns [EObject current=null] : ( () this_VAR_1= RULE_VAR ( (lv_name_2_0= ruleEString ) ) this_IGUAL_3= RULE_IGUAL ( (lv_valor_4_0= ruleEString ) ) this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token this_VAR_1=null;
        Token this_IGUAL_3=null;
        Token this_PUNTO_Y_COMA_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_valor_4_0 = null;



        	enterRule();

        try {
            // InternalAngularDsl.g:880:2: ( ( () this_VAR_1= RULE_VAR ( (lv_name_2_0= ruleEString ) ) this_IGUAL_3= RULE_IGUAL ( (lv_valor_4_0= ruleEString ) ) this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA ) )
            // InternalAngularDsl.g:881:2: ( () this_VAR_1= RULE_VAR ( (lv_name_2_0= ruleEString ) ) this_IGUAL_3= RULE_IGUAL ( (lv_valor_4_0= ruleEString ) ) this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA )
            {
            // InternalAngularDsl.g:881:2: ( () this_VAR_1= RULE_VAR ( (lv_name_2_0= ruleEString ) ) this_IGUAL_3= RULE_IGUAL ( (lv_valor_4_0= ruleEString ) ) this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA )
            // InternalAngularDsl.g:882:3: () this_VAR_1= RULE_VAR ( (lv_name_2_0= ruleEString ) ) this_IGUAL_3= RULE_IGUAL ( (lv_valor_4_0= ruleEString ) ) this_PUNTO_Y_COMA_5= RULE_PUNTO_Y_COMA
            {
            // InternalAngularDsl.g:882:3: ()
            // InternalAngularDsl.g:883:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            this_VAR_1=(Token)match(input,RULE_VAR,FOLLOW_11); 

            			newLeafNode(this_VAR_1, grammarAccess.getVariableAccess().getVARTerminalRuleCall_1());
            		
            // InternalAngularDsl.g:893:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAngularDsl.g:894:4: (lv_name_2_0= ruleEString )
            {
            // InternalAngularDsl.g:894:4: (lv_name_2_0= ruleEString )
            // InternalAngularDsl.g:895:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"co.edu.uniandes.angular.AngularDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_IGUAL_3=(Token)match(input,RULE_IGUAL,FOLLOW_11); 

            			newLeafNode(this_IGUAL_3, grammarAccess.getVariableAccess().getIGUALTerminalRuleCall_3());
            		
            // InternalAngularDsl.g:916:3: ( (lv_valor_4_0= ruleEString ) )
            // InternalAngularDsl.g:917:4: (lv_valor_4_0= ruleEString )
            {
            // InternalAngularDsl.g:917:4: (lv_valor_4_0= ruleEString )
            // InternalAngularDsl.g:918:5: lv_valor_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getValorEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_valor_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"valor",
            						lv_valor_4_0,
            						"co.edu.uniandes.angular.AngularDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_PUNTO_Y_COMA_5=(Token)match(input,RULE_PUNTO_Y_COMA,FOLLOW_2); 

            			newLeafNode(this_PUNTO_Y_COMA_5, grammarAccess.getVariableAccess().getPUNTO_Y_COMATerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleTemplate"
    // InternalAngularDsl.g:943:1: entryRuleTemplate returns [EObject current=null] : iv_ruleTemplate= ruleTemplate EOF ;
    public final EObject entryRuleTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplate = null;


        try {
            // InternalAngularDsl.g:943:49: (iv_ruleTemplate= ruleTemplate EOF )
            // InternalAngularDsl.g:944:2: iv_ruleTemplate= ruleTemplate EOF
            {
             newCompositeNode(grammarAccess.getTemplateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemplate=ruleTemplate();

            state._fsp--;

             current =iv_ruleTemplate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplate"


    // $ANTLR start "ruleTemplate"
    // InternalAngularDsl.g:950:1: ruleTemplate returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '*' ( (lv_sentenciashtml_3_0= ruleSentenciaHTML ) )* ) ;
    public final EObject ruleTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_sentenciashtml_3_0 = null;



        	enterRule();

        try {
            // InternalAngularDsl.g:956:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '*' ( (lv_sentenciashtml_3_0= ruleSentenciaHTML ) )* ) )
            // InternalAngularDsl.g:957:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '*' ( (lv_sentenciashtml_3_0= ruleSentenciaHTML ) )* )
            {
            // InternalAngularDsl.g:957:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '*' ( (lv_sentenciashtml_3_0= ruleSentenciaHTML ) )* )
            // InternalAngularDsl.g:958:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '*' ( (lv_sentenciashtml_3_0= ruleSentenciaHTML ) )*
            {
            // InternalAngularDsl.g:958:3: ()
            // InternalAngularDsl.g:959:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTemplateAccess().getTemplateAction_0(),
            					current);
            			

            }

            // InternalAngularDsl.g:965:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAngularDsl.g:966:4: (lv_name_1_0= ruleEString )
            {
            // InternalAngularDsl.g:966:4: (lv_name_1_0= ruleEString )
            // InternalAngularDsl.g:967:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTemplateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTemplateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"co.edu.uniandes.angular.AngularDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getTemplateAccess().getAsteriskKeyword_2());
            		
            // InternalAngularDsl.g:988:3: ( (lv_sentenciashtml_3_0= ruleSentenciaHTML ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_MENOR_QUE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAngularDsl.g:989:4: (lv_sentenciashtml_3_0= ruleSentenciaHTML )
            	    {
            	    // InternalAngularDsl.g:989:4: (lv_sentenciashtml_3_0= ruleSentenciaHTML )
            	    // InternalAngularDsl.g:990:5: lv_sentenciashtml_3_0= ruleSentenciaHTML
            	    {

            	    					newCompositeNode(grammarAccess.getTemplateAccess().getSentenciashtmlSentenciaHTMLParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_sentenciashtml_3_0=ruleSentenciaHTML();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTemplateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sentenciashtml",
            	    						lv_sentenciashtml_3_0,
            	    						"co.edu.uniandes.angular.AngularDsl.SentenciaHTML");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplate"


    // $ANTLR start "entryRuleSentenciaHTML"
    // InternalAngularDsl.g:1011:1: entryRuleSentenciaHTML returns [EObject current=null] : iv_ruleSentenciaHTML= ruleSentenciaHTML EOF ;
    public final EObject entryRuleSentenciaHTML() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentenciaHTML = null;


        try {
            // InternalAngularDsl.g:1011:54: (iv_ruleSentenciaHTML= ruleSentenciaHTML EOF )
            // InternalAngularDsl.g:1012:2: iv_ruleSentenciaHTML= ruleSentenciaHTML EOF
            {
             newCompositeNode(grammarAccess.getSentenciaHTMLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSentenciaHTML=ruleSentenciaHTML();

            state._fsp--;

             current =iv_ruleSentenciaHTML; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSentenciaHTML"


    // $ANTLR start "ruleSentenciaHTML"
    // InternalAngularDsl.g:1018:1: ruleSentenciaHTML returns [EObject current=null] : ( () this_MENOR_QUE_1= RULE_MENOR_QUE ( (lv_name_2_0= ruleEString ) ) ( (lv_propiedades_3_0= rulePropiedad ) )* ( (lv_directivas_4_0= ruleDirectiva ) )* (this_SLASH_5= RULE_SLASH )* this_MAYOR_QUE_6= RULE_MAYOR_QUE ( (lv_curlybraces_7_0= ruleCurlyBraces ) )* ( ( ruleEString ) )* (this_MENOR_QUE_9= RULE_MENOR_QUE this_SLASH_10= RULE_SLASH this_STRING_11= RULE_STRING this_MAYOR_QUE_12= RULE_MAYOR_QUE )? ) ;
    public final EObject ruleSentenciaHTML() throws RecognitionException {
        EObject current = null;

        Token this_MENOR_QUE_1=null;
        Token this_SLASH_5=null;
        Token this_MAYOR_QUE_6=null;
        Token this_MENOR_QUE_9=null;
        Token this_SLASH_10=null;
        Token this_STRING_11=null;
        Token this_MAYOR_QUE_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_propiedades_3_0 = null;

        EObject lv_directivas_4_0 = null;

        EObject lv_curlybraces_7_0 = null;



        	enterRule();

        try {
            // InternalAngularDsl.g:1024:2: ( ( () this_MENOR_QUE_1= RULE_MENOR_QUE ( (lv_name_2_0= ruleEString ) ) ( (lv_propiedades_3_0= rulePropiedad ) )* ( (lv_directivas_4_0= ruleDirectiva ) )* (this_SLASH_5= RULE_SLASH )* this_MAYOR_QUE_6= RULE_MAYOR_QUE ( (lv_curlybraces_7_0= ruleCurlyBraces ) )* ( ( ruleEString ) )* (this_MENOR_QUE_9= RULE_MENOR_QUE this_SLASH_10= RULE_SLASH this_STRING_11= RULE_STRING this_MAYOR_QUE_12= RULE_MAYOR_QUE )? ) )
            // InternalAngularDsl.g:1025:2: ( () this_MENOR_QUE_1= RULE_MENOR_QUE ( (lv_name_2_0= ruleEString ) ) ( (lv_propiedades_3_0= rulePropiedad ) )* ( (lv_directivas_4_0= ruleDirectiva ) )* (this_SLASH_5= RULE_SLASH )* this_MAYOR_QUE_6= RULE_MAYOR_QUE ( (lv_curlybraces_7_0= ruleCurlyBraces ) )* ( ( ruleEString ) )* (this_MENOR_QUE_9= RULE_MENOR_QUE this_SLASH_10= RULE_SLASH this_STRING_11= RULE_STRING this_MAYOR_QUE_12= RULE_MAYOR_QUE )? )
            {
            // InternalAngularDsl.g:1025:2: ( () this_MENOR_QUE_1= RULE_MENOR_QUE ( (lv_name_2_0= ruleEString ) ) ( (lv_propiedades_3_0= rulePropiedad ) )* ( (lv_directivas_4_0= ruleDirectiva ) )* (this_SLASH_5= RULE_SLASH )* this_MAYOR_QUE_6= RULE_MAYOR_QUE ( (lv_curlybraces_7_0= ruleCurlyBraces ) )* ( ( ruleEString ) )* (this_MENOR_QUE_9= RULE_MENOR_QUE this_SLASH_10= RULE_SLASH this_STRING_11= RULE_STRING this_MAYOR_QUE_12= RULE_MAYOR_QUE )? )
            // InternalAngularDsl.g:1026:3: () this_MENOR_QUE_1= RULE_MENOR_QUE ( (lv_name_2_0= ruleEString ) ) ( (lv_propiedades_3_0= rulePropiedad ) )* ( (lv_directivas_4_0= ruleDirectiva ) )* (this_SLASH_5= RULE_SLASH )* this_MAYOR_QUE_6= RULE_MAYOR_QUE ( (lv_curlybraces_7_0= ruleCurlyBraces ) )* ( ( ruleEString ) )* (this_MENOR_QUE_9= RULE_MENOR_QUE this_SLASH_10= RULE_SLASH this_STRING_11= RULE_STRING this_MAYOR_QUE_12= RULE_MAYOR_QUE )?
            {
            // InternalAngularDsl.g:1026:3: ()
            // InternalAngularDsl.g:1027:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSentenciaHTMLAccess().getSentenciaHTMLAction_0(),
            					current);
            			

            }

            this_MENOR_QUE_1=(Token)match(input,RULE_MENOR_QUE,FOLLOW_11); 

            			newLeafNode(this_MENOR_QUE_1, grammarAccess.getSentenciaHTMLAccess().getMENOR_QUETerminalRuleCall_1());
            		
            // InternalAngularDsl.g:1037:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAngularDsl.g:1038:4: (lv_name_2_0= ruleEString )
            {
            // InternalAngularDsl.g:1038:4: (lv_name_2_0= ruleEString )
            // InternalAngularDsl.g:1039:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSentenciaHTMLAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_31);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSentenciaHTMLRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"co.edu.uniandes.angular.AngularDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAngularDsl.g:1056:3: ( (lv_propiedades_3_0= rulePropiedad ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING||LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAngularDsl.g:1057:4: (lv_propiedades_3_0= rulePropiedad )
            	    {
            	    // InternalAngularDsl.g:1057:4: (lv_propiedades_3_0= rulePropiedad )
            	    // InternalAngularDsl.g:1058:5: lv_propiedades_3_0= rulePropiedad
            	    {

            	    					newCompositeNode(grammarAccess.getSentenciaHTMLAccess().getPropiedadesPropiedadParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_propiedades_3_0=rulePropiedad();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSentenciaHTMLRule());
            	    					}
            	    					add(
            	    						current,
            	    						"propiedades",
            	    						lv_propiedades_3_0,
            	    						"co.edu.uniandes.angular.AngularDsl.Propiedad");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalAngularDsl.g:1075:3: ( (lv_directivas_4_0= ruleDirectiva ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==39) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAngularDsl.g:1076:4: (lv_directivas_4_0= ruleDirectiva )
            	    {
            	    // InternalAngularDsl.g:1076:4: (lv_directivas_4_0= ruleDirectiva )
            	    // InternalAngularDsl.g:1077:5: lv_directivas_4_0= ruleDirectiva
            	    {

            	    					newCompositeNode(grammarAccess.getSentenciaHTMLAccess().getDirectivasDirectivaParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_directivas_4_0=ruleDirectiva();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSentenciaHTMLRule());
            	    					}
            	    					add(
            	    						current,
            	    						"directivas",
            	    						lv_directivas_4_0,
            	    						"co.edu.uniandes.angular.AngularDsl.Directiva");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalAngularDsl.g:1094:3: (this_SLASH_5= RULE_SLASH )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_SLASH) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAngularDsl.g:1095:4: this_SLASH_5= RULE_SLASH
            	    {
            	    this_SLASH_5=(Token)match(input,RULE_SLASH,FOLLOW_33); 

            	    				newLeafNode(this_SLASH_5, grammarAccess.getSentenciaHTMLAccess().getSLASHTerminalRuleCall_5());
            	    			

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            this_MAYOR_QUE_6=(Token)match(input,RULE_MAYOR_QUE,FOLLOW_34); 

            			newLeafNode(this_MAYOR_QUE_6, grammarAccess.getSentenciaHTMLAccess().getMAYOR_QUETerminalRuleCall_6());
            		
            // InternalAngularDsl.g:1104:3: ( (lv_curlybraces_7_0= ruleCurlyBraces ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_DOBLE_LLAVE_IZQUIERDA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAngularDsl.g:1105:4: (lv_curlybraces_7_0= ruleCurlyBraces )
            	    {
            	    // InternalAngularDsl.g:1105:4: (lv_curlybraces_7_0= ruleCurlyBraces )
            	    // InternalAngularDsl.g:1106:5: lv_curlybraces_7_0= ruleCurlyBraces
            	    {

            	    					newCompositeNode(grammarAccess.getSentenciaHTMLAccess().getCurlybracesCurlyBracesParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_curlybraces_7_0=ruleCurlyBraces();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSentenciaHTMLRule());
            	    					}
            	    					add(
            	    						current,
            	    						"curlybraces",
            	    						lv_curlybraces_7_0,
            	    						"co.edu.uniandes.angular.AngularDsl.CurlyBraces");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalAngularDsl.g:1123:3: ( ( ruleEString ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STRING||LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAngularDsl.g:1124:4: ( ruleEString )
            	    {
            	    // InternalAngularDsl.g:1124:4: ( ruleEString )
            	    // InternalAngularDsl.g:1125:5: ruleEString
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getSentenciaHTMLRule());
            	    					}
            	    				

            	    					newCompositeNode(grammarAccess.getSentenciaHTMLAccess().getSentenciashtmlSentenciaHTMLCrossReference_8_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    ruleEString();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalAngularDsl.g:1139:3: (this_MENOR_QUE_9= RULE_MENOR_QUE this_SLASH_10= RULE_SLASH this_STRING_11= RULE_STRING this_MAYOR_QUE_12= RULE_MAYOR_QUE )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_MENOR_QUE) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==RULE_SLASH) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalAngularDsl.g:1140:4: this_MENOR_QUE_9= RULE_MENOR_QUE this_SLASH_10= RULE_SLASH this_STRING_11= RULE_STRING this_MAYOR_QUE_12= RULE_MAYOR_QUE
                    {
                    this_MENOR_QUE_9=(Token)match(input,RULE_MENOR_QUE,FOLLOW_36); 

                    				newLeafNode(this_MENOR_QUE_9, grammarAccess.getSentenciaHTMLAccess().getMENOR_QUETerminalRuleCall_9_0());
                    			
                    this_SLASH_10=(Token)match(input,RULE_SLASH,FOLLOW_37); 

                    				newLeafNode(this_SLASH_10, grammarAccess.getSentenciaHTMLAccess().getSLASHTerminalRuleCall_9_1());
                    			
                    this_STRING_11=(Token)match(input,RULE_STRING,FOLLOW_38); 

                    				newLeafNode(this_STRING_11, grammarAccess.getSentenciaHTMLAccess().getSTRINGTerminalRuleCall_9_2());
                    			
                    this_MAYOR_QUE_12=(Token)match(input,RULE_MAYOR_QUE,FOLLOW_2); 

                    				newLeafNode(this_MAYOR_QUE_12, grammarAccess.getSentenciaHTMLAccess().getMAYOR_QUETerminalRuleCall_9_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSentenciaHTML"


    // $ANTLR start "entryRuleDirectiva"
    // InternalAngularDsl.g:1161:1: entryRuleDirectiva returns [EObject current=null] : iv_ruleDirectiva= ruleDirectiva EOF ;
    public final EObject entryRuleDirectiva() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectiva = null;


        try {
            // InternalAngularDsl.g:1161:50: (iv_ruleDirectiva= ruleDirectiva EOF )
            // InternalAngularDsl.g:1162:2: iv_ruleDirectiva= ruleDirectiva EOF
            {
             newCompositeNode(grammarAccess.getDirectivaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectiva=ruleDirectiva();

            state._fsp--;

             current =iv_ruleDirectiva; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirectiva"


    // $ANTLR start "ruleDirectiva"
    // InternalAngularDsl.g:1168:1: ruleDirectiva returns [EObject current=null] : ( () otherlv_1= 'ng-' ( (lv_name_2_0= ruleEString ) ) this_IGUAL_3= RULE_IGUAL ( ( ruleEString ) )? ( ( ruleEString ) ) ) ;
    public final EObject ruleDirectiva() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_IGUAL_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalAngularDsl.g:1174:2: ( ( () otherlv_1= 'ng-' ( (lv_name_2_0= ruleEString ) ) this_IGUAL_3= RULE_IGUAL ( ( ruleEString ) )? ( ( ruleEString ) ) ) )
            // InternalAngularDsl.g:1175:2: ( () otherlv_1= 'ng-' ( (lv_name_2_0= ruleEString ) ) this_IGUAL_3= RULE_IGUAL ( ( ruleEString ) )? ( ( ruleEString ) ) )
            {
            // InternalAngularDsl.g:1175:2: ( () otherlv_1= 'ng-' ( (lv_name_2_0= ruleEString ) ) this_IGUAL_3= RULE_IGUAL ( ( ruleEString ) )? ( ( ruleEString ) ) )
            // InternalAngularDsl.g:1176:3: () otherlv_1= 'ng-' ( (lv_name_2_0= ruleEString ) ) this_IGUAL_3= RULE_IGUAL ( ( ruleEString ) )? ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:1176:3: ()
            // InternalAngularDsl.g:1177:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDirectivaAccess().getDirectivaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDirectivaAccess().getNgKeyword_1());
            		
            // InternalAngularDsl.g:1187:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAngularDsl.g:1188:4: (lv_name_2_0= ruleEString )
            {
            // InternalAngularDsl.g:1188:4: (lv_name_2_0= ruleEString )
            // InternalAngularDsl.g:1189:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDirectivaAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDirectivaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"co.edu.uniandes.angular.AngularDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_IGUAL_3=(Token)match(input,RULE_IGUAL,FOLLOW_11); 

            			newLeafNode(this_IGUAL_3, grammarAccess.getDirectivaAccess().getIGUALTerminalRuleCall_3());
            		
            // InternalAngularDsl.g:1210:3: ( ( ruleEString ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_STRING||LA19_1==RULE_ID) ) {
                    alt19=1;
                }
            }
            else if ( (LA19_0==RULE_ID) ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==RULE_STRING||LA19_2==RULE_ID) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalAngularDsl.g:1211:4: ( ruleEString )
                    {
                    // InternalAngularDsl.g:1211:4: ( ruleEString )
                    // InternalAngularDsl.g:1212:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDirectivaRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getDirectivaAccess().getCurlybracesCurlyBracesCrossReference_4_0());
                    				
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAngularDsl.g:1226:3: ( ( ruleEString ) )
            // InternalAngularDsl.g:1227:4: ( ruleEString )
            {
            // InternalAngularDsl.g:1227:4: ( ruleEString )
            // InternalAngularDsl.g:1228:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectivaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDirectivaAccess().getReferenciaObjetoAngularCrossReference_5_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectiva"


    // $ANTLR start "entryRulePropiedad"
    // InternalAngularDsl.g:1246:1: entryRulePropiedad returns [EObject current=null] : iv_rulePropiedad= rulePropiedad EOF ;
    public final EObject entryRulePropiedad() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropiedad = null;


        try {
            // InternalAngularDsl.g:1246:50: (iv_rulePropiedad= rulePropiedad EOF )
            // InternalAngularDsl.g:1247:2: iv_rulePropiedad= rulePropiedad EOF
            {
             newCompositeNode(grammarAccess.getPropiedadRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropiedad=rulePropiedad();

            state._fsp--;

             current =iv_rulePropiedad; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropiedad"


    // $ANTLR start "rulePropiedad"
    // InternalAngularDsl.g:1253:1: rulePropiedad returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) this_IGUAL_2= RULE_IGUAL this_STRING_3= RULE_STRING ) ;
    public final EObject rulePropiedad() throws RecognitionException {
        EObject current = null;

        Token this_IGUAL_2=null;
        Token this_STRING_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAngularDsl.g:1259:2: ( ( () ( (lv_name_1_0= ruleEString ) ) this_IGUAL_2= RULE_IGUAL this_STRING_3= RULE_STRING ) )
            // InternalAngularDsl.g:1260:2: ( () ( (lv_name_1_0= ruleEString ) ) this_IGUAL_2= RULE_IGUAL this_STRING_3= RULE_STRING )
            {
            // InternalAngularDsl.g:1260:2: ( () ( (lv_name_1_0= ruleEString ) ) this_IGUAL_2= RULE_IGUAL this_STRING_3= RULE_STRING )
            // InternalAngularDsl.g:1261:3: () ( (lv_name_1_0= ruleEString ) ) this_IGUAL_2= RULE_IGUAL this_STRING_3= RULE_STRING
            {
            // InternalAngularDsl.g:1261:3: ()
            // InternalAngularDsl.g:1262:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropiedadAccess().getPropiedadAction_0(),
            					current);
            			

            }

            // InternalAngularDsl.g:1268:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAngularDsl.g:1269:4: (lv_name_1_0= ruleEString )
            {
            // InternalAngularDsl.g:1269:4: (lv_name_1_0= ruleEString )
            // InternalAngularDsl.g:1270:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPropiedadAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropiedadRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"co.edu.uniandes.angular.AngularDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_IGUAL_2=(Token)match(input,RULE_IGUAL,FOLLOW_37); 

            			newLeafNode(this_IGUAL_2, grammarAccess.getPropiedadAccess().getIGUALTerminalRuleCall_2());
            		
            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(this_STRING_3, grammarAccess.getPropiedadAccess().getSTRINGTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropiedad"


    // $ANTLR start "entryRuleCurlyBraces"
    // InternalAngularDsl.g:1299:1: entryRuleCurlyBraces returns [EObject current=null] : iv_ruleCurlyBraces= ruleCurlyBraces EOF ;
    public final EObject entryRuleCurlyBraces() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurlyBraces = null;


        try {
            // InternalAngularDsl.g:1299:52: (iv_ruleCurlyBraces= ruleCurlyBraces EOF )
            // InternalAngularDsl.g:1300:2: iv_ruleCurlyBraces= ruleCurlyBraces EOF
            {
             newCompositeNode(grammarAccess.getCurlyBracesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCurlyBraces=ruleCurlyBraces();

            state._fsp--;

             current =iv_ruleCurlyBraces; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCurlyBraces"


    // $ANTLR start "ruleCurlyBraces"
    // InternalAngularDsl.g:1306:1: ruleCurlyBraces returns [EObject current=null] : (this_DOBLE_LLAVE_IZQUIERDA_0= RULE_DOBLE_LLAVE_IZQUIERDA (otherlv_1= '$' )? ( (lv_expresion_2_0= ruleExpresion ) ) ( (lv_filtro_3_0= ruleFiltro ) )? this_DOBLE_LLAVE_DERECHA_4= RULE_DOBLE_LLAVE_DERECHA ) ;
    public final EObject ruleCurlyBraces() throws RecognitionException {
        EObject current = null;

        Token this_DOBLE_LLAVE_IZQUIERDA_0=null;
        Token otherlv_1=null;
        Token this_DOBLE_LLAVE_DERECHA_4=null;
        EObject lv_expresion_2_0 = null;

        EObject lv_filtro_3_0 = null;



        	enterRule();

        try {
            // InternalAngularDsl.g:1312:2: ( (this_DOBLE_LLAVE_IZQUIERDA_0= RULE_DOBLE_LLAVE_IZQUIERDA (otherlv_1= '$' )? ( (lv_expresion_2_0= ruleExpresion ) ) ( (lv_filtro_3_0= ruleFiltro ) )? this_DOBLE_LLAVE_DERECHA_4= RULE_DOBLE_LLAVE_DERECHA ) )
            // InternalAngularDsl.g:1313:2: (this_DOBLE_LLAVE_IZQUIERDA_0= RULE_DOBLE_LLAVE_IZQUIERDA (otherlv_1= '$' )? ( (lv_expresion_2_0= ruleExpresion ) ) ( (lv_filtro_3_0= ruleFiltro ) )? this_DOBLE_LLAVE_DERECHA_4= RULE_DOBLE_LLAVE_DERECHA )
            {
            // InternalAngularDsl.g:1313:2: (this_DOBLE_LLAVE_IZQUIERDA_0= RULE_DOBLE_LLAVE_IZQUIERDA (otherlv_1= '$' )? ( (lv_expresion_2_0= ruleExpresion ) ) ( (lv_filtro_3_0= ruleFiltro ) )? this_DOBLE_LLAVE_DERECHA_4= RULE_DOBLE_LLAVE_DERECHA )
            // InternalAngularDsl.g:1314:3: this_DOBLE_LLAVE_IZQUIERDA_0= RULE_DOBLE_LLAVE_IZQUIERDA (otherlv_1= '$' )? ( (lv_expresion_2_0= ruleExpresion ) ) ( (lv_filtro_3_0= ruleFiltro ) )? this_DOBLE_LLAVE_DERECHA_4= RULE_DOBLE_LLAVE_DERECHA
            {
            this_DOBLE_LLAVE_IZQUIERDA_0=(Token)match(input,RULE_DOBLE_LLAVE_IZQUIERDA,FOLLOW_39); 

            			newLeafNode(this_DOBLE_LLAVE_IZQUIERDA_0, grammarAccess.getCurlyBracesAccess().getDOBLE_LLAVE_IZQUIERDATerminalRuleCall_0());
            		
            // InternalAngularDsl.g:1318:3: (otherlv_1= '$' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAngularDsl.g:1319:4: otherlv_1= '$'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_39); 

                    				newLeafNode(otherlv_1, grammarAccess.getCurlyBracesAccess().getDollarSignKeyword_1());
                    			

                    }
                    break;

            }

            // InternalAngularDsl.g:1324:3: ( (lv_expresion_2_0= ruleExpresion ) )
            // InternalAngularDsl.g:1325:4: (lv_expresion_2_0= ruleExpresion )
            {
            // InternalAngularDsl.g:1325:4: (lv_expresion_2_0= ruleExpresion )
            // InternalAngularDsl.g:1326:5: lv_expresion_2_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getCurlyBracesAccess().getExpresionExpresionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_40);
            lv_expresion_2_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCurlyBracesRule());
            					}
            					set(
            						current,
            						"expresion",
            						lv_expresion_2_0,
            						"co.edu.uniandes.angular.AngularDsl.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAngularDsl.g:1343:3: ( (lv_filtro_3_0= ruleFiltro ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==41) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAngularDsl.g:1344:4: (lv_filtro_3_0= ruleFiltro )
                    {
                    // InternalAngularDsl.g:1344:4: (lv_filtro_3_0= ruleFiltro )
                    // InternalAngularDsl.g:1345:5: lv_filtro_3_0= ruleFiltro
                    {

                    					newCompositeNode(grammarAccess.getCurlyBracesAccess().getFiltroFiltroParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_41);
                    lv_filtro_3_0=ruleFiltro();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCurlyBracesRule());
                    					}
                    					set(
                    						current,
                    						"filtro",
                    						lv_filtro_3_0,
                    						"co.edu.uniandes.angular.AngularDsl.Filtro");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_DOBLE_LLAVE_DERECHA_4=(Token)match(input,RULE_DOBLE_LLAVE_DERECHA,FOLLOW_2); 

            			newLeafNode(this_DOBLE_LLAVE_DERECHA_4, grammarAccess.getCurlyBracesAccess().getDOBLE_LLAVE_DERECHATerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCurlyBraces"


    // $ANTLR start "entryRuleExpresion"
    // InternalAngularDsl.g:1370:1: entryRuleExpresion returns [EObject current=null] : iv_ruleExpresion= ruleExpresion EOF ;
    public final EObject entryRuleExpresion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresion = null;


        try {
            // InternalAngularDsl.g:1370:50: (iv_ruleExpresion= ruleExpresion EOF )
            // InternalAngularDsl.g:1371:2: iv_ruleExpresion= ruleExpresion EOF
            {
             newCompositeNode(grammarAccess.getExpresionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresion=ruleExpresion();

            state._fsp--;

             current =iv_ruleExpresion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresion"


    // $ANTLR start "ruleExpresion"
    // InternalAngularDsl.g:1377:1: ruleExpresion returns [EObject current=null] : ( () ( (lv_valor_1_0= ruleEString ) ) ( ( ruleEString ) ) ) ;
    public final EObject ruleExpresion() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_valor_1_0 = null;



        	enterRule();

        try {
            // InternalAngularDsl.g:1383:2: ( ( () ( (lv_valor_1_0= ruleEString ) ) ( ( ruleEString ) ) ) )
            // InternalAngularDsl.g:1384:2: ( () ( (lv_valor_1_0= ruleEString ) ) ( ( ruleEString ) ) )
            {
            // InternalAngularDsl.g:1384:2: ( () ( (lv_valor_1_0= ruleEString ) ) ( ( ruleEString ) ) )
            // InternalAngularDsl.g:1385:3: () ( (lv_valor_1_0= ruleEString ) ) ( ( ruleEString ) )
            {
            // InternalAngularDsl.g:1385:3: ()
            // InternalAngularDsl.g:1386:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpresionAccess().getExpresionAction_0(),
            					current);
            			

            }

            // InternalAngularDsl.g:1392:3: ( (lv_valor_1_0= ruleEString ) )
            // InternalAngularDsl.g:1393:4: (lv_valor_1_0= ruleEString )
            {
            // InternalAngularDsl.g:1393:4: (lv_valor_1_0= ruleEString )
            // InternalAngularDsl.g:1394:5: lv_valor_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExpresionAccess().getValorEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_valor_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpresionRule());
            					}
            					set(
            						current,
            						"valor",
            						lv_valor_1_0,
            						"co.edu.uniandes.angular.AngularDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAngularDsl.g:1411:3: ( ( ruleEString ) )
            // InternalAngularDsl.g:1412:4: ( ruleEString )
            {
            // InternalAngularDsl.g:1412:4: ( ruleEString )
            // InternalAngularDsl.g:1413:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpresionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExpresionAccess().getReferenciaObjetoAngularCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresion"


    // $ANTLR start "entryRuleFiltro"
    // InternalAngularDsl.g:1431:1: entryRuleFiltro returns [EObject current=null] : iv_ruleFiltro= ruleFiltro EOF ;
    public final EObject entryRuleFiltro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFiltro = null;


        try {
            // InternalAngularDsl.g:1431:47: (iv_ruleFiltro= ruleFiltro EOF )
            // InternalAngularDsl.g:1432:2: iv_ruleFiltro= ruleFiltro EOF
            {
             newCompositeNode(grammarAccess.getFiltroRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFiltro=ruleFiltro();

            state._fsp--;

             current =iv_ruleFiltro; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFiltro"


    // $ANTLR start "ruleFiltro"
    // InternalAngularDsl.g:1438:1: ruleFiltro returns [EObject current=null] : ( () otherlv_1= '|' ( (lv_parametros_2_0= ruleEString ) ) ) ;
    public final EObject ruleFiltro() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_parametros_2_0 = null;



        	enterRule();

        try {
            // InternalAngularDsl.g:1444:2: ( ( () otherlv_1= '|' ( (lv_parametros_2_0= ruleEString ) ) ) )
            // InternalAngularDsl.g:1445:2: ( () otherlv_1= '|' ( (lv_parametros_2_0= ruleEString ) ) )
            {
            // InternalAngularDsl.g:1445:2: ( () otherlv_1= '|' ( (lv_parametros_2_0= ruleEString ) ) )
            // InternalAngularDsl.g:1446:3: () otherlv_1= '|' ( (lv_parametros_2_0= ruleEString ) )
            {
            // InternalAngularDsl.g:1446:3: ()
            // InternalAngularDsl.g:1447:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFiltroAccess().getFiltroAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getFiltroAccess().getVerticalLineKeyword_1());
            		
            // InternalAngularDsl.g:1457:3: ( (lv_parametros_2_0= ruleEString ) )
            // InternalAngularDsl.g:1458:4: (lv_parametros_2_0= ruleEString )
            {
            // InternalAngularDsl.g:1458:4: (lv_parametros_2_0= ruleEString )
            // InternalAngularDsl.g:1459:5: lv_parametros_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFiltroAccess().getParametrosEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_parametros_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFiltroRule());
            					}
            					set(
            						current,
            						"parametros",
            						lv_parametros_2_0,
            						"co.edu.uniandes.angular.AngularDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFiltro"


    // $ANTLR start "entryRuleEString"
    // InternalAngularDsl.g:1480:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAngularDsl.g:1480:47: (iv_ruleEString= ruleEString EOF )
            // InternalAngularDsl.g:1481:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalAngularDsl.g:1487:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAngularDsl.g:1493:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAngularDsl.g:1494:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAngularDsl.g:1494:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalAngularDsl.g:1495:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAngularDsl.g:1503:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\4\1\5\1\11\1\uffff\1\6\1\12\1\4\1\13\1\7\1\34\1\10\2\14\1\11\1\uffff\1\20\2\uffff";
    static final String dfa_3s = "\1\37\1\5\1\11\1\uffff\1\6\1\12\1\4\1\13\1\7\1\37\1\10\2\17\1\11\1\uffff\1\45\2\uffff";
    static final String dfa_4s = "\3\uffff\1\4\12\uffff\1\1\1\uffff\1\3\1\2";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\3\uffff\1\2\23\uffff\1\3\2\uffff\1\3",
            "\1\4",
            "\1\5",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13\2\uffff\1\14",
            "\1\2",
            "\1\16\2\uffff\1\15",
            "\1\16\2\uffff\1\15",
            "\1\17",
            "",
            "\1\21\24\uffff\1\20",
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
            return "78:2: ( ( (lv_modulos_0_0= ruleModulo ) ) | ( (lv_componentes_1_0= ruleComponente ) ) | ( (lv_services_2_0= ruleService ) ) | ( (lv_templates_3_0= ruleTemplate ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000090004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000090005000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000090001000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000090800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000809C000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000800C000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000B2000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000092000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010090000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020040000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000040000000L});

}