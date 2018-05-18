/**
 */
package Angularjs.html;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Angularjs.html.HtmlPackage
 * @generated
 */
public interface HtmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HtmlFactory eINSTANCE = Angularjs.html.impl.HtmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template</em>'.
	 * @generated
	 */
	Template createTemplate();

	/**
	 * Returns a new object of class '<em>Directiva</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Directiva</em>'.
	 * @generated
	 */
	Directiva createDirectiva();

	/**
	 * Returns a new object of class '<em>Setencia HTML</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Setencia HTML</em>'.
	 * @generated
	 */
	SetenciaHTML createSetenciaHTML();

	/**
	 * Returns a new object of class '<em>Propiedad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propiedad</em>'.
	 * @generated
	 */
	Propiedad createPropiedad();

	/**
	 * Returns a new object of class '<em>Curly Braces</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Curly Braces</em>'.
	 * @generated
	 */
	CurlyBraces createCurlyBraces();

	/**
	 * Returns a new object of class '<em>Referencia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referencia</em>'.
	 * @generated
	 */
	Referencia createReferencia();

	/**
	 * Returns a new object of class '<em>Expresion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expresion</em>'.
	 * @generated
	 */
	Expresion createExpresion();

	/**
	 * Returns a new object of class '<em>Filtro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filtro</em>'.
	 * @generated
	 */
	Filtro createFiltro();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HtmlPackage getHtmlPackage();

} //HtmlFactory
