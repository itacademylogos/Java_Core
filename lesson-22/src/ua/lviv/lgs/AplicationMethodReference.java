package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;

public class AplicationMethodReference {
	public static void main(String[] args) {

		List<String> namesOfpeople = new ArrayList<>();
		namesOfpeople.add("Ivan");
		namesOfpeople.add("Petro");
		namesOfpeople.add("John");
		namesOfpeople.add("Chris");
		namesOfpeople.add("Simon");
		namesOfpeople.add("Yura");
		
		namesOfpeople.forEach(System.out::println);
		
	}
}
