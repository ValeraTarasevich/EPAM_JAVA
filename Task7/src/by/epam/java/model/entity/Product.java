package by.epam.java.model.entity;

public class Product {

    private double price;
    private String material;
    private String color;

    public Product() {
    }

    public Product(double price, String material, String color) {
        this.price = price;
        this.material = material;
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "price = " + price +
                ", material = '" + material + '\'' +
                ", color = '" + color + '\'' +
                ", ";
    }
}
