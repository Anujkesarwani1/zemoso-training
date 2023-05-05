package studentmanagement.SRP.SRPImproved;

public class ConsoleStudentViewer {
    public void display(StudentSRPImproved student) {
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Roll No: " + student.getRollNo());
    }
}
