package net.validcat.interfaces;

import net.validcat.money.Money;

public interface IBoxWork {
	void add(Money b);
	int sum();
	int size();
//	void deleteAllMoney();
}
