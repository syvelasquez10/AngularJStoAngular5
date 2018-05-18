/**
 */
package Angularjs.mvc.impl;

import Angularjs.mvc.Funcion;
import Angularjs.mvc.MvcPackage;
import Angularjs.mvc.Parametro;

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
 *   <li>{@link Angularjs.mvc.impl.FuncionImpl#getFuncion <em>Funcion</em>}</li>
 *   <li>{@link Angularjs.mvc.impl.FuncionImpl#isTieneRetorno <em>Tiene Retorno</em>}</li>
 *   <li>{@link Angularjs.mvc.impl.FuncionImpl#getParametros <em>Parametros</em>}</li>
 *   <li>{@link Angularjs.mvc.impl.FuncionImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuncionImpl extends ObjetoJavaScriptImpl implements Funcion {
	/**
	 * The cached value of the '{@link #getFuncion() <em>Funcion</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncion()
	 * @generated
	 * @ordered
	 */
	protected EList<Funcion> funcion;

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
	@Override
	protected EClass eStaticClass() {
		return MvcPackage.Literals.FUNCION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Funcion> getFuncion() {
		if (funcion == null) {
			funcion = new EObjectResolvingEList<Funcion>(Funcion.class, this, MvcPackage.FUNCION__FUNCION);
		}
		return funcion;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.FUNCION__TIENE_RETORNO, oldTieneRetorno, tieneRetorno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parametro> getParametros() {
		if (parametros == null) {
			parametros = new EObjectContainmentEList<Parametro>(Parametro.class, this, MvcPackage.FUNCION__PARAMETROS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.FUNCION__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MvcPackage.FUNCION__PARAMETROS:
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
			case MvcPackage.FUNCION__FUNCION:
				return getFuncion();
			case MvcPackage.FUNCION__TIENE_RETORNO:
				return isTieneRetorno();
			case MvcPackage.FUNCION__PARAMETROS:
				return getParametros();
			case MvcPackage.FUNCION__BODY:
				return getBody();
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
			case MvcPackage.FUNCION__FUNCION:
				getFuncion().clear();
				getFuncion().addAll((Collection<? extends Funcion>)newValue);
				return;
			case MvcPackage.FUNCION__TIENE_RETORNO:
				setTieneRetorno((Boolean)newValue);
				return;
			case MvcPackage.FUNCION__PARAMETROS:
				getParametros().clear();
				getParametros().addAll((Collection<? extends Parametro>)newValue);
				return;
			case MvcPackage.FUNCION__BODY:
				setBody((String)newValue);
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
			case MvcPackage.FUNCION__FUNCION:
				getFuncion().clear();
				return;
			case MvcPackage.FUNCION__TIENE_RETORNO:
				setTieneRetorno(TIENE_RETORNO_EDEFAULT);
				return;
			case MvcPackage.FUNCION__PARAMETROS:
				getParametros().clear();
				return;
			case MvcPackage.FUNCION__BODY:
				setBody(BODY_EDEFAULT);
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
			case MvcPackage.FUNCION__FUNCION:
				return funcion != null && !funcion.isEmpty();
			case MvcPackage.FUNCION__TIENE_RETORNO:
				return tieneRetorno != TIENE_RETORNO_EDEFAULT;
			case MvcPackage.FUNCION__PARAMETROS:
				return parametros != null && !parametros.isEmpty();
			case MvcPackage.FUNCION__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
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
		result.append(" (tieneRetorno: ");
		result.append(tieneRetorno);
		result.append(", body: ");
		result.append(body);
		result.append(')');
		return result.toString();
	}

} //FuncionImpl
