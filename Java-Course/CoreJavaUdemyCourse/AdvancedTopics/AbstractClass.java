
abstract class Vehicle {
    private String engine;
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }

    public abstract void drive();
}
class Truck extends Vehicle {

    @Override
    public void drive() {
        System.out.println("Truck drive");
    }
}

class Car extends Vehicle {

    @Override
    public void drive() {
        System.out.println("Car drive");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Car car = new Car();
        car.setEngine("hybrid");

        Truck truck = new Truck();
        truck.setEngine("electric");


    }
}
