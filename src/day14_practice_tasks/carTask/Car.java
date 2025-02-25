package day14_practice_tasks.carTask;

public abstract class Car {
    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {

//        if (model == null || model.isEmpty()) {
//            throw new IllegalArgumentException("Model cannot be null or empty.");
//        }
//
//        if (year<1886){
//            throw new IllegalArgumentException("Year must be above 1886");
//        }
        this.make = (make == null || make.isEmpty()) ? "NO VALID MAKE" : make;
        this.model = (model == null || model.isEmpty()) ? "NO VALID MAKE" : model;
        this.year = year < 1886 ? 0 : year;
        setPrice(price);
        setColor(color);
    }


    public abstract void start();

    public abstract void drive();

    public void stop() {
        System.out.println(make + " is stopping");
    }

    ;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!color.isEmpty() && color != null) {
            this.color = color;
        } else {
            System.err.println("Field should not be empty or null");
        }

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price shouldn't be negative");
        }

    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "color='" + color + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}

