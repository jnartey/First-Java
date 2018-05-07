package jd.customcalc;

import jd.customcalc.interfaces.Calc;
import java.util.Scanner;

public class MainEntry {
	
	public static void menu() {
		System.out.println("Simple Calculator");
		System.out.println("--------------------");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Quit");
		System.out.print("> ");
	}
	
	public static void main(String[] args) {
		
		Calc<Integer> add = new Calc<Integer>() {

			@Override
			public Integer compute(Integer[] numbers) {
				Integer computed = 0;
				
				for(Integer number : numbers) {
					computed += number;
				}
				
				return computed;
			}
			
		};
		
		Calc<Integer> subtract = new Calc<Integer>() {

			@Override
			public Integer compute(Integer[] numbers) {
				Integer computed = 0;
				
				for(Integer number : numbers) {
					computed -= number;
				}
				
				return computed;
			}
			
		};
		
		Calc<Integer> multiply = new Calc<Integer>() {

			@Override
			public Integer compute(Integer[] numbers) {
				Integer computed = 1;
				
				for(Integer number : numbers) {
					computed *= number;
				}
				
				return computed;
			}
			
		};
		
		Calc<Double> divide = new Calc<Double>() {

			@Override
			public Double compute(Integer[] numbers) {
				Integer computed = 1;
				
				computed = numbers[0]/numbers[1];
				
				return computed.doubleValue();
			}
			
		};
		
		Scanner read = new Scanner(System.in);
		int choice = 0;
		int inputSize = 0;
		Integer[] numbers = null;
		
		while(choice != 5) {
			//read.nextLine();
			menu();
			choice = read.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter total numbers you want to add");
					System.out.print("> ");
					inputSize = read.nextInt();
					numbers = new Integer[inputSize];
					
					for(int i = 0; i < numbers.length; i++) {
						System.out.println("Enter #" + (i + 1));
						System.out.print("> ");
						numbers[i] = read.nextInt();
					}
					
					System.out.println("Answer: " + add.compute(numbers));
					break;
					
				case 2:
					System.out.println("Enter total numbers you want to subtract");
					System.out.print("> ");
					inputSize = read.nextInt();
					numbers = new Integer[inputSize];
					
					for(int i = 0; i < numbers.length; i++) {
						System.out.println("Enter #" + (i + 1));
						System.out.print("> ");
						numbers[i] = read.nextInt();
					}
					
					System.out.println("Answer: " + subtract.compute(numbers));
					break;
					
				case 3:
					System.out.println("Enter total numbers you want to multiply");
					System.out.print("> ");
					inputSize = read.nextInt();
					numbers = new Integer[inputSize];
					
					for(int i = 0; i < numbers.length; i++) {
						System.out.println("Enter #" + (i + 1));
						System.out.print("> ");
						numbers[i] = read.nextInt();
					}
					
					System.out.println("Answer: " + multiply.compute(numbers));
					break;
					
				case 4:
					numbers = new Integer[2];
					
					for(int i = 0; i < numbers.length; i++) {
						System.out.println("Enter #" + (i + 1));
						System.out.print("> ");
						numbers[i] = read.nextInt();
					}
					
					System.out.println("Answer: " + divide.compute(numbers));
					break;
				case 5:
					System.out.println("Simple calculator exited...");
					break;
				default:
					System.out.println("Invalid input");
			}
			System.out.println("");
		}
		
	}

}
