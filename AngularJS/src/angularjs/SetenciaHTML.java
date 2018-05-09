/**
 */
package angularjs;

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
 *   <li>{@link angularjs.SetenciaHTML#getSetenciahtml <em>Setenciahtml</em>}</li>
 *   <li>{@link angularjs.SetenciaHTML#getName <em>Name</em>}</li>
 *   <li>{@link angularjs.SetenciaHTML#getPropiedades <em>Propiedades</em>}</li>
 *   <li>{@link angularjs.SetenciaHTML#isSelfClosing <em>Self Closing</em>}</li>
 *   <li>{@link angularjs.SetenciaHTML#getDirectivas <em>Directivas</em>}</li>
 *   <li>{@link angularjs.SetenciaHTML#getCurlybraces <em>Curlybraces</em>}</li>
 * </ul>
 *
 * @see angularjs.AngularjsPackage#getSetenciaHTML()
 * @model
 * @generated
 */
public interface SetenciaHTML extends EObject {
	/**
	 * Returns the value of the '<em><b>Setenciahtml</b></em>' reference list.
	 * The list contents are of type {@link angularjs.SetenciaHTML}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setenciahtml</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setenciahtml</em>' reference list.
	 * @see angularjs.AngularjsPackage#getSetenciaHTML_Setenciahtml()
	 * @model
	 * @generated
	 */
	EList<SetenciaHTML> getSetenciahtml();

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
	 * @see angularjs.AngularjsPackage#getSetenciaHTML_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link angularjs.SetenciaHTML#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Propiedades</b></em>' containment reference list.
	 * The list contents are of type {@link angularjs.Propiedad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propiedades</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propiedades</em>' containment reference list.
	 * @see angularjs.AngularjsPackage#getSetenciaHTML_Propiedades()
	 * @model containment="true"
	 * @generated
	 */
	EList<Propiedad> getPropiedades();

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
	 * @see angularjs.AngularjsPackage#getSetenciaHTML_SelfClosing()
	 * @model
	 * @generated
	 */
	boolean isSelfClosing();

	/**
	 * Sets the value of the '{@link angularjs.SetenciaHTML#isSelfClosing <em>Self Closing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Closing</em>' attribute.
	 * @see #isSelfClosing()
	 * @generated
	 */
	void setSelfClosing(boolean value);

	/**
	 * Returns the value of the '<em><b>Directivas</b></em>' reference list.
	 * The list contents are of type {@link angularjs.Directiva}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directivas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directivas</em>' reference list.
	 * @see angularjs.AngularjsPackage#getSetenciaHTML_Directivas()
	 * @model
	 * @generated
	 */
	EList<Directiva> getDirectivas();

	/**
	 * Returns the value of the '<em><b>Curlybraces</b></em>' containment reference list.
	 * The list contents are of type {@link angularjs.CurlyBraces}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curlybraces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curlybraces</em>' containment reference list.
	 * @see angularjs.AngularjsPackage#getSetenciaHTML_Curlybraces()
	 * @model containment="true"
	 * @generated
	 */
	EList<CurlyBraces> getCurlybraces();

} // SetenciaHTML
