package jd.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jd.model.Item;
import jd.utils.OracleQueries;

public class ItemDAO {
	public List<Item> getAllItems() throws SQLException {
		List<Item> list = new ArrayList<Item>();
		
		Item item = null;
		Connection conn= null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		try {
			conn= OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETALLITEMS);
			// execute query is only for reading data from the database 
			result = stmt.executeQuery();
			
				while(result!= null && result.next()) {
					item = new Item();
					
					item.setItem_id(result.getInt(1));
					item.setItem_name(result.getString(2));
					item.setItem_price(result.getFloat(3));
					
					list.add(item);
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
		
		return list;
	}
	
	public boolean addItem(Item i) {
		Connection conn = null;
		PreparedStatement stmt= null;
		boolean isAdded = false;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.SAVEITEM);
			stmt.setString(1, i.getItem_name());
			stmt.setFloat(2, i.getItem_price());
			
			if(stmt.executeUpdate() != 0) {
				isAdded = true;
			}
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return isAdded;
	}
	
	public boolean removeItemById(int id) {
		Connection conn = null;
		PreparedStatement stmt= null;
		boolean isRemoved = false;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.DELETEITEM);
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
