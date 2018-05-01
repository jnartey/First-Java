package jd.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jd.model.Customer;
import jd.utils.OracleQueries;

public class CustomerDAO {
	public Customer getCustomerById(int id) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt= null;
		ResultSet result = null;
		Customer customer = null;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETCUSTOMERBYID);
			stmt.setInt(1, id);
			
			stmt.executeUpdate();
			
			result = stmt.executeQuery();
			if(result!= null && result.next()) {
				customer = new Customer();
				customer.setCustomer_id(result.getInt(1));
				customer.setCustomer_email(result.getString(2));
				customer.setCustomer_fname(result.getString(3));
				customer.setCustomer_lname(result.getString(4));
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
		
		return customer;
	}
	
	public boolean addCustomer(Customer c) {
		Connection conn = null;
		PreparedStatement stmt= null;
		boolean isAdded = false;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.SAVECUSTOMER);
			stmt.setString(1, c.getCustomer_email());
			stmt.setString(2, c.getCustomer_fname());
			stmt.setString(3, c.getCustomer_lname());
			
			if(stmt.executeUpdate() != 0) {
				isAdded = true;
			}
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return isAdded;
	}
	
	public boolean removeCustomerById(int id) {
		Connection conn = null;
		PreparedStatement stmt= null;
		boolean isRemoved = false;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.DELETECUSTOMER);
			stmt.setInt(1, id);
			
			if(stmt.executeUpdate() != 0) {
				isRemoved = true;
			}
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return isRemoved;
	}
}
