/**
 */
package angularjs2angular5.angular.util;

import angularjs2angular5.angular.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see angularjs2angular5.angular.AngularPackage
 * @generated
 */
public class AngularAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AngularPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngularAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AngularPackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngularSwitch<Adapter> modelSwitch = new AngularSwitch<Adapter>() {
		@Override
		public Adapter caseAppAngular(AppAngular object) {
			return createAppAngularAdapter();
		}

		@Override
		public Adapter caseModulo(Modulo object) {
			return createModuloAdapter();
		}

		@Override
		public Adapter caseAnotacion(Anotacion object) {
			return createAnotacionAdapter();
		}

		@Override
		public Adapter caseFuncion(Funcion object) {
			return createFuncionAdapter();
		}

		@Override
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseComponente(Componente object) {
			return createComponenteAdapter();
		}

		@Override
		public Adapter caseService(Service object) {
			return createServiceAdapter();
		}

		@Override
		public Adapter caseObjetoAngular(ObjetoAngular object) {
			return createObjetoAngularAdapter();
		}

		@Override
		public Adapter caseModelo(Modelo object) {
			return createModeloAdapter();
		}

		@Override
		public Adapter caseTemplate(Template object) {
			return createTemplateAdapter();
		}

		@Override
		public Adapter caseSentenciaHTML(SentenciaHTML object) {
			return createSentenciaHTMLAdapter();
		}

		@Override
		public Adapter casePropiedad(Propiedad object) {
			return createPropiedadAdapter();
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
		public Adapter caseDirectiva(Directiva object) {
			return createDirectivaAdapter();
		}

		@Override
		public Adapter caseCurlyBraces(CurlyBraces object) {
			return createCurlyBracesAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link angularjs2angular5.angular.AppAngular <em>App Angular</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see angularjs2angular5.angular.AppAngular
	 * @generated
	 */
	public Adapter createAppAngularAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link angularjs2angular5.angular.Modulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see angularjs2angular5.angular.Modulo
	 * @generated
	 */
	public Adapter createModuloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link angularjs2angular5.angular.Anotacion <em>Anotacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see angularjs2angular5.angular.Anotacion
	 * @generated
	 */
	public Adapter createAnotacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link angularjs2angular5.angular.Funcion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see angularjs2angular5.angular.Funcion
	 * @generated
	 */
	public Adapter createFuncionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link angularjs2angular5.angular.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see angularjs2angular5.angular.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link angularjs2angular5.angular.Componente <em>Componente</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see angularjs2angular5.angular.Componente
	 * @generated
	 */
	public Adapter createComponenteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link angularjs2angular5.angular.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see angularjs2angular5.angular.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link angularjs2angular5.angular.ObjetoAngular <em>Objeto Angular</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see angularjs2angular5.angular.ObjetoAngular
	 * @generated
	 */
	public Adapter createObjetoAngularAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link angularjs2angular5.angular.Modelo <em>Modelo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see angularjs2angular5.angular.Modelo
	 * @generated
	 */
	public Adapter createModeloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link angularjs2angular5.angular.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see angularjs2angular5.angular.Template
	 * @generated
	 */
	public Adapter createTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link angularjs2angular5.angular.SentenciaHTML <em>Sentencia HTML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see angularjs2angular5.angular.SentenciaHTML
	 * @generated
	 */
	public Adapter createSentenciaHTMLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link angularjs2angular5.angular.Propiedad <em>Propiedad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see angularjs2angular5.angular.Propiedad
	 * @generated
	 */
	public Adapter createPropiedadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link angularjs2angular5.angular.Expresion <em>Expresion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see angularjs2angular5.angular.Expresion
	 * @generated
	 */
	public Adapter createExpresionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link angularjs2angular5.angular.Filtro <em>Filtro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see angularjs2angular5.angular.Filtro
	 * @generated
	 */
	public Adapter createFiltroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link angularjs2angular5.angular.Directiva <em>Directiva</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see angularjs2angular5.angular.Directiva
	 * @generated
	 */
	public Adapter createDirectivaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link angularjs2angular5.angular.CurlyBraces <em>Curly Braces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see angularjs2angular5.angular.CurlyBraces
	 * @generated
	 */
	public Adapter createCurlyBracesAdapter() {
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

} //AngularAdapterFactory
