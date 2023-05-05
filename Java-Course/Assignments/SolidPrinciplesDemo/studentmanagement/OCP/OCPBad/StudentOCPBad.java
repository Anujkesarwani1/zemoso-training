package studentmanagement.OCP.OCPBad;

public class StudentOCPBad {
    private String name;
    private int age;
    private int rollNo;

    public StudentOCPBad(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void display(String format) {
        if (format.equals("console")) {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Roll No: " + rollNo);
        } else if (format.equals("csv")) {
            System.out.println(name + "," + age + "," + rollNo);
        } else if (format.equals("xml")) {
            System.out.println("<student><name>" + name + "</name><age>" + age + "</age><rollNo>" + rollNo + "</rollNo></student>");
        }
    }
    // The display method has the responsibility of displaying student data in different format, i.e. console, CSV & XML.
    // This violates the OCP as the 'StudentOCPBad' class is not closed for modification.
    // If we want to add support for displaying student data in a new format, we would have to modify the 'StudentOCPBad' class when is not desirable.
}
