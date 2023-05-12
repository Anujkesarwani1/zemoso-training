package Assignment7.Rodent;

public class Gerbil implements Rodent {
    public Gerbil() {
        System.out.println("Hey, I am Gerbil Rodent");
    }
    @Override
    public void look() {
        System.out.println("I am small rodents with a compact body, long tail, and large eyes.");
    }

    @Override
    public void speed() {
        System.out.println("Gerbil Speed: 16 km per hour");
    }
}

