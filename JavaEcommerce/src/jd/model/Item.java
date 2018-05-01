package jd.model;

public class Item {
	private Integer item_id = 0;
	private String item_name = "";
	private Float item_price = 0.00f;
	/**
	 * @param item_id
	 * @param item_name
	 * @param item_price
	 */
	public Item(Integer item_id, String item_name, Float item_price) {
		this.item_id = item_id;
		this.item_name = item_name;
		this.item_price = item_price;
	}
	
	public Item() {
		
	}

	/**
	 * @return the item_id
	 */
	public Integer getItem_id() {
		return item_id;
	}

	/**
	 * @param item_id the item_id to set
	 */
	public void setItem_id(Integer item_id) {
		this.item_id = item_id;
	}

	/**
	 * @return the item_name
	 */
	public String getItem_name() {
		return item_name;
	}

	/**
	 * @param item_name the item_name to set
	 */
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	/**
	 * @return the item_price
	 */
	public Float getItem_price() {
		return item_price;
	}

	/**
	 * @param item_price the item_price to set
	 */
	public void setItem_price(Float item_price) {
		this.item_price = item_price;
	}
	
	
}
