package by.epam.java;

import java.util.Random;

public class ArrayInitialize {

    private static final int COUNT_ROW = 3;
    private static final int COUNT_COLUMN = 3;

    private static final int COUNT_ROW_COLUMN = 3;


    public static void randValueForArray(double[][] array, double min, double max){
        Random random = new Random();
        for(int i = 0; i < COUNT_ROW; i++){
            for(int j = 0; j < COUNT_COLUMN; j++){
                array[i][j] = min + (random.nextDouble() * (max - min));
            }
        }
    }

    //i think it's better realize here then in main class
    public static void printArray(double[][] array){
        for(int i = 0; i < COUNT_ROW_COLUMN; i++){
            System.out.println();
            for(int j = 0; j < COUNT_ROW_COLUMN; j++){
                System.out.printf("\t%.2f", array[i][j]);
            }
        }
    }

}
