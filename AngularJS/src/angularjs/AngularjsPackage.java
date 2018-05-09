/**
 */
package angularjs;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see angularjs.AngularjsFactory
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
	String eNAME = "angularjs";

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
	String eNS_PREFIX = "angularjs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AngularjsPackage eINSTANCE = angularjs.impl.AngularjsPackageImpl.init();

	/**
	 * The meta object id for the '{@link angularjs.impl.AppAngularJSImpl <em>App Angular JS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.AppAngularJSImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getAppAngularJS()
	 * @generated
	 */
	int APP_ANGULAR_JS = 0;

	/**
	 * The feature id for the '<em><b>Modulos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ANGULAR_JS__MODULOS = 0;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ANGULAR_JS__TEMPLATE = 1;

	/**
	 * The feature id for the '<em><b>Modelos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ANGULAR_JS__MODELOS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ANGULAR_JS__NAME = 3;

	/**
	 * The number of structural features of the '<em>App Angular JS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ANGULAR_JS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>App Angular JS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ANGULAR_JS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link angularjs.impl.ModuloImpl <em>Modulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.ModuloImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getModulo()
	 * @generated
	 */
	int MODULO = 1;

	/**
	 * The meta object id for the '{@link angularjs.impl.AnotacionImpl <em>Anotacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.AnotacionImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getAnotacion()
	 * @generated
	 */
	int ANOTACION = 2;

	/**
	 * The meta object id for the '{@link angularjs.impl.ObjetoJavaScriptImpl <em>Objeto Java Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.ObjetoJavaScriptImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getObjetoJavaScript()
	 * @generated
	 */
	int OBJETO_JAVA_SCRIPT = 8;

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
	 * The number of operations of the '<em>Objeto Java Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJETO_JAVA_SCRIPT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__NAME = OBJETO_JAVA_SCRIPT__NAME;

	/**
	 * The feature id for the '<em><b>Parametros</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__PARAMETROS = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__SERVICES = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__CONTROLLER = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modulos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__MODULOS = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO_FEATURE_COUNT = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO_OPERATION_COUNT = OBJETO_JAVA_SCRIPT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTACION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Anotacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTACION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Anotacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link angularjs.impl.FuncionImpl <em>Funcion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.FuncionImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getFuncion()
	 * @generated
	 */
	int FUNCION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION__NAME = OBJETO_JAVA_SCRIPT__NAME;

	/**
	 * The feature id for the '<em><b>Funcion</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION__FUNCION = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tiene Retorno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION__TIENE_RETORNO = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parametros</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION__PARAMETROS = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION__BODY = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Funcion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION_FEATURE_COUNT = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Funcion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION_OPERATION_COUNT = OBJETO_JAVA_SCRIPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link angularjs.impl.ParametroImpl <em>Parametro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.ParametroImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getParametro()
	 * @generated
	 */
	int PARAMETRO = 4;

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
	 * The number of operations of the '<em>Parametro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link angularjs.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.VariableImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 5;

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
	 * The feature id for the '<em><b>Anotacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ANOTACION = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = OBJETO_JAVA_SCRIPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link angularjs.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.ControllerImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 6;

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
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__VARIABLE = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parametros</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__PARAMETROS = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__BODY = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__TEMPLATE = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modelo</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__MODELO = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = OBJETO_JAVA_SCRIPT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = OBJETO_JAVA_SCRIPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link angularjs.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.ServiceImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 7;

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
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = OBJETO_JAVA_SCRIPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link angularjs.impl.ModeloImpl <em>Modelo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.ModeloImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getModelo()
	 * @generated
	 */
	int MODELO = 9;

	/**
	 * The number of structural features of the '<em>Modelo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Modelo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link angularjs.impl.TemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.TemplateImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getTemplate()
	 * @generated
	 */
	int TEMPLATE = 10;

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
	 * The feature id for the '<em><b>Directiva</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__DIRECTIVA = 3;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__CONTROLLER = 4;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link angularjs.impl.SetenciaHTMLImpl <em>Setencia HTML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.SetenciaHTMLImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getSetenciaHTML()
	 * @generated
	 */
	int SETENCIA_HTML = 11;

	/**
	 * The feature id for the '<em><b>Setenciahtml</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETENCIA_HTML__SETENCIAHTML = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETENCIA_HTML__NAME = 1;

	/**
	 * The feature id for the '<em><b>Propiedades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETENCIA_HTML__PROPIEDADES = 2;

	/**
	 * The feature id for the '<em><b>Self Closing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETENCIA_HTML__SELF_CLOSING = 3;

	/**
	 * The feature id for the '<em><b>Directivas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETENCIA_HTML__DIRECTIVAS = 4;

	/**
	 * The feature id for the '<em><b>Curlybraces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETENCIA_HTML__CURLYBRACES = 5;

	/**
	 * The number of structural features of the '<em>Setencia HTML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETENCIA_HTML_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Setencia HTML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETENCIA_HTML_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link angularjs.impl.PropiedadImpl <em>Propiedad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.PropiedadImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getPropiedad()
	 * @generated
	 */
	int PROPIEDAD = 12;

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
	 * The number of operations of the '<em>Propiedad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link angularjs.impl.ReferenciaImpl <em>Referencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.ReferenciaImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getReferencia()
	 * @generated
	 */
	int REFERENCIA = 13;

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
	 * The number of operations of the '<em>Referencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link angularjs.impl.ExpresionImpl <em>Expresion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.ExpresionImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getExpresion()
	 * @generated
	 */
	int EXPRESION = 14;

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
	 * The number of operations of the '<em>Expresion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link angularjs.impl.FiltroImpl <em>Filtro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.FiltroImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getFiltro()
	 * @generated
	 */
	int FILTRO = 15;

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
	 * The number of operations of the '<em>Filtro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link angularjs.impl.DirectivaImpl <em>Directiva</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.DirectivaImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getDirectiva()
	 * @generated
	 */
	int DIRECTIVA = 16;

	/**
	 * The feature id for the '<em><b>Referencia</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVA__REFERENCIA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVA__NAME = 1;

	/**
	 * The number of structural features of the '<em>Directiva</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Directiva</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link angularjs.impl.CurlyBracesImpl <em>Curly Braces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.CurlyBracesImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getCurlyBraces()
	 * @generated
	 */
	int CURLY_BRACES = 17;

	/**
	 * The feature id for the '<em><b>Expresion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACES__EXPRESION = 0;

	/**
	 * The feature id for the '<em><b>Filtro</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACES__FILTRO = 1;

	/**
	 * The number of structural features of the '<em>Curly Braces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Curly Braces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACES_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link angularjs.AppAngularJS <em>App Angular JS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Angular JS</em>'.
	 * @see angularjs.AppAngularJS
	 * @generated
	 */
	EClass getAppAngularJS();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs.AppAngularJS#getModulos <em>Modulos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modulos</em>'.
	 * @see angularjs.AppAngularJS#getModulos()
	 * @see #getAppAngularJS()
	 * @generated
	 */
	EReference getAppAngularJS_Modulos();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs.AppAngularJS#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template</em>'.
	 * @see angularjs.AppAngularJS#getTemplate()
	 * @see #getAppAngularJS()
	 * @generated
	 */
	EReference getAppAngularJS_Template();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs.AppAngularJS#getModelos <em>Modelos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modelos</em>'.
	 * @see angularjs.AppAngularJS#getModelos()
	 * @see #getAppAngularJS()
	 * @generated
	 */
	EReference getAppAngularJS_Modelos();

	/**
	 * Returns the meta object for the attribute '{@link angularjs.AppAngularJS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs.AppAngularJS#getName()
	 * @see #getAppAngularJS()
	 * @generated
	 */
	EAttribute getAppAngularJS_Name();

	/**
	 * Returns the meta object for class '{@link angularjs.Modulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modulo</em>'.
	 * @see angularjs.Modulo
	 * @generated
	 */
	EClass getModulo();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs.Modulo#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametros</em>'.
	 * @see angularjs.Modulo#getParametros()
	 * @see #getModulo()
	 * @generated
	 */
	EReference getModulo_Parametros();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs.Modulo#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see angularjs.Modulo#getServices()
	 * @see #getModulo()
	 * @generated
	 */
	EReference getModulo_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs.Modulo#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controller</em>'.
	 * @see angularjs.Modulo#getController()
	 * @see #getModulo()
	 * @generated
	 */
	EReference getModulo_Controller();

	/**
	 * Returns the meta object for the reference list '{@link angularjs.Modulo#getModulos <em>Modulos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modulos</em>'.
	 * @see angularjs.Modulo#getModulos()
	 * @see #getModulo()
	 * @generated
	 */
	EReference getModulo_Modulos();

	/**
	 * Returns the meta object for class '{@link angularjs.Anotacion <em>Anotacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anotacion</em>'.
	 * @see angularjs.Anotacion
	 * @generated
	 */
	EClass getAnotacion();

	/**
	 * Returns the meta object for the attribute '{@link angularjs.Anotacion#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see angularjs.Anotacion#getValue()
	 * @see #getAnotacion()
	 * @generated
	 */
	EAttribute getAnotacion_Value();

	/**
	 * Returns the meta object for class '{@link angularjs.Funcion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Funcion</em>'.
	 * @see angularjs.Funcion
	 * @generated
	 */
	EClass getFuncion();

	/**
	 * Returns the meta object for the reference list '{@link angularjs.Funcion#getFuncion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Funcion</em>'.
	 * @see angularjs.Funcion#getFuncion()
	 * @see #getFuncion()
	 * @generated
	 */
	EReference getFuncion_Funcion();

	/**
	 * Returns the meta object for the attribute '{@link angularjs.Funcion#isTieneRetorno <em>Tiene Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tiene Retorno</em>'.
	 * @see angularjs.Funcion#isTieneRetorno()
	 * @see #getFuncion()
	 * @generated
	 */
	EAttribute getFuncion_TieneRetorno();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs.Funcion#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametros</em>'.
	 * @see angularjs.Funcion#getParametros()
	 * @see #getFuncion()
	 * @generated
	 */
	EReference getFuncion_Parametros();

	/**
	 * Returns the meta object for the attribute '{@link angularjs.Funcion#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see angularjs.Funcion#getBody()
	 * @see #getFuncion()
	 * @generated
	 */
	EAttribute getFuncion_Body();

	/**
	 * Returns the meta object for class '{@link angularjs.Parametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametro</em>'.
	 * @see angularjs.Parametro
	 * @generated
	 */
	EClass getParametro();

	/**
	 * Returns the meta object for the attribute '{@link angularjs.Parametro#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs.Parametro#getName()
	 * @see #getParametro()
	 * @generated
	 */
	EAttribute getParametro_Name();

	/**
	 * Returns the meta object for the reference '{@link angularjs.Parametro#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Services</em>'.
	 * @see angularjs.Parametro#getServices()
	 * @see #getParametro()
	 * @generated
	 */
	EReference getParametro_Services();

	/**
	 * Returns the meta object for class '{@link angularjs.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see angularjs.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link angularjs.Variable#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see angularjs.Variable#getValor()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Valor();

	/**
	 * Returns the meta object for the containment reference '{@link angularjs.Variable#getAnotacion <em>Anotacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anotacion</em>'.
	 * @see angularjs.Variable#getAnotacion()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Anotacion();

	/**
	 * Returns the meta object for class '{@link angularjs.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see angularjs.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the reference list '{@link angularjs.Controller#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see angularjs.Controller#getServices()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs.Controller#getFuncion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Funcion</em>'.
	 * @see angularjs.Controller#getFuncion()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Funcion();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs.Controller#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see angularjs.Controller#getVariable()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs.Controller#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametros</em>'.
	 * @see angularjs.Controller#getParametros()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Parametros();

	/**
	 * Returns the meta object for the attribute '{@link angularjs.Controller#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see angularjs.Controller#getBody()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Body();

	/**
	 * Returns the meta object for the reference '{@link angularjs.Controller#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see angularjs.Controller#getTemplate()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Template();

	/**
	 * Returns the meta object for the reference list '{@link angularjs.Controller#getModelo <em>Modelo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modelo</em>'.
	 * @see angularjs.Controller#getModelo()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Modelo();

	/**
	 * Returns the meta object for class '{@link angularjs.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see angularjs.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs.Service#getFuncion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Funcion</em>'.
	 * @see angularjs.Service#getFuncion()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Funcion();

	/**
	 * Returns the meta object for the reference '{@link angularjs.Service#getParametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parametro</em>'.
	 * @see angularjs.Service#getParametro()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Parametro();

	/**
	 * Returns the meta object for class '{@link angularjs.ObjetoJavaScript <em>Objeto Java Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objeto Java Script</em>'.
	 * @see angularjs.ObjetoJavaScript
	 * @generated
	 */
	EClass getObjetoJavaScript();

	/**
	 * Returns the meta object for the attribute '{@link angularjs.ObjetoJavaScript#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs.ObjetoJavaScript#getName()
	 * @see #getObjetoJavaScript()
	 * @generated
	 */
	EAttribute getObjetoJavaScript_Name();

	/**
	 * Returns the meta object for class '{@link angularjs.Modelo <em>Modelo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelo</em>'.
	 * @see angularjs.Modelo
	 * @generated
	 */
	EClass getModelo();

	/**
	 * Returns the meta object for class '{@link angularjs.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see angularjs.Template
	 * @generated
	 */
	EClass getTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs.Template#getSetenciahtml <em>Setenciahtml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setenciahtml</em>'.
	 * @see angularjs.Template#getSetenciahtml()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Setenciahtml();

	/**
	 * Returns the meta object for the attribute '{@link angularjs.Template#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs.Template#getName()
	 * @see #getTemplate()
	 * @generated
	 */
	EAttribute getTemplate_Name();

	/**
	 * Returns the meta object for the attribute '{@link angularjs.Template#getRutaArchivo <em>Ruta Archivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta Archivo</em>'.
	 * @see angularjs.Template#getRutaArchivo()
	 * @see #getTemplate()
	 * @generated
	 */
	EAttribute getTemplate_RutaArchivo();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs.Template#getDirectiva <em>Directiva</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Directiva</em>'.
	 * @see angularjs.Template#getDirectiva()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Directiva();

	/**
	 * Returns the meta object for the reference '{@link angularjs.Template#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controller</em>'.
	 * @see angularjs.Template#getController()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Controller();

	/**
	 * Returns the meta object for class '{@link angularjs.SetenciaHTML <em>Setencia HTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setencia HTML</em>'.
	 * @see angularjs.SetenciaHTML
	 * @generated
	 */
	EClass getSetenciaHTML();

	/**
	 * Returns the meta object for the reference list '{@link angularjs.SetenciaHTML#getSetenciahtml <em>Setenciahtml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Setenciahtml</em>'.
	 * @see angularjs.SetenciaHTML#getSetenciahtml()
	 * @see #getSetenciaHTML()
	 * @generated
	 */
	EReference getSetenciaHTML_Setenciahtml();

	/**
	 * Returns the meta object for the attribute '{@link angularjs.SetenciaHTML#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs.SetenciaHTML#getName()
	 * @see #getSetenciaHTML()
	 * @generated
	 */
	EAttribute getSetenciaHTML_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs.SetenciaHTML#getPropiedades <em>Propiedades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Propiedades</em>'.
	 * @see angularjs.SetenciaHTML#getPropiedades()
	 * @see #getSetenciaHTML()
	 * @generated
	 */
	EReference getSetenciaHTML_Propiedades();

	/**
	 * Returns the meta object for the attribute '{@link angularjs.SetenciaHTML#isSelfClosing <em>Self Closing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Closing</em>'.
	 * @see angularjs.SetenciaHTML#isSelfClosing()
	 * @see #getSetenciaHTML()
	 * @generated
	 */
	EAttribute getSetenciaHTML_SelfClosing();

	/**
	 * Returns the meta object for the reference list '{@link angularjs.SetenciaHTML#getDirectivas <em>Directivas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Directivas</em>'.
	 * @see angularjs.SetenciaHTML#getDirectivas()
	 * @see #getSetenciaHTML()
	 * @generated
	 */
	EReference getSetenciaHTML_Directivas();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs.SetenciaHTML#getCurlybraces <em>Curlybraces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Curlybraces</em>'.
	 * @see angularjs.SetenciaHTML#getCurlybraces()
	 * @see #getSetenciaHTML()
	 * @generated
	 */
	EReference getSetenciaHTML_Curlybraces();

	/**
	 * Returns the meta object for class '{@link angularjs.Propiedad <em>Propiedad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propiedad</em>'.
	 * @see angularjs.Propiedad
	 * @generated
	 */
	EClass getPropiedad();

	/**
	 * Returns the meta object for the attribute '{@link angularjs.Propiedad#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs.Propiedad#getName()
	 * @see #getPropiedad()
	 * @generated
	 */
	EAttribute getPropiedad_Name();

	/**
	 * Returns the meta object for the attribute '{@link angularjs.Propiedad#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see angularjs.Propiedad#getValor()
	 * @see #getPropiedad()
	 * @generated
	 */
	EAttribute getPropiedad_Valor();

	/**
	 * Returns the meta object for class '{@link angularjs.Referencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referencia</em>'.
	 * @see angularjs.Referencia
	 * @generated
	 */
	EClass getReferencia();

	/**
	 * Returns the meta object for the reference '{@link angularjs.Referencia#getObjeto <em>Objeto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Objeto</em>'.
	 * @see angularjs.Referencia#getObjeto()
	 * @see #getReferencia()
	 * @generated
	 */
	EReference getReferencia_Objeto();

	/**
	 * Returns the meta object for the attribute '{@link angularjs.Referencia#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs.Referencia#getName()
	 * @see #getReferencia()
	 * @generated
	 */
	EAttribute getReferencia_Name();

	/**
	 * Returns the meta object for class '{@link angularjs.Expresion <em>Expresion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expresion</em>'.
	 * @see angularjs.Expresion
	 * @generated
	 */
	EClass getExpresion();

	/**
	 * Returns the meta object for the attribute '{@link angularjs.Expresion#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see angularjs.Expresion#getValor()
	 * @see #getExpresion()
	 * @generated
	 */
	EAttribute getExpresion_Valor();

	/**
	 * Returns the meta object for the containment reference '{@link angularjs.Expresion#getReferencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referencia</em>'.
	 * @see angularjs.Expresion#getReferencia()
	 * @see #getExpresion()
	 * @generated
	 */
	EReference getExpresion_Referencia();

	/**
	 * Returns the meta object for class '{@link angularjs.Filtro <em>Filtro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filtro</em>'.
	 * @see angularjs.Filtro
	 * @generated
	 */
	EClass getFiltro();

	/**
	 * Returns the meta object for the attribute '{@link angularjs.Filtro#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs.Filtro#getName()
	 * @see #getFiltro()
	 * @generated
	 */
	EAttribute getFiltro_Name();

	/**
	 * Returns the meta object for the attribute '{@link angularjs.Filtro#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parametros</em>'.
	 * @see angularjs.Filtro#getParametros()
	 * @see #getFiltro()
	 * @generated
	 */
	EAttribute getFiltro_Parametros();

	/**
	 * Returns the meta object for class '{@link angularjs.Directiva <em>Directiva</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directiva</em>'.
	 * @see angularjs.Directiva
	 * @generated
	 */
	EClass getDirectiva();

	/**
	 * Returns the meta object for the containment reference '{@link angularjs.Directiva#getReferencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referencia</em>'.
	 * @see angularjs.Directiva#getReferencia()
	 * @see #getDirectiva()
	 * @generated
	 */
	EReference getDirectiva_Referencia();

	/**
	 * Returns the meta object for the attribute '{@link angularjs.Directiva#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs.Directiva#getName()
	 * @see #getDirectiva()
	 * @generated
	 */
	EAttribute getDirectiva_Name();

	/**
	 * Returns the meta object for class '{@link angularjs.CurlyBraces <em>Curly Braces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curly Braces</em>'.
	 * @see angularjs.CurlyBraces
	 * @generated
	 */
	EClass getCurlyBraces();

	/**
	 * Returns the meta object for the containment reference '{@link angularjs.CurlyBraces#getExpresion <em>Expresion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expresion</em>'.
	 * @see angularjs.CurlyBraces#getExpresion()
	 * @see #getCurlyBraces()
	 * @generated
	 */
	EReference getCurlyBraces_Expresion();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs.CurlyBraces#getFiltro <em>Filtro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filtro</em>'.
	 * @see angularjs.CurlyBraces#getFiltro()
	 * @see #getCurlyBraces()
	 * @generated
	 */
	EReference getCurlyBraces_Filtro();

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
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link angularjs.impl.AppAngularJSImpl <em>App Angular JS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs.impl.AppAngularJSImpl
		 * @see angularjs.impl.AngularjsPackageImpl#getAppAngularJS()
		 * @generated
		 */
		EClass APP_ANGULAR_JS = eINSTANCE.getAppAngularJS();

		/**
		 * The meta object literal for the '<em><b>Modulos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_ANGULAR_JS__MODULOS = eINSTANCE.getAppAngularJS_Modulos();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_ANGULAR_JS__TEMPLATE = eINSTANCE.getAppAngularJS_Template();

		/**
		 * The meta object literal for the '<em><b>Modelos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_ANGULAR_JS__MODELOS = eINSTANCE.getAppAngularJS_Modelos();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_ANGULAR_JS__NAME = eINSTANCE.getAppAngularJS_Name();

		/**
		 * The meta object literal for the '{@link angularjs.impl.ModuloImpl <em>Modulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs.impl.ModuloImpl
		 * @see angularjs.impl.AngularjsPackageImpl#getModulo()
		 * @generated
		 */
		EClass MODULO = eINSTANCE.getModulo();

		/**
		 * The meta object literal for the '<em><b>Parametros</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULO__PARAMETROS = eINSTANCE.getModulo_Parametros();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULO__SERVICES = eINSTANCE.getModulo_Services();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULO__CONTROLLER = eINSTANCE.getModulo_Controller();

		/**
		 * The meta object literal for the '<em><b>Modulos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULO__MODULOS = eINSTANCE.getModulo_Modulos();

		/**
		 * The meta object literal for the '{@link angularjs.impl.AnotacionImpl <em>Anotacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs.impl.AnotacionImpl
		 * @see angularjs.impl.AngularjsPackageImpl#getAnotacion()
		 * @generated
		 */
		EClass ANOTACION = eINSTANCE.getAnotacion();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANOTACION__VALUE = eINSTANCE.getAnotacion_Value();

		/**
		 * The meta object literal for the '{@link angularjs.impl.FuncionImpl <em>Funcion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs.impl.FuncionImpl
		 * @see angularjs.impl.AngularjsPackageImpl#getFuncion()
		 * @generated
		 */
		EClass FUNCION = eINSTANCE.getFuncion();

		/**
		 * The meta object literal for the '<em><b>Funcion</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCION__FUNCION = eINSTANCE.getFuncion_Funcion();

		/**
		 * The meta object literal for the '<em><b>Tiene Retorno</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCION__TIENE_RETORNO = eINSTANCE.getFuncion_TieneRetorno();

		/**
		 * The meta object literal for the '<em><b>Parametros</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCION__PARAMETROS = eINSTANCE.getFuncion_Parametros();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCION__BODY = eINSTANCE.getFuncion_Body();

		/**
		 * The meta object literal for the '{@link angularjs.impl.ParametroImpl <em>Parametro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs.impl.ParametroImpl
		 * @see angularjs.impl.AngularjsPackageImpl#getParametro()
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
		 * The meta object literal for the '{@link angularjs.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs.impl.VariableImpl
		 * @see angularjs.impl.AngularjsPackageImpl#getVariable()
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

		/**
		 * The meta object literal for the '<em><b>Anotacion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__ANOTACION = eINSTANCE.getVariable_Anotacion();

		/**
		 * The meta object literal for the '{@link angularjs.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs.impl.ControllerImpl
		 * @see angularjs.impl.AngularjsPackageImpl#getController()
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
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__VARIABLE = eINSTANCE.getController_Variable();

		/**
		 * The meta object literal for the '<em><b>Parametros</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__PARAMETROS = eINSTANCE.getController_Parametros();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__BODY = eINSTANCE.getController_Body();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__TEMPLATE = eINSTANCE.getController_Template();

		/**
		 * The meta object literal for the '<em><b>Modelo</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__MODELO = eINSTANCE.getController_Modelo();

		/**
		 * The meta object literal for the '{@link angularjs.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs.impl.ServiceImpl
		 * @see angularjs.impl.AngularjsPackageImpl#getService()
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
		 * The meta object literal for the '{@link angularjs.impl.ObjetoJavaScriptImpl <em>Objeto Java Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs.impl.ObjetoJavaScriptImpl
		 * @see angularjs.impl.AngularjsPackageImpl#getObjetoJavaScript()
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
		 * The meta object literal for the '{@link angularjs.impl.ModeloImpl <em>Modelo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs.impl.ModeloImpl
		 * @see angularjs.impl.AngularjsPackageImpl#getModelo()
		 * @generated
		 */
		EClass MODELO = eINSTANCE.getModelo();

		/**
		 * The meta object literal for the '{@link angularjs.impl.TemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs.impl.TemplateImpl
		 * @see angularjs.impl.AngularjsPackageImpl#getTemplate()
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
		 * The meta object literal for the '<em><b>Directiva</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__DIRECTIVA = eINSTANCE.getTemplate_Directiva();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__CONTROLLER = eINSTANCE.getTemplate_Controller();

		/**
		 * The meta object literal for the '{@link angularjs.impl.SetenciaHTMLImpl <em>Setencia HTML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs.impl.SetenciaHTMLImpl
		 * @see angularjs.impl.AngularjsPackageImpl#getSetenciaHTML()
		 * @generated
		 */
		EClass SETENCIA_HTML = eINSTANCE.getSetenciaHTML();

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
		 * The meta object literal for the '<em><b>Directivas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETENCIA_HTML__DIRECTIVAS = eINSTANCE.getSetenciaHTML_Directivas();

		/**
		 * The meta object literal for the '<em><b>Curlybraces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETENCIA_HTML__CURLYBRACES = eINSTANCE.getSetenciaHTML_Curlybraces();

		/**
		 * The meta object literal for the '{@link angularjs.impl.PropiedadImpl <em>Propiedad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs.impl.PropiedadImpl
		 * @see angularjs.impl.AngularjsPackageImpl#getPropiedad()
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
		 * The meta object literal for the '{@link angularjs.impl.ReferenciaImpl <em>Referencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs.impl.ReferenciaImpl
		 * @see angularjs.impl.AngularjsPackageImpl#getReferencia()
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
		 * The meta object literal for the '{@link angularjs.impl.ExpresionImpl <em>Expresion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs.impl.ExpresionImpl
		 * @see angularjs.impl.AngularjsPackageImpl#getExpresion()
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
		 * The meta object literal for the '{@link angularjs.impl.FiltroImpl <em>Filtro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs.impl.FiltroImpl
		 * @see angularjs.impl.AngularjsPackageImpl#getFiltro()
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
		 * The meta object literal for the '{@link angularjs.impl.DirectivaImpl <em>Directiva</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs.impl.DirectivaImpl
		 * @see angularjs.impl.AngularjsPackageImpl#getDirectiva()
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
		 * The meta object literal for the '{@link angularjs.impl.CurlyBracesImpl <em>Curly Braces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs.impl.CurlyBracesImpl
		 * @see angularjs.impl.AngularjsPackageImpl#getCurlyBraces()
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

	}

} //AngularjsPackage
