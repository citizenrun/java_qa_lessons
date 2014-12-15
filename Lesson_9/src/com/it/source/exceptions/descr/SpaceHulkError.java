package com.it.source.exceptions.descr;

public class SpaceHulkError extends Exception {
	private static final long serialVersionUID = 1L;
	private String error = "";
	
	public SpaceHulkError(String error) {
		this.error = error;
	}
	
	public String getError() {
		return error;
	}
	
	public void setError(String error) {
		this.error = error;
	}

}
