package Polymorphism;

class A {
    public void method() {
        System.out.println("This is Class A");
    }
}
class B extends A {
    public void method() {
        System.out.println("This is Class B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A a1 = new A();
        a1.method();

        B b1 = new B();
        b1.method();

        A a2 = new B();
        a2.method();
    }
}
