/**
 */
package Angularjs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Angularjs.AngularjsFactory
 * @model kind="package"
 * @generated
 */
public interface AngularjsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Angularjs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://uniandes.edu.co/angular";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Angularjs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AngularjsPackage eINSTANCE = Angularjs.impl.AngularjsPackageImpl.init();

	/**
	 * The meta object id for the '{@link Angularjs.impl.AngularJSAppImpl <em>Angular JS App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.impl.AngularJSAppImpl
	 * @see Angularjs.impl.AngularjsPackageImpl#getAngularJSApp()
	 * @generated
	 */
	int ANGULAR_JS_APP = 0;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_JS_APP__TEMPLATES = 0;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_JS_APP__MODULES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_JS_APP__NAME = 2;

	/**
	 * The feature id for the '<em><b>Parametros</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_JS_APP__PARAMETROS = 3;

	/**
	 * The number of structural features of the '<em>Angular JS App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_JS_APP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link Angularjs.impl.TemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.impl.TemplateImpl
	 * @see Angularjs.impl.AngularjsPackageImpl#getTemplate()
	 * @generated
	 */
	int TEMPLATE = 1;

	/**
	 * The feature id for the '<em><b>Setenciahtml</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__SETENCIAHTML = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Ruta Archivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__RUTA_ARCHIVO = 2;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Angularjs.impl.SetenciaHTMLImpl <em>Setencia HTML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.impl.SetenciaHTMLImpl
	 * @see Angularjs.impl.AngularjsPackageImpl#getSetenciaHTML()
	 * @generated
	 */
	int SETENCIA_HTML = 2;

	/**
	 * The feature id for the '<em><b>Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETENCIA_HTML__MARKUP = 0;

	/**
	 * The feature id for the '<em><b>Setenciahtml</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETENCIA_HTML__SETENCIAHTML = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETENCIA_HTML__NAME = 2;

	/**
	 * The feature id for the '<em><b>Propiedades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETENCIA_HTML__PROPIEDADES = 3;

	/**
	 * The feature id for the '<em><b>Self Closing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETENCIA_HTML__SELF_CLOSING = 4;

	/**
	 * The number of structural features of the '<em>Setencia HTML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETENCIA_HTML_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link Angularjs.impl.MarkUpImpl <em>Mark Up</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.impl.MarkUpImpl
	 * @see Angularjs.impl.AngularjsPackageImpl#getMarkUp()
	 * @generated
	 */
	int MARK_UP = 3;

	/**
	 * The number of structural features of the '<em>Mark Up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_UP_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link Angularjs.impl.DirectivaImpl <em>Directiva</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.impl.DirectivaImpl
	 * @see Angularjs.impl.AngularjsPackageImpl#getDirectiva()
	 * @generated
	 */
	int DIRECTIVA = 4;

	/**
	 * The feature id for the '<em><b>Referencia</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVA__REFERENCIA = MARK_UP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVA__NAME = MARK_UP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Directiva</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVA_FEATURE_COUNT = MARK_UP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Angularjs.impl.CurlyBracesImpl <em>Curly Braces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.impl.CurlyBracesImpl
	 * @see Angularjs.impl.AngularjsPackageImpl#getCurlyBraces()
	 * @generated
	 */
	int CURLY_BRACES = 5;

	/**
	 * The feature id for the '<em><b>Expresion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACES__EXPRESION = MARK_UP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filtro</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACES__FILTRO = MARK_UP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Curly Braces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACES_FEATURE_COUNT = MARK_UP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Angularjs.impl.ExpresionImpl <em>Expresion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.impl.ExpresionImpl
	 * @see Angularjs.impl.AngularjsPackageImpl#getExpresion()
	 * @generated
	 */
	int EXPRESION = 6;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION__VALOR = 0;

	/**
	 * The feature id for the '<em><b>Referencia</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION__REFERENCIA = 1;

	/**
	 * The number of structural features of the '<em>Expresion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Angularjs.impl.FiltroImpl <em>Filtro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.impl.FiltroImpl
	 * @see Angularjs.impl.AngularjsPackageImpl#getFiltro()
	 * @generated
	 */
	int FILTRO = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parametros</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRO__PARAMETROS = 1;

	/**
	 * The number of structural features of the '<em>Filtro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRO_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Angularjs.impl.ReferenciaImpl <em>Referencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.impl.ReferenciaImpl
	 * @see Angularjs.impl.AngularjsPackageImpl#getReferencia()
	 * @generated
	 */
	int REFERENCIA = 8;

	/**
	 * The feature id for the '<em><b>Objeto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCIA__OBJETO = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCIA__NAME = 1;

	/**
	 * The number of structural features of the '<em>Referencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCIA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Angularjs.impl.ObjetoJavaScriptImpl <em>Objeto Java Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.impl.ObjetoJavaScriptImpl
	 * @see Angularjs.impl.AngularjsPackageImpl#getObjetoJavaScript()
	 * @generated
	 */
	int OBJETO_JAVA_SCRIPT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJETO_JAVA_SCRIPT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Objeto Java Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJETO_JAVA_SCRIPT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Angularjs.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.impl.ControllerImpl
	 * @see Angularjs.impl.AngularjsPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = OBJETO_JAVA_SCRIPT__NAME;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__SERVICES = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Funcion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__FUNCION = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parametro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__PARAMETRO = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link Angularjs.impl.PropiedadImpl <em>Propiedad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.impl.PropiedadImpl
	 * @see Angularjs.impl.AngularjsPackageImpl#getPropiedad()
	 * @generated
	 */
	int PROPIEDAD = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD__VALOR = 1;

	/**
	 * The number of structural features of the '<em>Propiedad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Angularjs.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.impl.ModuleImpl
	 * @see Angularjs.impl.AngularjsPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = OBJETO_JAVA_SCRIPT__NAME;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CONTROLLER = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODULES = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__SERVICES = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parametro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PARAMETRO = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link Angularjs.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.impl.ServiceImpl
	 * @see Angularjs.impl.AngularjsPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = OBJETO_JAVA_SCRIPT__NAME;

	/**
	 * The feature id for the '<em><b>Funcion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__FUNCION = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parametro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PARAMETRO = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Angularjs.impl.FuncionImpl <em>Funcion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.impl.FuncionImpl
	 * @see Angularjs.impl.AngularjsPackageImpl#getFuncion()
	 * @generated
	 */
	int FUNCION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION__NAME = OBJETO_JAVA_SCRIPT__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION__VARIABLE = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Funcion</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION__FUNCION = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parametro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION__PARAMETRO = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tiene Retorno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION__TIENE_RETORNO = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Referencia</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION__REFERENCIA = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Funcion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION_FEATURE_COUNT = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link Angularjs.impl.ParametroImpl <em>Parametro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.impl.ParametroImpl
	 * @see Angularjs.impl.AngularjsPackageImpl#getParametro()
	 * @generated
	 */
	int PARAMETRO = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO__SERVICES = 1;

	/**
	 * The number of structural features of the '<em>Parametro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Angularjs.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.impl.VariableImpl
	 * @see Angularjs.impl.AngularjsPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = OBJETO_JAVA_SCRIPT__NAME;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALOR = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link Angularjs.AngularJSApp <em>Angular JS App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angular JS App</em>'.
	 * @see Angularjs.AngularJSApp
	 * @generated
	 */
	EClass getAngularJSApp();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.AngularJSApp#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see Angularjs.AngularJSApp#getTemplates()
	 * @see #getAngularJSApp()
	 * @generated
	 */
	EReference getAngularJSApp_Templates();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.AngularJSApp#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see Angularjs.AngularJSApp#getModules()
	 * @see #getAngularJSApp()
	 * @generated
	 */
	EReference getAngularJSApp_Modules();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.AngularJSApp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Angularjs.AngularJSApp#getName()
	 * @see #getAngularJSApp()
	 * @generated
	 */
	EAttribute getAngularJSApp_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.AngularJSApp#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametros</em>'.
	 * @see Angularjs.AngularJSApp#getParametros()
	 * @see #getAngularJSApp()
	 * @generated
	 */
	EReference getAngularJSApp_Parametros();

	/**
	 * Returns the meta object for class '{@link Angularjs.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see Angularjs.Template
	 * @generated
	 */
	EClass getTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.Template#getSetenciahtml <em>Setenciahtml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setenciahtml</em>'.
	 * @see Angularjs.Template#getSetenciahtml()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Setenciahtml();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.Template#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Angularjs.Template#getName()
	 * @see #getTemplate()
	 * @generated
	 */
	EAttribute getTemplate_Name();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.Template#getRutaArchivo <em>Ruta Archivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta Archivo</em>'.
	 * @see Angularjs.Template#getRutaArchivo()
	 * @see #getTemplate()
	 * @generated
	 */
	EAttribute getTemplate_RutaArchivo();

	/**
	 * Returns the meta object for class '{@link Angularjs.SetenciaHTML <em>Setencia HTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setencia HTML</em>'.
	 * @see Angularjs.SetenciaHTML
	 * @generated
	 */
	EClass getSetenciaHTML();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.SetenciaHTML#getMarkup <em>Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Markup</em>'.
	 * @see Angularjs.SetenciaHTML#getMarkup()
	 * @see #getSetenciaHTML()
	 * @generated
	 */
	EReference getSetenciaHTML_Markup();

	/**
	 * Returns the meta object for the reference list '{@link Angularjs.SetenciaHTML#getSetenciahtml <em>Setenciahtml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Setenciahtml</em>'.
	 * @see Angularjs.SetenciaHTML#getSetenciahtml()
	 * @see #getSetenciaHTML()
	 * @generated
	 */
	EReference getSetenciaHTML_Setenciahtml();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.SetenciaHTML#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Angularjs.SetenciaHTML#getName()
	 * @see #getSetenciaHTML()
	 * @generated
	 */
	EAttribute getSetenciaHTML_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.SetenciaHTML#getPropiedades <em>Propiedades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Propiedades</em>'.
	 * @see Angularjs.SetenciaHTML#getPropiedades()
	 * @see #getSetenciaHTML()
	 * @generated
	 */
	EReference getSetenciaHTML_Propiedades();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.SetenciaHTML#isSelfClosing <em>Self Closing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Closing</em>'.
	 * @see Angularjs.SetenciaHTML#isSelfClosing()
	 * @see #getSetenciaHTML()
	 * @generated
	 */
	EAttribute getSetenciaHTML_SelfClosing();

	/**
	 * Returns the meta object for class '{@link Angularjs.MarkUp <em>Mark Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mark Up</em>'.
	 * @see Angularjs.MarkUp
	 * @generated
	 */
	EClass getMarkUp();

	/**
	 * Returns the meta object for class '{@link Angularjs.Directiva <em>Directiva</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directiva</em>'.
	 * @see Angularjs.Directiva
	 * @generated
	 */
	EClass getDirectiva();

	/**
	 * Returns the meta object for the containment reference '{@link Angularjs.Directiva#getReferencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referencia</em>'.
	 * @see Angularjs.Directiva#getReferencia()
	 * @see #getDirectiva()
	 * @generated
	 */
	EReference getDirectiva_Referencia();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.Directiva#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Angularjs.Directiva#getName()
	 * @see #getDirectiva()
	 * @generated
	 */
	EAttribute getDirectiva_Name();

	/**
	 * Returns the meta object for class '{@link Angularjs.CurlyBraces <em>Curly Braces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curly Braces</em>'.
	 * @see Angularjs.CurlyBraces
	 * @generated
	 */
	EClass getCurlyBraces();

	/**
	 * Returns the meta object for the containment reference '{@link Angularjs.CurlyBraces#getExpresion <em>Expresion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expresion</em>'.
	 * @see Angularjs.CurlyBraces#getExpresion()
	 * @see #getCurlyBraces()
	 * @generated
	 */
	EReference getCurlyBraces_Expresion();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.CurlyBraces#getFiltro <em>Filtro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filtro</em>'.
	 * @see Angularjs.CurlyBraces#getFiltro()
	 * @see #getCurlyBraces()
	 * @generated
	 */
	EReference getCurlyBraces_Filtro();

	/**
	 * Returns the meta object for class '{@link Angularjs.Expresion <em>Expresion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expresion</em>'.
	 * @see Angularjs.Expresion
	 * @generated
	 */
	EClass getExpresion();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.Expresion#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see Angularjs.Expresion#getValor()
	 * @see #getExpresion()
	 * @generated
	 */
	EAttribute getExpresion_Valor();

	/**
	 * Returns the meta object for the containment reference '{@link Angularjs.Expresion#getReferencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referencia</em>'.
	 * @see Angularjs.Expresion#getReferencia()
	 * @see #getExpresion()
	 * @generated
	 */
	EReference getExpresion_Referencia();

	/**
	 * Returns the meta object for class '{@link Angularjs.Filtro <em>Filtro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filtro</em>'.
	 * @see Angularjs.Filtro
	 * @generated
	 */
	EClass getFiltro();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.Filtro#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Angularjs.Filtro#getName()
	 * @see #getFiltro()
	 * @generated
	 */
	EAttribute getFiltro_Name();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.Filtro#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parametros</em>'.
	 * @see Angularjs.Filtro#getParametros()
	 * @see #getFiltro()
	 * @generated
	 */
	EAttribute getFiltro_Parametros();

	/**
	 * Returns the meta object for class '{@link Angularjs.Referencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referencia</em>'.
	 * @see Angularjs.Referencia
	 * @generated
	 */
	EClass getReferencia();

	/**
	 * Returns the meta object for the reference '{@link Angularjs.Referencia#getObjeto <em>Objeto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Objeto</em>'.
	 * @see Angularjs.Referencia#getObjeto()
	 * @see #getReferencia()
	 * @generated
	 */
	EReference getReferencia_Objeto();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.Referencia#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Angularjs.Referencia#getName()
	 * @see #getReferencia()
	 * @generated
	 */
	EAttribute getReferencia_Name();

	/**
	 * Returns the meta object for class '{@link Angularjs.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see Angularjs.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the reference list '{@link Angularjs.Controller#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see Angularjs.Controller#getServices()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.Controller#getFuncion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Funcion</em>'.
	 * @see Angularjs.Controller#getFuncion()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Funcion();

	/**
	 * Returns the meta object for the reference '{@link Angularjs.Controller#getParametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parametro</em>'.
	 * @see Angularjs.Controller#getParametro()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Parametro();

	/**
	 * Returns the meta object for class '{@link Angularjs.Propiedad <em>Propiedad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propiedad</em>'.
	 * @see Angularjs.Propiedad
	 * @generated
	 */
	EClass getPropiedad();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.Propiedad#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Angularjs.Propiedad#getName()
	 * @see #getPropiedad()
	 * @generated
	 */
	EAttribute getPropiedad_Name();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.Propiedad#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see Angularjs.Propiedad#getValor()
	 * @see #getPropiedad()
	 * @generated
	 */
	EAttribute getPropiedad_Valor();

	/**
	 * Returns the meta object for class '{@link Angularjs.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see Angularjs.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.Module#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controller</em>'.
	 * @see Angularjs.Module#getController()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Controller();

	/**
	 * Returns the meta object for the reference list '{@link Angularjs.Module#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see Angularjs.Module#getModules()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Modules();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.Module#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see Angularjs.Module#getServices()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Services();

	/**
	 * Returns the meta object for the reference '{@link Angularjs.Module#getParametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parametro</em>'.
	 * @see Angularjs.Module#getParametro()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Parametro();

	/**
	 * Returns the meta object for class '{@link Angularjs.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see Angularjs.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.Service#getFuncion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Funcion</em>'.
	 * @see Angularjs.Service#getFuncion()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Funcion();

	/**
	 * Returns the meta object for the reference '{@link Angularjs.Service#getParametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parametro</em>'.
	 * @see Angularjs.Service#getParametro()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Parametro();

	/**
	 * Returns the meta object for class '{@link Angularjs.Funcion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Funcion</em>'.
	 * @see Angularjs.Funcion
	 * @generated
	 */
	EClass getFuncion();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.Funcion#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see Angularjs.Funcion#getVariable()
	 * @see #getFuncion()
	 * @generated
	 */
	EReference getFuncion_Variable();

	/**
	 * Returns the meta object for the reference list '{@link Angularjs.Funcion#getFuncion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Funcion</em>'.
	 * @see Angularjs.Funcion#getFuncion()
	 * @see #getFuncion()
	 * @generated
	 */
	EReference getFuncion_Funcion();

	/**
	 * Returns the meta object for the reference '{@link Angularjs.Funcion#getParametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parametro</em>'.
	 * @see Angularjs.Funcion#getParametro()
	 * @see #getFuncion()
	 * @generated
	 */
	EReference getFuncion_Parametro();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.Funcion#isTieneRetorno <em>Tiene Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tiene Retorno</em>'.
	 * @see Angularjs.Funcion#isTieneRetorno()
	 * @see #getFuncion()
	 * @generated
	 */
	EAttribute getFuncion_TieneRetorno();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.Funcion#getReferencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Referencia</em>'.
	 * @see Angularjs.Funcion#getReferencia()
	 * @see #getFuncion()
	 * @generated
	 */
	EReference getFuncion_Referencia();

	/**
	 * Returns the meta object for class '{@link Angularjs.Parametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametro</em>'.
	 * @see Angularjs.Parametro
	 * @generated
	 */
	EClass getParametro();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.Parametro#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Angularjs.Parametro#getName()
	 * @see #getParametro()
	 * @generated
	 */
	EAttribute getParametro_Name();

	/**
	 * Returns the meta object for the reference '{@link Angularjs.Parametro#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Services</em>'.
	 * @see Angularjs.Parametro#getServices()
	 * @see #getParametro()
	 * @generated
	 */
	EReference getParametro_Services();

	/**
	 * Returns the meta object for class '{@link Angularjs.ObjetoJavaScript <em>Objeto Java Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objeto Java Script</em>'.
	 * @see Angularjs.ObjetoJavaScript
	 * @generated
	 */
	EClass getObjetoJavaScript();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.ObjetoJavaScript#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Angularjs.ObjetoJavaScript#getName()
	 * @see #getObjetoJavaScript()
	 * @generated
	 */
	EAttribute getObjetoJavaScript_Name();

	/**
	 * Returns the meta object for class '{@link Angularjs.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see Angularjs.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.Variable#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see Angularjs.Variable#getValor()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Valor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AngularjsFactory getAngularjsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Angularjs.impl.AngularJSAppImpl <em>Angular JS App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.impl.AngularJSAppImpl
		 * @see Angularjs.impl.AngularjsPackageImpl#getAngularJSApp()
		 * @generated
		 */
		EClass ANGULAR_JS_APP = eINSTANCE.getAngularJSApp();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGULAR_JS_APP__TEMPLATES = eINSTANCE.getAngularJSApp_Templates();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGULAR_JS_APP__MODULES = eINSTANCE.getAngularJSApp_Modules();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGULAR_JS_APP__NAME = eINSTANCE.getAngularJSApp_Name();

		/**
		 * The meta object literal for the '<em><b>Parametros</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGULAR_JS_APP__PARAMETROS = eINSTANCE.getAngularJSApp_Parametros();

		/**
		 * The meta object literal for the '{@link Angularjs.impl.TemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.impl.TemplateImpl
		 * @see Angularjs.impl.AngularjsPackageImpl#getTemplate()
		 * @generated
		 */
		EClass TEMPLATE = eINSTANCE.getTemplate();

		/**
		 * The meta object literal for the '<em><b>Setenciahtml</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__SETENCIAHTML = eINSTANCE.getTemplate_Setenciahtml();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE__NAME = eINSTANCE.getTemplate_Name();

		/**
		 * The meta object literal for the '<em><b>Ruta Archivo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE__RUTA_ARCHIVO = eINSTANCE.getTemplate_RutaArchivo();

		/**
		 * The meta object literal for the '{@link Angularjs.impl.SetenciaHTMLImpl <em>Setencia HTML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.impl.SetenciaHTMLImpl
		 * @see Angularjs.impl.AngularjsPackageImpl#getSetenciaHTML()
		 * @generated
		 */
		EClass SETENCIA_HTML = eINSTANCE.getSetenciaHTML();

		/**
		 * The meta object literal for the '<em><b>Markup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETENCIA_HTML__MARKUP = eINSTANCE.getSetenciaHTML_Markup();

		/**
		 * The meta object literal for the '<em><b>Setenciahtml</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETENCIA_HTML__SETENCIAHTML = eINSTANCE.getSetenciaHTML_Setenciahtml();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETENCIA_HTML__NAME = eINSTANCE.getSetenciaHTML_Name();

		/**
		 * The meta object literal for the '<em><b>Propiedades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETENCIA_HTML__PROPIEDADES = eINSTANCE.getSetenciaHTML_Propiedades();

		/**
		 * The meta object literal for the '<em><b>Self Closing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETENCIA_HTML__SELF_CLOSING = eINSTANCE.getSetenciaHTML_SelfClosing();

		/**
		 * The meta object literal for the '{@link Angularjs.impl.MarkUpImpl <em>Mark Up</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.impl.MarkUpImpl
		 * @see Angularjs.impl.AngularjsPackageImpl#getMarkUp()
		 * @generated
		 */
		EClass MARK_UP = eINSTANCE.getMarkUp();

		/**
		 * The meta object literal for the '{@link Angularjs.impl.DirectivaImpl <em>Directiva</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.impl.DirectivaImpl
		 * @see Angularjs.impl.AngularjsPackageImpl#getDirectiva()
		 * @generated
		 */
		EClass DIRECTIVA = eINSTANCE.getDirectiva();

		/**
		 * The meta object literal for the '<em><b>Referencia</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTIVA__REFERENCIA = eINSTANCE.getDirectiva_Referencia();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTIVA__NAME = eINSTANCE.getDirectiva_Name();

		/**
		 * The meta object literal for the '{@link Angularjs.impl.CurlyBracesImpl <em>Curly Braces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.impl.CurlyBracesImpl
		 * @see Angularjs.impl.AngularjsPackageImpl#getCurlyBraces()
		 * @generated
		 */
		EClass CURLY_BRACES = eINSTANCE.getCurlyBraces();

		/**
		 * The meta object literal for the '<em><b>Expresion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURLY_BRACES__EXPRESION = eINSTANCE.getCurlyBraces_Expresion();

		/**
		 * The meta object literal for the '<em><b>Filtro</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURLY_BRACES__FILTRO = eINSTANCE.getCurlyBraces_Filtro();

		/**
		 * The meta object literal for the '{@link Angularjs.impl.ExpresionImpl <em>Expresion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.impl.ExpresionImpl
		 * @see Angularjs.impl.AngularjsPackageImpl#getExpresion()
		 * @generated
		 */
		EClass EXPRESION = eINSTANCE.getExpresion();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESION__VALOR = eINSTANCE.getExpresion_Valor();

		/**
		 * The meta object literal for the '<em><b>Referencia</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESION__REFERENCIA = eINSTANCE.getExpresion_Referencia();

		/**
		 * The meta object literal for the '{@link Angularjs.impl.FiltroImpl <em>Filtro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.impl.FiltroImpl
		 * @see Angularjs.impl.AngularjsPackageImpl#getFiltro()
		 * @generated
		 */
		EClass FILTRO = eINSTANCE.getFiltro();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTRO__NAME = eINSTANCE.getFiltro_Name();

		/**
		 * The meta object literal for the '<em><b>Parametros</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTRO__PARAMETROS = eINSTANCE.getFiltro_Parametros();

		/**
		 * The meta object literal for the '{@link Angularjs.impl.ReferenciaImpl <em>Referencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.impl.ReferenciaImpl
		 * @see Angularjs.impl.AngularjsPackageImpl#getReferencia()
		 * @generated
		 */
		EClass REFERENCIA = eINSTANCE.getReferencia();

		/**
		 * The meta object literal for the '<em><b>Objeto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCIA__OBJETO = eINSTANCE.getReferencia_Objeto();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCIA__NAME = eINSTANCE.getReferencia_Name();

		/**
		 * The meta object literal for the '{@link Angularjs.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.impl.ControllerImpl
		 * @see Angularjs.impl.AngularjsPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__SERVICES = eINSTANCE.getController_Services();

		/**
		 * The meta object literal for the '<em><b>Funcion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__FUNCION = eINSTANCE.getController_Funcion();

		/**
		 * The meta object literal for the '<em><b>Parametro</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__PARAMETRO = eINSTANCE.getController_Parametro();

		/**
		 * The meta object literal for the '{@link Angularjs.impl.PropiedadImpl <em>Propiedad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.impl.PropiedadImpl
		 * @see Angularjs.impl.AngularjsPackageImpl#getPropiedad()
		 * @generated
		 */
		EClass PROPIEDAD = eINSTANCE.getPropiedad();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPIEDAD__NAME = eINSTANCE.getPropiedad_Name();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPIEDAD__VALOR = eINSTANCE.getPropiedad_Valor();

		/**
		 * The meta object literal for the '{@link Angularjs.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.impl.ModuleImpl
		 * @see Angularjs.impl.AngularjsPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__CONTROLLER = eINSTANCE.getModule_Controller();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__MODULES = eINSTANCE.getModule_Modules();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__SERVICES = eINSTANCE.getModule_Services();

		/**
		 * The meta object literal for the '<em><b>Parametro</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__PARAMETRO = eINSTANCE.getModule_Parametro();

		/**
		 * The meta object literal for the '{@link Angularjs.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.impl.ServiceImpl
		 * @see Angularjs.impl.AngularjsPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Funcion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__FUNCION = eINSTANCE.getService_Funcion();

		/**
		 * The meta object literal for the '<em><b>Parametro</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__PARAMETRO = eINSTANCE.getService_Parametro();

		/**
		 * The meta object literal for the '{@link Angularjs.impl.FuncionImpl <em>Funcion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.impl.FuncionImpl
		 * @see Angularjs.impl.AngularjsPackageImpl#getFuncion()
		 * @generated
		 */
		EClass FUNCION = eINSTANCE.getFuncion();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCION__VARIABLE = eINSTANCE.getFuncion_Variable();

		/**
		 * The meta object literal for the '<em><b>Funcion</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCION__FUNCION = eINSTANCE.getFuncion_Funcion();

		/**
		 * The meta object literal for the '<em><b>Parametro</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCION__PARAMETRO = eINSTANCE.getFuncion_Parametro();

		/**
		 * The meta object literal for the '<em><b>Tiene Retorno</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCION__TIENE_RETORNO = eINSTANCE.getFuncion_TieneRetorno();

		/**
		 * The meta object literal for the '<em><b>Referencia</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCION__REFERENCIA = eINSTANCE.getFuncion_Referencia();

		/**
		 * The meta object literal for the '{@link Angularjs.impl.ParametroImpl <em>Parametro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.impl.ParametroImpl
		 * @see Angularjs.impl.AngularjsPackageImpl#getParametro()
		 * @generated
		 */
		EClass PARAMETRO = eINSTANCE.getParametro();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETRO__NAME = eINSTANCE.getParametro_Name();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETRO__SERVICES = eINSTANCE.getParametro_Services();

		/**
		 * The meta object literal for the '{@link Angularjs.impl.ObjetoJavaScriptImpl <em>Objeto Java Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.impl.ObjetoJavaScriptImpl
		 * @see Angularjs.impl.AngularjsPackageImpl#getObjetoJavaScript()
		 * @generated
		 */
		EClass OBJETO_JAVA_SCRIPT = eINSTANCE.getObjetoJavaScript();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJETO_JAVA_SCRIPT__NAME = eINSTANCE.getObjetoJavaScript_Name();

		/**
		 * The meta object literal for the '{@link Angularjs.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.impl.VariableImpl
		 * @see Angularjs.impl.AngularjsPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALOR = eINSTANCE.getVariable_Valor();

	}

} //AngularjsPackage
