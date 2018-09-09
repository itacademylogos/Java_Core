package ua.lviv.lgs.ocp.good;

public class Greeter {
	Personality  personality;
	
	public Greeter(Personality personality) {
		this.personality = personality;
	}
	
	public String greet() {
		return personality.greet();
	}
}
