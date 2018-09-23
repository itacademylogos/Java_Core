package ua.lviv.lgs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class HashSetApplication {

	public static void main(String[] args) {

//		Set<Double> setDouble = new HashSet<>();
//		setDouble.add(3.2);
//		setDouble.add(1.7);
//		setDouble.add(0.9);
//
//		System.out.println(setDouble);
//
//		System.out.println(setDouble.contains(3.2));
//
//		System.out.println(setDouble.isEmpty());
//
//		System.out.println(setDouble.hashCode());
//
//		System.out.println(setDouble.toString());
//
//		System.out.println(setDouble.size());
//
//		Set<Double> setDouble2 = new HashSet<>();
//		setDouble2.add(3.2);
//		setDouble2.add(2.7);
//		setDouble2.add(1.9);
//
//		setDouble.retainAll(setDouble2);
//		System.out.println(setDouble);
//
//		setDouble.clear();
//		System.out.println(setDouble);
//
//		Object[] array = setDouble2.toArray();
//		System.out.println(Arrays.toString(array));
//
//		System.out.println();
//
//		System.out.println("Iterator");
//		Iterator<Double> iterator = setDouble2.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//
//		Iterator<Double> iterator2 = setDouble2.iterator();
//		while (iterator2.hasNext()) {
//			Double next = iterator2.next();
//			if (next < 2) {
//				iterator2.remove();
//			}
//		}
//
//		System.out.println();
//		System.out.println("after removing :");
//		for (Object object : setDouble2) {
//			System.out.println(object);
//		}
//		
//		
//		
//		
//		System.out.println();
//		
//		Set<String> setString = new HashSet<>();
//		setString.add("A");
//		setString.add("B");
//		setString.add("C");
//		setString.add("A");
//		setString.add("A");
//		System.out.println(setString);
		
		
		Set<Person> setOfPersons = new HashSet<>();
		setOfPersons.add(new Person("Eduardo", 25));
		setOfPersons.add(new Person("Eduardo", 25));
		setOfPersons.add(new Person("Eduardo", 25));
		
		for (Person person : setOfPersons) {
			System.out.println(person);
		}
		
	}

}
