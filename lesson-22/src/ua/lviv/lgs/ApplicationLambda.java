package ua.lviv.lgs;

public class ApplicationLambda {
	public static void main(String[] args) {

		MathOperations add = (int a, int b) -> a + b;
		MathOperations substract = (int a, int b) -> a - b;
		MathOperations multiply = (int a, int b) -> {
			return a * b;
		};
		MathOperations devision = (int a, int b) -> a / b;

		System.out.println(operate(1, 1, add));
		System.out.println(operate(10, 3, substract));
		System.out.println(operate(5, 4, multiply));
		System.out.println(operate(100, 20, devision));

		Greeings hi1 = messege -> System.out.println(messege);
		Greeings hi2 = messege -> System.out.println(messege +" Merry Christmas");
		
		
		hi1.sayHi("Hi Folks");
		hi2.sayHi("Hi Dude");
	}

	private static int operate(int a, int b, MathOperations operation) {
		return operation.operation(a, b);
	}

}

interface MathOperations {
	int operation(int a, int b);
}

interface Greeings {
	void sayHi(String msg);
}
