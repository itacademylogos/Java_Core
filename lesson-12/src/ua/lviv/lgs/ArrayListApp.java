package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListApp {

	public static void main(String[] args) {
		
		List list1 = new ArrayList();
		list1.add("A");
		list1.add(12);
		list1.add('w');
		list1.add(0.7);
		list1.add(new Person("Karl", 32));
		list1.add("A");
		
		System.out.println(list1);
		

		for (Object object : list1) {
//			System.out.println(object + " ____ ");
		}
		
		List list2 = new ArrayList<>();
		list2.addAll(list1);
		
		System.out.println(list2);
		
		list1.clear();
		System.out.println(list1);
		
		System.out.println(list2.contains(0.7));
		System.out.println(list2.containsAll(list1));
		
		
		System.out.println(list2.get(0));
		System.out.println(list2.size());
		System.out.println(list2.add("Text custom text"));
		System.out.println(list2);
		
		System.out.println(list2.isEmpty());
		System.out.println(list1.isEmpty());
		
		list1.add( 10000000);
		
		System.out.println(list2.addAll(3,list1));
		System.out.println(list2);
		
		System.out.println(list2.equals(list1));
		System.out.println(list2.equals(list2));
		
		System.out.println(list2.hashCode());
		System.out.println(list2.indexOf("A"));
		System.out.println(list2.lastIndexOf("A"));
		
		System.out.println(list2);
		System.out.println(list2.remove(0));
		System.out.println(list2);
		
		System.out.println(list2.remove("A"));
		System.out.println(list2);
		
//		List list3 = new ArrayList();
//		
//		list3.add(0.7);
//		list3.add(12);
//		list3.add(0.888);
//		list3.add(123);
//		System.out.println(list2.retainAll(list3));
//		System.out.println(list2);
		System.out.println(list2);
		List list4 = list2.subList(3, 6);
		
		System.out.println(list4);
		
		System.out.println(Arrays.toString(list2.toArray()));
	}

}
