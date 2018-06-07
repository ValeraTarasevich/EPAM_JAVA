package by.epam.java;

import java.util.Arrays;

public class Main {

    private static final int COUNT_ROW = 3;
    private static final int COUNT_COLUMN = 3;

    public static void main(String[] args) {

        double[][] array = {{10, -3, 6},
                            {-7, 3, 1},
                            {-10, 4, 5}};
        double[][] array1 = {{1, 1, 1},
                            {7, 3, 2},
                            {10, 4, 5}};

        double[][] arr = new double[COUNT_ROW][COUNT_COLUMN];
        ArrayInitialize.randValueForArray(arr, -5, 5);
        ArrayInitialize.printArray(arr);

        //=======================================
        System.out.println("\n==============Main # 1==================");
        System.out.printf("Max value: %.2f", ExtremeValue.findMaxValue(arr));
        System.out.printf("\nMin value: %.2f", ExtremeValue.findMinValue(arr));

        System.out.println("\n\n==============Main # 2==================");
        System.out.printf("Arithmetic: %.3f",AverageValue.calcArithValue(array));
        System.out.printf("\nGeometric: %.3f", AverageValue.calcGeomValue(array1));
        System.out.println();

//        System.out.println("\n==============Main # 3==================");
//        System.out.println("\n==============Main # 4==================");
//        System.out.println("\n==============Main # 5==================");


    }
}
