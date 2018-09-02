package ua.lviv.lgs.inheritance;

public class Application {
	public static void main(String[] args) {
		
		Human h = new Human("Peter", 100);
		System.out.println(h);
		
		
		Student s = new Student("Ivan", 22, 1, "NULP");
		System.out.println(s);
		
		
		Waiter w = new Waiter("Vasyl", 34, 8.8, 12.9 );
		System.out.println(w);
		w.setTips(19);
		
		w.setHourPayRate(11.5);
		System.out.println(w);
		
	}
}
