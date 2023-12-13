package loopsProgram;

import java.util.Scanner;

public class Forloop1 {

	public static void main(String[] args) {
		
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number to get the table");
		int x=obj.nextInt();
		
		for (int i=1;i<=10;i++) {
			
		System.out.println(x+" X "+i+" = "+x*i);}
		
		}
		
	}


