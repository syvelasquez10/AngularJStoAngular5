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
 * </ul>
 *
 * @see angularjs.AngularjsPackage#getModulo()
 * @model
 * @generated
 */
public interface Modulo extends ObjetoAngular {
	/**
	 * Returns the value of the '<em><b>Parametros</b></em>' reference list.
	 * The list contents are of type {@link angularjs.ObjetoAngular}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametros</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametros</em>' reference list.
	 * @see angularjs.AngularjsPackage#getModulo_Parametros()
	 * @model
	 * @generated
	 */
	EList<ObjetoAngular> getParametros();

} // Modulo
