/**
 */
package Angularjs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angular JS App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Angularjs.AngularJSApp#getTemplates <em>Templates</em>}</li>
 *   <li>{@link Angularjs.AngularJSApp#getModules <em>Modules</em>}</li>
 *   <li>{@link Angularjs.AngularJSApp#getName <em>Name</em>}</li>
 *   <li>{@link Angularjs.AngularJSApp#getParametros <em>Parametros</em>}</li>
 * </ul>
 *
 * @see Angularjs.AngularjsPackage#getAngularJSApp()
 * @model
 * @generated
 */
public interface AngularJSApp extends EObject {
	/**
	 * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
	 * The list contents are of type {@link Angularjs.Template}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' containment reference list.
	 * @see Angularjs.AngularjsPackage#getAngularJSApp_Templates()
	 * @model type="Angularjs.Template" containment="true"
	 * @generated
	 */
	EList getTemplates();

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link Angularjs.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see Angularjs.AngularjsPackage#getAngularJSApp_Modules()
	 * @model type="Angularjs.Module" containment="true"
	 * @generated
	 */
	EList getModules();

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
	 * @see Angularjs.AngularjsPackage#getAngularJSApp_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Angularjs.AngularJSApp#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parametros</b></em>' containment reference list.
	 * The list contents are of type {@link Angularjs.Parametro}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametros</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametros</em>' containment reference list.
	 * @see Angularjs.AngularjsPackage#getAngularJSApp_Parametros()
	 * @model type="Angularjs.Parametro" containment="true"
	 * @generated
	 */
	EList getParametros();

} // AngularJSApp
