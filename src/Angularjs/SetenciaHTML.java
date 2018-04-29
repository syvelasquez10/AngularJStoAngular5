/**
 */
package Angularjs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setencia HTML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Angularjs.SetenciaHTML#getMarkup <em>Markup</em>}</li>
 *   <li>{@link Angularjs.SetenciaHTML#getSetenciahtml <em>Setenciahtml</em>}</li>
 *   <li>{@link Angularjs.SetenciaHTML#getName <em>Name</em>}</li>
 *   <li>{@link Angularjs.SetenciaHTML#getPropiedades <em>Propiedades</em>}</li>
 *   <li>{@link Angularjs.SetenciaHTML#isSelfClosing <em>Self Closing</em>}</li>
 * </ul>
 *
 * @see Angularjs.AngularjsPackage#getSetenciaHTML()
 * @model
 * @generated
 */
public interface SetenciaHTML extends EObject {
	/**
	 * Returns the value of the '<em><b>Markup</b></em>' containment reference list.
	 * The list contents are of type {@link Angularjs.MarkUp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Markup</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Markup</em>' containment reference list.
	 * @see Angularjs.AngularjsPackage#getSetenciaHTML_Markup()
	 * @model type="Angularjs.MarkUp" containment="true"
	 * @generated
	 */
	EList getMarkup();

	/**
	 * Returns the value of the '<em><b>Setenciahtml</b></em>' reference list.
	 * The list contents are of type {@link Angularjs.SetenciaHTML}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setenciahtml</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setenciahtml</em>' reference list.
	 * @see Angularjs.AngularjsPackage#getSetenciaHTML_Setenciahtml()
	 * @model type="Angularjs.SetenciaHTML"
	 * @generated
	 */
	EList getSetenciahtml();

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
	 * @see Angularjs.AngularjsPackage#getSetenciaHTML_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Angularjs.SetenciaHTML#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Propiedades</b></em>' containment reference list.
	 * The list contents are of type {@link Angularjs.Propiedad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propiedades</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propiedades</em>' containment reference list.
	 * @see Angularjs.AngularjsPackage#getSetenciaHTML_Propiedades()
	 * @model type="Angularjs.Propiedad" containment="true"
	 * @generated
	 */
	EList getPropiedades();

	/**
	 * Returns the value of the '<em><b>Self Closing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self Closing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Closing</em>' attribute.
	 * @see #setSelfClosing(boolean)
	 * @see Angularjs.AngularjsPackage#getSetenciaHTML_SelfClosing()
	 * @model
	 * @generated
	 */
	boolean isSelfClosing();

	/**
	 * Sets the value of the '{@link Angularjs.SetenciaHTML#isSelfClosing <em>Self Closing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Closing</em>' attribute.
	 * @see #isSelfClosing()
	 * @generated
	 */
	void setSelfClosing(boolean value);

} // SetenciaHTML
