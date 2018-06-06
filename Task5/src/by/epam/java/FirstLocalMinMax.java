package by.epam.java;

public class FirstLocalMinMax {

    private static final int STEP_SIZE= 1;
    private static final int STEP = 1;
    private static final int STEP_INDEX = 1;

    public static int findPositionFirstMin(double[] array){
        int number = -1;
        for(int i = 1; i < array.length - STEP_SIZE; i++){
            if (array[i] < array[i - STEP] && array[i] < array[i + STEP]){
                number = i + STEP_INDEX;
                break;
            }
        }
        return number;
    }

    public static int findPositionFirstMax(double[] array){
        int number = -1;
        for(int i = 1; i < array.length - STEP_SIZE; i++){
            if (array[i] > array[i - STEP] && array[i] > array[i + STEP]){
                number = i + STEP_INDEX;
                break;
            }
        }
        return number;
    }
}
