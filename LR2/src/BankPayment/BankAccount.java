package BankPayment;

public class BankAccount {
    private final String user;
    private int balance;

    public BankAccount(String name, int startBalance) {
        this.balance = startBalance;
        this.user = name;
    }

    public boolean Pay(int cost) {
        if (cost < this.balance && cost > 0) {
            this.balance -= cost;
            return true;
        }

        return false;
    }

    public String getUser() {
        return user;
    }

    public int getBalance() {
        return this.balance;
    }
}
