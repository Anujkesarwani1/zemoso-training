package studentmanagement.OCP.OCPImproved;

// SOLID Principles
// Example: Student Management System
// O - Open Closed Principle
// Improved Implementation

public class OCPImproved {
    public static void main(String[] args) {
        StudentOCPImproved student = new StudentOCPImproved("Aman", 22, 14);
        CsvStudentFormatter csv = new CsvStudentFormatter();
        System.out.println(csv.format(student));
    }
}
