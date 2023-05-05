package studentmanagement.OCP.OCPImproved;

public class XmlStudentFormatter implements StudentFormatter {
    @Override
    public String format(StudentOCPImproved student) {
        return "<student><name>" + student.getName() + "</name><age>" + student.getAge() + "</age><rollNo>" + student.getRollNo() + "</rollNo></student>";
    }
}
