package Polymorphism;

class calculator{
	
	public void  add(int i, int j) {
		System.out.println("sum of i and j is : "+(i+j));
		
	}
	
	public void add(String i,String j) {
		
		System.out.println("sum of i and j is : "+(i+j));
	}
	
	
	public void add(double i, double j) {
		System.out.println("sum of i and j is : "+(i+j));
		
	}
	
	
	
}





public class Example1 {	
	public static void main(String[] args) {
		
		calculator obj = new calculator();
		obj.add(3, 5);
		obj.add("hello "," World");
		obj.add(7.9, 99.90);
		
		

	}

}
