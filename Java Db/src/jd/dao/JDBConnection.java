package jd.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBConnection {
	protected Connection conn = null;
	protected String url = "";
	protected String username = "";
	protected String password = "";
	/**
	 * @param conn
	 * @param url
	 * @param username
	 * @param password
	 */
	public JDBConnection(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	public Connection getConnection() {
		 try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
            try {
            	conn = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found."); 
        }
        return conn;
	}
}
