/**
 */
package angularjs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modulo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link angularjs.Modulo#getParametros <em>Parametros</em>}</li>
 *   <li>{@link angularjs.Modulo#getServices <em>Services</em>}</li>
 *   <li>{@link angularjs.Modulo#getController <em>Controller</em>}</li>
 *   <li>{@link angularjs.Modulo#getModulos <em>Modulos</em>}</li>
 * </ul>
 *
 * @see angularjs.AngularjsPackage#getModulo()
 * @model
 * @generated
 */
public interface Modulo extends ObjetoJavaScript {
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
	 * @see angularjs.AngularjsPackage#getModulo_Parametros()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parametro> getParametros();

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
	 * @see angularjs.AngularjsPackage#getModulo_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' containment reference list.
	 * The list contents are of type {@link angularjs.Controller}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' containment reference list.
	 * @see angularjs.AngularjsPackage#getModulo_Controller()
	 * @model containment="true"
	 * @generated
	 */
	EList<Controller> getController();

	/**
	 * Returns the value of the '<em><b>Modulos</b></em>' reference list.
	 * The list contents are of type {@link angularjs.Modulo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modulos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modulos</em>' reference list.
	 * @see angularjs.AngularjsPackage#getModulo_Modulos()
	 * @model
	 * @generated
	 */
	EList<Modulo> getModulos();

} // Modulo
