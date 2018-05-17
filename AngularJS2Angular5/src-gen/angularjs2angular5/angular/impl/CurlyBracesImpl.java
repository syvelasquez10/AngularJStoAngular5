/**
 */
package angularjs2angular5.angular.impl;

import angularjs2angular5.angular.AngularPackage;
import angularjs2angular5.angular.CurlyBraces;
import angularjs2angular5.angular.Expresion;
import angularjs2angular5.angular.Filtro;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curly Braces</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link angularjs2angular5.angular.impl.CurlyBracesImpl#getExpresion <em>Expresion</em>}</li>
 *   <li>{@link angularjs2angular5.angular.impl.CurlyBracesImpl#getFiltro <em>Filtro</em>}</li>
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
	 * The cached value of the '{@link #getFiltro() <em>Filtro</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltro()
	 * @generated
	 * @ordered
	 */
	protected Filtro filtro;

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
		return AngularPackage.Literals.CURLY_BRACES;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AngularPackage.CURLY_BRACES__EXPRESION, oldExpresion, newExpresion);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
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
				msgs = ((InternalEObject) expresion).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AngularPackage.CURLY_BRACES__EXPRESION, null, msgs);
			if (newExpresion != null)
				msgs = ((InternalEObject) newExpresion).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AngularPackage.CURLY_BRACES__EXPRESION, null, msgs);
			msgs = basicSetExpresion(newExpresion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AngularPackage.CURLY_BRACES__EXPRESION, newExpresion,
					newExpresion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filtro getFiltro() {
		return filtro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFiltro(Filtro newFiltro, NotificationChain msgs) {
		Filtro oldFiltro = filtro;
		filtro = newFiltro;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AngularPackage.CURLY_BRACES__FILTRO, oldFiltro, newFiltro);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiltro(Filtro newFiltro) {
		if (newFiltro != filtro) {
			NotificationChain msgs = null;
			if (filtro != null)
				msgs = ((InternalEObject) filtro).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AngularPackage.CURLY_BRACES__FILTRO, null, msgs);
			if (newFiltro != null)
				msgs = ((InternalEObject) newFiltro).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AngularPackage.CURLY_BRACES__FILTRO, null, msgs);
			msgs = basicSetFiltro(newFiltro, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AngularPackage.CURLY_BRACES__FILTRO, newFiltro,
					newFiltro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AngularPackage.CURLY_BRACES__EXPRESION:
			return basicSetExpresion(null, msgs);
		case AngularPackage.CURLY_BRACES__FILTRO:
			return basicSetFiltro(null, msgs);
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
		case AngularPackage.CURLY_BRACES__EXPRESION:
			return getExpresion();
		case AngularPackage.CURLY_BRACES__FILTRO:
			return getFiltro();
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
		case AngularPackage.CURLY_BRACES__EXPRESION:
			setExpresion((Expresion) newValue);
			return;
		case AngularPackage.CURLY_BRACES__FILTRO:
			setFiltro((Filtro) newValue);
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
		case AngularPackage.CURLY_BRACES__EXPRESION:
			setExpresion((Expresion) null);
			return;
		case AngularPackage.CURLY_BRACES__FILTRO:
			setFiltro((Filtro) null);
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
		case AngularPackage.CURLY_BRACES__EXPRESION:
			return expresion != null;
		case AngularPackage.CURLY_BRACES__FILTRO:
			return filtro != null;
		}
		return super.eIsSet(featureID);
	}

} //CurlyBracesImpl
