package ua.lviv.lgs.staticandfinal;


public class Table extends StaticClass{
	static Bowl b1 = new Bowl(1);

	Table() {
		System.out.println("Table()");
		b1.f1(1);
	}

	static Bowl b2 = new Bowl(2);

	void f2(int marker) {
		System.out.println("f2(" + marker + ")");
	}
	
}
