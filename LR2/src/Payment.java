import BankPayment.BankAccount;
import BankPayment.BankPaymentHandler;
import BankPayment.BankPreferentialPaymentHandler;
import BankPayment.BankTaxedPaymentHandler;


public class Payment {
    public static void main(String[] args) {
        var currentLoggedIn = new BankAccount("John", 1000);

        var testPayment = new BankTaxedPaymentHandler(currentLoggedIn, new BankTaxedPaymentHandler(currentLoggedIn, new BankPreferentialPaymentHandler(currentLoggedIn)));

        testPayment.payForSomething(200);

        System.out.println(currentLoggedIn.getBalance());
    }
}
