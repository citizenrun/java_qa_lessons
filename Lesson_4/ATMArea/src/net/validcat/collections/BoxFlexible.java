package net.validcat.collections;
import net.validcat.interfaces.IBoxWork;
import net.validcat.money.Money;

public class BoxFlexible implements IBoxWork {
	
	Money bank[] = new Money[10];
	private int i = 0;

	public void add(Money b) {
		if (i >= bank.length) {
			Money flexibleBank[] = new Money[bank.length * 2];
			for (int c = 0; c < bank.length; c++) {
				flexibleBank[c] = bank[c];
			}
			bank = flexibleBank;
		} else {
			bank[i++] = b;
		}
	}

	public int sum() {
		int sum = 0;
		for (int k = 0; k < bank.length; k++) {
			sum += bank[k].getValue();
		}
		return sum;
	}

	public int size() {
		System.out.println(" упюр в боксе :" + i);
		return i;
	}

	public String toString() {
		return "ящик дл€ денег:" + hashCode();
	}

//	@Override
//	public void deleteAllMoney() {
//		bank = new Money[10];
//	}
}
