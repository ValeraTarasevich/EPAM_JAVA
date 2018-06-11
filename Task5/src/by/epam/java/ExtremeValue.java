package by.epam.java;

public class ExtremeValue {

    public static double findMaxElement(double[] array){
        checkArray(array);
        double max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static double findMinElement(double[] array){
        checkArray(array);
        double min = array[0];
        for(int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    private static void checkArray(double[] array){
        if(array == null || array.length == 0){
            throw new IllegalArgumentException("Empty array");
        }
    }
}
