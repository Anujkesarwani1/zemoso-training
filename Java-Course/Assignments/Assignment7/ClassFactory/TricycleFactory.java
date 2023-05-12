package Assignment7.ClassFactory;

public class TricycleFactory implements CycleFactory {
    @Override
    public Cycle createCycle() {
        return new Tricycle();
    }
}

