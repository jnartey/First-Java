package insertionSort;

import java.util.StringJoiner;

public class InsertionSort {
	
	public static void printArr(Integer[] arr) {
		StringJoiner sj = new StringJoiner(", ", "[", "]");
		
		for(Integer e : arr) {
			sj.add(Integer.toString(e));
		}
		
		System.out.println(sj);
	}
	
	public static void main(String[] args) {
		Integer[] elements = {23, 4, 5, 11, 65, 33, 21, 9}; //Expected 4, 5, 9, 11, 21, 23, 33, 65
		
		for(int i = 1; i < elements.length; i++) {
			int sub_element = elements[i];
			int x = i - 1;
			
			while(x >= 0 && elements[x] > sub_element) {
				elements[x + 1] = elements[x];
				x--;
			}
			elements[x + 1] = sub_element;
		}
		
		printArr(elements);
	}

}
