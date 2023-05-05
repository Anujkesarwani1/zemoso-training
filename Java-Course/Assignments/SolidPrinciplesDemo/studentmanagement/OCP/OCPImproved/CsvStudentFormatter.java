package studentmanagement.OCP.OCPImproved;

public class CsvStudentFormatter implements StudentFormatter {
    @Override
    public String format(StudentOCPImproved student) {
        return student.getName() + "," + student.getAge() + "," + student.getRollNo();
    }
}
