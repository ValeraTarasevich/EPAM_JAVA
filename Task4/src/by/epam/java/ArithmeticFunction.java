package by.epam.java;

public class ArithmeticFunction {

    private static final int NUMBER_DIVIDER = 10;

    public static int findMaxNumber(int number){
        int tmp, max = 0;
        while (number != 0){
            tmp = number % NUMBER_DIVIDER;
            if (tmp > max){
                max = tmp;
            }
            number /= NUMBER_DIVIDER;
        }
        return max;
    }

    public static boolean checkPalindrome(int number){
        int oldNumber = number;
        int reverseNumber = 0;
        while(number != 0){
            reverseNumber = reverseNumber * NUMBER_DIVIDER + (number % NUMBER_DIVIDER);
            number /= NUMBER_DIVIDER;
        }
        if (reverseNumber == oldNumber){
            return true;
        }
        return false;
    }
}
