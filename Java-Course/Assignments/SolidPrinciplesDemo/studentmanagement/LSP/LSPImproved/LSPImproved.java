package studentmanagement.LSP.LSPImproved;

// SOLID Principles
// Example: Student Management System
// L - Liskov Substitution Principle
// Improved Implementation

public class LSPImproved {
    public static void main(String[] args) {
        OfflineStudent regularStudent1 = new RegularStudent1();
        StudentLSPImproved onlineStudent1 = new OnlineStudent1();
        regularStudent1.study();
        regularStudent1.submitAssignment();
        onlineStudent1.study();
        onlineStudent1.submitAssignment();
    }
}
