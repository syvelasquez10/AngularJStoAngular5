package co.edu.uniandes.angular.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAngularDslLexer extends Lexer {
    public static final int RULE_LLAVE_IZQUIERDA=17;
    public static final int RULE_COMA=12;
    public static final int RULE_FUNCTION=22;
    public static final int RULE_TEMPLATE_URL=18;
    public static final int RULE_CONTROLLER=20;
    public static final int RULE_PARENTESIS_CUADRADO_IZQUIERDO=13;
    public static final int RULE_PARENTESIS_DERECHO=15;
    public static final int RULE_STRING=23;
    public static final int RULE_COMILLAS=4;
    public static final int RULE_COMPONENT=16;
    public static final int RULE_SL_COMMENT=27;
    public static final int RULE_STRICT=6;
    public static final int T__37=37;
    public static final int RULE_PUNTO_Y_COMA=7;
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
    public static final int RULE_USE=5;
    public static final int RULE_ID=24;
    public static final int RULE_PARENTESIS_IZQUIERDO=11;
    public static final int RULE_WS=28;
    public static final int RULE_ANY_OTHER=29;
    public static final int RULE_PUNTO=9;
    public static final int RULE_DOS_PUNTOS=19;
    public static final int RULE_INT=25;
    public static final int RULE_PARENTESIS_CUADRADO_DERECHO=14;
    public static final int RULE_ML_COMMENT=26;
    public static final int RULE_LLAVE_DERECHA=21;
    public static final int RULE_ANGULAR=8;
    public static final int RULE_MODULE=10;
    public static final int T__40=40;
    public static final int T__41=41;

    // delegates
    // delegators

    public InternalAngularDslLexer() {;} 
    public InternalAngularDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAngularDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalAngularDsl.g"; }

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:11:7: ( 'factory' )
            // InternalAngularDsl.g:11:9: 'factory'
            {
            match("factory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:12:7: ( 'var' )
            // InternalAngularDsl.g:12:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:13:7: ( '=' )
            // InternalAngularDsl.g:13:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:14:7: ( '*' )
            // InternalAngularDsl.g:14:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:15:7: ( '<' )
            // InternalAngularDsl.g:15:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:16:7: ( '/' )
            // InternalAngularDsl.g:16:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:17:7: ( '>' )
            // InternalAngularDsl.g:17:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:18:7: ( '</' )
            // InternalAngularDsl.g:18:9: '</'
            {
            match("</"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:19:7: ( 'ng-' )
            // InternalAngularDsl.g:19:9: 'ng-'
            {
            match("ng-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:20:7: ( '{{' )
            // InternalAngularDsl.g:20:9: '{{'
            {
            match("{{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:21:7: ( '}}' )
            // InternalAngularDsl.g:21:9: '}}'
            {
            match("}}"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:22:7: ( '|' )
            // InternalAngularDsl.g:22:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "RULE_USE"
    public final void mRULE_USE() throws RecognitionException {
        try {
            int _type = RULE_USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1510:10: ( 'use' )
            // InternalAngularDsl.g:1510:12: 'use'
            {
            match("use"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_USE"

    // $ANTLR start "RULE_STRICT"
    public final void mRULE_STRICT() throws RecognitionException {
        try {
            int _type = RULE_STRICT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1512:13: ( 'strict' )
            // InternalAngularDsl.g:1512:15: 'strict'
            {
            match("strict"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRICT"

    // $ANTLR start "RULE_COMILLAS"
    public final void mRULE_COMILLAS() throws RecognitionException {
        try {
            int _type = RULE_COMILLAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1514:15: ( '\\'' )
            // InternalAngularDsl.g:1514:17: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMILLAS"

    // $ANTLR start "RULE_PUNTO_Y_COMA"
    public final void mRULE_PUNTO_Y_COMA() throws RecognitionException {
        try {
            int _type = RULE_PUNTO_Y_COMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1516:19: ( ';' )
            // InternalAngularDsl.g:1516:21: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PUNTO_Y_COMA"

    // $ANTLR start "RULE_PUNTO"
    public final void mRULE_PUNTO() throws RecognitionException {
        try {
            int _type = RULE_PUNTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1518:12: ( '.' )
            // InternalAngularDsl.g:1518:14: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PUNTO"

    // $ANTLR start "RULE_COMA"
    public final void mRULE_COMA() throws RecognitionException {
        try {
            int _type = RULE_COMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1520:11: ( ',' )
            // InternalAngularDsl.g:1520:13: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMA"

    // $ANTLR start "RULE_DOS_PUNTOS"
    public final void mRULE_DOS_PUNTOS() throws RecognitionException {
        try {
            int _type = RULE_DOS_PUNTOS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1522:17: ( ':' )
            // InternalAngularDsl.g:1522:19: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOS_PUNTOS"

    // $ANTLR start "RULE_ANGULAR"
    public final void mRULE_ANGULAR() throws RecognitionException {
        try {
            int _type = RULE_ANGULAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1524:14: ( 'angular' )
            // InternalAngularDsl.g:1524:16: 'angular'
            {
            match("angular"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANGULAR"

    // $ANTLR start "RULE_MODULE"
    public final void mRULE_MODULE() throws RecognitionException {
        try {
            int _type = RULE_MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1526:13: ( 'module' )
            // InternalAngularDsl.g:1526:15: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MODULE"

    // $ANTLR start "RULE_PARENTESIS_IZQUIERDO"
    public final void mRULE_PARENTESIS_IZQUIERDO() throws RecognitionException {
        try {
            int _type = RULE_PARENTESIS_IZQUIERDO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1528:27: ( '(' )
            // InternalAngularDsl.g:1528:29: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PARENTESIS_IZQUIERDO"

    // $ANTLR start "RULE_PARENTESIS_DERECHO"
    public final void mRULE_PARENTESIS_DERECHO() throws RecognitionException {
        try {
            int _type = RULE_PARENTESIS_DERECHO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1530:25: ( ')' )
            // InternalAngularDsl.g:1530:27: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PARENTESIS_DERECHO"

    // $ANTLR start "RULE_COMPONENT"
    public final void mRULE_COMPONENT() throws RecognitionException {
        try {
            int _type = RULE_COMPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1532:16: ( 'component' )
            // InternalAngularDsl.g:1532:18: 'component'
            {
            match("component"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMPONENT"

    // $ANTLR start "RULE_LLAVE_IZQUIERDA"
    public final void mRULE_LLAVE_IZQUIERDA() throws RecognitionException {
        try {
            int _type = RULE_LLAVE_IZQUIERDA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1534:22: ( '{' )
            // InternalAngularDsl.g:1534:24: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LLAVE_IZQUIERDA"

    // $ANTLR start "RULE_LLAVE_DERECHA"
    public final void mRULE_LLAVE_DERECHA() throws RecognitionException {
        try {
            int _type = RULE_LLAVE_DERECHA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1536:20: ( '}' )
            // InternalAngularDsl.g:1536:22: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LLAVE_DERECHA"

    // $ANTLR start "RULE_TEMPLATE_URL"
    public final void mRULE_TEMPLATE_URL() throws RecognitionException {
        try {
            int _type = RULE_TEMPLATE_URL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1538:19: ( 'templateUrl' )
            // InternalAngularDsl.g:1538:21: 'templateUrl'
            {
            match("templateUrl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEMPLATE_URL"

    // $ANTLR start "RULE_CONTROLLER"
    public final void mRULE_CONTROLLER() throws RecognitionException {
        try {
            int _type = RULE_CONTROLLER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1540:17: ( 'controller' )
            // InternalAngularDsl.g:1540:19: 'controller'
            {
            match("controller"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONTROLLER"

    // $ANTLR start "RULE_PARENTESIS_CUADRADO_IZQUIERDO"
    public final void mRULE_PARENTESIS_CUADRADO_IZQUIERDO() throws RecognitionException {
        try {
            int _type = RULE_PARENTESIS_CUADRADO_IZQUIERDO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1542:36: ( '[' )
            // InternalAngularDsl.g:1542:38: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PARENTESIS_CUADRADO_IZQUIERDO"

    // $ANTLR start "RULE_PARENTESIS_CUADRADO_DERECHO"
    public final void mRULE_PARENTESIS_CUADRADO_DERECHO() throws RecognitionException {
        try {
            int _type = RULE_PARENTESIS_CUADRADO_DERECHO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1544:34: ( ']' )
            // InternalAngularDsl.g:1544:36: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PARENTESIS_CUADRADO_DERECHO"

    // $ANTLR start "RULE_FUNCTION"
    public final void mRULE_FUNCTION() throws RecognitionException {
        try {
            int _type = RULE_FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1546:15: ( 'function' )
            // InternalAngularDsl.g:1546:17: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FUNCTION"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1548:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAngularDsl.g:1548:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalAngularDsl.g:1548:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAngularDsl.g:1548:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAngularDsl.g:1548:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAngularDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1550:10: ( ( '0' .. '9' )+ )
            // InternalAngularDsl.g:1550:12: ( '0' .. '9' )+
            {
            // InternalAngularDsl.g:1550:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAngularDsl.g:1550:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1552:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalAngularDsl.g:1552:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalAngularDsl.g:1552:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAngularDsl.g:1552:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalAngularDsl.g:1552:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalAngularDsl.g:1552:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAngularDsl.g:1552:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalAngularDsl.g:1552:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalAngularDsl.g:1552:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalAngularDsl.g:1552:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAngularDsl.g:1552:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1554:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAngularDsl.g:1554:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAngularDsl.g:1554:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAngularDsl.g:1554:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1556:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAngularDsl.g:1556:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAngularDsl.g:1556:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAngularDsl.g:1556:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalAngularDsl.g:1556:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAngularDsl.g:1556:41: ( '\\r' )? '\\n'
                    {
                    // InternalAngularDsl.g:1556:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalAngularDsl.g:1556:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1558:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAngularDsl.g:1558:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAngularDsl.g:1558:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAngularDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1560:16: ( . )
            // InternalAngularDsl.g:1560:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalAngularDsl.g:1:8: ( T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_USE | RULE_STRICT | RULE_COMILLAS | RULE_PUNTO_Y_COMA | RULE_PUNTO | RULE_COMA | RULE_DOS_PUNTOS | RULE_ANGULAR | RULE_MODULE | RULE_PARENTESIS_IZQUIERDO | RULE_PARENTESIS_DERECHO | RULE_COMPONENT | RULE_LLAVE_IZQUIERDA | RULE_LLAVE_DERECHA | RULE_TEMPLATE_URL | RULE_CONTROLLER | RULE_PARENTESIS_CUADRADO_IZQUIERDO | RULE_PARENTESIS_CUADRADO_DERECHO | RULE_FUNCTION | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=38;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalAngularDsl.g:1:10: T__30
                {
                mT__30(); 

                }
                break;
            case 2 :
                // InternalAngularDsl.g:1:16: T__31
                {
                mT__31(); 

                }
                break;
            case 3 :
                // InternalAngularDsl.g:1:22: T__32
                {
                mT__32(); 

                }
                break;
            case 4 :
                // InternalAngularDsl.g:1:28: T__33
                {
                mT__33(); 

                }
                break;
            case 5 :
                // InternalAngularDsl.g:1:34: T__34
                {
                mT__34(); 

                }
                break;
            case 6 :
                // InternalAngularDsl.g:1:40: T__35
                {
                mT__35(); 

                }
                break;
            case 7 :
                // InternalAngularDsl.g:1:46: T__36
                {
                mT__36(); 

                }
                break;
            case 8 :
                // InternalAngularDsl.g:1:52: T__37
                {
                mT__37(); 

                }
                break;
            case 9 :
                // InternalAngularDsl.g:1:58: T__38
                {
                mT__38(); 

                }
                break;
            case 10 :
                // InternalAngularDsl.g:1:64: T__39
                {
                mT__39(); 

                }
                break;
            case 11 :
                // InternalAngularDsl.g:1:70: T__40
                {
                mT__40(); 

                }
                break;
            case 12 :
                // InternalAngularDsl.g:1:76: T__41
                {
                mT__41(); 

                }
                break;
            case 13 :
                // InternalAngularDsl.g:1:82: RULE_USE
                {
                mRULE_USE(); 

                }
                break;
            case 14 :
                // InternalAngularDsl.g:1:91: RULE_STRICT
                {
                mRULE_STRICT(); 

                }
                break;
            case 15 :
                // InternalAngularDsl.g:1:103: RULE_COMILLAS
                {
                mRULE_COMILLAS(); 

                }
                break;
            case 16 :
                // InternalAngularDsl.g:1:117: RULE_PUNTO_Y_COMA
                {
                mRULE_PUNTO_Y_COMA(); 

                }
                break;
            case 17 :
                // InternalAngularDsl.g:1:135: RULE_PUNTO
                {
                mRULE_PUNTO(); 

                }
                break;
            case 18 :
                // InternalAngularDsl.g:1:146: RULE_COMA
                {
                mRULE_COMA(); 

                }
                break;
            case 19 :
                // InternalAngularDsl.g:1:156: RULE_DOS_PUNTOS
                {
                mRULE_DOS_PUNTOS(); 

                }
                break;
            case 20 :
                // InternalAngularDsl.g:1:172: RULE_ANGULAR
                {
                mRULE_ANGULAR(); 

                }
                break;
            case 21 :
                // InternalAngularDsl.g:1:185: RULE_MODULE
                {
                mRULE_MODULE(); 

                }
                break;
            case 22 :
                // InternalAngularDsl.g:1:197: RULE_PARENTESIS_IZQUIERDO
                {
                mRULE_PARENTESIS_IZQUIERDO(); 

                }
                break;
            case 23 :
                // InternalAngularDsl.g:1:223: RULE_PARENTESIS_DERECHO
                {
                mRULE_PARENTESIS_DERECHO(); 

                }
                break;
            case 24 :
                // InternalAngularDsl.g:1:247: RULE_COMPONENT
                {
                mRULE_COMPONENT(); 

                }
                break;
            case 25 :
                // InternalAngularDsl.g:1:262: RULE_LLAVE_IZQUIERDA
                {
                mRULE_LLAVE_IZQUIERDA(); 

                }
                break;
            case 26 :
                // InternalAngularDsl.g:1:283: RULE_LLAVE_DERECHA
                {
                mRULE_LLAVE_DERECHA(); 

                }
                break;
            case 27 :
                // InternalAngularDsl.g:1:302: RULE_TEMPLATE_URL
                {
                mRULE_TEMPLATE_URL(); 

                }
                break;
            case 28 :
                // InternalAngularDsl.g:1:320: RULE_CONTROLLER
                {
                mRULE_CONTROLLER(); 

                }
                break;
            case 29 :
                // InternalAngularDsl.g:1:336: RULE_PARENTESIS_CUADRADO_IZQUIERDO
                {
                mRULE_PARENTESIS_CUADRADO_IZQUIERDO(); 

                }
                break;
            case 30 :
                // InternalAngularDsl.g:1:371: RULE_PARENTESIS_CUADRADO_DERECHO
                {
                mRULE_PARENTESIS_CUADRADO_DERECHO(); 

                }
                break;
            case 31 :
                // InternalAngularDsl.g:1:404: RULE_FUNCTION
                {
                mRULE_FUNCTION(); 

                }
                break;
            case 32 :
                // InternalAngularDsl.g:1:418: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // InternalAngularDsl.g:1:426: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 34 :
                // InternalAngularDsl.g:1:435: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 35 :
                // InternalAngularDsl.g:1:447: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 36 :
                // InternalAngularDsl.g:1:463: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 37 :
                // InternalAngularDsl.g:1:479: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 38 :
                // InternalAngularDsl.g:1:487: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\2\43\2\uffff\1\50\1\53\1\uffff\1\43\1\57\1\61\1\uffff\2\43\1\65\4\uffff\2\43\2\uffff\2\43\2\uffff\1\40\2\uffff\1\40\2\uffff\2\43\1\uffff\1\43\10\uffff\1\43\5\uffff\2\43\6\uffff\2\43\2\uffff\2\43\4\uffff\2\43\1\122\1\uffff\1\123\10\43\2\uffff\20\43\1\154\1\43\1\156\3\43\1\162\1\43\1\uffff\1\164\1\uffff\3\43\1\uffff\1\170\1\uffff\3\43\1\uffff\1\174\2\43\1\uffff\1\177\1\43\1\uffff\1\u0081\1\uffff";
    static final String DFA12_eofS =
        "\u0082\uffff";
    static final String DFA12_minS =
        "\1\0\2\141\2\uffff\1\57\1\52\1\uffff\1\147\1\173\1\175\1\uffff\1\163\1\164\1\0\4\uffff\1\156\1\157\2\uffff\1\157\1\145\2\uffff\1\101\2\uffff\1\0\2\uffff\1\143\1\156\1\uffff\1\162\10\uffff\1\55\5\uffff\1\145\1\162\6\uffff\1\147\1\144\2\uffff\2\155\4\uffff\1\164\1\143\1\60\1\uffff\1\60\1\151\2\165\1\160\1\164\1\160\1\157\1\164\2\uffff\1\143\2\154\1\157\1\162\1\154\1\162\1\151\1\164\1\141\1\145\1\156\1\157\1\141\1\171\1\157\1\60\1\162\1\60\1\145\1\154\1\164\1\60\1\156\1\uffff\1\60\1\uffff\1\156\1\154\1\145\1\uffff\1\60\1\uffff\1\164\1\145\1\125\1\uffff\1\60\2\162\1\uffff\1\60\1\154\1\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\165\1\141\2\uffff\2\57\1\uffff\1\147\1\173\1\175\1\uffff\1\163\1\164\1\uffff\4\uffff\1\156\1\157\2\uffff\1\157\1\145\2\uffff\1\172\2\uffff\1\uffff\2\uffff\1\143\1\156\1\uffff\1\162\10\uffff\1\55\5\uffff\1\145\1\162\6\uffff\1\147\1\144\2\uffff\1\156\1\155\4\uffff\1\164\1\143\1\172\1\uffff\1\172\1\151\2\165\1\160\1\164\1\160\1\157\1\164\2\uffff\1\143\2\154\1\157\1\162\1\154\1\162\1\151\1\164\1\141\1\145\1\156\1\157\1\141\1\171\1\157\1\172\1\162\1\172\1\145\1\154\1\164\1\172\1\156\1\uffff\1\172\1\uffff\1\156\1\154\1\145\1\uffff\1\172\1\uffff\1\164\1\145\1\125\1\uffff\1\172\2\162\1\uffff\1\172\1\154\1\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\3\1\4\2\uffff\1\7\3\uffff\1\14\3\uffff\1\20\1\21\1\22\1\23\2\uffff\1\26\1\27\2\uffff\1\35\1\36\1\uffff\1\40\1\41\1\uffff\1\45\1\46\2\uffff\1\40\1\uffff\1\3\1\4\1\10\1\5\1\43\1\44\1\6\1\7\1\uffff\1\12\1\31\1\13\1\32\1\14\2\uffff\1\17\1\42\1\20\1\21\1\22\1\23\2\uffff\1\26\1\27\2\uffff\1\35\1\36\1\41\1\45\3\uffff\1\11\11\uffff\1\2\1\15\30\uffff\1\16\1\uffff\1\25\3\uffff\1\1\1\uffff\1\24\3\uffff\1\37\3\uffff\1\30\2\uffff\1\34\1\uffff\1\33";
    static final String DFA12_specialS =
        "\1\0\15\uffff\1\1\17\uffff\1\2\143\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\40\2\37\2\40\1\37\22\40\1\37\1\40\1\36\4\40\1\16\1\25\1\26\1\4\1\40\1\21\1\40\1\20\1\6\12\35\1\22\1\17\1\5\1\3\1\7\2\40\32\34\1\31\1\40\1\32\1\33\1\34\1\40\1\23\1\34\1\27\2\34\1\1\6\34\1\24\1\10\4\34\1\15\1\30\1\14\1\2\4\34\1\11\1\13\1\12\uff82\40",
            "\1\41\23\uffff\1\42",
            "\1\44",
            "",
            "",
            "\1\47",
            "\1\51\4\uffff\1\52",
            "",
            "\1\55",
            "\1\56",
            "\1\60",
            "",
            "\1\63",
            "\1\64",
            "\0\66",
            "",
            "",
            "",
            "",
            "\1\73",
            "\1\74",
            "",
            "",
            "\1\77",
            "\1\100",
            "",
            "",
            "\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\0\66",
            "",
            "",
            "\1\105",
            "\1\106",
            "",
            "\1\107",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\110",
            "",
            "",
            "",
            "",
            "",
            "\1\111",
            "\1\112",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\113",
            "\1\114",
            "",
            "",
            "\1\115\1\116",
            "\1\117",
            "",
            "",
            "",
            "",
            "\1\120",
            "\1\121",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\155",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\163",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\175",
            "\1\176",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0080",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_USE | RULE_STRICT | RULE_COMILLAS | RULE_PUNTO_Y_COMA | RULE_PUNTO | RULE_COMA | RULE_DOS_PUNTOS | RULE_ANGULAR | RULE_MODULE | RULE_PARENTESIS_IZQUIERDO | RULE_PARENTESIS_DERECHO | RULE_COMPONENT | RULE_LLAVE_IZQUIERDA | RULE_LLAVE_DERECHA | RULE_TEMPLATE_URL | RULE_CONTROLLER | RULE_PARENTESIS_CUADRADO_IZQUIERDO | RULE_PARENTESIS_CUADRADO_DERECHO | RULE_FUNCTION | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='f') ) {s = 1;}

                        else if ( (LA12_0=='v') ) {s = 2;}

                        else if ( (LA12_0=='=') ) {s = 3;}

                        else if ( (LA12_0=='*') ) {s = 4;}

                        else if ( (LA12_0=='<') ) {s = 5;}

                        else if ( (LA12_0=='/') ) {s = 6;}

                        else if ( (LA12_0=='>') ) {s = 7;}

                        else if ( (LA12_0=='n') ) {s = 8;}

                        else if ( (LA12_0=='{') ) {s = 9;}

                        else if ( (LA12_0=='}') ) {s = 10;}

                        else if ( (LA12_0=='|') ) {s = 11;}

                        else if ( (LA12_0=='u') ) {s = 12;}

                        else if ( (LA12_0=='s') ) {s = 13;}

                        else if ( (LA12_0=='\'') ) {s = 14;}

                        else if ( (LA12_0==';') ) {s = 15;}

                        else if ( (LA12_0=='.') ) {s = 16;}

                        else if ( (LA12_0==',') ) {s = 17;}

                        else if ( (LA12_0==':') ) {s = 18;}

                        else if ( (LA12_0=='a') ) {s = 19;}

                        else if ( (LA12_0=='m') ) {s = 20;}

                        else if ( (LA12_0=='(') ) {s = 21;}

                        else if ( (LA12_0==')') ) {s = 22;}

                        else if ( (LA12_0=='c') ) {s = 23;}

                        else if ( (LA12_0=='t') ) {s = 24;}

                        else if ( (LA12_0=='[') ) {s = 25;}

                        else if ( (LA12_0==']') ) {s = 26;}

                        else if ( (LA12_0=='^') ) {s = 27;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='d' && LA12_0<='e')||(LA12_0>='g' && LA12_0<='l')||(LA12_0>='o' && LA12_0<='r')||(LA12_0>='w' && LA12_0<='z')) ) {s = 28;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 29;}

                        else if ( (LA12_0=='\"') ) {s = 30;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 31;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||LA12_0=='+'||LA12_0=='-'||(LA12_0>='?' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_14 = input.LA(1);

                        s = -1;
                        if ( ((LA12_14>='\u0000' && LA12_14<='\uFFFF')) ) {s = 54;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_30 = input.LA(1);

                        s = -1;
                        if ( ((LA12_30>='\u0000' && LA12_30<='\uFFFF')) ) {s = 54;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}