package ua.lviv.lgs.monsters;

public interface Monster {
	void eat();
	
	 default void testKillALL() {
		 System.out.println("Default kill all method");
	 };
}
