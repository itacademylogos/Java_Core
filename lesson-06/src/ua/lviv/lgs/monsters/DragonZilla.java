package ua.lviv.lgs.monsters;

public class DragonZilla implements DangerousMonster {

	@Override
	public void destroy() {
		System.out.println("I'm DragonZilla - I will destroy everythink");
	}

	@Override
	public void eat() {
		System.out.println("I'm DragonZilla - I will eat You");
	}

}
