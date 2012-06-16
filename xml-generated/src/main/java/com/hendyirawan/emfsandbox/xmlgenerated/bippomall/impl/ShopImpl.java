/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl;

import com.hendyirawan.emfsandbox.xmlgenerated.bippomall.BippomallPackage;
import com.hendyirawan.emfsandbox.xmlgenerated.bippomall.Shop;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl.ShopImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl.ShopImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl.ShopImpl#getCity <em>City</em>}</li>
 *   <li>{@link com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl.ShopImpl#getState <em>State</em>}</li>
 *   <li>{@link com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl.ShopImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl.ShopImpl#getSinceYear <em>Since Year</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShopImpl extends EObjectImpl implements Shop {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSinceYear() <em>Since Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinceYear()
	 * @generated
	 * @ordered
	 */
	protected static final int SINCE_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSinceYear() <em>Since Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinceYear()
	 * @generated
	 * @ordered
	 */
	protected int sinceYear = SINCE_YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BippomallPackage.Literals.SHOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BippomallPackage.SHOP__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BippomallPackage.SHOP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BippomallPackage.SHOP__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BippomallPackage.SHOP__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BippomallPackage.SHOP__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSinceYear() {
		return sinceYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSinceYear(int newSinceYear) {
		int oldSinceYear = sinceYear;
		sinceYear = newSinceYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BippomallPackage.SHOP__SINCE_YEAR, oldSinceYear, sinceYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BippomallPackage.SHOP__ID:
				return getId();
			case BippomallPackage.SHOP__NAME:
				return getName();
			case BippomallPackage.SHOP__CITY:
				return getCity();
			case BippomallPackage.SHOP__STATE:
				return getState();
			case BippomallPackage.SHOP__COUNTRY:
				return getCountry();
			case BippomallPackage.SHOP__SINCE_YEAR:
				return getSinceYear();
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
			case BippomallPackage.SHOP__ID:
				setId((String)newValue);
				return;
			case BippomallPackage.SHOP__NAME:
				setName((String)newValue);
				return;
			case BippomallPackage.SHOP__CITY:
				setCity((String)newValue);
				return;
			case BippomallPackage.SHOP__STATE:
				setState((String)newValue);
				return;
			case BippomallPackage.SHOP__COUNTRY:
				setCountry((String)newValue);
				return;
			case BippomallPackage.SHOP__SINCE_YEAR:
				setSinceYear((Integer)newValue);
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
			case BippomallPackage.SHOP__ID:
				setId(ID_EDEFAULT);
				return;
			case BippomallPackage.SHOP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BippomallPackage.SHOP__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case BippomallPackage.SHOP__STATE:
				setState(STATE_EDEFAULT);
				return;
			case BippomallPackage.SHOP__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case BippomallPackage.SHOP__SINCE_YEAR:
				setSinceYear(SINCE_YEAR_EDEFAULT);
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
			case BippomallPackage.SHOP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BippomallPackage.SHOP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BippomallPackage.SHOP__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case BippomallPackage.SHOP__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case BippomallPackage.SHOP__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case BippomallPackage.SHOP__SINCE_YEAR:
				return sinceYear != SINCE_YEAR_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", city: ");
		result.append(city);
		result.append(", state: ");
		result.append(state);
		result.append(", country: ");
		result.append(country);
		result.append(", sinceYear: ");
		result.append(sinceYear);
		result.append(')');
		return result.toString();
	}

} //ShopImpl
