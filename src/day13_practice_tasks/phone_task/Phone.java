package day13_practice_tasks.phone_task;

public class Phone {

    private String brand, model, size, color;
    private double price;

    public Phone(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        this.size = size;
        setPrice(price);
        setColor(color);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand!=null && !brand.isEmpty() && !brand.isBlank()){
            this.brand = brand;
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color!=null && !color.isEmpty() && !color.isBlank()){
            this.color = color;
        }

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model!=null && !model.isEmpty() && !model.isBlank()){
            this.model = model;
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>0){
            this.price = price;
        }

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void call (long phoneNumber){
        System.out.println("calling the number "+ phoneNumber);
    }

    public void text (long phoneNumber){
        System.out.println("texting to the number "+ phoneNumber);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
