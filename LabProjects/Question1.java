package LabProjects;

public class Question1 {
	
	String name;
	int roll;
	double marks;
	char z;
	
	public Question1(String name) {
		 this.name=name;
	 
		
	}
	
	public Question1(int roll,double marks,char z, String name ) {
		
		this.roll=roll;
		this.marks=marks;
		this.z=z;
		this.name=name;
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		Question1 obj = new Question1("Sandeep");
		 System.out.println(obj.name);
		 
		Question1 obj1 = new Question1(012,55.0,'S',"sandeep");
		  System.out.println("Name : "+obj1.name);
		  System.out.println("Marks : "+obj1.marks);
		  System.out.println("First letter : "+obj1.z);
		  System.out.println("Roll no : "+obj1.roll);
	}

}
