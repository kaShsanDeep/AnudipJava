package ClassAndObject;

public class Example1 {

	public static void main(String[] args) {
		
		student obj = new student();
	     String x =	obj.name;
	     int y =  obj.rollno;	 
	     String z= obj.subject;
	     System.out.println("Student details : \n"+x+"\n"+y+"\n"+z);
	     System.out.println();
	     
	     obj.display();
	     
		
		}

}


class student {
	int rollno =23;
	String name ="sandeep";
	String subject ="Java";
	
	public void display() {
		
		System.out.println("'HI Everyone i am a student ");
	}
	
	
}