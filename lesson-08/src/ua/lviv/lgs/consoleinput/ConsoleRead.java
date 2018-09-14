package ua.lviv.lgs.consoleinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleRead {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		runScanner();
//		calculate();
		runReader();
	}
	
	
	public static void runScanner() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		
		double number = scanner.nextDouble();
		 if(number % 1 == 0) {
			 System.out.println("Ціле");
			  
			 if(number % 2 == 0) {
				 System.out.println("Парне ");
			 } else {
				 System.out.println("Не парне ");
			 }
		 }else {
			 System.out.println("Дробове");
		 }
		
	}
	
	
	
	public static void calculate() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		
		double first = scanner.nextDouble();
		
		System.out.println("Enter second number: ");
		double second = scanner.nextDouble();
		
		System.out.println("Sum is equal : "+ (first+second));
		
	}
	
	
	public static void runReader() throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number: ");
		
		double number = Double.parseDouble(br.readLine());
		 if(number % 1 == 0) {
			 System.out.println("Ціле");
			  
			 if(number % 2 == 0) {
				 System.out.println("Парне ");
			 } else {
				 System.out.println("Не парне ");
			 }
		 }else {
			 System.out.println("Дробове");
		 }
	}
	
	
}
