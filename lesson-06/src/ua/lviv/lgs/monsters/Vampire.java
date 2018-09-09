package ua.lviv.lgs.monsters;

public interface Vampire extends DangerousMonster, Lethal{
	void drinkBlood();
	
	static void printKilledPerson(String name) {
		System.out.println("VAmpire killed "+ name);
	}
	
}
