/**
 */
package angularjs2angular5.angular;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link angularjs2angular5.angular.Template#getSentenciashtml <em>Sentenciashtml</em>}</li>
 *   <li>{@link angularjs2angular5.angular.Template#getName <em>Name</em>}</li>
 *   <li>{@link angularjs2angular5.angular.Template#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @see angularjs2angular5.angular.AngularPackage#getTemplate()
 * @model
 * @generated
 */
public interface Template extends EObject {
	/**
	 * Returns the value of the '<em><b>Sentenciashtml</b></em>' containment reference list.
	 * The list contents are of type {@link angularjs2angular5.angular.SentenciaHTML}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sentenciashtml</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentenciashtml</em>' containment reference list.
	 * @see angularjs2angular5.angular.AngularPackage#getTemplate_Sentenciashtml()
	 * @model containment="true"
	 * @generated
	 */
	EList<SentenciaHTML> getSentenciashtml();

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
	 * @see angularjs2angular5.angular.AngularPackage#getTemplate_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link angularjs2angular5.angular.Template#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' reference.
	 * @see #setController(Componente)
	 * @see angularjs2angular5.angular.AngularPackage#getTemplate_Controller()
	 * @model
	 * @generated
	 */
	Componente getController();

	/**
	 * Sets the value of the '{@link angularjs2angular5.angular.Template#getController <em>Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' reference.
	 * @see #getController()
	 * @generated
	 */
	void setController(Componente value);

} // Template
