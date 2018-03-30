/*
 * Create a 2D char array of size [4][4]
 * Fill it with a character of your choice
 * Change position [0][2] to 'M'
 */
public class Array2D {

	public static void main(String[] args) {
		//Creating 2D array of size 4
		char[][] board = new char[4][4];
		char[] blankLine = {'#','#','#','#'};		
		
		//Fill array with default values
		for(int i = 0; i < board.length; i++) {
			board[i] = blankLine.clone();
		}
		
		//Changing position [0][2] to M
		board[0][2] = 'M';
		
		for(char[] row : board) {//Row
			for(char column : row) {//Columns
				System.out.print(column + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//New method fill
		for(int i = 0; i < board.length; i++) {//Rows
			for(int j = 0; j < board[i].length; j++) {//Columns
				board[i][j] = 'X';
			}
		}
		
		//Changing position [0][2] to M
		board[0][2] = 'M';
		
		for(char[] row : board) {//Row
			for(char column : row) {//Columns
				System.out.print(column + " ");
			}
			System.out.println();
		}
	}

}
