package ua.lviv.lgs;

import java.util.TreeSet;

public class TreeSetApplication {

	public static void main(String[] args) {
		
		TreeSet<Person> ts = new TreeSet<>(new PersonAllFieldsComparator());
		ts.add(new Person("Eduardo", 25));
		ts.add(new Person("Alexandro", 55));
		ts.add(new Person("Alexandro", 88));
		ts.add(new Person("Lisa", 15));
		ts.add(new Person("Torben", 76));
		ts.add(new Person("Rasmus", 44));
		
		for (Person person : ts) {
			System.out.println(person);
		}

		
		
	}

}
