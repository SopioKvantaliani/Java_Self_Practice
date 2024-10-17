package day12_practice_tasks;

public class ItemClients {
    public static void main(String[] args) {

        Item item = new Item("Sopo", 10, 12);
        System.out.println(item);

        item.setName("Sopo");
        System.out.println(item.getName());

        item.setQuantity(10);
        System.out.println(item.getQuantity());
        item.setUnitPrice(5.5);
        System.out.println(item.getUnitPrice());
        System.out.println(item);

    }
}
