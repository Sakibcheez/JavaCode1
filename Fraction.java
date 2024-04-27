
package lab6;


public class Fraction {
    
 private int numerator;
    private int denominator;

    // Constructor
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0)
            this.denominator = denominator;
        else
            throw new IllegalArgumentException("Denominator cannot be zero.");
    }

    // Getters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Setters
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0)
            this.denominator = denominator;
        else
            throw new IllegalArgumentException("Denominator cannot be zero.");
    }

    // Addition
    public void add(Fraction fraction) {
        int newNumerator = this.numerator * fraction.getDenominator() +
                           fraction.getNumerator() * this.denominator;
        int newDenominator = this.denominator * fraction.getDenominator();
        simplifyAndSet(newNumerator, newDenominator);
    }

    // Subtraction
    public void sub(Fraction fraction) {
        int newNumerator = this.numerator * fraction.getDenominator() -
                           fraction.getNumerator() * this.denominator;
        int newDenominator = this.denominator * fraction.getDenominator();
        simplifyAndSet(newNumerator, newDenominator);
    }

    // Multiplication
    public void multiplication(Fraction fraction) {
        int newNumerator = this.numerator * fraction.getNumerator();
        int newDenominator = this.denominator * fraction.getDenominator();
        simplifyAndSet(newNumerator, newDenominator);
    }

    // Division
    public void division(Fraction fraction) {
        if (fraction.getNumerator() != 0) {
            int newNumerator = this.numerator * fraction.getDenominator();
            int newDenominator = this.denominator * fraction.getNumerator();
            simplifyAndSet(newNumerator, newDenominator);
        } else {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
    }

    // Simplify the fraction and set the numerator and denominator
    private void simplifyAndSet(int newNumerator, int newDenominator) {
        int gcd = gcd(Math.abs(newNumerator), Math.abs(newDenominator));
        this.numerator = newNumerator / gcd;
        this.denominator = newDenominator / gcd;
    }

    // Calculate the greatest common divisor (GCD) using Euclid's algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // To String
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
