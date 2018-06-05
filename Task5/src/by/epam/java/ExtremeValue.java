package by.epam.java;

public class ExtremeValue {

    public static double findMaxElement(double[] array){
        double max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static double findMinElement(double[] array){
        double min = array[0];
        for(int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
