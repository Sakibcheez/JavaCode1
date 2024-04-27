
package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Array12 {
    
    public static void main(String[] args) {
        int[] array = new int[10];
        
        System.out.println("Enter 10 Values  ");
        Scanner scan = new Scanner(System.in);
       for(int i = 0; i < array.length; i++)
       {
           array[i] = scan.nextInt();
       }
       int sum = 0;
       for(int i = 0; i < array.length; i++)
       {
          sum = sum +array[i]; 
       }
       for(int i = 0 ; i < array.length ; i++)
       {
           System.out.println("Values is " + array[i] );
       }
       
     
           System.out.println("toal is: " + sum);
       
       
       
    }
    
}
