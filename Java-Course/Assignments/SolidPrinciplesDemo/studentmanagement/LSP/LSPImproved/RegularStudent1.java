package studentmanagement.LSP.LSPImproved;

public class RegularStudent1 implements OfflineStudent {
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
        System.out.println("SubmitAssignment method from RegularStudent");
    }
}
