package studentmanagement.LSP.LSPBad;

// SOLID Principles
// Example: Student Management System
// L - Liskov Substitution Principle
// Bad Implementation

public class LSPBad {
    public static void main(String[] args) {
        RegularStudent regularStudent = new RegularStudent();
        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.takeExam();
    }
}
