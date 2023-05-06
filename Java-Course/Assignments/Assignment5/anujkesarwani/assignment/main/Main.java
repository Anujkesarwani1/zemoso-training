package anujkesarwani.assignment.main;

import anujkesarwani.assignment.data.DefaultInitialization;
import anujkesarwani.assignment.singleton.SingletonClass;

public class Main {
    public static void main(String[] args) {
        DefaultInitialization defInitialize = new DefaultInitialization();
        defInitialize.printVariables();
//        defInitialize.printLocalVariables();  it is not possible to print uninitialized local variables.

        SingletonClass singleton = new SingletonClass();
        SingletonClass singleton2 = singleton.initialize("Anuj", singleton);
        singleton2.printString();
    }
}

