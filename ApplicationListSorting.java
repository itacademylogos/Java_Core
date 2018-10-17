import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ApplicationListSorting {
	public static void main(String[] args) {

		String[] studentNames = new String[] { "Ivan", "Petro", "Hugo", "Max", "Aristarch", "Ziner" };
		int[] studentAges = new int[] { 22, 44, 33, 55, 12, 17, 26 };
		int[] walletMaxMoneyAmoutValues = new int[] { 2200, 4400, 3300, 4500, 1760, 2900 };
		String[] walletBrandNames = new String[] { "Dolce", "HugoBoss", "Nike" };

		List<Student> list = new ArrayList<>();

		// generates random value of Student objects with random values
		for (int i = 0; i < getRandomValueFromRange(5, 10); i++) {
			list.add(new Student(studentNames[getRandomValueFromRange(0, studentNames.length - 1)],
					studentAges[getRandomValueFromRange(0, studentAges.length - 1)],
					new Wallet(
							walletMaxMoneyAmoutValues[getRandomValueFromRange(0, walletMaxMoneyAmoutValues.length - 1)],
							walletBrandNames[getRandomValueFromRange(0, walletBrandNames.length - 1)])));
		}

		System.out.println("Before sorting");
		for (Student student : list) {
			System.out.println(student);
		}

		Collections.sort(list, new AscendingStudentComparartor());
		System.out.println("After sorting Ascending");
		for (Student student : list) {
			System.out.println(student);
		}
		
		Collections.sort(list, new DescendingStudentComparartor());
		System.out.println("After sorting Descending");
		for (Student student : list) {
			System.out.println(student);
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

//Used for sorting objects
class AscendingStudentComparartor implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		if (o1.getName().compareTo(o2.getName()) > 0) {
			return 1;
		} else if (o1.getName().compareTo(o2.getName()) < 0) {
			return -1;
		} else {
			if (o1.getAge() > o2.getAge()) {
				return 1;
			} else if (o1.getAge() < o2.getAge()) {
				return -1;
			} else {

				// sorting by wallet fields
				if (o1.getWallet().getMaxMoneyAmout() > o2.getWallet().getMaxMoneyAmout()) {
					return 1;
				} else if (o1.getWallet().getMaxMoneyAmout() < o2.getWallet().getMaxMoneyAmout()) {
					return -1;
				} else {
					if (o1.getWallet().getBrandName().compareTo(o2.getWallet().getBrandName()) > 0) {
						return 1;
					} else if (o1.getWallet().getBrandName().compareTo(o2.getWallet().getBrandName()) < 0) {
						return -1;
					}
				}
			}
		}

		// zero means that objects are equal
		return 0;
	}

}

class DescendingStudentComparartor implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		AscendingStudentComparartor ascendingComparator = new AscendingStudentComparartor();
		return (-1) * ascendingComparator.compare(o1, o2);
	}

}

class Student {
	private String name;
	private int age;
	private Wallet wallet;

	public Student(String name, int age, Wallet wallet) {
		this.name = name;
		this.age = age;
		this.wallet = wallet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", wallet=" + wallet + "]";
	}

}

class Wallet {
	private int maxMoneyAmout;
	private String brandName;

	public Wallet(int maxMoneyAmout, String brandName) {
		this.maxMoneyAmout = maxMoneyAmout;
		this.brandName = brandName;
	}

	public int getMaxMoneyAmout() {
		return maxMoneyAmout;
	}

	public void setMaxMoneyAmout(int maxMoneyAmout) {
		this.maxMoneyAmout = maxMoneyAmout;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Override
	public String toString() {
		return "Wallet [maxMoneyAmout=" + maxMoneyAmout + ", brandName=" + brandName + "]";
	}
}
