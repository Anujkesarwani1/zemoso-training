package Basics;

class Vehicle {
    public void design() {
        System.out.println("Vehicle Design");
    }

}

class Bike extends Vehicle {
    @Override
    public void design() {
        System.out.println("Bike Design");
    }

    public void ride() {
        System.out.println("Riding the Bike");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Bike bike = new Bike();

        Vehicle vehicle1 = bike;
        vehicle1.design();

        createDesign(bike);

    }
    public static void createDesign(Vehicle vehicle) {
        vehicle.design();
    }
}
