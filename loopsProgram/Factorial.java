package loopsProgram;

import java.util.Scanner;


public class Factorial {

	public static void main(String[] args) {

		
		Scanner obj = new Scanner(System.in);
		
		int x = obj.nextInt();
		int y =1;
		
		for (int i=x;i>=1;i--) {
			
		 y=y*i;		
		}
			
		System.out.println(y);	
		

	}

}
