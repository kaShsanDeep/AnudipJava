package practiceCode;
import java.util.Scanner;


//Check if any number given by user is present in the array
//int [] numbers={7, 12, 36, 22, 6, 91}
public class ArraySearch {

	public static void main(String[] args) {
		
		int []num = {7, 12, 36, 22, 6, 91}; 

		Scanner sk = new Scanner(System.in);
		System.out.println("Enter the number to search the index value of it ");
		 int find = sk.nextInt();
		
		for(int i=0; i<num.length;i++) {
			
				if(find==num[i]) {
				System.out.println("Yes the number is in the array at the index "+i);
				
				break;
					}
				else { 
				System.out.println("No, The number is not in the array list");
				break;
					}
			}
	
		
			
		}
		
	}


