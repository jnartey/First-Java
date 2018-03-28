
import java.util.Scanner;

public class First {
	//public Anything can use this
	//protected only a child class can use
	//private only this class can use
			
	//static do we need to instantiate
	
	public static void main(String[] args) {
		int i = 3;
		double d = 23.5;
		char c = 'j';
		boolean b = true;
		
		String s = "Hello";
		
		Integer tempNumber = 0;
		float tempFloat = 0;
		Double tempDouble = 0.0;
		
		//System.out.println(s.equals("Hello"));
		//System.out.println(tempNumber);
		//System.out.println(tempFloat);
		//System.out.println(tempDouble);
		
		
		//Instantiate Scanner and tell it
		//to look for input from System.in (console)
		Scanner input = new Scanner(System.in);
		String name;
		//Give the use a prompt
		System.out.println("What's your name: ");
		name = input.nextLine();
		
		//Strong the user's input
		//System.out.println("Your name is " + name);
		
		int age;
		//ask use for their age
		System.out.println("Hi " + name + " how old are you? ");
		//Store user's age as variable
		age = input.nextInt();
		
		//Print out user's age
		System.out.println("So you're " + age + " years old.");
	}
}
