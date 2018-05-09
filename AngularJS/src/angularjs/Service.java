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
 *   <li>{@link angularjs.Service#getParametro <em>Parametro</em>}</li>
 * </ul>
 *
 * @see angularjs.AngularjsPackage#getService()
 * @model
 * @generated
 */
public interface Service extends ObjetoJavaScript {
	/**
	 * Returns the value of the '<em><b>Funcion</b></em>' containment reference list.
	 * The list contents are of type {@link angularjs.Funcion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funcion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcion</em>' containment reference list.
	 * @see angularjs.AngularjsPackage#getService_Funcion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Funcion> getFuncion();

	/**
	 * Returns the value of the '<em><b>Parametro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametro</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametro</em>' reference.
	 * @see #setParametro(Parametro)
	 * @see angularjs.AngularjsPackage#getService_Parametro()
	 * @model required="true"
	 * @generated
	 */
	Parametro getParametro();

	/**
	 * Sets the value of the '{@link angularjs.Service#getParametro <em>Parametro</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametro</em>' reference.
	 * @see #getParametro()
	 * @generated
	 */
	void setParametro(Parametro value);

} // Service
