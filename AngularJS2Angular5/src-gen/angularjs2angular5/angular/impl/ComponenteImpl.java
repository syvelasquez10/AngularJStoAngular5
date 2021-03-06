/**
 */
package angularjs2angular5.angular.impl;

import angularjs2angular5.angular.AngularPackage;
import angularjs2angular5.angular.Componente;
import angularjs2angular5.angular.Funcion;
import angularjs2angular5.angular.Modelo;
import angularjs2angular5.angular.Modulo;
import angularjs2angular5.angular.ObjetoAngular;
import angularjs2angular5.angular.Template;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Componente</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link angularjs2angular5.angular.impl.ComponenteImpl#getFuncion <em>Funcion</em>}</li>
 *   <li>{@link angularjs2angular5.angular.impl.ComponenteImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link angularjs2angular5.angular.impl.ComponenteImpl#getModelo <em>Modelo</em>}</li>
 *   <li>{@link angularjs2angular5.angular.impl.ComponenteImpl#getParametros <em>Parametros</em>}</li>
 *   <li>{@link angularjs2angular5.angular.impl.ComponenteImpl#getModulo <em>Modulo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponenteImpl extends ObjetoAngularImpl implements Componente {
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
	 * The cached value of the '{@link #getModulo() <em>Modulo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulo()
	 * @generated
	 * @ordered
	 */
	protected Modulo modulo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponenteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AngularPackage.Literals.COMPONENTE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AngularPackage.COMPONENTE__FUNCION, oldFuncion, newFuncion);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
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
				msgs = ((InternalEObject) funcion).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AngularPackage.COMPONENTE__FUNCION, null, msgs);
			if (newFuncion != null)
				msgs = ((InternalEObject) newFuncion).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AngularPackage.COMPONENTE__FUNCION, null, msgs);
			msgs = basicSetFuncion(newFuncion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AngularPackage.COMPONENTE__FUNCION, newFuncion,
					newFuncion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template getTemplate() {
		if (template != null && template.eIsProxy()) {
			InternalEObject oldTemplate = (InternalEObject) template;
			template = (Template) eResolveProxy(oldTemplate);
			if (template != oldTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AngularPackage.COMPONENTE__TEMPLATE,
							oldTemplate, template));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AngularPackage.COMPONENTE__TEMPLATE, oldTemplate,
					template));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modelo> getModelo() {
		if (modelo == null) {
			modelo = new EObjectResolvingEList<Modelo>(Modelo.class, this, AngularPackage.COMPONENTE__MODELO);
		}
		return modelo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjetoAngular> getParametros() {
		if (parametros == null) {
			parametros = new EObjectResolvingEList<ObjetoAngular>(ObjetoAngular.class, this,
					AngularPackage.COMPONENTE__PARAMETROS);
		}
		return parametros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modulo getModulo() {
		if (modulo != null && modulo.eIsProxy()) {
			InternalEObject oldModulo = (InternalEObject) modulo;
			modulo = (Modulo) eResolveProxy(oldModulo);
			if (modulo != oldModulo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AngularPackage.COMPONENTE__MODULO,
							oldModulo, modulo));
			}
		}
		return modulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modulo basicGetModulo() {
		return modulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModulo(Modulo newModulo) {
		Modulo oldModulo = modulo;
		modulo = newModulo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AngularPackage.COMPONENTE__MODULO, oldModulo,
					modulo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AngularPackage.COMPONENTE__FUNCION:
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
		case AngularPackage.COMPONENTE__FUNCION:
			return getFuncion();
		case AngularPackage.COMPONENTE__TEMPLATE:
			if (resolve)
				return getTemplate();
			return basicGetTemplate();
		case AngularPackage.COMPONENTE__MODELO:
			return getModelo();
		case AngularPackage.COMPONENTE__PARAMETROS:
			return getParametros();
		case AngularPackage.COMPONENTE__MODULO:
			if (resolve)
				return getModulo();
			return basicGetModulo();
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
		case AngularPackage.COMPONENTE__FUNCION:
			setFuncion((Funcion) newValue);
			return;
		case AngularPackage.COMPONENTE__TEMPLATE:
			setTemplate((Template) newValue);
			return;
		case AngularPackage.COMPONENTE__MODELO:
			getModelo().clear();
			getModelo().addAll((Collection<? extends Modelo>) newValue);
			return;
		case AngularPackage.COMPONENTE__PARAMETROS:
			getParametros().clear();
			getParametros().addAll((Collection<? extends ObjetoAngular>) newValue);
			return;
		case AngularPackage.COMPONENTE__MODULO:
			setModulo((Modulo) newValue);
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
		case AngularPackage.COMPONENTE__FUNCION:
			setFuncion((Funcion) null);
			return;
		case AngularPackage.COMPONENTE__TEMPLATE:
			setTemplate((Template) null);
			return;
		case AngularPackage.COMPONENTE__MODELO:
			getModelo().clear();
			return;
		case AngularPackage.COMPONENTE__PARAMETROS:
			getParametros().clear();
			return;
		case AngularPackage.COMPONENTE__MODULO:
			setModulo((Modulo) null);
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
		case AngularPackage.COMPONENTE__FUNCION:
			return funcion != null;
		case AngularPackage.COMPONENTE__TEMPLATE:
			return template != null;
		case AngularPackage.COMPONENTE__MODELO:
			return modelo != null && !modelo.isEmpty();
		case AngularPackage.COMPONENTE__PARAMETROS:
			return parametros != null && !parametros.isEmpty();
		case AngularPackage.COMPONENTE__MODULO:
			return modulo != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponenteImpl
