package com.bilgeadam.webexam.exception;

/**
 * @author Fatih Taşdemir Nov 2, 2017
 */

public class SaveProductImageFailedException extends Exception {

	private static final long serialVersionUID = 1L;
	private String exception;

	public SaveProductImageFailedException() {
	}

	public SaveProductImageFailedException(String exception) {
		this.exception = exception;
	}

	public String getException() {
		return exception;
	}
}
