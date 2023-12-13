package fundamentals;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
        Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the First number");
		int a = obj.nextInt();
		
		System.out.println("Enter the First number");
		int b = obj.nextInt();
		
		System.out.println("A = "+a+"\nB = "+b);
		
		
		
		a = a + b; 
	    b = a - b; 
	    a = a - b; 
		
		 System.out.println("After Swap A = "+a);
		 
		 System.out.println("After Swap B= "+b);
		 
		 
		
		
		
	}

}
