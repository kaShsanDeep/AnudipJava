package Inharitance;

class Honda {
	
	String logo= "H";
	
}

class Activa extends Honda  {
	
	
	void kickstart() {
		
	
		System.out.println("this is the scooty of honda and start withoud gear");
		System.out.println("**"+logo+"**");
	}
}

class city extends Honda{
	
	void home() {
		System.out.println("this is the home of honda ");
		System.out.println("**"+logo+"**");
	}
}









public class Hierarchical {

	public static void main(String[] args) {
		
		city obj = new city();
		obj.home();
       
		 
		Activa  obj2 = new Activa();
		obj2.kickstart();
		
		
		
	}

}
