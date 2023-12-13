package ClassAndObject;
import java.util.Scanner;

public class ExampleReturn2 {

	
	
	
	public double areaOfCircle() {
	Scanner sc = new Scanner(System.in);
	
	 double pi = 3.14;
	System.out.println("Enter the radius of the circle : ");
	int r = sc.nextInt();
	

	
	return  pi*(r*r);
	
	}
	
	
	
	public static void main(String[] args) {
		
		
		ExampleReturn2 sk = new ExampleReturn2();
            
		System.out.println("area of the circle is : " + sk.areaOfCircle());

	}

}
