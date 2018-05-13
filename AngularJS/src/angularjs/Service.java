/**
 */
package angularjs;

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
 *   <li>{@link angularjs.Service#getFuncion <em>Funcion</em>}</li>
 *   <li>{@link angularjs.Service#getParametros <em>Parametros</em>}</li>
 * </ul>
 *
 * @see angularjs.AngularjsPackage#getService()
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
	 * @see angularjs.AngularjsPackage#getService_Funcion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Funcion getFuncion();

	/**
	 * Sets the value of the '{@link angularjs.Service#getFuncion <em>Funcion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funcion</em>' containment reference.
	 * @see #getFuncion()
	 * @generated
	 */
	void setFuncion(Funcion value);

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
	 * @see angularjs.AngularjsPackage#getService_Parametros()
	 * @model
	 * @generated
	 */
	EList<ObjetoAngular> getParametros();

} // Service
