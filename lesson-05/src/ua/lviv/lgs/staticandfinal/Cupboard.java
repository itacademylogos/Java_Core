package ua.lviv.lgs.staticandfinal;

public class Cupboard {

	Bowl b3 = new Bowl(3);
	static Bowl b4 = new Bowl(4);

	public Cupboard() {
		System.out.println("Cupboard()");
		b5.f1(2);
	}

	void f3(int marker) {
		System.out.println("f3(" + marker + ")");
	}

	static Bowl b5 = new Bowl(5);

}
