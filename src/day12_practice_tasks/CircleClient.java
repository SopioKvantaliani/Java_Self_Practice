package day12_practice_tasks;

public class CircleClient {
    public static void main(String[] args) {

        Circle circle1 = new Circle(15);
        circle1.setRadius(10);
        circle1.calculateArea();
        circle1.calcPerimeter();
        System.out.println(circle1);



    }
}
