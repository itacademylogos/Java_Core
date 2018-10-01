package ua.lviv.lgs;

import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ApplicationTreeMap {
	public static void main(String[] args) {

		SortedMap<Integer, String> map = new TreeMap<>();
		map.put(345, "Petro");
		map.put(3, "Johns");
		map.put(18, "Andrew");
		map.put(76, "Eva");
		map.put(28, "Pavlo");

//		System.out.println(map);
//		System.out.println(map.subMap(3,28));	
//		System.out.println(map.headMap(76));
//		System.out.println(map.tailMap(76));

		Map<Person, Integer> map2 = new TreeMap<>();
		map2.put(new Person("Ringo", 13), 2);
		map2.put(new Person("Evelina", 17), 2);
		map2.put(new Person("Pall", 19), 3);
		map2.put(new Person("Jackson", 47), 4);
		map2.put(new Person("Kira", 27), 5);

		for (Entry<Person, Integer> entry : map2.entrySet()) {
			System.out.println(entry.getKey() + "--->" + entry.getValue());
		}

	}

}

class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		return this.age > o.getAge() ? 1 : -1;
	}

}
