package ua.lviv.lgs.composition;

public class Application {
	public static void main(String[] args) {

		Person p = new Person("John", 45, new Wallet(200, 5.5));
		System.out.println(p);
		
		
		Wallet w = new Wallet(200, 5.5);
		w.setAmountOfMoney(400);
		Person p2 = new Person("John", 45, w);
		System.out.println(p2);
		
		
	}
}
