package by.epam.java;

public class ReverseElementsArray {

    public static void reverseElementOfArray(double[] array) {
        final int LEN = array.length;
        final int NUMBER_DIVIDER = 2;

        checkArray(array);

        for (int i = 0; i < (LEN / NUMBER_DIVIDER); i++) {
//            array[i] += array[LEN - STEP - i];
//            array[LEN - STEP - i] = array[i] - array[LEN - STEP - i];
//            array[i] -= array[LEN - STEP - i];
            array[i] += array[LEN - 1 - i];
            array[LEN - 1 - i] = array[i] - array[LEN - 1 - i];
            array[i] -= array[LEN - 1 - i];
        }
    }


    public static String reverseElemOfArrayTwo(double[] array){
        checkArray(array);
        String str = "";
        for(int i = array.length - 1; i >= 0; i--){
            str += array[i] + " ";
        }
        return str;
    }

    private static void checkArray(double[] array){
        if(array == null || array.length == 0){
            throw new IllegalArgumentException("Empty array");
        }
    }
}
