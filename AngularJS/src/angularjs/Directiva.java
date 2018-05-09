/**
 */
package angularjs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directiva</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link angularjs.Directiva#getReferencia <em>Referencia</em>}</li>
 *   <li>{@link angularjs.Directiva#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see angularjs.AngularjsPackage#getDirectiva()
 * @model
 * @generated
 */
public interface Directiva extends EObject {
	/**
	 * Returns the value of the '<em><b>Referencia</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referencia</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencia</em>' containment reference.
	 * @see #setReferencia(Referencia)
	 * @see angularjs.AngularjsPackage#getDirectiva_Referencia()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Referencia getReferencia();

	/**
	 * Sets the value of the '{@link angularjs.Directiva#getReferencia <em>Referencia</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referencia</em>' containment reference.
	 * @see #getReferencia()
	 * @generated
	 */
	void setReferencia(Referencia value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see angularjs.AngularjsPackage#getDirectiva_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link angularjs.Directiva#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Directiva
