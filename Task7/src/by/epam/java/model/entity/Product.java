package by.epam.java.model.entity;

public class Product {

    private static final int PRIME_NUMBER = 31;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Product product = (Product) o;
        if (price != product.price) return false;
        if (color == null) {
            if (product.color != null) return false;
        }
        else if (!color.equals(product.color)) return false;
        if (material == null){
            if (product.material != null) return false;
        }
        else if (!material.equals(product.material)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = PRIME_NUMBER * result + (int) price;
        result = PRIME_NUMBER * result + ((color == null) ? 0 : color.hashCode());
        result = PRIME_NUMBER * result + ((material == null) ? 0 : material.hashCode());
        return result;

    }

    @Override
    public String toString() {
        return "price = " + price +
                ", material = '" + material + '\'' +
                ", color = '" + color + '\'' +
                ", ";
    }
}
