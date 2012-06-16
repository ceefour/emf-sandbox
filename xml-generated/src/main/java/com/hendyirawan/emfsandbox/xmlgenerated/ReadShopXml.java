package com.hendyirawan.emfsandbox.xmlgenerated;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Optional;
import com.hendyirawan.emfsandbox.xmlgenerated.bippomall.BippomallPackage;
import com.hendyirawan.emfsandbox.xmlgenerated.bippomall.Shop;
import com.hendyirawan.emfsandbox.xmlgenerated.bippomall.ShopList;

/**
 * @author ceefour
 * 
 */
public class ReadShopXml {

	private transient static Logger log = LoggerFactory
			.getLogger(ReadShopXml.class);

	public static void main(String[] args) {
		// register globally the Ecore Resource Factory to the ".ecore" extension
		// weird that we need to do this, but well...
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"ecore", new EcoreResourceFactoryImpl());

		// create new resource set
		ResourceSet rs = new ResourceSetImpl();
		// enable extended metadata
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(rs.getPackageRegistry());
		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA,
				extendedMetaData);
		// another, more compact way:
//		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA,
//		true);

		// Load the generated metamodel
		// Just doing this automatically registers the package
		// to the global package registry
		BippomallPackage mallPackage = BippomallPackage.eINSTANCE;
		
		// registering the package is optional now
		// but maybe you want to register locally the package using the null nsURI
//		rs.getPackageRegistry().put(mallPackage.getNsURI(), mallPackage);
		log.info("Global Package registry {}", EPackage.Registry.INSTANCE.entrySet());
		log.info("Package registry {}", rs.getPackageRegistry());

		// register .xml extension locally in the ResourceSet
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xml", new XMLResourceFactoryImpl());
//		 rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
//		 .put("xml", new GenericXMLResourceFactoryImpl());
		URI fileUri = URI
				.createFileURI("sample/shop-01.xml");
		Resource shopsResource = rs.getResource(fileUri, true);
		
		// asume it is of class ShopList
		ShopList shops = (ShopList)shopsResource.getContents().get(0);
		for (Shop shop : shops.getShops()) {
			log.info("Shop {}: {}", shop.getId(), shop.getName());
			log.info("  Location {}, {}, {}", new Object[] {
				shop.getCity(), shop.getState(), shop.getCountry() });
			log.info("  since {}", Optional.fromNullable(String.valueOf(shop.getSinceYear())).or("unknown"));
		}
	}

}
