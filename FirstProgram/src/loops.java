import java.util.Scanner;

public class loops {	
	public static void main(String[] args) {
		int sum, highVal, lowVal, placeholder;
		sum = 0;
		highVal = 1;
		lowVal = 0;
		placeholder = 0;
		
		int count = 0;
		
		while(highVal < 4000000) {
			placeholder = highVal;
			highVal += lowVal;
			lowVal = placeholder;
			
			if(highVal % 2 == 0) {
				sum +=highVal;
			}
			
			count++;
		}
		
		//Print all numbers divisible by 3
		//Between 0 and the user's input
		
		int response = 0;
		int count1 = 0;
		
		System.out.println("Sum is " + sum);
		System.out.println("Count is " + count);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		response = input.nextInt();
		
		while(count1 < response) {
			
			if(count1 % 3 == 0) {
				System.out.println(count1);
			}
			
			count1++;
		}

	}

}
