package FirstPractice.Head02.example03;

import java.util.List;

public class Product {
    private String productId;
    private String name;
    private double price;

    // 생성자
    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getter 메서드

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getProductId() {
        return productId;
    }
}
