package studentmanagement.DIP.DIPImproved;

public class OnlineStudent implements StudentDIPImproved {
    @Override
    public void study() {
        System.out.println("Study method from OnlineStudent");
    }

    @Override
    public void takeExam() {
        System.out.println("TakeExam method from OnlineStudent");
    }

    @Override
    public void submitAssignment() {
        System.out.println("SubmitAssignment method from OnlineStudent");
    }
}
