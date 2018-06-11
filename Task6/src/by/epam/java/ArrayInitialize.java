package by.epam.java;

import java.util.Random;

public class ArrayInitialize {

    public static void randValueForArray(double[][] array, double min, double max){
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = min + (random.nextDouble() * (max - min));
            }
        }
    }

    //i think it's better realize here then in main class
    public static void printArray(double[][] array){
        for(int i = 0; i < array.length; i++){
            System.out.println();
            for(int j = 0; j < array[i].length; j++){
                System.out.printf("\t%.2f", array[i][j]);
            }
        }
    }

}
