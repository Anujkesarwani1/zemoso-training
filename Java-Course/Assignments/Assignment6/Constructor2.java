package Assignment6;

// 3. Create a class with a constructor that takes a String argument. During construction, print the argument.
// Create an array of object references to this class, but don’t actually create objects to assign into the array.
// When you run the program, notice whether the initialization messages from the constructor calls are printed.


public class Constructor2 {
    private String str;
    public Constructor2(String str) {
        this.str = str;
        System.out.println(str);
    }
    public static void main(String[] args) {
        Constructor2 constructor2[] = new Constructor2[5];
        for(int i = 0; i < 5; i++) {
            constructor2[i] = new Constructor2("Thala");
        }
    }
}

