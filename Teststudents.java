
package com.mycompany.box;

import java.util.Scanner;

public class Teststudents {
    
    public static void main(String[] args) {
        
        
        
        Scanner scan = new Scanner(System.in);
        
      
      
        System.out.println("Enter Your Name: ");
        
        String name = scan.nextLine();
        
        System.out.println("Enter Your id Number : ");
        
       int id = scan.nextInt();
        
    Student231 s1 = new Student231(name,id);
       
       s1.Displayinfo();
      
       
      // Scanner.close(); 
        
        Student231 s2 = new Student231("Arabi", 23154);
       
        s2.Displayinfo();
        
        System.out.println("total Student Count :" +Student231.getTotalStudents());
       
    
    }
}
