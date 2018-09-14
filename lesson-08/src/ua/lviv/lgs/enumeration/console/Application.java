package ua.lviv.lgs.enumeration.console;

import java.util.Scanner;

public class Application {

	enum Direction {
		NORTH, SOUTH, WEST, EAST;
	}

	enum Continent {

		AUSTARLIA(Direction.NORTH), OCEANIA(Direction.SOUTH), ASIA(Direction.WEST), AMERICA(Direction.EAST),
		ANTARCTICA(Direction.NORTH), AFRICA(Direction.NORTH), EUROPE(Direction.SOUTH);

		Direction direction;

		Continent(Direction direction) {
			this.direction = direction;
		}

		public Direction getDirection() {
			return direction;
		}

	}

	static void menu() {
		System.out.println("Натичніть 1, щоб перевірити чи такий континент існує");
		System.out.println("Натичніть 2, щоб вивести всі континенти  із таким жиш напрямком");
		System.out.println("Натичніть 3, щоб наступний континент");
	}

	public static void main(String[] args) {

		Continent[] mas = Continent.values();
		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();

			switch (sc.next()) {

				case "1": {
					System.out.println("Enter Continent");
					sc = new Scanner(System.in);
					String continent = sc.next().toUpperCase();
	
					boolean flag = isContinentPresent(mas, continent);
	
					if (!flag) {
						System.out.println("Continent doesnt exit");
					}
					break;
				}
				
				case "2" : {
					System.out.println("Enter direction");
					sc = new Scanner(System.in);
					String directionSc = sc.next().toUpperCase();
	
					
					boolean flag = false;
					
					for (Continent c : mas) {
						if (c.getDirection().name().equals(directionSc)) {
							flag = true;
						}
					}
				
					if(flag) {
						Direction dir = Direction.valueOf(directionSc);
						
						for(Continent cont: mas) {
							if(cont.getDirection().toString().equalsIgnoreCase(directionSc)){
								System.out.println(cont);
							}
						}
					}
					
					if (!flag) {
						System.out.println("Continent doesnt exit");
					}
					break;
				}
				
				case "3": {
					System.out.println("Enter Continent");
					sc = new Scanner(System.in);
					String continent = sc.next().toUpperCase();
	
					boolean flag = isContinentPresent(mas, continent);
					
					if(flag) {
						Continent cont2= Continent.valueOf(continent);
						int ordinal  = cont2.ordinal();
						
						if(ordinal == (mas.length -1)) {
							ordinal = 0;
							System.out.println(mas[ordinal]);
						}else {
							System.out.println(mas[ordinal+1]);	
						}
					}
	
					if (!flag) {
						System.out.println("Continent doesnt exit");
					}
					break;
				}
				
			}

		}

	}

	private static boolean isContinentPresent(Continent[] mas, String continent) {
		boolean flag = false;

		for (Continent c : mas) {

			if (c.name().equals(continent)) {
				System.out.println("Continent exist");
				flag = true;
			}
		}
		return flag;
	}

}
