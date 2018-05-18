/**
 */
package angularjs2angular5.angular;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Componente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link angularjs2angular5.angular.Componente#getFuncion <em>Funcion</em>}</li>
 *   <li>{@link angularjs2angular5.angular.Componente#getTemplate <em>Template</em>}</li>
 *   <li>{@link angularjs2angular5.angular.Componente#getModelo <em>Modelo</em>}</li>
 *   <li>{@link angularjs2angular5.angular.Componente#getParametros <em>Parametros</em>}</li>
 *   <li>{@link angularjs2angular5.angular.Componente#getModulo <em>Modulo</em>}</li>
 * </ul>
 *
 * @see angularjs2angular5.angular.AngularPackage#getComponente()
 * @model
 * @generated
 */
public interface Componente extends ObjetoAngular {
	/**
	 * Returns the value of the '<em><b>Funcion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funcion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcion</em>' containment reference.
	 * @see #setFuncion(Funcion)
	 * @see angularjs2angular5.angular.AngularPackage#getComponente_Funcion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Funcion getFuncion();

	/**
	 * Sets the value of the '{@link angularjs2angular5.angular.Componente#getFuncion <em>Funcion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funcion</em>' containment reference.
	 * @see #getFuncion()
	 * @generated
	 */
	void setFuncion(Funcion value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' reference.
	 * @see #setTemplate(Template)
	 * @see angularjs2angular5.angular.AngularPackage#getComponente_Template()
	 * @model required="true"
	 * @generated
	 */
	Template getTemplate();

	/**
	 * Sets the value of the '{@link angularjs2angular5.angular.Componente#getTemplate <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(Template value);

	/**
	 * Returns the value of the '<em><b>Modelo</b></em>' reference list.
	 * The list contents are of type {@link angularjs2angular5.angular.Modelo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelo</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelo</em>' reference list.
	 * @see angularjs2angular5.angular.AngularPackage#getComponente_Modelo()
	 * @model
	 * @generated
	 */
	EList<Modelo> getModelo();

	/**
	 * Returns the value of the '<em><b>Parametros</b></em>' reference list.
	 * The list contents are of type {@link angularjs2angular5.angular.ObjetoAngular}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametros</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametros</em>' reference list.
	 * @see angularjs2angular5.angular.AngularPackage#getComponente_Parametros()
	 * @model
	 * @generated
	 */
	EList<ObjetoAngular> getParametros();

	/**
	 * Returns the value of the '<em><b>Modulo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modulo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modulo</em>' reference.
	 * @see #setModulo(Modulo)
	 * @see angularjs2angular5.angular.AngularPackage#getComponente_Modulo()
	 * @model required="true"
	 * @generated
	 */
	Modulo getModulo();

	/**
	 * Sets the value of the '{@link angularjs2angular5.angular.Componente#getModulo <em>Modulo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modulo</em>' reference.
	 * @see #getModulo()
	 * @generated
	 */
	void setModulo(Modulo value);

} // Componente
