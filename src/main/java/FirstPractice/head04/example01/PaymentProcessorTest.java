package FirstPractice.head04.example01;

public class PaymentProcessorTest {
    public static void main(String[] args) {
        Payment[] payments = {
                new CreditCardPayment(),
                new AccountTransferPayment(),
                new MobilePayment()
        };

        double[] amounts = {10000, 20000, 15000};

        PaymentProcessor processor = new PaymentProcessor();

        for (int i = 0; i < payments.length; i++) {
            processor.pay(payments[i], amounts[i]);
        }

    }
}
