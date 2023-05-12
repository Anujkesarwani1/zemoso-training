package Assignment7.Rodent;

public class Hamster implements Rodent {
    public Hamster() {
        System.out.println("Hey, I am Hamster Rodent");
    }
    @Override
    public void look() {
        System.out.println("I am small, furry rodents with round bodies, short legs, and distinct cheek pouches for storing food.");
    }

    @Override
    public void speed() {
        System.out.println("Hamster's Speed: 6.4 to 9.7 km per hour");
    }
}

