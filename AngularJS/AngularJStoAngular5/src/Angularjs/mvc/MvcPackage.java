/**
 */
package Angularjs.mvc;

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
 * @see Angularjs.mvc.MvcFactory
 * @model kind="package"
 * @generated
 */
public interface MvcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mvc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://uniandes.edu.co/angular/mvc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mvc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MvcPackage eINSTANCE = Angularjs.mvc.impl.MvcPackageImpl.init();

	/**
	 * The meta object id for the '{@link Angularjs.mvc.impl.ObjetoJavaScriptImpl <em>Objeto Java Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.mvc.impl.ObjetoJavaScriptImpl
	 * @see Angularjs.mvc.impl.MvcPackageImpl#getObjetoJavaScript()
	 * @generated
	 */
	int OBJETO_JAVA_SCRIPT = 0;

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
	 * The meta object id for the '{@link Angularjs.mvc.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.mvc.impl.ControllerImpl
	 * @see Angularjs.mvc.impl.MvcPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 1;

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
	 * The meta object id for the '{@link Angularjs.mvc.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.mvc.impl.ServiceImpl
	 * @see Angularjs.mvc.impl.MvcPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 2;

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
	 * The meta object id for the '{@link Angularjs.mvc.impl.ParametroImpl <em>Parametro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.mvc.impl.ParametroImpl
	 * @see Angularjs.mvc.impl.MvcPackageImpl#getParametro()
	 * @generated
	 */
	int PARAMETRO = 3;

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
	 * The meta object id for the '{@link Angularjs.mvc.impl.FuncionImpl <em>Funcion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.mvc.impl.FuncionImpl
	 * @see Angularjs.mvc.impl.MvcPackageImpl#getFuncion()
	 * @generated
	 */
	int FUNCION = 4;

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
	 * The meta object id for the '{@link Angularjs.mvc.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.mvc.impl.VariableImpl
	 * @see Angularjs.mvc.impl.MvcPackageImpl#getVariable()
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
	 * The meta object id for the '{@link Angularjs.mvc.impl.AnotacionImpl <em>Anotacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.mvc.impl.AnotacionImpl
	 * @see Angularjs.mvc.impl.MvcPackageImpl#getAnotacion()
	 * @generated
	 */
	int ANOTACION = 6;

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
	 * The meta object id for the '{@link Angularjs.mvc.impl.ModuloImpl <em>Modulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.mvc.impl.ModuloImpl
	 * @see Angularjs.mvc.impl.MvcPackageImpl#getModulo()
	 * @generated
	 */
	int MODULO = 7;

	/**
	 * The feature id for the '<em><b>Parametros</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__PARAMETROS = 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__SERVICES = 1;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__CONTROLLER = 2;

	/**
	 * The feature id for the '<em><b>Modulos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__MODULOS = 3;

	/**
	 * The number of structural features of the '<em>Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Angularjs.mvc.impl.ModeloImpl <em>Modelo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.mvc.impl.ModeloImpl
	 * @see Angularjs.mvc.impl.MvcPackageImpl#getModelo()
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
	 * Returns the meta object for class '{@link Angularjs.mvc.ObjetoJavaScript <em>Objeto Java Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objeto Java Script</em>'.
	 * @see Angularjs.mvc.ObjetoJavaScript
	 * @generated
	 */
	EClass getObjetoJavaScript();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.mvc.ObjetoJavaScript#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Angularjs.mvc.ObjetoJavaScript#getName()
	 * @see #getObjetoJavaScript()
	 * @generated
	 */
	EAttribute getObjetoJavaScript_Name();

	/**
	 * Returns the meta object for class '{@link Angularjs.mvc.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see Angularjs.mvc.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the reference list '{@link Angularjs.mvc.Controller#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see Angularjs.mvc.Controller#getServices()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.mvc.Controller#getFuncion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Funcion</em>'.
	 * @see Angularjs.mvc.Controller#getFuncion()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Funcion();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.mvc.Controller#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see Angularjs.mvc.Controller#getVariable()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.mvc.Controller#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametros</em>'.
	 * @see Angularjs.mvc.Controller#getParametros()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Parametros();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.mvc.Controller#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see Angularjs.mvc.Controller#getBody()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Body();

	/**
	 * Returns the meta object for the reference '{@link Angularjs.mvc.Controller#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see Angularjs.mvc.Controller#getTemplate()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Template();

	/**
	 * Returns the meta object for the reference list '{@link Angularjs.mvc.Controller#getModelo <em>Modelo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modelo</em>'.
	 * @see Angularjs.mvc.Controller#getModelo()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Modelo();

	/**
	 * Returns the meta object for class '{@link Angularjs.mvc.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see Angularjs.mvc.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.mvc.Service#getFuncion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Funcion</em>'.
	 * @see Angularjs.mvc.Service#getFuncion()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Funcion();

	/**
	 * Returns the meta object for the reference '{@link Angularjs.mvc.Service#getParametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parametro</em>'.
	 * @see Angularjs.mvc.Service#getParametro()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Parametro();

	/**
	 * Returns the meta object for class '{@link Angularjs.mvc.Parametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametro</em>'.
	 * @see Angularjs.mvc.Parametro
	 * @generated
	 */
	EClass getParametro();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.mvc.Parametro#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Angularjs.mvc.Parametro#getName()
	 * @see #getParametro()
	 * @generated
	 */
	EAttribute getParametro_Name();

	/**
	 * Returns the meta object for the reference '{@link Angularjs.mvc.Parametro#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Services</em>'.
	 * @see Angularjs.mvc.Parametro#getServices()
	 * @see #getParametro()
	 * @generated
	 */
	EReference getParametro_Services();

	/**
	 * Returns the meta object for class '{@link Angularjs.mvc.Funcion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Funcion</em>'.
	 * @see Angularjs.mvc.Funcion
	 * @generated
	 */
	EClass getFuncion();

	/**
	 * Returns the meta object for the reference list '{@link Angularjs.mvc.Funcion#getFuncion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Funcion</em>'.
	 * @see Angularjs.mvc.Funcion#getFuncion()
	 * @see #getFuncion()
	 * @generated
	 */
	EReference getFuncion_Funcion();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.mvc.Funcion#isTieneRetorno <em>Tiene Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tiene Retorno</em>'.
	 * @see Angularjs.mvc.Funcion#isTieneRetorno()
	 * @see #getFuncion()
	 * @generated
	 */
	EAttribute getFuncion_TieneRetorno();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.mvc.Funcion#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametros</em>'.
	 * @see Angularjs.mvc.Funcion#getParametros()
	 * @see #getFuncion()
	 * @generated
	 */
	EReference getFuncion_Parametros();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.mvc.Funcion#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see Angularjs.mvc.Funcion#getBody()
	 * @see #getFuncion()
	 * @generated
	 */
	EAttribute getFuncion_Body();

	/**
	 * Returns the meta object for class '{@link Angularjs.mvc.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see Angularjs.mvc.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.mvc.Variable#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see Angularjs.mvc.Variable#getValor()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Valor();

	/**
	 * Returns the meta object for the containment reference '{@link Angularjs.mvc.Variable#getAnotacion <em>Anotacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anotacion</em>'.
	 * @see Angularjs.mvc.Variable#getAnotacion()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Anotacion();

	/**
	 * Returns the meta object for class '{@link Angularjs.mvc.Anotacion <em>Anotacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anotacion</em>'.
	 * @see Angularjs.mvc.Anotacion
	 * @generated
	 */
	EClass getAnotacion();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.mvc.Anotacion#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Angularjs.mvc.Anotacion#getValue()
	 * @see #getAnotacion()
	 * @generated
	 */
	EAttribute getAnotacion_Value();

	/**
	 * Returns the meta object for class '{@link Angularjs.mvc.Modulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modulo</em>'.
	 * @see Angularjs.mvc.Modulo
	 * @generated
	 */
	EClass getModulo();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.mvc.Modulo#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametros</em>'.
	 * @see Angularjs.mvc.Modulo#getParametros()
	 * @see #getModulo()
	 * @generated
	 */
	EReference getModulo_Parametros();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.mvc.Modulo#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see Angularjs.mvc.Modulo#getServices()
	 * @see #getModulo()
	 * @generated
	 */
	EReference getModulo_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.mvc.Modulo#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controller</em>'.
	 * @see Angularjs.mvc.Modulo#getController()
	 * @see #getModulo()
	 * @generated
	 */
	EReference getModulo_Controller();

	/**
	 * Returns the meta object for the reference list '{@link Angularjs.mvc.Modulo#getModulos <em>Modulos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modulos</em>'.
	 * @see Angularjs.mvc.Modulo#getModulos()
	 * @see #getModulo()
	 * @generated
	 */
	EReference getModulo_Modulos();

	/**
	 * Returns the meta object for class '{@link Angularjs.mvc.Modelo <em>Modelo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelo</em>'.
	 * @see Angularjs.mvc.Modelo
	 * @generated
	 */
	EClass getModelo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MvcFactory getMvcFactory();

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
		 * The meta object literal for the '{@link Angularjs.mvc.impl.ObjetoJavaScriptImpl <em>Objeto Java Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.mvc.impl.ObjetoJavaScriptImpl
		 * @see Angularjs.mvc.impl.MvcPackageImpl#getObjetoJavaScript()
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
		 * The meta object literal for the '{@link Angularjs.mvc.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.mvc.impl.ControllerImpl
		 * @see Angularjs.mvc.impl.MvcPackageImpl#getController()
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
		 * The meta object literal for the '{@link Angularjs.mvc.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.mvc.impl.ServiceImpl
		 * @see Angularjs.mvc.impl.MvcPackageImpl#getService()
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
		 * The meta object literal for the '{@link Angularjs.mvc.impl.ParametroImpl <em>Parametro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.mvc.impl.ParametroImpl
		 * @see Angularjs.mvc.impl.MvcPackageImpl#getParametro()
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
		 * The meta object literal for the '{@link Angularjs.mvc.impl.FuncionImpl <em>Funcion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.mvc.impl.FuncionImpl
		 * @see Angularjs.mvc.impl.MvcPackageImpl#getFuncion()
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
		 * The meta object literal for the '{@link Angularjs.mvc.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.mvc.impl.VariableImpl
		 * @see Angularjs.mvc.impl.MvcPackageImpl#getVariable()
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
		 * The meta object literal for the '{@link Angularjs.mvc.impl.AnotacionImpl <em>Anotacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.mvc.impl.AnotacionImpl
		 * @see Angularjs.mvc.impl.MvcPackageImpl#getAnotacion()
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
		 * The meta object literal for the '{@link Angularjs.mvc.impl.ModuloImpl <em>Modulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.mvc.impl.ModuloImpl
		 * @see Angularjs.mvc.impl.MvcPackageImpl#getModulo()
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
		 * The meta object literal for the '{@link Angularjs.mvc.impl.ModeloImpl <em>Modelo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.mvc.impl.ModeloImpl
		 * @see Angularjs.mvc.impl.MvcPackageImpl#getModelo()
		 * @generated
		 */
		EClass MODELO = eINSTANCE.getModelo();

	}

} //MvcPackage
