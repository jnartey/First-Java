package firstJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UdateDb {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Register your Database driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Arguments for connection
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "jacob1";
		String password = "123456789";
		
		//Initialize your connection
		Connection conn = DriverManager.getConnection(url, username, password);
		
		String UPDATE = "UPDATE STUDENT SET full_name = ?, "
				+ "major = ?, student_password = ? "
				+ "WHERE email = ?";
		
		PreparedStatement stmt = conn.prepareStatement(UPDATE);
		stmt.setString(1, "Jacob Nartey");
		stmt.setString(2, "CS");
		stmt.setString(3, "password1");
		stmt.setString(4, "lance@gmail.com");
		
		stmt.executeUpdate();
	}

}
