
package lab6;


public class Circle12 extends Shape {
    
    private double radius;
    
    public Circle12() {}
    
    public Circle12(double radius)
    {
    this.radius = radius;
    }
    
    public Circle12(double radius, String color, boolean filled)
    {
    super(color,filled);
    this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getPermimeter()
    {
     return 2*Math.PI*radius;
    }
    public double getArea()
    {
    return Math.PI * radius * radius; 
    }
    
    @Override
    public String toString()
    {
     return "Radius :"+radius + " Area :"+this.getArea() + " Perimeter :"+this.getPermimeter() + super.toString();
    }
    
    
    
    
}
