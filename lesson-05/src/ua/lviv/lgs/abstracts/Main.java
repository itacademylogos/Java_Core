package ua.lviv.lgs.abstracts;

public class Main {
	public static void main(String[] args) {

		//cannot do because of abstract class
		//Creature c = new Creature();
		
		Human h = new Human (123,190,"Huan", 23);
		System.out.println(h);
		
		h.eat();
		h.move();
		
		System.out.println();
		
		Animal a = new Animal(230,  120, "Hippo",60);
		System.out.println(a);
		a.eat();
		a.move();
		
		
		
	}
}
