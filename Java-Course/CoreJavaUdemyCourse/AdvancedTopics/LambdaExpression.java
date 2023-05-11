
interface FunctionalInterface {
    int start(int value1, int value2);
}

interface AnotherFunctionalInterface {
    int start(String value);
}

class Car1 {
    public void drive(FunctionalInterface obj) {
        System.out.println("Driving the car...");
        int number = obj.start(10, 20);
        System.out.println("Returning the number: " + number);
    }

    /*
     * public void drive(AnotherFunctionalInterface obj) {
     * System.out.println("Driving the car..."); int number =
     * obj.start("Hi there!"); System.out.println("Returning the number: " +
     * number); }
     */
}

public class LambdaExpression {
    public static void main(String[] args) {

        Car1 car = new Car1();

        // Anonymous Class
        car.drive(new FunctionalInterface() {
            public int start(int value1, int value2) {
                System.out.println("Start driving...");
                return value1 * value2;
            }
        });

        System.out.println();

        // Lambda expression

        car.drive((value1, value2) -> {
            System.out.println("Start driving...");
            return value1 * value2;
        });

    }
}
