/**
 */
package angularjs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referencia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link angularjs.Referencia#getObjeto <em>Objeto</em>}</li>
 *   <li>{@link angularjs.Referencia#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see angularjs.AngularjsPackage#getReferencia()
 * @model
 * @generated
 */
public interface Referencia extends EObject {
	/**
	 * Returns the value of the '<em><b>Objeto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objeto</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objeto</em>' reference.
	 * @see #setObjeto(ObjetoJavaScript)
	 * @see angularjs.AngularjsPackage#getReferencia_Objeto()
	 * @model required="true"
	 * @generated
	 */
	ObjetoJavaScript getObjeto();

	/**
	 * Sets the value of the '{@link angularjs.Referencia#getObjeto <em>Objeto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objeto</em>' reference.
	 * @see #getObjeto()
	 * @generated
	 */
	void setObjeto(ObjetoJavaScript value);

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
	 * @see angularjs.AngularjsPackage#getReferencia_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link angularjs.Referencia#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Referencia
