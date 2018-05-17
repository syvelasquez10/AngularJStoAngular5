/**
 */
package angularjs2angular5.angular;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link angularjs2angular5.angular.Service#getFuncion <em>Funcion</em>}</li>
 *   <li>{@link angularjs2angular5.angular.Service#getParametros <em>Parametros</em>}</li>
 *   <li>{@link angularjs2angular5.angular.Service#getModulo <em>Modulo</em>}</li>
 * </ul>
 *
 * @see angularjs2angular5.angular.AngularPackage#getService()
 * @model
 * @generated
 */
public interface Service extends ObjetoAngular {
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
	 * @see angularjs2angular5.angular.AngularPackage#getService_Funcion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Funcion getFuncion();

	/**
	 * Sets the value of the '{@link angularjs2angular5.angular.Service#getFuncion <em>Funcion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funcion</em>' containment reference.
	 * @see #getFuncion()
	 * @generated
	 */
	void setFuncion(Funcion value);

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
	 * @see angularjs2angular5.angular.AngularPackage#getService_Parametros()
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
	 * @see angularjs2angular5.angular.AngularPackage#getService_Modulo()
	 * @model required="true"
	 * @generated
	 */
	Modulo getModulo();

	/**
	 * Sets the value of the '{@link angularjs2angular5.angular.Service#getModulo <em>Modulo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modulo</em>' reference.
	 * @see #getModulo()
	 * @generated
	 */
	void setModulo(Modulo value);

} // Service
