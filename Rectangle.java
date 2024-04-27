
package com.mycompany.box;

public class Rectangle {
    
    private int width;
    private int length ;
    
    public Rectangle()
    {
     width = 0;
     length = 0;
    }

    public Rectangle(int w, int l) {
        this.width = w;
        this.length = l;
    }
    
    public Rectangle(int w)
            
    {
     this.width = w;
    }
  

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public double getArea()
    {
     return width*length;  
    }
         
    
}
