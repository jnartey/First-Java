package jd.utils;

public class OracleQueries {

	public final static String GETCUSTOMERBYID ="SELECT * FROM CUSTOMER "
			+ "WHERE id = ?";
	
	public final static String SAVECUSTOMER = "INSERT INTO CUSTOMER "
			+ "(email, fname, lname) "
			+ "values (?,?,?)";
	
	public final static String DELETECUSTOMER = "DELETE FROM CUSTOMER "
			+ "WHERE id = ?";
	
	public final static String GETALLITEMS = "SELECT * ITEM";
	
	public final static String SAVEITEM = "INSERT INTO ITEM "
			+ "(name, price) "
			+ "values (?,?)";
	
	public final static String DELETEITEM = "DELETE FROM ITEM "
			+ "WHERE id = ?";
}
