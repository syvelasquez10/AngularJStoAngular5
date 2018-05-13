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
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ANGULAR_JS__TEMPLATES = 1;

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
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ANGULAR_JS__SERVICES = 4;

	/**
	 * The feature id for the '<em><b>Componentes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ANGULAR_JS__COMPONENTES = 5;

	/**
	 * The number of structural features of the '<em>App Angular JS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ANGULAR_JS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>App Angular JS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ANGULAR_JS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link angularjs.impl.ObjetoAngularImpl <em>Objeto Angular</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.ObjetoAngularImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getObjetoAngular()
	 * @generated
	 */
	int OBJETO_ANGULAR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJETO_ANGULAR__NAME = 0;

	/**
	 * The number of structural features of the '<em>Objeto Angular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJETO_ANGULAR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Objeto Angular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJETO_ANGULAR_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__NAME = OBJETO_ANGULAR__NAME;

	/**
	 * The feature id for the '<em><b>Parametros</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__PARAMETROS = OBJETO_ANGULAR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO_FEATURE_COUNT = OBJETO_ANGULAR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO_OPERATION_COUNT = OBJETO_ANGULAR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTACION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTACION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Anotacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTACION_FEATURE_COUNT = 2;

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
	int FUNCION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION__BODY = 1;

	/**
	 * The feature id for the '<em><b>Parametros</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION__PARAMETROS = 2;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION__VARIABLES = 3;

	/**
	 * The number of structural features of the '<em>Funcion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Funcion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link angularjs.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.VariableImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALOR = 0;

	/**
	 * The feature id for the '<em><b>Anotacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ANOTACION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link angularjs.impl.ComponenteImpl <em>Componente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.ComponenteImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getComponente()
	 * @generated
	 */
	int COMPONENTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTE__NAME = OBJETO_ANGULAR__NAME;

	/**
	 * The feature id for the '<em><b>Funcion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTE__FUNCION = OBJETO_ANGULAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTE__TEMPLATE = OBJETO_ANGULAR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modelo</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTE__MODELO = OBJETO_ANGULAR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parametros</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTE__PARAMETROS = OBJETO_ANGULAR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Modulo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTE__MODULO = OBJETO_ANGULAR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Componente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTE_FEATURE_COUNT = OBJETO_ANGULAR_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Componente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTE_OPERATION_COUNT = OBJETO_ANGULAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link angularjs.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.ServiceImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = OBJETO_ANGULAR__NAME;

	/**
	 * The feature id for the '<em><b>Funcion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__FUNCION = OBJETO_ANGULAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parametros</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PARAMETROS = OBJETO_ANGULAR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = OBJETO_ANGULAR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = OBJETO_ANGULAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link angularjs.impl.ModeloImpl <em>Modelo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.ModeloImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getModelo()
	 * @generated
	 */
	int MODELO = 8;

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
	int TEMPLATE = 9;

	/**
	 * The feature id for the '<em><b>Sentenciashtml</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__SENTENCIASHTML = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__CONTROLLER = 2;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link angularjs.impl.SentenciaHTMLImpl <em>Sentencia HTML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.SentenciaHTMLImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getSentenciaHTML()
	 * @generated
	 */
	int SENTENCIA_HTML = 10;

	/**
	 * The feature id for the '<em><b>Sentenciashtml</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCIA_HTML__SENTENCIASHTML = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCIA_HTML__NAME = 1;

	/**
	 * The feature id for the '<em><b>Propiedades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCIA_HTML__PROPIEDADES = 2;

	/**
	 * The feature id for the '<em><b>Curlybraces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCIA_HTML__CURLYBRACES = 3;

	/**
	 * The feature id for the '<em><b>Directivas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCIA_HTML__DIRECTIVAS = 4;

	/**
	 * The number of structural features of the '<em>Sentencia HTML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCIA_HTML_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Sentencia HTML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCIA_HTML_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link angularjs.impl.PropiedadImpl <em>Propiedad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.PropiedadImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getPropiedad()
	 * @generated
	 */
	int PROPIEDAD = 11;

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
	 * The meta object id for the '{@link angularjs.impl.ExpresionImpl <em>Expresion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs.impl.ExpresionImpl
	 * @see angularjs.impl.AngularjsPackageImpl#getExpresion()
	 * @generated
	 */
	int EXPRESION = 12;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION__VALOR = 0;

	/**
	 * The feature id for the '<em><b>Referencia</b></em>' reference.
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
	int FILTRO = 13;

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
	int DIRECTIVA = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Curlybraces</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVA__CURLYBRACES = 1;

	/**
	 * The feature id for the '<em><b>Referencia</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVA__REFERENCIA = 2;

	/**
	 * The number of structural features of the '<em>Directiva</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVA_FEATURE_COUNT = 3;

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
	int CURLY_BRACES = 15;

	/**
	 * The feature id for the '<em><b>Expresion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACES__EXPRESION = 0;

	/**
	 * The feature id for the '<em><b>Filtro</b></em>' containment reference.
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
	 * Returns the meta object for the containment reference list '{@link angularjs.AppAngularJS#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see angularjs.AppAngularJS#getTemplates()
	 * @see #getAppAngularJS()
	 * @generated
	 */
	EReference getAppAngularJS_Templates();

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
	 * Returns the meta object for the containment reference list '{@link angularjs.AppAngularJS#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see angularjs.AppAngularJS#getServices()
	 * @see #getAppAngularJS()
	 * @generated
	 */
	EReference getAppAngularJS_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs.AppAngularJS#getComponentes <em>Componentes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Componentes</em>'.
	 * @see angularjs.AppAngularJS#getComponentes()
	 * @see #getAppAngularJS()
	 * @generated
	 */
	EReference getAppAngularJS_Componentes();

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
	 * Returns the meta object for the reference list '{@link angularjs.Modulo#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parametros</em>'.
	 * @see angularjs.Modulo#getParametros()
	 * @see #getModulo()
	 * @generated
	 */
	EReference getModulo_Parametros();

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
	 * Returns the meta object for the attribute '{@link angularjs.Anotacion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs.Anotacion#getName()
	 * @see #getAnotacion()
	 * @generated
	 */
	EAttribute getAnotacion_Name();

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
	 * Returns the meta object for the attribute '{@link angularjs.Funcion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs.Funcion#getName()
	 * @see #getFuncion()
	 * @generated
	 */
	EAttribute getFuncion_Name();

	/**
	 * Returns the meta object for the attribute '{@link angularjs.Funcion#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parametros</em>'.
	 * @see angularjs.Funcion#getParametros()
	 * @see #getFuncion()
	 * @generated
	 */
	EAttribute getFuncion_Parametros();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs.Funcion#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see angularjs.Funcion#getVariables()
	 * @see #getFuncion()
	 * @generated
	 */
	EReference getFuncion_Variables();

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
	 * Returns the meta object for the containment reference list '{@link angularjs.Variable#getAnotacion <em>Anotacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anotacion</em>'.
	 * @see angularjs.Variable#getAnotacion()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Anotacion();

	/**
	 * Returns the meta object for the attribute '{@link angularjs.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link angularjs.Componente <em>Componente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Componente</em>'.
	 * @see angularjs.Componente
	 * @generated
	 */
	EClass getComponente();

	/**
	 * Returns the meta object for the containment reference '{@link angularjs.Componente#getFuncion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Funcion</em>'.
	 * @see angularjs.Componente#getFuncion()
	 * @see #getComponente()
	 * @generated
	 */
	EReference getComponente_Funcion();

	/**
	 * Returns the meta object for the reference '{@link angularjs.Componente#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see angularjs.Componente#getTemplate()
	 * @see #getComponente()
	 * @generated
	 */
	EReference getComponente_Template();

	/**
	 * Returns the meta object for the reference list '{@link angularjs.Componente#getModelo <em>Modelo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modelo</em>'.
	 * @see angularjs.Componente#getModelo()
	 * @see #getComponente()
	 * @generated
	 */
	EReference getComponente_Modelo();

	/**
	 * Returns the meta object for the reference list '{@link angularjs.Componente#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parametros</em>'.
	 * @see angularjs.Componente#getParametros()
	 * @see #getComponente()
	 * @generated
	 */
	EReference getComponente_Parametros();

	/**
	 * Returns the meta object for the reference '{@link angularjs.Componente#getModulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modulo</em>'.
	 * @see angularjs.Componente#getModulo()
	 * @see #getComponente()
	 * @generated
	 */
	EReference getComponente_Modulo();

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
	 * Returns the meta object for the containment reference '{@link angularjs.Service#getFuncion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Funcion</em>'.
	 * @see angularjs.Service#getFuncion()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Funcion();

	/**
	 * Returns the meta object for the reference list '{@link angularjs.Service#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parametros</em>'.
	 * @see angularjs.Service#getParametros()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Parametros();

	/**
	 * Returns the meta object for class '{@link angularjs.ObjetoAngular <em>Objeto Angular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objeto Angular</em>'.
	 * @see angularjs.ObjetoAngular
	 * @generated
	 */
	EClass getObjetoAngular();

	/**
	 * Returns the meta object for the attribute '{@link angularjs.ObjetoAngular#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs.ObjetoAngular#getName()
	 * @see #getObjetoAngular()
	 * @generated
	 */
	EAttribute getObjetoAngular_Name();

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
	 * Returns the meta object for the containment reference list '{@link angularjs.Template#getSentenciashtml <em>Sentenciashtml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sentenciashtml</em>'.
	 * @see angularjs.Template#getSentenciashtml()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Sentenciashtml();

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
	 * Returns the meta object for class '{@link angularjs.SentenciaHTML <em>Sentencia HTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sentencia HTML</em>'.
	 * @see angularjs.SentenciaHTML
	 * @generated
	 */
	EClass getSentenciaHTML();

	/**
	 * Returns the meta object for the reference list '{@link angularjs.SentenciaHTML#getSentenciashtml <em>Sentenciashtml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sentenciashtml</em>'.
	 * @see angularjs.SentenciaHTML#getSentenciashtml()
	 * @see #getSentenciaHTML()
	 * @generated
	 */
	EReference getSentenciaHTML_Sentenciashtml();

	/**
	 * Returns the meta object for the attribute '{@link angularjs.SentenciaHTML#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs.SentenciaHTML#getName()
	 * @see #getSentenciaHTML()
	 * @generated
	 */
	EAttribute getSentenciaHTML_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs.SentenciaHTML#getPropiedades <em>Propiedades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Propiedades</em>'.
	 * @see angularjs.SentenciaHTML#getPropiedades()
	 * @see #getSentenciaHTML()
	 * @generated
	 */
	EReference getSentenciaHTML_Propiedades();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs.SentenciaHTML#getDirectivas <em>Directivas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Directivas</em>'.
	 * @see angularjs.SentenciaHTML#getDirectivas()
	 * @see #getSentenciaHTML()
	 * @generated
	 */
	EReference getSentenciaHTML_Directivas();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs.SentenciaHTML#getCurlybraces <em>Curlybraces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Curlybraces</em>'.
	 * @see angularjs.SentenciaHTML#getCurlybraces()
	 * @see #getSentenciaHTML()
	 * @generated
	 */
	EReference getSentenciaHTML_Curlybraces();

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
	 * Returns the meta object for the reference '{@link angularjs.Expresion#getReferencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referencia</em>'.
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
	 * Returns the meta object for the reference '{@link angularjs.Directiva#getCurlybraces <em>Curlybraces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Curlybraces</em>'.
	 * @see angularjs.Directiva#getCurlybraces()
	 * @see #getDirectiva()
	 * @generated
	 */
	EReference getDirectiva_Curlybraces();

	/**
	 * Returns the meta object for the reference '{@link angularjs.Directiva#getReferencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referencia</em>'.
	 * @see angularjs.Directiva#getReferencia()
	 * @see #getDirectiva()
	 * @generated
	 */
	EReference getDirectiva_Referencia();

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
	 * Returns the meta object for the containment reference '{@link angularjs.CurlyBraces#getFiltro <em>Filtro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filtro</em>'.
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
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_ANGULAR_JS__TEMPLATES = eINSTANCE.getAppAngularJS_Templates();

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
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_ANGULAR_JS__SERVICES = eINSTANCE.getAppAngularJS_Services();

		/**
		 * The meta object literal for the '<em><b>Componentes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_ANGULAR_JS__COMPONENTES = eINSTANCE.getAppAngularJS_Componentes();

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
		 * The meta object literal for the '<em><b>Parametros</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULO__PARAMETROS = eINSTANCE.getModulo_Parametros();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANOTACION__NAME = eINSTANCE.getAnotacion_Name();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCION__NAME = eINSTANCE.getFuncion_Name();

		/**
		 * The meta object literal for the '<em><b>Parametros</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCION__PARAMETROS = eINSTANCE.getFuncion_Parametros();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCION__VARIABLES = eINSTANCE.getFuncion_Variables();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCION__BODY = eINSTANCE.getFuncion_Body();

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
		 * The meta object literal for the '<em><b>Anotacion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__ANOTACION = eINSTANCE.getVariable_Anotacion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link angularjs.impl.ComponenteImpl <em>Componente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs.impl.ComponenteImpl
		 * @see angularjs.impl.AngularjsPackageImpl#getComponente()
		 * @generated
		 */
		EClass COMPONENTE = eINSTANCE.getComponente();

		/**
		 * The meta object literal for the '<em><b>Funcion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTE__FUNCION = eINSTANCE.getComponente_Funcion();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTE__TEMPLATE = eINSTANCE.getComponente_Template();

		/**
		 * The meta object literal for the '<em><b>Modelo</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTE__MODELO = eINSTANCE.getComponente_Modelo();

		/**
		 * The meta object literal for the '<em><b>Parametros</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTE__PARAMETROS = eINSTANCE.getComponente_Parametros();

		/**
		 * The meta object literal for the '<em><b>Modulo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTE__MODULO = eINSTANCE.getComponente_Modulo();

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
		 * The meta object literal for the '<em><b>Funcion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__FUNCION = eINSTANCE.getService_Funcion();

		/**
		 * The meta object literal for the '<em><b>Parametros</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__PARAMETROS = eINSTANCE.getService_Parametros();

		/**
		 * The meta object literal for the '{@link angularjs.impl.ObjetoAngularImpl <em>Objeto Angular</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs.impl.ObjetoAngularImpl
		 * @see angularjs.impl.AngularjsPackageImpl#getObjetoAngular()
		 * @generated
		 */
		EClass OBJETO_ANGULAR = eINSTANCE.getObjetoAngular();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJETO_ANGULAR__NAME = eINSTANCE.getObjetoAngular_Name();

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
		 * The meta object literal for the '<em><b>Sentenciashtml</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__SENTENCIASHTML = eINSTANCE.getTemplate_Sentenciashtml();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE__NAME = eINSTANCE.getTemplate_Name();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__CONTROLLER = eINSTANCE.getTemplate_Controller();

		/**
		 * The meta object literal for the '{@link angularjs.impl.SentenciaHTMLImpl <em>Sentencia HTML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs.impl.SentenciaHTMLImpl
		 * @see angularjs.impl.AngularjsPackageImpl#getSentenciaHTML()
		 * @generated
		 */
		EClass SENTENCIA_HTML = eINSTANCE.getSentenciaHTML();

		/**
		 * The meta object literal for the '<em><b>Sentenciashtml</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTENCIA_HTML__SENTENCIASHTML = eINSTANCE.getSentenciaHTML_Sentenciashtml();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENTENCIA_HTML__NAME = eINSTANCE.getSentenciaHTML_Name();

		/**
		 * The meta object literal for the '<em><b>Propiedades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTENCIA_HTML__PROPIEDADES = eINSTANCE.getSentenciaHTML_Propiedades();

		/**
		 * The meta object literal for the '<em><b>Directivas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTENCIA_HTML__DIRECTIVAS = eINSTANCE.getSentenciaHTML_Directivas();

		/**
		 * The meta object literal for the '<em><b>Curlybraces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTENCIA_HTML__CURLYBRACES = eINSTANCE.getSentenciaHTML_Curlybraces();

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
		 * The meta object literal for the '<em><b>Referencia</b></em>' reference feature.
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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTIVA__NAME = eINSTANCE.getDirectiva_Name();

		/**
		 * The meta object literal for the '<em><b>Curlybraces</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTIVA__CURLYBRACES = eINSTANCE.getDirectiva_Curlybraces();

		/**
		 * The meta object literal for the '<em><b>Referencia</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTIVA__REFERENCIA = eINSTANCE.getDirectiva_Referencia();

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
		 * The meta object literal for the '<em><b>Filtro</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURLY_BRACES__FILTRO = eINSTANCE.getCurlyBraces_Filtro();

	}

} //AngularjsPackage
