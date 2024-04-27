
package lab6;

import java.util.Scanner;


public class Palidrome {
    
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
        int left = 0;
        int right = cleanInput.length() - 1;
        while (left < right) {
            // Compare characters from both ends
            if (cleanInput.charAt(left) != cleanInput.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    
}
