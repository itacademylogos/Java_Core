package ua.lviv.lgs.monsters;

public class MonsterShow {

	
	static void eat(Monster m) {
		m.eat();
	}
	
	
	static void eatDestroy(DangerousMonster m) {
		m.eat();
		m.destroy();
	}
	
	static void kill(Lethal l) {
		l.kill();
	}
	
	
	
	public static void main(String[] args) {
		
		
		DangerousMonster rex = new DragonZilla();
		rex.testKillALL();
		eatDestroy(rex);
		eat(rex);
		
		Vampire dracula = new BadVampire();
		dracula.testKillALL();
		eat(dracula);
		eatDestroy(dracula);
		kill(dracula);
		
		Vampire.printKilledPerson("James");
		
	}
	
	
}
