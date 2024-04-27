
package com.mycompany.mavenproject1;


public class RaggedArray {
    
  
    public static void main(String[] args) {
        // Creating a ragged array
        int[][] raggedArray = new int[3][];
        
        // Initializing sub-arrays with different lengths
        raggedArray[0] = new int[]{1, };
        raggedArray[1] = new int[]{1, 2,};
        raggedArray[2] = new int[]{1,2,3};
        
        // Accessing and printing elements
        for (int i = 0; i < raggedArray.length; i++) {
            for (int j = 0; j < raggedArray[i].length; j++) {
                System.out.print(raggedArray[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
    
