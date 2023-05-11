package anujkesarwani.assignment.data;

public class DefaultInitialization {
    int anInt;
    char aChar;

    // Instance Variables is initialized at the time of the class loading or when an object of the class is created.
    public void printVariables() {
        System.out.println("Instance Variables\nInteger: " + anInt + "\nCharacter: " + aChar);
    }

    // Local Variables cannot be declared or used without initialization,
    // if tried compiler throws an error (Variable 'anInt' might not have been initialized).

//    public void printLocalVariables() {
//        int anInt;
//        char aChar;
//        System.out.println("Local Variables\nInteger: " + anInt + "Character: " + aChar);
//    }
}

