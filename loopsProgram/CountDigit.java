package loopsProgram;
import java.util.Scanner;


public class CountDigit {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the digits to count : ");
		int num = obj.nextInt();
          int count=0;
          
          
	    while (num != 0) {
	     
	      num = num/10;
	      ++count;
	    }
		
	    System.out.println(count);
		

	}

}
