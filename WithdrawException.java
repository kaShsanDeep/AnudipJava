import java.util.Scanner; 

class BlanceWithdrawException extends Exception{
	 public BlanceWithdrawException (String str)  
	    {  
	        // calling the constructor of parent Exception  
	        super(str);  
	    }  
	
	
}





public class WithdrawException {
	
	
	static void validate (double with,double bal)throws BlanceWithdrawException{
		
		
		if(with>bal) {
			
			throw new BlanceWithdrawException("Inufficient balance, please update the account balance");
		}
		
		else {
			
			System.out.println(with+"$ is withdrawing......");
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
	
	
		
		Scanner sk = new Scanner(System.in);
		

		System.out.println("Enter the balance amount");
		double balance = sk.nextDouble();
		System.out.println("Enter amount to withdraw");
		double withdraw = sk.nextDouble();
		sk.nextLine();
		
		
		try {

          validate(withdraw,balance);
			
			
			
		}
			catch (BlanceWithdrawException e) {System.out.println("caught the exception: ");
			
			
			System.out.println("Exception: "+e);
			}
			
			
			
		}

	}


