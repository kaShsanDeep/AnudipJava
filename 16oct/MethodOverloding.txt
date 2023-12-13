package LabProjects;

public class MethodOverloding {

	
	int display(int x) {
		
		if(x%2==0) 
		{
			System.out.println("Yes this number is "+x+" And Even :");
			x++;
		}
		return x;
		
	}
	
	void display() {
		System.out.println("This is the display method without any return value ");
	}
	
	
	
	double display(double x,double y,double z) {	
		return x+y+z;
	}
	
	public static void main(String[] args) {
		
		
		MethodOverloding obj = new MethodOverloding();
		
		int x= obj.display(4);
		
		
		 System.out.println("The Next number : "+x+"  is Odd");
		
		 obj.display();
		
		 double marks =obj.display(37.0,22,33.54);
		 System.out.println("Total Marks of the student "+marks);
		

	}

}
