package LabProjects;

import java.util.Scanner;

//Create an abstract class Shape with an abstract method calculateArea().
//Implement two subclasses, Circle and Rectangle, 
//which inherit from Shape and provide their own 
//implementations of calculateArea().
//Write a program to calculate and print the areas of a circle and a rectangle.


abstract class Shape{
	
	abstract double calculateArea();
} 


class Circle extends Shape{

	public double  calculateArea(int r) {
	    double pi=3.14;
		double area= pi*r*r;
		return area;	
	}
	
}



class Rectangle extends Shape{
	
	public int calculateArea(int l, int b) {
		int area= l*b;
		return area;	
	}
	
	
}




public class Area {

	public static void main(String[] args) {
		Circle obj= new Circle();	
		Rectangle obj2 = new Rectangle();
		Scanner sk= new Scanner(System.in);
		 
			System.out.println("Enter the Radius of the circle : ");
				int r = sk.nextInt();
				System.out.println("Area of the Circle is : "+ obj.calculateArea(r));
				
				System.out.println();
		
		 
				System.out.println("Enter the Length of the Rectangle : ");
				int l = sk.nextInt();
				System.out.println("Enter the Breath of the Rectangle : ");
				int b = sk.nextInt();
				
				System.out.println("Area of the Circle is : "+obj2.calculateArea(l, b));
		
	}

}
