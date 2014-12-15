package com.it.source.exceptions;

public class ShuntingEngine {
	public static final int STATE_OK = 0;
	public static final int STATE_SUSPEND = 1;
	
	private int state = STATE_SUSPEND;
	
	public ShuntingEngine(int state) {
		super();
		this.state = state;
	}

	public ShuntingEngine() {
	}

	public int getState() {
		return state;
	}

	public boolean setup(int fuel) {
		if (STATE_SUSPEND == state) {
			System.err.println("Engine is suspend");
			if (fuel == 0)
				System.err.println("Tank is empty");
			
			return false;
		}
			
		return STATE_OK == state && fuel > 0;
	}

}
