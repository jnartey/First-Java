/**
 * Create a 2D char array with 3 rows
 * Fill the rows each with a different word
 * Each columns a single character of that word
 * 
 * Swap 2 columns in the 2D array
 * The columns must be traversed (one-by-one);
 *
 */
public class SwapArray {

	public static void main(String[] args) {
		char[][] words = {
				{'J','a','v','a'}, 
				{'D','e','v','e','l','o','p','e','r'}, 
				{'C','o','u','r','s','e'}
			};
		
		int col1 = 1;
		int col2 = 2;
		
		for(int i = 0; i < words.length; i++) {//Rows
			//Placeholder to keep element of a columns eg. col1
			char placeholder = ' ';
			for(int j = 0; j < words[i].length/*Get length of row*/; j++) {//Columns
				if(j == col1) {
					//Swapping column 1 with column 2
					placeholder = words[i][j+(col2-col1)];
					words[i][j+(col2-col1)] = words[i][j];
				}
				
				if(j == col2) {
					//Swapping column 2 with column 1
					words[i][j-(col2-col1)] = placeholder;
				}
				
			}
		}
		
		for(char[] row : words) {
			for(char column : row) {
				System.out.print(column);
			}
			System.out.println();
		}
	}

}
