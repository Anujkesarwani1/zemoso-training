package Basics;

interface Information {
    public void displayInformation();
}

class MyVehicle implements Information {

    private String type;

    public MyVehicle(String type) {
        this.type = type;
    }
    public void drive() {
        System.out.println("Driving the vehicle.");
    }

    @Override
    public void displayInformation() {
        System.out.println("Vehicle type is:" + type);
    }

}

class Computer implements Information{
    private int serialNumber = 8035;
    public void start() {
        System.out.println("Computer started!");
    }

    @Override
    public void displayInformation() {
        System.out.println("Computer serial number is:" + serialNumber);
    }

}

public class Interface {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        computer1.start();

        MyVehicle vehicle1 = new MyVehicle("Car");
        vehicle1.drive();

        Information info = new Computer();
        info.displayInformation();

        Information info1 = vehicle1;
        info1.displayInformation();

        System.out.println();

        showInformation(computer1);
        showInformation(vehicle1);
    }
    private static void showInformation(Information info) {
        info.displayInformation();
    }
}

