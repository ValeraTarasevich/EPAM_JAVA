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

    public static boolean checkSimpleNumber(int number) {
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String findAllSimpleDivider(int number){
        String str = "";
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                if(checkSimpleNumber(i)) {
                    str += i + " ";
                }
            }
        }
        return str;
    }

    public static String calcNODandNOK(int nFirst, int nSecond){
//        if (nFirst > nSecond){
//            int tmp = nSecond;
//            nSecond = nFirst;
//            nFirst = tmp;
//        }
        String str = "";
        for (int i = nFirst; i > 0; i--){
            if (nFirst % i == 0 && nSecond % i == 0){
                str += "NOD = " + i;
                break;
            }
        }
        for(int i = nSecond; i < (nFirst*nSecond)+1; i++){
            if (i % nFirst == 0 && i % nSecond == 0){
                str += "\tNOK = " + i;
                break;
            }
        }
        return str;
    }

    public static int calcDifferentNumber(int number){
        int tmp, tmp2, count = 0;
        int newNum;
        while (number != 0){
            count++;
            tmp = number % NUMBER_DIVIDER;
            number /= NUMBER_DIVIDER;
            newNum = number;
            while(newNum != 0){
                tmp2 = newNum % NUMBER_DIVIDER;
                if (tmp == tmp2){
                    count--;
                    break;
                }
                newNum /= NUMBER_DIVIDER;
            }
        }
        return count;
    }

}
