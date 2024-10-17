package day12_practice_tasks;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int length, int width) {
        if (length<=0 || width<=0){
            System.err.println("Negative Numbers, try positive. ");
            System.exit(1);
        }
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length<=0){
            System.err.println("Invalid number "+length);
            System.exit(1);
        }
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width<=0){
            System.err.println("Invalid number "+width);
            System.exit(1);
        }
        this.width = width;
    }

    public double calcArea(){
        return width*length;
    }

    public double calcPerimeter (){
        return 2*(width+length);
    }


    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area="+calcArea()+
                ", perimeter="+calcPerimeter()+
                '}';
    }
}
