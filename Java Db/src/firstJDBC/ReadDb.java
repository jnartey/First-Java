package firstJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadDb {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Register your Database driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Arguments for connection
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "jacob1";
		String password = "123456789";
		
		//Initialize your connection
		Connection conn = DriverManager.getConnection(url, username, password);
		
		String ByEmail = "SELECT * FROM STUDENT "
				+ "WHERE email = ?";
		
		String AllResult = "SELECT * FROM STUDENT";		
		PreparedStatement stmt = conn.prepareStatement(ByEmail);
		PreparedStatement stmt1 = conn.prepareStatement(AllResult);
		stmt.setString(1, "lance@gmail.com");
		
		ResultSet result = stmt.executeQuery();
		ResultSet result1 = stmt1.executeQuery();
		
		if(result != null && result.next()) {
			System.out.println(result.getInt(1));
			System.out.println(result.getString(2));
			System.out.println(result.getString(3));
			System.out.println(result.getString(4));
			System.out.println(result.getString(5));
			System.out.println("");
		}
		
		while(result1 != null && result1.next()) {
			System.out.println(result1.getInt(1));
			System.out.println(result1.getString(2));
			System.out.println(result1.getString(3));
			System.out.println(result1.getString(4));
			System.out.println(result1.getString(5));
			System.out.println("");
		}
	}

}
