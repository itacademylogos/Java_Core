package ua.lviv.lgs;

import java.sql.SQLClientInfoException;
import java.util.Optional;

public class ApplicationOptional {
	public static void main(String[] args) throws SQLClientInfoException {

		// 1. empty optional
		Optional<String> emptyObj = Optional.empty();

		if (!emptyObj.isPresent()) {
			System.out.println("emptyObj is empty");
		}

		// 2. create optional
		String testName = "Logos";
		Optional<String> ofObj = Optional.of(testName);

		if (!ofObj.isPresent()) {
			System.out.println("ofObj is empty");
		}

		// 3. work with null

		testName = null;
		Optional<String> nullableObj = Optional.ofNullable(testName);

		if (!nullableObj.isPresent()) {
			System.out.println("nullableObj is empty");
		}

		// 4. if-present
		Optional<String> optObjt = Optional.of("test from Logos");
		optObjt.ifPresent(o -> System.out.println(o.length()));

		// 5. or-else
		String nameObj = Optional.ofNullable(testName).orElse("Default String");
		System.out.println(nameObj);

		// 6.orElseGet
		nameObj = Optional.ofNullable(testName).orElseGet(() -> "run forest run");
		System.out.println(nameObj);

		// 7.or-else throw
//		nameObj = Optional.ofNullable(testName).orElseThrow(SQLClientInfoException::new);

		// 8.get

		optObjt = Optional.of("test name");
		System.out.println(optObjt.get());

		// 9 filter
		Integer year = 2018;
		Optional<Integer> yearOptional = Optional.of(year);
		boolean is2017 = yearOptional.filter(y -> y == 2017).isPresent();
		boolean is2018 = yearOptional.filter(y -> y == 2018).isPresent();
		System.out.println("It is 2017 year = " + is2017);
		System.out.println("It is 2018 year = " + is2018);

	}
}
