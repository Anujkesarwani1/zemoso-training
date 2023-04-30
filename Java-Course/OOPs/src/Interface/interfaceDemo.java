package Interface;

//An interface in Java is a blueprint of a class.
//It has static constants and abstract methods.
//The interface in Java is a mechanism to achieve abstraction.
public interface interfaceDemo {
    static final String a = "static constant";
    public void m1();
    public int m2();
}

class Test implements interfaceDemo {
    @Override
    public void m1() {
        System.out.println("This is a method1");
    }
    @Override
    public int m2() {
        return 0;
    }
}
