package by.epam.java;

public class ExtremeValue {

    private static final int COUNT_ROW = 3;
    private static final int COUNT_COLUMN = 3;

    public static String findMaxValue(double[][] array) {
        double max = array[0][0];

        if(!checkArray(array)) {
            return "This array have the same values";
        }

        for(int i = 0; i < COUNT_ROW; i++){
            for(int j = 0; j < COUNT_COLUMN; j++){
                if(array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        return max + "";
    }

    public static String findMinValue(double[][] array) {
        double min = array[0][0];

        if(!checkArray(array)) {
            return "This array have the same values";
        }

        for(int i = 0; i < COUNT_ROW; i++){
            for(int j = 0; j < COUNT_COLUMN; j++){
                if(array[i][j] < min){
                    min = array[i][j];
                }
            }
        }
        return min + "";
    }

    private static boolean checkArray(double[][] array){
        double element = array[0][0];
        boolean flag = false;
        for(int i = 0; i < COUNT_ROW; i++) {
            for (int j = 0; j < COUNT_COLUMN; j++) {
                if (array[i][j] != element) {
                    flag = true;
                }
            }
        }
        return flag;
    }

}
