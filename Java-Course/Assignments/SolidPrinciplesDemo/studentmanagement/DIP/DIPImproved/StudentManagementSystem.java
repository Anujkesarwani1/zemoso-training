package studentmanagement.DIP.DIPImproved;

public class StudentManagementSystem {
    private StudentDIPImproved regularStudent;
    private StudentDIPImproved onlineStudent;

    public StudentManagementSystem(StudentDIPImproved regularStudent, StudentDIPImproved onlineStudent) {
        this.regularStudent = regularStudent;
        this.onlineStudent = onlineStudent;
    }

    public void studyRegularStudent() {
        regularStudent.study();
    }

    public void submitRegularStudentAssignment() {
        regularStudent.submitAssignment();
    }

    public void takeRegularStudentExam() {
        regularStudent.takeExam();
    }

    public void studyOnlineStudent() {
        onlineStudent.study();
    }

    public void submitOnlineStudentAssignment() {
        onlineStudent.submitAssignment();
    }

    public void takeOnlineStudentExam() {
        onlineStudent.takeExam();
    }
}
