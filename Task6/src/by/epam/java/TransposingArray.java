package by.epam.java;

public class TransposingArray {

    public static void transposArray(double[][] array) {
        if(array.length == array[0].length) {
            for (int i = 0; i < array.length; i++) {
                for (int j = array[i].length - 1; j > i; j--) {
                    array[i][j] += array[j][i];
                    array[j][i] = array[i][j] - array[j][i];
                    array[i][j] -= array[j][i];
                }
            }
        }
    }
}

