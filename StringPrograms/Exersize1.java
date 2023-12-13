package StringPrograms;

public class Exersize1 {

	public static void main(String[] args) {
		
		String institute= "SoS";
	
		
		int len = institute.length();
		System.out.println("length of the String is : "+len);
		
		String rev="";
		for (int i=len-1;i>=0;i--) {
			
		rev+=institute.charAt(i);
		
		}
		
        System.out.println(rev);
        
        if(institute.equals(rev)) {
        	System.out.println("this is palindrome");
        	
        }
        else {
        	System.out.println("not palindrom");
        }
	}

}
