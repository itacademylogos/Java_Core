package ua.lviv.lgs;

public class ApplicationEffectiveFinal {
	public void customMethod() {

		String localVariable = "Local";

		CustomFnInterface ci = p -> {
			// cannot cahnge because of effective final
//			localVariable+=2;
			return localVariable;
		};

	}
}

@FunctionalInterface
interface CustomFnInterface {
	String test(String s);
}
