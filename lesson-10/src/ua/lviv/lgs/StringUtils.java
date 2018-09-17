package ua.lviv.lgs;

import java.util.Arrays;

public class StringUtils {

	public static void main(String[] args) {
	 
		String s  = new String("Java");
		
		System.out.println(s.charAt(0));
		
		System.out.println(s.codePointAt(1));
		
		System.out.println(s.compareTo("java"));
		
		System.out.println(s.compareToIgnoreCase("java"));
		
		System.out.println(s.concat(" is the best language"));
		
		System.out.println(s.equals("JavA"));
		
		System.out.println(s.equalsIgnoreCase("JavA"));
		
		System.out.println(s.hashCode());
		
		System.out.println(s.indexOf("a"));
		
		System.out.println(s.isEmpty());
		
		String s2 = "Java is good language";
		
		System.out.println(Arrays.toString(s.split("")));
		
		System.out.println(s2.substring(5));
		
		System.out.println(s2.substring(5, 7));
		
		System.out.println(s2.toLowerCase());
		
		System.out.println(s2.toUpperCase());
		
		System.out.println(s2.endsWith("age"));
		
		System.out.println(s2.startsWith("Java"));
		
		System.out.println(s2.length());
		
		System.out.println(s2.contains("good"));
		
		System.out.println(s2.contentEquals("Java"));
		
		s2.intern(); //move object to string pool
		
		String s3 = "    Run forest  run !    ";
		
		System.out.println(s3.trim());
		
		
		System.out.println(String.format("Integer :  %d", 23));
		
		System.out.println(String.format("Floating poin: %.3f", 1.21312939));
		
		System.out.println(String.format("Floating poin: %.12f", 1.21312939));
		
		char chars[]  = s.toCharArray();
		
		System.out.println(Arrays.toString(chars));
		
		System.out.println(s.valueOf(chars));
		
		System.out.println(String.copyValueOf(chars));
		
		System.out.println(String.join(" <<<>>> ", s, s2, s3));
		
		
	}

}
