/**
 */
package Angularjs.mvc.impl;

import Angularjs.html.Template;

import Angularjs.mvc.Controller;
import Angularjs.mvc.Funcion;
import Angularjs.mvc.Modelo;
import Angularjs.mvc.MvcPackage;
import Angularjs.mvc.Parametro;
import Angularjs.mvc.Service;
import Angularjs.mvc.Variable;

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
 *   <li>{@link Angularjs.mvc.impl.ControllerImpl#getServices <em>Services</em>}</li>
 *   <li>{@link Angularjs.mvc.impl.ControllerImpl#getFuncion <em>Funcion</em>}</li>
 *   <li>{@link Angularjs.mvc.impl.ControllerImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link Angularjs.mvc.impl.ControllerImpl#getParametros <em>Parametros</em>}</li>
 *   <li>{@link Angularjs.mvc.impl.ControllerImpl#getBody <em>Body</em>}</li>
 *   <li>{@link Angularjs.mvc.impl.ControllerImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link Angularjs.mvc.impl.ControllerImpl#getModelo <em>Modelo</em>}</li>
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
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getFuncion() <em>Funcion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncion()
	 * @generated
	 * @ordered
	 */
	protected EList<Funcion> funcion;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variable;

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
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected Template template;

	/**
	 * The cached value of the '{@link #getModelo() <em>Modelo</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelo()
	 * @generated
	 * @ordered
	 */
	protected EList<Modelo> modelo;

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
	@Override
	protected EClass eStaticClass() {
		return MvcPackage.Literals.CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectResolvingEList<Service>(Service.class, this, MvcPackage.CONTROLLER__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Funcion> getFuncion() {
		if (funcion == null) {
			funcion = new EObjectContainmentEList<Funcion>(Funcion.class, this, MvcPackage.CONTROLLER__FUNCION);
		}
		return funcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentEList<Variable>(Variable.class, this, MvcPackage.CONTROLLER__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parametro> getParametros() {
		if (parametros == null) {
			parametros = new EObjectContainmentEList<Parametro>(Parametro.class, this, MvcPackage.CONTROLLER__PARAMETROS);
		}
		return parametros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.CONTROLLER__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template getTemplate() {
		if (template != null && template.eIsProxy()) {
			InternalEObject oldTemplate = (InternalEObject)template;
			template = (Template)eResolveProxy(oldTemplate);
			if (template != oldTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MvcPackage.CONTROLLER__TEMPLATE, oldTemplate, template));
			}
		}
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template basicGetTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(Template newTemplate) {
		Template oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.CONTROLLER__TEMPLATE, oldTemplate, template));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modelo> getModelo() {
		if (modelo == null) {
			modelo = new EObjectResolvingEList<Modelo>(Modelo.class, this, MvcPackage.CONTROLLER__MODELO);
		}
		return modelo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MvcPackage.CONTROLLER__FUNCION:
				return ((InternalEList<?>)getFuncion()).basicRemove(otherEnd, msgs);
			case MvcPackage.CONTROLLER__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
			case MvcPackage.CONTROLLER__PARAMETROS:
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
			case MvcPackage.CONTROLLER__SERVICES:
				return getServices();
			case MvcPackage.CONTROLLER__FUNCION:
				return getFuncion();
			case MvcPackage.CONTROLLER__VARIABLE:
				return getVariable();
			case MvcPackage.CONTROLLER__PARAMETROS:
				return getParametros();
			case MvcPackage.CONTROLLER__BODY:
				return getBody();
			case MvcPackage.CONTROLLER__TEMPLATE:
				if (resolve) return getTemplate();
				return basicGetTemplate();
			case MvcPackage.CONTROLLER__MODELO:
				return getModelo();
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
			case MvcPackage.CONTROLLER__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case MvcPackage.CONTROLLER__FUNCION:
				getFuncion().clear();
				getFuncion().addAll((Collection<? extends Funcion>)newValue);
				return;
			case MvcPackage.CONTROLLER__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends Variable>)newValue);
				return;
			case MvcPackage.CONTROLLER__PARAMETROS:
				getParametros().clear();
				getParametros().addAll((Collection<? extends Parametro>)newValue);
				return;
			case MvcPackage.CONTROLLER__BODY:
				setBody((String)newValue);
				return;
			case MvcPackage.CONTROLLER__TEMPLATE:
				setTemplate((Template)newValue);
				return;
			case MvcPackage.CONTROLLER__MODELO:
				getModelo().clear();
				getModelo().addAll((Collection<? extends Modelo>)newValue);
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
			case MvcPackage.CONTROLLER__SERVICES:
				getServices().clear();
				return;
			case MvcPackage.CONTROLLER__FUNCION:
				getFuncion().clear();
				return;
			case MvcPackage.CONTROLLER__VARIABLE:
				getVariable().clear();
				return;
			case MvcPackage.CONTROLLER__PARAMETROS:
				getParametros().clear();
				return;
			case MvcPackage.CONTROLLER__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case MvcPackage.CONTROLLER__TEMPLATE:
				setTemplate((Template)null);
				return;
			case MvcPackage.CONTROLLER__MODELO:
				getModelo().clear();
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
			case MvcPackage.CONTROLLER__SERVICES:
				return services != null && !services.isEmpty();
			case MvcPackage.CONTROLLER__FUNCION:
				return funcion != null && !funcion.isEmpty();
			case MvcPackage.CONTROLLER__VARIABLE:
				return variable != null && !variable.isEmpty();
			case MvcPackage.CONTROLLER__PARAMETROS:
				return parametros != null && !parametros.isEmpty();
			case MvcPackage.CONTROLLER__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case MvcPackage.CONTROLLER__TEMPLATE:
				return template != null;
			case MvcPackage.CONTROLLER__MODELO:
				return modelo != null && !modelo.isEmpty();
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
		result.append(" (body: ");
		result.append(body);
		result.append(')');
		return result.toString();
	}

} //ControllerImpl