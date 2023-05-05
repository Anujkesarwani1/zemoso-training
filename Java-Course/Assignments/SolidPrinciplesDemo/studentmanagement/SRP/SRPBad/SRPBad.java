package studentmanagement.SRP.SRPBad;

// SOLID Principles
// Example: Student Management System
// S - Single Responsibility Principle
// Bad Implementation

public class SRPBad {
    public static void main(String[] args) {
        StudentSRPBad srpBad = new StudentSRPBad("Rahul", 20, 42);
        System.out.println("Name: "+srpBad.getName());
        System.out.println("Age: "+srpBad.getAge());
        System.out.println("Roll No: "+srpBad.getRollNo());
    }
}
