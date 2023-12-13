package fundamentals;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the first number");
		int x =obj.nextInt();
		System.out.println("Enter the second number");
		int y =obj.nextInt();
		System.out.println("Enter the third number");
		int z =obj.nextInt();

		if (x>y&&x>z){
		
			System.out.println(x+"  is big");
			
			}
		
		else if(y>x&&y>z){
							
			System.out.println(y+" is Big");		
			
		}
		
		else 
				{
				
			System.out.println(z+" is big");
		
				}
		

	}

}
