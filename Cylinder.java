package com.mycompany.box;

import java.text.DecimalFormat;


public class Cylinder extends CicrcleIn 
{
    
    private double height;

public Cylinder()
        {
    super(10, "Red");
    height = 1.0 ;
    
}

public Cylinder(double height)
        
{
 super(10,"Red");
 this.height = height; 
}

public Cylinder(double height,double radius)
        
{
   super(10,"Red");
   this.height = height;
   this.setRadius(radius);
 
}
public Cylinder(double height,double radius,String color)
{
    super(10,"Red");
   this.height = height;
   this.setRadius(radius);
   super.setColor(color);
}

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

 

public double getvolume()
{
   
 return super.getArea() * this.height ;

}



   @Override
    public String toString()
{
    
    DecimalFormat df = new DecimalFormat("#.##");
    return "Volume is: " + df.format(this.getvolume());
}

   
}




