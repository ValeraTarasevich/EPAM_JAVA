package by.epam.java.model.entity;

public class Robot extends Product{

    private String skill;
    private double size;

    public Robot(){

    }

    public Robot(double price, String material, String color, String skill, double size) {
        super(price, material, color);
        this.skill = skill;
        this.size = size;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Robot {" + super.toString() +
                "skill = '" + skill + '\'' +
                ", size = " + size +
                '}';
    }
}
