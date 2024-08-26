package JavaAssig2;
import java.util.Scanner;

public class right_angled_triangle{

	public static void main(String[] args) {
		
		System.out.println("Enter number of pyramid line");
		Scanner sr= new Scanner(System.in);
		int n= sr.nextInt();
		
		for(int i=0;i<n; i++) {
			for(int j=n-i; j>1; j--) {
				
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();	
		}
		sr.close();
	}

}
