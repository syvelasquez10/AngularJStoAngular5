/**
 */
package Angularjs.html.impl;

import Angularjs.html.CurlyBraces;
import Angularjs.html.Expresion;
import Angularjs.html.Filtro;
import Angularjs.html.HtmlPackage;

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
 * An implementation of the model object '<em><b>Curly Braces</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Angularjs.html.impl.CurlyBracesImpl#getExpresion <em>Expresion</em>}</li>
 *   <li>{@link Angularjs.html.impl.CurlyBracesImpl#getFiltro <em>Filtro</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurlyBracesImpl extends MinimalEObjectImpl.Container implements CurlyBraces {
	/**
	 * The cached value of the '{@link #getExpresion() <em>Expresion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpresion()
	 * @generated
	 * @ordered
	 */
	protected Expresion expresion;

	/**
	 * The cached value of the '{@link #getFiltro() <em>Filtro</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltro()
	 * @generated
	 * @ordered
	 */
	protected EList<Filtro> filtro;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurlyBracesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.CURLY_BRACES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expresion getExpresion() {
		return expresion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpresion(Expresion newExpresion, NotificationChain msgs) {
		Expresion oldExpresion = expresion;
		expresion = newExpresion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HtmlPackage.CURLY_BRACES__EXPRESION, oldExpresion, newExpresion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpresion(Expresion newExpresion) {
		if (newExpresion != expresion) {
			NotificationChain msgs = null;
			if (expresion != null)
				msgs = ((InternalEObject)expresion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HtmlPackage.CURLY_BRACES__EXPRESION, null, msgs);
			if (newExpresion != null)
				msgs = ((InternalEObject)newExpresion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HtmlPackage.CURLY_BRACES__EXPRESION, null, msgs);
			msgs = basicSetExpresion(newExpresion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.CURLY_BRACES__EXPRESION, newExpresion, newExpresion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filtro> getFiltro() {
		if (filtro == null) {
			filtro = new EObjectContainmentEList<Filtro>(Filtro.class, this, HtmlPackage.CURLY_BRACES__FILTRO);
		}
		return filtro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlPackage.CURLY_BRACES__EXPRESION:
				return basicSetExpresion(null, msgs);
			case HtmlPackage.CURLY_BRACES__FILTRO:
				return ((InternalEList<?>)getFiltro()).basicRemove(otherEnd, msgs);
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
			case HtmlPackage.CURLY_BRACES__EXPRESION:
				return getExpresion();
			case HtmlPackage.CURLY_BRACES__FILTRO:
				return getFiltro();
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
			case HtmlPackage.CURLY_BRACES__EXPRESION:
				setExpresion((Expresion)newValue);
				return;
			case HtmlPackage.CURLY_BRACES__FILTRO:
				getFiltro().clear();
				getFiltro().addAll((Collection<? extends Filtro>)newValue);
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
			case HtmlPackage.CURLY_BRACES__EXPRESION:
				setExpresion((Expresion)null);
				return;
			case HtmlPackage.CURLY_BRACES__FILTRO:
				getFiltro().clear();
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
			case HtmlPackage.CURLY_BRACES__EXPRESION:
				return expresion != null;
			case HtmlPackage.CURLY_BRACES__FILTRO:
				return filtro != null && !filtro.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CurlyBracesImpl
