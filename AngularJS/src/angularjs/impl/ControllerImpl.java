/**
 */
package angularjs.impl;

import angularjs.AngularjsPackage;
import angularjs.Controller;
import angularjs.Funcion;
import angularjs.Modelo;
import angularjs.ObjetoAngular;
import angularjs.Parametro;
import angularjs.Service;
import angularjs.Template;
import angularjs.Variable;

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
 *   <li>{@link angularjs.impl.ControllerImpl#getFunciones <em>Funciones</em>}</li>
 *   <li>{@link angularjs.impl.ControllerImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link angularjs.impl.ControllerImpl#getBody <em>Body</em>}</li>
 *   <li>{@link angularjs.impl.ControllerImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link angularjs.impl.ControllerImpl#getModelo <em>Modelo</em>}</li>
 *   <li>{@link angularjs.impl.ControllerImpl#getParametros <em>Parametros</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerImpl extends ObjetoAngularImpl implements Controller {
	/**
	 * The cached value of the '{@link #getFunciones() <em>Funciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Funcion> funciones;

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
		return AngularjsPackage.Literals.CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Funcion> getFunciones() {
		if (funciones == null) {
			funciones = new EObjectContainmentEList<Funcion>(Funcion.class, this, AngularjsPackage.CONTROLLER__FUNCIONES);
		}
		return funciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentEList<Variable>(Variable.class, this, AngularjsPackage.CONTROLLER__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjetoAngular> getParametros() {
		if (parametros == null) {
			parametros = new EObjectResolvingEList<ObjetoAngular>(ObjetoAngular.class, this, AngularjsPackage.CONTROLLER__PARAMETROS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, AngularjsPackage.CONTROLLER__BODY, oldBody, body));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AngularjsPackage.CONTROLLER__TEMPLATE, oldTemplate, template));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AngularjsPackage.CONTROLLER__TEMPLATE, oldTemplate, template));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modelo> getModelo() {
		if (modelo == null) {
			modelo = new EObjectResolvingEList<Modelo>(Modelo.class, this, AngularjsPackage.CONTROLLER__MODELO);
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
			case AngularjsPackage.CONTROLLER__FUNCIONES:
				return ((InternalEList<?>)getFunciones()).basicRemove(otherEnd, msgs);
			case AngularjsPackage.CONTROLLER__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
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
			case AngularjsPackage.CONTROLLER__FUNCIONES:
				return getFunciones();
			case AngularjsPackage.CONTROLLER__VARIABLE:
				return getVariable();
			case AngularjsPackage.CONTROLLER__BODY:
				return getBody();
			case AngularjsPackage.CONTROLLER__TEMPLATE:
				if (resolve) return getTemplate();
				return basicGetTemplate();
			case AngularjsPackage.CONTROLLER__MODELO:
				return getModelo();
			case AngularjsPackage.CONTROLLER__PARAMETROS:
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
			case AngularjsPackage.CONTROLLER__FUNCIONES:
				getFunciones().clear();
				getFunciones().addAll((Collection<? extends Funcion>)newValue);
				return;
			case AngularjsPackage.CONTROLLER__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends Variable>)newValue);
				return;
			case AngularjsPackage.CONTROLLER__BODY:
				setBody((String)newValue);
				return;
			case AngularjsPackage.CONTROLLER__TEMPLATE:
				setTemplate((Template)newValue);
				return;
			case AngularjsPackage.CONTROLLER__MODELO:
				getModelo().clear();
				getModelo().addAll((Collection<? extends Modelo>)newValue);
				return;
			case AngularjsPackage.CONTROLLER__PARAMETROS:
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
			case AngularjsPackage.CONTROLLER__FUNCIONES:
				getFunciones().clear();
				return;
			case AngularjsPackage.CONTROLLER__VARIABLE:
				getVariable().clear();
				return;
			case AngularjsPackage.CONTROLLER__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case AngularjsPackage.CONTROLLER__TEMPLATE:
				setTemplate((Template)null);
				return;
			case AngularjsPackage.CONTROLLER__MODELO:
				getModelo().clear();
				return;
			case AngularjsPackage.CONTROLLER__PARAMETROS:
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
			case AngularjsPackage.CONTROLLER__FUNCIONES:
				return funciones != null && !funciones.isEmpty();
			case AngularjsPackage.CONTROLLER__VARIABLE:
				return variable != null && !variable.isEmpty();
			case AngularjsPackage.CONTROLLER__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case AngularjsPackage.CONTROLLER__TEMPLATE:
				return template != null;
			case AngularjsPackage.CONTROLLER__MODELO:
				return modelo != null && !modelo.isEmpty();
			case AngularjsPackage.CONTROLLER__PARAMETROS:
				return parametros != null && !parametros.isEmpty();
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
