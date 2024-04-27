
package com.mycompany.mavenproject1;

import java.util.Scanner;


public class installment {

    public static void main(String[] args) {
        int month1,down,remain1;
        double Monthly, vat;
        System.out.println("The price of this product is 50000 bdt\n");
        System.out.print("Enter Downpayment: ");
        Scanner scan = new Scanner (System.in);
        down = scan.nextInt();
        System.out.print("Enter Total installment month(3/6/9/12): ");
        month1 = scan.nextInt();
        remain1 =  50000 - down;
        vat =(double)(remain1 *5 /100);
        double total = remain1 + vat;
        System.out.println("total = "+total);
        Monthly = total / month1;
        System.out.print("Your Monthly Payment is "+Monthly);
        
        
    }
    
}
