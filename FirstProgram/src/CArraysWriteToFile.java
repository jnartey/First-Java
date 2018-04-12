import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CArraysWriteToFile {

	public static void main(String[] args) {
		String path = "src/school/common.txt";
		List<Integer> array1 = Arrays.asList(3, 6, 10, 11, 17, 20, 25);
		List<Integer> array2 = Arrays.asList(1, 5, 6, 10, 11, 19, 20, 21, 25, 27);
		
		Integer[] one = {3, 6, 10, 11, 17, 20, 25};
		Integer[] two = {1, 5, 6, 10, 11, 19, 20, 21, 25, 27};
		int countOne = 0;
		int countTwo = 0;
		
		Set<Integer> compare = new HashSet<Integer>(array1);
		compare.retainAll(array2);
		
		ArrayList<Integer> results = new ArrayList<Integer>(compare);
		
		try {
			FileWriter wr = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(wr);
			
			for(int i = 0; i < results.size(); i++) {
				bw.write(Integer.toString(results.get(i)));
				bw.newLine();
			}
			
			while(countOne != one.length && countTwo != two.length) {
				if(one[countOne] > two[countTwo]) {
					countTwo++;
				}else if(two[countTwo] > one[countOne]) {
					countOne++;
				}else if(one[countOne] == two[countTwo]){
					bw.write(one[countOne].toString());
					bw.newLine();
					countTwo++;
					countOne++;
				}
			}
			
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
