package Inharitance;

//this is the parent class
class person{
	
	
	void eating() {
		System.out.println("Person can eat.... ");
	}
	
	void walking() {
		
		System.out.println("Perso can walk....");
	}
	
}



//child class of person
class employee extends person{
	
	void markAttandance() {
		System.out.println("This method can mark attandance.... ");
	}
	
}

//child class of employee
class developer extends employee{
	
	
	void coding() {
		
		System.out.println("Here the developer can write the code..... ");
	}
}




public class Multilevel {

	public static void main(String[] args) {
		
		developer D = new developer();//creating object using the lower child class

		D.eating();
		D.walking();
		D.coding();
		D.markAttandance();
		
	}

}
