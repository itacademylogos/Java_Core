package ua.lviv.lgs.ocp.bad;

public class Concierge {
	String formality;
	
	public String greet() {
		if(this.formality == "formal") {
			return "Good evening, sir";
		}else if(this.formality == "casual") {
			return "What's up Bro?";
		}else if(this.formality =="family") {
			return "Hello darling";
		}
		return "Hello...";
	}
}
