package by.epam.java;

import java.util.Arrays;

public class Main {

    private static final int COUNT_ROW = 3;
    private static final int COUNT_COLUMN = 3;

    public static void main(String[] args) {

        double[][] array = {{3, 5, 3, 4},
                            {-2, -2, 4, 3},
                            {3, -6, -3, 4},
                            {3, 5, 4, 3}};
        double[][] array1 = {{1, 1, 1},
                            {7, 3, 2},
                            {10, 4, 5}};

        double[][] arr = new double[COUNT_ROW][COUNT_COLUMN];
        ArrayInitialize.randValueForArray(arr, -5, 5);
        ArrayInitialize.printArray(arr);

        //=======================================
        System.out.println("\n==============Main # 1==================");
        System.out.printf("Max value: %s", ExtremeValue.findMaxValue(arr));
        System.out.printf("\nMin value: %s", ExtremeValue.findMinValue(arr));

        System.out.println("\n\n==============Main # 2==================");
        System.out.printf("Arithmetic: %.3f",AverageValue.calcArithValue(array1));
        System.out.printf("\nGeometric: %.3f", AverageValue.calcGeomValue(array1));
        System.out.println();

        System.out.println("\n==============Main # 3==================");
        System.out.println("First local max: (i+1 : j+1) " + FirstLocalMinMax.findFirstLocalMax(array));
        System.out.println("First local min: (i+1 : j+1) " + FirstLocalMinMax.findFirstLocalMin(array));

        System.out.println("\n==============Main # 4==================");
        double[][] array2 = {{1.3, 2.6, 1.8},
                            {7.24, 3.7, 2.12},
                            {10.85, 4.7, 5.34}};
        System.out.print("Array before transposing: ");
        ArrayInitialize.printArray(array2);
        TransposingArray.transposArray(array2);
        System.out.print("\n\nArray after transposing: ");
        ArrayInitialize.printArray(array2);


    }
}
