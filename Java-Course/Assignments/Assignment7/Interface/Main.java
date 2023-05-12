package Assignment7.Interface;

// 3. Create three interfaces, each with two methods. Inherit a new interface that combines the three, adding a new method.
// Create a class by implementing the new interface and also inheriting from a concrete class. Now write four methods, each of which takes one of the four interfaces as an argument.
// In main( ), create an object of your class and pass it to each of the methods.

public class Main {
    public static void methodUsingInterface1(Interface1 interface1) {
        interface1.method1();
        interface1.method2();
    }
    public static void methodUsingInterface2(Interface2 interface2) {
        interface2.method3();
        interface2.method4();
    }
    public static void methodUsingInterface3(Interface3 interface3) {
        interface3.method5();
        interface3.method6();
    }
    public static void methodUsingInterfaceCombiner(InterfaceCombiner interfaceCombiner) {
        interfaceCombiner.method1();
        interfaceCombiner.method2();
        interfaceCombiner.method3();
        interfaceCombiner.method4();
        interfaceCombiner.method5();
        interfaceCombiner.method6();
        interfaceCombiner.method7();
    }
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        methodUsingInterface1(myClass);
        methodUsingInterface2(myClass);
        methodUsingInterface3(myClass);
        methodUsingInterfaceCombiner(myClass);
    }
}

// Output:
// Method 1
// Method 2
// Method 3
// Method 4
// Method 5
// Method 6
// Method 1
// Method 2
// Method 3
// Method 4
// Method 5
// Method 6
// Method 7

