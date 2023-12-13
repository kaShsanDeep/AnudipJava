package loopsProgram;

import java.util.Scanner;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number of columns you want : ");
		int num = obj.nextInt();
		
		System.out.println("Enter the number of rows you want : ");
		int num2 = obj.nextInt();
		
		
		for(int i =1;i<=num2;i++) {
			
			for (int j=1;j<num;j++) {
				System.out.print(" * ");
			}
			System.out.println(" * ");
		}

	}

}
