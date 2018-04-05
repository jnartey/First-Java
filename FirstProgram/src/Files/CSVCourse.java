package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVCourse {

	public static void main(String[] args) {
		
		ArrayList<Course> courses = new ArrayList<Course>();
		String filePath = "C:\\test\\courses.csv";
		
		File file = new File(filePath);
		
		try {
			Scanner read = new Scanner(file);
			
			while(read.hasNextLine()) {
				String[] line = read.nextLine().split(",");
				courses.add(new Course(line[0], line[1], line[2]));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		for(Course course : courses) {
			System.out.format("%-20s | %-40s | %-40s\n", course.getCourseCode(), course.getCourseName(), course.getInstructor());
		}
		
		File wFile = new File("C:\\test\\hello.csv");
		
		try {
			Scanner read = new Scanner(file);
			
			FileWriter writer = new FileWriter(wFile, true); //Append true and overwrite is false
			while(read.hasNextLine()) {
				String line = read.nextLine();
				writer.write(line + "\r\n");
			}
			
			writer.close(); 	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
