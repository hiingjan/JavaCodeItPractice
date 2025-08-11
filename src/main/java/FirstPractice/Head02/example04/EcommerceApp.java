package FirstPractice.Head02.example04;

import static FirstPractice.Head02.example04.Utility.applyDiscount;

public class EcommerceApp {
    public static void main(String[] args) {
        double originalPrice = 100.0;
        double finalPrice = applyDiscount(originalPrice);
        System.out.println("할인 적용된 가격: " + finalPrice);
    }
}
