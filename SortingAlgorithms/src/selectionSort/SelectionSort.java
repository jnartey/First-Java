package selectionSort;

import java.util.StringJoiner;

public class SelectionSort {
	
	public static void printArr(Integer[] arr) {
		StringJoiner sj = new StringJoiner(", ", "[", "]");
		
		for(Integer e : arr) {
			sj.add(Integer.toString(e));
		}
		
		System.out.println(sj);
	}

	public static void main(String[] args) {
		Integer[] elements = {23, 4, 5, 11, 65, 33, 21, 9}; //Expected 4, 5, 9, 11, 21, 23, 33, 65
		//Integer[] elements = {65, 33, 23, 21, 11, 9, 5, 4}; //Expected 4, 5, 9, 11, 21, 23, 33, 65
		
		for(int i = 0; i < elements.length - 1; i ++) {
			int min_index = i;
			for(int x = i + 1; x < elements.length; x++) {
				if(elements[x] < elements[min_index]) {
					min_index = x;
				}
			}
			
			int temp = elements[min_index];
			elements[min_index] = elements[i];
			elements[i] = temp;
			continue;
			
		}
		
		printArr(elements);
	}

}
