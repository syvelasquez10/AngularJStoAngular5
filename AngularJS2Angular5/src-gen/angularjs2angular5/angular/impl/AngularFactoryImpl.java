/**
 */
package angularjs2angular5.angular.impl;

import angularjs2angular5.angular.*;

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
public class AngularFactoryImpl extends EFactoryImpl implements AngularFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AngularFactory init() {
		try {
			AngularFactory theAngularFactory = (AngularFactory) EPackage.Registry.INSTANCE
					.getEFactory(AngularPackage.eNS_URI);
			if (theAngularFactory != null) {
				return theAngularFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AngularFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngularFactoryImpl() {
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
		case AngularPackage.APP_ANGULAR:
			return createAppAngular();
		case AngularPackage.MODULO:
			return createModulo();
		case AngularPackage.ANOTACION:
			return createAnotacion();
		case AngularPackage.FUNCION:
			return createFuncion();
		case AngularPackage.VARIABLE:
			return createVariable();
		case AngularPackage.COMPONENTE:
			return createComponente();
		case AngularPackage.SERVICE:
			return createService();
		case AngularPackage.MODELO:
			return createModelo();
		case AngularPackage.TEMPLATE:
			return createTemplate();
		case AngularPackage.SENTENCIA_HTML:
			return createSentenciaHTML();
		case AngularPackage.PROPIEDAD:
			return createPropiedad();
		case AngularPackage.EXPRESION:
			return createExpresion();
		case AngularPackage.FILTRO:
			return createFiltro();
		case AngularPackage.DIRECTIVA:
			return createDirectiva();
		case AngularPackage.CURLY_BRACES:
			return createCurlyBraces();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppAngular createAppAngular() {
		AppAngularImpl appAngular = new AppAngularImpl();
		return appAngular;
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
	public AngularPackage getAngularPackage() {
		return (AngularPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AngularPackage getPackage() {
		return AngularPackage.eINSTANCE;
	}

} //AngularFactoryImpl
