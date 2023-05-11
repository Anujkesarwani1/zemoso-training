package studentmanagement.ISP.ISPImproved;

// SOLID Principles
// Example: Student Management System
// I - Interface Segregation Principle
// Improved Implementation

public class ISPImproved {
    public static void main(String[] args) {
        RegularStudent1 regularStudent1 = new RegularStudent1();
        OnlineStudent1 onlineStudent1 = new OnlineStudent1();
        regularStudent1.takeInPersonExam();
        onlineStudent1.takeOnlineExam();
    }
}
