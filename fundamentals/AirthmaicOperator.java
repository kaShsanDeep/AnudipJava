package fundamentals;

import java.util.Scanner;

public class AirthmaicOperator {

	public static void main(String[] args) {
	
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the First number");
		int x = obj.nextInt();
		
		System.out.println("Enter the First number");
		int y = obj.nextInt();
		
		System.out.println("A = "+x+"\nB = "+y);
		
		System.out.println("calculations :   ");
		   
		
		System.out.println("Addition of i and j : "+(x+y));
		System.out.println("Subtraction of i and j : "+(x-y));
		System.out.println("Multiplication i and j  : "+(x*y));
		System.out.println("devision i and j : quotient : "+(x/y));
		System.out.println("devision i and j  : reminder  "+(x%y));
		
	
		
		
		

	}

}
