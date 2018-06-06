package by.epam.java;

public class SortArray {

    public static boolean checkSortArrayIncrease(double[] array){
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
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++){
            if(!(array[i] > array[i + 1])){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
