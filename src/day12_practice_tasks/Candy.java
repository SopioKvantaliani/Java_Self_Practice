package day12_practice_tasks;

public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0){
            System.err.println("Price should be positive");
            System.exit(1);
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<0){
            System.err.println("Quantity should not be negative");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public Candy(String brand, boolean hasPeanuts, double price, int quantity) {
        this.brand = brand;
        this.hasPeanuts = hasPeanuts;
        setPrice(price);
        setQuantity(quantity);
    }

    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price="  + (price==0 ? " free" : price)+
                "}";
    }
}
