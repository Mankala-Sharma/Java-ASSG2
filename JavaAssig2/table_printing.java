package JavaAssig2;

import java.util.Scanner;

public class table_printing {

	public static void main(String[] args) {
		System.out.println("Enter number to print table");
		Scanner sr = new Scanner(System.in);
		int num= sr.nextInt();
		
		System.out.println("table of "+ num);
		for(int i=1; i<=10; i++) {
		
			System.out.print(num*i + " ");
		}

	}

}
