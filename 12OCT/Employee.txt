package LabProjects;


import java.util.Scanner;


//Write a program to calculate the gross salary of a group of  employees. 
//Basic salary should be taken from the user.

//If the basic salary is greater than 15000 ,HRA=20% and DA=60% will be given, 
//else HRA=3000 and DA 70% will be given to the employee.



class gross{
	
	public double grosssalary(double basic_salary) {
		double gross_Salary=0;
		double HRA =0;
		double DA=0;
		if (basic_salary>15000) {
			
			HRA = 0.2*basic_salary;
			DA= 0.6*basic_salary;
			gross_Salary = HRA+DA+basic_salary;
			return gross_Salary;
		}else {
			
			HRA = 3000;
			DA= 0.7*basic_salary;
			gross_Salary = HRA+DA+basic_salary;
			return gross_Salary;
			
		}
		
	
	}
	
	
}




public class Employees {
	
	String Empname;
	double basic_salary;
	int EmpId;
	

	

	public Employees(String Empname,double basic_salary,int EmpId){
	
		this.Empname =Empname;
		this.basic_salary=basic_salary;		
		this.EmpId=EmpId;		
	
	
}



	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many mployees do you want to calculate :  ");
		int  num=sc.nextInt();
		
		for (int i=0;i<num;i++) {
			
		
			System.out.println();
		System.out.println("Enter the Employee Name ");
		 String Name=sc.nextLine();
		
		 sc.nextLine();
		 
		System.out.println("Enter the Employees Basic Salary ");
		double sal = sc.nextDouble();
		System.out.println("Enter the Employees Employee ID  ");
		int  EmpID=sc.nextInt();
		System.out.println();
		
		
		
		Employees sk = new Employees(Name,sal,EmpID);
		
		
		gross obj = new gross();
		
		
		
		double gross = obj.grosssalary(sk.basic_salary);
		System.out.println();
		

		System.out.println("Employee Name : "+Name+"\nbasic_salary : "+sal+"\nEmployee Id : "+EmpID);
	    System.out.println();
	    System.out.println("Gross Salary of the employee : "+gross);
	    
		}
		
		
		
	}

}
