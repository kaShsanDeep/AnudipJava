package practiceCode;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the First number : ");
		int x = obj.nextInt();
		System.out.println("Enter the Second number : ");
		int y = obj.nextInt();
		
		
		for (int i=1;i<=x;i++) 
			{
				if (x%i==0) 
				{
					System.out.println(i);
				}
			}
		
		System.out.println();
		
		
		for (int j=1;j<=y;j++) 
			{
					if (y%j==0) 
					{
						System.out.println(j);
					}	
				
			}
		
	

		} 

}
	

	
