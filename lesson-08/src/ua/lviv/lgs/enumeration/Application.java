package ua.lviv.lgs.enumeration;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
	
		Seasons s = Seasons.SPRING;
		
		System.out.println(s.name());
		System.out.println(s.compareTo(Seasons.FALL));
		System.out.println(s.compareTo(Seasons.SPRING));
		System.out.println(s.ordinal());
		System.out.println(s.toString());
		System.out.println(s.getDeclaringClass());
		System.out.println(Arrays.toString(s.values()));
		
		Seasons s2 = Seasons.valueOf("WINTER");
		System.out.println(s2.name());
	}
	
}
