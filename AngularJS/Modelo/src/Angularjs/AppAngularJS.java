/**
 */
package Angularjs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Angular JS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Angularjs.AppAngularJS#getModulos <em>Modulos</em>}</li>
 *   <li>{@link Angularjs.AppAngularJS#getTemplate <em>Template</em>}</li>
 *   <li>{@link Angularjs.AppAngularJS#getModelos <em>Modelos</em>}</li>
 * </ul>
 *
 * @see Angularjs.AngularjsPackage#getAppAngularJS()
 * @model
 * @generated
 */
public interface AppAngularJS extends EObject {
	/**
	 * Returns the value of the '<em><b>Modulos</b></em>' containment reference list.
	 * The list contents are of type {@link Angularjs.Modulo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modulos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modulos</em>' containment reference list.
	 * @see Angularjs.AngularjsPackage#getAppAngularJS_Modulos()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Modulo> getModulos();

	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference list.
	 * The list contents are of type {@link Angularjs.Template}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' containment reference list.
	 * @see Angularjs.AngularjsPackage#getAppAngularJS_Template()
	 * @model containment="true"
	 * @generated
	 */
	EList<Template> getTemplate();

	/**
	 * Returns the value of the '<em><b>Modelos</b></em>' containment reference list.
	 * The list contents are of type {@link Angularjs.Modelo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelos</em>' containment reference list.
	 * @see Angularjs.AngularjsPackage#getAppAngularJS_Modelos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Modelo> getModelos();

} // AppAngularJS
