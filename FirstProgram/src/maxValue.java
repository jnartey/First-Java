import java.util.Scanner;

public class maxValue {

	public static void main(String[] args) {
		
		int ArrayLength = 0;
		int maxPos = 0;
		int minPos = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter array length");
		System.out.print("> ");
		
		ArrayLength = input.nextInt();
		
		int[] numArray = new int[ArrayLength];
		System.out.println("Array size [" + ArrayLength + "]");
		
		for(int i = 0; i < numArray.length; i++) {
			System.out.print("Please enter value at array index " + i + ": ");
			numArray[i] = input.nextInt();
		}
		
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i] > numArray[maxPos]) {
				maxPos = i;
			}
			
			if(numArray[i] < numArray[minPos]) {
				minPos = i;
			}
		}
		
		System.out.println("Maximum value: " + numArray[maxPos]);
		System.out.println("Minimum value: " + numArray[minPos]);
	}

}
