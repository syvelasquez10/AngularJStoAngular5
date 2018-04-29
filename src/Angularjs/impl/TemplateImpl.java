/**
 */
package Angularjs.impl;

import Angularjs.AngularjsPackage;
import Angularjs.SetenciaHTML;
import Angularjs.Template;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Angularjs.impl.TemplateImpl#getSetenciahtml <em>Setenciahtml</em>}</li>
 *   <li>{@link Angularjs.impl.TemplateImpl#getName <em>Name</em>}</li>
 *   <li>{@link Angularjs.impl.TemplateImpl#getRutaArchivo <em>Ruta Archivo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateImpl extends MinimalEObjectImpl.Container implements Template {
	/**
	 * The cached value of the '{@link #getSetenciahtml() <em>Setenciahtml</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetenciahtml()
	 * @generated
	 * @ordered
	 */
	protected EList setenciahtml;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRutaArchivo() <em>Ruta Archivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRutaArchivo()
	 * @generated
	 * @ordered
	 */
	protected static final String RUTA_ARCHIVO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRutaArchivo() <em>Ruta Archivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRutaArchivo()
	 * @generated
	 * @ordered
	 */
	protected String rutaArchivo = RUTA_ARCHIVO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AngularjsPackage.Literals.TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSetenciahtml() {
		if (setenciahtml == null) {
			setenciahtml = new EObjectContainmentEList(SetenciaHTML.class, this, AngularjsPackage.TEMPLATE__SETENCIAHTML);
		}
		return setenciahtml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AngularjsPackage.TEMPLATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRutaArchivo() {
		return rutaArchivo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRutaArchivo(String newRutaArchivo) {
		String oldRutaArchivo = rutaArchivo;
		rutaArchivo = newRutaArchivo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AngularjsPackage.TEMPLATE__RUTA_ARCHIVO, oldRutaArchivo, rutaArchivo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AngularjsPackage.TEMPLATE__SETENCIAHTML:
				return ((InternalEList)getSetenciahtml()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AngularjsPackage.TEMPLATE__SETENCIAHTML:
				return getSetenciahtml();
			case AngularjsPackage.TEMPLATE__NAME:
				return getName();
			case AngularjsPackage.TEMPLATE__RUTA_ARCHIVO:
				return getRutaArchivo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AngularjsPackage.TEMPLATE__SETENCIAHTML:
				getSetenciahtml().clear();
				getSetenciahtml().addAll((Collection)newValue);
				return;
			case AngularjsPackage.TEMPLATE__NAME:
				setName((String)newValue);
				return;
			case AngularjsPackage.TEMPLATE__RUTA_ARCHIVO:
				setRutaArchivo((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case AngularjsPackage.TEMPLATE__SETENCIAHTML:
				getSetenciahtml().clear();
				return;
			case AngularjsPackage.TEMPLATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AngularjsPackage.TEMPLATE__RUTA_ARCHIVO:
				setRutaArchivo(RUTA_ARCHIVO_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AngularjsPackage.TEMPLATE__SETENCIAHTML:
				return setenciahtml != null && !setenciahtml.isEmpty();
			case AngularjsPackage.TEMPLATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AngularjsPackage.TEMPLATE__RUTA_ARCHIVO:
				return RUTA_ARCHIVO_EDEFAULT == null ? rutaArchivo != null : !RUTA_ARCHIVO_EDEFAULT.equals(rutaArchivo);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", rutaArchivo: ");
		result.append(rutaArchivo);
		result.append(')');
		return result.toString();
	}

} //TemplateImpl
