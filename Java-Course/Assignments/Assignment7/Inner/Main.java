package Assignment7.Inner;

// 5. Create a class with an inner class that has a non-default constructor (one that takes arguments).
// Create a second class with an inner class that inherits from the first inner class.

public class Main {
    public static void main(String[] args) {
        SecondClass secondClass = new SecondClass();
        OuterClass outerClass = new OuterClass();
        SecondClass.SecondInnerClass secondInnerClass = secondClass.new SecondInnerClass(outerClass, "Anuj");
    }
}

// Output: Anuj

