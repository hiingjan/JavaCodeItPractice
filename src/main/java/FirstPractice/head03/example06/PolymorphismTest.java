package FirstPractice.head03.example06;

public class PolymorphismTest {
    public static void main(String[] args) {
        OrderService service = new OrderService();

        // 인터페이스 배열에 구현체 담기
        Payment[] payments = new Payment[] {
                new CreditCardPayment(),
                new AccountTransferPayment()
        };

        // 타입별로 다른 금액을 적용할 배열
        double[] paymentAmounts = new double[] { 30000, 70000 };

        // instanceof로 타입에 따라 다른 금액 전달
        for (Payment p : payments) {
            if (p instanceof CreditCardPayment) {
                service.processPayment(p, paymentAmounts[0]); // 세미콜론 필수
            } else if (p instanceof AccountTransferPayment) {
                service.processPayment(p, paymentAmounts[1]); // 세미콜론 필수
            }
        }
    }
}