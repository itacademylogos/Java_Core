package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<>();
		stringList.add("Joye");
		stringList.add("Peter");
		stringList.add("Yura");
		stringList.add("Andrew");
		stringList.add("John");
		stringList.add("Ivan");
		stringList.add("Taras");
		
		Iterator<String> iterator = stringList.iterator();
		
		while(iterator.hasNext()) {
			String next = iterator.next();
			System.out.println("Collection ---<>--- "+ next);
		}
		
		
		Iterator<String> iterator2 = stringList.iterator();
		
		while(iterator2.hasNext()) {
			String next = iterator2.next();
			if(next.contains("a")) {
				iterator2.remove();
			}
		}	
		
		System.out.println();
		Iterator<String> iterator3 = stringList.iterator();
		
		while(iterator3.hasNext()) {
			String next = iterator3.next();
			System.out.println("Collection ---<>--- "+ next);
		}
		
	}

}
