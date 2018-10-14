package ua.lviv.lgs;

public class Droid {
	
	@Fielder(params = "Droid - name annotation")
	private String name;
	@Fielder(params = "Droid - height annotation")
	private int height;
	@Fielder(params = "Droid - impactLevel annotation")
	private int impactLevel;
	
	private int damage;

	public Droid(String name, int height, int impactLevel, int damage) {
		super();
		this.name = name;
		this.height = height;
		this.impactLevel = impactLevel;
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getImpactLevel() {
		return impactLevel;
	}

	public void setImpactLevel(int impactLevel) {
		this.impactLevel = impactLevel;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	@Override
	public String toString() {
		return "Droid [name=" + name + ", height=" + height + ", impactLevel=" + impactLevel + ", damage=" + damage
				+ "]";
	}
}
