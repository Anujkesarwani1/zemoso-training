package basicstrongOOP;

public abstract class Department {
    public abstract int getEmployee();
    public abstract void method();

    public void attendance() {
        System.out.println("I am present");
    }
}

class DeptOne extends Department {

    @Override
    public int getEmployee() {
        return 100;
    }

    @Override
    public void method() {
        System.out.println("This is a implementation of method");
    }
}
