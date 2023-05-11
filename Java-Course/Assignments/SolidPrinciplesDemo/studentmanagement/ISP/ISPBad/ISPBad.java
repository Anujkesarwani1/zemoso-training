package studentmanagement.ISP.ISPBad;

// SOLID Principles
// Example: Student Management System
// I - Interface Segregation Principle
// Bad Implementation

public class ISPBad {
    public static void main(String[] args) {
        RegularStudent regularStudent = new RegularStudent();
        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.takeExam();
    }
}
