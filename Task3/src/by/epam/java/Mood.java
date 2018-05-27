package by.epam.java;

import java.util.Random;

public class Mood {
    public static void generationMood(){
        Random rand = new Random();
        int count = rand.nextInt(5);
        if (count == 0){
            System.out.println("My number is " + count + "\nI'm well\n:)");
            System.out.println("````¶¶¶¶¶¶¶¶¶¶```\n" +
                    "`¶¶````````````¶¶\n" +
                    "¶¶``¶¶¶````¶¶¶``¶¶\n" +
                    "¶````````````````¶\n" +
                    "¶¶```¶¶¶```¶¶¶``¶¶\n" +
                    "`¶¶````¶¶¶¶¶```¶¶\n" +
                    "````¶¶¶¶¶¶¶¶¶¶```");
        }
        else if (count == 1){
            System.out.println("My number is " + count + "\nI'm very well\n:]");
            System.out.println("````¶¶¶¶¶¶¶¶¶¶```\n" +
                    "`¶¶````````````¶¶\n" +
                    "¶¶``¶¶¶````¶¶¶``¶¶\n" +
                    "¶````````````````¶\n" +
                    "¶¶````¶¶``¶¶````¶¶\n" +
                    "`¶¶```¶¶¶¶¶¶```¶¶\n" +
                    "````¶¶¶¶¶¶¶¶¶¶```");
        }
        else if (count == 2){
            System.out.println("My number is " + count + "\nI'm sad\n:(");
            System.out.println("````¶¶¶¶¶¶¶¶¶¶```\n" +
                               "`¶¶````````````¶¶\n" +
                              "¶¶``¶¶¶````¶¶¶``¶¶\n" +
                              "¶````````````````¶\n" +
                              "¶¶````¶¶¶¶¶````¶¶\n" +
                               "`¶¶`¶¶¶``¶¶¶`¶¶\n" +
                               "````¶¶¶¶¶¶¶¶¶¶```");
        }
        else if (count == 3){
            System.out.println("My number is " + count + "\nI'm very sad\n:[");
            System.out.println("````¶¶¶¶¶¶¶¶¶¶```\n" +
                    "`¶¶````````````¶¶\n" +
                    "¶¶``¶¶¶````¶¶¶``¶¶\n" +
                    "¶````````````````¶\n" +
                    "¶¶````¶¶¶¶¶¶````¶¶\n" +
                    "`¶¶```¶¶``¶¶```¶¶\n" +
                    "````¶¶¶¶¶¶¶¶¶¶```");
        }
        else {
            System.out.println("My number is " + count + "\nI'm fine\n:|");
            System.out.println("````¶¶¶¶¶¶¶¶¶¶```\n" +
                    "`¶¶````````````¶¶\n" +
                    "¶¶``¶¶¶````¶¶¶``¶¶\n" +
                    "¶````````````````¶\n" +
                    "¶¶````¶¶¶¶¶`````¶¶\n" +
                    "`¶¶````````````¶¶\n" +
                    "````¶¶¶¶¶¶¶¶¶¶```");
        }
    }
}
