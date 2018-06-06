package by.epam.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("============Main # 1==============");
        double[] array = {11, -34, 3.5, -5.3, 10.3, 10.39, 10.9, 1};
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Max element: " + ExtremeValue.findMaxElement(array));
        System.out.println("Min element: " + ExtremeValue.findMinElement(array));

        System.out.println("============Main # 2==============");
        double[] arr = {2, 4, 0.5};
        System.out.printf("Average Arithmetic: %f\n", AverageValue.findAverageArithmetic(arr));
        System.out.println("Average Geometric: " + AverageValue.findAverageGeometric(arr));
        double[] arr2 = {2, -4, 0.5};
        // if array have elements < 0 --> return -1
        System.out.println("Average Geometric: " + AverageValue.findAverageGeometricTwo(arr2));
        double[] arr3 = {10, -4, -3, -2, -3};
        System.out.println("Average Geometric: " + AverageValue.findAverageGeometricThree(arr3));

        System.out.println("============Main # 3==============");
        double[] arr4 = {-34, 11, 12, 13, 44};
        System.out.println(SortArray.checkSortArrayIncrease(arr4));
        double[] arr5 = {41.4, 40, 12.4, 11, 0, -4.5};
        System.out.println(SortArray.checkSortArrayDecrease(arr5));

        System.out.println("============Main # 4==============");
        double[] arr6 = {1.4, 12.3, 10.2, 10.3, 9, 11};
        System.out.println("Position the first local min: " + FirstLocalMinMax.findPositionFirstMin(arr6));
        System.out.println("Position the first local max: " + FirstLocalMinMax.findPositionFirstMax(arr6));

        System.out.println("============Main # 5==============");
        double[] arr7 = {2.4, 3.3, 4.2, 14, 4.3};
        System.out.println("Reverse array: " + ReverseElementsArray.reverseElemOfArrayTwo(arr7));
        System.out.println("Reverse array: " + Arrays.toString(ReverseElementsArray.reverseElementOfArray(arr7)));

    }
}
