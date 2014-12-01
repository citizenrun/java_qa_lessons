package net.validcat.money;

public class Money {

	int value;
	boolean counterfeit;

	Money(int val) {
		value = val;
	}

	public int getValue() {
		return value;
	}

	boolean getCounterfeit() { // возвращает значение
		return counterfeit;
	}

	public void setCounterfeit(boolean checkResult) {
		counterfeit = checkResult;
	}
}
