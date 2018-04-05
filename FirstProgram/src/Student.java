
public class Student {
	
	private int studentID;
	private String firstName, lastName, studentEmail, studentPhone;
	
	public Student(int studentID, String firstName, String lastName, String studentEmail, String studentPhone) {
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentEmail = studentEmail;
		this.studentPhone = studentPhone;
	}
	
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	
	public String toString() {
		String message = "Student\n";
		message += "Student ID" + this.getStudentID() + "\n";
		return message;
	}
}
