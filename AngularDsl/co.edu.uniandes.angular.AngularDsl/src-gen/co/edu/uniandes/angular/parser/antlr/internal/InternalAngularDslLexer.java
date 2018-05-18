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
    public static final int RULE_STRING=28;
    public static final int RULE_COMILLAS=4;
    public static final int RULE_COMPONENT=16;
    public static final int RULE_SL_COMMENT=32;
    public static final int RULE_STRICT=6;
    public static final int T__37=37;
    public static final int RULE_PUNTO_Y_COMA=7;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int RULE_USE=5;
    public static final int RULE_MENOR_QUE=25;
    public static final int RULE_ID=29;
    public static final int RULE_PARENTESIS_IZQUIERDO=11;
    public static final int RULE_WS=33;
    public static final int RULE_ANY_OTHER=34;
    public static final int RULE_SLASH=26;
    public static final int RULE_PUNTO=9;
    public static final int RULE_DOS_PUNTOS=19;
    public static final int RULE_IGUAL=24;
    public static final int RULE_INT=30;
    public static final int RULE_PARENTESIS_CUADRADO_DERECHO=14;
    public static final int RULE_ML_COMMENT=31;
    public static final int RULE_LLAVE_DERECHA=21;
    public static final int RULE_ANGULAR=8;
    public static final int RULE_MODULE=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int RULE_MAYOR_QUE=27;
    public static final int RULE_VAR=23;

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

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:12:7: ( '@anotacion_' )
            // InternalAngularDsl.g:12:9: '@anotacion_'
            {
            match("@anotacion_"); 


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
            // InternalAngularDsl.g:13:7: ( '*' )
            // InternalAngularDsl.g:13:9: '*'
            {
            match('*'); 

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
            // InternalAngularDsl.g:14:7: ( 'ng-' )
            // InternalAngularDsl.g:14:9: 'ng-'
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
            // InternalAngularDsl.g:15:7: ( '$' )
            // InternalAngularDsl.g:15:9: '$'
            {
            match('$'); 

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
            // InternalAngularDsl.g:16:7: ( '|' )
            // InternalAngularDsl.g:16:9: '|'
            {
            match('|'); 

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
            // InternalAngularDsl.g:17:7: ( 'true' )
            // InternalAngularDsl.g:17:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:18:7: ( 'false' )
            // InternalAngularDsl.g:18:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "RULE_USE"
    public final void mRULE_USE() throws RecognitionException {
        try {
            int _type = RULE_USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1669:10: ( 'use' )
            // InternalAngularDsl.g:1669:12: 'use'
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
            // InternalAngularDsl.g:1671:13: ( 'strict' )
            // InternalAngularDsl.g:1671:15: 'strict'
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
            // InternalAngularDsl.g:1673:15: ( '\\'' )
            // InternalAngularDsl.g:1673:17: '\\''
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
            // InternalAngularDsl.g:1675:19: ( ';' )
            // InternalAngularDsl.g:1675:21: ';'
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
            // InternalAngularDsl.g:1677:12: ( '.' )
            // InternalAngularDsl.g:1677:14: '.'
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
            // InternalAngularDsl.g:1679:11: ( ',' )
            // InternalAngularDsl.g:1679:13: ','
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
            // InternalAngularDsl.g:1681:17: ( ':' )
            // InternalAngularDsl.g:1681:19: ':'
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
            // InternalAngularDsl.g:1683:14: ( 'angular' )
            // InternalAngularDsl.g:1683:16: 'angular'
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
            // InternalAngularDsl.g:1685:13: ( 'module' )
            // InternalAngularDsl.g:1685:15: 'module'
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
            // InternalAngularDsl.g:1687:27: ( '(' )
            // InternalAngularDsl.g:1687:29: '('
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
            // InternalAngularDsl.g:1689:25: ( ')' )
            // InternalAngularDsl.g:1689:27: ')'
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
            // InternalAngularDsl.g:1691:16: ( 'component' )
            // InternalAngularDsl.g:1691:18: 'component'
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
            // InternalAngularDsl.g:1693:22: ( '{' )
            // InternalAngularDsl.g:1693:24: '{'
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
            // InternalAngularDsl.g:1695:20: ( '}' )
            // InternalAngularDsl.g:1695:22: '}'
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
            // InternalAngularDsl.g:1697:19: ( 'templateUrl' )
            // InternalAngularDsl.g:1697:21: 'templateUrl'
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
            // InternalAngularDsl.g:1699:17: ( 'controller' )
            // InternalAngularDsl.g:1699:19: 'controller'
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
            // InternalAngularDsl.g:1701:36: ( '[' )
            // InternalAngularDsl.g:1701:38: '['
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
            // InternalAngularDsl.g:1703:34: ( ']' )
            // InternalAngularDsl.g:1703:36: ']'
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
            // InternalAngularDsl.g:1705:15: ( 'function' )
            // InternalAngularDsl.g:1705:17: 'function'
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

    // $ANTLR start "RULE_VAR"
    public final void mRULE_VAR() throws RecognitionException {
        try {
            int _type = RULE_VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1707:10: ( 'var' )
            // InternalAngularDsl.g:1707:12: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VAR"

    // $ANTLR start "RULE_IGUAL"
    public final void mRULE_IGUAL() throws RecognitionException {
        try {
            int _type = RULE_IGUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1709:12: ( '=' )
            // InternalAngularDsl.g:1709:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IGUAL"

    // $ANTLR start "RULE_MENOR_QUE"
    public final void mRULE_MENOR_QUE() throws RecognitionException {
        try {
            int _type = RULE_MENOR_QUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1711:16: ( '<' )
            // InternalAngularDsl.g:1711:18: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MENOR_QUE"

    // $ANTLR start "RULE_MAYOR_QUE"
    public final void mRULE_MAYOR_QUE() throws RecognitionException {
        try {
            int _type = RULE_MAYOR_QUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1713:16: ( '>' )
            // InternalAngularDsl.g:1713:18: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAYOR_QUE"

    // $ANTLR start "RULE_SLASH"
    public final void mRULE_SLASH() throws RecognitionException {
        try {
            int _type = RULE_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1715:12: ( '/' )
            // InternalAngularDsl.g:1715:14: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLASH"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAngularDsl.g:1717:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAngularDsl.g:1717:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalAngularDsl.g:1717:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAngularDsl.g:1717:11: '^'
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

            // InternalAngularDsl.g:1717:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalAngularDsl.g:1719:10: ( ( '0' .. '9' )+ )
            // InternalAngularDsl.g:1719:12: ( '0' .. '9' )+
            {
            // InternalAngularDsl.g:1719:12: ( '0' .. '9' )+
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
            	    // InternalAngularDsl.g:1719:13: '0' .. '9'
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
            // InternalAngularDsl.g:1721:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalAngularDsl.g:1721:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalAngularDsl.g:1721:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalAngularDsl.g:1721:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalAngularDsl.g:1721:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalAngularDsl.g:1721:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAngularDsl.g:1721:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalAngularDsl.g:1721:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalAngularDsl.g:1721:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalAngularDsl.g:1721:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAngularDsl.g:1721:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalAngularDsl.g:1723:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAngularDsl.g:1723:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAngularDsl.g:1723:24: ( options {greedy=false; } : . )*
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
            	    // InternalAngularDsl.g:1723:52: .
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
            // InternalAngularDsl.g:1725:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAngularDsl.g:1725:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAngularDsl.g:1725:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAngularDsl.g:1725:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalAngularDsl.g:1725:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAngularDsl.g:1725:41: ( '\\r' )? '\\n'
                    {
                    // InternalAngularDsl.g:1725:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalAngularDsl.g:1725:41: '\\r'
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
            // InternalAngularDsl.g:1727:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAngularDsl.g:1727:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAngularDsl.g:1727:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalAngularDsl.g:1729:16: ( . )
            // InternalAngularDsl.g:1729:18: .
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
        // InternalAngularDsl.g:1:8: ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_USE | RULE_STRICT | RULE_COMILLAS | RULE_PUNTO_Y_COMA | RULE_PUNTO | RULE_COMA | RULE_DOS_PUNTOS | RULE_ANGULAR | RULE_MODULE | RULE_PARENTESIS_IZQUIERDO | RULE_PARENTESIS_DERECHO | RULE_COMPONENT | RULE_LLAVE_IZQUIERDA | RULE_LLAVE_DERECHA | RULE_TEMPLATE_URL | RULE_CONTROLLER | RULE_PARENTESIS_CUADRADO_IZQUIERDO | RULE_PARENTESIS_CUADRADO_DERECHO | RULE_FUNCTION | RULE_VAR | RULE_IGUAL | RULE_MENOR_QUE | RULE_MAYOR_QUE | RULE_SLASH | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=39;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalAngularDsl.g:1:10: T__35
                {
                mT__35(); 

                }
                break;
            case 2 :
                // InternalAngularDsl.g:1:16: T__36
                {
                mT__36(); 

                }
                break;
            case 3 :
                // InternalAngularDsl.g:1:22: T__37
                {
                mT__37(); 

                }
                break;
            case 4 :
                // InternalAngularDsl.g:1:28: T__38
                {
                mT__38(); 

                }
                break;
            case 5 :
                // InternalAngularDsl.g:1:34: T__39
                {
                mT__39(); 

                }
                break;
            case 6 :
                // InternalAngularDsl.g:1:40: T__40
                {
                mT__40(); 

                }
                break;
            case 7 :
                // InternalAngularDsl.g:1:46: T__41
                {
                mT__41(); 

                }
                break;
            case 8 :
                // InternalAngularDsl.g:1:52: T__42
                {
                mT__42(); 

                }
                break;
            case 9 :
                // InternalAngularDsl.g:1:58: RULE_USE
                {
                mRULE_USE(); 

                }
                break;
            case 10 :
                // InternalAngularDsl.g:1:67: RULE_STRICT
                {
                mRULE_STRICT(); 

                }
                break;
            case 11 :
                // InternalAngularDsl.g:1:79: RULE_COMILLAS
                {
                mRULE_COMILLAS(); 

                }
                break;
            case 12 :
                // InternalAngularDsl.g:1:93: RULE_PUNTO_Y_COMA
                {
                mRULE_PUNTO_Y_COMA(); 

                }
                break;
            case 13 :
                // InternalAngularDsl.g:1:111: RULE_PUNTO
                {
                mRULE_PUNTO(); 

                }
                break;
            case 14 :
                // InternalAngularDsl.g:1:122: RULE_COMA
                {
                mRULE_COMA(); 

                }
                break;
            case 15 :
                // InternalAngularDsl.g:1:132: RULE_DOS_PUNTOS
                {
                mRULE_DOS_PUNTOS(); 

                }
                break;
            case 16 :
                // InternalAngularDsl.g:1:148: RULE_ANGULAR
                {
                mRULE_ANGULAR(); 

                }
                break;
            case 17 :
                // InternalAngularDsl.g:1:161: RULE_MODULE
                {
                mRULE_MODULE(); 

                }
                break;
            case 18 :
                // InternalAngularDsl.g:1:173: RULE_PARENTESIS_IZQUIERDO
                {
                mRULE_PARENTESIS_IZQUIERDO(); 

                }
                break;
            case 19 :
                // InternalAngularDsl.g:1:199: RULE_PARENTESIS_DERECHO
                {
                mRULE_PARENTESIS_DERECHO(); 

                }
                break;
            case 20 :
                // InternalAngularDsl.g:1:223: RULE_COMPONENT
                {
                mRULE_COMPONENT(); 

                }
                break;
            case 21 :
                // InternalAngularDsl.g:1:238: RULE_LLAVE_IZQUIERDA
                {
                mRULE_LLAVE_IZQUIERDA(); 

                }
                break;
            case 22 :
                // InternalAngularDsl.g:1:259: RULE_LLAVE_DERECHA
                {
                mRULE_LLAVE_DERECHA(); 

                }
                break;
            case 23 :
                // InternalAngularDsl.g:1:278: RULE_TEMPLATE_URL
                {
                mRULE_TEMPLATE_URL(); 

                }
                break;
            case 24 :
                // InternalAngularDsl.g:1:296: RULE_CONTROLLER
                {
                mRULE_CONTROLLER(); 

                }
                break;
            case 25 :
                // InternalAngularDsl.g:1:312: RULE_PARENTESIS_CUADRADO_IZQUIERDO
                {
                mRULE_PARENTESIS_CUADRADO_IZQUIERDO(); 

                }
                break;
            case 26 :
                // InternalAngularDsl.g:1:347: RULE_PARENTESIS_CUADRADO_DERECHO
                {
                mRULE_PARENTESIS_CUADRADO_DERECHO(); 

                }
                break;
            case 27 :
                // InternalAngularDsl.g:1:380: RULE_FUNCTION
                {
                mRULE_FUNCTION(); 

                }
                break;
            case 28 :
                // InternalAngularDsl.g:1:394: RULE_VAR
                {
                mRULE_VAR(); 

                }
                break;
            case 29 :
                // InternalAngularDsl.g:1:403: RULE_IGUAL
                {
                mRULE_IGUAL(); 

                }
                break;
            case 30 :
                // InternalAngularDsl.g:1:414: RULE_MENOR_QUE
                {
                mRULE_MENOR_QUE(); 

                }
                break;
            case 31 :
                // InternalAngularDsl.g:1:429: RULE_MAYOR_QUE
                {
                mRULE_MAYOR_QUE(); 

                }
                break;
            case 32 :
                // InternalAngularDsl.g:1:444: RULE_SLASH
                {
                mRULE_SLASH(); 

                }
                break;
            case 33 :
                // InternalAngularDsl.g:1:455: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 34 :
                // InternalAngularDsl.g:1:463: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 35 :
                // InternalAngularDsl.g:1:472: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 36 :
                // InternalAngularDsl.g:1:484: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // InternalAngularDsl.g:1:500: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 38 :
                // InternalAngularDsl.g:1:516: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 39 :
                // InternalAngularDsl.g:1:524: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\45\1\42\1\uffff\1\45\2\uffff\3\45\1\57\4\uffff\2\45\2\uffff\1\45\4\uffff\1\45\3\uffff\1\104\1\42\2\uffff\1\42\2\uffff\2\45\3\uffff\1\45\2\uffff\4\45\6\uffff\2\45\2\uffff\1\45\4\uffff\1\45\10\uffff\3\45\1\uffff\2\45\1\131\5\45\1\137\3\45\1\143\1\45\1\uffff\5\45\1\uffff\1\45\1\153\1\45\1\uffff\7\45\1\uffff\2\45\1\166\1\45\1\170\2\45\1\173\2\45\1\uffff\1\176\1\uffff\2\45\1\uffff\1\u0081\1\45\1\uffff\2\45\1\uffff\1\45\1\u0086\2\45\1\uffff\1\u0089\1\u008a\2\uffff";
    static final String DFA12_eofS =
        "\u008b\uffff";
    static final String DFA12_minS =
        "\1\0\2\141\1\uffff\1\147\2\uffff\1\145\1\163\1\164\1\0\4\uffff\1\156\1\157\2\uffff\1\157\4\uffff\1\141\3\uffff\1\52\1\101\2\uffff\1\0\2\uffff\1\143\1\156\3\uffff\1\55\2\uffff\1\165\1\155\1\145\1\162\6\uffff\1\147\1\144\2\uffff\1\155\4\uffff\1\162\10\uffff\1\164\1\163\1\143\1\uffff\1\145\1\160\1\60\1\151\2\165\1\160\1\164\1\60\1\157\1\145\1\164\1\60\1\154\1\uffff\1\143\2\154\1\157\1\162\1\uffff\1\162\1\60\1\151\1\uffff\1\141\1\164\1\141\1\145\1\156\1\157\1\171\1\uffff\1\157\1\164\1\60\1\162\1\60\1\145\1\154\1\60\1\156\1\145\1\uffff\1\60\1\uffff\1\156\1\154\1\uffff\1\60\1\125\1\uffff\1\164\1\145\1\uffff\1\162\1\60\1\162\1\154\1\uffff\2\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\165\1\141\1\uffff\1\147\2\uffff\1\162\1\163\1\164\1\uffff\4\uffff\1\156\1\157\2\uffff\1\157\4\uffff\1\141\3\uffff\1\57\1\172\2\uffff\1\uffff\2\uffff\1\154\1\156\3\uffff\1\55\2\uffff\1\165\1\155\1\145\1\162\6\uffff\1\147\1\144\2\uffff\1\156\4\uffff\1\162\10\uffff\1\164\1\163\1\143\1\uffff\1\145\1\160\1\172\1\151\2\165\1\160\1\164\1\172\1\157\1\145\1\164\1\172\1\154\1\uffff\1\143\2\154\1\157\1\162\1\uffff\1\162\1\172\1\151\1\uffff\1\141\1\164\1\141\1\145\1\156\1\157\1\171\1\uffff\1\157\1\164\1\172\1\162\1\172\1\145\1\154\1\172\1\156\1\145\1\uffff\1\172\1\uffff\1\156\1\154\1\uffff\1\172\1\125\1\uffff\1\164\1\145\1\uffff\1\162\1\172\1\162\1\154\1\uffff\2\172\2\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\3\1\uffff\1\5\1\6\4\uffff\1\14\1\15\1\16\1\17\2\uffff\1\22\1\23\1\uffff\1\25\1\26\1\31\1\32\1\uffff\1\35\1\36\1\37\2\uffff\1\41\1\42\1\uffff\1\46\1\47\2\uffff\1\41\1\2\1\3\1\uffff\1\5\1\6\4\uffff\1\13\1\43\1\14\1\15\1\16\1\17\2\uffff\1\22\1\23\1\uffff\1\25\1\26\1\31\1\32\1\uffff\1\35\1\36\1\37\1\44\1\45\1\40\1\42\1\46\3\uffff\1\4\16\uffff\1\11\5\uffff\1\34\3\uffff\1\7\7\uffff\1\10\12\uffff\1\12\1\uffff\1\21\2\uffff\1\1\2\uffff\1\20\2\uffff\1\33\4\uffff\1\24\2\uffff\1\30\1\27";
    static final String DFA12_specialS =
        "\1\1\11\uffff\1\2\25\uffff\1\0\152\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\42\1\40\1\42\1\5\2\42\1\12\1\21\1\22\1\3\1\42\1\15\1\42\1\14\1\34\12\37\1\16\1\13\1\32\1\31\1\33\1\42\1\2\32\36\1\26\1\42\1\27\1\35\1\36\1\42\1\17\1\36\1\23\2\36\1\1\6\36\1\20\1\4\4\36\1\11\1\7\1\10\1\30\4\36\1\24\1\6\1\25\uff82\42",
            "\1\43\23\uffff\1\44",
            "\1\46",
            "",
            "\1\50",
            "",
            "",
            "\1\54\14\uffff\1\53",
            "\1\55",
            "\1\56",
            "\0\60",
            "",
            "",
            "",
            "",
            "\1\65",
            "\1\66",
            "",
            "",
            "\1\71",
            "",
            "",
            "",
            "",
            "\1\76",
            "",
            "",
            "",
            "\1\102\4\uffff\1\103",
            "\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\0\60",
            "",
            "",
            "\1\107\10\uffff\1\110",
            "\1\111",
            "",
            "",
            "",
            "\1\112",
            "",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\117",
            "\1\120",
            "",
            "",
            "\1\121\1\122",
            "",
            "",
            "",
            "",
            "\1\123",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "\1\127",
            "\1\130",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\140",
            "\1\141",
            "\1\142",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "\1\152",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\154",
            "",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "",
            "\1\164",
            "\1\165",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\167",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\171",
            "\1\172",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\174",
            "\1\175",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\177",
            "\1\u0080",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0082",
            "",
            "\1\u0083",
            "\1\u0084",
            "",
            "\1\u0085",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0087",
            "\1\u0088",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
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
            return "1:1: Tokens : ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_USE | RULE_STRICT | RULE_COMILLAS | RULE_PUNTO_Y_COMA | RULE_PUNTO | RULE_COMA | RULE_DOS_PUNTOS | RULE_ANGULAR | RULE_MODULE | RULE_PARENTESIS_IZQUIERDO | RULE_PARENTESIS_DERECHO | RULE_COMPONENT | RULE_LLAVE_IZQUIERDA | RULE_LLAVE_DERECHA | RULE_TEMPLATE_URL | RULE_CONTROLLER | RULE_PARENTESIS_CUADRADO_IZQUIERDO | RULE_PARENTESIS_CUADRADO_DERECHO | RULE_FUNCTION | RULE_VAR | RULE_IGUAL | RULE_MENOR_QUE | RULE_MAYOR_QUE | RULE_SLASH | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_32 = input.LA(1);

                        s = -1;
                        if ( ((LA12_32>='\u0000' && LA12_32<='\uFFFF')) ) {s = 48;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='f') ) {s = 1;}

                        else if ( (LA12_0=='@') ) {s = 2;}

                        else if ( (LA12_0=='*') ) {s = 3;}

                        else if ( (LA12_0=='n') ) {s = 4;}

                        else if ( (LA12_0=='$') ) {s = 5;}

                        else if ( (LA12_0=='|') ) {s = 6;}

                        else if ( (LA12_0=='t') ) {s = 7;}

                        else if ( (LA12_0=='u') ) {s = 8;}

                        else if ( (LA12_0=='s') ) {s = 9;}

                        else if ( (LA12_0=='\'') ) {s = 10;}

                        else if ( (LA12_0==';') ) {s = 11;}

                        else if ( (LA12_0=='.') ) {s = 12;}

                        else if ( (LA12_0==',') ) {s = 13;}

                        else if ( (LA12_0==':') ) {s = 14;}

                        else if ( (LA12_0=='a') ) {s = 15;}

                        else if ( (LA12_0=='m') ) {s = 16;}

                        else if ( (LA12_0=='(') ) {s = 17;}

                        else if ( (LA12_0==')') ) {s = 18;}

                        else if ( (LA12_0=='c') ) {s = 19;}

                        else if ( (LA12_0=='{') ) {s = 20;}

                        else if ( (LA12_0=='}') ) {s = 21;}

                        else if ( (LA12_0=='[') ) {s = 22;}

                        else if ( (LA12_0==']') ) {s = 23;}

                        else if ( (LA12_0=='v') ) {s = 24;}

                        else if ( (LA12_0=='=') ) {s = 25;}

                        else if ( (LA12_0=='<') ) {s = 26;}

                        else if ( (LA12_0=='>') ) {s = 27;}

                        else if ( (LA12_0=='/') ) {s = 28;}

                        else if ( (LA12_0=='^') ) {s = 29;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='d' && LA12_0<='e')||(LA12_0>='g' && LA12_0<='l')||(LA12_0>='o' && LA12_0<='r')||(LA12_0>='w' && LA12_0<='z')) ) {s = 30;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 31;}

                        else if ( (LA12_0=='\"') ) {s = 32;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 33;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||LA12_0=='#'||(LA12_0>='%' && LA12_0<='&')||LA12_0=='+'||LA12_0=='-'||LA12_0=='?'||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_10 = input.LA(1);

                        s = -1;
                        if ( ((LA12_10>='\u0000' && LA12_10<='\uFFFF')) ) {s = 48;}

                        else s = 47;

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