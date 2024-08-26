package JavaAssig2;
import java.util.Scanner;

public class palindrome_check {

	public static void main(String[] args) {

		int num, rem; 
		int reverseNum=0;
		System.out.println("Enter Number to check Palindrome");
		Scanner sr= new Scanner(System.in);
		num= sr.nextInt();
		
		int originalNum= num;
		while(num!=0) {
			rem = num%10;
			reverseNum= reverseNum*10+rem;
			num=num/10;
		}
		if (originalNum == reverseNum) {
			System.out.println("Palindrome Number");
		}else {
			System.out.println("Not a Palindrome Number");
		}
		sr.close();
	}
	
}
