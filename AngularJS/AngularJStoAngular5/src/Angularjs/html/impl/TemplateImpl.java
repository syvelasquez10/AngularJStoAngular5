/**
 */
package Angularjs.html.impl;

import Angularjs.html.Directiva;
import Angularjs.html.HtmlPackage;
import Angularjs.html.SetenciaHTML;
import Angularjs.html.Template;

import Angularjs.mvc.Controller;

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
 * An implementation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Angularjs.html.impl.TemplateImpl#getSetenciahtml <em>Setenciahtml</em>}</li>
 *   <li>{@link Angularjs.html.impl.TemplateImpl#getName <em>Name</em>}</li>
 *   <li>{@link Angularjs.html.impl.TemplateImpl#getRutaArchivo <em>Ruta Archivo</em>}</li>
 *   <li>{@link Angularjs.html.impl.TemplateImpl#getDirectiva <em>Directiva</em>}</li>
 *   <li>{@link Angularjs.html.impl.TemplateImpl#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateImpl extends MinimalEObjectImpl.Container implements Template {
	/**
	 * The cached value of the '{@link #getSetenciahtml() <em>Setenciahtml</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetenciahtml()
	 * @generated
	 * @ordered
	 */
	protected EList<SetenciaHTML> setenciahtml;

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
	 * The default value of the '{@link #getRutaArchivo() <em>Ruta Archivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRutaArchivo()
	 * @generated
	 * @ordered
	 */
	protected static final String RUTA_ARCHIVO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRutaArchivo() <em>Ruta Archivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRutaArchivo()
	 * @generated
	 * @ordered
	 */
	protected String rutaArchivo = RUTA_ARCHIVO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDirectiva() <em>Directiva</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectiva()
	 * @generated
	 * @ordered
	 */
	protected EList<Directiva> directiva;

	/**
	 * The cached value of the '{@link #getController() <em>Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected Controller controller;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetenciaHTML> getSetenciahtml() {
		if (setenciahtml == null) {
			setenciahtml = new EObjectContainmentEList<SetenciaHTML>(SetenciaHTML.class, this, HtmlPackage.TEMPLATE__SETENCIAHTML);
		}
		return setenciahtml;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.TEMPLATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRutaArchivo() {
		return rutaArchivo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRutaArchivo(String newRutaArchivo) {
		String oldRutaArchivo = rutaArchivo;
		rutaArchivo = newRutaArchivo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.TEMPLATE__RUTA_ARCHIVO, oldRutaArchivo, rutaArchivo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Directiva> getDirectiva() {
		if (directiva == null) {
			directiva = new EObjectContainmentEList<Directiva>(Directiva.class, this, HtmlPackage.TEMPLATE__DIRECTIVA);
		}
		return directiva;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller getController() {
		if (controller != null && controller.eIsProxy()) {
			InternalEObject oldController = (InternalEObject)controller;
			controller = (Controller)eResolveProxy(oldController);
			if (controller != oldController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HtmlPackage.TEMPLATE__CONTROLLER, oldController, controller));
			}
		}
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller basicGetController() {
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setController(Controller newController) {
		Controller oldController = controller;
		controller = newController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.TEMPLATE__CONTROLLER, oldController, controller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlPackage.TEMPLATE__SETENCIAHTML:
				return ((InternalEList<?>)getSetenciahtml()).basicRemove(otherEnd, msgs);
			case HtmlPackage.TEMPLATE__DIRECTIVA:
				return ((InternalEList<?>)getDirectiva()).basicRemove(otherEnd, msgs);
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
			case HtmlPackage.TEMPLATE__SETENCIAHTML:
				return getSetenciahtml();
			case HtmlPackage.TEMPLATE__NAME:
				return getName();
			case HtmlPackage.TEMPLATE__RUTA_ARCHIVO:
				return getRutaArchivo();
			case HtmlPackage.TEMPLATE__DIRECTIVA:
				return getDirectiva();
			case HtmlPackage.TEMPLATE__CONTROLLER:
				if (resolve) return getController();
				return basicGetController();
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
			case HtmlPackage.TEMPLATE__SETENCIAHTML:
				getSetenciahtml().clear();
				getSetenciahtml().addAll((Collection<? extends SetenciaHTML>)newValue);
				return;
			case HtmlPackage.TEMPLATE__NAME:
				setName((String)newValue);
				return;
			case HtmlPackage.TEMPLATE__RUTA_ARCHIVO:
				setRutaArchivo((String)newValue);
				return;
			case HtmlPackage.TEMPLATE__DIRECTIVA:
				getDirectiva().clear();
				getDirectiva().addAll((Collection<? extends Directiva>)newValue);
				return;
			case HtmlPackage.TEMPLATE__CONTROLLER:
				setController((Controller)newValue);
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
			case HtmlPackage.TEMPLATE__SETENCIAHTML:
				getSetenciahtml().clear();
				return;
			case HtmlPackage.TEMPLATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HtmlPackage.TEMPLATE__RUTA_ARCHIVO:
				setRutaArchivo(RUTA_ARCHIVO_EDEFAULT);
				return;
			case HtmlPackage.TEMPLATE__DIRECTIVA:
				getDirectiva().clear();
				return;
			case HtmlPackage.TEMPLATE__CONTROLLER:
				setController((Controller)null);
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
			case HtmlPackage.TEMPLATE__SETENCIAHTML:
				return setenciahtml != null && !setenciahtml.isEmpty();
			case HtmlPackage.TEMPLATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HtmlPackage.TEMPLATE__RUTA_ARCHIVO:
				return RUTA_ARCHIVO_EDEFAULT == null ? rutaArchivo != null : !RUTA_ARCHIVO_EDEFAULT.equals(rutaArchivo);
			case HtmlPackage.TEMPLATE__DIRECTIVA:
				return directiva != null && !directiva.isEmpty();
			case HtmlPackage.TEMPLATE__CONTROLLER:
				return controller != null;
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
		result.append(", rutaArchivo: ");
		result.append(rutaArchivo);
		result.append(')');
		return result.toString();
	}

} //TemplateImpl
