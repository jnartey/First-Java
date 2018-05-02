package jd.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserDAO {
	protected Connection conn = null;
	protected PreparedStatement stmt = null;
	protected ResultSet result = null;
	JDBConnection connect = new JDBConnection("jdbc:oracle:thin:@localhost:1521:orcl", "jacob1", "123456789");
	
	public UserDAO() {		
		conn = connect.getConnection();
	}
	
	public void getAllUsers() throws ClassNotFoundException, SQLException {
		String ALL = "SELECT * FROM USER_TABLE";			
		stmt = conn.prepareStatement(ALL);
		
		result = stmt.executeQuery();
		
		System.out.printf("%-10s | %-25s | %-25s | %-25s", "User ID", "User Email", "User Name", "User Password");
		System.out.println("");
		System.out.println("------------------------------------------------------------------------------------");
		
		while(result != null && result.next()) {
			System.out.printf("%-10s | %-25s | %-25s | %-25s", result.getInt(1), result.getString(2), result.getString(3), result.getString(4));
			System.out.println("");
		}
	}
	
	public void getUserByName(String userName) throws SQLException {
		String ByName = "SELECT * FROM USER_TABLE "
				+ "WHERE user_name = ?";
		
		stmt = conn.prepareStatement(ByName);
		stmt.setString(1, userName);
		
		result = stmt.executeQuery();
		
		if(result != null && result.next()) {
			this.displayResult(result);
		}
	}
	
	public void registerUser() throws SQLException {
		Scanner read = new Scanner(System.in);
		String email = "", name = "", password = "";
		
		System.out.println("Your Email");
		System.out.print("> ");
		email = read.nextLine();
		System.out.println("");

		System.out.println("Your Name");
		System.out.print("> ");
		name = read.nextLine();
		System.out.println("");
		
		System.out.println("Your Password");
		System.out.print("> ");
		password = read.nextLine();
		System.out.println("");
		
		String INSERT = "INSERT INTO USER_TABLE "
				+ "(user_email, user_name, user_password) "
				+ "VALUES(?, ?, ?)";
				
		stmt = conn.prepareStatement(INSERT);
		stmt.setString(1, email);
		stmt.setString(2, name);
		stmt.setString(3, password);
		
		stmt.executeUpdate();
		System.out.println("User " + name + " registered successfully");
		read.close();
	}
	
	public void loginUser() throws SQLException {
		Scanner read = new Scanner(System.in);
		String email = "", password = "";
		
		System.out.println("Your Email");
		System.out.print("> ");
		email = read.nextLine();
				
		System.out.println("Your Password");
		System.out.print("> ");
		password = read.nextLine();
		System.out.println("");
		
		String LOGIN = "SELECT * FROM USER_TABLE "
				+ "WHERE user_email = ? AND user_password = ?";
		
		PreparedStatement stmt = conn.prepareStatement(LOGIN);
		stmt.setString(1, email);
		stmt.setString(2, password);
		
		ResultSet result = stmt.executeQuery();
		
		if(result != null && result.next()) {
			System.out.println("You can login!");
		}else {
			System.out.println("You cannot login!");
		}
		
		read.close();
	}
	
	public void updateUser() throws SQLException {
		Scanner read = new Scanner(System.in);
		String email = "", password = "", name = "";
		
		System.out.println("Your Email");
		System.out.print("> ");
		email = read.nextLine();
		System.out.println("");
		
		String CheckEmail = "SELECT * FROM USER_TABLE "
				+ "WHERE user_email = ?";
		
		PreparedStatement stmt = conn.prepareStatement(CheckEmail);
		stmt.setString(1, email);
		
		ResultSet result = stmt.executeQuery();
		
		if(result != null && result.next()) {
			
			this.displayResult(result);
			System.out.println("");
			
			System.out.println("Your New Name");
			System.out.print("> ");
			name = read.nextLine();
			System.out.println("");
			
			System.out.println("Your New Password");
			System.out.print("> ");
			password = read.nextLine();
			System.out.println("");
			
			String UPDATE = "UPDATE USER_TABLE SET user_name = ?, "
					+ "user_password = ?"
					+ "WHERE user_email = ?";
			
			stmt = conn.prepareStatement(UPDATE);
			stmt.setString(1, name);
			stmt.setString(2, password);
			stmt.setString(3, email);
			
			stmt.executeUpdate();
			
			System.out.println("User updated successfully");
			System.out.println("");
			read.close();
		}else {
			System.out.println("Email does not exist!");
		}
	}
	
	public void displayResult (ResultSet result) throws SQLException {
		System.out.printf("%-10s | %-25s | %-25s | %-25s", "User ID", "User Email", "User Name", "User Password");
		System.out.println("");
		System.out.println("------------------------------------------------------------------------------------");
		
		System.out.printf("%-10s | %-25s | %-25s | %-25s", result.getInt(1), result.getString(2), result.getString(3), result.getString(4));
		System.out.println("");
	}
	
	public User login(String email, String pass) {
		return user;
	}
	
}
