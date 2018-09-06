package ua.lviv.lgs.staticandfinal;

public class StaticClassMain {
	public static void main(String[] args) {

		StaticClass s = new StaticClass();
		System.out.println(s.myName);
		
		System.out.println(StaticClass.MY_NAME);
	
		StaticClass.sayHello();
		
	}
}
