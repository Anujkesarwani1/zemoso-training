package studentmanagement.DIP.DIPImproved;

public class DIPImproved {
    public static void main(String[] args) {
        StudentDIPImproved regularStudent = new RegularStudent();
        StudentDIPImproved onlineStudent = new OnlineStudent();
        StudentManagementSystem obj = new StudentManagementSystem(regularStudent, onlineStudent);
        obj.studyOnlineStudent();
        obj.submitOnlineStudentAssignment();
    }
}
