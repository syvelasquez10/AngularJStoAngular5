/**
 */
package Angularjs.impl;

import Angularjs.AngularjsPackage;
import Angularjs.MarkUp;
import Angularjs.Propiedad;
import Angularjs.SetenciaHTML;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setencia HTML</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Angularjs.impl.SetenciaHTMLImpl#getMarkup <em>Markup</em>}</li>
 *   <li>{@link Angularjs.impl.SetenciaHTMLImpl#getSetenciahtml <em>Setenciahtml</em>}</li>
 *   <li>{@link Angularjs.impl.SetenciaHTMLImpl#getName <em>Name</em>}</li>
 *   <li>{@link Angularjs.impl.SetenciaHTMLImpl#getPropiedades <em>Propiedades</em>}</li>
 *   <li>{@link Angularjs.impl.SetenciaHTMLImpl#isSelfClosing <em>Self Closing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetenciaHTMLImpl extends MinimalEObjectImpl.Container implements SetenciaHTML {
	/**
	 * The cached value of the '{@link #getMarkup() <em>Markup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkup()
	 * @generated
	 * @ordered
	 */
	protected EList markup;

	/**
	 * The cached value of the '{@link #getSetenciahtml() <em>Setenciahtml</em>}' reference list.
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
	 * The cached value of the '{@link #getPropiedades() <em>Propiedades</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropiedades()
	 * @generated
	 * @ordered
	 */
	protected EList propiedades;

	/**
	 * The default value of the '{@link #isSelfClosing() <em>Self Closing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelfClosing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELF_CLOSING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelfClosing() <em>Self Closing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelfClosing()
	 * @generated
	 * @ordered
	 */
	protected boolean selfClosing = SELF_CLOSING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetenciaHTMLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AngularjsPackage.Literals.SETENCIA_HTML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMarkup() {
		if (markup == null) {
			markup = new EObjectContainmentEList(MarkUp.class, this, AngularjsPackage.SETENCIA_HTML__MARKUP);
		}
		return markup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSetenciahtml() {
		if (setenciahtml == null) {
			setenciahtml = new EObjectResolvingEList(SetenciaHTML.class, this, AngularjsPackage.SETENCIA_HTML__SETENCIAHTML);
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
			eNotify(new ENotificationImpl(this, Notification.SET, AngularjsPackage.SETENCIA_HTML__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPropiedades() {
		if (propiedades == null) {
			propiedades = new EObjectContainmentEList(Propiedad.class, this, AngularjsPackage.SETENCIA_HTML__PROPIEDADES);
		}
		return propiedades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelfClosing() {
		return selfClosing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfClosing(boolean newSelfClosing) {
		boolean oldSelfClosing = selfClosing;
		selfClosing = newSelfClosing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AngularjsPackage.SETENCIA_HTML__SELF_CLOSING, oldSelfClosing, selfClosing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AngularjsPackage.SETENCIA_HTML__MARKUP:
				return ((InternalEList)getMarkup()).basicRemove(otherEnd, msgs);
			case AngularjsPackage.SETENCIA_HTML__PROPIEDADES:
				return ((InternalEList)getPropiedades()).basicRemove(otherEnd, msgs);
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
			case AngularjsPackage.SETENCIA_HTML__MARKUP:
				return getMarkup();
			case AngularjsPackage.SETENCIA_HTML__SETENCIAHTML:
				return getSetenciahtml();
			case AngularjsPackage.SETENCIA_HTML__NAME:
				return getName();
			case AngularjsPackage.SETENCIA_HTML__PROPIEDADES:
				return getPropiedades();
			case AngularjsPackage.SETENCIA_HTML__SELF_CLOSING:
				return isSelfClosing() ? Boolean.TRUE : Boolean.FALSE;
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
			case AngularjsPackage.SETENCIA_HTML__MARKUP:
				getMarkup().clear();
				getMarkup().addAll((Collection)newValue);
				return;
			case AngularjsPackage.SETENCIA_HTML__SETENCIAHTML:
				getSetenciahtml().clear();
				getSetenciahtml().addAll((Collection)newValue);
				return;
			case AngularjsPackage.SETENCIA_HTML__NAME:
				setName((String)newValue);
				return;
			case AngularjsPackage.SETENCIA_HTML__PROPIEDADES:
				getPropiedades().clear();
				getPropiedades().addAll((Collection)newValue);
				return;
			case AngularjsPackage.SETENCIA_HTML__SELF_CLOSING:
				setSelfClosing(((Boolean)newValue).booleanValue());
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
			case AngularjsPackage.SETENCIA_HTML__MARKUP:
				getMarkup().clear();
				return;
			case AngularjsPackage.SETENCIA_HTML__SETENCIAHTML:
				getSetenciahtml().clear();
				return;
			case AngularjsPackage.SETENCIA_HTML__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AngularjsPackage.SETENCIA_HTML__PROPIEDADES:
				getPropiedades().clear();
				return;
			case AngularjsPackage.SETENCIA_HTML__SELF_CLOSING:
				setSelfClosing(SELF_CLOSING_EDEFAULT);
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
			case AngularjsPackage.SETENCIA_HTML__MARKUP:
				return markup != null && !markup.isEmpty();
			case AngularjsPackage.SETENCIA_HTML__SETENCIAHTML:
				return setenciahtml != null && !setenciahtml.isEmpty();
			case AngularjsPackage.SETENCIA_HTML__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AngularjsPackage.SETENCIA_HTML__PROPIEDADES:
				return propiedades != null && !propiedades.isEmpty();
			case AngularjsPackage.SETENCIA_HTML__SELF_CLOSING:
				return selfClosing != SELF_CLOSING_EDEFAULT;
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
		result.append(", selfClosing: ");
		result.append(selfClosing);
		result.append(')');
		return result.toString();
	}

} //SetenciaHTMLImpl
