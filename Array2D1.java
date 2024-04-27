
package com.mycompany.mavenproject1;

import java.util.Scanner;


public class Array2D1 {
    
    
    public static void main(String[] args) {
        // Create a 2D array to store 10 values (assuming a 2x5 array)
        int[][] array2D = new int[2][5];

        try ( // Create a Scanner object to read input from the user
                Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter 10 values for a 2D array (2x5):");
            // Use nested loops to get input for each element in the 2D array
            for (int row = 0; row < 2; row++) {
                for (int col = 0; col < 5; col++) {
                    System.out.print("Enter value for element at row " + row + " and column " + col + ": ");
                    
                    // Read the input and store it in the 2D array
                    array2D[row][col] = scanner.nextInt();
                }
            }
            // Close the Scanner to avoid resource leak
        }

        // Display the entered values row-wise
        System.out.println("Entered values row-wise:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(array2D[row][col] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }

        // Display the entered values column-wise
        System.out.println("Entered values column-wise:");
        for (int col = 0; col < 5; col++) {
            for (int row = 0; row < 2; row++) {
                System.out.print(array2D[row][col] + " ");
            }
            System.out.println(); // Move to the next line after printing each column
        }
    }
}    

    
