/**
 */
package angularjs.impl;

import angularjs.AngularjsPackage;
import angularjs.AppAngularJS;
import angularjs.Componente;
import angularjs.Controller;
import angularjs.Modelo;
import angularjs.Modulo;
import angularjs.Service;
import angularjs.Template;

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
 * An implementation of the model object '<em><b>App Angular JS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link angularjs.impl.AppAngularJSImpl#getModulos <em>Modulos</em>}</li>
 *   <li>{@link angularjs.impl.AppAngularJSImpl#getTemplates <em>Templates</em>}</li>
 *   <li>{@link angularjs.impl.AppAngularJSImpl#getModelos <em>Modelos</em>}</li>
 *   <li>{@link angularjs.impl.AppAngularJSImpl#getName <em>Name</em>}</li>
 *   <li>{@link angularjs.impl.AppAngularJSImpl#getServices <em>Services</em>}</li>
 *   <li>{@link angularjs.impl.AppAngularJSImpl#getComponentes <em>Componentes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppAngularJSImpl extends MinimalEObjectImpl.Container implements AppAngularJS {
	/**
	 * The cached value of the '{@link #getModulos() <em>Modulos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulos()
	 * @generated
	 * @ordered
	 */
	protected EList<Modulo> modulos;

	/**
	 * The cached value of the '{@link #getTemplates() <em>Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<Template> templates;

	/**
	 * The cached value of the '{@link #getModelos() <em>Modelos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelos()
	 * @generated
	 * @ordered
	 */
	protected EList<Modelo> modelos;

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
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getComponentes() <em>Componentes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentes()
	 * @generated
	 * @ordered
	 */
	protected EList<Componente> componentes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppAngularJSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AngularjsPackage.Literals.APP_ANGULAR_JS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modulo> getModulos() {
		if (modulos == null) {
			modulos = new EObjectContainmentEList<Modulo>(Modulo.class, this, AngularjsPackage.APP_ANGULAR_JS__MODULOS);
		}
		return modulos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Template> getTemplates() {
		if (templates == null) {
			templates = new EObjectContainmentEList<Template>(Template.class, this, AngularjsPackage.APP_ANGULAR_JS__TEMPLATES);
		}
		return templates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modelo> getModelos() {
		if (modelos == null) {
			modelos = new EObjectContainmentEList<Modelo>(Modelo.class, this, AngularjsPackage.APP_ANGULAR_JS__MODELOS);
		}
		return modelos;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AngularjsPackage.APP_ANGULAR_JS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, AngularjsPackage.APP_ANGULAR_JS__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Componente> getComponentes() {
		if (componentes == null) {
			componentes = new EObjectContainmentEList<Componente>(Componente.class, this, AngularjsPackage.APP_ANGULAR_JS__COMPONENTES);
		}
		return componentes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AngularjsPackage.APP_ANGULAR_JS__MODULOS:
				return ((InternalEList<?>)getModulos()).basicRemove(otherEnd, msgs);
			case AngularjsPackage.APP_ANGULAR_JS__TEMPLATES:
				return ((InternalEList<?>)getTemplates()).basicRemove(otherEnd, msgs);
			case AngularjsPackage.APP_ANGULAR_JS__MODELOS:
				return ((InternalEList<?>)getModelos()).basicRemove(otherEnd, msgs);
			case AngularjsPackage.APP_ANGULAR_JS__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case AngularjsPackage.APP_ANGULAR_JS__COMPONENTES:
				return ((InternalEList<?>)getComponentes()).basicRemove(otherEnd, msgs);
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
			case AngularjsPackage.APP_ANGULAR_JS__MODULOS:
				return getModulos();
			case AngularjsPackage.APP_ANGULAR_JS__TEMPLATES:
				return getTemplates();
			case AngularjsPackage.APP_ANGULAR_JS__MODELOS:
				return getModelos();
			case AngularjsPackage.APP_ANGULAR_JS__NAME:
				return getName();
			case AngularjsPackage.APP_ANGULAR_JS__SERVICES:
				return getServices();
			case AngularjsPackage.APP_ANGULAR_JS__COMPONENTES:
				return getComponentes();
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
			case AngularjsPackage.APP_ANGULAR_JS__MODULOS:
				getModulos().clear();
				getModulos().addAll((Collection<? extends Modulo>)newValue);
				return;
			case AngularjsPackage.APP_ANGULAR_JS__TEMPLATES:
				getTemplates().clear();
				getTemplates().addAll((Collection<? extends Template>)newValue);
				return;
			case AngularjsPackage.APP_ANGULAR_JS__MODELOS:
				getModelos().clear();
				getModelos().addAll((Collection<? extends Modelo>)newValue);
				return;
			case AngularjsPackage.APP_ANGULAR_JS__NAME:
				setName((String)newValue);
				return;
			case AngularjsPackage.APP_ANGULAR_JS__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case AngularjsPackage.APP_ANGULAR_JS__COMPONENTES:
				getComponentes().clear();
				getComponentes().addAll((Collection<? extends Componente>)newValue);
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
			case AngularjsPackage.APP_ANGULAR_JS__MODULOS:
				getModulos().clear();
				return;
			case AngularjsPackage.APP_ANGULAR_JS__TEMPLATES:
				getTemplates().clear();
				return;
			case AngularjsPackage.APP_ANGULAR_JS__MODELOS:
				getModelos().clear();
				return;
			case AngularjsPackage.APP_ANGULAR_JS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AngularjsPackage.APP_ANGULAR_JS__SERVICES:
				getServices().clear();
				return;
			case AngularjsPackage.APP_ANGULAR_JS__COMPONENTES:
				getComponentes().clear();
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
			case AngularjsPackage.APP_ANGULAR_JS__MODULOS:
				return modulos != null && !modulos.isEmpty();
			case AngularjsPackage.APP_ANGULAR_JS__TEMPLATES:
				return templates != null && !templates.isEmpty();
			case AngularjsPackage.APP_ANGULAR_JS__MODELOS:
				return modelos != null && !modelos.isEmpty();
			case AngularjsPackage.APP_ANGULAR_JS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AngularjsPackage.APP_ANGULAR_JS__SERVICES:
				return services != null && !services.isEmpty();
			case AngularjsPackage.APP_ANGULAR_JS__COMPONENTES:
				return componentes != null && !componentes.isEmpty();
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

} //AppAngularJSImpl
