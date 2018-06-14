package by.epam.java.model.entity;

public class Bear extends Product {

    private double size;

    public Bear(){

    }

    public Bear(double price, String material, String color, double size) {
        super(price, material, color);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Bear {" + super.toString() +
                "size = " + size +
                '}';
    }
}

