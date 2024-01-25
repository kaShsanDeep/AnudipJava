package com.bank.ui;
import java.util.*;

import com.bank.service.CustomerServiceImpl;
import com.bank.exception.CustomException;
import com.bank.exception.DataProcessor;
import com.bank.model.bankingcustomer;
public class bankingmain {

	public static void main(String[] args)throws Exception {
		
		Scanner bs=new Scanner(System.in);
		CustomerServiceImpl dao=new CustomerServiceImpl();
		bankingcustomer b1=null ;	
		DataProcessor processor = new DataProcessor();
	
		System.out.println("************Customer Page**************\n\n");	
	
		
	        System.out.println("┌───────────────────────────────┐");
	        System.out.println("│   Welcome to Anudip Bank      │");
	        System.out.println("├───────────────────────────────┤");
	        System.out.println("│ Type 1: Register              │");
	        System.out.println("│ Type 2: Log In                │");
	        System.out.println("└───────────────────────────────┘");
	
		int op=bs.nextInt();
	
		switch(op) {
		
		case 1->{
		//creating new account
			System.out.println("Enter Customer Details to create new account");
			
			System.out.print("Enter  ID ");
			int cId=bs.nextInt();
			System.out.print("Enter Customer Name");
			String cName=bs.next();
			System.out.print("Create Customer Email address : ");
			bs.nextLine();
			String cEmail=bs.next();
			System.out.print("Enter Cutstomer Phone");
			String cphone=bs.next();
			System.out.print("Enter Acc balance");
			int caccbal=bs.nextInt();
			
			
			
			
			String pwd= cphone.substring(0,3);
			String cpwd=cName+"@"+pwd;
			
              
			b1 = new bankingcustomer(cId,cName,cpwd,cphone,caccbal);
			
			
			 int res=dao.registerCustomer(b1);
			if(res>0) {
				System.out.println(" ************************");
				System.out.println("     Account Created      ");
				System.out.println(" ************************\n");
			}
			else {
				System.out.println("user already existed in system");
			}
		}
		
		  case 2->{
			//login into my account
			System.out.println("Enter Customer Details to Login");
			System.out.print("Enter Customer Name\n");
			String cName=bs.next();
			bs.nextLine();
			System.out.print("Enter Customer Password\n");
			String cpwd=bs.next();
			
		
			
			int res=dao.login(cName, cpwd);
			if(res==0) {
				System.out.println("Wrong Username or Password");
			}
			else if(res==-1) {
				System.out.println("account not found\n Please Register yourself");
			}
			else {
				System.out.println(" ************************");
				System.out.println("      Login Success      ");
				System.out.println(" ************************\n\n");
				//we are giving access to withdraw or deposit
				
				System.out.println("Welcome! "+ "------"+cName+"-------\n\n");
				boolean flag =true;
				
				while(flag) {
					
				
					    System.out.println("┌───────────────────────────────┐");
				        System.out.println("│      Select Operations        │");
				        System.out.println("├───────────────────────────────┤");
				        System.out.println("│ Type 1: Withdraw              │");
				        System.out.println("│ Type 2: deposit               │");
				        System.out.println("│ Type 3: check balanc          │");
				        System.out.println("│ Type 4: pin change            │");
				        System.out.println("│ Type 5: Log Out               │");
				        System.out.println("└───────────────────────────────┘");
				        
				    				        
					
					
					int op2=bs.nextInt();
				
					switch(op2) {
					
					case 1->{
					
						try {
						//withdraw amount
						System.out.println("Enter amount to withdraw\n");
						
						int amt=bs.nextInt();
						processor.processData(amt);
						
					    int res2=dao.withdraw(res, amt);
						if(res2<=0) {
							System.out.println("Something went wrong");
						}
						else {
							System.out.println(" ************************");
							System.out.println("	Withdraw done");
							System.out.println(" ************************\n\n");
							
							
							System.out.println("updated balance is : "+res2);
							
							
						}
						
						}catch(CustomException e) {
							
							 System.out.println("Custom Exception caught: " + e.getMessage());
						}
						
						
					}
						
					case 2->{
						//depositing
						try {
						System.out.println("Enter amount to deposit\n");
						int amount=bs.nextInt();		
						processor.processData2(amount);
						int res2=dao.deposit(res, amount);
						if(res2==-1) {
							System.out.println("Something went wrong");
						}
						else {
							System.out.println(" ************************");
							System.out.println("      Deposit done"       );
							System.out.println(" ************************\n\n");
							System.out.println("updated balance is: "+res2);
							
						
						}
						}catch(CustomException e) {
							
							 System.out.println("Custom Exception caught: " + e.getMessage());
							
						}
					}
					
					case 3->{
						//balance checking
						System.out.println(" ************************");
						System.out.println("     your balance is +"+dao.checkBalance(res));
						System.out.println(" ************************");
					}
					case 4->{
						//pin change
						System.out.println("Enter your Password");
						String pwd=bs.next();
						System.out.println("Enter new password");
						String newpin=bs.next();
						int count=dao.pinChange(res, pwd,newpin);

						if(count<=0)
						{
							System.out.println("Password not matched");
						}
						else {
							System.out.println(" ************************");
							System.out.println("     password updated     ");
							System.out.println(" ************************");
							}
					}
					
					
				
					
					case 5->{
						System.out.println("Are you sure you want to Log out");
						System.out.println("Press 1: to confirm");
						int log =bs.nextInt();
						if(log==1) {
										
							System.out.println("*****You have logged out successfully*****\n \n");
							bankingmain.main(args);
						}
						else{
							System.out.println("Please comfirm...");
						}
					}
					
					
						}
					}	
					
					
					
					
					
					
					}
					
	
				}
				
			
				
			
			}
		bs.close();
	
		
			}
		}
		
		
					
		
