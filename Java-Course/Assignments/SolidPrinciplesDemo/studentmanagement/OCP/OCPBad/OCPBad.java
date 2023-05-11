package studentmanagement.OCP.OCPBad;

// SOLID Principles
// Example: Student Management System
// O - Open Closed Principle
// Bad Implementation

public class OCPBad {
    public static void main(String[] args) {
        StudentOCPBad student = new StudentOCPBad("Anuj", 22, 32);
        student.display("console");
    }
}
