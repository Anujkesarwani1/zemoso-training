package basicstrongOOP;

class StaticModifiers2 {
    static int a = 0; //gets memory at the time of class loading!
    static void display() {
        System.out.println("The value for static variable a is: "+a);
    }
    public void finalMethod(){
//            a = 10; //Cannot assign a value to final variable 'a'
        System.out.println("This is a final method");
    }
}

public class StaticModifier {
    public static void main(String[] args) {
        StaticModifiers2.display();
    }

}
