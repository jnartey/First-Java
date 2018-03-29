import java.util.Scanner;

public class averageNumber {

	public static void main(String[] args) {
		
		int ArraySize = 0;
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter array size");
		System.out.print("> ");
		
		ArraySize = input.nextInt();
		
		int[] numArray = new int[ArraySize];
		System.out.println("Array size [" + ArraySize + "]");
		
		for(int i = 0; i < numArray.length; i++) {
			System.out.print("Please enter value at array index " + i + ": ");
			numArray[i] = input.nextInt();
		}
		
		for(int i = 0; i < numArray.length; i++) {
			sum += numArray[i];
		}
		
		System.out.println("Sum value: " + ((double) sum/numArray.length));
	}

}
