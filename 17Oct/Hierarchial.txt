package LabProjects;



//when two or more child is inherited from a single class this would be known as Hierarchial inheritance 





class a extends Hierarchial{
	
	void admin() {
		System.out.println("this is the admin portal .. . ");
	}
	
	
}

class b extends Hierarchial{
	
	void employee(){
		
		System.out.println("Welcome to the employee portal  :");
	}
	
}

class c extends Hierarchial{
	
	void customer(){
		
		System.out.println("Welcome to the Customer care service");
	}
	
}



public class Hierarchial {
	

	
	void display() {
		
		System.out.println("method shows the product details");
	}
	void  helpline() {
		System.out.println("Welcome to the helpline number  :  ");
		
	}
	
	

	public static void main(String[] args) {
	
		
		
		 c obj = new c();
		 obj.display();  //calling parent class method using the child object
		 obj.helpline(); // calling  helpline method using Hierarchial inheritance
		 
		
		 Hierarchial obj2 = new Hierarchial();
		 	
		 	obj2.helpline();
		 	obj2.display();
		 	
		 	
		 	
		 	Hierarchial obj3=new b();
		 	obj3.helpline();
		 	obj3.display();
		 
		 	
		 	
	}

}
