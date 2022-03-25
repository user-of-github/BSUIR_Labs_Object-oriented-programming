package BankPayment;

public class BankPreferentialPaymentHandler extends BankPaymentHandler {
    private static final int Discount = 100;

    public BankPreferentialPaymentHandler(BankAccount account) {
        super(account);
    }

    public BankPreferentialPaymentHandler(BankAccount account, BankPaymentHandler next) {
        super(account, next);
    }

    @Override
    public int payForSomething(int sum) {
        var newSum = sum - sum / 100 * BankPreferentialPaymentHandler.Discount;

        if (this.next == null)
            this.accountForPayment.Pay(newSum);
        else
            this.next.payForSomething(newSum);

        return this.accountForPayment.getBalance();
    }
}
