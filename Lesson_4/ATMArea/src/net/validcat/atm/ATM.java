package net.validcat.atm;

import net.validcat.collections.Box;
import net.validcat.interfaces.IBoxWork;
import net.validcat.logic.ATMLogic;
import net.validcat.money.Hryvnia;

public class ATM {
	public IBoxWork box;
	public ATMLogic logic;

	public ATM() {
		box = new Box();
		logic = new ATMLogic(box);
	}
	
	public void insertClientValue(int clientValue) {
		Hryvnia banknote = new Hryvnia(clientValue);

		boolean checkResult = logic.checkCounterfeit(banknote.getValue(), banknote.getPar());
		banknote.setCounterfeit(checkResult);

		if (checkResult) {
			logic.consume(banknote);
		} else {
			logic.garbage();
		}

	}
}
