/**
 */
package Angularjs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expresion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Angularjs.Expresion#getValor <em>Valor</em>}</li>
 *   <li>{@link Angularjs.Expresion#getReferencia <em>Referencia</em>}</li>
 * </ul>
 *
 * @see Angularjs.AngularjsPackage#getExpresion()
 * @model
 * @generated
 */
public interface Expresion extends EObject {
	/**
	 * Returns the value of the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' attribute.
	 * @see #setValor(String)
	 * @see Angularjs.AngularjsPackage#getExpresion_Valor()
	 * @model
	 * @generated
	 */
	String getValor();

	/**
	 * Sets the value of the '{@link Angularjs.Expresion#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(String value);

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
	 * @see Angularjs.AngularjsPackage#getExpresion_Referencia()
	 * @model containment="true"
	 * @generated
	 */
	Referencia getReferencia();

	/**
	 * Sets the value of the '{@link Angularjs.Expresion#getReferencia <em>Referencia</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referencia</em>' containment reference.
	 * @see #getReferencia()
	 * @generated
	 */
	void setReferencia(Referencia value);

} // Expresion
