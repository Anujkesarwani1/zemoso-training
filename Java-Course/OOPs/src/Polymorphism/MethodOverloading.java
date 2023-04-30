package Polymorphism;

class Addition {
    public void sum(int a, int b) {
        System.out.println("Sum of two number is: "+(a+b));
    }
    public void sum(int a, int b, int c) {
        System.out.println("Sum of three number is: "+(a+b+c));
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Addition add = new Addition();
        add.sum(2,4);
        add.sum(2,4,6);
    }
    // byte -> short -> int -> long -> float -> double
    //                   ^
    //                   |
    //                  char
}
