/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl;

import com.hendyirawan.emfsandbox.xmlgenerated.bippomall.BippomallFactory;
import com.hendyirawan.emfsandbox.xmlgenerated.bippomall.BippomallPackage;
import com.hendyirawan.emfsandbox.xmlgenerated.bippomall.Shop;
import com.hendyirawan.emfsandbox.xmlgenerated.bippomall.ShopList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BippomallPackageImpl extends EPackageImpl implements BippomallPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shopListEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.hendyirawan.emfsandbox.xmlgenerated.bippomall.BippomallPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BippomallPackageImpl() {
		super(eNS_URI, BippomallFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BippomallPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BippomallPackage init() {
		if (isInited) return (BippomallPackage)EPackage.Registry.INSTANCE.getEPackage(BippomallPackage.eNS_URI);

		// Obtain or create and register package
		BippomallPackageImpl theBippomallPackage = (BippomallPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BippomallPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BippomallPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBippomallPackage.createPackageContents();

		// Initialize created meta-data
		theBippomallPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBippomallPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BippomallPackage.eNS_URI, theBippomallPackage);
		return theBippomallPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShop() {
		return shopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShop_Id() {
		return (EAttribute)shopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShop_Name() {
		return (EAttribute)shopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShop_City() {
		return (EAttribute)shopEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShop_State() {
		return (EAttribute)shopEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShop_Country() {
		return (EAttribute)shopEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShop_SinceYear() {
		return (EAttribute)shopEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShopList() {
		return shopListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShopList_Shops() {
		return (EReference)shopListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BippomallFactory getBippomallFactory() {
		return (BippomallFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		shopEClass = createEClass(SHOP);
		createEAttribute(shopEClass, SHOP__ID);
		createEAttribute(shopEClass, SHOP__NAME);
		createEAttribute(shopEClass, SHOP__CITY);
		createEAttribute(shopEClass, SHOP__STATE);
		createEAttribute(shopEClass, SHOP__COUNTRY);
		createEAttribute(shopEClass, SHOP__SINCE_YEAR);

		shopListEClass = createEClass(SHOP_LIST);
		createEReference(shopListEClass, SHOP_LIST__SHOPS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(shopEClass, Shop.class, "Shop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShop_Id(), ecorePackage.getEString(), "id", null, 0, 1, Shop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShop_Name(), ecorePackage.getEString(), "name", null, 0, 1, Shop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShop_City(), ecorePackage.getEString(), "city", null, 0, 1, Shop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShop_State(), ecorePackage.getEString(), "state", null, 0, 1, Shop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShop_Country(), ecorePackage.getEString(), "country", null, 0, 1, Shop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShop_SinceYear(), ecorePackage.getEIntegerObject(), "sinceYear", null, 0, 1, Shop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shopListEClass, ShopList.class, "ShopList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShopList_Shops(), this.getShop(), null, "shops", null, 0, -1, ShopList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (shopEClass, 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "shop"
		   });		
		addAnnotation
		  (getShop_Id(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });		
		addAnnotation
		  (getShop_Name(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });		
		addAnnotation
		  (getShop_City(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });		
		addAnnotation
		  (getShop_State(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });		
		addAnnotation
		  (getShop_Country(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });		
		addAnnotation
		  (getShop_SinceYear(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });		
		addAnnotation
		  (shopListEClass, 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "shops"
		   });		
		addAnnotation
		  (getShopList_Shops(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "shop"
		   });
	}

} //BippomallPackageImpl
