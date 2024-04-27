
package lab6;


public class TestGeometricObject {
    
    public static void main(String[] args) {
        
        Circle C1 = new Circle(5.0);
        
        C1.printCircle();
        
        System.out.println(" ");
        
        Rectangle1 R1 = new Rectangle1(5.0,10.0);
        
        R1.printRectangle();
        
        System.out.println(" ");
        
          Circle C2 = new Circle(1, "red", true);
        
        C2.printCircle();
        
        System.out.println(" ");
        
        Rectangle1 R2 = new Rectangle1();
        
        R2.printRectangle();
        
        
        
                
    }
    
}
