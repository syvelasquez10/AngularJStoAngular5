/**
 */
package angularjs.impl;

import angularjs.AngularjsPackage;
import angularjs.CurlyBraces;
import angularjs.Directiva;
import angularjs.Propiedad;
import angularjs.SentenciaHTML;

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
 * An implementation of the model object '<em><b>Sentencia HTML</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link angularjs.impl.SentenciaHTMLImpl#getSentenciashtml <em>Sentenciashtml</em>}</li>
 *   <li>{@link angularjs.impl.SentenciaHTMLImpl#getName <em>Name</em>}</li>
 *   <li>{@link angularjs.impl.SentenciaHTMLImpl#getPropiedades <em>Propiedades</em>}</li>
 *   <li>{@link angularjs.impl.SentenciaHTMLImpl#getCurlybraces <em>Curlybraces</em>}</li>
 *   <li>{@link angularjs.impl.SentenciaHTMLImpl#getDirectivas <em>Directivas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SentenciaHTMLImpl extends MinimalEObjectImpl.Container implements SentenciaHTML {
	/**
	 * The cached value of the '{@link #getSentenciashtml() <em>Sentenciashtml</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentenciashtml()
	 * @generated
	 * @ordered
	 */
	protected EList<SentenciaHTML> sentenciashtml;

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
	 * The cached value of the '{@link #getCurlybraces() <em>Curlybraces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurlybraces()
	 * @generated
	 * @ordered
	 */
	protected EList<CurlyBraces> curlybraces;

	/**
	 * The cached value of the '{@link #getDirectivas() <em>Directivas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectivas()
	 * @generated
	 * @ordered
	 */
	protected EList<Directiva> directivas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SentenciaHTMLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AngularjsPackage.Literals.SENTENCIA_HTML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SentenciaHTML> getSentenciashtml() {
		if (sentenciashtml == null) {
			sentenciashtml = new EObjectResolvingEList<SentenciaHTML>(SentenciaHTML.class, this, AngularjsPackage.SENTENCIA_HTML__SENTENCIASHTML);
		}
		return sentenciashtml;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AngularjsPackage.SENTENCIA_HTML__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Propiedad> getPropiedades() {
		if (propiedades == null) {
			propiedades = new EObjectContainmentEList<Propiedad>(Propiedad.class, this, AngularjsPackage.SENTENCIA_HTML__PROPIEDADES);
		}
		return propiedades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Directiva> getDirectivas() {
		if (directivas == null) {
			directivas = new EObjectContainmentEList<Directiva>(Directiva.class, this, AngularjsPackage.SENTENCIA_HTML__DIRECTIVAS);
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
			curlybraces = new EObjectContainmentEList<CurlyBraces>(CurlyBraces.class, this, AngularjsPackage.SENTENCIA_HTML__CURLYBRACES);
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
			case AngularjsPackage.SENTENCIA_HTML__PROPIEDADES:
				return ((InternalEList<?>)getPropiedades()).basicRemove(otherEnd, msgs);
			case AngularjsPackage.SENTENCIA_HTML__CURLYBRACES:
				return ((InternalEList<?>)getCurlybraces()).basicRemove(otherEnd, msgs);
			case AngularjsPackage.SENTENCIA_HTML__DIRECTIVAS:
				return ((InternalEList<?>)getDirectivas()).basicRemove(otherEnd, msgs);
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
			case AngularjsPackage.SENTENCIA_HTML__SENTENCIASHTML:
				return getSentenciashtml();
			case AngularjsPackage.SENTENCIA_HTML__NAME:
				return getName();
			case AngularjsPackage.SENTENCIA_HTML__PROPIEDADES:
				return getPropiedades();
			case AngularjsPackage.SENTENCIA_HTML__CURLYBRACES:
				return getCurlybraces();
			case AngularjsPackage.SENTENCIA_HTML__DIRECTIVAS:
				return getDirectivas();
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
			case AngularjsPackage.SENTENCIA_HTML__SENTENCIASHTML:
				getSentenciashtml().clear();
				getSentenciashtml().addAll((Collection<? extends SentenciaHTML>)newValue);
				return;
			case AngularjsPackage.SENTENCIA_HTML__NAME:
				setName((String)newValue);
				return;
			case AngularjsPackage.SENTENCIA_HTML__PROPIEDADES:
				getPropiedades().clear();
				getPropiedades().addAll((Collection<? extends Propiedad>)newValue);
				return;
			case AngularjsPackage.SENTENCIA_HTML__CURLYBRACES:
				getCurlybraces().clear();
				getCurlybraces().addAll((Collection<? extends CurlyBraces>)newValue);
				return;
			case AngularjsPackage.SENTENCIA_HTML__DIRECTIVAS:
				getDirectivas().clear();
				getDirectivas().addAll((Collection<? extends Directiva>)newValue);
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
			case AngularjsPackage.SENTENCIA_HTML__SENTENCIASHTML:
				getSentenciashtml().clear();
				return;
			case AngularjsPackage.SENTENCIA_HTML__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AngularjsPackage.SENTENCIA_HTML__PROPIEDADES:
				getPropiedades().clear();
				return;
			case AngularjsPackage.SENTENCIA_HTML__CURLYBRACES:
				getCurlybraces().clear();
				return;
			case AngularjsPackage.SENTENCIA_HTML__DIRECTIVAS:
				getDirectivas().clear();
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
			case AngularjsPackage.SENTENCIA_HTML__SENTENCIASHTML:
				return sentenciashtml != null && !sentenciashtml.isEmpty();
			case AngularjsPackage.SENTENCIA_HTML__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AngularjsPackage.SENTENCIA_HTML__PROPIEDADES:
				return propiedades != null && !propiedades.isEmpty();
			case AngularjsPackage.SENTENCIA_HTML__CURLYBRACES:
				return curlybraces != null && !curlybraces.isEmpty();
			case AngularjsPackage.SENTENCIA_HTML__DIRECTIVAS:
				return directivas != null && !directivas.isEmpty();
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

} //SentenciaHTMLImpl
