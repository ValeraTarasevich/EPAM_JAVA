package by.epam.java;

public class FirstLocalMinMax {

    public static int findPositionFirstMin(double[] array){
        checkArray(array);
        int number = -1;
        for(int i = 1; i < array.length - 1; i++){
            if (array[i] < array[i - 1] && array[i] < array[i + 1]){
                number = i + 1;
                break;
            }
        }
        return number;
    }

    public static int findPositionFirstMax(double[] array){
        checkArray(array);
        int number = -1;
        for(int i = 1; i < array.length - 1; i++){
            if (array[i] > array[i - 1] && array[i] > array[i + 1]){
                number = i + 1;
                break;
            }
        }
        return number;
    }

    private static void checkArray(double[] array){
        if(array == null || array.length == 0){
            throw new IllegalArgumentException("Empty array");
        }
    }
}
