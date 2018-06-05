package by.epam.java;

public class SortArray {

    public static boolean checkSortArrayIncrease(double[] array){
        for (int i = 0; i < array.length-1; i++){
           return array[i] < array[i + 1];
        }
        return false;
    }

    public static boolean checkSortArrayDecrease(double[] array){
        for (int i = 0; i < array.length-1; i++){
            return array[i] > array[i + 1];
        }
        return false;
    }
}
