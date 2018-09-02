package ua.lviv.lgs.inheritance;

public class Waiter extends Human{

	private double hourPayRate;
	private double tips;
	
	Waiter(String name, int age) {
		super(name, age);
	}

	public Waiter(String name, int age, double hourPayRate, double tips) {
		super(name, age);
		this.hourPayRate = hourPayRate;
		this.tips = tips;
	}

	public double getHourPayRate() {
		return hourPayRate;
	}

	public double getTips() {
		return tips;
	}
	
	

	public void setHourPayRate(double hourPayRate) {
		this.hourPayRate = hourPayRate;
	}

	public void setTips(double tips) {
		this.tips = tips;
	}

	@Override
	public String toString() {
		return "Waiter [hourPayRate=" + hourPayRate + ", tips=" + tips + ", toString()=" + super.toString() + "]";
	}

}
