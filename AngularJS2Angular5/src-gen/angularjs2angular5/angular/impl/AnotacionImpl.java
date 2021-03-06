/**
 */
package angularjs2angular5.angular.impl;

import angularjs2angular5.angular.AngularPackage;
import angularjs2angular5.angular.Anotacion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anotacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link angularjs2angular5.angular.impl.AnotacionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link angularjs2angular5.angular.impl.AnotacionImpl#getName <em>Name</em>}</li>
 *   <li>{@link angularjs2angular5.angular.impl.AnotacionImpl#isPrimitivo <em>Primitivo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnotacionImpl extends MinimalEObjectImpl.Container implements Anotacion {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

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
	 * The default value of the '{@link #isPrimitivo() <em>Primitivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimitivo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIMITIVO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrimitivo() <em>Primitivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimitivo()
	 * @generated
	 * @ordered
	 */
	protected boolean primitivo = PRIMITIVO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnotacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AngularPackage.Literals.ANOTACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AngularPackage.ANOTACION__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AngularPackage.ANOTACION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrimitivo() {
		return primitivo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitivo(boolean newPrimitivo) {
		boolean oldPrimitivo = primitivo;
		primitivo = newPrimitivo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AngularPackage.ANOTACION__PRIMITIVO, oldPrimitivo,
					primitivo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AngularPackage.ANOTACION__VALUE:
			return getValue();
		case AngularPackage.ANOTACION__NAME:
			return getName();
		case AngularPackage.ANOTACION__PRIMITIVO:
			return isPrimitivo();
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
		case AngularPackage.ANOTACION__VALUE:
			setValue((String) newValue);
			return;
		case AngularPackage.ANOTACION__NAME:
			setName((String) newValue);
			return;
		case AngularPackage.ANOTACION__PRIMITIVO:
			setPrimitivo((Boolean) newValue);
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
		case AngularPackage.ANOTACION__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case AngularPackage.ANOTACION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AngularPackage.ANOTACION__PRIMITIVO:
			setPrimitivo(PRIMITIVO_EDEFAULT);
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
		case AngularPackage.ANOTACION__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case AngularPackage.ANOTACION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AngularPackage.ANOTACION__PRIMITIVO:
			return primitivo != PRIMITIVO_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", name: ");
		result.append(name);
		result.append(", primitivo: ");
		result.append(primitivo);
		result.append(')');
		return result.toString();
	}

} //AnotacionImpl
