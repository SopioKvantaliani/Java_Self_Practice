package day8_practice_tasks;

public class CodingBat {

    public static void main(String[] args) {

        System.out.println(helloName("Bob"));
        System.out.println(helloName("X"));
        System.out.println(helloName("Gaga"));
    }

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }
}
