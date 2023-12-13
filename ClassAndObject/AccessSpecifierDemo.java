package ClassAndObject;

public class AccessSpecifierDemo {
	
	public int EmpId=999;
	
	public void display() {
		System.out.println("hi this is an void method ");
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		AccessSpecifierDemo sk =new AccessSpecifierDemo();
		
		sk.display();
		System.out.println("Employee ID is : "+sk.EmpId);
		
		Myclasss  sk1 = new Myclasss();
		
		 sk1.display();
	}

}
