package by.epam.java;

import java.util.Random;

public class ArrayInitializer {

    private static final int STEP = 1;

    public static void randomArray(int[] array, int min, int max){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + STEP) + min;
        }
    }

}
