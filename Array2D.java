
package com.mycompany.mavenproject1;

import java.util.Scanner;


public class Array2D 
    
  {
    public static void main(String[] args) {
        // Create a 2D array to store 10 values (assuming a 2x5 array)
        int[][] array2D = new int[2][5];

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

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
        scanner.close();

        // Display the entered values in the 2D array
        System.out.println("Entered values in the 2D array:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 5; col++) {
               System.out.println("Element at row " + row + " and column " + col + ": " + array2D[row][col]);
              //   System.out.print(  array2D[row][col]); 
            }
           //
        }
    }
}
    

