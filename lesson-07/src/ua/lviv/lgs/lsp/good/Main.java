package ua.lviv.lgs.lsp.good;



public class Main {
public static void main(String[] args) {
	
	Rectangle r1 = new Rectangle();
	r1.setHeight(10);
	r1.setWidth(5);
	System.out.println(r1.calculateSquire());
	
	Square r2 = new Square();
	r2.setWidth(5);
	System.out.println(r2.calculateSquire());
	
	
	calculateSquire(r1);
	calculateSquire(r2);
	
}

	 static void calculateSquire(Squire squire) {
		System.out.println(squire.calculateSquire());
	}

}
