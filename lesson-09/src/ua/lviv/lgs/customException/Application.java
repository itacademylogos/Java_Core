package ua.lviv.lgs.customException;

public class Application {
	public static void main(String[] args) throws NoMoneyException {

		BankAccount b = new BankAccount();
		b .makeDeposit(1000);
		
		b.withdrawMoney(253);
		b.withdrawMoney(900);
	}
}
