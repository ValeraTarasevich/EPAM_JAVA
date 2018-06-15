package by.epam.java.model.entity;

import java.util.Objects;

public class Robot extends Product{

    private static final int PRIME_NUMBER = 31;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Robot robot = (Robot) o;
        if (skill == null) {
            if (robot.skill != null)
                return false;
        } else if (!skill.equals(robot.skill))
            return false;
        if (size != robot.size) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = PRIME_NUMBER * result + (int)size;
        result = PRIME_NUMBER * result + ((skill == null) ? 0 : skill.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Robot {" + super.toString() +
                "skill = '" + skill + '\'' +
                ", size = " + size +
                '}';
    }
}
