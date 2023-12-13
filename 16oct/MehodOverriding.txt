package LabProjects;



//Write a program to demonstrate method overriding.

class animal{
	
	
	void walk() {
		
		System.out.println("Animal is waliking...");
	}
	
	void eat() {
		
		System.out.println("Animal is eating...");
		
	}
	
	
}


class dog extends animal{
	
	void eat() {
		System.out.println("Dog is eating...");
	}
	
	void bark() {
		System.out.println("Dog is barking... ");
		
	}
	
	void walk() {
		
		System.out.println("Dog is waliking...");
	}
	
	
	
}









public class MehodOverriding {
	


	public static void main(String[] args) {
	

		dog obj = new dog();
		obj.bark();
		obj.eat();  ///overriding the parent class method
		
		obj.walk();// method overriding for walk method
	}

}
