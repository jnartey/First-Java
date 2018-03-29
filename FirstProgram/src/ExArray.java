
public class ExArray {

	public static void main(String[] args) {
		int[] listA = {5,10,15,20,25,30,35};
		int[] listB = {4,5,1,10,22,20,30};
		int[] listC = new int[listA.length];
		int currentPos = 0;
		
		outside:for(int a : listA) {
			inside:for(int b : listB) {
				if(a == b) {
					listC[currentPos] = a;
					currentPos++;
					break inside;
				}
			}
		}
		
		for(int c : listC) System.out.println(c);
	}

}
