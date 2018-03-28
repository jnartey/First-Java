import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
		System.out.println("a. int 1x=10;");
		System.out.println("b. int 1_x=10;");
		System.out.println("c. float x=10.0f;");
		System.out.println("d. string $x=\"10\";");
		
		Scanner input = new Scanner(System.in);
		String response = input.nextLine();
		
		String selected = "";
		
		response = response.toLowerCase();
		
		switch(response) {
			case "a":
				selected = "a. int 1x=10;";
				break;
			case "b":
				selected = "b. int 1_x=10;";
				break;
			case "c":
				selected = "c. float x=10.0f;";
				break;
			case "d":
				selected = "d. string $x=\\\"10\\\";";
				break;
			default:
				selected = "That's not a valid answer";
				break;
		}
		
		if(response.equals("c")) {
			System.out.println("Your selected \n" + selected + " Correct answer!");
		}else {
			System.out.println("Your selected \n" + selected + " Wrong answer!");
		}
		
		input.close();
	}

}
