package by.epam.java;

import com.sun.javafx.tools.packager.MakeAllParams;

public class AverageValue {

    private static final int COUNT_ROW = 3;
    private static final int COUNT_COLUMN = 3;

    public static double calcArithValue(double[][] array){
        int size = COUNT_COLUMN * COUNT_ROW;
        double sum = 0;
        for(int i = 0; i < COUNT_ROW; i++){
            for(int j = 0; j < COUNT_COLUMN; j++){
                sum += array[i][j];
            }
        }
        return sum / size;
    }

    public static double calcGeomValue(double[][] array){
        double mult = 1;
        double numberRoot = (double) 1/(COUNT_COLUMN * COUNT_ROW);
        for(int i = 0; i < COUNT_ROW; i++){
            for(int j = 0; j < COUNT_COLUMN; j++){
                if (array[i][j] > 0) {
                    mult *= array[i][j];
                }
                else{
                    return -1;
                }
            }
        }
        return Math.pow(mult, numberRoot);
    }

}