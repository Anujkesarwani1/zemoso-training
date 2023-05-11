package studentmanagement.SRP.SRPImproved;

// SOLID Principles
// Example: Student Management System
// S - Single Responsibility Principle
// Improved Implementation

public class SRPImproved {
    public static void main(String[] args) {
        StudentSRPImproved srpImproved = new StudentSRPImproved("Rahul", 20, 42);
        ConsoleStudentViewer console = new ConsoleStudentViewer();
        console.display(srpImproved);
    }
}
