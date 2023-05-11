package studentmanagement.OCP.OCPImproved;

public class ConsoleStudentFormatter implements StudentFormatter {
    @Override
    public String format(StudentOCPImproved student) {
        return "Name: " + student.getName() + "\nAge: " + student.getAge() + "\nRoll No: " + student.getRollNo();
    }
}
