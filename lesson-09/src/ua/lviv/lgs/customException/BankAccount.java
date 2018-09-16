package ua.lviv.lgs.customException;

public class BankAccount {
	private double balance;

	public BankAccount() {
		System.out.println("Thanks for creating account in our bank!");
		System.out.println("Now Your balance is : "+ balance);
	}
	
	public void makeDeposit(double amount) {
		balance +=amount;
		System.out.println("U added "+ amount +" $ to balance and now Your balance is = " + balance);
	}
	
	public void withdrawMoney(double amount) throws NoMoneyException {
		if(amount <balance) {
			balance -= amount;
			System.out.println("U withdraw "+ amount +" $ from balance and now Your balance is = " + balance);
		}else {
			double lackOfMoney = amount -balance;
			String message = "U tried to withdraw "+ amount +" $ from balance and but Your balance is = " + balance+" please add more = "+lackOfMoney;
			throw new NoMoneyException(message);
		}
	}
	
	
}
