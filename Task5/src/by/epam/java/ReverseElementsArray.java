package by.epam.java;

public class ReverseElementsArray {

    public static double[] reverseElementOfArray(double[] array) {
        final int LEN = array.length;
        final int NUMBER_DIVIDER = 2;
        final int FIND_SECOND_ELEMENT = 1;

        for (int i = 0; i < (LEN / NUMBER_DIVIDER); i++) {
            array[i] += array[LEN - FIND_SECOND_ELEMENT - i];
            array[LEN - FIND_SECOND_ELEMENT - i] = array[i] - array[LEN - FIND_SECOND_ELEMENT - i];
            array[i] -= array[LEN - FIND_SECOND_ELEMENT - i];
        }
        return array;
    }


    public static String reverseElemOfArrayTwo(double[] array){
        String str = "";
        for(int i = array.length - 1; i >= 0; i--){
            str += array[i] + " ";
        }
        return str;
    }
}
