package com.it.source.exceptions;

import com.it.source.exceptions.descr.SpaceHulkError;

public class SpaceHulk {
	Tank tank;
	Cabine cabine;
	ShuntingEngine se;
	OxygenTank oxygen;
	
	public SpaceHulk() {
		tank = new Tank();
		cabine = new Cabine();
		se = new ShuntingEngine();
		oxygen = new OxygenTank(); 
	}
	
	public SpaceHulk(int fuel, boolean isPressurization, int state,
			int pressure) {
		tank = new Tank(fuel);
		cabine = new Cabine(isPressurization);
		se = new ShuntingEngine(state);
		oxygen = new OxygenTank(pressure); 
	}
	
	public void start() {
		boolean cabineState = cabine.setOxygen(oxygen.getPressure());
		boolean engine = se.setup(tank.getFuel());
		
		if (cabineState && engine) {
			System.out.println("SpaceHulk is taking off");
		} else {
			System.err.println("*** *** SpaceHulk has been crushed *** ***");
		}
	}
	
	public void safeStart() {
		boolean flag = false;
		try {
			cabine.isCabineReady();
		} catch (SpaceHulkError e) {
			flag = true;
			System.out.println(e.getError());;
		}
		
		if (flag == false)
			start();
	} 

}
