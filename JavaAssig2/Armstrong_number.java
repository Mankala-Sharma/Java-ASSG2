package JavaAssig2;
import java.util.Scanner;
public class Armstrong_number {

	public static void main(String[] args) {
		System.out.println("Enter 3 digit positive number");
		Scanner sr= new Scanner(System.in);
		int num=sr.nextInt();
		int temp=0;
		int originalNum=num;
		while(num!=0) {
			int rem= num%10;
			temp=(int) (temp+ Math.pow(rem, 3));
			num=num/10;
			
		}
		if(originalNum ==temp) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not An Armstrong number");
		}
		
		sr.close();
	}

}
