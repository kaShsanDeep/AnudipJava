package com.bank.ui;

import java.util.Scanner;

import com.bank.model.BankEmployee;
import com.bank.model.BankManager;
import com.bank.service.BankAdmin;
import com.bank.service.BankEmployeeServiceIMplement;


public class BankAdminUI {

	public static void main(String[] args) throws Exception {
	 String AdminId;
	 String AdminName;
	 String AdminPass;
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
		
		Scanner sk= new Scanner(System.in);
		BankEmployee E=null;
		BankManager Admn = null;
		BankEmployeeServiceIMplement AEimpl = new BankEmployeeServiceIMplement();
		BankAdmin Aimpl = new BankAdmin();
		String Branch=null;
	
	
   
		System.out.println(" -------------------------------------------------------");
		System.out.println("|            Welcome To Anudip Bank Admin page          |");
		System.out.println(" -------------------------------------------------------\n\n");
				        			
		        		
	 	System.out.println("┌───────────────────────────────┐");
        System.out.println("│  Welcome to Anudip Admin page │");
        System.out.println("├───────────────────────────────┤");
        System.out.println("│     Type 1: Log In as Admin   │");
        System.out.println("└───────────────────────────────┘");
		
		
		
		
		
		
		
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
								
								
								
								
								
								
								
								System.out.println("Enter the operation you want to perform: ");
								
								System.out.println("┌───────────────────────────────┐");
						        System.out.println("│  Welcome to Anudip Admin page │");
						        System.out.println("├───────────────────────────────┤");
						        System.out.println("│    Type 1: Add employee       │");
						        System.out.println("│    Type 2: update employee    │");
						        System.out.println("└───────────────────────────────┘");
							
								
								int op =sk.nextInt();
								
								switch(op) {
								
								case 1: 
								
									System.out.println("Enter Employee Details Add new account");
									
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
									
									E= new BankEmployee(empId,empName, empEmail, empPhone, empAdd, empBranch, empSalary,empPass,LeaveBal);
									
									flag= Eimpl.registerEmployee(E);
								
									if(flag)
										System.out.println("Employee details added to database..");
									else
										System.out.println("Error while adding Customer details..");			
								
								break;		
								
								case 2:
															
     							System.out.print("Enter the id of employee you want to update: ");
     							empId=sk.nextLine();
								sk.nextLine();
							
							
								E=AEimpl.getEmployeeById(empId);
								
								if(E!=null) {
									
									System.out.println(E);
									System.out.println("Are you sure you want to update this employee details?"
											+ "\nAnswer in yes or no");
						
									String ans=sk.next();
									sk.nextLine();
									
									if(ans.equalsIgnoreCase("yes")) {
										
										System.out.println("What do you want to update?");
										System.out.println("Enter a---> update name");
										System.out.println("Enter b---> update branch ");
										System.out.println("Enter c---> update salary");
									
										
										char choice2=sk.next().toLowerCase().charAt(0);
										sk.nextLine();
										
										switch(choice2) {
										case 'a':
											System.out.print("Enter name: ");
											empName=sk.nextLine();
											E.setEmpName(empName);
											
											flag=Eimpl.updateEmployee(E);
											if(flag)
												System.out.println("Employee name updated successfully!!");
											else
												System.out.println("Error while updating employee name!!");
											break;
											
									
											
										case 'b':
											System.out.print("Enter branch : \n1: North\n2: East"
													+ "\n3: West\n4: South ");
											int choice=sk.nextInt();
											sk.nextLine();
											
											switch(choice) {
											case 1: empBranch="North";
											break;
											
											case 2: empBranch="East";
											break;
											
											case 3: empBranch="West";
											break;
											
											case 4: empBranch="South";
											break;
										
											
											default: System.out.println("Please enter only those numbers as given in "
													+ "category menu");
											empBranch="data unavailable";
											}
											E.setEmpBranch(empBranch);
										    flag=Eimpl.updateEmployee(E);
											
											if(flag)
												System.out.println("employee branch updated successfully!!");
											else
												System.out.println("Error while updating employee branch!!");
											break;
											
										case 'c':
											System.out.print("Enter salary: ");
											empSalary=sk.nextDouble();
											sk.nextLine();
											
											E.setEmpSalary(empSalary);
											flag=Eimpl.updateEmployee(E);
											
											if(flag)
												System.out.println("employee salary updated successfully!!");
											else
												System.out.println("Error while updating salary !");
											break;
										
											
											default:System.out.println("Please enter characters as mentioned in update menu");
											
										}
									}
									else if(ans.equalsIgnoreCase("no")) {}
									else
										System.out.println("Please answer in yes or no only. Going back to main menu");
								}
								else
									System.out.println("No employee with this id found. Please check id given....");
								
								
								
								break;
								
								
								
								
								
								
							}
		  
		
		
		
		
	
							}
		
		
		
		sk.close();
		
		         }
	

}
