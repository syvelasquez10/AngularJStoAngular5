/**
 */
package angularjs;

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
 *   <li>{@link angularjs.Componente#getFuncion <em>Funcion</em>}</li>
 *   <li>{@link angularjs.Componente#getTemplate <em>Template</em>}</li>
 *   <li>{@link angularjs.Componente#getModelo <em>Modelo</em>}</li>
 *   <li>{@link angularjs.Componente#getParametros <em>Parametros</em>}</li>
 *   <li>{@link angularjs.Componente#getModulo <em>Modulo</em>}</li>
 * </ul>
 *
 * @see angularjs.AngularjsPackage#getComponente()
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
	 * @see angularjs.AngularjsPackage#getComponente_Funcion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Funcion getFuncion();

	/**
	 * Sets the value of the '{@link angularjs.Componente#getFuncion <em>Funcion</em>}' containment reference.
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
	 * @see angularjs.AngularjsPackage#getComponente_Template()
	 * @model required="true"
	 * @generated
	 */
	Template getTemplate();

	/**
	 * Sets the value of the '{@link angularjs.Componente#getTemplate <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(Template value);

	/**
	 * Returns the value of the '<em><b>Modelo</b></em>' reference list.
	 * The list contents are of type {@link angularjs.Modelo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelo</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelo</em>' reference list.
	 * @see angularjs.AngularjsPackage#getComponente_Modelo()
	 * @model
	 * @generated
	 */
	EList<Modelo> getModelo();

	/**
	 * Returns the value of the '<em><b>Parametros</b></em>' reference list.
	 * The list contents are of type {@link angularjs.ObjetoAngular}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametros</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametros</em>' reference list.
	 * @see angularjs.AngularjsPackage#getComponente_Parametros()
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
	 * @see angularjs.AngularjsPackage#getComponente_Modulo()
	 * @model required="true"
	 * @generated
	 */
	Modulo getModulo();

	/**
	 * Sets the value of the '{@link angularjs.Componente#getModulo <em>Modulo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modulo</em>' reference.
	 * @see #getModulo()
	 * @generated
	 */
	void setModulo(Modulo value);

} // Componente
