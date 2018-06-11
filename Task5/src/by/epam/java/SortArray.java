package by.epam.java;

public class SortArray {

    public static boolean checkSortArrayIncrease(double[] array){
        checkArray(array);
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++){
            if(!(array[i] < array[i + 1])){
               flag = false;
               break;
           }
        }
        return flag;
    }

    public static boolean checkSortArrayDecrease(double[] array){
        checkArray(array);
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++){
            if(!(array[i] > array[i + 1])){
                flag = false;
                break;
            }
        }
        return flag;
    }

    private static void checkArray(double[] array){
        if(array == null || array.length == 0){
            throw new IllegalArgumentException("Empty array");
        }
    }
}
