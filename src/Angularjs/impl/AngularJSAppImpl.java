/**
 */
package Angularjs.impl;

import Angularjs.AngularJSApp;
import Angularjs.AngularjsPackage;
import Angularjs.Module;
import Angularjs.Parametro;
import Angularjs.Template;

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
 * An implementation of the model object '<em><b>Angular JS App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Angularjs.impl.AngularJSAppImpl#getTemplates <em>Templates</em>}</li>
 *   <li>{@link Angularjs.impl.AngularJSAppImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link Angularjs.impl.AngularJSAppImpl#getName <em>Name</em>}</li>
 *   <li>{@link Angularjs.impl.AngularJSAppImpl#getParametros <em>Parametros</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngularJSAppImpl extends MinimalEObjectImpl.Container implements AngularJSApp {
	/**
	 * The cached value of the '{@link #getTemplates() <em>Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList templates;

	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList modules;

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
	 * The cached value of the '{@link #getParametros() <em>Parametros</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametros()
	 * @generated
	 * @ordered
	 */
	protected EList parametros;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngularJSAppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AngularjsPackage.Literals.ANGULAR_JS_APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTemplates() {
		if (templates == null) {
			templates = new EObjectContainmentEList(Template.class, this, AngularjsPackage.ANGULAR_JS_APP__TEMPLATES);
		}
		return templates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getModules() {
		if (modules == null) {
			modules = new EObjectContainmentEList(Module.class, this, AngularjsPackage.ANGULAR_JS_APP__MODULES);
		}
		return modules;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AngularjsPackage.ANGULAR_JS_APP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParametros() {
		if (parametros == null) {
			parametros = new EObjectContainmentEList(Parametro.class, this, AngularjsPackage.ANGULAR_JS_APP__PARAMETROS);
		}
		return parametros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AngularjsPackage.ANGULAR_JS_APP__TEMPLATES:
				return ((InternalEList)getTemplates()).basicRemove(otherEnd, msgs);
			case AngularjsPackage.ANGULAR_JS_APP__MODULES:
				return ((InternalEList)getModules()).basicRemove(otherEnd, msgs);
			case AngularjsPackage.ANGULAR_JS_APP__PARAMETROS:
				return ((InternalEList)getParametros()).basicRemove(otherEnd, msgs);
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
			case AngularjsPackage.ANGULAR_JS_APP__TEMPLATES:
				return getTemplates();
			case AngularjsPackage.ANGULAR_JS_APP__MODULES:
				return getModules();
			case AngularjsPackage.ANGULAR_JS_APP__NAME:
				return getName();
			case AngularjsPackage.ANGULAR_JS_APP__PARAMETROS:
				return getParametros();
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
			case AngularjsPackage.ANGULAR_JS_APP__TEMPLATES:
				getTemplates().clear();
				getTemplates().addAll((Collection)newValue);
				return;
			case AngularjsPackage.ANGULAR_JS_APP__MODULES:
				getModules().clear();
				getModules().addAll((Collection)newValue);
				return;
			case AngularjsPackage.ANGULAR_JS_APP__NAME:
				setName((String)newValue);
				return;
			case AngularjsPackage.ANGULAR_JS_APP__PARAMETROS:
				getParametros().clear();
				getParametros().addAll((Collection)newValue);
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
			case AngularjsPackage.ANGULAR_JS_APP__TEMPLATES:
				getTemplates().clear();
				return;
			case AngularjsPackage.ANGULAR_JS_APP__MODULES:
				getModules().clear();
				return;
			case AngularjsPackage.ANGULAR_JS_APP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AngularjsPackage.ANGULAR_JS_APP__PARAMETROS:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AngularjsPackage.ANGULAR_JS_APP__TEMPLATES:
				return templates != null && !templates.isEmpty();
			case AngularjsPackage.ANGULAR_JS_APP__MODULES:
				return modules != null && !modules.isEmpty();
			case AngularjsPackage.ANGULAR_JS_APP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AngularjsPackage.ANGULAR_JS_APP__PARAMETROS:
				return parametros != null && !parametros.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //AngularJSAppImpl
