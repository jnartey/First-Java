package lambdaEx1;

import java.util.Scanner;

public class CalcMain {
	
	public static void menu() {
		System.out.println("Enter a math expression or enter 'q' to quit");
		System.out.print("> ");
	}
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String expression = "";
		char[] operands = new char[]{'+', '-', '*', '/'};
		
		//MyCalc calculator = new MyCalc();
		
		while(expression != "Q" || expression != "q") {
			menu();
			expression = read.nextLine();
			int index = 0;
			int operandIndex = 0;
			
			while(index != expression.length()) {
				
				while(operandIndex) {
					
				}
				
				if(expression.charAt(index)) {
					
				}
				
				index++;
			}
		}
		
	}

}
