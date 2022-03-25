package BankPayment;

public class BankTaxedPaymentHandler extends BankPaymentHandler {
    private static final int Tax = 20;

    public BankTaxedPaymentHandler(BankAccount account) {
        super(account);
    }

    public BankTaxedPaymentHandler(BankAccount account, BankPaymentHandler next) {
        super(account, next);
    }

    @Override
    public int payForSomething(int sum) {
        var newSum = sum + sum / 100 * BankTaxedPaymentHandler.Tax;

        if (this.next == null)
            this.accountForPayment.Pay(newSum);
        else
            this.next.payForSomething(newSum);

        return this.accountForPayment.getBalance();
    }
}
