
package com.mycompany.mavenproject1;

import java.util.Scanner;


public class PrimeNumberSum {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Get user input for the range
        System.out.print("Enter the starting range: ");
        int startRange = scanner.nextInt();

        System.out.print("Enter the ending range: ");
        int endRange = scanner.nextInt();

        // Calculate and display the sum of prime numbers
        int sum = calculatePrimeSum(startRange, endRange);
        System.out.println("Sum of prime numbers between " + startRange + " and " + endRange + " is: " + sum);

        scanner.close();
    }

    // Function to check if a number is prime
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Function to calculate the sum of prime numbers within a range using nested for loops
    private static int calculatePrimeSum(int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber && i > 1) {
                sum += i;
            }
        }

        return sum;
    }
    }
    

