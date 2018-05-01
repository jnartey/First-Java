package jd.mainEntry;

import jd.dao.CustomerDAO;
import jd.dao.ItemDAO;
import jd.model.Customer;
import jd.model.Item;

public class MainPoint {

	public static void main(String[] args) {
		ItemDAO cd = new ItemDAO();
		Item i = new Item();
		
		
		if(cd.removeItemById(1)) {
			System.out.println("Item deleted successfully");
		}else {
			System.out.println("Error");
		}
	}

}
