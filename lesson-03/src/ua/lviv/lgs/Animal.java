package ua.lviv.lgs;

public class Animal {

	private String type;
	private String name;
	private int age;
	private String color;
	


	Animal (){
		this.type = "Gorilla";
	}
	
	Animal (int age) {
		this.age = age;
	}
	
	
	Animal (String type, String name, int age, String color){
		this.type = type;
		this.name= name;
		this.age = age;
		this.color = color;
	}
	
	
	public void scream () {
		System.out.println("Monkey is Screaming!!!!");
	}
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", name=" + name + ", age=" + age + ", color=" + color + "]";
	}
	
}
