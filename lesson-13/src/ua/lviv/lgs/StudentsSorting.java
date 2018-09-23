package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsSorting {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(2, "Peter", 23));
		students.add(new Student(2, "Alexandro", 23));
		students.add(new Student(2, "Alexandro", 44));
		students.add(new Student(2, "Alexandro", 44));
		students.add(new Student(1, "Adrew", 33));
		students.add(new Student(3, "Levan", 19));
		students.add(new Student(5, "Pavlo", 42));
		students.add(new Student(4, "Joseph", 55));
		
		System.out.println("Before sorting:");
		for (Student student : students) {
			System.out.println(student);
		}
		
//		//sorting using Comparable
//		Collections.sort(students);
		
		
//		//using Comparator by age
//		Collections.sort(students, new StudentAgeComparator());
		
//		//using Comparator by name
//		Collections.sort(students, new StudentNameComparator());
		
		//using Comparator by name
		Collections.sort(students, new StudentAllFieldsComparator());
		
		
		
		System.out.println();
		System.out.println("after sorting:");
		for (Student student : students) {
			System.out.println(student);
		}
		
	
		
		

	}

}
