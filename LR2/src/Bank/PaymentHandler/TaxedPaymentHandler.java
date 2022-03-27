package Bank.PaymentHandler;


public class TaxedPaymentHandler extends PaymentHandler {
    private final int tax;

    public TaxedPaymentHandler(int tax) {
        this.tax = tax;
    }

    @Override
    public int getTotalRatioForPayment(int startRatio) {
        return this.checkNext(startRatio + tax);
    }
}
