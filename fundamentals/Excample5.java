package fundamentals;


import java.util.Scanner;

public class Excample5 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter your number to check weather it is positive or negative  :");
		int num= obj.nextInt();
	
		
		//WE can also use the else if statement in our code if the condition is approaching more then two
		
		
		if(num>0) {
			System.out.println("This is the positive number ");			
			
		}
		else if(num<0) {
			System.out.println("This is the negative number");
			
		}else {
			System.out.println("The number is equal to Zero");
		}

		
		

	}

}
