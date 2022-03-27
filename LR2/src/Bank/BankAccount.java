package Bank;

import Bank.PaymentHandler.PaymentHandler;


public class BankAccount {
    private final String user;
    private int balance;

    public BankAccount(String name, int startBalance) {
        this.balance = Math.max(startBalance, 0);
        this.user = name;
    }

    public PaymentResponseStatus pay(int cost, PaymentHandler baseHandler) {
        if (cost <= 0) return PaymentResponseStatus.INVALID_VALUE_TO_PAY;

        double totalRatio = (baseHandler.getTotalRatioForPayment(0) + 100) / 100.0;

        if (totalRatio > 100 || totalRatio < 0) return PaymentResponseStatus.INVALID_TOTAL_RATIO;

        int totalCost = (int) ((double) cost * totalRatio);

        if (totalCost <= this.balance) {
            this.balance -= totalCost;
            return PaymentResponseStatus.SUCCESS;
        } else {
            return PaymentResponseStatus.INSUFFICIENT_FUNDS;
        }
    }

    @Override
    public String toString() {
        return "-------\nUser: " + this.user + "\nBalance: " + this.balance + "\n-------";
    }
}
