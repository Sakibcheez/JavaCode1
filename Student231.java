
package com.mycompany.box;


public class Student231 {
    
    private String name;
    private int id;
    private static int totalStudents = 0;

    public Student231(String name, int id) {
        this.name = name;
        this.id = id;
        totalStudents++;
    }

    public String getEmail() {
        // return name;
        return  name.toLowerCase() +id+"@school.com"; 
    }
    
    public String getName(){
     return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public static void setTotalStudents(int totalStudents) {
        Student231.totalStudents = totalStudents;
    }
    
    /**
     *
     */
void Displayinfo()
    {
     System.out.println("Student Name :" +getName());
        System.out.println("Student Email:" +getEmail());
        System.out.println("Student ID :" +getId());
        
    }
    
    
    
    
    
}
