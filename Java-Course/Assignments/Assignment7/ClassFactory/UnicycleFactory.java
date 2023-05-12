package Assignment7.ClassFactory;

public class UnicycleFactory implements CycleFactory {
    @Override
    public Cycle createCycle() {
        return new Unicycle();
    }
}

