package basicstrongOOP;

public class PublicDemo {
    //Default class: Package only
    //private: inside that class only
    //protected: same package and within the subclass
    // a class or an outer class can not be private or protected
    // no concept like package inheritance in java
    //inner classes can be private and protected
    private int a = 0;
    protected void method() {
        int b = 0;
        System.out.println("Public Method");
    }
}
