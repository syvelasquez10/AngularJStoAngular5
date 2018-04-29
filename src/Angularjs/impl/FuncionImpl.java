/**
 */
package Angularjs.impl;

import Angularjs.AngularjsPackage;
import Angularjs.Funcion;
import Angularjs.Parametro;
import Angularjs.Referencia;
import Angularjs.Variable;

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
 * An implementation of the model object '<em><b>Funcion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Angularjs.impl.FuncionImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link Angularjs.impl.FuncionImpl#getFuncion <em>Funcion</em>}</li>
 *   <li>{@link Angularjs.impl.FuncionImpl#getParametro <em>Parametro</em>}</li>
 *   <li>{@link Angularjs.impl.FuncionImpl#isTieneRetorno <em>Tiene Retorno</em>}</li>
 *   <li>{@link Angularjs.impl.FuncionImpl#getReferencia <em>Referencia</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuncionImpl extends ObjetoJavaScriptImpl implements Funcion {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList variable;

	/**
	 * The cached value of the '{@link #getFuncion() <em>Funcion</em>}' reference list.
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
	 * The default value of the '{@link #isTieneRetorno() <em>Tiene Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTieneRetorno()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TIENE_RETORNO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTieneRetorno() <em>Tiene Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTieneRetorno()
	 * @generated
	 * @ordered
	 */
	protected boolean tieneRetorno = TIENE_RETORNO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferencia() <em>Referencia</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencia()
	 * @generated
	 * @ordered
	 */
	protected EList referencia;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuncionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AngularjsPackage.Literals.FUNCION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentEList(Variable.class, this, AngularjsPackage.FUNCION__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFuncion() {
		if (funcion == null) {
			funcion = new EObjectResolvingEList(Funcion.class, this, AngularjsPackage.FUNCION__FUNCION);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AngularjsPackage.FUNCION__PARAMETRO, oldParametro, parametro));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AngularjsPackage.FUNCION__PARAMETRO, oldParametro, parametro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTieneRetorno() {
		return tieneRetorno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTieneRetorno(boolean newTieneRetorno) {
		boolean oldTieneRetorno = tieneRetorno;
		tieneRetorno = newTieneRetorno;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AngularjsPackage.FUNCION__TIENE_RETORNO, oldTieneRetorno, tieneRetorno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReferencia() {
		if (referencia == null) {
			referencia = new EObjectContainmentEList(Referencia.class, this, AngularjsPackage.FUNCION__REFERENCIA);
		}
		return referencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AngularjsPackage.FUNCION__VARIABLE:
				return ((InternalEList)getVariable()).basicRemove(otherEnd, msgs);
			case AngularjsPackage.FUNCION__REFERENCIA:
				return ((InternalEList)getReferencia()).basicRemove(otherEnd, msgs);
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
			case AngularjsPackage.FUNCION__VARIABLE:
				return getVariable();
			case AngularjsPackage.FUNCION__FUNCION:
				return getFuncion();
			case AngularjsPackage.FUNCION__PARAMETRO:
				if (resolve) return getParametro();
				return basicGetParametro();
			case AngularjsPackage.FUNCION__TIENE_RETORNO:
				return isTieneRetorno() ? Boolean.TRUE : Boolean.FALSE;
			case AngularjsPackage.FUNCION__REFERENCIA:
				return getReferencia();
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
			case AngularjsPackage.FUNCION__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection)newValue);
				return;
			case AngularjsPackage.FUNCION__FUNCION:
				getFuncion().clear();
				getFuncion().addAll((Collection)newValue);
				return;
			case AngularjsPackage.FUNCION__PARAMETRO:
				setParametro((Parametro)newValue);
				return;
			case AngularjsPackage.FUNCION__TIENE_RETORNO:
				setTieneRetorno(((Boolean)newValue).booleanValue());
				return;
			case AngularjsPackage.FUNCION__REFERENCIA:
				getReferencia().clear();
				getReferencia().addAll((Collection)newValue);
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
			case AngularjsPackage.FUNCION__VARIABLE:
				getVariable().clear();
				return;
			case AngularjsPackage.FUNCION__FUNCION:
				getFuncion().clear();
				return;
			case AngularjsPackage.FUNCION__PARAMETRO:
				setParametro((Parametro)null);
				return;
			case AngularjsPackage.FUNCION__TIENE_RETORNO:
				setTieneRetorno(TIENE_RETORNO_EDEFAULT);
				return;
			case AngularjsPackage.FUNCION__REFERENCIA:
				getReferencia().clear();
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
			case AngularjsPackage.FUNCION__VARIABLE:
				return variable != null && !variable.isEmpty();
			case AngularjsPackage.FUNCION__FUNCION:
				return funcion != null && !funcion.isEmpty();
			case AngularjsPackage.FUNCION__PARAMETRO:
				return parametro != null;
			case AngularjsPackage.FUNCION__TIENE_RETORNO:
				return tieneRetorno != TIENE_RETORNO_EDEFAULT;
			case AngularjsPackage.FUNCION__REFERENCIA:
				return referencia != null && !referencia.isEmpty();
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
		result.append(" (tieneRetorno: ");
		result.append(tieneRetorno);
		result.append(')');
		return result.toString();
	}

} //FuncionImpl
