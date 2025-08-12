package FirstPractice.Head03.example06;

public class PolymorphismTest {
    public static void main(String[] args) {
        OrderService service = new OrderService();
        service.processPayment(new CreditCardPayment(), 10000);
        service.processPayment(new AccountTransferPayment(), 20000);
    }
}