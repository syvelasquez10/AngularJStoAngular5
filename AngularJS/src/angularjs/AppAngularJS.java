/**
 */
package angularjs;

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
 *   <li>{@link angularjs.AppAngularJS#getModulos <em>Modulos</em>}</li>
 *   <li>{@link angularjs.AppAngularJS#getTemplates <em>Templates</em>}</li>
 *   <li>{@link angularjs.AppAngularJS#getModelos <em>Modelos</em>}</li>
 *   <li>{@link angularjs.AppAngularJS#getName <em>Name</em>}</li>
 *   <li>{@link angularjs.AppAngularJS#getServices <em>Services</em>}</li>
 *   <li>{@link angularjs.AppAngularJS#getComponentes <em>Componentes</em>}</li>
 * </ul>
 *
 * @see angularjs.AngularjsPackage#getAppAngularJS()
 * @model
 * @generated
 */
public interface AppAngularJS extends EObject {
	/**
	 * Returns the value of the '<em><b>Modulos</b></em>' containment reference list.
	 * The list contents are of type {@link angularjs.Modulo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modulos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modulos</em>' containment reference list.
	 * @see angularjs.AngularjsPackage#getAppAngularJS_Modulos()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Modulo> getModulos();

	/**
	 * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
	 * The list contents are of type {@link angularjs.Template}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' containment reference list.
	 * @see angularjs.AngularjsPackage#getAppAngularJS_Templates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Template> getTemplates();

	/**
	 * Returns the value of the '<em><b>Modelos</b></em>' containment reference list.
	 * The list contents are of type {@link angularjs.Modelo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelos</em>' containment reference list.
	 * @see angularjs.AngularjsPackage#getAppAngularJS_Modelos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Modelo> getModelos();

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
	 * @see angularjs.AngularjsPackage#getAppAngularJS_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link angularjs.AppAngularJS#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link angularjs.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see angularjs.AngularjsPackage#getAppAngularJS_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Componentes</b></em>' containment reference list.
	 * The list contents are of type {@link angularjs.Componente}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Componentes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Componentes</em>' containment reference list.
	 * @see angularjs.AngularjsPackage#getAppAngularJS_Componentes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Componente> getComponentes();

} // AppAngularJS
