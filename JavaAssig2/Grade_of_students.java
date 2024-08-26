package JavaAssig2;
import java.util.Scanner;
public class Grade_of_students {

	public static void main(String[] args) {
		int marks;
		System.out.println("Enter the marks of Student");
		Scanner sr= new Scanner(System.in);
		marks = sr.nextInt();
		
		if (marks>90 && marks<=100) {
			System.out.println("Grade of Student is- A1" );
		}else if (marks>80 && marks<=90) {
			System.out.println("Grade of Student is- A2" );
		}else if (marks>70 && marks<=80) {
			System.out.println("Grade of Student is- B1" );
		}else if (marks>60 && marks<=70) {
			System.out.println("Grade of Student is- B2" );
		}else if (marks>50 && marks<=60) {
			System.out.println("Grade of Student is- C1" );
		}else if (marks>40 && marks<=50) {
			System.out.println("Grade of Student is- C2" );
		}else if (marks>=33 && marks<=40) {
			System.out.println("Grade of Student is- D1" );
			
		}else if (marks>20 && marks<=33) {
			System.out.println("Grade of Student is- D2" );
			System.out.println("Eligible to appear in compartment exams" );
		}else if (marks>=00 && marks<=20) {
			System.out.println("Grade of Student is- E" );
			System.out.println("Eligible to appear in compartment exams" );
		}
		sr.close();
	}

}
