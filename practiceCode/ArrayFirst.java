package practiceCode;

public class ArrayFirst {

	public static void main(String[] args) {
		String [] clients = {"diksha","misthi","prachi","krishna","rishabh","saurabh","rishika","Rishika's friend"};
         int [] charges = {800,500,500,600,1200,1200,800,800};
		
		int sum=0;
		
         	for(int i=0;i<clients.length;i++) 
         		for(int j=0;j<charges.length;j++)
				
			
			
			
			if(i==j)
			{
				System.out.println(clients[i]+"  =  "+charges[j]);
			}			
		
		
         
         System.out.println("\n Total students : "+clients.length);
         for (int x=0;x<charges.length;x++) 
         {
        	 sum =sum+charges[x];
        	 
         } 
         System.out.println("Total fee collected : " +sum);
		
		}
}
