package bubbleSort;

import java.util.StringJoiner;

public class BubbleSort {

	public static void main(String[] args) {
		Integer[] elements = {23, 4, 5, 11, 65, 33, 21, 9}; //Expected 4, 5, 9, 11, 21, 23, 33, 65
		int count = 1;
		StringJoiner sj = new StringJoiner(", ", "[", "]");
		StringJoiner sj1 = new StringJoiner(", ", "[", "]");
		
		for(int i = 0; i < elements.length; i++) {
			Integer temp = 0;
			for(int x = 1; x < elements.length - i; x++) {
				if(elements[x - 1] > elements[x]) {
					temp = elements[x - 1];
					elements[x - 1] = elements[x];
					elements[x] = temp;
				}
				count++;
			}
			
			if(temp == 0) {
				break;
			}			
		}
		
		System.out.println("Number of iterations: " + count);
		
		for(Integer e : elements) {
			sj.add(Integer.toString(e));
		}
		
		System.out.println(sj);
	}

}
