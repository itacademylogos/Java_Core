package ua.lviv.lgs;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentIterations {
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(2, "Peter", 23));
		students.add(new Student(1, "Adrew", 33));
		students.add(new Student(3, "Levan", 19));
		students.add(new Student(5, "Pavlo", 42));
		students.add(new Student(4, "Joseph", 55));
		
		Iterator<Student> iterator = students.iterator();
		
		while(iterator.hasNext()) {
			Student next = iterator.next();
			
			if(next.getAge()>30 || next.getLevel()>2) {
				System.out.println(next);
				iterator.remove();
			}
		}
		
		//will throw exception
//		for (Student student : students) {
//			if(student.getAge()>20) {
//				students.remove(student);
//			}
//		}
		
		//will go lose some objects during removing others
//		for (int i = 0; i < students.size(); i++) {
//			if(students.get(i).getAge()>20) {
//				students.remove(i);
//			}
//		}
//		for (Student student : students) {
//			System.out.println(student);
//		}
		
		
		
	}
}
