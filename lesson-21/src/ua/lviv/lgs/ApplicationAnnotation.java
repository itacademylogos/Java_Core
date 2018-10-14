package ua.lviv.lgs;

import java.lang.reflect.Field;

public class ApplicationAnnotation {
	public static void main(String[] args) {
		getAnnoationValue(Droid.class);
		System.out.println();
		getNotAnnoationValue(Droid.class);
		System.out.println();
		getAnnoatedFiledsAndValues(Student.class);
	}

	public static void getAnnoationValue(Class<?> customClass) {

		Field[] fields = customClass.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

			if (field.getAnnotation(Fielder.class) instanceof Fielder) {
				System.out.print(field.getName() + " -----  ");
				System.out.println(" annotaion value = " + field.getAnnotation(Fielder.class).params());
			}
		}
	}
	
	public static void getNotAnnoationValue(Class<?> customClass) {

		Field[] fields = customClass.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

			if (!(field.getAnnotation(Fielder.class) instanceof Fielder)) {
				System.out.println(field.getType() + " " + field.getName() + " ----->  ");
			}
		}
	}

	public static void getAnnoatedFiledsAndValues(Class<?> customClass) {

		Field[] fields = customClass.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

			if (field.getAnnotation(StudentSocial.class) instanceof StudentSocial) {
				System.out.println(field.getType() + " " + field.getName() + " ----->  ");
				System.out.println(" annotaion type = " + field.getAnnotation(StudentSocial.class).annotationType());
				System.out.println(" annotaion value = " + field.getAnnotation(StudentSocial.class).value());
			}
		}
	}

}
