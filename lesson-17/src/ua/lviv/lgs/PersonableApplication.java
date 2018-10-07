package ua.lviv.lgs;

public class PersonableApplication {
	public static void main(String[] args) {

		
		PersonFactory pf = new PersonFactory();
		Personable sportsman = pf.createSportsMan();
		sportsman.eat();
		sportsman.move();
		sportsman.sleep();
		
		System.out.println();
		
		Personable houseWife = pf.createHouseWifeLocal();
		houseWife.eat();
		houseWife.move();
		houseWife.sleep();
		
		System.out.println();
		
		Personable anonymous = pf.createAnonymous();
		anonymous.eat();
		anonymous.move();
		anonymous.sleep();
		
		System.out.println();
		
		Personable golfPlayer = PersonFactory.createGolfPlayer();
		golfPlayer.eat();
		golfPlayer.move();
		golfPlayer.sleep();
		
		
		
	}
}
