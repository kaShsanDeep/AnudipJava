package practiceCode;

public class SumofArray {

	public static void main(String[] args) {
		
		int x=0;
		
		int [] nums = {3,4,5,50,90,10};
		
			for(int i =0;i<nums.length;i++)
			{
				x = x+nums[i];
			    System.out.println(x);
			  
			}
			  System.out.println("This is the final sum value of the array :"+x);

	}

}
