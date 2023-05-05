package studentmanagement.DIP.DIPBad;

import studentmanagement.ISP.ISPImproved.OnlineStudent1;
import studentmanagement.ISP.ISPImproved.RegularStudent1;

public class StudentManagementSystem {
    private RegularStudent1 regularStudent;
    private OnlineStudent1 onlineStudent;

    public StudentManagementSystem() {
        this.regularStudent = new RegularStudent1();
        this.onlineStudent = new OnlineStudent1();
    }

    public void studyRegularStudent() {
        regularStudent.study();
    }

    public void submitRegularStudentAssignment() {
        regularStudent.submitAssignment();
    }

    public void takeRegularStudentExam() {
        regularStudent.takeInPersonExam();
    }

    public void studyOnlineStudent() {
        onlineStudent.study();
    }

    public void submitOnlineStudentAssignment() {
        onlineStudent.submitAssignment();
    }

    public void takeOnlineStudentExam() {
        onlineStudent.takeOnlineExam();
    }
}
