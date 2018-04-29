/**
 */
package Angularjs;

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
 *   <li>{@link Angularjs.Funcion#getVariable <em>Variable</em>}</li>
 *   <li>{@link Angularjs.Funcion#getFuncion <em>Funcion</em>}</li>
 *   <li>{@link Angularjs.Funcion#getParametro <em>Parametro</em>}</li>
 *   <li>{@link Angularjs.Funcion#isTieneRetorno <em>Tiene Retorno</em>}</li>
 *   <li>{@link Angularjs.Funcion#getReferencia <em>Referencia</em>}</li>
 * </ul>
 *
 * @see Angularjs.AngularjsPackage#getFuncion()
 * @model
 * @generated
 */
public interface Funcion extends ObjetoJavaScript {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link Angularjs.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see Angularjs.AngularjsPackage#getFuncion_Variable()
	 * @model type="Angularjs.Variable" containment="true"
	 * @generated
	 */
	EList getVariable();

	/**
	 * Returns the value of the '<em><b>Funcion</b></em>' reference list.
	 * The list contents are of type {@link Angularjs.Funcion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funcion</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcion</em>' reference list.
	 * @see Angularjs.AngularjsPackage#getFuncion_Funcion()
	 * @model type="Angularjs.Funcion"
	 * @generated
	 */
	EList getFuncion();

	/**
	 * Returns the value of the '<em><b>Parametro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametro</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametro</em>' reference.
	 * @see #setParametro(Parametro)
	 * @see Angularjs.AngularjsPackage#getFuncion_Parametro()
	 * @model
	 * @generated
	 */
	Parametro getParametro();

	/**
	 * Sets the value of the '{@link Angularjs.Funcion#getParametro <em>Parametro</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametro</em>' reference.
	 * @see #getParametro()
	 * @generated
	 */
	void setParametro(Parametro value);

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
	 * @see Angularjs.AngularjsPackage#getFuncion_TieneRetorno()
	 * @model
	 * @generated
	 */
	boolean isTieneRetorno();

	/**
	 * Sets the value of the '{@link Angularjs.Funcion#isTieneRetorno <em>Tiene Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiene Retorno</em>' attribute.
	 * @see #isTieneRetorno()
	 * @generated
	 */
	void setTieneRetorno(boolean value);

	/**
	 * Returns the value of the '<em><b>Referencia</b></em>' containment reference list.
	 * The list contents are of type {@link Angularjs.Referencia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referencia</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencia</em>' containment reference list.
	 * @see Angularjs.AngularjsPackage#getFuncion_Referencia()
	 * @model type="Angularjs.Referencia" containment="true"
	 * @generated
	 */
	EList getReferencia();

} // Funcion
