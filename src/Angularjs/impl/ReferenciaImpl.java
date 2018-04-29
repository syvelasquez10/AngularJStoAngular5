/**
 */
package Angularjs.impl;

import Angularjs.AngularjsPackage;
import Angularjs.ObjetoJavaScript;
import Angularjs.Referencia;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referencia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Angularjs.impl.ReferenciaImpl#getObjeto <em>Objeto</em>}</li>
 *   <li>{@link Angularjs.impl.ReferenciaImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenciaImpl extends MinimalEObjectImpl.Container implements Referencia {
	/**
	 * The cached value of the '{@link #getObjeto() <em>Objeto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjeto()
	 * @generated
	 * @ordered
	 */
	protected ObjetoJavaScript objeto;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenciaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AngularjsPackage.Literals.REFERENCIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjetoJavaScript getObjeto() {
		if (objeto != null && objeto.eIsProxy()) {
			InternalEObject oldObjeto = (InternalEObject)objeto;
			objeto = (ObjetoJavaScript)eResolveProxy(oldObjeto);
			if (objeto != oldObjeto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AngularjsPackage.REFERENCIA__OBJETO, oldObjeto, objeto));
			}
		}
		return objeto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjetoJavaScript basicGetObjeto() {
		return objeto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjeto(ObjetoJavaScript newObjeto) {
		ObjetoJavaScript oldObjeto = objeto;
		objeto = newObjeto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AngularjsPackage.REFERENCIA__OBJETO, oldObjeto, objeto));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AngularjsPackage.REFERENCIA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AngularjsPackage.REFERENCIA__OBJETO:
				if (resolve) return getObjeto();
				return basicGetObjeto();
			case AngularjsPackage.REFERENCIA__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AngularjsPackage.REFERENCIA__OBJETO:
				setObjeto((ObjetoJavaScript)newValue);
				return;
			case AngularjsPackage.REFERENCIA__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AngularjsPackage.REFERENCIA__OBJETO:
				setObjeto((ObjetoJavaScript)null);
				return;
			case AngularjsPackage.REFERENCIA__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AngularjsPackage.REFERENCIA__OBJETO:
				return objeto != null;
			case AngularjsPackage.REFERENCIA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ReferenciaImpl
