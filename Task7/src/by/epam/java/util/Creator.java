package by.epam.java.util;

import by.epam.java.model.entity.Bear;
import by.epam.java.model.entity.Car;
import by.epam.java.model.entity.Robot;

import java.util.Random;

public class Creator {

    private static Random random = new Random();
    private static double min = 10;
    private static double max = 500;

    private static String[] materialCarRobot = {"plastic", "steel", "aluminium", "wood", "titanium", "glass"};
    private static String[] materialBear = {"fur", "cotton", "silk", "knitwear", "holofiber", "fleece"};
    private static String[] colorArr = {"red", "black", "white", "yellow", "green", "blue", "grey"};
    private static String[] typeCar = {"sedan", "suv", "coupe", "estate", "minivan", "hatchback", "pickup", "cabriolet"};
    private static String[] skillRobot = {"swim", "jump", "run", "fly", "shoot", "crawl"};

    public static Car createCar() {
        double price = min + (random.nextDouble() * (max - min));
        String material = materialCarRobot[random.nextInt(materialCarRobot.length - 1)];
        String color = colorArr[random.nextInt(colorArr.length - 1)];
        String type = typeCar[random.nextInt(typeCar.length - 1)];
        double speed = min + (random.nextDouble() * (max - min));
        return new Car(price, material, color, type, speed);
    }

    public static Bear createBear() {
        double price = min + (random.nextDouble() * (max - min));
        String material = materialBear[random.nextInt(materialBear.length - 1)];
        String color = colorArr[random.nextInt(colorArr.length - 1)];
        double size = min + (random.nextDouble() * (max - min));
        return new Bear(price, material, color, size);
    }

    public static Robot createRobot() {
        double price = min + (random.nextDouble() * (max - min));
        String material = materialCarRobot[random.nextInt(materialCarRobot.length - 1)];
        String color = colorArr[random.nextInt(colorArr.length - 1)];
        String skill = skillRobot[random.nextInt(skillRobot.length - 1)];
        double size = min + (random.nextDouble() * (max - min));
        return new Robot(price, material, color, skill, size);
    }
}