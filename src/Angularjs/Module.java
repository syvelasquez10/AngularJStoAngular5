/**
 */
package Angularjs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Angularjs.Module#getController <em>Controller</em>}</li>
 *   <li>{@link Angularjs.Module#getModules <em>Modules</em>}</li>
 *   <li>{@link Angularjs.Module#getServices <em>Services</em>}</li>
 *   <li>{@link Angularjs.Module#getParametro <em>Parametro</em>}</li>
 * </ul>
 *
 * @see Angularjs.AngularjsPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends ObjetoJavaScript {
	/**
	 * Returns the value of the '<em><b>Controller</b></em>' containment reference list.
	 * The list contents are of type {@link Angularjs.Controller}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' containment reference list.
	 * @see Angularjs.AngularjsPackage#getModule_Controller()
	 * @model type="Angularjs.Controller" containment="true"
	 * @generated
	 */
	EList getController();

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' reference list.
	 * The list contents are of type {@link Angularjs.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' reference list.
	 * @see Angularjs.AngularjsPackage#getModule_Modules()
	 * @model type="Angularjs.Module"
	 * @generated
	 */
	EList getModules();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link Angularjs.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see Angularjs.AngularjsPackage#getModule_Services()
	 * @model type="Angularjs.Service" containment="true"
	 * @generated
	 */
	EList getServices();

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
	 * @see Angularjs.AngularjsPackage#getModule_Parametro()
	 * @model required="true"
	 * @generated
	 */
	Parametro getParametro();

	/**
	 * Sets the value of the '{@link Angularjs.Module#getParametro <em>Parametro</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametro</em>' reference.
	 * @see #getParametro()
	 * @generated
	 */
	void setParametro(Parametro value);

} // Module
