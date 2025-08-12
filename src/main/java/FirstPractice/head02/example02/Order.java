package FirstPractice.head02.example02;

public class Order {
    String customer;
    String product;
    int quantity;
    int price;

    Order(String customer, String product, int quantity, int price){
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public int getTotalprice(){
        return quantity * price;
    }

    public void printOrderSummary(){
        System.out.println(customer + " " + product + " " + getTotalprice());
    }


}
