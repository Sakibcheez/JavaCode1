
package lab6;

import java.util.Scanner;

public class Palidrome2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        if (isPalindrome(userInput)) {
            System.out.println(userInput + " is a palindrome.");
        } else {
            System.out.println(userInput + " is not a palindrome.");
        }
        scanner.close();
    }

    public static boolean isPalindrome(String input) {
        // Remove all non-alphanumeric characters and convert to lowercase
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // Reverse the string
        String reversed = new StringBuilder(cleanInput).reverse().toString();
        // Check if the original string is equal to its reverse
        return cleanInput.equals(reversed);
    }
    
}
