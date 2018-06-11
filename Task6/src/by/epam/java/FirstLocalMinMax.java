package by.epam.java;

public class FirstLocalMinMax {

    //if check only 4 neighbors
    public static String findFirstLocalMax(double[][] array){
        int posI = -1;
        int posJ = -1;
        metka:
        for(int i = 1; i < array.length - 1; i++){
            for(int j = 1; j < array[i].length-1; j++){
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
        for(int i = 1; i < array.length - 1; i++){
            for(int j = 1; j < array[i].length - 1; j++){
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
