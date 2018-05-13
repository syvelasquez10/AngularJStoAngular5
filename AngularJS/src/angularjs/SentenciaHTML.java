/**
 */
package angularjs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sentencia HTML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link angularjs.SentenciaHTML#getSentenciashtml <em>Sentenciashtml</em>}</li>
 *   <li>{@link angularjs.SentenciaHTML#getName <em>Name</em>}</li>
 *   <li>{@link angularjs.SentenciaHTML#getPropiedades <em>Propiedades</em>}</li>
 *   <li>{@link angularjs.SentenciaHTML#getCurlybraces <em>Curlybraces</em>}</li>
 *   <li>{@link angularjs.SentenciaHTML#getDirectivas <em>Directivas</em>}</li>
 * </ul>
 *
 * @see angularjs.AngularjsPackage#getSentenciaHTML()
 * @model
 * @generated
 */
public interface SentenciaHTML extends EObject {
	/**
	 * Returns the value of the '<em><b>Sentenciashtml</b></em>' reference list.
	 * The list contents are of type {@link angularjs.SentenciaHTML}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sentenciashtml</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentenciashtml</em>' reference list.
	 * @see angularjs.AngularjsPackage#getSentenciaHTML_Sentenciashtml()
	 * @model
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
	 * @see angularjs.AngularjsPackage#getSentenciaHTML_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link angularjs.SentenciaHTML#getName <em>Name</em>}' attribute.
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
	 * @see angularjs.AngularjsPackage#getSentenciaHTML_Propiedades()
	 * @model containment="true"
	 * @generated
	 */
	EList<Propiedad> getPropiedades();

	/**
	 * Returns the value of the '<em><b>Directivas</b></em>' containment reference list.
	 * The list contents are of type {@link angularjs.Directiva}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directivas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directivas</em>' containment reference list.
	 * @see angularjs.AngularjsPackage#getSentenciaHTML_Directivas()
	 * @model containment="true"
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
	 * @see angularjs.AngularjsPackage#getSentenciaHTML_Curlybraces()
	 * @model containment="true"
	 * @generated
	 */
	EList<CurlyBraces> getCurlybraces();

} // SentenciaHTML
