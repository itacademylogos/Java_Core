package ua.lviv.lgs;

@FunctionalInterface
public interface ApplicationDefaultMethods extends CustomIntrefaceOne, CustomIntrefaceTwo{
	@Override
	default void regularDefaultMethod() {
		CustomIntrefaceOne.super.regularDefaultMethod();
	}
	
}

@FunctionalInterface
interface CustomIntrefaceOne{
	String customMethod();
	
	default void regularDefaultMethod() {
		System.out.println("Hi");
	}
}


@FunctionalInterface
interface CustomIntrefaceTwo{
	String customMethod();
	
	default void regularDefaultMethod() {
		System.out.println("Bye");
	}
}
