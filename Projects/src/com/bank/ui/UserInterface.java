package com.bank.ui;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   
import java.util.Scanner;

import com.bank.exception.InvalidInputTypeException;


public class UserInterface {

	public static void main(String[] args) throws Exception {
		
		
		
		try {
	Scanner bs= new Scanner(System.in);

		System.out.println(" -------------------------------------------------------");
		System.out.println("|            Welcome To Anudip Bank                     |");
		System.out.println(" -------------------------------------------------------\n\n");

		 
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));  
		
		
		    System.out.println("┌───────────────────────────────┐");
	        System.out.println("│   Welcome to Anudip Bank      │");
	        System.out.println("├───────────────────────────────┤");
	        System.out.println("│     Type 1: Customer          │");
	        System.out.println("│     Type 2: Employee          │");
	        System.out.println("│     Type 3: Admin             │");        
	        System.out.println("└───────────────────────────────┘");	
		
	        int  option = bs.nextInt();
	        bs.nextLine();
	       
	      //  processInput(option);
	        
	      
	        
	        if(option==1) { 
	        	
	        	dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");      		  
	        		bankingmain.main(args);
	        	 
	    		
	        }else if(option==2) {
	        	   dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	        	BankEmployeeUI.main(args);
	        	
	        }else if(option==3) {
	        	
	        	dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	        	BankAdminUI.main(args);
	        }
	        
	        else{
	        	System.out.println("┌───────────────────────────────┐");
	 	        System.out.println("│   Please Enter valid key      │");
	 	        System.out.println("└───────────────────────────────┘");
	 	       UserInterface.main(args);
	        }
		}
		catch(InvalidInputTypeException e) {
			System.out.println("Error: " + e.getMessage());
			
		}
	        
		
		
		
	

	}

	

}
