package ua.lviv.lgs.abstracts;

public class Animal extends Creature {

	private String breed;
	private int maxSpeed;

	public Animal(double weight, int height, String breed, int maxSpeed) {
		super(weight, height);
		this.breed = breed;
		this.maxSpeed = maxSpeed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	

	@Override
	public String toString() {
		return "Animal [breed=" + breed + ", maxSpeed=" + maxSpeed + ", toString()=" + super.toString() + "]";
	}

	@Override
	void move() {
		System.out.println("Animal is moving");
	}

	@Override
	void eat() {
		System.out.println("Animal is eating");
	}

}
