package studentmanagement.LSP.LSPImproved;

// SOLID Principles
// Example: Student Management System
// L - Liskov Substitution Principle
// Improved Implementation

public class LSPImproved {
    public static void main(String[] args) {
        RegularStudent1 regularStudent1 = new RegularStudent1();
        OnlineStudent1 onlineStudent1 = new OnlineStudent1();
        regularStudent1.study();
        regularStudent1.submitAssignment();
        onlineStudent1.study();
        onlineStudent1.submitAssignment();
    }
}
