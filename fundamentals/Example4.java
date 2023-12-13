package fundamentals;


import java.util.Scanner;
public class Example4 {

	public static void main(String[] args) {
		
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter your number");
		
		
		int num; 
		
		num = obj.nextInt();
		
		if(num%2==0) {
			
			System.out.println("This is a even number");
		}
		else {
			System.out.println("This is odd number");
		}
		
		

	}

}
