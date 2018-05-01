package jd.mainEntry;

import java.sql.SQLException;
import java.util.Scanner;

import jd.DAO.UserDAO;
import jd.model.User;

public class MainPoint {

	public static void main(String[] args) throws SQLException {
		UserDAO ud = new UserDAO();
		Scanner read = new Scanner(System.in);
		User user = null;
		Integer isResgister = null;
		Integer choice = 0;
		
		while(choice != 4) {
			printMenu();
			choice = read.nextInt();
			read.nextLine();
			switch(choice) {
				case 1:
					user = new User();
					System.out.println("What is your Email?");
					user.setUser_email(read.nextLine());
					System.out.println("What is your Name?");
					user.setUser_name(read.nextLine());
					System.out.println("What is your Password?");
					user.setUser_password(read.nextLine());
					isResgister = ud.register(user);
					
					if(isResgister != null) {
						System.out.println("You have successfully registered");
					}else {
						System.out.println("Invalid inputs, try again");
					}
					
					break;
				case 2:
					user = new User();
					System.out.println("What is your Email?");
					String email = read.nextLine();
					System.out.println("What is your Password?");
					String password = read.nextLine();
					user = ud.login(email, password);
					
					if(user != null) {
						System.out.println("You have logged in");
					}else {
						System.out.println("Unable to login");
					}
					
					break;
				case 3:
					if(user != null) {
						System.out.println("What is your Name?");
						user.setUser_name(read.nextLine());
						System.out.println("What is your Password?");
						user.setUser_password(read.nextLine());
						ud.update(user);
					}else {
						System.out.println("You must Login or Register");
					}
					break;
				case 4:
					break;
				default:
					System.out.println("Invalid input\n Please enter a number between 1 - 4");	
			}
			read.close();
		}
	}
	
	public static void printMenu() {
		System.out.println("Menu:");
		System.out.println("---------------");
		System.out.println("1. Register");
		System.out.println("2. Login");
		System.out.println("3. Update Info");
		System.out.println("4. Quit");
		System.out.print("> ");
	}

}
