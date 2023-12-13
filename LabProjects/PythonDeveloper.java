package LabProjects;



// Write a program to demostrate Constructor overloading in PythonDeveloper class.
//PythonDeveloper class must have 
//instance variables id, name, email, yearsOfExperience, department and salary.
public class PythonDeveloper {
	int refno;
	int empId;
	int id; 
	String name;
	String email; 
	int yearsOfExperience; 
	String department; 
	double salary;
	
	
	
	PythonDeveloper(int id, int yearsOfExperience,double salary ) {
		
		this.id= id;
		this.yearsOfExperience=yearsOfExperience;
		this.salary=salary;
		
	}
	
	PythonDeveloper(String name, String email,String department ) {
		
		this.name=name;
		this.email=email;
		this.department=department;
		
	}
	
	
	
	
	PythonDeveloper()
	    {
	        // an empty PythonDeveloper
	        empId = id = refno = 0;
	    }
	

	public static void main(String[] args) {
	
		PythonDeveloper obj = new PythonDeveloper(11,5,15500.00);
		
		PythonDeveloper obj2 = new PythonDeveloper("Sandeep","Kashyaprishi56","IT");
		
		System.out.println("Employee name : "+obj2.name+"and Salary is : "+obj.salary);
		System.out.println(obj.empId);
		
		
	}

}
