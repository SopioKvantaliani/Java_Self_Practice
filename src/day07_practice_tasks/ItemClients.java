package day07_practice_tasks;

public class ItemClients {
    public static void main(String[] args) {

        Item item1 = new Item();
        Item item2 = new Item();

        item1.itemName = "Beyond burger";
        item1.quantity = 150;
        item1.unitPrice = 2;

        System.out.println(item1);
        System.out.println("----------------");
        double totalPrice = item1.calcCost();
        System.out.println(item1);
        System.out.println("Total Price of "+item1.itemName+" is "+totalPrice);

        item2.itemName = "Avocado";
        item2.unitPrice = 2;
        item2.quantity = 200;
        item2.calcCost();
        System.out.println(item2);


    }
}
