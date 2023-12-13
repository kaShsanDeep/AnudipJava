package fundamentals;
import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter your marks");
		double marks = obj.nextDouble(); 
		
		
		if(marks>=60) {
		System.out.println("Excelent work,Keep it up");
		}
		else {
			System.out.println("Please put in more effort");
			
		}
		
		
	}

}
