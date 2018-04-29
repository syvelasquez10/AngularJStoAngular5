/**
 */
package Angularjs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Angularjs.Template#getSetenciahtml <em>Setenciahtml</em>}</li>
 *   <li>{@link Angularjs.Template#getName <em>Name</em>}</li>
 *   <li>{@link Angularjs.Template#getRutaArchivo <em>Ruta Archivo</em>}</li>
 *   <li>{@link Angularjs.Template#getDirectiva <em>Directiva</em>}</li>
 * </ul>
 *
 * @see Angularjs.AngularjsPackage#getTemplate()
 * @model
 * @generated
 */
public interface Template extends EObject {
	/**
	 * Returns the value of the '<em><b>Setenciahtml</b></em>' containment reference list.
	 * The list contents are of type {@link Angularjs.SetenciaHTML}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setenciahtml</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setenciahtml</em>' containment reference list.
	 * @see Angularjs.AngularjsPackage#getTemplate_Setenciahtml()
	 * @model containment="true"
	 * @generated
	 */
	EList<SetenciaHTML> getSetenciahtml();

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
	 * @see Angularjs.AngularjsPackage#getTemplate_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Angularjs.Template#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ruta Archivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruta Archivo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruta Archivo</em>' attribute.
	 * @see #setRutaArchivo(String)
	 * @see Angularjs.AngularjsPackage#getTemplate_RutaArchivo()
	 * @model
	 * @generated
	 */
	String getRutaArchivo();

	/**
	 * Sets the value of the '{@link Angularjs.Template#getRutaArchivo <em>Ruta Archivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruta Archivo</em>' attribute.
	 * @see #getRutaArchivo()
	 * @generated
	 */
	void setRutaArchivo(String value);

	/**
	 * Returns the value of the '<em><b>Directiva</b></em>' containment reference list.
	 * The list contents are of type {@link Angularjs.Directiva}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directiva</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directiva</em>' containment reference list.
	 * @see Angularjs.AngularjsPackage#getTemplate_Directiva()
	 * @model containment="true"
	 * @generated
	 */
	EList<Directiva> getDirectiva();

} // Template
