
package com.mycompany.box;


public class TestCircle {
    
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0,"blue");
        System.out.println("The radius is: " +c1.getRadius() );
        System.out.println("The color is: "+ c1.getColor());
        System.out.println("The area is: " +c1.getArea());
       // System.out.println("The area is: %.2f", c1.getArea());
       
       Circle c2 = new Circle(3.0);
       System.out.println("The radius is: " +c2.getRadius() );
        System.out.println("The color is: "+ c2.getColor());
        System.out.println("The area is: " +c2.getArea());
        
        Circle c3 = new Circle();
        System.out.println("The radius is: " +c3.getRadius() );
        System.out.println("The color is: "+ c3.getColor());
        System.out.println("The area is: " +c3.getArea());
        
        
    }
    
}
