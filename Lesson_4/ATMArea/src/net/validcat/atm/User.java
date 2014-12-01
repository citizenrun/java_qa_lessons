package net.validcat.atm;

public class User {

	private ATM atm;
	int userWallet[] = { 1, 1, 1, 2, 5, 5, 10, 20, 100, 100, 200, 500, 1000 };

	public void useBankomat(ATM atm) {
		this.atm = atm;
	}

	public void insertMoney(ATM atm) {
		for (int i = 0; i < userWallet.length; i++) {
			atm.insertClientValue(userWallet[i]);
		}
	}

}
