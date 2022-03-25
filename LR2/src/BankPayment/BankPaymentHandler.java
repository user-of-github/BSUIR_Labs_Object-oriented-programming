package BankPayment;


public abstract class BankPaymentHandler {
    protected final BankAccount accountForPayment;
    protected final BankPaymentHandler next;

    public BankPaymentHandler(BankAccount accountForPayment) {
        this.accountForPayment = accountForPayment;
        this.next = null;
    }

    public BankPaymentHandler(BankAccount accountForPayment, BankPaymentHandler next) {
        this.accountForPayment = accountForPayment;
        this.next = next;
    }


    public abstract int payForSomething(int sum);
}
