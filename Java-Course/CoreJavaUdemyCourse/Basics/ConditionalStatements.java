package Basics;

public class ConditionalStatements {
    public static void main(String[] args) {
        // If Statements
        int amt = 35;
        if(amt < 22) {
            System.out.println("True");
        } else if (amt > 30) {
            System.out.println("False");
        } else {
            System.out.println("None of the above");
        }
        int val = 0;
        while(val < 6) {
            System.out.println("In the loop");
            if (val == 6) {
                break;
            }
            val++;
            System.out.println("Out of the loop");
        }
    }
}
