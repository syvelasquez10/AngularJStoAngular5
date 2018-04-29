/**
 */
package Angularjs.impl;

import Angularjs.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AngularjsFactoryImpl extends EFactoryImpl implements AngularjsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AngularjsFactory init() {
		try {
			AngularjsFactory theAngularjsFactory = (AngularjsFactory)EPackage.Registry.INSTANCE.getEFactory(AngularjsPackage.eNS_URI);
			if (theAngularjsFactory != null) {
				return theAngularjsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AngularjsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngularjsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AngularjsPackage.ANGULAR_JS_APP: return createAngularJSApp();
			case AngularjsPackage.TEMPLATE: return createTemplate();
			case AngularjsPackage.SETENCIA_HTML: return createSetenciaHTML();
			case AngularjsPackage.DIRECTIVA: return createDirectiva();
			case AngularjsPackage.CURLY_BRACES: return createCurlyBraces();
			case AngularjsPackage.EXPRESION: return createExpresion();
			case AngularjsPackage.FILTRO: return createFiltro();
			case AngularjsPackage.REFERENCIA: return createReferencia();
			case AngularjsPackage.CONTROLLER: return createController();
			case AngularjsPackage.PROPIEDAD: return createPropiedad();
			case AngularjsPackage.MODULE: return createModule();
			case AngularjsPackage.SERVICE: return createService();
			case AngularjsPackage.FUNCION: return createFuncion();
			case AngularjsPackage.PARAMETRO: return createParametro();
			case AngularjsPackage.VARIABLE: return createVariable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngularJSApp createAngularJSApp() {
		AngularJSAppImpl angularJSApp = new AngularJSAppImpl();
		return angularJSApp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template createTemplate() {
		TemplateImpl template = new TemplateImpl();
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetenciaHTML createSetenciaHTML() {
		SetenciaHTMLImpl setenciaHTML = new SetenciaHTMLImpl();
		return setenciaHTML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Directiva createDirectiva() {
		DirectivaImpl directiva = new DirectivaImpl();
		return directiva;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurlyBraces createCurlyBraces() {
		CurlyBracesImpl curlyBraces = new CurlyBracesImpl();
		return curlyBraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expresion createExpresion() {
		ExpresionImpl expresion = new ExpresionImpl();
		return expresion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filtro createFiltro() {
		FiltroImpl filtro = new FiltroImpl();
		return filtro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Referencia createReferencia() {
		ReferenciaImpl referencia = new ReferenciaImpl();
		return referencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller createController() {
		ControllerImpl controller = new ControllerImpl();
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Propiedad createPropiedad() {
		PropiedadImpl propiedad = new PropiedadImpl();
		return propiedad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Funcion createFuncion() {
		FuncionImpl funcion = new FuncionImpl();
		return funcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parametro createParametro() {
		ParametroImpl parametro = new ParametroImpl();
		return parametro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngularjsPackage getAngularjsPackage() {
		return (AngularjsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static AngularjsPackage getPackage() {
		return AngularjsPackage.eINSTANCE;
	}

} //AngularjsFactoryImpl
