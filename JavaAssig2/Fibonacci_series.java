package JavaAssig2;
import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the number of term for fibonacci series");
		Scanner sr = new Scanner(System.in);
		int N = sr.nextInt();
		
		int num1 = 0, num2 = 1;

       for(int i=1; i<=N;i++) {
    	   
    	   System.out.print(num1+" ");
    	   int num3=num1+num2;
    	   num1=num2;
    	   num2=num3;
       }
        
		
	sr.close();

	}

}
