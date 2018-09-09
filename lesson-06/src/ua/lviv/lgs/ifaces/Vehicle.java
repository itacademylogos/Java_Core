package ua.lviv.lgs.ifaces;

public abstract class Vehicle {

	private String model;
	private int maxSpeed;
	private double price;
	
	public Vehicle(String model, int maxSpeed, double price) {
		super();
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", maxSpeed=" + maxSpeed + ", price=" + price + "]";
	}
	
}
