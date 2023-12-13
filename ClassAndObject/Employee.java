package ClassAndObject;

import java.util.Scanner;
public class Employee {
	
	
	String name = "sandeep"; 
	static double salary=  8000;
	String designation= "process executive";
	String email      =   "Kashyaprishi56@gmail.com";	

	public static void main(String[] args) {
		Employee sk = new Employee();
		Scanner obj = new Scanner(System.in);
		
		
	
		
		sk.markingAttendance();
	
		
		
		System.out.println("Enter the leave taken in a month : ");
		int leaveTaken = obj.nextInt();
		
		
	
			
		int LeaveBal = sk.leavebalance(leaveTaken);
		System.out.println("Leave balance  : "+LeaveBal);	
		
		
		
		double FinalSalary=sk.monthlyDeduction(LeaveBal, salary);
		 

		System.out.println("Final Salary after Monthaly deduction :  "+ FinalSalary);
		
		
	}
	
	
	
	
	///void return typeto print the employee details and marking attandance 

		public void markingAttendance() {
			
			System.out.println("Employee Name : "+name+"\nEmployee Salary :"+salary+"\nEmployee Designation :"+designation+"\n4Employee Email :"+email);	
			
			System.out.println("Enter the attandance for the employee ");
			Scanner obj= new Scanner(System.in);
			 int attandance = obj.nextInt();
			 System.out.println("Attandance marked for the employee is :  "+ attandance);
						
			
		}
	
	
		
		
		//integer return type method is to get the balanced leave in a month
		public int  leavebalance(int LeaveTaken) {
		
		int leave=0;
		
			  leave  = 4-LeaveTaken;
		
			return leave;	
		}
	
		
		
		
		
		
		
	// double type method to get the monthaly deduction of salary in a month if employee is absent more then leaves 
	public double monthlyDeduction(int LeaveBal, double sal) {
		double FinalSalary=0;	
		
		if (LeaveBal<0) {
			 int Bal1 = LeaveBal*500;
			 FinalSalary= sal+(Bal1);		
			  return FinalSalary;
			}
			else return sal;			
					
	}
					
	
	
	
	
	
	
	
}








