package ua.lviv.lgs.ifaces;

public class Application {
	public static void main(String[] args) {

		
		Ferrari f360 =new Ferrari("F360", 320, 1000000, "Sparco");
		System.out.println(f360);
		
		f360.addSpeed();
		
		System.out.println(f360);
		
		
	}
}
