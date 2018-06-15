package by.epam.java.model.entity;

import java.util.Objects;

public class Car extends Product {

    private static final int PRIME_NUMBER = 31;
    private String type;
    private double speed;

    public Car() {
    }

    public Car(double price, String material, String color, String type, double speed) {
        super(price, material, color);
        this.type = type;
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        if (type == null) {
            if (car.type != null)
                return false;
        } else if (!type.equals(car.type))
            return false;
        if (speed != car.speed) return false;
        return true;
    }

    @Override
    public int hashCode() {

        int result = super.hashCode();
        result = PRIME_NUMBER * result + (int)speed;
        result = PRIME_NUMBER * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Car {" + super.toString() +
                "type = '" + type + '\'' +
                ", speed = " + speed +
                '}';
    }
}
