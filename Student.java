
package lab6;

class Student {
    
     private final String name;
    private final int id;
    private static int totalStudents = 0;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        totalStudents++;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return name.toLowerCase() + id + "@school.com";
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}
