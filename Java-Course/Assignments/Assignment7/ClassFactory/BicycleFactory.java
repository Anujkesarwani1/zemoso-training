package Assignment7.ClassFactory;

public class BicycleFactory implements CycleFactory {
    @Override
    public Cycle createCycle() {
        return new Bicycle();
    }
}

