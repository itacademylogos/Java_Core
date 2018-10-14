package ua.lviv.lgs;

public class Student {

	@StudentSocial("great name ")
	private String name;
	@StudentSocial("You look older")
	private int age;
	@StudentSocial("We need you to becaume heigher")
	private int height;
	@StudentSocial("We need You to loose some weight")
	private int weight;

	public Student(String name, int age, int height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}

}
