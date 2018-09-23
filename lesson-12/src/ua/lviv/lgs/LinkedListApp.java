package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListApp {
	public static void main(String[] args) {

		LinkedList list1 = new LinkedList();
		list1.add("A");
		list1.add(12);
		list1.add('w');
		list1.add(0.7);
		list1.add(new Person("Karl", 32));
		list1.add("A");
		System.out.println(list1);
		
		list1.addFirst("ZZZ");
		System.out.println(list1);
		list1.addLast("ZZZ");

		System.out.println(list1);
		
		
		list1.offer("OOO");
		System.out.println(list1);
		list1.poll();
		System.out.println(list1);
		list1.poll();
		System.out.println(list1);
		list1.pollLast();
		System.out.println(list1);
		
		System.out.println(list1.pop());
		System.out.println(list1);
	}
}
