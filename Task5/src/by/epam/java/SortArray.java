package by.epam.java;

public class SortArray {

    private static final int STEP_SIZE = 1;
    private static final int STEP = 1;

    public static boolean checkSortArrayIncrease(double[] array){
        boolean flag = true;
        for (int i = 0; i < array.length - STEP_SIZE; i++){
           if(!(array[i] < array[i + STEP])){
               flag = false;
               break;
           }
        }
        return flag;
    }

    public static boolean checkSortArrayDecrease(double[] array){
        boolean flag = true;
        for (int i = 0; i < array.length - STEP_SIZE; i++){
            if(!(array[i] > array[i + STEP])){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
