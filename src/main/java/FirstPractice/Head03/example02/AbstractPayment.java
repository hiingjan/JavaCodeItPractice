package FirstPractice.Head03.example02;

public abstract class AbstractPayment {
    public abstract void pay(double amount);

    public void cancel(double amount) {
        // 공통 취소 로직
        System.out.println("결제 취소: " + amount + "원");
    }
}