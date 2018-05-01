package jd.model;

public class Customer {
	private Integer customer_id = 0;
	private String customer_email = "";
	private String customer_fname = "";
	private String customer_lname = "";
	/**
	 * @param customer_id
	 * @param customer_email
	 * @param customer_fname
	 * @param customer_lname
	 */
	public Customer(Integer customer_id, String customer_email, String customer_fname, String customer_lname) {
		this.customer_id = customer_id;
		this.customer_email = customer_email;
		this.customer_fname = customer_fname;
		this.customer_lname = customer_lname;
	}
	
	public Customer() {
		
	}

	/**
	 * @return the customer_id
	 */
	public Integer getCustomer_id() {
		return customer_id;
	}

	/**
	 * @param customer_id the customer_id to set
	 */
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	/**
	 * @return the customer_email
	 */
	public String getCustomer_email() {
		return customer_email;
	}

	/**
	 * @param customer_email the customer_email to set
	 */
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}

	/**
	 * @return the customer_fname
	 */
	public String getCustomer_fname() {
		return customer_fname;
	}

	/**
	 * @param customer_fname the customer_fname to set
	 */
	public void setCustomer_fname(String customer_fname) {
		this.customer_fname = customer_fname;
	}

	/**
	 * @return the customer_lname
	 */
	public String getCustomer_lname() {
		return customer_lname;
	}

	/**
	 * @param customer_lname the customer_lname to set
	 */
	public void setCustomer_lname(String customer_lname) {
		this.customer_lname = customer_lname;
	}
	
	
}
