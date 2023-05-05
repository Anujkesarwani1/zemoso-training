package studentmanagement.SRP.SRPBad;

public class StudentSRPBad {
    private String name;
    private int age;
    private int rollNo;

    public StudentSRPBad(String name, int age, int rollNo) {
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

    public void save() {
        System.out.println("Save Student data to database");
    }

    public void update() {
        System.out.println("update student data in database");
    }

    public void delete() {
        System.out.println("delete student data from database");
    }

    public void display() {
        System.out.println("display student data on console");
    }
}
