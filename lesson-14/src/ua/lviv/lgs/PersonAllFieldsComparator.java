package ua.lviv.lgs;

import java.util.Comparator;

public class PersonAllFieldsComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		if (o1.getName().compareTo(o2.getName()) > 0) {
			return 1;
		} else if (o1.getName().compareTo(o2.getName()) < 0) {
			return -1;
		} else {
			if(o1.getAge()> o2.getAge()) {
				return 1;
			} else if (o1.getAge()< o2.getAge()) {
				return -1;
			}
		}
		
		return 0;
	}

}
