package ua.lviv.lgs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Application {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

		Class pc = Person.class;

		// get name of class
		String nameOfClass = pc.getName();
		System.out.println("Name of class = " + nameOfClass);

		String simpleName = pc.getSimpleName();
		System.out.println("Simple name  =  " + simpleName);

		// get Modifier
		int modifier = pc.getModifiers();
		String modifierText = Modifier.toString(modifier);
		System.out.println("Class modifier = " + modifierText + " int = " + modifier);

		System.out.println("is static = " + Modifier.isStatic(modifier));
		System.out.println("is public = " + Modifier.isPublic(modifier));
		System.out.println("is abstract = " + Modifier.isAbstract(modifier));

		// package info
		Package classPackage = pc.getPackage();
		System.out.println("Package of current class = " + classPackage);

		// get superclasses
		Class superClass = pc.getSuperclass();
		System.out.println("Super class = " + superClass);

		// get interfaces
		Class[] interfaces = pc.getInterfaces();
		System.out.println("Interfaces =  " + Arrays.toString(interfaces));

		// getConstructor
		Constructor<Person>[] personConstractor = pc.getConstructors();

		for (int i = 0; i < personConstractor.length; i++) {
			Constructor<Person> constructor = personConstractor[i];
			System.out.println("Constractor = " + constructor);
		}

		System.out.println("Constructors size = " + personConstractor.length);

		// get param types of constructor

		Constructor<Person> constructor = personConstractor[0];

		Class<?>[] parameterTypes = constructor.getParameterTypes();
		for (int i = 0; i < parameterTypes.length; i++) {
			Class<?> class1 = parameterTypes[i];
			System.out.println(class1);
		}

		// get Consctuctor by parameters
		Constructor<Person> singleConstructor = pc.getConstructor(String.class, int.class);
		System.out.println("single consctror = " + singleConstructor);
		Person newInstancePerson = singleConstructor.newInstance("Petro", 22);
		System.out.println("reflection Person = " + newInstancePerson);

		// get Fields
		Field[] fields = pc.getFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println(field);
		}
		System.out.println();
		fields = pc.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println(field);
		}
		
		
		//field set
		Field ageField = pc.getField("age");
		ageField.set(newInstancePerson, 100);
		System.out.println("Person new age"+ newInstancePerson);
		
		Field privateLastNameField = fields[3];
		privateLastNameField.setAccessible(true);
		System.out.println("privateb Value = "+ privateLastNameField.get(newInstancePerson));
		
		
		
		//Methods
		Method [] methods = pc.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			System.out.println(method);
		}
		
		methods[4].invoke(newInstancePerson, "Tinna");
		System.out.println();
		System.out.println(newInstancePerson);
		
		
	}

}
