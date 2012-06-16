/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.hendyirawan.emfsandbox.xmlgenerated.bippomall;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.hendyirawan.emfsandbox.xmlgenerated.bippomall.BippomallPackage
 * @generated
 */
public interface BippomallFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BippomallFactory eINSTANCE = com.hendyirawan.emfsandbox.xmlgenerated.bippomall.impl.BippomallFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Shop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shop</em>'.
	 * @generated
	 */
	Shop createShop();

	/**
	 * Returns a new object of class '<em>Shop List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shop List</em>'.
	 * @generated
	 */
	ShopList createShopList();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BippomallPackage getBippomallPackage();

} //BippomallFactory
