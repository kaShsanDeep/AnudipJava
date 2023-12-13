package practiceCode;
//import java.util.Scanner;
//Take the full name of user. Like Sujina Pradeep. Print only their initials like S. P.

import java.util.Scanner;

public class InistialString // Java program to print initials of a name {
{
	static void printInitials(String name)
	{
				
		System.out.print(name.charAt(0));

		for (int i = 1; i < name.length() - 1; i++)
			if (name.charAt(i) == ' ')
			
				System.out.print(" " + name.charAt(i + 1));
	}

	
	
	
	public static void main(String args[])
	{
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the name: ");
		String name = obj.nextLine();
		printInitials(name);
		obj.close();
	}

}


