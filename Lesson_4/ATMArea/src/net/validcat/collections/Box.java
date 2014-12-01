package net.validcat.collections;
import net.validcat.interfaces.IBoxWork;
import net.validcat.money.Money;

public class Box implements IBoxWork   {
	Money bank[] = new Money[100];
	int i = 0;

	public void add(Money b) {
		if (i >= 99) {
			System.out.println("Box полон");
		} else {
			bank[i++] = b;
		}
	}

	public int sum() {
		int sum = 0;
		for (int k = 0; k < bank.length; k++)
			sum += bank[k].getValue();
		return sum;
	}

	public int size() {
		return i;
	}
//
//	@Override
//	public void deleteAllMoney() {
//		bank = new Money[100];
//	}
	
}
