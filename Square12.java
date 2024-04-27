
package lab6;


public class Square12 extends Rectangle12 {
    
    public Square12() {}
    
    public Square12(double side)
    {
    super(side,side);
    }
    
    public Square12(double side, String color, boolean filled)
    {
    super(side,side,"color",filled);
    }
    
    @Override
    public double getPerimeter()
    {
     return super.getPerimeter();
    }
    
    @Override
    public double getArea()
    {
     return super.getArea();
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString()
    {
    return "Perimeter is: " +this.getPerimeter() + " Area is:" +this.getArea(); 
    }
    
       
    
}
