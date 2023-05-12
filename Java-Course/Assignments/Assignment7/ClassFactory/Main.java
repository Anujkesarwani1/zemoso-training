package Assignment7.ClassFactory;

// 4. Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle.
// Create factories for each type of Cycle, and code that uses these factories.

public class Main {
    public static void main(String[] args) {
        // Create Factories
        CycleFactory unicycleFactory = new UnicycleFactory();
        CycleFactory bicycleFactory = new BicycleFactory();
        CycleFactory tricycleFactory = new TricycleFactory();

        // Create cycles using factories
        Cycle unicycle = unicycleFactory.createCycle();
        Cycle bicycle = bicycleFactory.createCycle();
        Cycle tricycle = tricycleFactory.createCycle();

        unicycle.ride();
        bicycle.ride();
        tricycle.ride();
    }
}

// Output:
// Riding a unicycle
// Riding a Bicycle
// Riding a Tricycle

