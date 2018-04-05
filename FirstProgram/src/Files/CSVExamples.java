package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVExamples {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		String path = "C:\\test\\students.csv";
		File file = new File(path);
		
		try {
			Scanner input = new Scanner(file);
			//Skip first line to skip headers in csv files
			input.nextLine();
			while(input.hasNextLine()) {
				String[] line = input.nextLine().split(",");
				Student student = new Student();
				//
				student.setName(line[0]);
				student.setAge(Integer.parseInt(line[1]));
				student.setGpa(Double.parseDouble(line[2]));
				students.add(student);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Student s : students) {
			System.out.println(s.getName());
		}
	}

}
