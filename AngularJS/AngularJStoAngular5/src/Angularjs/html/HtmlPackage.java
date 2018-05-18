/**
 */
package Angularjs.html;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Angularjs.html.HtmlFactory
 * @model kind="package"
 * @generated
 */
public interface HtmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "html";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://uniandes.edu.co/angular/html";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "html";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HtmlPackage eINSTANCE = Angularjs.html.impl.HtmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link Angularjs.html.impl.TemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.html.impl.TemplateImpl
	 * @see Angularjs.html.impl.HtmlPackageImpl#getTemplate()
	 * @generated
	 */
	int TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Setenciahtml</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__SETENCIAHTML = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Ruta Archivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__RUTA_ARCHIVO = 2;

	/**
	 * The feature id for the '<em><b>Directiva</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__DIRECTIVA = 3;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__CONTROLLER = 4;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Angularjs.html.impl.DirectivaImpl <em>Directiva</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.html.impl.DirectivaImpl
	 * @see Angularjs.html.impl.HtmlPackageImpl#getDirectiva()
	 * @generated
	 */
	int DIRECTIVA = 1;

	/**
	 * The feature id for the '<em><b>Referencia</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVA__REFERENCIA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVA__NAME = 1;

	/**
	 * The number of structural features of the '<em>Directiva</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Directiva</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Angularjs.html.impl.SetenciaHTMLImpl <em>Setencia HTML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.html.impl.SetenciaHTMLImpl
	 * @see Angularjs.html.impl.HtmlPackageImpl#getSetenciaHTML()
	 * @generated
	 */
	int SETENCIA_HTML = 2;

	/**
	 * The feature id for the '<em><b>Setenciahtml</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETENCIA_HTML__SETENCIAHTML = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETENCIA_HTML__NAME = 1;

	/**
	 * The feature id for the '<em><b>Propiedades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETENCIA_HTML__PROPIEDADES = 2;

	/**
	 * The feature id for the '<em><b>Self Closing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETENCIA_HTML__SELF_CLOSING = 3;

	/**
	 * The feature id for the '<em><b>Directivas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETENCIA_HTML__DIRECTIVAS = 4;

	/**
	 * The feature id for the '<em><b>Curlybraces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETENCIA_HTML__CURLYBRACES = 5;

	/**
	 * The number of structural features of the '<em>Setencia HTML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETENCIA_HTML_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Setencia HTML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETENCIA_HTML_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Angularjs.html.impl.PropiedadImpl <em>Propiedad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.html.impl.PropiedadImpl
	 * @see Angularjs.html.impl.HtmlPackageImpl#getPropiedad()
	 * @generated
	 */
	int PROPIEDAD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD__VALOR = 1;

	/**
	 * The number of structural features of the '<em>Propiedad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Propiedad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Angularjs.html.impl.CurlyBracesImpl <em>Curly Braces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.html.impl.CurlyBracesImpl
	 * @see Angularjs.html.impl.HtmlPackageImpl#getCurlyBraces()
	 * @generated
	 */
	int CURLY_BRACES = 4;

	/**
	 * The feature id for the '<em><b>Expresion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACES__EXPRESION = 0;

	/**
	 * The feature id for the '<em><b>Filtro</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACES__FILTRO = 1;

	/**
	 * The number of structural features of the '<em>Curly Braces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Curly Braces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURLY_BRACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Angularjs.html.impl.ReferenciaImpl <em>Referencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.html.impl.ReferenciaImpl
	 * @see Angularjs.html.impl.HtmlPackageImpl#getReferencia()
	 * @generated
	 */
	int REFERENCIA = 5;

	/**
	 * The feature id for the '<em><b>Objeto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCIA__OBJETO = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCIA__NAME = 1;

	/**
	 * The number of structural features of the '<em>Referencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCIA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Referencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Angularjs.html.impl.ExpresionImpl <em>Expresion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.html.impl.ExpresionImpl
	 * @see Angularjs.html.impl.HtmlPackageImpl#getExpresion()
	 * @generated
	 */
	int EXPRESION = 6;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION__VALOR = 0;

	/**
	 * The feature id for the '<em><b>Referencia</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION__REFERENCIA = 1;

	/**
	 * The number of structural features of the '<em>Expresion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Expresion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Angularjs.html.impl.FiltroImpl <em>Filtro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Angularjs.html.impl.FiltroImpl
	 * @see Angularjs.html.impl.HtmlPackageImpl#getFiltro()
	 * @generated
	 */
	int FILTRO = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parametros</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRO__PARAMETROS = 1;

	/**
	 * The number of structural features of the '<em>Filtro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Filtro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRO_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Angularjs.html.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see Angularjs.html.Template
	 * @generated
	 */
	EClass getTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.html.Template#getSetenciahtml <em>Setenciahtml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setenciahtml</em>'.
	 * @see Angularjs.html.Template#getSetenciahtml()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Setenciahtml();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.html.Template#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Angularjs.html.Template#getName()
	 * @see #getTemplate()
	 * @generated
	 */
	EAttribute getTemplate_Name();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.html.Template#getRutaArchivo <em>Ruta Archivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta Archivo</em>'.
	 * @see Angularjs.html.Template#getRutaArchivo()
	 * @see #getTemplate()
	 * @generated
	 */
	EAttribute getTemplate_RutaArchivo();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.html.Template#getDirectiva <em>Directiva</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Directiva</em>'.
	 * @see Angularjs.html.Template#getDirectiva()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Directiva();

	/**
	 * Returns the meta object for the reference '{@link Angularjs.html.Template#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controller</em>'.
	 * @see Angularjs.html.Template#getController()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Controller();

	/**
	 * Returns the meta object for class '{@link Angularjs.html.Directiva <em>Directiva</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directiva</em>'.
	 * @see Angularjs.html.Directiva
	 * @generated
	 */
	EClass getDirectiva();

	/**
	 * Returns the meta object for the containment reference '{@link Angularjs.html.Directiva#getReferencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referencia</em>'.
	 * @see Angularjs.html.Directiva#getReferencia()
	 * @see #getDirectiva()
	 * @generated
	 */
	EReference getDirectiva_Referencia();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.html.Directiva#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Angularjs.html.Directiva#getName()
	 * @see #getDirectiva()
	 * @generated
	 */
	EAttribute getDirectiva_Name();

	/**
	 * Returns the meta object for class '{@link Angularjs.html.SetenciaHTML <em>Setencia HTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setencia HTML</em>'.
	 * @see Angularjs.html.SetenciaHTML
	 * @generated
	 */
	EClass getSetenciaHTML();

	/**
	 * Returns the meta object for the reference list '{@link Angularjs.html.SetenciaHTML#getSetenciahtml <em>Setenciahtml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Setenciahtml</em>'.
	 * @see Angularjs.html.SetenciaHTML#getSetenciahtml()
	 * @see #getSetenciaHTML()
	 * @generated
	 */
	EReference getSetenciaHTML_Setenciahtml();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.html.SetenciaHTML#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Angularjs.html.SetenciaHTML#getName()
	 * @see #getSetenciaHTML()
	 * @generated
	 */
	EAttribute getSetenciaHTML_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.html.SetenciaHTML#getPropiedades <em>Propiedades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Propiedades</em>'.
	 * @see Angularjs.html.SetenciaHTML#getPropiedades()
	 * @see #getSetenciaHTML()
	 * @generated
	 */
	EReference getSetenciaHTML_Propiedades();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.html.SetenciaHTML#isSelfClosing <em>Self Closing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Closing</em>'.
	 * @see Angularjs.html.SetenciaHTML#isSelfClosing()
	 * @see #getSetenciaHTML()
	 * @generated
	 */
	EAttribute getSetenciaHTML_SelfClosing();

	/**
	 * Returns the meta object for the reference list '{@link Angularjs.html.SetenciaHTML#getDirectivas <em>Directivas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Directivas</em>'.
	 * @see Angularjs.html.SetenciaHTML#getDirectivas()
	 * @see #getSetenciaHTML()
	 * @generated
	 */
	EReference getSetenciaHTML_Directivas();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.html.SetenciaHTML#getCurlybraces <em>Curlybraces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Curlybraces</em>'.
	 * @see Angularjs.html.SetenciaHTML#getCurlybraces()
	 * @see #getSetenciaHTML()
	 * @generated
	 */
	EReference getSetenciaHTML_Curlybraces();

	/**
	 * Returns the meta object for class '{@link Angularjs.html.Propiedad <em>Propiedad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propiedad</em>'.
	 * @see Angularjs.html.Propiedad
	 * @generated
	 */
	EClass getPropiedad();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.html.Propiedad#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Angularjs.html.Propiedad#getName()
	 * @see #getPropiedad()
	 * @generated
	 */
	EAttribute getPropiedad_Name();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.html.Propiedad#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see Angularjs.html.Propiedad#getValor()
	 * @see #getPropiedad()
	 * @generated
	 */
	EAttribute getPropiedad_Valor();

	/**
	 * Returns the meta object for class '{@link Angularjs.html.CurlyBraces <em>Curly Braces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curly Braces</em>'.
	 * @see Angularjs.html.CurlyBraces
	 * @generated
	 */
	EClass getCurlyBraces();

	/**
	 * Returns the meta object for the containment reference '{@link Angularjs.html.CurlyBraces#getExpresion <em>Expresion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expresion</em>'.
	 * @see Angularjs.html.CurlyBraces#getExpresion()
	 * @see #getCurlyBraces()
	 * @generated
	 */
	EReference getCurlyBraces_Expresion();

	/**
	 * Returns the meta object for the containment reference list '{@link Angularjs.html.CurlyBraces#getFiltro <em>Filtro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filtro</em>'.
	 * @see Angularjs.html.CurlyBraces#getFiltro()
	 * @see #getCurlyBraces()
	 * @generated
	 */
	EReference getCurlyBraces_Filtro();

	/**
	 * Returns the meta object for class '{@link Angularjs.html.Referencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referencia</em>'.
	 * @see Angularjs.html.Referencia
	 * @generated
	 */
	EClass getReferencia();

	/**
	 * Returns the meta object for the reference '{@link Angularjs.html.Referencia#getObjeto <em>Objeto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Objeto</em>'.
	 * @see Angularjs.html.Referencia#getObjeto()
	 * @see #getReferencia()
	 * @generated
	 */
	EReference getReferencia_Objeto();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.html.Referencia#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Angularjs.html.Referencia#getName()
	 * @see #getReferencia()
	 * @generated
	 */
	EAttribute getReferencia_Name();

	/**
	 * Returns the meta object for class '{@link Angularjs.html.Expresion <em>Expresion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expresion</em>'.
	 * @see Angularjs.html.Expresion
	 * @generated
	 */
	EClass getExpresion();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.html.Expresion#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see Angularjs.html.Expresion#getValor()
	 * @see #getExpresion()
	 * @generated
	 */
	EAttribute getExpresion_Valor();

	/**
	 * Returns the meta object for the containment reference '{@link Angularjs.html.Expresion#getReferencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referencia</em>'.
	 * @see Angularjs.html.Expresion#getReferencia()
	 * @see #getExpresion()
	 * @generated
	 */
	EReference getExpresion_Referencia();

	/**
	 * Returns the meta object for class '{@link Angularjs.html.Filtro <em>Filtro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filtro</em>'.
	 * @see Angularjs.html.Filtro
	 * @generated
	 */
	EClass getFiltro();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.html.Filtro#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Angularjs.html.Filtro#getName()
	 * @see #getFiltro()
	 * @generated
	 */
	EAttribute getFiltro_Name();

	/**
	 * Returns the meta object for the attribute '{@link Angularjs.html.Filtro#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parametros</em>'.
	 * @see Angularjs.html.Filtro#getParametros()
	 * @see #getFiltro()
	 * @generated
	 */
	EAttribute getFiltro_Parametros();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HtmlFactory getHtmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Angularjs.html.impl.TemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.html.impl.TemplateImpl
		 * @see Angularjs.html.impl.HtmlPackageImpl#getTemplate()
		 * @generated
		 */
		EClass TEMPLATE = eINSTANCE.getTemplate();

		/**
		 * The meta object literal for the '<em><b>Setenciahtml</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__SETENCIAHTML = eINSTANCE.getTemplate_Setenciahtml();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE__NAME = eINSTANCE.getTemplate_Name();

		/**
		 * The meta object literal for the '<em><b>Ruta Archivo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE__RUTA_ARCHIVO = eINSTANCE.getTemplate_RutaArchivo();

		/**
		 * The meta object literal for the '<em><b>Directiva</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__DIRECTIVA = eINSTANCE.getTemplate_Directiva();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__CONTROLLER = eINSTANCE.getTemplate_Controller();

		/**
		 * The meta object literal for the '{@link Angularjs.html.impl.DirectivaImpl <em>Directiva</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.html.impl.DirectivaImpl
		 * @see Angularjs.html.impl.HtmlPackageImpl#getDirectiva()
		 * @generated
		 */
		EClass DIRECTIVA = eINSTANCE.getDirectiva();

		/**
		 * The meta object literal for the '<em><b>Referencia</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTIVA__REFERENCIA = eINSTANCE.getDirectiva_Referencia();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTIVA__NAME = eINSTANCE.getDirectiva_Name();

		/**
		 * The meta object literal for the '{@link Angularjs.html.impl.SetenciaHTMLImpl <em>Setencia HTML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.html.impl.SetenciaHTMLImpl
		 * @see Angularjs.html.impl.HtmlPackageImpl#getSetenciaHTML()
		 * @generated
		 */
		EClass SETENCIA_HTML = eINSTANCE.getSetenciaHTML();

		/**
		 * The meta object literal for the '<em><b>Setenciahtml</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETENCIA_HTML__SETENCIAHTML = eINSTANCE.getSetenciaHTML_Setenciahtml();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETENCIA_HTML__NAME = eINSTANCE.getSetenciaHTML_Name();

		/**
		 * The meta object literal for the '<em><b>Propiedades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETENCIA_HTML__PROPIEDADES = eINSTANCE.getSetenciaHTML_Propiedades();

		/**
		 * The meta object literal for the '<em><b>Self Closing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETENCIA_HTML__SELF_CLOSING = eINSTANCE.getSetenciaHTML_SelfClosing();

		/**
		 * The meta object literal for the '<em><b>Directivas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETENCIA_HTML__DIRECTIVAS = eINSTANCE.getSetenciaHTML_Directivas();

		/**
		 * The meta object literal for the '<em><b>Curlybraces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETENCIA_HTML__CURLYBRACES = eINSTANCE.getSetenciaHTML_Curlybraces();

		/**
		 * The meta object literal for the '{@link Angularjs.html.impl.PropiedadImpl <em>Propiedad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.html.impl.PropiedadImpl
		 * @see Angularjs.html.impl.HtmlPackageImpl#getPropiedad()
		 * @generated
		 */
		EClass PROPIEDAD = eINSTANCE.getPropiedad();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPIEDAD__NAME = eINSTANCE.getPropiedad_Name();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPIEDAD__VALOR = eINSTANCE.getPropiedad_Valor();

		/**
		 * The meta object literal for the '{@link Angularjs.html.impl.CurlyBracesImpl <em>Curly Braces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.html.impl.CurlyBracesImpl
		 * @see Angularjs.html.impl.HtmlPackageImpl#getCurlyBraces()
		 * @generated
		 */
		EClass CURLY_BRACES = eINSTANCE.getCurlyBraces();

		/**
		 * The meta object literal for the '<em><b>Expresion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURLY_BRACES__EXPRESION = eINSTANCE.getCurlyBraces_Expresion();

		/**
		 * The meta object literal for the '<em><b>Filtro</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURLY_BRACES__FILTRO = eINSTANCE.getCurlyBraces_Filtro();

		/**
		 * The meta object literal for the '{@link Angularjs.html.impl.ReferenciaImpl <em>Referencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.html.impl.ReferenciaImpl
		 * @see Angularjs.html.impl.HtmlPackageImpl#getReferencia()
		 * @generated
		 */
		EClass REFERENCIA = eINSTANCE.getReferencia();

		/**
		 * The meta object literal for the '<em><b>Objeto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCIA__OBJETO = eINSTANCE.getReferencia_Objeto();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCIA__NAME = eINSTANCE.getReferencia_Name();

		/**
		 * The meta object literal for the '{@link Angularjs.html.impl.ExpresionImpl <em>Expresion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.html.impl.ExpresionImpl
		 * @see Angularjs.html.impl.HtmlPackageImpl#getExpresion()
		 * @generated
		 */
		EClass EXPRESION = eINSTANCE.getExpresion();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESION__VALOR = eINSTANCE.getExpresion_Valor();

		/**
		 * The meta object literal for the '<em><b>Referencia</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESION__REFERENCIA = eINSTANCE.getExpresion_Referencia();

		/**
		 * The meta object literal for the '{@link Angularjs.html.impl.FiltroImpl <em>Filtro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Angularjs.html.impl.FiltroImpl
		 * @see Angularjs.html.impl.HtmlPackageImpl#getFiltro()
		 * @generated
		 */
		EClass FILTRO = eINSTANCE.getFiltro();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTRO__NAME = eINSTANCE.getFiltro_Name();

		/**
		 * The meta object literal for the '<em><b>Parametros</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTRO__PARAMETROS = eINSTANCE.getFiltro_Parametros();

	}

} //HtmlPackage
