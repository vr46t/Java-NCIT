package org.ncit.exception;

public class InvalidSemesterException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	
	public InvalidSemesterException(String message) {
	   this.message = message;
	}

	public void printErrorMessage() {
		System.out.println(message);
	}
}
