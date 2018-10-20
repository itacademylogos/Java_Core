package ua.lviv.lgs;

import java.util.function.Function;

public class ApplicationFnInterfacesBP {
	public static void main(String[] args) {
		useCustomInterface();
		
		avoidCustomInterface();
	}

	public static void useCustomInterface() {
		CustomIntrefaceImpl ci = new CustomIntrefaceImpl();
		CustomInterface customInterface = p -> p + " hello world";
		String result = ci.useCustomMethod("use CustomMethod -->", customInterface);
		System.out.println(result);
		
	}
	
	public static void avoidCustomInterface() {
		CustomIntrefaceImpl ci = new CustomIntrefaceImpl();
		Function<String, String> customInterface = p -> p + " hello world";
		String result = ci.avoidCustomInterface("avoidCustomMethod -->", customInterface);
		System.out.println(result);
		
	}
}

//to be removed
@FunctionalInterface
interface CustomInterface {
	String customMethod(String string);
}

class CustomIntrefaceImpl {
	public String useCustomMethod(String string, CustomInterface customInterface) {
		return customInterface.customMethod(string);
	}

	public String avoidCustomInterface(String string, Function<String, String> fn) {
		return fn.apply(string);
	}
}
