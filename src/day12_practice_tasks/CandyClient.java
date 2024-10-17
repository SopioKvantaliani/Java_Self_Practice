package day12_practice_tasks;

public class CandyClient {
    public static void main(String[] args) {

        Candy candy = new Candy("Roshen", true, 0, 5);
        System.out.println(candy);

        candy.setPrice(10);
        System.out.println(candy.getPrice());

        candy.setQuantity(5);
        System.out.println(candy.getQuantity());

        System.out.println(candy);
    }
}
