package it.exolab.ecommerce.exceptions;

public class FieldException extends Exception {
	private String field;

	public FieldException(String field) {
		super();
		this.field = field;
	}
	
	public String getField() {
		return field;
	}
}
