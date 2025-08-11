package FirstPractice.Head02.example03;

import java.util.List;
import java.util.ArrayList;

public class Order {
    private String orderId;
    private List<Product> products;
    private boolean isPaid;

    // 기본 생성자
    public Order() {
        this.orderId = "NONE";
        this.products = new ArrayList<>();
        this.isPaid = false;
    }

    // 오버로딩된 생성자
    public Order(String orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
        this.isPaid = false;
    }

    // this() 호출 예시
    public Order(String orderId) {
        this(orderId, new ArrayList<>());
    }

    //getter or setter 생성 법 실습


    public String getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }
}
