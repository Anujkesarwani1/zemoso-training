package studentmanagement.ISP.ISPBad;

public class RegularStudent implements StudentISPBad {

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
