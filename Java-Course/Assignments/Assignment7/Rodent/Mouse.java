package Assignment7.Rodent;

public class Mouse implements Rodent {
    public Mouse() {
        System.out.println("Hey, I am Mouse Rodent");
    }
    @Override
    public void look() {
        System.out.println("I am small rodent with a compact body, pointy snout, rounded ears, and a long tail.");
    }

    @Override
    public void speed() {
        System.out.println("Mouse Speed: 12.8 km per hour");
    }
}

