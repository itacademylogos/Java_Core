package ua.lviv.lgs;

public class StringBufferUtil {

	public static void main(String[] args) {
		
		
		StringBuffer sb = new StringBuffer("Start");
		
		System.out.println(sb.append(" is not finish").append(" but a good").append(" start"));
		
		System.out.println(sb.length());
		
		System.out.println(sb.capacity());
		
		System.out.println(sb.charAt(0));
		
		System.out.println(sb.codePointAt(1));
		
		System.out.println(sb.equals("java"));
		
		System.out.println(sb.indexOf("s", 0));
		
		System.out.println(sb.lastIndexOf("s"));
		
		System.out.println(sb.delete(10, 20));
		
		System.out.println(sb.deleteCharAt(0));
		
		System.out.println(sb.insert(3, " Flow"));
		
		System.out.println(sb.reverse());
		

	}

}
