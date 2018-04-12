package Cart;

import java.util.HashMap;
import java.util.Map;

public class MainRunner {

	public static void main(String[] args) {
		
		Item item = new Item();
		double subTotal = 0, total = 0;
		
		item.addToCart("1", new Item("Keyboard", 10.50, 5));
		item.addToCart("2", new Item("Mouse", 5.0, 10));
		item.addToCart("3", new Item("Monitor", 120.0, 10));
		item.addToCart("4", new Item("Flash Drive", 50.0, 2));
		
		Map<String, Item> cart = item.getCartItems();
		
		for(Map.Entry<String, Item> entry : cart.entrySet()) {
			subTotal = entry.getValue().getPrice() * entry.getValue().getQuantity();
			total += subTotal;
		}
		
		System.out.println("Total is $" + total);
	}

}
