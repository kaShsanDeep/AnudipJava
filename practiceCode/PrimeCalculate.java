package practiceCode;

public class PrimeCalculate {
	
	
	
public void calc(int x) {
	
		int count=0;

		for(int i=1;i<=x;i++) {
			if ((x%i)==0) {
	
				count++;
			}
			
		
		}
	
		if (count<=2) {
			System.out.println("This is a prime");
		}else {
			System.out.println("This is not prime ");
		}

	}	
	

}
