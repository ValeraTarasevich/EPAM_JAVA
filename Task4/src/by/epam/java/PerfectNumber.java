package by.epam.java;

public class PerfectNumber {

    private static final int NUMBER_DIVIDER_2 = 2;

    public static boolean findPerfectNumber(int number){

        int sum = 0;
        for (int i = 1; i <= number / NUMBER_DIVIDER_2; i++){
            if (number % i == 0){
                sum += i;
            }
        }
        return sum == number;
    }
}
