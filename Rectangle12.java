
package lab6;


public class Rectangle12 extends Shape {
    
     private double width;
    private double height;
    
    public Rectangle12(){}

    public Rectangle12(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public Rectangle12(double width, double height, String color, boolean filled)
    {
     super(color,filled);
     this.width = width;
     this.height = height;
    }
    
        public double getPerimeter()
      {
         return 2*(this.height + this.width);
       }
        
      public double getDiameter()
              
      {
          return 2*(this.height + this.width);
      }
    public double getArea()
    {
    return this.height*this.width;
    }
       
    /**
     *
     * @return
     */
    @Override
    public String toString()
    {
     return "Height is: " +this.height + " Width is:" +this.width + " Permimeter is "+this.getPerimeter() + " Area is:" +this.getArea();
    }
}
