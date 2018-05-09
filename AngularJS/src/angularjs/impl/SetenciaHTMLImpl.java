/**
 */
package angularjs.impl;

import angularjs.AngularjsPackage;
import angularjs.CurlyBraces;
import angularjs.Directiva;
import angularjs.Propiedad;
import angularjs.SetenciaHTML;

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
 *   <li>{@link angularjs.impl.SetenciaHTMLImpl#getSetenciahtml <em>Setenciahtml</em>}</li>
 *   <li>{@link angularjs.impl.SetenciaHTMLImpl#getName <em>Name</em>}</li>
 *   <li>{@link angularjs.impl.SetenciaHTMLImpl#getPropiedades <em>Propiedades</em>}</li>
 *   <li>{@link angularjs.impl.SetenciaHTMLImpl#isSelfClosing <em>Self Closing</em>}</li>
 *   <li>{@link angularjs.impl.SetenciaHTMLImpl#getDirectivas <em>Directivas</em>}</li>
 *   <li>{@link angularjs.impl.SetenciaHTMLImpl#getCurlybraces <em>Curlybraces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetenciaHTMLImpl extends MinimalEObjectImpl.Container implements SetenciaHTML {
	/**
	 * The cached value of the '{@link #getSetenciahtml() <em>Setenciahtml</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetenciahtml()
	 * @generated
	 * @ordered
	 */
	protected EList<SetenciaHTML> setenciahtml;

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
	protected EList<Propiedad> propiedades;

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
	 * The cached value of the '{@link #getDirectivas() <em>Directivas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectivas()
	 * @generated
	 * @ordered
	 */
	protected EList<Directiva> directivas;

	/**
	 * The cached value of the '{@link #getCurlybraces() <em>Curlybraces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurlybraces()
	 * @generated
	 * @ordered
	 */
	protected EList<CurlyBraces> curlybraces;

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
	@Override
	protected EClass eStaticClass() {
		return AngularjsPackage.Literals.SETENCIA_HTML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetenciaHTML> getSetenciahtml() {
		if (setenciahtml == null) {
			setenciahtml = new EObjectResolvingEList<SetenciaHTML>(SetenciaHTML.class, this, AngularjsPackage.SETENCIA_HTML__SETENCIAHTML);
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
	public EList<Propiedad> getPropiedades() {
		if (propiedades == null) {
			propiedades = new EObjectContainmentEList<Propiedad>(Propiedad.class, this, AngularjsPackage.SETENCIA_HTML__PROPIEDADES);
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
	public EList<Directiva> getDirectivas() {
		if (directivas == null) {
			directivas = new EObjectResolvingEList<Directiva>(Directiva.class, this, AngularjsPackage.SETENCIA_HTML__DIRECTIVAS);
		}
		return directivas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CurlyBraces> getCurlybraces() {
		if (curlybraces == null) {
			curlybraces = new EObjectContainmentEList<CurlyBraces>(CurlyBraces.class, this, AngularjsPackage.SETENCIA_HTML__CURLYBRACES);
		}
		return curlybraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AngularjsPackage.SETENCIA_HTML__PROPIEDADES:
				return ((InternalEList<?>)getPropiedades()).basicRemove(otherEnd, msgs);
			case AngularjsPackage.SETENCIA_HTML__CURLYBRACES:
				return ((InternalEList<?>)getCurlybraces()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AngularjsPackage.SETENCIA_HTML__SETENCIAHTML:
				return getSetenciahtml();
			case AngularjsPackage.SETENCIA_HTML__NAME:
				return getName();
			case AngularjsPackage.SETENCIA_HTML__PROPIEDADES:
				return getPropiedades();
			case AngularjsPackage.SETENCIA_HTML__SELF_CLOSING:
				return isSelfClosing();
			case AngularjsPackage.SETENCIA_HTML__DIRECTIVAS:
				return getDirectivas();
			case AngularjsPackage.SETENCIA_HTML__CURLYBRACES:
				return getCurlybraces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AngularjsPackage.SETENCIA_HTML__SETENCIAHTML:
				getSetenciahtml().clear();
				getSetenciahtml().addAll((Collection<? extends SetenciaHTML>)newValue);
				return;
			case AngularjsPackage.SETENCIA_HTML__NAME:
				setName((String)newValue);
				return;
			case AngularjsPackage.SETENCIA_HTML__PROPIEDADES:
				getPropiedades().clear();
				getPropiedades().addAll((Collection<? extends Propiedad>)newValue);
				return;
			case AngularjsPackage.SETENCIA_HTML__SELF_CLOSING:
				setSelfClosing((Boolean)newValue);
				return;
			case AngularjsPackage.SETENCIA_HTML__DIRECTIVAS:
				getDirectivas().clear();
				getDirectivas().addAll((Collection<? extends Directiva>)newValue);
				return;
			case AngularjsPackage.SETENCIA_HTML__CURLYBRACES:
				getCurlybraces().clear();
				getCurlybraces().addAll((Collection<? extends CurlyBraces>)newValue);
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
			case AngularjsPackage.SETENCIA_HTML__DIRECTIVAS:
				getDirectivas().clear();
				return;
			case AngularjsPackage.SETENCIA_HTML__CURLYBRACES:
				getCurlybraces().clear();
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
			case AngularjsPackage.SETENCIA_HTML__SETENCIAHTML:
				return setenciahtml != null && !setenciahtml.isEmpty();
			case AngularjsPackage.SETENCIA_HTML__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AngularjsPackage.SETENCIA_HTML__PROPIEDADES:
				return propiedades != null && !propiedades.isEmpty();
			case AngularjsPackage.SETENCIA_HTML__SELF_CLOSING:
				return selfClosing != SELF_CLOSING_EDEFAULT;
			case AngularjsPackage.SETENCIA_HTML__DIRECTIVAS:
				return directivas != null && !directivas.isEmpty();
			case AngularjsPackage.SETENCIA_HTML__CURLYBRACES:
				return curlybraces != null && !curlybraces.isEmpty();
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
		result.append(", selfClosing: ");
		result.append(selfClosing);
		result.append(')');
		return result.toString();
	}

} //SetenciaHTMLImpl
