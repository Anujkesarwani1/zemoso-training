package Assignment7.Cycle;

// 2. Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
// Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle.
// Create instances of all three types and upcast them to an array of Cycle.
// Try to call balance( ) on each element of the array and observe the results.
// Downcast and call balance( ) and observe what happens.

public class Main {
    public static void main(String[] args) {
        // Upcasting to an array of Cycle
        Cycle[] cycles = {new Unicycle(), new Bicycle(), new Tricycle()};

        // Calling balance() on each element of the array
        System.out.println("Calling balance() on each element of the array:");
        for (Cycle cycle : cycles) {
            cycle.balance();
        }

        // Downcasting and call balance()
        System.out.println("\nDowncasting and call balance():");
        for(Cycle cycle : cycles) {
            if(cycle instanceof Unicycle || cycle instanceof Bicycle) {
                ((Cycle) cycle).balance();
            }
            else {
                System.out.println("Tricycle does not have a balance() method");
            }
        }
    }
}

// Output:
// Calling balance() on each element of the array:
// Balancing a Unicycle
// Balancing a Bicycle
// Balancing a Cycle
// Downcasting and call balance():
// Balancing a Unicycle
// Balancing a Bicycle
// Tricycle does not have a balance() method

