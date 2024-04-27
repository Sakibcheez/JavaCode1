
package com.mycompany.mavenproject1;

import java.util.Scanner;


public class EnterArrayAndDisplay {
    
    public static void main(String[] args) {
        // Create an array to store 10 values
        int[] array = new int[10];

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 values:");

        // Use a loop to get input for each element in the array
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter value for element " + i + ": ");
            
            // Read the input and store it in the array
            array[i] = scanner.nextInt();
        }

        // Close the Scanner to avoid resource leak
        scanner.close();

        // Display the entered values
        System.out.println("Entered values in the array:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Element " + i + ": " + array[i]);
        }
    }
}
    

