package Cart;

import java.util.HashMap;
import java.util.Map;

public class Item {
	private String name;
	private Double price;
	private Integer quantity;
	private Map<String, Item> cart = new HashMap<String, Item>();
	private Map<String, Item> items = new HashMap<String, Item>();
	
	/**
	 * @param name
	 * @param price
	 * @param quantity
	 */
	public Item(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Item() {
		
	}
	
	public void addItems(String key, Item item) {
		items.put(key, item);
	}
	
	public void addToCart(String key, Item item) {
		cart.put(key, item);
	}
	
	public Map<String, Item> getItems(){
		return items;
	}
	
	public Map<String, Item> getCartItems(){
		return cart;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	
}
