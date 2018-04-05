package Files;

public class Course {
	protected String courseCode;
	protected String courseName;
	protected String instructor;
	/**
	 * @param courseCode
	 * @param courseName
	 * @param instructor
	 */
	public Course(String courseCode, String courseName, String instructor) {
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.instructor = instructor;
	}
	/**
	 * @return the courseCode
	 */
	public String getCourseCode() {
		return courseCode;
	}
	/**
	 * @param courseCode the courseCode to set
	 */
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	/**
	 * @return the instructor
	 */
	public String getInstructor() {
		return instructor;
	}
	/**
	 * @param instructor the instructor to set
	 */
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	
}
