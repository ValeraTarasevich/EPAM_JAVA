package by.epam.java;

public class FirstLocalMinMax {

    public static int findPositionFirstMin(double[] array){
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
        int number = -1;
        for(int i = 1; i < array.length - 1; i++){
            if (array[i] > array[i - 1] && array[i] > array[i + 1]){
                number = i + 1;
                break;
            }
        }
        return number;
    }
}
