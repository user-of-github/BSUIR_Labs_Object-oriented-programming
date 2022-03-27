package Bank.PaymentHandler;

public class PreferentialPaymentHandler extends PaymentHandler {
    private final int discount;

    public PreferentialPaymentHandler(int discount) {
        this.discount = discount;
    }

    @Override
    public int getTotalRatioForPayment(int startRatio) {
        return this.checkNext(startRatio - discount);
    }
}
