package ua.lviv.lgs.ifaces;

public class Truck  extends Vehicle{

	private double maxLoad;
	private double length;
	
	
	public Truck(String model, int maxSpeed, double price, double maxLoad, double length) {
		super(model, maxSpeed, price);
		this.maxLoad = maxLoad;
		this.length = length;
	}


	public double getMaxLoad() {
		return maxLoad;
	}


	public void setMaxLoad(double maxLoad) {
		this.maxLoad = maxLoad;
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	@Override
	public String toString() {
		return "Truck [maxLoad=" + maxLoad + ", length=" + length + ", toString()=" + super.toString() + "]";
	}
	
}
