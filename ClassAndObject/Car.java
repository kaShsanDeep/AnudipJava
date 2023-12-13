package ClassAndObject;

public class Car {
	private int modelNum=29022; 
	private String brand="maruti"; 
	private String model= "higher variant";


		public static void main(String[] args) {
			
			demo obj = new demo();
			obj.veichle();		
			 demo2 obj2 = new demo2();  
			 
			 
		        // Trying to access private method 
		        // of another class  
		        obj2.display();  //can not access this method as the method has a private access modefier
			
			
		
		}	
		
		
		
		
		 
		//we are using default access specifier 
		//which can access the private variables within a class only and is not visible to other class
		void model() {
			  
			  System.out.println(modelNum);
			  System.out.println(brand);
			  System.out.println(model);
		  }
	
		
		

}



class demo{
	
    //public access specifier 
	//we used here to check weather the method is visible to other class or not
	public void veichle() {
		
		
		System.out.println("This is the public access specifier");
		
		//we can call this method into our main method and class because it is a public access.		
	}
} 


class demo2 { 
	
	private void display()  
		{  
			System.out.println("Hi this is the private access modefier"); 
		}  
}  
  
 