package by.epam.java;

import java.util.Random;

public class ArrayInitializer {

    private static final int STEP = 1;

    public static void randomArray(double[] array, int min, int max){
        checkArray(array);
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = min + (random.nextDouble() * (max - min));
        }
    }

    private static void checkArray(double[] array){
        if(array == null || array.length == 0){
            throw new ArrayIndexOutOfBoundsException("Empty array");
        }
    }

}
