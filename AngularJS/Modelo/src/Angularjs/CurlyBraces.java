/**
 */
package Angularjs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curly Braces</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Angularjs.CurlyBraces#getExpresion <em>Expresion</em>}</li>
 *   <li>{@link Angularjs.CurlyBraces#getFiltro <em>Filtro</em>}</li>
 * </ul>
 *
 * @see Angularjs.AngularjsPackage#getCurlyBraces()
 * @model
 * @generated
 */
public interface CurlyBraces extends EObject {
	/**
	 * Returns the value of the '<em><b>Expresion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expresion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expresion</em>' containment reference.
	 * @see #setExpresion(Expresion)
	 * @see Angularjs.AngularjsPackage#getCurlyBraces_Expresion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expresion getExpresion();

	/**
	 * Sets the value of the '{@link Angularjs.CurlyBraces#getExpresion <em>Expresion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expresion</em>' containment reference.
	 * @see #getExpresion()
	 * @generated
	 */
	void setExpresion(Expresion value);

	/**
	 * Returns the value of the '<em><b>Filtro</b></em>' containment reference list.
	 * The list contents are of type {@link Angularjs.Filtro}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filtro</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filtro</em>' containment reference list.
	 * @see Angularjs.AngularjsPackage#getCurlyBraces_Filtro()
	 * @model containment="true"
	 * @generated
	 */
	EList<Filtro> getFiltro();

} // CurlyBraces
