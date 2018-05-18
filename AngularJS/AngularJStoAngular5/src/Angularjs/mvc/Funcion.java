/**
 */
package Angularjs.mvc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Funcion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Angularjs.mvc.Funcion#getFuncion <em>Funcion</em>}</li>
 *   <li>{@link Angularjs.mvc.Funcion#isTieneRetorno <em>Tiene Retorno</em>}</li>
 *   <li>{@link Angularjs.mvc.Funcion#getParametros <em>Parametros</em>}</li>
 *   <li>{@link Angularjs.mvc.Funcion#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see Angularjs.mvc.MvcPackage#getFuncion()
 * @model
 * @generated
 */
public interface Funcion extends ObjetoJavaScript {
	/**
	 * Returns the value of the '<em><b>Funcion</b></em>' reference list.
	 * The list contents are of type {@link Angularjs.mvc.Funcion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funcion</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcion</em>' reference list.
	 * @see Angularjs.mvc.MvcPackage#getFuncion_Funcion()
	 * @model
	 * @generated
	 */
	EList<Funcion> getFuncion();

	/**
	 * Returns the value of the '<em><b>Tiene Retorno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiene Retorno</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiene Retorno</em>' attribute.
	 * @see #setTieneRetorno(boolean)
	 * @see Angularjs.mvc.MvcPackage#getFuncion_TieneRetorno()
	 * @model
	 * @generated
	 */
	boolean isTieneRetorno();

	/**
	 * Sets the value of the '{@link Angularjs.mvc.Funcion#isTieneRetorno <em>Tiene Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiene Retorno</em>' attribute.
	 * @see #isTieneRetorno()
	 * @generated
	 */
	void setTieneRetorno(boolean value);

	/**
	 * Returns the value of the '<em><b>Parametros</b></em>' containment reference list.
	 * The list contents are of type {@link Angularjs.mvc.Parametro}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametros</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametros</em>' containment reference list.
	 * @see Angularjs.mvc.MvcPackage#getFuncion_Parametros()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parametro> getParametros();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see Angularjs.mvc.MvcPackage#getFuncion_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link Angularjs.mvc.Funcion#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

} // Funcion
