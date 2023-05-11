package studentmanagement.ISP.ISPBad;

public class OnlineStudent implements StudentISPBad {
    @Override
    public void study() {
        System.out.println("Study method from OnlineStudent");
    }

    @Override
    public void takeExam() {
        throw new UnsupportedOperationException("Online students cannot take offline exams");
    }
    // Online students cannot take in-person exams

    @Override
    public void submitAssignment() {
        System.out.println("SubmitAssignment method from OnlineStudent");
    }
}
