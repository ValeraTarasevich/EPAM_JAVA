package by.epam.java;

public class PerfectNumber {
    public static boolean findPerfectNumber(int number){

        int sum = 0;
        for (int i = 1; i <= number/2; i++){
            if (number % i == 0){
                sum += i;
            }
        }
        if (sum == number){
            return true;
        }
        return false;
    }
}
