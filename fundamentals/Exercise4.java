package fundamentals;


import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
         Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle");
		int r = obj.nextInt();
		
		float pi=22/7;
		float area= pi*r*r;
		
		float parameter= 2*pi*r;
		
		System.out.println("area of the circle  : "+area);
		
		
		System.out.println("parameter of the circle : "+parameter);
		
		    
		
		
		
		
		

	}

}
