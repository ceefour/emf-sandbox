package com.hendyirawan.emfsandbox.xmlgenerated;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
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

import com.google.common.collect.Lists;
import com.hendyirawan.emfsandbox.xmlgenerated.bippomall.BippomallPackage;

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

		// Load the generated metamodel
		BippomallPackage mallPackage = BippomallPackage.eINSTANCE;
		
		// register the package
		rs.getPackageRegistry().put(mallPackage.getNsURI(), mallPackage);
		log.info("Global Package registry {}", EPackage.Registry.INSTANCE.entrySet());
		log.info("Package registry {}", rs.getPackageRegistry());

//		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA,
//				true);

		// register .xml extension locally in the ResourceSet
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xml", new XMLResourceFactoryImpl());
//		 rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
//		 .put("xml", new GenericXMLResourceFactoryImpl());
		URI fileUri = URI
				.createFileURI("sample/shop-01.xml");
		Resource shopsResource = rs.getResource(fileUri, true);
		
		for (EObject content : Lists.newArrayList(shopsResource.getAllContents())) {
			log.info("Content {}", content.eClass().getName());
			EList<EStructuralFeature> features = content.eClass().getEStructuralFeatures();
			for (EStructuralFeature feature : features) {
				log.info("{} = {}", feature.getName(), content.eGet(feature));
			}
		}
	}

}
