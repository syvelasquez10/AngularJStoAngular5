/**
 */
package Angularjs.util;

import Angularjs.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Angularjs.AngularjsPackage
 * @generated
 */
public class AngularjsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AngularjsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngularjsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AngularjsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngularjsSwitch modelSwitch =
		new AngularjsSwitch() {
			public Object caseAngularJSApp(AngularJSApp object) {
				return createAngularJSAppAdapter();
			}
			public Object caseTemplate(Template object) {
				return createTemplateAdapter();
			}
			public Object caseSetenciaHTML(SetenciaHTML object) {
				return createSetenciaHTMLAdapter();
			}
			public Object caseMarkUp(MarkUp object) {
				return createMarkUpAdapter();
			}
			public Object caseDirectiva(Directiva object) {
				return createDirectivaAdapter();
			}
			public Object caseCurlyBraces(CurlyBraces object) {
				return createCurlyBracesAdapter();
			}
			public Object caseExpresion(Expresion object) {
				return createExpresionAdapter();
			}
			public Object caseFiltro(Filtro object) {
				return createFiltroAdapter();
			}
			public Object caseReferencia(Referencia object) {
				return createReferenciaAdapter();
			}
			public Object caseController(Controller object) {
				return createControllerAdapter();
			}
			public Object casePropiedad(Propiedad object) {
				return createPropiedadAdapter();
			}
			public Object caseModule(Module object) {
				return createModuleAdapter();
			}
			public Object caseService(Service object) {
				return createServiceAdapter();
			}
			public Object caseFuncion(Funcion object) {
				return createFuncionAdapter();
			}
			public Object caseParametro(Parametro object) {
				return createParametroAdapter();
			}
			public Object caseObjetoJavaScript(ObjetoJavaScript object) {
				return createObjetoJavaScriptAdapter();
			}
			public Object caseVariable(Variable object) {
				return createVariableAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.AngularJSApp <em>Angular JS App</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.AngularJSApp
	 * @generated
	 */
	public Adapter createAngularJSAppAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.Template
	 * @generated
	 */
	public Adapter createTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.SetenciaHTML <em>Setencia HTML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.SetenciaHTML
	 * @generated
	 */
	public Adapter createSetenciaHTMLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.MarkUp <em>Mark Up</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.MarkUp
	 * @generated
	 */
	public Adapter createMarkUpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.Directiva <em>Directiva</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.Directiva
	 * @generated
	 */
	public Adapter createDirectivaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.CurlyBraces <em>Curly Braces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.CurlyBraces
	 * @generated
	 */
	public Adapter createCurlyBracesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.Expresion <em>Expresion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.Expresion
	 * @generated
	 */
	public Adapter createExpresionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.Filtro <em>Filtro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.Filtro
	 * @generated
	 */
	public Adapter createFiltroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.Referencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.Referencia
	 * @generated
	 */
	public Adapter createReferenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.Controller
	 * @generated
	 */
	public Adapter createControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.Propiedad <em>Propiedad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.Propiedad
	 * @generated
	 */
	public Adapter createPropiedadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.Funcion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.Funcion
	 * @generated
	 */
	public Adapter createFuncionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.Parametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.Parametro
	 * @generated
	 */
	public Adapter createParametroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.ObjetoJavaScript <em>Objeto Java Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.ObjetoJavaScript
	 * @generated
	 */
	public Adapter createObjetoJavaScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AngularjsAdapterFactory
