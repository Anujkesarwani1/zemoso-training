package basicstrongOOP;

public class FinalModifier {
        final int a = 0;
        public final void finalMethod(){
//            a = 10; //Cannot assign a value to final variable 'a'
            System.out.println("This is a final method");
        }
}

class FinalModifier2 extends FinalModifier {
//    public void finalMethod() {} //finalMethod()' cannot override 'finalMethod()' in 'basicstrongOOP.FinalModifier'; overridden method is final
}
