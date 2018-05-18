/**
 */
package Angularjs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Angularjs.AngularjsPackage
 * @generated
 */
public interface AngularjsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AngularjsFactory eINSTANCE = Angularjs.impl.AngularjsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>App Angular JS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Angular JS</em>'.
	 * @generated
	 */
	AppAngularJS createAppAngularJS();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AngularjsPackage getAngularjsPackage();

} //AngularjsFactory
