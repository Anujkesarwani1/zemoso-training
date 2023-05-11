package studentmanagement.DIP.DIPImproved;

public class RegularStudent implements StudentDIPImproved {
    @Override
    public void study() {
        System.out.println("Study method from RegularStudent");
    }

    @Override
    public void takeExam() {
        System.out.println("TakeExam method from RegularStudent");
    }

    @Override
    public void submitAssignment() {
        System.out.println("Submit method from RegularStudent");
    }
}
