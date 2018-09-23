package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppConsole {

	public static void main(String[] args) {
		List<Person> list5 = new ArrayList<>();
		list5.add(new Person("Hugo", 23));
		list5.add(new Person("Pedro", 18));
		list5.add(new Person("Chan", 12));
		list5.add(new Person("Huanita", 34));
		list5.add(new Person("Ivan", 23));

		while (true) {
			System.out.println(
					"press 1 to delete by name " + "\npress 2 to delete by age " + "\npress 3 to show all collection ");
			Scanner sc = new Scanner(System.in);
			switch (sc.next()) {

			case "1": {
				System.out.println("Enter name :");
				sc = new Scanner(System.in);
				String name = sc.next();

				for (int i = 0; i < list5.size(); i++) {
					if (list5.get(i).getName().equalsIgnoreCase(name))
						list5.remove(i);
				}
				break;
			}
			case "2": {
				System.out.println("Enter age :");
				sc = new Scanner(System.in);
				int age = sc.nextInt();

				for (int i = 0; i < list5.size(); i++) {
					if (list5.get(i).getAge() == age)
						list5.remove(i);
				}
				break;
			}
			case "3": {
				for (Object o : list5) {
					System.out.println(o);
				}
			}
			}
		}

	}

}
