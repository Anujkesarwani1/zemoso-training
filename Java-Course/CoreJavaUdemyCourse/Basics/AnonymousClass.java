package Basics;

class MyComputer {
    public void shutDown() {
        System.out.println("Computer is shutting down.");
    }
}

interface Phone {
    public void call();
}

public class AnonymousClass {

    public static void main(String[] args) {

        MyComputer computer1 = new MyComputer() {
            @Override
            public void shutDown() {
                System.out.println("MacBook is shutting down.");
            }

        };
        computer1.shutDown();

        Phone phone1 = new Phone() {
            public void call() {
                System.out.println("Calling...");
            }
        };
        phone1.call();
    }

}