package by.epam.java;

public class ReverseElementsArray {

    private static final int STEP_SIZE= 1;
    private static final int STEP = 1;


    public static double[] reverseElementOfArray(double[] array) {
        final int LEN = array.length;
        final int NUMBER_DIVIDER = 2;

        for (int i = 0; i < (LEN / NUMBER_DIVIDER); i++) {
            array[i] += array[LEN - STEP - i];
            array[LEN - STEP - i] = array[i] - array[LEN - STEP - i];
            array[i] -= array[LEN - STEP - i];
        }
        return array;
    }


    public static String reverseElemOfArrayTwo(double[] array){
        String str = "";
        for(int i = array.length - STEP_SIZE; i >= 0; i--){
            str += array[i] + " ";
        }
        return str;
    }
}
