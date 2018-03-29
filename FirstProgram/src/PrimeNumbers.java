import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int input = reader.nextInt();
		//How can we get all numbers between 2 and user input?
		for(int i = 2; i < input; i++) {
			boolean isPrime = true;
				//for(int j = 2; j < i; j++) {
				for(int j = 2; j < Math.sqrt(i); j++) {
				//Check if it divides evenly with any
				if(i%j == 0) isPrime = false;
			}
			//If not it'sprime
			if(isPrime) System.out.println(i);
		}
		
	} 

}
