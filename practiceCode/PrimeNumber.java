package practiceCode;

import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sk = new Scanner(System.in);
		PrimeCalculate obj = new PrimeCalculate();
		
		System.out.println("Enter the number : ");
		
		int number = sk.nextInt();
		
		 obj.calc(number);		
		
	}

}




