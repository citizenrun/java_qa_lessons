package net.validcat.logic;

import net.validcat.interfaces.IBoxWork;
import net.validcat.money.Money;

public class ATMLogic {
	// BoxWork z = new Box();
	IBoxWork box;
	
    public ATMLogic(IBoxWork box) {
        this.box = box;
    }

	public boolean checkCounterfeit(int clientValue1, int par[]) {
		boolean isCounterfit = false;
		for (int k = 0; k < par.length; k++) {
			if (clientValue1 == par[k]) {
				isCounterfit = true;
				break;
			}
		}
		return isCounterfit;
	}

	public void consume(Money banknot) {
		System.out.println("Спасибо что ввели: " + banknot.getValue());
		box.add(banknot);
	}

	public void garbage() {
		System.out.println("Никуда не уходите я вызвал полицию!");
	}

	public int getMoneySumFromBox() {
		return box.sum();
	}
}
