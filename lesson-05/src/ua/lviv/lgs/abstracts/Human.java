package ua.lviv.lgs.abstracts;

public class Human extends Creature {

	private String name;
	private int age;

	public Human(double weight, int height, String name, int age) {
		super(weight, height);
		this.name = name;
		this.age = age;
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


	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", toString()=" + super.toString() + "]";
	}

	@Override
	void move() {
		System.out.println("Human is moving");
	}

	@Override
	void eat() {
		System.out.println("Human is eating");
	}

}
