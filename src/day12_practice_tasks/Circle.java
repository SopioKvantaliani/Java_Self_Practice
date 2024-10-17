package day12_practice_tasks;

public class Circle {
    private double radius;
    public static double pi = 3.14;

    public Circle(double radius) {
        if (radius<=0){
            System.err.println("Invalid data "+radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            System.err.println("Radius should not be negative number");
            System.exit(1);
        }
        this.radius = radius;
    }

    public double calculateArea (){
       return radius*radius*pi;
    }

    public double calcPerimeter(){
        return Math.round(2*radius*pi);
    }


    public String toString() {
        return "Radius = "+getRadius()+"\nArea = "+calculateArea()+"\nPerimeter = "+calcPerimeter();
    }
}
