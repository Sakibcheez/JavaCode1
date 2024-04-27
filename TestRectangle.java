
package com.mycompany.box;


public class TestRectangle {
    
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("lenth is :"+r1.getLength());
        System.out.println("Width is : "+r1.getWidth());
        System.out.println("Area is : "+r1.getArea());
        
        Rectangle r2 = new Rectangle(3, 5);
        System.out.println("lenth is :"+r2.getLength());
        System.out.println("Width is : "+r2.getWidth());
        System.out.println("Area is : "+r2.getArea());
        
    }
    
}
