package firstJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJavaDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Register your Database driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Arguments for connection
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "jacob1";
		String password = "123456789";
		
		//Initialize your connection
		Connection conn = DriverManager.getConnection(url, username, password);
		
		//SQL query
		Integer ID = null;
		String[] COL = {"student_id"};
		String full_name = "Lance Luke";
		String email = "lance@gmail.com";
		String major = "NONE";
		String student_password = "pass";
//		
//		String INSERT = "INSERT INTO student "
//				+ "(full_name, email, major, student_password) "
//				+ "VALUES('" + full_name + "','" + email + "', '" + major + "', '" + student_password + "')";
//		
//		System.out.println(INSERT);
//		
//		Statement stmt = conn.createStatement();
//		stmt.executeUpdate(INSERT);
		
		String INSERT = "INSERT INTO student "
		+ "(full_name, email, major, student_password) "
		+ "VALUES(?, ?, ?, ?)";
		
		PreparedStatement stmt = conn.prepareStatement(INSERT, COL);
		stmt.setString(1, full_name);
		stmt.setString(2, email);
		stmt.setString(3, major);
		stmt.setString(4, student_password);
		
		stmt.executeUpdate();
		
		ResultSet result = stmt.getGeneratedKeys();
		
		if(result != null && result.next()) {
			ID = result.getInt(1);
		}
		
		System.out.println(ID);
	}

}
