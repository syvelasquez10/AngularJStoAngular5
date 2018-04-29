/**
 */
package Angularjs.impl;

import Angularjs.AngularjsPackage;
import Angularjs.Funcion;
import Angularjs.Parametro;
import Angularjs.Referencia;

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
 *   <li>{@link Angularjs.impl.FuncionImpl#getFuncion <em>Funcion</em>}</li>
 *   <li>{@link Angularjs.impl.FuncionImpl#isTieneRetorno <em>Tiene Retorno</em>}</li>
 *   <li>{@link Angularjs.impl.FuncionImpl#getReferencia <em>Referencia</em>}</li>
 *   <li>{@link Angularjs.impl.FuncionImpl#getParametros <em>Parametros</em>}</li>
 *   <li>{@link Angularjs.impl.FuncionImpl#getBody <em>Body</em>}</li>
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
	 * The cached value of the '{@link #getReferencia() <em>Referencia</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencia()
	 * @generated
	 * @ordered
	 */
	protected EList<Referencia> referencia;

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
		return AngularjsPackage.Literals.FUNCION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Funcion> getFuncion() {
		if (funcion == null) {
			funcion = new EObjectResolvingEList<Funcion>(Funcion.class, this, AngularjsPackage.FUNCION__FUNCION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, AngularjsPackage.FUNCION__TIENE_RETORNO, oldTieneRetorno, tieneRetorno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Referencia> getReferencia() {
		if (referencia == null) {
			referencia = new EObjectContainmentEList<Referencia>(Referencia.class, this, AngularjsPackage.FUNCION__REFERENCIA);
		}
		return referencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parametro> getParametros() {
		if (parametros == null) {
			parametros = new EObjectContainmentEList<Parametro>(Parametro.class, this, AngularjsPackage.FUNCION__PARAMETROS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, AngularjsPackage.FUNCION__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AngularjsPackage.FUNCION__REFERENCIA:
				return ((InternalEList<?>)getReferencia()).basicRemove(otherEnd, msgs);
			case AngularjsPackage.FUNCION__PARAMETROS:
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
			case AngularjsPackage.FUNCION__FUNCION:
				return getFuncion();
			case AngularjsPackage.FUNCION__TIENE_RETORNO:
				return isTieneRetorno();
			case AngularjsPackage.FUNCION__REFERENCIA:
				return getReferencia();
			case AngularjsPackage.FUNCION__PARAMETROS:
				return getParametros();
			case AngularjsPackage.FUNCION__BODY:
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
			case AngularjsPackage.FUNCION__FUNCION:
				getFuncion().clear();
				getFuncion().addAll((Collection<? extends Funcion>)newValue);
				return;
			case AngularjsPackage.FUNCION__TIENE_RETORNO:
				setTieneRetorno((Boolean)newValue);
				return;
			case AngularjsPackage.FUNCION__REFERENCIA:
				getReferencia().clear();
				getReferencia().addAll((Collection<? extends Referencia>)newValue);
				return;
			case AngularjsPackage.FUNCION__PARAMETROS:
				getParametros().clear();
				getParametros().addAll((Collection<? extends Parametro>)newValue);
				return;
			case AngularjsPackage.FUNCION__BODY:
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
			case AngularjsPackage.FUNCION__FUNCION:
				getFuncion().clear();
				return;
			case AngularjsPackage.FUNCION__TIENE_RETORNO:
				setTieneRetorno(TIENE_RETORNO_EDEFAULT);
				return;
			case AngularjsPackage.FUNCION__REFERENCIA:
				getReferencia().clear();
				return;
			case AngularjsPackage.FUNCION__PARAMETROS:
				getParametros().clear();
				return;
			case AngularjsPackage.FUNCION__BODY:
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
			case AngularjsPackage.FUNCION__FUNCION:
				return funcion != null && !funcion.isEmpty();
			case AngularjsPackage.FUNCION__TIENE_RETORNO:
				return tieneRetorno != TIENE_RETORNO_EDEFAULT;
			case AngularjsPackage.FUNCION__REFERENCIA:
				return referencia != null && !referencia.isEmpty();
			case AngularjsPackage.FUNCION__PARAMETROS:
				return parametros != null && !parametros.isEmpty();
			case AngularjsPackage.FUNCION__BODY:
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
