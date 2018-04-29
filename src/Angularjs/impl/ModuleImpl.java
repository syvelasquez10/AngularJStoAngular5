/**
 */
package Angularjs.impl;

import Angularjs.AngularjsPackage;
import Angularjs.Controller;
import Angularjs.Module;
import Angularjs.Parametro;
import Angularjs.Service;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Angularjs.impl.ModuleImpl#getController <em>Controller</em>}</li>
 *   <li>{@link Angularjs.impl.ModuleImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link Angularjs.impl.ModuleImpl#getServices <em>Services</em>}</li>
 *   <li>{@link Angularjs.impl.ModuleImpl#getParametros <em>Parametros</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends ObjetoJavaScriptImpl implements Module {
	/**
	 * The cached value of the '{@link #getController() <em>Controller</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller> controller;

	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<Module> modules;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getParametros() <em>Parametros</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametros()
	 * @generated
	 * @ordered
	 */
	protected EList<Parametro> parametros;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AngularjsPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Controller> getController() {
		if (controller == null) {
			controller = new EObjectContainmentEList<Controller>(Controller.class, this, AngularjsPackage.MODULE__CONTROLLER);
		}
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Module> getModules() {
		if (modules == null) {
			modules = new EObjectResolvingEList<Module>(Module.class, this, AngularjsPackage.MODULE__MODULES);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, AngularjsPackage.MODULE__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parametro> getParametros() {
		if (parametros == null) {
			parametros = new EObjectContainmentEList<Parametro>(Parametro.class, this, AngularjsPackage.MODULE__PARAMETROS);
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
			case AngularjsPackage.MODULE__CONTROLLER:
				return ((InternalEList<?>)getController()).basicRemove(otherEnd, msgs);
			case AngularjsPackage.MODULE__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case AngularjsPackage.MODULE__PARAMETROS:
				return ((InternalEList<?>)getParametros()).basicRemove(otherEnd, msgs);
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
			case AngularjsPackage.MODULE__CONTROLLER:
				return getController();
			case AngularjsPackage.MODULE__MODULES:
				return getModules();
			case AngularjsPackage.MODULE__SERVICES:
				return getServices();
			case AngularjsPackage.MODULE__PARAMETROS:
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
			case AngularjsPackage.MODULE__CONTROLLER:
				getController().clear();
				getController().addAll((Collection<? extends Controller>)newValue);
				return;
			case AngularjsPackage.MODULE__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends Module>)newValue);
				return;
			case AngularjsPackage.MODULE__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case AngularjsPackage.MODULE__PARAMETROS:
				getParametros().clear();
				getParametros().addAll((Collection<? extends Parametro>)newValue);
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
			case AngularjsPackage.MODULE__CONTROLLER:
				getController().clear();
				return;
			case AngularjsPackage.MODULE__MODULES:
				getModules().clear();
				return;
			case AngularjsPackage.MODULE__SERVICES:
				getServices().clear();
				return;
			case AngularjsPackage.MODULE__PARAMETROS:
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
			case AngularjsPackage.MODULE__CONTROLLER:
				return controller != null && !controller.isEmpty();
			case AngularjsPackage.MODULE__MODULES:
				return modules != null && !modules.isEmpty();
			case AngularjsPackage.MODULE__SERVICES:
				return services != null && !services.isEmpty();
			case AngularjsPackage.MODULE__PARAMETROS:
				return parametros != null && !parametros.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleImpl
