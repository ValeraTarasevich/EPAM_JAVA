package by.epam.java;

public class TransposingArray {

    private static final int COUNT_ROW_COLUMN = 3;

    public static double[][] transposArray(double[][] array) {

        for (int i = 0; i < COUNT_ROW_COLUMN; i++) {
            for (int j = COUNT_ROW_COLUMN - 1; j > i; j--) {
                array[i][j] += array[j][i];
                array[j][i] = array[i][j] - array[j][i];
                array[i][j] -= array[j][i];
            }
        }
        return array;
    }
}

