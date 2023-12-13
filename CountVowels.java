

import java.util.Scanner;



public class CountVowels {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Close the scanner as we have obtained the input
        scanner.close();

        // Convert the string to lowercase to make the counting case-insensitive
        userInput = userInput.toLowerCase();

        // Call the method to count vowels and display the result
        int vowelCount = countVowels(userInput);
        System.out.println("Number of vowels: " + vowelCount);
    }

    // Method to count vowels in a given string
    private static int countVowels(String input) {
        int count = 0;

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}
