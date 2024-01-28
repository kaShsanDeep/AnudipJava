package com.bank.ui;

import java.util.Scanner;

import com.bank.model.BankEmployee;
import com.bank.model.bankingcustomer;
import com.bank.service.*;
public class BankEmployeeUI {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 String empId;
		 String empName;
		 String empEmail;
		 String empPhone;
		 String empAdd;
	     String empBranch;
	     double empSalary;
		 String empPass;
		 int LeaveBal;

		 boolean flag;
		 BankEmployee E1 = null;
		 bankingcustomer c = null;
		 CustomerServiceImpl  cimpl = new CustomerServiceImpl();
		 Scanner sk = new Scanner(System.in);
		 
		 BankEmployeeServiceIMplement Eimpl = new BankEmployeeServiceIMplement();
		
		 System.out.println("************Employeee Page**************");
		 
		 	System.out.println("┌───────────────────────────────┐");
	        System.out.println("│   Welcome to Anudip employee  │");
	        System.out.println("├───────────────────────────────┤");
	        System.out.println("│       Type 1: Register        │");
	        System.out.println("│       Type 2: Log In          │");
	        System.out.println("└───────────────────────────────┘");
		 
	        Integer option = sk.nextInt();
					
				
				switch(option){
					
				case 1: 			
					System.out.println("Enter Employee Details to create new account");
					
					System.out.println("Enter Employee name");
					empName=sk.next();
					
					System.out.println("Enter the employee Phone number");
					empPhone=sk.next();
					
					System.out.print("Enter email ");
					empEmail=sk.next();
					sk.nextLine();
					System.out.println("Enter the employee address");
					empAdd=sk.next();
					sk.nextLine();
					System.out.println("Select the employee branch");
					    System.out.println("┌────────────────────────────────┐");
				        System.out.println("│       Select Branch            │");
				        System.out.println("├────────────────────────────────┤");
				        System.out.println("│ Type 1: East                   │");
				        System.out.println("│ Type 2: West                   │");
				        System.out.println("│ Type 3: North                  │");
				        System.out.println("│ Type 4: South                  │");
				        System.out.println("└────────────────────────────────┘");
				    	int op1=sk.nextInt();
				    	  
				            switch(op1) {
				            
				            case 1:  	empBranch= "East";
				            	break;
				            case 2:     empBranch="West";
				            	break;	
				            case 3:      empBranch="North";
				            	break;	
				            case 4:      empBranch="South";
				            	break;	
				            default: 	empBranch="Not mentioned";
				            
				            }
					
				
					sk.nextLine();
					System.out.println("Enter the employee salary");
					empSalary=sk.nextDouble();
					System.out.println("Enter the employee Taken leave");
					LeaveBal=sk.nextInt();
					
					String letter=empEmail.substring(0, 3);
					
					Integer i=empEmail.length();
					
					empId="E"+letter+i+"00";
					
					
					String pwd= empPhone.substring(0,3);
					empPass=empName+"@"+pwd;
					
					E1= new BankEmployee(empId,empName, empEmail, empPhone, empAdd, empBranch, empSalary,empPass,LeaveBal);
					
					flag= Eimpl.registerEmployee(E1);
				
					if(flag)
						System.out.println("Employee details registered to database..");
					else
						System.out.println("Error while adding Customer details..");
					
				break;			
								
				case 2:  
					
					System.out.println("Enter Employee Details to Login");
					
					System.out.print("Enter Employee Name\n");
					String eName=sk.next();
					sk.nextLine();
					System.out.print("Enter Employee Password\n");
					String epwd=sk.next();
					
					
					
					
					String Emp =Eimpl.login(eName,epwd);
					
					
					System.out.println("Employee ID : "+Emp);
					
					if (Emp==null) {
						
						System.out.println("Wrong Username or Password");
						
					}else {
						System.out.println(" ************************");
						System.out.println("      Login Success");
						System.out.println(" ************************\n\n");
						//we are giving access to withdraw or deposit
						
						System.out.println("Welcome! "+ "------"+eName.toUpperCase()+"-------");
				
                      while(true) {
						
					    System.out.println("┌────────────────────────────────┐");
				        System.out.println("│      Select Operations         │");
				        System.out.println("├────────────────────────────────┤");		
				        System.out.println("│ Type 1: check your leave bal   │");
				        System.out.println("│ Type 2: check customer details │");
				        System.out.println("│ Type 3: update custoemr details│");
				        System.out.println("│ Type 4: change branch          │");
				        System.out.println("│ Type 5: password change        │"); 
				        System.out.println("│ Type 6: Log Out                │");
				        System.out.println("└────────────────────────────────┘");
				        
						
				        	int op2=sk.nextInt();
						
				        	
				        	switch(op2) {
				        	case 1:
				        		
				        		int LB = Eimpl.leavebalance(Emp);
				        		System.out.println("your Leave balance is : "+LB);
				               
				        		
				        		break;
				        	case 2: 
				        	try {
				        		System.out.print("Enter the id of Customer you want to check : ");
				        		int checkId =sk.nextInt();
				        		
				        		 c =cimpl.getCustomerById(checkId);
				        		 if(c!=null) {
				        				System.out.println(" *******************************************");
				        				System.out.println(c);
				        				System.out.println(" ********************************************");
				        		 }else {
				        			System.out.println("Please enter the valid Customer ID :");
				        		 }
				        	}catch(Exception e) {
				        		System.out.println("There might be an error while giving inputs");
				        	}
				        		
				        		break;
				        	case 3:
				        	System.out.print("Enter the id of Customer you want to update: ");
								int ci=sk.nextInt();
								
								 c =cimpl.getCustomerById(ci);
				     
									if(c!=null) {
										
										System.out.println(c);
										System.out.println("\n\n********Welcome to update page of the Customer Details******\n\n"
											);
								       
								          
										    System.out.println("┌───────────────────────────────────┐");
									        System.out.println("│   What do you want to update?     │");
									        System.out.println("├───────────────────────────────────┤");		
									        System.out.println("│ Enter 1---> update name           │");
									        System.out.println("│ Enter 2---> update Password       │");
									        System.out.println("│ Enter 3---> update Phone          │");
									        System.out.println("│ Enter 4---> update account balance│");
									        System.out.println("└───────────────────────────────────┘");
																
											
											int choice2=sk.nextInt();
											sk.nextLine();
											
											switch(choice2) {											
											
										    	case 1:
										    		
									    	    System.out.print("Enter new name:");
												String newName=sk.nextLine();
												
												c.setcName(newName);
												
												boolean flag2=cimpl.updateCustomer(c);
												
												if(flag2) {
													
													System.out.println("\n\n*************************************");
													System.out.println("Customer name updated successfully!!");
													System.out.println("*************************************");
													
												}
												else
													System.out.println("Error while updating customer name!!");							
												
												break;
									
												case 2: 
												    System.out.print("Enter The Custom password for employee:");
													String newPassword=sk.nextLine();
													
													c.setcPassword(newPassword);
													
													flag2=cimpl.updateCustomer(c);
													
													if(flag2) {
														
														System.out.println("\n\n*************************************");
														System.out.println("Customer Password updated successfully!!");
														System.out.println("*************************************");
														
													}
													else
														System.out.println("Error while updating customer Password !!");
											
												
												
												    break;
												
											        case 3: 
											        	   System.out.print("Enter new Phone number :");
															String newPhone=sk.nextLine();
															
															c.setcPhone(newPhone);
															
															flag2=cimpl.updateCustomer(c);
															
															if(flag2) {
																
																System.out.println("\n\n*************************************");
																System.out.println("Customer Phone updated successfully!!");
																System.out.println("*************************************");
																
															}
															else
																System.out.println("Error while updating customer Phone !!");							
															
											    	break;
												
										        	case 4:
										        		  System.out.print("Enter the account balance of employee :");
															int Accountbal=sk.nextInt();
															
															c.setcAccbal(Accountbal);
															
															flag2=cimpl.updateCustomer(c);
															
															if(flag2) {
																
																System.out.println("\n\n***********************************************");
																System.out.println("Customer account Balance updated successfully!!");
																System.out.println("***********************************************");
																
															}
															else
																System.out.println("Error while updating customer Account Balance !!");
													
										        		
											     	 break;
											
											
												
												
												
												
												
											
											}
										
										
										
								}
									break;
				        		
				        	case 4:
				        		
				        		break;
				        	case 5:
				        		System.out.println("Enter your Password");
								String pwd1=sk.next();
								System.out.println("Enter new password");
								String newpin=sk.next();
								String count=Eimpl.passwordChange(Emp, pwd1,newpin);

								if(count==null)
								{
									System.out.println("Password not matched");
								}
								else {
									System.out.println(" ************************");
									System.out.println("     password updated     ");
									System.out.println(" ************************");
									}
				        		
				        		
				        		break;
				        	case 6:
				        		while(true) {
				        		System.out.println("Are you sure you want to Log out");
								System.out.println("Press 1: to confirm");
								System.out.println("Press 2: to go in previous menu ");
								int log =sk.nextInt();
								
								if(log==1) {
												
									System.out.println("*****You have logged out successfully*****\n \n");
									BankEmployeeUI.main(args);
								}
								else{
									System.out.println(" Please comfirm...");
								}
				        		break;				        					        	
				        	
				        		}
				        		}
				        	
					
								}
						
						}
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					}
					
					
				
				
				}
				
				
				
			}

