package ua.lviv.lgs.monsters;

public class BadVampire implements Vampire{

	@Override
	public void destroy() {
		System.out.println("Vampire will destroy You");
	}

	@Override
	public void eat() {
		System.out.println("Vampire will eat You");
	}

	@Override
	public void kill() {
		System.out.println("Vampire will kill You");
	}

	@Override
	public void drinkBlood() {
		System.out.println("Vampire will drink You");
	}
	
	@Override
	public void testKillALL() {
		System.out.println("Test Vampire Kill All");
	}

}
