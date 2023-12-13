package fundamentals;

import java.util.Scanner;

public class ParameterExample {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		para sk = new para();
		
		
		System.out.println("Enter the name");
		String name = obj.nextLine();
		
		sk.welcome(name);
		
		
		

	}

}




class para{
	
	public void welcome(String s) {
		
		System.out.println("welcome to Hell "+s);	}
	
	
}
