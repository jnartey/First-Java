package firstJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseCRUD {
	
	protected Connection conn = null;
	protected String url = "";
	protected String username = "";
	protected String password = "";
	protected PreparedStatement stmt = null;
	
	public CourseCRUD() throws ClassNotFoundException, SQLException {
		//Register your Database driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Arguments for connection
		url = "jdbc:oracle:thin:@localhost:1521:orcl";
		username = "jacob1";
		password = "123456789";
		
		//Initialize your connection
		conn = DriverManager.getConnection(url, username, password);
	}
	
	public void createCourse(String courseName, Float min_GPA) throws ClassNotFoundException, SQLException{
		
		String INSERT = "INSERT INTO course "
				+ "(course_name, min_GPA) "
				+ "VALUES(?, ?)";
				
		stmt = conn.prepareStatement(INSERT);
		stmt.setString(1, courseName);
		stmt.setFloat(2, min_GPA);
		
		stmt.executeUpdate();
		System.out.println("Course created successfully");
	}
	
	public void readCourse(int courseID) throws ClassNotFoundException, SQLException{
		ResultSet result = null;
		
		if(courseID == 0) {
			String ByCourseID = "SELECT * FROM COURSE";			
			stmt = conn.prepareStatement(ByCourseID);
			
			result = stmt.executeQuery();
			
			System.out.printf("%-25s | %-25s | %-25s", "Course ID", "Course Name", "Min GPA");
			System.out.println("");
			System.out.println("----------------------------------------------------------------");
			
			while(result != null && result.next()) {
				System.out.printf("%-25s | %-25s | %-25s", result.getInt(1), result.getString(2), result.getFloat(3));
				System.out.println("");
			}
			
		}else {
			String ByCourseID = "SELECT * FROM COURSE "
					+ "WHERE course_id = ?";
			
			stmt = conn.prepareStatement(ByCourseID);
			stmt.setInt(1, courseID);
			
			result = stmt.executeQuery();
			
			if(result != null && result.next()) {
				System.out.printf("%-25s | %-25s | %-25s", "Course ID", "Course Name", "Min GPA");
				System.out.println("");
				System.out.println("----------------------------------------------------------------");
				System.out.printf("%-25s | %-25s | %-25s", result.getInt(1), result.getString(2), result.getFloat(3));
				System.out.println("");
			}
		}
		
		
		
	}
	
	public void deleteCourse(int courseID) throws ClassNotFoundException, SQLException{
		
		String DELETE = "DELETE FROM COURSE "
				+ "WHERE course_id = ?";
		
		stmt = conn.prepareStatement(DELETE);
		
		stmt.setInt(1, courseID);
		stmt.executeUpdate();
		System.out.println("Course with ID " +  courseID + " deleted successfully");
	}
	
	public void updateCourse(int courseID, String courseName, Float minGPA) throws ClassNotFoundException, SQLException{
		
		String UPDATE = "UPDATE COURSE SET course_name = ?, "
				+ "min_GPA = ? "
				+ "WHERE course_id = ?";
		
		PreparedStatement stmt = conn.prepareStatement(UPDATE);
		stmt.setString(1, courseName);
		stmt.setFloat(2, minGPA);
		stmt.setInt(3, courseID);
		
		stmt.executeUpdate();
		System.out.println("Course with ID " +  courseID + " updated successfully");
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CourseCRUD course = new CourseCRUD();
		//course.createCourse("CS JAVA 101", 5.00f);
		//course.createCourse("CS 101", 4.00f);
		//course.createCourse("CS Python", 5.00f);
		
		course.readCourse(1);
		course.deleteCourse(2);
		course.updateCourse(3, "CS REACT MERN", 5.23f);
		course.readCourse(0);
	}

}
