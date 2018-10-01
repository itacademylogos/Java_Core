package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Application {
	public static void main(String[] args) {

		Map<String, List<Student>> map = new HashMap<>();
		
		//create new Group
		map.put("Group-1", new ArrayList<>());
		map.put("Group-2", new ArrayList<>());
		map.put("Group-3", new ArrayList<>());
		System.out.println(map);
		
		//add students to group
		Student st = new Student("Petro", 27);
		Student st2 = new Student("Andrew", 54);
		//group-2
		
		Iterator<Entry<String, List<Student>>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Entry<String, List<Student>> next = iterator.next();
			if(next.getKey().equals("Group-2")) {
				List<Student> value = next.getValue();
				value.add(st);
				value.add(st2);
				next.setValue(value);
			}
		}
		
		System.out.println(map);
		
	Iterator<Entry<String, List<Student>>> iterator2 = map.entrySet().iterator();
		
		while(iterator2.hasNext()) {
			Entry<String, List<Student>> next = iterator2.next();
			if(next.getKey().equals("Group-2")) {
				List<Student> groupMembers = next.getValue();
					Iterator<Student> iterator3 = groupMembers.iterator();
						while(iterator3.hasNext()) {
							Student next2 = iterator3.next();
							if(next2.getName().equalsIgnoreCase("petro")) {
								iterator3.remove();
							}
						}
			}
		}
		
		System.out.println(map);
		
		
		
		
		
	}
}

class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
