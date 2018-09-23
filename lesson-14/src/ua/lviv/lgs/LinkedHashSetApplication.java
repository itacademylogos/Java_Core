package ua.lviv.lgs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetApplication {

	public static void main(String[] args) {

		LinkedHashSet<Person> lhs = new LinkedHashSet<>();
		lhs.add(new Person("Eduardo", 25));
		lhs.add(new Person("Alexandro", 55));
		lhs.add(new Person("Lisa", 15));
		lhs.add(new Person("Torben", 76));
		lhs.add(new Person("Rasmus", 44));
		
		for (Person person : lhs) {
			System.out.println(person);
		}
		
		
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("Eduardo", 25));
		hs.add(new Person("Alexandro", 55));
		hs.add(new Person("Lisa", 15));
		hs.add(new Person("Torben", 76));
		hs.add(new Person("Rasmus", 44));
		
		System.out.println();


		for (Person person : hs) {
			System.out.println(person);
		}
		
	}

}
