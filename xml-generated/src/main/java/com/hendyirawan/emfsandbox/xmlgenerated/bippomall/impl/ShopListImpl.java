/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl;

import com.hendyirawan.emfsandbox.xmlgenerated.bippomall.BippomallPackage;
import com.hendyirawan.emfsandbox.xmlgenerated.bippomall.Shop;
import com.hendyirawan.emfsandbox.xmlgenerated.bippomall.ShopList;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shop List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl.ShopListImpl#getShops <em>Shops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShopListImpl extends EObjectImpl implements ShopList {
	/**
	 * The cached value of the '{@link #getShops() <em>Shops</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShops()
	 * @generated
	 * @ordered
	 */
	protected EList<Shop> shops;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShopListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BippomallPackage.Literals.SHOP_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Shop> getShops() {
		if (shops == null) {
			shops = new EObjectContainmentEList<Shop>(Shop.class, this, BippomallPackage.SHOP_LIST__SHOPS);
		}
		return shops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BippomallPackage.SHOP_LIST__SHOPS:
				return ((InternalEList<?>)getShops()).basicRemove(otherEnd, msgs);
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
			case BippomallPackage.SHOP_LIST__SHOPS:
				return getShops();
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
			case BippomallPackage.SHOP_LIST__SHOPS:
				getShops().clear();
				getShops().addAll((Collection<? extends Shop>)newValue);
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
			case BippomallPackage.SHOP_LIST__SHOPS:
				getShops().clear();
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
			case BippomallPackage.SHOP_LIST__SHOPS:
				return shops != null && !shops.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ShopListImpl
