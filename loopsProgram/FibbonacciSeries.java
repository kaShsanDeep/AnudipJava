package loopsProgram;

public class FibbonacciSeries {

	public static void main(String[] args) {
		
		
		
		
		 int num1=0,num2=1,num3;    
		 System.out.print(num1+" "+num2);
		 //printing 0 and 1    
		    int count=10;
		    
		 for(int i=2;i<count;++i)
		  num3=num1+num2;    
		  System.out.print(" "+num3);    
		  num1=num2;    
		  num2=num3;    
		 }    
		  
		
		
		

	}

}
