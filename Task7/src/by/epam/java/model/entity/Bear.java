package by.epam.java.model.entity;

import java.util.Objects;

public class Bear extends Product {

    private double size;
    private static final int PRIME_NUMBER = 31;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bear bear = (Bear) o;
        if (size != bear.size) return false;
        return true;
    }

    @Override
    public int hashCode() {

        int result = super.hashCode();
        result = PRIME_NUMBER * result + (int)size;
        return result;
    }

    @Override
    public String toString() {
        return "Bear {" + super.toString() +
                "size = " + size +
                '}';
    }
}

