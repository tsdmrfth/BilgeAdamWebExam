/**
 * 
 */
package com.bilgeadam.webexam.exception;

/**
 * @author Fatih Taşdemir Nov 3, 2017
 */
public class ProductNotFoundException extends AbstractEntityNotFoundException {

	private static final long serialVersionUID = 1L;
	private String exception;

	public ProductNotFoundException(String exception) {
		super(exception);
		this.exception = exception;
	}

	public String getException() {
		return exception;
	}
}
