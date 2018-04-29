/**
 */
package Angularjs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filtro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Angularjs.Filtro#getName <em>Name</em>}</li>
 *   <li>{@link Angularjs.Filtro#getParametros <em>Parametros</em>}</li>
 * </ul>
 *
 * @see Angularjs.AngularjsPackage#getFiltro()
 * @model
 * @generated
 */
public interface Filtro extends EObject {
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
	 * @see Angularjs.AngularjsPackage#getFiltro_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Angularjs.Filtro#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parametros</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametros</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametros</em>' attribute.
	 * @see #setParametros(String)
	 * @see Angularjs.AngularjsPackage#getFiltro_Parametros()
	 * @model
	 * @generated
	 */
	String getParametros();

	/**
	 * Sets the value of the '{@link Angularjs.Filtro#getParametros <em>Parametros</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametros</em>' attribute.
	 * @see #getParametros()
	 * @generated
	 */
	void setParametros(String value);

} // Filtro
