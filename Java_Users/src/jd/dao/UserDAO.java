package jd.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jd.model.User;
import jd.utils.OracleQueries;

public class UserDAO {

	public User login(String email, String pass) throws SQLException {
		User user = null;
		Connection conn= null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		try {
			conn= OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETUSERBYEMAIL);
			stmt.setString(1, email);
			
			result = stmt.executeQuery();
				if(result!= null && result.next()) {
					if(pass.equals(result.getString(4)))
					user = new User();
					user.setUser_id(result.getInt(1));
					user.setUser_email(result.getString(2));
					user.setUser_name(result.getString(3));
					user.setUser_password(result.getString(4));
				}	
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}finally {
			result.close();
			if(stmt!=null ) {
				stmt.close();
				
			}
			if(conn !=null) {
				conn.close();
			}
		}
		
		
		return user;
	}
	
	public Integer register(User user) throws SQLException {
		Integer ID = null;
		Connection conn = null;
		PreparedStatement stmt= null;
		ResultSet result = null;
		String [] COL = {"user_id"};
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.SAVEUSER, COL);
			stmt.setString(1, user.getUser_email());
			stmt.setString(2, user.getUser_name());
			stmt.setString(3, user.getUser_password());
			
			stmt.executeUpdate();
			
			result = stmt.getGeneratedKeys();
			
			if(result!=null && result.next()) {
				ID = result.getInt(1);
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			result.close();
			if(stmt!=null ) {
				stmt.close();
				
			}
			if(conn !=null) {
				conn.close();
			}
		}
		
		
		
		
		return ID;
	}
	
	public void update(User user) {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.UPDATEUSER);
			stmt.setString(1, user.getUser_name());
			stmt.setString(2, user.getUser_password());
			stmt.setString(3, user.getUser_email());
			
			stmt.executeUpdate();
		}catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
