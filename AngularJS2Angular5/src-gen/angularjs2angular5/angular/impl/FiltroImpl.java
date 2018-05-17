/**
 */
package angularjs2angular5.angular.impl;

import angularjs2angular5.angular.AngularPackage;
import angularjs2angular5.angular.Filtro;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filtro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link angularjs2angular5.angular.impl.FiltroImpl#getName <em>Name</em>}</li>
 *   <li>{@link angularjs2angular5.angular.impl.FiltroImpl#getParametros <em>Parametros</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FiltroImpl extends MinimalEObjectImpl.Container implements Filtro {
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
	 * The default value of the '{@link #getParametros() <em>Parametros</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametros()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETROS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParametros() <em>Parametros</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametros()
	 * @generated
	 * @ordered
	 */
	protected String parametros = PARAMETROS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FiltroImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AngularPackage.Literals.FILTRO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AngularPackage.FILTRO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParametros() {
		return parametros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParametros(String newParametros) {
		String oldParametros = parametros;
		parametros = newParametros;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AngularPackage.FILTRO__PARAMETROS, oldParametros,
					parametros));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AngularPackage.FILTRO__NAME:
			return getName();
		case AngularPackage.FILTRO__PARAMETROS:
			return getParametros();
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
		case AngularPackage.FILTRO__NAME:
			setName((String) newValue);
			return;
		case AngularPackage.FILTRO__PARAMETROS:
			setParametros((String) newValue);
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
		case AngularPackage.FILTRO__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AngularPackage.FILTRO__PARAMETROS:
			setParametros(PARAMETROS_EDEFAULT);
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
		case AngularPackage.FILTRO__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AngularPackage.FILTRO__PARAMETROS:
			return PARAMETROS_EDEFAULT == null ? parametros != null : !PARAMETROS_EDEFAULT.equals(parametros);
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", parametros: ");
		result.append(parametros);
		result.append(')');
		return result.toString();
	}

} //FiltroImpl
