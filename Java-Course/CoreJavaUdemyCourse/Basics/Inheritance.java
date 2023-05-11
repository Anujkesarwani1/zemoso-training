package Basics;

class Factory {
    public void design() {
        System.out.println("Design the car");
    }
    public void build() {
        System.out.println("Build the car");
    }
}

class Car extends Factory {
    public void brand() {
        System.out.println("Tesla");
    }

}

public class Inheritance {
    public static void main(String[] args) {
        // Inheritance and Access Modifiers

        // Access Modifiers: Public, Protected, Default (lack of access Modifiers)
        Factory factory = new Factory();
        factory.design();
        factory.build();

        Car car = new Car();
        car.brand();
        car.design();
        car.build();
    }
}
