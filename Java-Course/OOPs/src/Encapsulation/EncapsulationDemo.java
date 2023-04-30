package Encapsulation;

class Account {
    private double balance;
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(100000.0);
        System.out.println(acc.getBalance());
    }
}
