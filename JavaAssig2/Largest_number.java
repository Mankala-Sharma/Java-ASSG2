package JavaAssig2;
import java.util.Scanner;
public class Largest_number {

	public static void main(String[] args) {
		int num1, num2,num3;
		System.out.println("Enter any three numbers");
		Scanner sr = new Scanner(System.in);
		num1 = sr.nextInt();
		num2= sr.nextInt();
		num3= sr.nextInt();
		if(num1>num2) {
			if(num1>num3) {
				System.out.println("The Largest Number is- "+ num1 );
								
			}else{
				System.out.println("The Largest Number is- "+ num3 );
			}
		}else if(num2>num3) {
			System.out.println("The Largest Number is- "+ num2 );
		}else {
			System.out.println("The Largest Number is- "+ num3 );
		}
		sr.close();
	}

}
