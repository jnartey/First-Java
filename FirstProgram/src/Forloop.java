
public class Forloop {
	public static void main(String[] args) {
//		for(int i = 0; i < 100; i+=5) {
//			System.out.print(i);
//			System.out.print(", ");
//		}
//		
		for(int i = 0; i < 100; i+=5) {
			System.out.print(i);
			
			for(int j = i; j < i+1; j++) {
				System.out.print(", ");
			}
		}
	}
}
