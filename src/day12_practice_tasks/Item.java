package day12_practice_tasks;

import java.util.Locale;

public class Item {


    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.isEmpty() ||!Character.isLetter(name.charAt(0))) {
            System.err.println("Name should start with a letter");
            System.exit(1);
        }

        for (int i = 0; i < name.length(); i++) {
            char[] ch = name.toCharArray();
            if (!Character.isLetterOrDigit(ch[i])) {
                System.err.println("Name should not contain special characters");
                System.exit(1);
            }
        }

        this.name = name;
    }

    public int getQuantity() {
        if (quantity < 0) {
            System.err.println("Quantity should be positive");
            System.exit(1);
        }
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.err.println("Quantity should be positive");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        if (unitPrice < 0) {
            System.err.println("Quantity should be positive");
            System.exit(1);
        }
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            System.err.println("UnitPrice should be positive");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public double calcTotalCost (){
        return unitPrice*quantity;
    }



    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost="+calcTotalCost()+
                '}';
    }
}
