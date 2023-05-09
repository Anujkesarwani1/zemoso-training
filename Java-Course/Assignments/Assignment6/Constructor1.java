package Assignment6;

// 2. Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.

public class Constructor1 {

    //calling parameterized constructor inside default constructor
    public Constructor1(int aInt) {
        this("MSD");
    }
    public Constructor1(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        Constructor1 constructor1 = new Constructor1(07);
    }
}

