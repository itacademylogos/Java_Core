package ua.lviv.lgs.methods;

public class Student {

	private String nameOfUnivercity;
	private String studentName;
	
	public Student(String nameOfUnivercity, String studentName) {
		super();
		this.nameOfUnivercity = nameOfUnivercity;
		this.studentName = studentName;
	}
	
	
	public void changeStudentName (String desiredName) {
		this.studentName = desiredName;
	}
	
	
	public String getStudentInfo(String courseYear) {
		return this.nameOfUnivercity + courseYear;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [nameOfUnivercity=" + nameOfUnivercity + ", studentName=" + studentName + "]";
	}


	public static void main(String[] args) {
		Student s = new Student ("NULP", "Ivan");
		System.out.println(s);
		
		s.changeStudentName("Petro");
		System.out.println(s);
		
		
		System.out.println(s.getStudentInfo("3"));
		
	}
	
}
