package DataHiding;

class bankAccount {
    private double balance = 10000.0;
    private String username = "anujkesarwani";
    private String password = "anuj@123";
    public double getBalance(String username, String password) {
        if(this.username.equals(username) && this.password.equals(password)) return balance;
        else return 0.0;
    }
}

public class dataHiding {
    public static void main(String[] args) {
        bankAccount account = new bankAccount();
        System.out.println(account.getBalance("anujkesarwani","anuj@123"));
    }
}
