
package lab6;


public class SumDigit {
    
        public static void main(String[] args) {
        int number = 1234515464;
        System.out.println("Sum of digits of " + number + ": " + sumDigit(number));
    }

    public static int sumDigit(int number) {
        int sum = 0;
        // Take the absolute value to handle negative numbers
        number = Math.abs(number);
        while (number != 0) {
            // Get the last digit of the number by taking remainder when divided by 10
            int digit = number % 10;
            // Add the digit to the sum
            sum += digit;
            // Remove the last digit by dividing the number by 10
            number /= 10;
        }
        return sum;
    }
    
}
