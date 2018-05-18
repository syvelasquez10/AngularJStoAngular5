/**
 */
package Angularjs.mvc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modulo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Angularjs.mvc.Modulo#getParametros <em>Parametros</em>}</li>
 *   <li>{@link Angularjs.mvc.Modulo#getServices <em>Services</em>}</li>
 *   <li>{@link Angularjs.mvc.Modulo#getController <em>Controller</em>}</li>
 *   <li>{@link Angularjs.mvc.Modulo#getModulos <em>Modulos</em>}</li>
 * </ul>
 *
 * @see Angularjs.mvc.MvcPackage#getModulo()
 * @model
 * @generated
 */
public interface Modulo extends EObject {
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
	 * @see Angularjs.mvc.MvcPackage#getModulo_Parametros()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parametro> getParametros();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link Angularjs.mvc.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see Angularjs.mvc.MvcPackage#getModulo_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' containment reference list.
	 * The list contents are of type {@link Angularjs.mvc.Controller}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' containment reference list.
	 * @see Angularjs.mvc.MvcPackage#getModulo_Controller()
	 * @model containment="true"
	 * @generated
	 */
	EList<Controller> getController();

	/**
	 * Returns the value of the '<em><b>Modulos</b></em>' reference list.
	 * The list contents are of type {@link Angularjs.mvc.Modulo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modulos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modulos</em>' reference list.
	 * @see Angularjs.mvc.MvcPackage#getModulo_Modulos()
	 * @model
	 * @generated
	 */
	EList<Modulo> getModulos();

} // Modulo
