package Inheritance;

//Single Inheritance - B -> A
class A {}
class B extends A {}

//Multi Level Inheritance C -> B -> A
class C extends B {}

//Multiple Inheritance - More than 1 parent class
interface D {
    default void method() {
        System.out.println("Method of D class");
    }
}
interface E {
    default void method() {
        System.out.println("Method of E class");
    }
}
class F implements D, E {
    public void method() {
        D.super.method();
    }
}

//Hierarchical Inheritance - H, I -> G (Single parent, more than 1 children
class G {}
class H extends G {}
class I extends G {}

//Hybrid Inheritance - Multiple + MultiLevel
public class InheritanceDemo {
}
