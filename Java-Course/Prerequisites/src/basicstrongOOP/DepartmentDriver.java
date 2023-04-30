package basicstrongOOP;

public class DepartmentDriver {
    public static void main(String args[]){
        DeptOne one = new DeptOne();
        int emp = (one.getEmployee());
        System.out.println("Department One has "+emp+" employees");
        one.attendance();
        one.method();
    }
}
