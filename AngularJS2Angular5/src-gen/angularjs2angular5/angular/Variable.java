/**
 */
package angularjs2angular5.angular;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link angularjs2angular5.angular.Variable#getValor <em>Valor</em>}</li>
 *   <li>{@link angularjs2angular5.angular.Variable#getAnotacion <em>Anotacion</em>}</li>
 *   <li>{@link angularjs2angular5.angular.Variable#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see angularjs2angular5.angular.AngularPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
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
	 * @see angularjs2angular5.angular.AngularPackage#getVariable_Valor()
	 * @model
	 * @generated
	 */
	String getValor();

	/**
	 * Sets the value of the '{@link angularjs2angular5.angular.Variable#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(String value);

	/**
	 * Returns the value of the '<em><b>Anotacion</b></em>' containment reference list.
	 * The list contents are of type {@link angularjs2angular5.angular.Anotacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anotacion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anotacion</em>' containment reference list.
	 * @see angularjs2angular5.angular.AngularPackage#getVariable_Anotacion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Anotacion> getAnotacion();

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
	 * @see angularjs2angular5.angular.AngularPackage#getVariable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link angularjs2angular5.angular.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Variable
