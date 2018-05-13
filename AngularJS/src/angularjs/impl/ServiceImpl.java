/**
 */
package angularjs.impl;

import angularjs.AngularjsPackage;
import angularjs.Funcion;
import angularjs.ObjetoAngular;
import angularjs.Parametro;
import angularjs.Service;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link angularjs.impl.ServiceImpl#getFuncion <em>Funcion</em>}</li>
 *   <li>{@link angularjs.impl.ServiceImpl#getParametros <em>Parametros</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends ObjetoAngularImpl implements Service {
	/**
	 * The cached value of the '{@link #getFuncion() <em>Funcion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncion()
	 * @generated
	 * @ordered
	 */
	protected Funcion funcion;

	/**
	 * The cached value of the '{@link #getParametros() <em>Parametros</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametros()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjetoAngular> parametros;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AngularjsPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Funcion getFuncion() {
		return funcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuncion(Funcion newFuncion, NotificationChain msgs) {
		Funcion oldFuncion = funcion;
		funcion = newFuncion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AngularjsPackage.SERVICE__FUNCION, oldFuncion, newFuncion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuncion(Funcion newFuncion) {
		if (newFuncion != funcion) {
			NotificationChain msgs = null;
			if (funcion != null)
				msgs = ((InternalEObject)funcion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AngularjsPackage.SERVICE__FUNCION, null, msgs);
			if (newFuncion != null)
				msgs = ((InternalEObject)newFuncion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AngularjsPackage.SERVICE__FUNCION, null, msgs);
			msgs = basicSetFuncion(newFuncion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AngularjsPackage.SERVICE__FUNCION, newFuncion, newFuncion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjetoAngular> getParametros() {
		if (parametros == null) {
			parametros = new EObjectResolvingEList<ObjetoAngular>(ObjetoAngular.class, this, AngularjsPackage.SERVICE__PARAMETROS);
		}
		return parametros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AngularjsPackage.SERVICE__FUNCION:
				return basicSetFuncion(null, msgs);
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
			case AngularjsPackage.SERVICE__FUNCION:
				return getFuncion();
			case AngularjsPackage.SERVICE__PARAMETROS:
				return getParametros();
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
			case AngularjsPackage.SERVICE__FUNCION:
				setFuncion((Funcion)newValue);
				return;
			case AngularjsPackage.SERVICE__PARAMETROS:
				getParametros().clear();
				getParametros().addAll((Collection<? extends ObjetoAngular>)newValue);
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
			case AngularjsPackage.SERVICE__FUNCION:
				setFuncion((Funcion)null);
				return;
			case AngularjsPackage.SERVICE__PARAMETROS:
				getParametros().clear();
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
			case AngularjsPackage.SERVICE__FUNCION:
				return funcion != null;
			case AngularjsPackage.SERVICE__PARAMETROS:
				return parametros != null && !parametros.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceImpl
