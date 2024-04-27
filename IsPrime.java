
package lab6;


public class IsPrime {
    
     public static void main(String[] args) {
        generatePrime(1, 100);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        // Check for divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void generatePrime(int start, int end) {
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
}
