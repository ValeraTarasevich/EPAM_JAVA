package by.epam.java;

public class FirstLocalMinMax {

    private static final int COUNT_ROW = 4;
    private static final int COUNT_COLUMN = 4;

    public static String findFirstLocalMax(double[][] array){
        int posI = -1;
        int posJ = -1;
        metka:
        for(int i = 1; i < COUNT_ROW - 1; i++){
            for(int j = 1; j < COUNT_COLUMN - 1; j++){
                if(array[i][j] > array[i][j + 1] && array[i][j] > array[i][j - 1]
                        && array[i][j] > array[i - 1][j] && array[i][j] > array[i + 1][j]){
                    posI = i + 1;
                    posJ = j + 1;
                    break metka;
                }
            }
        }
        return posI + ":" + posJ;
    }

    public static String findFirstLocalMin(double[][] array){
        int posI = -1;
        int posJ = -1;
        metka:
        for(int i = 1; i < COUNT_ROW - 1; i++){
            for(int j = 1; j < COUNT_COLUMN - 1; j++){
                if(array[i][j] < array[i][j + 1] && array[i][j] < array[i][j - 1]
                        && array[i][j] < array[i - 1][j] && array[i][j] < array[i + 1][j]){
                    posI = i + 1;
                    posJ = j + 1;
                    break metka;
                }
            }
        }
        return posI + ":" + posJ;
    }

}
