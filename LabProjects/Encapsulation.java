package LabProjects;


//Write a program to demonstrate encapsulation in Food class

class demo{
	 	String name; 
	    int age; 
	
	    
	    void setName(String name) {
	    	
	    	this.name=name;
	    }
	    void setAge(int age) {
	    	this.age=age;
	    }

	    
	    String getName() {return name;}
	  
	    int getAge() {return age;}
	
}




public class Encapsulation {

	public static void main(String[] args) {
		
		demo obj = new demo();
		obj.setName("Sandeep");
		obj.setAge(26);
		
		System.out.println("Name  : "+obj.getName());
		System.out.println("Age is : "+obj.getAge());
		

	}

}
