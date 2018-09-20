package ua.lviv.lgs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Application {

	public static void main(String[] args) {
		// Arrys.deepToString()
		int[][] arrayOfIntegers = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println(Arrays.deepToString(arrayOfIntegers));

		int[][][] arrayOf3D = new int[2][2][4];
		System.out.println(Arrays.deepToString(arrayOf3D));

		Person[][] arrayOfPersons = { { new Person("Andrew", 21), new Person("Bob", 31), new Person("Clara", 41) },
				{ new Person("Danniel", 51), new Person("Eva", 61), new Person("Fred", 71) } };

		System.out.println(Arrays.deepToString(arrayOfPersons));

		Person[][] arrayOfPersonsRandom = {
				{ new Person("Andrew", getRandomValueFromRange(10, 100)),
						new Person("Bob", getRandomValueFromRange(10, 100)),
						new Person("Clara", getRandomValueFromRange(10, 100)) },
				{ new Person("Danniel", getRandomValueFromRange(10, 100)),
						new Person("Eva", getRandomValueFromRange(10, 100)),
						new Person("Fred", getRandomValueFromRange(10, 100)) } };

		System.out.println(Arrays.deepToString(arrayOfPersonsRandom));

		// Arrays.fill()
		boolean[] array1 = new boolean[7];
		Arrays.fill(array1, true);
		System.out.println("array1 = " + Arrays.toString(array1));

		byte[] array2 = new byte[7];
		Arrays.fill(array2, (byte) 15);
		System.out.println("array2 = " + Arrays.toString(array2));
		;

		char[] array3 = new char[7];
		Arrays.fill(array3, 'y');
		System.out.println("array3 = " + Arrays.toString(array3));

		short[] array4 = new short[7];
		Arrays.fill(array4, (short) 71);
		System.out.println("array4 = " + Arrays.toString(array4));

		int[] array5 = new int[7];
		Arrays.fill(array5, 54);
		System.out.println("array5 = " + Arrays.toString(array5));

		long[] array6 = new long[7];
		Arrays.fill(array6, 88L);
		System.out.println("array6 = " + Arrays.toString(array6));

		float[] array7 = new float[7];
		Arrays.fill(array7, 88);
		System.out.println("array7 = " + Arrays.toString(array7));

		double[] array8 = new double[7];
		Arrays.fill(array8, 99);
		System.out.println("array8 = " + Arrays.toString(array8));

		String[] array9 = new String[7];
		Arrays.fill(array9, "Test One");
		System.out.println("array9 = " + Arrays.toString(array9));
		Arrays.fill(array9, 2, 6, "Second");
		System.out.println("array9 = " + Arrays.toString(array9));

		// Arrays.equals()
		int[] array10 = new int[10];
		int[] array11 = new int[10];

		Arrays.fill(array10, 47);
		Arrays.fill(array11, 47);
		System.out.println(Arrays.equals(array10, array11));

		array10[1] = 2;
		System.out.println(Arrays.equals(array10, array11));

		// Arrays.sort()

		Integer[] array12 = { 23, 5, 7, 98534, 423, 5, 67, 1, 54, 79, 3, 56, 32 };
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(array12));

		System.out.println("After sorting asc");
		Arrays.sort(array12);
		System.out.println(Arrays.toString(array12));

		System.out.println("After sorting desc");
		Arrays.sort(array12, Collections.reverseOrder());
		System.out.println(Arrays.toString(array12));

		// Arrays.binarySearch()

		System.out.println("After sorting asc");
		Arrays.sort(array12);
		System.out.println(Arrays.toString(array12));

		while (true) {
			int randomValueIndex = new Random().nextInt(array12.length);
			int searchedValue = array12[randomValueIndex];

			int location = Arrays.binarySearch(array12, searchedValue);

			if (location >= 0) {
				System.out.println("Location of " + searchedValue + " is " + location + ", array12[ " + location + "] ="
						+ array12[location]);
				break;
			}
		}

	}

	public static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min; // 1-10
	}

}
