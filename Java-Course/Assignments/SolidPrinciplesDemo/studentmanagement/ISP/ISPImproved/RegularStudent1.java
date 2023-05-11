package studentmanagement.ISP.ISPImproved;

public class RegularStudent1 implements Studyable, Assignable, OfflineTestable {
    @Override
    public void study() {
        System.out.println("Study method from RegularStudent");
    }

    @Override
    public void submitAssignment() {
        System.out.println("SubmitAssignment method from RegularStudent");
    }

    @Override
    public void takeInPersonExam() {
        System.out.println("TakeInPersonExam method from RegularStudent");
    }
}
