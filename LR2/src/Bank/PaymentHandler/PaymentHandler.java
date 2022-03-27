package Bank.PaymentHandler;


public abstract class PaymentHandler {
    protected PaymentHandler next;

    public PaymentHandler linkWith(PaymentHandler next) {
        this.next = next;
        return next;
    }

    public PaymentHandler unlinkNext() {
        var temp = this.next;
        this.next = null;
        return temp;
    }

    public abstract int getTotalRatioForPayment(int startSum);

    protected int checkNext(int startRatio) {
        return this.next == null ? startRatio : next.getTotalRatioForPayment(startRatio);
    }
}
