package ClassAndObject;
import java.util.Scanner;

public class ReturnTypeDemo {
	
	
	
	
	
	public int add() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number : ");
		int b=  sc.nextInt();
		
		return a+b;

		
	}

	
	public static void main(String[] args) {
		ReturnTypeDemo sk = new ReturnTypeDemo();
		
		
		int c = sk.add();
		System.out.println("This is the sum of two numbers : "+c);
		System.out.println("This is the average of the numbers : "+(c/2));
        

		
	}
	

}
