/**
 */
package Angularjs.impl;

import Angularjs.AngularjsFactory;
import Angularjs.AngularjsPackage;
import Angularjs.AppAngularJS;

import Angularjs.html.HtmlPackage;

import Angularjs.html.impl.HtmlPackageImpl;

import Angularjs.mvc.MvcPackage;

import Angularjs.mvc.impl.MvcPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AngularjsPackageImpl extends EPackageImpl implements AngularjsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appAngularJSEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Angularjs.AngularjsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AngularjsPackageImpl() {
		super(eNS_URI, AngularjsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AngularjsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AngularjsPackage init() {
		if (isInited) return (AngularjsPackage)EPackage.Registry.INSTANCE.getEPackage(AngularjsPackage.eNS_URI);

		// Obtain or create and register package
		AngularjsPackageImpl theAngularjsPackage = (AngularjsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AngularjsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AngularjsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MvcPackageImpl theMvcPackage = (MvcPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MvcPackage.eNS_URI) instanceof MvcPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MvcPackage.eNS_URI) : MvcPackage.eINSTANCE);
		HtmlPackageImpl theHtmlPackage = (HtmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HtmlPackage.eNS_URI) instanceof HtmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HtmlPackage.eNS_URI) : HtmlPackage.eINSTANCE);

		// Create package meta-data objects
		theAngularjsPackage.createPackageContents();
		theMvcPackage.createPackageContents();
		theHtmlPackage.createPackageContents();

		// Initialize created meta-data
		theAngularjsPackage.initializePackageContents();
		theMvcPackage.initializePackageContents();
		theHtmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAngularjsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AngularjsPackage.eNS_URI, theAngularjsPackage);
		return theAngularjsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppAngularJS() {
		return appAngularJSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppAngularJS_Modulos() {
		return (EReference)appAngularJSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppAngularJS_Template() {
		return (EReference)appAngularJSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppAngularJS_Modelos() {
		return (EReference)appAngularJSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngularjsFactory getAngularjsFactory() {
		return (AngularjsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		appAngularJSEClass = createEClass(APP_ANGULAR_JS);
		createEReference(appAngularJSEClass, APP_ANGULAR_JS__MODULOS);
		createEReference(appAngularJSEClass, APP_ANGULAR_JS__TEMPLATE);
		createEReference(appAngularJSEClass, APP_ANGULAR_JS__MODELOS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MvcPackage theMvcPackage = (MvcPackage)EPackage.Registry.INSTANCE.getEPackage(MvcPackage.eNS_URI);
		HtmlPackage theHtmlPackage = (HtmlPackage)EPackage.Registry.INSTANCE.getEPackage(HtmlPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theMvcPackage);
		getESubpackages().add(theHtmlPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(appAngularJSEClass, AppAngularJS.class, "AppAngularJS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAppAngularJS_Modulos(), theMvcPackage.getModulo(), null, "modulos", null, 1, -1, AppAngularJS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppAngularJS_Template(), theHtmlPackage.getTemplate(), null, "template", null, 0, -1, AppAngularJS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppAngularJS_Modelos(), theMvcPackage.getModelo(), null, "modelos", null, 0, -1, AppAngularJS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AngularjsPackageImpl
