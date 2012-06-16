/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.hendyirawan.emfsandbox.xmlgenerated.bippomall;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.hendyirawan.emfsandbox.xmlgenerated.bippomall.BippomallFactory
 * @model kind="package"
 * @generated
 */
public interface BippomallPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bippomall";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bippomall/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bippomall";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BippomallPackage eINSTANCE = com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl.BippomallPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl.ShopImpl <em>Shop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl.ShopImpl
	 * @see com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl.BippomallPackageImpl#getShop()
	 * @generated
	 */
	int SHOP = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP__NAME = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP__CITY = 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP__STATE = 3;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP__COUNTRY = 4;

	/**
	 * The feature id for the '<em><b>Since Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP__SINCE_YEAR = 5;

	/**
	 * The number of structural features of the '<em>Shop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl.ShopListImpl <em>Shop List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl.ShopListImpl
	 * @see com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl.BippomallPackageImpl#getShopList()
	 * @generated
	 */
	int SHOP_LIST = 1;

	/**
	 * The feature id for the '<em><b>Shops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP_LIST__SHOPS = 0;

	/**
	 * The number of structural features of the '<em>Shop List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOP_LIST_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link com.hendyirawan.emfsandbox.xmlgenerated.bippomall.Shop <em>Shop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shop</em>'.
	 * @see com.hendyirawan.emfsandbox.xmlgenerated.bippomall.Shop
	 * @generated
	 */
	EClass getShop();

	/**
	 * Returns the meta object for the attribute '{@link com.hendyirawan.emfsandbox.xmlgenerated.bippomall.Shop#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.hendyirawan.emfsandbox.xmlgenerated.bippomall.Shop#getId()
	 * @see #getShop()
	 * @generated
	 */
	EAttribute getShop_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.hendyirawan.emfsandbox.xmlgenerated.bippomall.Shop#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.hendyirawan.emfsandbox.xmlgenerated.bippomall.Shop#getName()
	 * @see #getShop()
	 * @generated
	 */
	EAttribute getShop_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.hendyirawan.emfsandbox.xmlgenerated.bippomall.Shop#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see com.hendyirawan.emfsandbox.xmlgenerated.bippomall.Shop#getCity()
	 * @see #getShop()
	 * @generated
	 */
	EAttribute getShop_City();

	/**
	 * Returns the meta object for the attribute '{@link com.hendyirawan.emfsandbox.xmlgenerated.bippomall.Shop#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see com.hendyirawan.emfsandbox.xmlgenerated.bippomall.Shop#getState()
	 * @see #getShop()
	 * @generated
	 */
	EAttribute getShop_State();

	/**
	 * Returns the meta object for the attribute '{@link com.hendyirawan.emfsandbox.xmlgenerated.bippomall.Shop#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see com.hendyirawan.emfsandbox.xmlgenerated.bippomall.Shop#getCountry()
	 * @see #getShop()
	 * @generated
	 */
	EAttribute getShop_Country();

	/**
	 * Returns the meta object for the attribute '{@link com.hendyirawan.emfsandbox.xmlgenerated.bippomall.Shop#getSinceYear <em>Since Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Since Year</em>'.
	 * @see com.hendyirawan.emfsandbox.xmlgenerated.bippomall.Shop#getSinceYear()
	 * @see #getShop()
	 * @generated
	 */
	EAttribute getShop_SinceYear();

	/**
	 * Returns the meta object for class '{@link com.hendyirawan.emfsandbox.xmlgenerated.bippomall.ShopList <em>Shop List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shop List</em>'.
	 * @see com.hendyirawan.emfsandbox.xmlgenerated.bippomall.ShopList
	 * @generated
	 */
	EClass getShopList();

	/**
	 * Returns the meta object for the containment reference list '{@link com.hendyirawan.emfsandbox.xmlgenerated.bippomall.ShopList#getShops <em>Shops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shops</em>'.
	 * @see com.hendyirawan.emfsandbox.xmlgenerated.bippomall.ShopList#getShops()
	 * @see #getShopList()
	 * @generated
	 */
	EReference getShopList_Shops();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BippomallFactory getBippomallFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl.ShopImpl <em>Shop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl.ShopImpl
		 * @see com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl.BippomallPackageImpl#getShop()
		 * @generated
		 */
		EClass SHOP = eINSTANCE.getShop();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOP__ID = eINSTANCE.getShop_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOP__NAME = eINSTANCE.getShop_Name();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOP__CITY = eINSTANCE.getShop_City();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOP__STATE = eINSTANCE.getShop_State();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOP__COUNTRY = eINSTANCE.getShop_Country();

		/**
		 * The meta object literal for the '<em><b>Since Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOP__SINCE_YEAR = eINSTANCE.getShop_SinceYear();

		/**
		 * The meta object literal for the '{@link com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl.ShopListImpl <em>Shop List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl.ShopListImpl
		 * @see com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl.BippomallPackageImpl#getShopList()
		 * @generated
		 */
		EClass SHOP_LIST = eINSTANCE.getShopList();

		/**
		 * The meta object literal for the '<em><b>Shops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOP_LIST__SHOPS = eINSTANCE.getShopList_Shops();

	}

} //BippomallPackage
