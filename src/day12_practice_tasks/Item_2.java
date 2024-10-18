package day12_practice_tasks;

import java.util.PrimitiveIterator;

public class Item_2 {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item_2(String name, int quantity, double unitPrice) {
        setName(name);
        setQuantity(quantity);
        setUnitPrice(unitPrice);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!=null && !name.isBlank() && isValidName(name)
                && Character.isLetter(name.charAt(0)) ){
            this.name = name;
        }

    }

    private boolean isValidName (String str){
        str = str.replace(" ", "");
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity>0){
            this.quantity = quantity;
        }

    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice>0){
            this.unitPrice = unitPrice;
        }
    }

    public double calculateCost (){
        return unitPrice*quantity;
    }

    public String toString() {
        return "Item_2{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost= "+calculateCost()+
                '}';
    }
}
