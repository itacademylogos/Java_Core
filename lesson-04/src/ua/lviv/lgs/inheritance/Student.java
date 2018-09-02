package ua.lviv.lgs.inheritance;

public class Student extends Human{

	private int id;
	private String nameOfUnivercity;
	
	Student(String name, int age, int id, String nameOfUnivercity) {
		super(name, age);	
		this.id = id;
		this.nameOfUnivercity = nameOfUnivercity;
	}
	
	Student (int id, String nameOfUnivercity){
		super("Petro", 25);
		this.id = id;
		this.nameOfUnivercity = nameOfUnivercity;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", nameOfUnivercity=" + nameOfUnivercity + ", name = " + super.getName() + ", age = " + super.getAge() 
				+ "]";
	}


	

}
