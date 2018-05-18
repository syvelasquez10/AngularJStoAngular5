/**
 */
package Angularjs.mvc;

import Angularjs.html.Template;

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
 *   <li>{@link Angularjs.mvc.Controller#getServices <em>Services</em>}</li>
 *   <li>{@link Angularjs.mvc.Controller#getFuncion <em>Funcion</em>}</li>
 *   <li>{@link Angularjs.mvc.Controller#getVariable <em>Variable</em>}</li>
 *   <li>{@link Angularjs.mvc.Controller#getParametros <em>Parametros</em>}</li>
 *   <li>{@link Angularjs.mvc.Controller#getBody <em>Body</em>}</li>
 *   <li>{@link Angularjs.mvc.Controller#getTemplate <em>Template</em>}</li>
 *   <li>{@link Angularjs.mvc.Controller#getModelo <em>Modelo</em>}</li>
 * </ul>
 *
 * @see Angularjs.mvc.MvcPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends ObjetoJavaScript {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link Angularjs.mvc.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see Angularjs.mvc.MvcPackage#getController_Services()
	 * @model
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Funcion</b></em>' containment reference list.
	 * The list contents are of type {@link Angularjs.mvc.Funcion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funcion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcion</em>' containment reference list.
	 * @see Angularjs.mvc.MvcPackage#getController_Funcion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Funcion> getFuncion();

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link Angularjs.mvc.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see Angularjs.mvc.MvcPackage#getController_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariable();

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
	 * @see Angularjs.mvc.MvcPackage#getController_Parametros()
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
	 * @see Angularjs.mvc.MvcPackage#getController_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link Angularjs.mvc.Controller#getBody <em>Body</em>}' attribute.
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
	 * @see Angularjs.mvc.MvcPackage#getController_Template()
	 * @model required="true"
	 * @generated
	 */
	Template getTemplate();

	/**
	 * Sets the value of the '{@link Angularjs.mvc.Controller#getTemplate <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(Template value);

	/**
	 * Returns the value of the '<em><b>Modelo</b></em>' reference list.
	 * The list contents are of type {@link Angularjs.mvc.Modelo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelo</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelo</em>' reference list.
	 * @see Angularjs.mvc.MvcPackage#getController_Modelo()
	 * @model
	 * @generated
	 */
	EList<Modelo> getModelo();

} // Controller
