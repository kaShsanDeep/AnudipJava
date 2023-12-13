package LabProjects;


//Create a class Food with variables foodId, foodName, category and type. Demonstrate the use of different constructor
//to create different types of Food objects.






public class Food {

	int foodId; 
	String foodName; 
	String category;
	String type;
	
public Food(int x ) {

	this.foodId=x;
		
	}
	

	public Food(int foodId, String foodName, String category,String type ) {
		this.foodId = foodId;
		this.foodName = foodName;
		this.category = category;
		this.type = type;
	}




	
	public static void main(String[] args) {
	
			Food  obj = new Food(101);
		
		    System.out.println("Food ID  is for first object  :  "+obj.foodId);
		    
		
		    Food obj2 = new Food(1, "Pizza", "Fast Food", "Italian");
	        Food obj3 = new Food(2, "Sushi", "Seafood", "Japanese");
	        
	   
	        
	        System.out.println("Food ID for second object is : "+obj2.foodId+"\nFood Name : "+obj2.foodName+"\ncategory Name :"+obj2.category+"\nFood Type : "+obj2.type);
		

	}

}
