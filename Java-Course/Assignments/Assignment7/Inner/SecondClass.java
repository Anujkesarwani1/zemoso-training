package Assignment7.Inner;

public class SecondClass {
    class SecondInnerClass extends OuterClass.InnerClass {
        public SecondInnerClass(OuterClass outerClass, String str) {
            outerClass.super(str);
        }
    }
}

