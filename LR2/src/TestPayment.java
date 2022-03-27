import Bank.BankAccount;
import Bank.PaymentHandler.PreferentialPaymentHandler;
import Bank.PaymentHandler.TaxedPaymentHandler;
import Bank.PaymentResponseStatus;


public class TestPayment {
    public static void main(String[] args) {
        //TestPayment.showExampleWithDiscounts();
        TestPayment.showExampleWithTaxes();
    }

    private static void showExampleWithDiscounts() {
        PaymentResponseStatus paymentStatus;
        var studentDiscount = new PreferentialPaymentHandler(20);
        var excellentStudentDiscount = new PreferentialPaymentHandler(10);
        var competitionWinnerDiscount = new PreferentialPaymentHandler(5);

        var loggedStudent = new BankAccount("John Smith", 1000);
        System.out.println(loggedStudent);

        paymentStatus = loggedStudent.pay(100, studentDiscount);
        System.out.println(paymentStatus);
        System.out.println(loggedStudent);

        studentDiscount.linkWith(excellentStudentDiscount).linkWith(competitionWinnerDiscount);

        paymentStatus = loggedStudent.pay(100, studentDiscount);
        System.out.println(paymentStatus);
        System.out.println(loggedStudent);
    }

    private static void showExampleWithTaxes() {
        PaymentResponseStatus paymentStatus;
        var carWeight = new TaxedPaymentHandler(30);
        var enginesVolume = new TaxedPaymentHandler(7);

        var carDealer = new BankAccount("Anthony Stark", 1000);
        System.out.println(carDealer);

        paymentStatus = carDealer.pay(1000, carWeight);
        System.out.println(paymentStatus);
        System.out.println(carDealer);

        carWeight.linkWith(enginesVolume);

        paymentStatus = carDealer.pay(100, carWeight);
        System.out.println(paymentStatus);
        System.out.println(carDealer);
    }
}
