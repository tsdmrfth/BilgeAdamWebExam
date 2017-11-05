package com.bilgeadam.webexam.exception;

/**
 * @author Fatih Taşdemir Nov 4, 2017
 */

public class AbstractEntityNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String exception;

	public AbstractEntityNotFoundException(String exception) {
		this.exception = exception;
	}

	public String getException() {
		return exception;
	}
}
