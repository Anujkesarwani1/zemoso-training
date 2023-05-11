package Basics;

class Program {
    int value;
    String text;
    public Program() {
        this(5);
        System.out.println("First Constructors");
        value = 12;
    }
    public Program(int value) {
        this.value = value;
        System.out.println("Second Constructors");
    }
    public Program(int value, String text) {
        this.value = value;
        this.text = text;
        System.out.println("Third Constructors");
    }
}

public class Constructors {
    public static void main(String[] args) {
        // Constructors and this vs this()
        Program program = new Program();
        Program program1 = new Program(1);
        Program program2 = new Program(2, "Hey");
    }
}
