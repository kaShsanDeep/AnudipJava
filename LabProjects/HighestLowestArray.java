package LabProjects;

import java.util.Scanner;


//Make an array of size 5. Take input from user to add members in the array. 
//Find the highest and the lowest member
//of this array at the end.
public class HighestLowestArray {

	public static void main(String[] args) {

		
		Scanner sk = new Scanner(System.in);
			System.out.println("Enter the values of array list ");
		int [] num = new int [5];
		int n = 0;
		while (n < num.length) {
		    num[n] = sk.nextInt();
		    n++;
		}
		

			 int len = num.length-1;
			
			//creating the for loop to count the index value of the array
			for(int i=0;i<num.length;i++) {
				
				//creating the for loop to compare the index values with the i 
				for(int j=i+1;j<num.length;j++) {							
					
					
					
					int tmp = 0;  //to hold the campared value
					if (num[i] > num[j])   //comparing using the if condition
					{  
					tmp = num[i];   //if num[1]>num[2] then the number will store in the temp
					
					num[i] = num[j];  // and the second number will become the first no
					num[j] = tmp;   // and num[1] value wich was stored in temp will be added into num[]
					}  										
		
				
				}
			
				
			}
			
			System.out.println(" This is the lowest number of the array: "+num[0]);
			System.out.println(" This is the Highest number of the array: "+num[len]);

		}

	}

