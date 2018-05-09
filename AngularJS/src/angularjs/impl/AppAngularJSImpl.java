/**
 */
package angularjs.impl;

import angularjs.AngularjsPackage;
import angularjs.AppAngularJS;
import angularjs.Modelo;
import angularjs.Modulo;
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
 *   <li>{@link angularjs.impl.AppAngularJSImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link angularjs.impl.AppAngularJSImpl#getModelos <em>Modelos</em>}</li>
 *   <li>{@link angularjs.impl.AppAngularJSImpl#getName <em>Name</em>}</li>
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
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<Template> template;

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
	public EList<Template> getTemplate() {
		if (template == null) {
			template = new EObjectContainmentEList<Template>(Template.class, this, AngularjsPackage.APP_ANGULAR_JS__TEMPLATE);
		}
		return template;
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AngularjsPackage.APP_ANGULAR_JS__MODULOS:
				return ((InternalEList<?>)getModulos()).basicRemove(otherEnd, msgs);
			case AngularjsPackage.APP_ANGULAR_JS__TEMPLATE:
				return ((InternalEList<?>)getTemplate()).basicRemove(otherEnd, msgs);
			case AngularjsPackage.APP_ANGULAR_JS__MODELOS:
				return ((InternalEList<?>)getModelos()).basicRemove(otherEnd, msgs);
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
			case AngularjsPackage.APP_ANGULAR_JS__TEMPLATE:
				return getTemplate();
			case AngularjsPackage.APP_ANGULAR_JS__MODELOS:
				return getModelos();
			case AngularjsPackage.APP_ANGULAR_JS__NAME:
				return getName();
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
			case AngularjsPackage.APP_ANGULAR_JS__TEMPLATE:
				getTemplate().clear();
				getTemplate().addAll((Collection<? extends Template>)newValue);
				return;
			case AngularjsPackage.APP_ANGULAR_JS__MODELOS:
				getModelos().clear();
				getModelos().addAll((Collection<? extends Modelo>)newValue);
				return;
			case AngularjsPackage.APP_ANGULAR_JS__NAME:
				setName((String)newValue);
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
			case AngularjsPackage.APP_ANGULAR_JS__TEMPLATE:
				getTemplate().clear();
				return;
			case AngularjsPackage.APP_ANGULAR_JS__MODELOS:
				getModelos().clear();
				return;
			case AngularjsPackage.APP_ANGULAR_JS__NAME:
				setName(NAME_EDEFAULT);
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
			case AngularjsPackage.APP_ANGULAR_JS__TEMPLATE:
				return template != null && !template.isEmpty();
			case AngularjsPackage.APP_ANGULAR_JS__MODELOS:
				return modelos != null && !modelos.isEmpty();
			case AngularjsPackage.APP_ANGULAR_JS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
