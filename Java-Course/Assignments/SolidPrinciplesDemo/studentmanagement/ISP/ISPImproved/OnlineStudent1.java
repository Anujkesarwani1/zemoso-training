package studentmanagement.ISP.ISPImproved;

public class OnlineStudent1 implements Studyable, Assignable, OnlineTestable {
    @Override
    public void study() {
        System.out.println("Study method from OnlineStudent");
    }

    @Override
    public void submitAssignment() {
        System.out.println("SubmitAssignment method from OnlineStudent");
    }

    @Override
    public void takeOnlineExam() {
        System.out.println("TakeOnlineExam method from OnlineStudent");
    }
}
