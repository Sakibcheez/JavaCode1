
package com.mycompany.mavenproject1;


public class incrementDecrement {
    public static void main(String[] args) {
        int x =25;
        int y;
        
        y=x++; // 25
        System.out.println("y = "+y);
        
        y=x; // 26
        System.out.println("y = "+y);
        
        int a = 25;
        int b;
        
        b =++a; //26
        System.out.println("b = "+b);
        b = a; //26
        System.out.println("b = "+b);
        
          int m =25;
        int n;
        
        n=m--; // 25
        System.out.println("n = "+n);
        
        n=m; // 24
        System.out.println("n = "+n);
        
        int k = 25;
        int l;
        
        l =--k; //24
        System.out.println("l = "+l);
        l = k; //24
        System.out.println("l = "+l);
    }
}
