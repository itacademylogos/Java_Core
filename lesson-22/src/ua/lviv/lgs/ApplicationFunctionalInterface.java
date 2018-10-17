package ua.lviv.lgs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ApplicationFunctionalInterface {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.println("Show all numbers");
		eval(list, n->true);
		
		eval(list, n->n%2==0);
			
		eval(list, n->n>6);
		
	}
	
	
	public static void eval(List<Integer> list, Predicate <Integer> predicate ) {
		for (Integer integer : list) {
			if(predicate.test(integer)) {
				System.out.println(integer);
			}
		}
		System.out.println();
	}

}
