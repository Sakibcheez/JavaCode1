
package com.mycompany.box;


public class CicrcleIn {
    
    private double radius ;
    String color ;
    public static int count = 0;

    public CicrcleIn() {
        this.radius = 1.0;
        this.color = "red";
 
    }
    
    /**
     *
     * @param radius
     * @param color
     */
    public CicrcleIn(double radius , String color)
    {
        this.radius = radius;
        this.color = color;
            }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double getArea()
    {
     return radius* radius* Math.PI;
    }
    
    @Override
    public String toString()
            
    {
     return "the are is +circleIn.getArea " ;
    }
    
    public boolean isEqual(CicrcleIn  obj)
    {
     if(this.radius == obj.radius)
         return true;
     else 
         return false;
     
     
    }
}
