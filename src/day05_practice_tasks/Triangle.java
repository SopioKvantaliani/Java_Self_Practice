package day05_practice_tasks;

public class Triangle {

    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
