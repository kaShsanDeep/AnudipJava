package LabProjects;



//If we give the final keyword to a class then, no class can extend the final class 


//final keyword is used to give any variable a final allotment so, 
//it would not be able to make any changes to the variable value


//Final keyword can also used to stop the method overriding 
//if we give a  final tag to a method so that method wont be override in child class 


class example extends FinalKeyword{
	
	
	//this method would not be able to override because we have already given 
	//the final keyword to the same method in the main parent class 
	we can't even write the same method for overriding.
	void display() {
		//System.out.println("this can not be over ride");
	}
	
	
}




public class FinalKeyword {
	

	
	final int x = 99;
	
	// x= 78; this is not allowed 
	
	
	final void display() {
		
		//x =98;  this can not be override
		System.out.println("this is the main class method");
		
	}
	public static void main(String[] args) {
		
	

	}

}
