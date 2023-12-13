package Inharitance;




class oppo1 {
	
	
	void calling () {
		
		
		System.out.println("this is the method to make a call....");
	}

	void texting () {
		
		System.out.println("This it eh method to make a text Massage.....");
	}
	
}




class oppo2 extends oppo1 {
	
	void clickinPhotos() {
		
		System.out.println("This is the method to click a photo in a oppo phone ");
	}
	
	
	
}







public class Oppo {

	public static void main(String[] args) {
	
		oppo2 sk = new oppo2();
		sk.clickinPhotos();
		sk.calling();
		sk.texting();
		
		

	}

}








