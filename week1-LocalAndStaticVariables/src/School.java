public class School {
    // Static variable: shared across all instances
    static int totalStudents = 0;

    // Static method: can access static variables directly
    public static int getTotalStudents() {
        return totalStudents;
    }

    // Instance variables: unique to each instance(a single occurrence of an obj or a class)
    private String studentName;
    private int studentID;

    // Constructor to initialize instance variables
    public School(String name, int id) {
        this.studentName = name;
        this.studentID = id;
        totalStudents++;
    }

    // Instance method: can access instance variables and static variables
    public void displayStudentInfo() {
        // Local variable: only accessible within this method
        String info = "Student Name: " + studentName + ", Student ID: " + studentID;
        System.out.println(info);
    }

    public static void main(String[] args) {
        // Local variable: only accessible within the main method
        String schoolName = "IUEA";
        System.out.println("Welcome to " + schoolName);

        // Creating instances of the School class
        School student1 = new School("Debby", 101);
        School student2 = new School("Divine", 102);

        student1.displayStudentInfo();
        student2.displayStudentInfo();

        // Accessing static method to get total students
        System.out.println("Total Students: " + School.getTotalStudents());
    }
}
