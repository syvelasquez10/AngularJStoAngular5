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
 *   <li>{@link angularjs.Directiva#getName <em>Name</em>}</li>
 *   <li>{@link angularjs.Directiva#getCurlybraces <em>Curlybraces</em>}</li>
 *   <li>{@link angularjs.Directiva#getReferencia <em>Referencia</em>}</li>
 * </ul>
 *
 * @see angularjs.AngularjsPackage#getDirectiva()
 * @model
 * @generated
 */
public interface Directiva extends EObject {
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

	/**
	 * Returns the value of the '<em><b>Curlybraces</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curlybraces</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curlybraces</em>' reference.
	 * @see #setCurlybraces(CurlyBraces)
	 * @see angularjs.AngularjsPackage#getDirectiva_Curlybraces()
	 * @model
	 * @generated
	 */
	CurlyBraces getCurlybraces();

	/**
	 * Sets the value of the '{@link angularjs.Directiva#getCurlybraces <em>Curlybraces</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curlybraces</em>' reference.
	 * @see #getCurlybraces()
	 * @generated
	 */
	void setCurlybraces(CurlyBraces value);

	/**
	 * Returns the value of the '<em><b>Referencia</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referencia</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencia</em>' reference.
	 * @see #setReferencia(ObjetoAngular)
	 * @see angularjs.AngularjsPackage#getDirectiva_Referencia()
	 * @model
	 * @generated
	 */
	ObjetoAngular getReferencia();

	/**
	 * Sets the value of the '{@link angularjs.Directiva#getReferencia <em>Referencia</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referencia</em>' reference.
	 * @see #getReferencia()
	 * @generated
	 */
	void setReferencia(ObjetoAngular value);

} // Directiva
