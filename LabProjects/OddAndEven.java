package LabProjects;

import java.util.Scanner;

//.Write a program to count and print the total 
//number of odd and even numbers from user inputs. 
//Program will ask for user inputs in a loop. 
//Loop will terminate if -1 is entered as input.
class OddOrEven{
	
	
	  public int Odd(int count,int num ) {
	    	
	    	 for(int i=1;i<=num;i++) {
				 if (i%2!=0) { count++;}	 			 
			 }   	
	    	return count;   	
	    }	

		  
		  
		  
		  public int Even(int count,int num) {
			  
			  
			  for(int i=1;i<=num;i++) {
					 if (i%2==0) { 	count++;	}
					 
				 }   	
		    	return count; 
			  
		  }
		
	
	
	
	
}








public class OddAndEven {
	
	

	public static void main(String[] args) {
	
		
		Scanner sk = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int num =sk.nextInt();
		int count =0;
		
		OddOrEven obj = new OddOrEven();
		int countValue = obj.Odd(count,num);
		int countValue2 = obj.Even(count,num);
		
		
		
		 System.out.println("Total number of Odd number till "+num+" is : "+countValue);
		
		 System.out.println("Total number of Even number till "+num+" is : "+countValue2);
	}

}
