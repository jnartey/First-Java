import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;

public class IOExercise {

	public static void main(String[] args) {
		Path file = null;
		BufferedReader bufferedReader= null;
		BufferedWriter bufferedWriter= null;
		
		String firstName = "FirstName";
		String lastName = "LastName";
		String[] rank = {"assistant", "associate", "full"};
		DecimalFormat df = new DecimalFormat("#.00");
		double getSalary = 0;
		double sumAssoc = 0, sumAssist = 0, sumFull = 0;
		int countAssist = 0, countAssoc = 0, countFull = 0;
		
		try {
			file = Paths.get("src/school/salary.txt");
			OutputStream outpurStream = Files.newOutputStream(file);
			InputStream InputStream = Files.newInputStream(file);
			
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(outpurStream));
			bufferedReader = new BufferedReader(new InputStreamReader(InputStream));
			
			for(int i = 1; i <= 1000; i++) {
				String f = firstName + i;
				String l = lastName + i;
				int index = (int) (Math.random() * 3);
				String getRank = rank[index];
				String buildString = "";
				
				switch(index) {
					case 0:
						getSalary = Math.random() * (80000D - 50000D) + 50000D;
						sumAssist += getSalary;
						countAssist++;
						break;
					case 1:
						getSalary = Math.random() * (110000D - 60000D) + 60000D;
						sumAssoc += getSalary;
						countAssoc++;
						break;
					case 2:
						getSalary = Math.random() * (130000D - 75000D) + 75000D;
						sumFull += getSalary;
						countFull++;
						break;
					default:
						break;
							
				}
				
				buildString = f + " " + l + " " + getRank + " " + df.format(getSalary);
				
				bufferedWriter.write(buildString  + "\r\n");
				
				while(bufferedReader.ready()) {
					String[] line = bufferedReader.readLine().split(" ");
					
					if(line[2].equals(rank[0])) {
						sumAssist += Double.parseDouble(line[3]);
						countAssist++;
					}else if(line[2].equals(rank[1])) {
						sumAssoc += Double.parseDouble(line[3]);
						countAssoc++;
					}else if(line[2].equals(rank[2])) {
						sumFull += Double.parseDouble(line[3]);
						countFull++;
					}
				}
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
//				bufferedWriter.write("Total salary of Assistant Professor: " + (df.format(sumAssist))  + "\r\n");
//				bufferedWriter.write("Total salary of Associate Professor: " + (df.format(sumAssoc))  + "\r\n");
//				bufferedWriter.write("Total salary of Full Professor: " + (df.format(sumFull))  + "\r\n");
//				bufferedWriter.write("Total salary of all faculty: " + (df.format((sumAssist + sumAssist + sumFull)))  + "\r\n");
//				
//				bufferedWriter.write("Average salary of Assistant Professor: " + (df.format(sumAssist/countAssist))  + "\r\n");
//				bufferedWriter.write("Average salary of Associate Professor: " + (df.format(sumAssoc/countAssoc))  + "\r\n");
//				bufferedWriter.write("Average salary of Full Professor: " + (df.format(sumFull/countFull))  + "\r\n");
//				bufferedWriter.write("Average salary of all faculty: " + (df.format((sumAssist + sumAssist + sumFull)/(countAssist + countAssoc + countFull)))  + "\r\n");
				
				bufferedWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println("Total salary of Assistant Professor: " + (df.format(sumAssist)));
		System.out.println("Total salary of Associate Professor: " + (df.format(sumAssoc)));
		System.out.println("Total salary of Full Professor: " + (df.format(sumFull)));
		System.out.println("Total salary of all faculty: " + (df.format((sumAssist + sumAssist + sumFull))));
		
		System.out.println("Average salary of Assistant Professor: " + (df.format(sumAssist/countAssist)));
		System.out.println("Average salary of Associate Professor: " + (df.format(sumAssoc/countAssoc)));
		System.out.println("Average salary of Full Professor: " + (df.format(sumFull/countFull)));
		System.out.println("Average salary of all faculty: " + (df.format((sumAssist + sumAssist + sumFull)/(countAssist + countAssoc + countFull))));
		}
		
		
	}

}
