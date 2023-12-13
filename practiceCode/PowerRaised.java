package practiceCode;


import java.util.Scanner;
public class PowerRaised {

	public static void main(String[] args) {


		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the base number : ");
		int x = obj.nextInt();
		System.out.println("Enter the power number : ");
		int y = obj.nextInt();
		int z=x;
		
		
	    for(int i =1; i<y;i++) {
	    	x=x*z;   	
	    	
	    }
	    System.out.println("The sqaure root of the  base number is : "+x);
		
		
		
		
	}

}
