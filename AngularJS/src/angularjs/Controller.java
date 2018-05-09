/**
 */
package angularjs;

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
 *   <li>{@link angularjs.Controller#getServices <em>Services</em>}</li>
 *   <li>{@link angularjs.Controller#getFuncion <em>Funcion</em>}</li>
 *   <li>{@link angularjs.Controller#getVariable <em>Variable</em>}</li>
 *   <li>{@link angularjs.Controller#getParametros <em>Parametros</em>}</li>
 *   <li>{@link angularjs.Controller#getBody <em>Body</em>}</li>
 *   <li>{@link angularjs.Controller#getTemplate <em>Template</em>}</li>
 *   <li>{@link angularjs.Controller#getModelo <em>Modelo</em>}</li>
 * </ul>
 *
 * @see angularjs.AngularjsPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends ObjetoJavaScript {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link angularjs.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see angularjs.AngularjsPackage#getController_Services()
	 * @model
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Funcion</b></em>' containment reference list.
	 * The list contents are of type {@link angularjs.Funcion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funcion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcion</em>' containment reference list.
	 * @see angularjs.AngularjsPackage#getController_Funcion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Funcion> getFuncion();

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link angularjs.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see angularjs.AngularjsPackage#getController_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariable();

	/**
	 * Returns the value of the '<em><b>Parametros</b></em>' containment reference list.
	 * The list contents are of type {@link angularjs.Parametro}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametros</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametros</em>' containment reference list.
	 * @see angularjs.AngularjsPackage#getController_Parametros()
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
	 * @see angularjs.AngularjsPackage#getController_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link angularjs.Controller#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' reference.
	 * @see #setTemplate(Template)
	 * @see angularjs.AngularjsPackage#getController_Template()
	 * @model required="true"
	 * @generated
	 */
	Template getTemplate();

	/**
	 * Sets the value of the '{@link angularjs.Controller#getTemplate <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(Template value);

	/**
	 * Returns the value of the '<em><b>Modelo</b></em>' reference list.
	 * The list contents are of type {@link angularjs.Modelo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelo</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelo</em>' reference list.
	 * @see angularjs.AngularjsPackage#getController_Modelo()
	 * @model
	 * @generated
	 */
	EList<Modelo> getModelo();

} // Controller
