/**
 */
package Angularjs;

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
	 * The meta object id for the '{@link Angularjs.impl.AppAngularJSImpl <em>App Angular JS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.impl.AppAngularJSImpl
	 * @see Angularjs.impl.AngularjsPackageImpl#getAppAngularJS()
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
	 * The number of structural features of the '<em>App Angular JS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ANGULAR_JS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>App Angular JS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_ANGULAR_JS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Angularjs.AppAngularJS <em>App Angular JS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Angular JS</em>'.
	 * @see Angularjs.AppAngularJS
	 * @generated
	 */
	EClass getAppAngularJS();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.AppAngularJS#getModulos <em>Modulos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modulos</em>'.
	 * @see Angularjs.AppAngularJS#getModulos()
	 * @see #getAppAngularJS()
	 * @generated
	 */
	EReference getAppAngularJS_Modulos();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.AppAngularJS#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template</em>'.
	 * @see Angularjs.AppAngularJS#getTemplate()
	 * @see #getAppAngularJS()
	 * @generated
	 */
	EReference getAppAngularJS_Template();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.AppAngularJS#getModelos <em>Modelos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modelos</em>'.
	 * @see Angularjs.AppAngularJS#getModelos()
	 * @see #getAppAngularJS()
	 * @generated
	 */
	EReference getAppAngularJS_Modelos();

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
		 * The meta object literal for the '{@link Angularjs.impl.AppAngularJSImpl <em>App Angular JS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.impl.AppAngularJSImpl
		 * @see Angularjs.impl.AngularjsPackageImpl#getAppAngularJS()
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

	}

} //AngularjsPackage
