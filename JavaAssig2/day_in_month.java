package JavaAssig2;
import java.util.Scanner;

public class day_in_month {

	public static void main(String[] args) {
		
		int month;
		System.out.println("Enter the month in numbers");
		Scanner sr = new Scanner(System.in);
		month = sr.nextInt();
		
		switch(month) {
		case 1,3,5,7,8,10,12:
			System.out.println("Number of days is 31");
			break;
		
		case 2:
			System.out.println("Number of days is 28 and 29 in leap year");
			break;
		
		case 4,6,9,11:
			System.out.println("Number of days is 30");
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		
		
		
		sr.close();
		
	}

}
