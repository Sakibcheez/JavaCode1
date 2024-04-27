
package lab6;



public class StudentClassTest {
    
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student("Alice", 101);

        // Get student ID
        int id = student1.getId();
        System.out.println("Student ID: " + id);

        // Get student email
        String email = student1.getEmail();
        System.out.println("Student Email: " + email);

        // Create another Student object
        Student student2 = new Student("Bob", 102);
        
        int id1 = student2.getId();
        System.out.println("Student ID: " + id1);

        // Get student email
        String email1 = student2.getEmail();
        System.out.println("Student Email: " + email1);

        // Display total number of students
        System.out.println("Total Students: " + Student.getTotalStudents());
    }
    }


