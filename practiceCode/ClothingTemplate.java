package practiceCode;

public interface ClothingTemplate {
	  public void winterClothing();      // interface method (does not have a body)
	  public void summerClothing();     // interface method (does not have a body)
	}

	// Myntra "implements" the winterClothing() interface
	class Myntra implements ClothingTemplate {
	  public void winterClothing() {
	    // The body of winterClothing() is provided here
	    System.out.println("This is the winter cloths in myntra");
	  }
	  public void summerClothing() {
	    // The body of summerClothing() is provided here
	    System.out.println("this is the summer cloths in myntra ");
	  }
	}
	
	// Ajio "implements" the winterClothing() interface
	 class Ajio implements ClothingTemplate {
		  public void winterClothing() {
		    // The body of winterClothing() is provided here
		    System.out.println("This is the winter cloths in ajio");
		  }
		  public void summerClothing() {
		    // The body of summerClothing is provided here
		    System.out.println("This is the summer cloths in Ajio");
		  }
		}
	
	

	class Main {
	  public static void main(String[] args) {
		  Ajio  obj = new Ajio();  // Create a Ajio object
	    obj.winterClothing();
	    obj. summerClothing();
	  }
	}