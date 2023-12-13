package LabProjects;

//1) int [] marks={87, 45, 91, 67, 89} 
//rearrange the array in asscending order of the marks.


public class Array {

	public static void main(String[] args) {

		//Array named num
		int num [] = {5,6,3,2};

		
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
			System.out.print(num[i]);
			
		}
		
		

	}

}
