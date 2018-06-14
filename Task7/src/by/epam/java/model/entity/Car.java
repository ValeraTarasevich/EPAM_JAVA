package by.epam.java.model.entity;

public class Car extends Product {

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
    public String toString() {
        return "Car {" + super.toString() +
                "type = '" + type + '\'' +
                ", speed = " + speed +
                '}';
    }
}
