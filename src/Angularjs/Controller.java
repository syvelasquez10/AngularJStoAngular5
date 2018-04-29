/**
 */
package Angularjs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Angularjs.Controller#getServices <em>Services</em>}</li>
 *   <li>{@link Angularjs.Controller#getFuncion <em>Funcion</em>}</li>
 *   <li>{@link Angularjs.Controller#getParametro <em>Parametro</em>}</li>
 * </ul>
 *
 * @see Angularjs.AngularjsPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends ObjetoJavaScript {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link Angularjs.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see Angularjs.AngularjsPackage#getController_Services()
	 * @model type="Angularjs.Service"
	 * @generated
	 */
	EList getServices();

	/**
	 * Returns the value of the '<em><b>Funcion</b></em>' containment reference list.
	 * The list contents are of type {@link Angularjs.Funcion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funcion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcion</em>' containment reference list.
	 * @see Angularjs.AngularjsPackage#getController_Funcion()
	 * @model type="Angularjs.Funcion" containment="true"
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
	 * @see Angularjs.AngularjsPackage#getController_Parametro()
	 * @model required="true"
	 * @generated
	 */
	Parametro getParametro();

	/**
	 * Sets the value of the '{@link Angularjs.Controller#getParametro <em>Parametro</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametro</em>' reference.
	 * @see #getParametro()
	 * @generated
	 */
	void setParametro(Parametro value);

} // Controller
