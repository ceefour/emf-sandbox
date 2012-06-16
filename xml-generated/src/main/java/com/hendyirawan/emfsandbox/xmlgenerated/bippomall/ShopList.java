/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.hendyirawan.emfsandbox.xmlgenerated.bippomall;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shop List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.hendyirawan.emfsandbox.xmlgenerated.bippomall.ShopList#getShops <em>Shops</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.hendyirawan.emfsandbox.xmlgenerated.bippomall.BippomallPackage#getShopList()
 * @model extendedMetaData="kind='element' name='shops'"
 * @generated
 */
public interface ShopList extends EObject {
	/**
	 * Returns the value of the '<em><b>Shops</b></em>' containment reference list.
	 * The list contents are of type {@link com.hendyirawan.emfsandbox.xmlgenerated.bippomall.Shop}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shops</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shops</em>' containment reference list.
	 * @see com.hendyirawan.emfsandbox.xmlgenerated.bippomall.BippomallPackage#getShopList_Shops()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='shop'"
	 * @generated
	 */
	EList<Shop> getShops();

} // ShopList
