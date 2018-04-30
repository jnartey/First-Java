package firstJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDb {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Register your Database driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Arguments for connection
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "jacob1";
		String password = "123456789";
		
		//Initialize your connection
		Connection conn = DriverManager.getConnection(url, username, password);
		
		String DELETE = "DELETE FROM STUDENT "
				+ "WHERE email = ?";
		
		PreparedStatement stmt = conn.prepareStatement(DELETE);
		
		stmt.setString(1, "lance@gmail.com");
		stmt.executeUpdate();
	}

}
