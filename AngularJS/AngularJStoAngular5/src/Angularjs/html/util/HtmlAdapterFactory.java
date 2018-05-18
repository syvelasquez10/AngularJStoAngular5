/**
 */
package Angularjs.html.util;

import Angularjs.html.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Angularjs.html.HtmlPackage
 * @generated
 */
public class HtmlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HtmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HtmlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HtmlPackage.eINSTANCE;
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
	@Override
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
	protected HtmlSwitch<Adapter> modelSwitch =
		new HtmlSwitch<Adapter>() {
			@Override
			public Adapter caseTemplate(Template object) {
				return createTemplateAdapter();
			}
			@Override
			public Adapter caseDirectiva(Directiva object) {
				return createDirectivaAdapter();
			}
			@Override
			public Adapter caseSetenciaHTML(SetenciaHTML object) {
				return createSetenciaHTMLAdapter();
			}
			@Override
			public Adapter casePropiedad(Propiedad object) {
				return createPropiedadAdapter();
			}
			@Override
			public Adapter caseCurlyBraces(CurlyBraces object) {
				return createCurlyBracesAdapter();
			}
			@Override
			public Adapter caseReferencia(Referencia object) {
				return createReferenciaAdapter();
			}
			@Override
			public Adapter caseExpresion(Expresion object) {
				return createExpresionAdapter();
			}
			@Override
			public Adapter caseFiltro(Filtro object) {
				return createFiltroAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.html.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.html.Template
	 * @generated
	 */
	public Adapter createTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.html.Directiva <em>Directiva</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.html.Directiva
	 * @generated
	 */
	public Adapter createDirectivaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.html.SetenciaHTML <em>Setencia HTML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.html.SetenciaHTML
	 * @generated
	 */
	public Adapter createSetenciaHTMLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.html.Propiedad <em>Propiedad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.html.Propiedad
	 * @generated
	 */
	public Adapter createPropiedadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.html.CurlyBraces <em>Curly Braces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.html.CurlyBraces
	 * @generated
	 */
	public Adapter createCurlyBracesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.html.Referencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.html.Referencia
	 * @generated
	 */
	public Adapter createReferenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.html.Expresion <em>Expresion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.html.Expresion
	 * @generated
	 */
	public Adapter createExpresionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Angularjs.html.Filtro <em>Filtro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Angularjs.html.Filtro
	 * @generated
	 */
	public Adapter createFiltroAdapter() {
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

} //HtmlAdapterFactory
