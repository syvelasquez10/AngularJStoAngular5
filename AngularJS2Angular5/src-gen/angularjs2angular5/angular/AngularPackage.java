/**
 */
package angularjs2angular5.angular;

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
 * @see angularjs2angular5.angular.AngularFactory
 * @model kind="package"
 * @generated
 */
public interface AngularPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "angular";

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
	String eNS_PREFIX = "angular";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AngularPackage eINSTANCE = angularjs2angular5.angular.impl.AngularPackageImpl.init();

	/**
	 * The meta object id for the '{@link angularjs2angular5.angular.impl.AppAngularImpl <em>App Angular</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs2angular5.angular.impl.AppAngularImpl
	 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getAppAngular()
	 * @generated
	 */
	int APP_ANGULAR = 0;

	/**
	 * The feature id for the '<em><b>Modulos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ANGULAR__MODULOS = 0;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ANGULAR__TEMPLATES = 1;

	/**
	 * The feature id for the '<em><b>Modelos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ANGULAR__MODELOS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ANGULAR__NAME = 3;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ANGULAR__SERVICES = 4;

	/**
	 * The feature id for the '<em><b>Componentes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ANGULAR__COMPONENTES = 5;

	/**
	 * The number of structural features of the '<em>App Angular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ANGULAR_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>App Angular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ANGULAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link angularjs2angular5.angular.impl.ObjetoAngularImpl <em>Objeto Angular</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs2angular5.angular.impl.ObjetoAngularImpl
	 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getObjetoAngular()
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
	 * The meta object id for the '{@link angularjs2angular5.angular.impl.ModuloImpl <em>Modulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs2angular5.angular.impl.ModuloImpl
	 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getModulo()
	 * @generated
	 */
	int MODULO = 1;

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
	 * The meta object id for the '{@link angularjs2angular5.angular.impl.AnotacionImpl <em>Anotacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs2angular5.angular.impl.AnotacionImpl
	 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getAnotacion()
	 * @generated
	 */
	int ANOTACION = 2;

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
	 * The feature id for the '<em><b>Primitivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTACION__PRIMITIVO = 2;

	/**
	 * The number of structural features of the '<em>Anotacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTACION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Anotacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link angularjs2angular5.angular.impl.FuncionImpl <em>Funcion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs2angular5.angular.impl.FuncionImpl
	 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getFuncion()
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
	 * The meta object id for the '{@link angularjs2angular5.angular.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs2angular5.angular.impl.VariableImpl
	 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getVariable()
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
	 * The feature id for the '<em><b>Anotacion</b></em>' containment reference.
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
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TIPO = 3;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link angularjs2angular5.angular.impl.ComponenteImpl <em>Componente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs2angular5.angular.impl.ComponenteImpl
	 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getComponente()
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
	 * The meta object id for the '{@link angularjs2angular5.angular.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs2angular5.angular.impl.ServiceImpl
	 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getService()
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
	 * The feature id for the '<em><b>Modulo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__MODULO = OBJETO_ANGULAR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = OBJETO_ANGULAR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = OBJETO_ANGULAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link angularjs2angular5.angular.impl.ModeloImpl <em>Modelo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs2angular5.angular.impl.ModeloImpl
	 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getModelo()
	 * @generated
	 */
	int MODELO = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELO__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Modelo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Modelo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link angularjs2angular5.angular.impl.TemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs2angular5.angular.impl.TemplateImpl
	 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getTemplate()
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
	 * The meta object id for the '{@link angularjs2angular5.angular.impl.SentenciaHTMLImpl <em>Sentencia HTML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs2angular5.angular.impl.SentenciaHTMLImpl
	 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getSentenciaHTML()
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
	 * The meta object id for the '{@link angularjs2angular5.angular.impl.PropiedadImpl <em>Propiedad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs2angular5.angular.impl.PropiedadImpl
	 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getPropiedad()
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
	 * The meta object id for the '{@link angularjs2angular5.angular.impl.ExpresionImpl <em>Expresion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs2angular5.angular.impl.ExpresionImpl
	 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getExpresion()
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
	 * The meta object id for the '{@link angularjs2angular5.angular.impl.FiltroImpl <em>Filtro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs2angular5.angular.impl.FiltroImpl
	 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getFiltro()
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
	 * The meta object id for the '{@link angularjs2angular5.angular.impl.DirectivaImpl <em>Directiva</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs2angular5.angular.impl.DirectivaImpl
	 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getDirectiva()
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
	 * The meta object id for the '{@link angularjs2angular5.angular.impl.CurlyBracesImpl <em>Curly Braces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see angularjs2angular5.angular.impl.CurlyBracesImpl
	 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getCurlyBraces()
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
	 * Returns the meta object for class '{@link angularjs2angular5.angular.AppAngular <em>App Angular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Angular</em>'.
	 * @see angularjs2angular5.angular.AppAngular
	 * @generated
	 */
	EClass getAppAngular();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs2angular5.angular.AppAngular#getModulos <em>Modulos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modulos</em>'.
	 * @see angularjs2angular5.angular.AppAngular#getModulos()
	 * @see #getAppAngular()
	 * @generated
	 */
	EReference getAppAngular_Modulos();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs2angular5.angular.AppAngular#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see angularjs2angular5.angular.AppAngular#getTemplates()
	 * @see #getAppAngular()
	 * @generated
	 */
	EReference getAppAngular_Templates();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs2angular5.angular.AppAngular#getModelos <em>Modelos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modelos</em>'.
	 * @see angularjs2angular5.angular.AppAngular#getModelos()
	 * @see #getAppAngular()
	 * @generated
	 */
	EReference getAppAngular_Modelos();

	/**
	 * Returns the meta object for the attribute '{@link angularjs2angular5.angular.AppAngular#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs2angular5.angular.AppAngular#getName()
	 * @see #getAppAngular()
	 * @generated
	 */
	EAttribute getAppAngular_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs2angular5.angular.AppAngular#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see angularjs2angular5.angular.AppAngular#getServices()
	 * @see #getAppAngular()
	 * @generated
	 */
	EReference getAppAngular_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs2angular5.angular.AppAngular#getComponentes <em>Componentes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Componentes</em>'.
	 * @see angularjs2angular5.angular.AppAngular#getComponentes()
	 * @see #getAppAngular()
	 * @generated
	 */
	EReference getAppAngular_Componentes();

	/**
	 * Returns the meta object for class '{@link angularjs2angular5.angular.Modulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modulo</em>'.
	 * @see angularjs2angular5.angular.Modulo
	 * @generated
	 */
	EClass getModulo();

	/**
	 * Returns the meta object for the reference list '{@link angularjs2angular5.angular.Modulo#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parametros</em>'.
	 * @see angularjs2angular5.angular.Modulo#getParametros()
	 * @see #getModulo()
	 * @generated
	 */
	EReference getModulo_Parametros();

	/**
	 * Returns the meta object for class '{@link angularjs2angular5.angular.Anotacion <em>Anotacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anotacion</em>'.
	 * @see angularjs2angular5.angular.Anotacion
	 * @generated
	 */
	EClass getAnotacion();

	/**
	 * Returns the meta object for the attribute '{@link angularjs2angular5.angular.Anotacion#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see angularjs2angular5.angular.Anotacion#getValue()
	 * @see #getAnotacion()
	 * @generated
	 */
	EAttribute getAnotacion_Value();

	/**
	 * Returns the meta object for the attribute '{@link angularjs2angular5.angular.Anotacion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs2angular5.angular.Anotacion#getName()
	 * @see #getAnotacion()
	 * @generated
	 */
	EAttribute getAnotacion_Name();

	/**
	 * Returns the meta object for the attribute '{@link angularjs2angular5.angular.Anotacion#isPrimitivo <em>Primitivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitivo</em>'.
	 * @see angularjs2angular5.angular.Anotacion#isPrimitivo()
	 * @see #getAnotacion()
	 * @generated
	 */
	EAttribute getAnotacion_Primitivo();

	/**
	 * Returns the meta object for class '{@link angularjs2angular5.angular.Funcion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Funcion</em>'.
	 * @see angularjs2angular5.angular.Funcion
	 * @generated
	 */
	EClass getFuncion();

	/**
	 * Returns the meta object for the attribute '{@link angularjs2angular5.angular.Funcion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs2angular5.angular.Funcion#getName()
	 * @see #getFuncion()
	 * @generated
	 */
	EAttribute getFuncion_Name();

	/**
	 * Returns the meta object for the attribute '{@link angularjs2angular5.angular.Funcion#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see angularjs2angular5.angular.Funcion#getBody()
	 * @see #getFuncion()
	 * @generated
	 */
	EAttribute getFuncion_Body();

	/**
	 * Returns the meta object for the attribute '{@link angularjs2angular5.angular.Funcion#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parametros</em>'.
	 * @see angularjs2angular5.angular.Funcion#getParametros()
	 * @see #getFuncion()
	 * @generated
	 */
	EAttribute getFuncion_Parametros();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs2angular5.angular.Funcion#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see angularjs2angular5.angular.Funcion#getVariables()
	 * @see #getFuncion()
	 * @generated
	 */
	EReference getFuncion_Variables();

	/**
	 * Returns the meta object for class '{@link angularjs2angular5.angular.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see angularjs2angular5.angular.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link angularjs2angular5.angular.Variable#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see angularjs2angular5.angular.Variable#getValor()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Valor();

	/**
	 * Returns the meta object for the containment reference '{@link angularjs2angular5.angular.Variable#getAnotacion <em>Anotacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anotacion</em>'.
	 * @see angularjs2angular5.angular.Variable#getAnotacion()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Anotacion();

	/**
	 * Returns the meta object for the attribute '{@link angularjs2angular5.angular.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs2angular5.angular.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link angularjs2angular5.angular.Variable#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see angularjs2angular5.angular.Variable#getTipo()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Tipo();

	/**
	 * Returns the meta object for class '{@link angularjs2angular5.angular.Componente <em>Componente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Componente</em>'.
	 * @see angularjs2angular5.angular.Componente
	 * @generated
	 */
	EClass getComponente();

	/**
	 * Returns the meta object for the containment reference '{@link angularjs2angular5.angular.Componente#getFuncion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Funcion</em>'.
	 * @see angularjs2angular5.angular.Componente#getFuncion()
	 * @see #getComponente()
	 * @generated
	 */
	EReference getComponente_Funcion();

	/**
	 * Returns the meta object for the reference '{@link angularjs2angular5.angular.Componente#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see angularjs2angular5.angular.Componente#getTemplate()
	 * @see #getComponente()
	 * @generated
	 */
	EReference getComponente_Template();

	/**
	 * Returns the meta object for the reference list '{@link angularjs2angular5.angular.Componente#getModelo <em>Modelo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modelo</em>'.
	 * @see angularjs2angular5.angular.Componente#getModelo()
	 * @see #getComponente()
	 * @generated
	 */
	EReference getComponente_Modelo();

	/**
	 * Returns the meta object for the reference list '{@link angularjs2angular5.angular.Componente#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parametros</em>'.
	 * @see angularjs2angular5.angular.Componente#getParametros()
	 * @see #getComponente()
	 * @generated
	 */
	EReference getComponente_Parametros();

	/**
	 * Returns the meta object for the reference '{@link angularjs2angular5.angular.Componente#getModulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modulo</em>'.
	 * @see angularjs2angular5.angular.Componente#getModulo()
	 * @see #getComponente()
	 * @generated
	 */
	EReference getComponente_Modulo();

	/**
	 * Returns the meta object for class '{@link angularjs2angular5.angular.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see angularjs2angular5.angular.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference '{@link angularjs2angular5.angular.Service#getFuncion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Funcion</em>'.
	 * @see angularjs2angular5.angular.Service#getFuncion()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Funcion();

	/**
	 * Returns the meta object for the reference list '{@link angularjs2angular5.angular.Service#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parametros</em>'.
	 * @see angularjs2angular5.angular.Service#getParametros()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Parametros();

	/**
	 * Returns the meta object for the reference '{@link angularjs2angular5.angular.Service#getModulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modulo</em>'.
	 * @see angularjs2angular5.angular.Service#getModulo()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Modulo();

	/**
	 * Returns the meta object for class '{@link angularjs2angular5.angular.ObjetoAngular <em>Objeto Angular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objeto Angular</em>'.
	 * @see angularjs2angular5.angular.ObjetoAngular
	 * @generated
	 */
	EClass getObjetoAngular();

	/**
	 * Returns the meta object for the attribute '{@link angularjs2angular5.angular.ObjetoAngular#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs2angular5.angular.ObjetoAngular#getName()
	 * @see #getObjetoAngular()
	 * @generated
	 */
	EAttribute getObjetoAngular_Name();

	/**
	 * Returns the meta object for class '{@link angularjs2angular5.angular.Modelo <em>Modelo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelo</em>'.
	 * @see angularjs2angular5.angular.Modelo
	 * @generated
	 */
	EClass getModelo();

	/**
	 * Returns the meta object for the attribute '{@link angularjs2angular5.angular.Modelo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs2angular5.angular.Modelo#getName()
	 * @see #getModelo()
	 * @generated
	 */
	EAttribute getModelo_Name();

	/**
	 * Returns the meta object for the attribute '{@link angularjs2angular5.angular.Modelo#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see angularjs2angular5.angular.Modelo#getValue()
	 * @see #getModelo()
	 * @generated
	 */
	EAttribute getModelo_Value();

	/**
	 * Returns the meta object for class '{@link angularjs2angular5.angular.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see angularjs2angular5.angular.Template
	 * @generated
	 */
	EClass getTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs2angular5.angular.Template#getSentenciashtml <em>Sentenciashtml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sentenciashtml</em>'.
	 * @see angularjs2angular5.angular.Template#getSentenciashtml()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Sentenciashtml();

	/**
	 * Returns the meta object for the attribute '{@link angularjs2angular5.angular.Template#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs2angular5.angular.Template#getName()
	 * @see #getTemplate()
	 * @generated
	 */
	EAttribute getTemplate_Name();

	/**
	 * Returns the meta object for the reference '{@link angularjs2angular5.angular.Template#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controller</em>'.
	 * @see angularjs2angular5.angular.Template#getController()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Controller();

	/**
	 * Returns the meta object for class '{@link angularjs2angular5.angular.SentenciaHTML <em>Sentencia HTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sentencia HTML</em>'.
	 * @see angularjs2angular5.angular.SentenciaHTML
	 * @generated
	 */
	EClass getSentenciaHTML();

	/**
	 * Returns the meta object for the reference list '{@link angularjs2angular5.angular.SentenciaHTML#getSentenciashtml <em>Sentenciashtml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sentenciashtml</em>'.
	 * @see angularjs2angular5.angular.SentenciaHTML#getSentenciashtml()
	 * @see #getSentenciaHTML()
	 * @generated
	 */
	EReference getSentenciaHTML_Sentenciashtml();

	/**
	 * Returns the meta object for the attribute '{@link angularjs2angular5.angular.SentenciaHTML#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs2angular5.angular.SentenciaHTML#getName()
	 * @see #getSentenciaHTML()
	 * @generated
	 */
	EAttribute getSentenciaHTML_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs2angular5.angular.SentenciaHTML#getPropiedades <em>Propiedades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Propiedades</em>'.
	 * @see angularjs2angular5.angular.SentenciaHTML#getPropiedades()
	 * @see #getSentenciaHTML()
	 * @generated
	 */
	EReference getSentenciaHTML_Propiedades();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs2angular5.angular.SentenciaHTML#getCurlybraces <em>Curlybraces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Curlybraces</em>'.
	 * @see angularjs2angular5.angular.SentenciaHTML#getCurlybraces()
	 * @see #getSentenciaHTML()
	 * @generated
	 */
	EReference getSentenciaHTML_Curlybraces();

	/**
	 * Returns the meta object for the containment reference list '{@link angularjs2angular5.angular.SentenciaHTML#getDirectivas <em>Directivas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Directivas</em>'.
	 * @see angularjs2angular5.angular.SentenciaHTML#getDirectivas()
	 * @see #getSentenciaHTML()
	 * @generated
	 */
	EReference getSentenciaHTML_Directivas();

	/**
	 * Returns the meta object for class '{@link angularjs2angular5.angular.Propiedad <em>Propiedad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propiedad</em>'.
	 * @see angularjs2angular5.angular.Propiedad
	 * @generated
	 */
	EClass getPropiedad();

	/**
	 * Returns the meta object for the attribute '{@link angularjs2angular5.angular.Propiedad#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs2angular5.angular.Propiedad#getName()
	 * @see #getPropiedad()
	 * @generated
	 */
	EAttribute getPropiedad_Name();

	/**
	 * Returns the meta object for the attribute '{@link angularjs2angular5.angular.Propiedad#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see angularjs2angular5.angular.Propiedad#getValor()
	 * @see #getPropiedad()
	 * @generated
	 */
	EAttribute getPropiedad_Valor();

	/**
	 * Returns the meta object for class '{@link angularjs2angular5.angular.Expresion <em>Expresion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expresion</em>'.
	 * @see angularjs2angular5.angular.Expresion
	 * @generated
	 */
	EClass getExpresion();

	/**
	 * Returns the meta object for the attribute '{@link angularjs2angular5.angular.Expresion#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see angularjs2angular5.angular.Expresion#getValor()
	 * @see #getExpresion()
	 * @generated
	 */
	EAttribute getExpresion_Valor();

	/**
	 * Returns the meta object for the reference '{@link angularjs2angular5.angular.Expresion#getReferencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referencia</em>'.
	 * @see angularjs2angular5.angular.Expresion#getReferencia()
	 * @see #getExpresion()
	 * @generated
	 */
	EReference getExpresion_Referencia();

	/**
	 * Returns the meta object for class '{@link angularjs2angular5.angular.Filtro <em>Filtro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filtro</em>'.
	 * @see angularjs2angular5.angular.Filtro
	 * @generated
	 */
	EClass getFiltro();

	/**
	 * Returns the meta object for the attribute '{@link angularjs2angular5.angular.Filtro#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs2angular5.angular.Filtro#getName()
	 * @see #getFiltro()
	 * @generated
	 */
	EAttribute getFiltro_Name();

	/**
	 * Returns the meta object for the attribute '{@link angularjs2angular5.angular.Filtro#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parametros</em>'.
	 * @see angularjs2angular5.angular.Filtro#getParametros()
	 * @see #getFiltro()
	 * @generated
	 */
	EAttribute getFiltro_Parametros();

	/**
	 * Returns the meta object for class '{@link angularjs2angular5.angular.Directiva <em>Directiva</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directiva</em>'.
	 * @see angularjs2angular5.angular.Directiva
	 * @generated
	 */
	EClass getDirectiva();

	/**
	 * Returns the meta object for the attribute '{@link angularjs2angular5.angular.Directiva#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see angularjs2angular5.angular.Directiva#getName()
	 * @see #getDirectiva()
	 * @generated
	 */
	EAttribute getDirectiva_Name();

	/**
	 * Returns the meta object for the reference '{@link angularjs2angular5.angular.Directiva#getCurlybraces <em>Curlybraces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Curlybraces</em>'.
	 * @see angularjs2angular5.angular.Directiva#getCurlybraces()
	 * @see #getDirectiva()
	 * @generated
	 */
	EReference getDirectiva_Curlybraces();

	/**
	 * Returns the meta object for the reference '{@link angularjs2angular5.angular.Directiva#getReferencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referencia</em>'.
	 * @see angularjs2angular5.angular.Directiva#getReferencia()
	 * @see #getDirectiva()
	 * @generated
	 */
	EReference getDirectiva_Referencia();

	/**
	 * Returns the meta object for class '{@link angularjs2angular5.angular.CurlyBraces <em>Curly Braces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curly Braces</em>'.
	 * @see angularjs2angular5.angular.CurlyBraces
	 * @generated
	 */
	EClass getCurlyBraces();

	/**
	 * Returns the meta object for the containment reference '{@link angularjs2angular5.angular.CurlyBraces#getExpresion <em>Expresion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expresion</em>'.
	 * @see angularjs2angular5.angular.CurlyBraces#getExpresion()
	 * @see #getCurlyBraces()
	 * @generated
	 */
	EReference getCurlyBraces_Expresion();

	/**
	 * Returns the meta object for the containment reference '{@link angularjs2angular5.angular.CurlyBraces#getFiltro <em>Filtro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filtro</em>'.
	 * @see angularjs2angular5.angular.CurlyBraces#getFiltro()
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
	AngularFactory getAngularFactory();

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
		 * The meta object literal for the '{@link angularjs2angular5.angular.impl.AppAngularImpl <em>App Angular</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs2angular5.angular.impl.AppAngularImpl
		 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getAppAngular()
		 * @generated
		 */
		EClass APP_ANGULAR = eINSTANCE.getAppAngular();

		/**
		 * The meta object literal for the '<em><b>Modulos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_ANGULAR__MODULOS = eINSTANCE.getAppAngular_Modulos();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_ANGULAR__TEMPLATES = eINSTANCE.getAppAngular_Templates();

		/**
		 * The meta object literal for the '<em><b>Modelos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_ANGULAR__MODELOS = eINSTANCE.getAppAngular_Modelos();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_ANGULAR__NAME = eINSTANCE.getAppAngular_Name();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_ANGULAR__SERVICES = eINSTANCE.getAppAngular_Services();

		/**
		 * The meta object literal for the '<em><b>Componentes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_ANGULAR__COMPONENTES = eINSTANCE.getAppAngular_Componentes();

		/**
		 * The meta object literal for the '{@link angularjs2angular5.angular.impl.ModuloImpl <em>Modulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs2angular5.angular.impl.ModuloImpl
		 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getModulo()
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
		 * The meta object literal for the '{@link angularjs2angular5.angular.impl.AnotacionImpl <em>Anotacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs2angular5.angular.impl.AnotacionImpl
		 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getAnotacion()
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
		 * The meta object literal for the '<em><b>Primitivo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANOTACION__PRIMITIVO = eINSTANCE.getAnotacion_Primitivo();

		/**
		 * The meta object literal for the '{@link angularjs2angular5.angular.impl.FuncionImpl <em>Funcion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs2angular5.angular.impl.FuncionImpl
		 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getFuncion()
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
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCION__BODY = eINSTANCE.getFuncion_Body();

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
		 * The meta object literal for the '{@link angularjs2angular5.angular.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs2angular5.angular.impl.VariableImpl
		 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getVariable()
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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TIPO = eINSTANCE.getVariable_Tipo();

		/**
		 * The meta object literal for the '{@link angularjs2angular5.angular.impl.ComponenteImpl <em>Componente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs2angular5.angular.impl.ComponenteImpl
		 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getComponente()
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
		 * The meta object literal for the '{@link angularjs2angular5.angular.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs2angular5.angular.impl.ServiceImpl
		 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getService()
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
		 * The meta object literal for the '<em><b>Modulo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__MODULO = eINSTANCE.getService_Modulo();

		/**
		 * The meta object literal for the '{@link angularjs2angular5.angular.impl.ObjetoAngularImpl <em>Objeto Angular</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs2angular5.angular.impl.ObjetoAngularImpl
		 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getObjetoAngular()
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
		 * The meta object literal for the '{@link angularjs2angular5.angular.impl.ModeloImpl <em>Modelo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs2angular5.angular.impl.ModeloImpl
		 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getModelo()
		 * @generated
		 */
		EClass MODELO = eINSTANCE.getModelo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELO__NAME = eINSTANCE.getModelo_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELO__VALUE = eINSTANCE.getModelo_Value();

		/**
		 * The meta object literal for the '{@link angularjs2angular5.angular.impl.TemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs2angular5.angular.impl.TemplateImpl
		 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getTemplate()
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
		 * The meta object literal for the '{@link angularjs2angular5.angular.impl.SentenciaHTMLImpl <em>Sentencia HTML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs2angular5.angular.impl.SentenciaHTMLImpl
		 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getSentenciaHTML()
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
		 * The meta object literal for the '<em><b>Curlybraces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTENCIA_HTML__CURLYBRACES = eINSTANCE.getSentenciaHTML_Curlybraces();

		/**
		 * The meta object literal for the '<em><b>Directivas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTENCIA_HTML__DIRECTIVAS = eINSTANCE.getSentenciaHTML_Directivas();

		/**
		 * The meta object literal for the '{@link angularjs2angular5.angular.impl.PropiedadImpl <em>Propiedad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs2angular5.angular.impl.PropiedadImpl
		 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getPropiedad()
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
		 * The meta object literal for the '{@link angularjs2angular5.angular.impl.ExpresionImpl <em>Expresion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs2angular5.angular.impl.ExpresionImpl
		 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getExpresion()
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
		 * The meta object literal for the '{@link angularjs2angular5.angular.impl.FiltroImpl <em>Filtro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs2angular5.angular.impl.FiltroImpl
		 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getFiltro()
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
		 * The meta object literal for the '{@link angularjs2angular5.angular.impl.DirectivaImpl <em>Directiva</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs2angular5.angular.impl.DirectivaImpl
		 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getDirectiva()
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
		 * The meta object literal for the '{@link angularjs2angular5.angular.impl.CurlyBracesImpl <em>Curly Braces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see angularjs2angular5.angular.impl.CurlyBracesImpl
		 * @see angularjs2angular5.angular.impl.AngularPackageImpl#getCurlyBraces()
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

} //AngularPackage
