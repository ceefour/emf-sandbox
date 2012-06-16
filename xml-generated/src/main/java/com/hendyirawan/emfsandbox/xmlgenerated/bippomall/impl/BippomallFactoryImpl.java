/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl;

import com.hendyirawan.emfsandbox.xmlgenerated.bippomall.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BippomallFactoryImpl extends EFactoryImpl implements BippomallFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BippomallFactory init() {
		try {
			BippomallFactory theBippomallFactory = (BippomallFactory)EPackage.Registry.INSTANCE.getEFactory("http://bippomall/1.0"); 
			if (theBippomallFactory != null) {
				return theBippomallFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BippomallFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BippomallFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BippomallPackage.SHOP: return createShop();
			case BippomallPackage.SHOP_LIST: return createShopList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shop createShop() {
		ShopImpl shop = new ShopImpl();
		return shop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShopList createShopList() {
		ShopListImpl shopList = new ShopListImpl();
		return shopList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BippomallPackage getBippomallPackage() {
		return (BippomallPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BippomallPackage getPackage() {
		return BippomallPackage.eINSTANCE;
	}

} //BippomallFactoryImpl
