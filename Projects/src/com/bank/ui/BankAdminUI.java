package com.bank.ui;

import java.util.Scanner;
import com.bank.model.BankManager;
import com.bank.service.BankAdmin;


public class BankAdminUI {

	public static void main(String[] args) throws Exception {
//	     String AdminId;
//		 String AdminName;
//		 String AdminPass;
//		 String empId;	
		
		
		Scanner sk= new Scanner(System.in);
		BankManager Admn = null;
		BankAdmin Adimpl = new BankAdmin();
		String Branch=null;
	
	
   
		System.out.println(" -------------------------------------------------------");
		System.out.println("|            Welcome To Anudip Bank Admin page          |");
		System.out.println(" -------------------------------------------------------\n\n");
		
		
		System.out.println("Select the branch : ");
		
		System.out.println("Type 1: North");
		System.out.println("Type 2: East ");
		System.out.println("Type 3: West ");
		System.out.println("Type 4: South");
		int option = sk.nextInt();
		               switch(option) {
		               case 1: Branch="North";
		               break;
		               case 2: Branch="East";
		               break;
		               case 3: Branch="West";
		               break;
		               case 4: Branch="South";
		               break;
		               }
		 
		          		 
		        			
		        			System.out.println("Enter the Admin Name");
		        			String AdName=sk.next();
		        			System.out.println("Enter the Admin Password");
		        			String Adpwd=sk.next();
		        			
		        			String Emp =Adimpl.login(AdName,Adpwd);
		        			
		        			if (Emp==null) {
								
								System.out.println("Wrong Username or Password");
								
							}else {
								System.out.println(" ************************");
								System.out.println("      Login Success"      );
								System.out.println(" ************************\n\n");					
							
								
//								System.out.println("Enter 2-------> Update Employee details");
//								System.out.println("Enter 3-------> Delete employee");
//								System.out.println("Enter 4-------> Show all Employee ");
//								System.out.println("Enter 5-------> Search Employee on the basis of id");
//								System.out.println("Enter 6-------> Search Employee  on the basis of name");
							
								
								
								
								 Admn =Adimpl.getManagerByName(AdName);
								
							
								 
								
								
								
								
								
								
								
							}
		  
		
		
		
		
	
		
		
		
		
		sk.close();
		
		         }
	

}
