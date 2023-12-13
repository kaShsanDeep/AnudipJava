package practiceCode;
import java.util.Scanner;

  
class OverWeightException  extends Exception  
{  
 public OverWeightException (String str)  
 {  
     // calling the constructor of parent Exception  
     super(str);  
 }  
}  
 
//class that uses custom exception OverWeightException  
public class UserDefinedException1  
{  

 // method to check the age  
 static void validate (int wieght) throws OverWeightException{    
    if(wieght >100){  

     // throw an object of user defined exception  
     throw new OverWeightException("The given wieght is overwieght...");    
    	}  
    
     else { 
    	 	
     System.out.println("Welcome, this age is suitable and under wieght");   
     }   
  }    

 
 
 
 
 
 // main method  
 public static void main(String args[])  
 {  
     try  
     {  
    	 
    	 Scanner sk = new Scanner(System.in);
         
    	 
    	 System.out.println("Enter the wieght of the person");
    	 
    	 int wieght = sk.nextInt();
    	 // calling the method   
         validate(wieght);  
     }  
     
     
     
     catch (OverWeightException e)  
     {  
         System.out.println("Caught the exception");  
 
         // printing the message from OverWeightException object  
         System.out.println("Exception occured: " + e);  
     }  

      
 }  
}  