/**
 */
package angularjs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link angularjs.Variable#getValor <em>Valor</em>}</li>
 *   <li>{@link angularjs.Variable#getAnotacion <em>Anotacion</em>}</li>
 * </ul>
 *
 * @see angularjs.AngularjsPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends ObjetoJavaScript {
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
	 * @see angularjs.AngularjsPackage#getVariable_Valor()
	 * @model
	 * @generated
	 */
	String getValor();

	/**
	 * Sets the value of the '{@link angularjs.Variable#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(String value);

	/**
	 * Returns the value of the '<em><b>Anotacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anotacion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anotacion</em>' containment reference.
	 * @see #setAnotacion(Anotacion)
	 * @see angularjs.AngularjsPackage#getVariable_Anotacion()
	 * @model containment="true"
	 * @generated
	 */
	Anotacion getAnotacion();

	/**
	 * Sets the value of the '{@link angularjs.Variable#getAnotacion <em>Anotacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anotacion</em>' containment reference.
	 * @see #getAnotacion()
	 * @generated
	 */
	void setAnotacion(Anotacion value);

} // Variable
