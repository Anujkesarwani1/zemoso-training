package studentmanagement.LSP.LSPImproved;

public class OnlineStudent1 implements StudentLSPImproved {
    @Override
    public void study() {
        System.out.println("Study method from OnlineStudent");
    }

    @Override
    public void submitAssignment() {
        System.out.println("SubmitAssignment method from OnlineStudent");
    }
}
