package fundamentals;

import java.util.Scanner;
public class Example2 {
  public static void main(String[] args) {
	
	  Scanner obj = new Scanner(System.in);
	  
	  
	 
	  System.out.println("Please say hello and Hit Enter and :  help us with filling the details ");	  
	  String x = obj.nextLine();

	  System.out.println("Enter the name");
	  String name = obj.next();
	  
	  System.out.println("Enter the roll number");
	  int roll = obj.nextInt();
	  
	  System.out.println("Enter the Marks ");
	  double marks = obj.nextDouble();
	  
	  
	  
	  System.out.println("select the options : \n 1: submit the details \n 2: Go back  \n 3: delete the details ");
	  int options = obj.nextInt();
	  
	  System.out.println("Details are submitted succesfully");
	
	  System.out.println("Name : "+name+"\nRoll no. : "+roll+"\nMarks : "+marks);
	  
}
	
	
	
}
