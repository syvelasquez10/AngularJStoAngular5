/**
 */
package angularjs2angular5.angular;

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
 *   <li>{@link angularjs2angular5.angular.Modulo#getParametros <em>Parametros</em>}</li>
 * </ul>
 *
 * @see angularjs2angular5.angular.AngularPackage#getModulo()
 * @model
 * @generated
 */
public interface Modulo extends ObjetoAngular {
	/**
	 * Returns the value of the '<em><b>Parametros</b></em>' reference list.
	 * The list contents are of type {@link angularjs2angular5.angular.ObjetoAngular}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametros</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametros</em>' reference list.
	 * @see angularjs2angular5.angular.AngularPackage#getModulo_Parametros()
	 * @model
	 * @generated
	 */
	EList<ObjetoAngular> getParametros();

} // Modulo
