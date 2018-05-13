/**
 */
package angularjs.impl;

import angularjs.*;

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
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AngularjsPackage.APP_ANGULAR_JS: return createAppAngularJS();
			case AngularjsPackage.MODULO: return createModulo();
			case AngularjsPackage.ANOTACION: return createAnotacion();
			case AngularjsPackage.FUNCION: return createFuncion();
			case AngularjsPackage.VARIABLE: return createVariable();
			case AngularjsPackage.COMPONENTE: return createComponente();
			case AngularjsPackage.SERVICE: return createService();
			case AngularjsPackage.MODELO: return createModelo();
			case AngularjsPackage.TEMPLATE: return createTemplate();
			case AngularjsPackage.SENTENCIA_HTML: return createSentenciaHTML();
			case AngularjsPackage.PROPIEDAD: return createPropiedad();
			case AngularjsPackage.EXPRESION: return createExpresion();
			case AngularjsPackage.FILTRO: return createFiltro();
			case AngularjsPackage.DIRECTIVA: return createDirectiva();
			case AngularjsPackage.CURLY_BRACES: return createCurlyBraces();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppAngularJS createAppAngularJS() {
		AppAngularJSImpl appAngularJS = new AppAngularJSImpl();
		return appAngularJS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modulo createModulo() {
		ModuloImpl modulo = new ModuloImpl();
		return modulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anotacion createAnotacion() {
		AnotacionImpl anotacion = new AnotacionImpl();
		return anotacion;
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
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Componente createComponente() {
		ComponenteImpl componente = new ComponenteImpl();
		return componente;
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
	public Modelo createModelo() {
		ModeloImpl modelo = new ModeloImpl();
		return modelo;
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
	public SentenciaHTML createSentenciaHTML() {
		SentenciaHTMLImpl sentenciaHTML = new SentenciaHTMLImpl();
		return sentenciaHTML;
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
	public AngularjsPackage getAngularjsPackage() {
		return (AngularjsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AngularjsPackage getPackage() {
		return AngularjsPackage.eINSTANCE;
	}

} //AngularjsFactoryImpl
