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

public class IOExerciseRead {

	public static void main(String[] args) {
		Path file = null;
		BufferedReader bufferedReader= null;
		DecimalFormat df = new DecimalFormat("#.00");
		String[] rank = {"assistant", "associate", "full"};
		double sumAssoc = 0, sumAssist = 0, sumFull = 0;
		int countAssist = 0, countAssoc = 0, countFull = 0;
		
		try {
			file = Paths.get("src/school/salary.txt");
			InputStream InputStream = Files.newInputStream(file);
			
			bufferedReader = new BufferedReader(new InputStreamReader(InputStream));
			
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
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				System.out.println("Total salary of Assistant Professor: " + (df.format(sumAssist)));
				System.out.println("Total salary of Associate Professor: " + (df.format(sumAssoc)));
				System.out.println("Total salary of Full Professor: " + (df.format(sumFull)));
				System.out.println("Total salary of all faculty: " + (df.format((sumAssist + sumAssist + sumFull))));
				System.out.println("");
				System.out.println("Average salary of Assistant Professor: " + (df.format(sumAssist/countAssist)));
				System.out.println("Average salary of Associate Professor: " + (df.format(sumAssoc/countAssoc)));
				System.out.println("Average salary of Full Professor: " + (df.format(sumFull/countFull)));
				System.out.println("Average salary of all faculty: " + (df.format((sumAssist + sumAssist + sumFull)/(countAssist + countAssoc + countFull))));
		}
		
	}

}
