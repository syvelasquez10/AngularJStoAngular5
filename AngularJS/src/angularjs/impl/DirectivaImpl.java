/**
 */
package angularjs.impl;

import angularjs.AngularjsPackage;
import angularjs.CurlyBraces;
import angularjs.Directiva;
import angularjs.ObjetoAngular;
import angularjs.Referencia;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directiva</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link angularjs.impl.DirectivaImpl#getName <em>Name</em>}</li>
 *   <li>{@link angularjs.impl.DirectivaImpl#getCurlybraces <em>Curlybraces</em>}</li>
 *   <li>{@link angularjs.impl.DirectivaImpl#getReferencia <em>Referencia</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectivaImpl extends MinimalEObjectImpl.Container implements Directiva {
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
	 * The cached value of the '{@link #getCurlybraces() <em>Curlybraces</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurlybraces()
	 * @generated
	 * @ordered
	 */
	protected CurlyBraces curlybraces;

	/**
	 * The cached value of the '{@link #getReferencia() <em>Referencia</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencia()
	 * @generated
	 * @ordered
	 */
	protected ObjetoAngular referencia;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectivaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AngularjsPackage.Literals.DIRECTIVA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AngularjsPackage.DIRECTIVA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurlyBraces getCurlybraces() {
		if (curlybraces != null && curlybraces.eIsProxy()) {
			InternalEObject oldCurlybraces = (InternalEObject)curlybraces;
			curlybraces = (CurlyBraces)eResolveProxy(oldCurlybraces);
			if (curlybraces != oldCurlybraces) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AngularjsPackage.DIRECTIVA__CURLYBRACES, oldCurlybraces, curlybraces));
			}
		}
		return curlybraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurlyBraces basicGetCurlybraces() {
		return curlybraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurlybraces(CurlyBraces newCurlybraces) {
		CurlyBraces oldCurlybraces = curlybraces;
		curlybraces = newCurlybraces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AngularjsPackage.DIRECTIVA__CURLYBRACES, oldCurlybraces, curlybraces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjetoAngular getReferencia() {
		if (referencia != null && referencia.eIsProxy()) {
			InternalEObject oldReferencia = (InternalEObject)referencia;
			referencia = (ObjetoAngular)eResolveProxy(oldReferencia);
			if (referencia != oldReferencia) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AngularjsPackage.DIRECTIVA__REFERENCIA, oldReferencia, referencia));
			}
		}
		return referencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjetoAngular basicGetReferencia() {
		return referencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencia(ObjetoAngular newReferencia) {
		ObjetoAngular oldReferencia = referencia;
		referencia = newReferencia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AngularjsPackage.DIRECTIVA__REFERENCIA, oldReferencia, referencia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AngularjsPackage.DIRECTIVA__NAME:
				return getName();
			case AngularjsPackage.DIRECTIVA__CURLYBRACES:
				if (resolve) return getCurlybraces();
				return basicGetCurlybraces();
			case AngularjsPackage.DIRECTIVA__REFERENCIA:
				if (resolve) return getReferencia();
				return basicGetReferencia();
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
			case AngularjsPackage.DIRECTIVA__NAME:
				setName((String)newValue);
				return;
			case AngularjsPackage.DIRECTIVA__CURLYBRACES:
				setCurlybraces((CurlyBraces)newValue);
				return;
			case AngularjsPackage.DIRECTIVA__REFERENCIA:
				setReferencia((ObjetoAngular)newValue);
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
			case AngularjsPackage.DIRECTIVA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AngularjsPackage.DIRECTIVA__CURLYBRACES:
				setCurlybraces((CurlyBraces)null);
				return;
			case AngularjsPackage.DIRECTIVA__REFERENCIA:
				setReferencia((ObjetoAngular)null);
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
			case AngularjsPackage.DIRECTIVA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AngularjsPackage.DIRECTIVA__CURLYBRACES:
				return curlybraces != null;
			case AngularjsPackage.DIRECTIVA__REFERENCIA:
				return referencia != null;
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

} //DirectivaImpl
