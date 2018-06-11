package by.epam.java;

public class AverageValue {

    private static final int NUMBER_DIVIDER = 2;
    private static final int RETURN_NUMBER = -1;

    public static double findAverageArithmetic(double[] array){
        checkArray(array);
        double sum = 0;
        for(int i = 0; i <array.length; i++){
            sum += array[i];
        }
        return sum / array.length;
    }
// only for positive number
    public static double findAverageGeometric(double[] array){
        checkArray(array);
        double mult = 1;
        for(int i = 0; i < array.length; i++){
            mult *= array[i];
        }
        return Math.pow(mult, (double) 1/array.length);
    }
//if negative number --> return -1
    public static double findAverageGeometricTwo(double[] array){
        checkArray(array);
        double mult = 1;
        for(int i = 0; i < array.length; i++){
            if (array[i] > 0) {
                mult *= array[i];
            }
            else {
                return RETURN_NUMBER;
            }
        }
        return Math.pow(mult, (double) 1/array.length);
    }
    // if array have even count "-" --> mult > 0 and i can remove root, else return -1
    //why not?)
    public static double findAverageGeometricThree(double[] array){
        checkArray(array);
        double mult = 1;
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] < 0) {
               count++;
            }
        }
        if (count % NUMBER_DIVIDER == 0){
            for (int i = 0; i < array.length; i++){
                mult *= array[i];
            }
        }
        else {
            return RETURN_NUMBER;
        }
        return Math.pow(mult, (double) 1/array.length);
    }

    private static void checkArray(double[] array){
        if(array == null || array.length == 0){
            throw new IllegalArgumentException("Empty array");
        }
    }

}
