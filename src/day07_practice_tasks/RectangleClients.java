package day07_practice_tasks;

public class RectangleClients {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = 10.2;
        rectangle1.width = 11;
        double area = rectangle1.calculateArea();
        System.out.println(rectangle1 + " area is: " + area);
        System.out.println(rectangle1.calculateArea());

        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 10;
        rectangle2.length = 15;
        System.out.println("Perimeter is: " + rectangle1.calculatePerimeter());
        System.out.println("Area is: " + rectangle1.calculateArea());

        Rectangle rectangle3 = new Rectangle();
        rectangle3.width = 10;
        rectangle3.length = 12;
        double result1 = rectangle3.length + rectangle3.width;
        System.out.println("The sum of width and length of rectangle3 is: " + result1);

        System.out.println("---------------------");
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);

    }
}
