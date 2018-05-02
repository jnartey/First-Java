package jd.mainentry;

import java.sql.SQLException;
import java.util.Scanner;

import jd.dao.UserDAO;

public class MainEntry {
	
	public static void displayMenu() {
		System.out.println("Menu:");
		System.out.println("---------------");
		System.out.println("1. Register");
		System.out.println("2. Login");
		System.out.println("3. Update Info");
		System.out.println("4. Quit");
		System.out.print("> ");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UserDAO user = new UserDAO();
		int response = 0;
//		user.getAllUsers();
//		System.out.println("");
//		user.getUserByName("User2");

		outer:while(response < 5) {
			displayMenu();
			Scanner input = new Scanner(System.in);
			if(input.hasNextLine()){
				response = Integer.parseInt(input.nextLine());
			}
			
			switch(response) {
				case 1:
					user.registerUser();
					break;
				case 2:
					user.loginUser();
					break;
				case 3:
					user.updateUser();
					break;
				case 4:
					System.out.println("Exiting program....");
					break outer;
				default:
					System.out.println("Invalid Option...Exiting program....");
					break outer;
			}
		}		
	}

}
