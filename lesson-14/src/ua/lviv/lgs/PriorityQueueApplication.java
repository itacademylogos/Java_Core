package ua.lviv.lgs;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueApplication {

	public static void main(String[] args) {

		PriorityQueue<Person> pq = new PriorityQueue<>(new PersonAgeComparator());
		pq.add(new Person("Eduardo", 25));
		pq.add(new Person("Alexandro", 55));
		pq.add(new Person("Alexandro", 88));
		pq.add(new Person("Lisa", 15));
		pq.add(new Person("Torben", 76));
		pq.add(new Person("Rasmus", 44));

		for (Person person : pq) {
			System.out.println(person);
		}

		pq.remove();
		pq.poll();
		System.out.println();
		for (Person person : pq) {
			System.out.println(person);
		}

		System.out.println();
		System.out.println(pq.element());	
		System.out.println(pq.peek());
		System.out.println();
		
		
		
		for (Person person : pq) {
			System.out.println(person);
		}
		
		System.out.println();
		pq.offer(new Person("Rasmus", 44));
		
		for (Person person : pq) {
			System.out.println(person);
		}
	}

}

class PersonAgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getAge() > o2.getAge() ? 1 : -1;
	}

}
