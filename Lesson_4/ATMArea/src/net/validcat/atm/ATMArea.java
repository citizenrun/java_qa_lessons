package net.validcat.atm;

public class ATMArea {
	
	public static void main(String[] args) {
		ATM atm = new ATM();
		
		User user = new User();
		user.insertMoney(atm);
	}
}