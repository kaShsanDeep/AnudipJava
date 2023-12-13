package practiceCode;

public class Pallindrom {

	public static void main(String[] args) {

		int x=123;
		int rev=0;
		int rem=0;
		
		while (x>0) {
			x=x/10;
	    	rem=x;
	    	rev=x*10+rem;
			
			
			//System.out.println(x);
			System.out.println(rev);
		}
		
		
		
		
		

	}

}
