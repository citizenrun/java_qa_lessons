package com.it.source.exceptions;

public class OxygenTank {
	private int pressure = 0;
	
	public OxygenTank(int pressure) {
		super();
		this.pressure = pressure;
	}

	public OxygenTank() {
	}

	public int getPressure() {
		return pressure;
	}

}
