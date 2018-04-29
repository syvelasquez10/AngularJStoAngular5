/**
 */
package Angularjs.impl;

import Angularjs.AngularjsPackage;
import Angularjs.Controller;
import Angularjs.Funcion;
import Angularjs.Parametro;
import Angularjs.Service;

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
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Angularjs.impl.ControllerImpl#getServices <em>Services</em>}</li>
 *   <li>{@link Angularjs.impl.ControllerImpl#getFuncion <em>Funcion</em>}</li>
 *   <li>{@link Angularjs.impl.ControllerImpl#getParametro <em>Parametro</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerImpl extends ObjetoJavaScriptImpl implements Controller {
	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList services;

	/**
	 * The cached value of the '{@link #getFuncion() <em>Funcion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncion()
	 * @generated
	 * @ordered
	 */
	protected EList funcion;

	/**
	 * The cached value of the '{@link #getParametro() <em>Parametro</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametro()
	 * @generated
	 * @ordered
	 */
	protected Parametro parametro;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AngularjsPackage.Literals.CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getServices() {
		if (services == null) {
			services = new EObjectResolvingEList(Service.class, this, AngularjsPackage.CONTROLLER__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFuncion() {
		if (funcion == null) {
			funcion = new EObjectContainmentEList(Funcion.class, this, AngularjsPackage.CONTROLLER__FUNCION);
		}
		return funcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parametro getParametro() {
		if (parametro != null && parametro.eIsProxy()) {
			InternalEObject oldParametro = (InternalEObject)parametro;
			parametro = (Parametro)eResolveProxy(oldParametro);
			if (parametro != oldParametro) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AngularjsPackage.CONTROLLER__PARAMETRO, oldParametro, parametro));
			}
		}
		return parametro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parametro basicGetParametro() {
		return parametro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParametro(Parametro newParametro) {
		Parametro oldParametro = parametro;
		parametro = newParametro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AngularjsPackage.CONTROLLER__PARAMETRO, oldParametro, parametro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AngularjsPackage.CONTROLLER__FUNCION:
				return ((InternalEList)getFuncion()).basicRemove(otherEnd, msgs);
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
			case AngularjsPackage.CONTROLLER__SERVICES:
				return getServices();
			case AngularjsPackage.CONTROLLER__FUNCION:
				return getFuncion();
			case AngularjsPackage.CONTROLLER__PARAMETRO:
				if (resolve) return getParametro();
				return basicGetParametro();
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
			case AngularjsPackage.CONTROLLER__SERVICES:
				getServices().clear();
				getServices().addAll((Collection)newValue);
				return;
			case AngularjsPackage.CONTROLLER__FUNCION:
				getFuncion().clear();
				getFuncion().addAll((Collection)newValue);
				return;
			case AngularjsPackage.CONTROLLER__PARAMETRO:
				setParametro((Parametro)newValue);
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
			case AngularjsPackage.CONTROLLER__SERVICES:
				getServices().clear();
				return;
			case AngularjsPackage.CONTROLLER__FUNCION:
				getFuncion().clear();
				return;
			case AngularjsPackage.CONTROLLER__PARAMETRO:
				setParametro((Parametro)null);
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
			case AngularjsPackage.CONTROLLER__SERVICES:
				return services != null && !services.isEmpty();
			case AngularjsPackage.CONTROLLER__FUNCION:
				return funcion != null && !funcion.isEmpty();
			case AngularjsPackage.CONTROLLER__PARAMETRO:
				return parametro != null;
		}
		return super.eIsSet(featureID);
	}

} //ControllerImpl
