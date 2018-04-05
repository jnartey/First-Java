package Files;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FirstFile {

	public static void main(String[] args) {
		String path = "C:\\test\\test.txt";
		File file = new File(path);
		ArrayList <String> data = new ArrayList<String>();
		
		try {
			Scanner input = new Scanner(file);
			
			while(input.hasNextLine()) {
				String line = input.nextLine();
				data.add(line);
				//System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist!");
		}
		
		//Printing the lines of the file.
		for(String text : data) {
			System.out.println(text);
		}
	}

}
