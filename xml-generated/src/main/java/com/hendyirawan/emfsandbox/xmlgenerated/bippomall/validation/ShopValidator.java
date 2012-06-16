/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.hendyirawan.emfsandbox.xmlgenerated.bippomall.validation;


/**
 * A sample validator interface for {@link com.hendyirawan.emfsandbox.xmlgenerated.bippomall.Shop}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ShopValidator {
	boolean validate();

	boolean validateId(String value);
	boolean validateName(String value);
	boolean validateCity(String value);
	boolean validateState(String value);
	boolean validateCountry(String value);
	boolean validateSinceYear(int value);
}
