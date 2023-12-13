package Abstraction;


abstract class Animal{
	
	
	abstract void animalsSound();
	
	
}


class Dog extends Animal{
	
	void animalsSound() {
		System.out.println("The sound of the dog is : bhaw bhaw ");
		
	}
	
	public void walk() {
		System.out.println("The dog is eating . . . . ");
	}
	
}


class Cat extends Animal{
	void animalsSound() {
		System.out.println("The sound of the cat is : meaon meaon ");
		
	}
	
}








public class Abstraction {

	public static void main(String[] args) {

		Cat obj = new Cat();
		obj.animalsSound();
		Dog obj1 = new Dog();
		obj1.animalsSound();
		

	}

}
