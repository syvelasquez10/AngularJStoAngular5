/**
 */
package angularjs.impl;

import angularjs.AngularjsPackage;
import angularjs.Controller;
import angularjs.Modulo;
import angularjs.Parametro;
import angularjs.Service;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modulo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link angularjs.impl.ModuloImpl#getParametros <em>Parametros</em>}</li>
 *   <li>{@link angularjs.impl.ModuloImpl#getServices <em>Services</em>}</li>
 *   <li>{@link angularjs.impl.ModuloImpl#getController <em>Controller</em>}</li>
 *   <li>{@link angularjs.impl.ModuloImpl#getModulos <em>Modulos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuloImpl extends ObjetoJavaScriptImpl implements Modulo {
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
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

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
	 * The cached value of the '{@link #getModulos() <em>Modulos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulos()
	 * @generated
	 * @ordered
	 */
	protected EList<Modulo> modulos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuloImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AngularjsPackage.Literals.MODULO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parametro> getParametros() {
		if (parametros == null) {
			parametros = new EObjectContainmentEList<Parametro>(Parametro.class, this, AngularjsPackage.MODULO__PARAMETROS);
		}
		return parametros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, AngularjsPackage.MODULO__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Controller> getController() {
		if (controller == null) {
			controller = new EObjectContainmentEList<Controller>(Controller.class, this, AngularjsPackage.MODULO__CONTROLLER);
		}
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modulo> getModulos() {
		if (modulos == null) {
			modulos = new EObjectResolvingEList<Modulo>(Modulo.class, this, AngularjsPackage.MODULO__MODULOS);
		}
		return modulos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AngularjsPackage.MODULO__PARAMETROS:
				return ((InternalEList<?>)getParametros()).basicRemove(otherEnd, msgs);
			case AngularjsPackage.MODULO__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case AngularjsPackage.MODULO__CONTROLLER:
				return ((InternalEList<?>)getController()).basicRemove(otherEnd, msgs);
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
			case AngularjsPackage.MODULO__PARAMETROS:
				return getParametros();
			case AngularjsPackage.MODULO__SERVICES:
				return getServices();
			case AngularjsPackage.MODULO__CONTROLLER:
				return getController();
			case AngularjsPackage.MODULO__MODULOS:
				return getModulos();
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
			case AngularjsPackage.MODULO__PARAMETROS:
				getParametros().clear();
				getParametros().addAll((Collection<? extends Parametro>)newValue);
				return;
			case AngularjsPackage.MODULO__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case AngularjsPackage.MODULO__CONTROLLER:
				getController().clear();
				getController().addAll((Collection<? extends Controller>)newValue);
				return;
			case AngularjsPackage.MODULO__MODULOS:
				getModulos().clear();
				getModulos().addAll((Collection<? extends Modulo>)newValue);
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
			case AngularjsPackage.MODULO__PARAMETROS:
				getParametros().clear();
				return;
			case AngularjsPackage.MODULO__SERVICES:
				getServices().clear();
				return;
			case AngularjsPackage.MODULO__CONTROLLER:
				getController().clear();
				return;
			case AngularjsPackage.MODULO__MODULOS:
				getModulos().clear();
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
			case AngularjsPackage.MODULO__PARAMETROS:
				return parametros != null && !parametros.isEmpty();
			case AngularjsPackage.MODULO__SERVICES:
				return services != null && !services.isEmpty();
			case AngularjsPackage.MODULO__CONTROLLER:
				return controller != null && !controller.isEmpty();
			case AngularjsPackage.MODULO__MODULOS:
				return modulos != null && !modulos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuloImpl
