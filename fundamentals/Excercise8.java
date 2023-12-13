package fundamentals;

import java.util.Scanner;

public class Excercise8 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the first no : ");
		int x = obj.nextInt();
		System.out.println("Enter the second no : ");
		int y = obj.nextInt();
		System.out.println("choose the character to perform operation ");
		System.out.println(" 1.Addition(+) \n 2.Subtraction(-) \n 3.Devision(/) \n 4.reminder(%)");
		char z = obj.next().charAt(0);
		
		
		
		switch (z) {
		case  '+':
			
			System.out.println("This is the Addition of the numbers : "+(x+y));
			
			break;
		case '-':
			System.out.println("This is the subtraction of two numbers : "+(x-y));
			break;
		case '/':
			System.out.println("This is the devsion for quatient : "+(x/y));
			break;
		case '%':
			System.out.println("This is the devision for reminder :"+(x%y));
			break;	
			
		default : System.out.println("Please select the valid operation");	
			
		   }

	}

}
