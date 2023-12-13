package fundamentals;
import java.util.Scanner;
public class Employee {

	public static void main(String[] args) {
	
		Scanner obj = new Scanner(System.in);
		
		

		 
		  System.out.println("Welcome-Employee:  Hit Enter and help us with filling the details ");	  
		  String x = obj.nextLine();

		  System.out.println("Enter the Employee name");
		  String name = obj.next();
		  
		  
		  System.out.println("Enter the Email Id");
		  String empId= obj.next();
		  

		  System.out.println("Enter the phone number");
		  long phone = obj.nextLong();  
		  
		  System.out.println("Enter the Address");
		  String add = obj.next();
		  
		  System.out.println("Enter the roll number");
		  int salary = obj.nextInt();
		  
		  System.out.println("Enter the Height ");
		  double height = obj.nextDouble();
		  
		  
		  
		  
		  
		  System.out.println("select the options : \n 1: submit the details \n 2: Go back  \n 3: delete the details ");
		  int options = obj.nextInt();
		  
		  System.out.println("Thank you for sharing details");
		  
		  System.out.println("**************** Employee Details ***************");
		
		  System.out.println("Name : "+name+"\nEmployee ID : "+empId+"\nphone number : "+ phone +"\nAddress : "+add+"\nHeight : "+height+"Salary :"+salary);
		
		
		
		
		
		
	}

}
