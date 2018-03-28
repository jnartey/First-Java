import java.util.Scanner;
public class DayOfWeek {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int dayNum = reader.nextInt();
		String day = "";
		
		switch(dayNum) {
			case 1:
				day = "Monday";
				break;
			case 2:
				day = "Tuesday";
				break;
			case 3:
				day = "Wednesday";
				break;
			case 4:
				day = "Thursday";
				break;
			case 5:
				day = "Friday";
				break;
			case 6:
				day = "Saturday";
				break;
			case 7:
				day = "Sunday";
				break;
			default:
				day = "Error";
				break;
		}
		
		System.out.println("Weekday " + dayNum + " is " + day);
	}

}
