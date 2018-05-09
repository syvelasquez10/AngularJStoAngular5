/**
 */
package angularjs.impl;

import angularjs.AngularjsPackage;
import angularjs.Anotacion;
import angularjs.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link angularjs.impl.VariableImpl#getValor <em>Valor</em>}</li>
 *   <li>{@link angularjs.impl.VariableImpl#getAnotacion <em>Anotacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends ObjetoJavaScriptImpl implements Variable {
	/**
	 * The default value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected static final String VALOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected String valor = VALOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnotacion() <em>Anotacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnotacion()
	 * @generated
	 * @ordered
	 */
	protected Anotacion anotacion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AngularjsPackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValor(String newValor) {
		String oldValor = valor;
		valor = newValor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AngularjsPackage.VARIABLE__VALOR, oldValor, valor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anotacion getAnotacion() {
		return anotacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnotacion(Anotacion newAnotacion, NotificationChain msgs) {
		Anotacion oldAnotacion = anotacion;
		anotacion = newAnotacion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AngularjsPackage.VARIABLE__ANOTACION, oldAnotacion, newAnotacion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnotacion(Anotacion newAnotacion) {
		if (newAnotacion != anotacion) {
			NotificationChain msgs = null;
			if (anotacion != null)
				msgs = ((InternalEObject)anotacion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AngularjsPackage.VARIABLE__ANOTACION, null, msgs);
			if (newAnotacion != null)
				msgs = ((InternalEObject)newAnotacion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AngularjsPackage.VARIABLE__ANOTACION, null, msgs);
			msgs = basicSetAnotacion(newAnotacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AngularjsPackage.VARIABLE__ANOTACION, newAnotacion, newAnotacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AngularjsPackage.VARIABLE__ANOTACION:
				return basicSetAnotacion(null, msgs);
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
			case AngularjsPackage.VARIABLE__VALOR:
				return getValor();
			case AngularjsPackage.VARIABLE__ANOTACION:
				return getAnotacion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AngularjsPackage.VARIABLE__VALOR:
				setValor((String)newValue);
				return;
			case AngularjsPackage.VARIABLE__ANOTACION:
				setAnotacion((Anotacion)newValue);
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
			case AngularjsPackage.VARIABLE__VALOR:
				setValor(VALOR_EDEFAULT);
				return;
			case AngularjsPackage.VARIABLE__ANOTACION:
				setAnotacion((Anotacion)null);
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
			case AngularjsPackage.VARIABLE__VALOR:
				return VALOR_EDEFAULT == null ? valor != null : !VALOR_EDEFAULT.equals(valor);
			case AngularjsPackage.VARIABLE__ANOTACION:
				return anotacion != null;
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
		result.append(" (valor: ");
		result.append(valor);
		result.append(')');
		return result.toString();
	}

} //VariableImpl
