package ua.lviv.lgs.composition;

public class Person {
	private String name;
	private int age;
	private Wallet wallet;
	
	public Person(String name, int age, Wallet wallet) {
		super();
		this.name = name;
		this.age = age;
		this.wallet = wallet;
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

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", wallet=" + wallet + "]";
	}
	
}
