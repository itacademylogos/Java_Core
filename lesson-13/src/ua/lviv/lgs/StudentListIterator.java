package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class StudentListIterator {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		students.add(new Student(2, "Peter", 23));
		students.add(new Student(1, "Adrew", 33));
		students.add(new Student(3, "Levan", 19));
		students.add(new Student(5, "Pavlo", 42));
		students.add(new Student(4, "Joseph", 55));
		
		
		ListIterator<Student> listIterator = students.listIterator();
		
		while(listIterator.hasNext()) {
			Student next = listIterator.next();
			System.out.println(next);
		}
		System.out.println();
		
		while(listIterator.hasPrevious()) {
			Student previous = listIterator.previous();
			
			if(previous.getLevel() == 5) {

				listIterator.add(new Student(6,"Albus", 70));
			}
		}
		
		
		while(listIterator.hasNext()) {
			Student next = listIterator.next();
			System.out.println(next);
		}
		System.out.println();
		
		
		while(listIterator.hasPrevious()) {
			Student previous = listIterator.previous();
			
			if(previous.getAge()<25) {
				listIterator.remove();
			}
		}
		
		
		while(listIterator.hasNext()) {
			Student next = listIterator.next();
			System.out.println(next);
		}
		System.out.println();
		
		
		
		while(listIterator.hasPrevious()) {
			Student previous = listIterator.previous();
			
//			if(listIterator.previousIndex() == 2) {
////				listIterator.remove();
				System.out.println(listIterator.previousIndex());
//			}
		}
		
		System.out.println();
		while(listIterator.hasNext()) {
			Student next = listIterator.next();
			System.out.println(listIterator.nextIndex());
		}
	
		
		
	}

}
