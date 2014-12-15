package com.it.source.exceptions;

import com.it.source.exceptions.descr.SpaceHulkError;

public class Cabine {
	private boolean isPressurization = false;
	
	public Cabine(boolean isPressurization) {
		super();
		this.isPressurization = isPressurization;
	}

	public Cabine() {
	}

	public boolean isPressurization() {
		return isPressurization;
	}

	public boolean setOxygen(int pressure) {
		if (!isPressurization) {
			System.err.println("Oxygen gone");
		}
		
		if (pressure == 0) {
			System.err.println("No oxygen");
			return false;
		}
		
		if (isPressurization && pressure > 0)
			System.out.println("Cabine with pilot is okay");
		
		return true;
	}
	
	public void isCabineReady() throws SpaceHulkError {
		if (isPressurization == false)
			throw new SpaceHulkError("Pressurization is false. Check presuration");
	}

}
