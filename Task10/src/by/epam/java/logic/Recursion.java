package by.epam.java.logic;

public class Recursion {

    private static final int DIVIDER = 10;
    private static final int MAX_SINGLE_DIGIT = 10;

    public int sumNumber(int number) {
        int tmp;
        if (number < 0){
            return -1;
        }

        if (number < MAX_SINGLE_DIGIT)
            return number;

        tmp = number % DIVIDER;
        return sumNumber(number / DIVIDER) + tmp;
    }

    public double powNumber(double number, int degree){

        if (number <= 0 || degree < 0){
            return -1;
        }

        if (degree == 0)
            return 1;

        return powNumber(number, degree - 1) * number;
    }

    public boolean equalsNumbers(int first, int second){

        if (first < 0 || second < 0){
            return false;
        }
        else if (first < MAX_SINGLE_DIGIT && second < MAX_SINGLE_DIGIT){
            return first == second;
        }
        else if (first == 0) {
            return false;
        }

        int tmp = first % DIVIDER;
        return equalsNumbers(first / DIVIDER, second - tmp);
    }

    public boolean equalsNumbersTwo(int first, int second) {

        return first >= 0 && second >= 0 && sumNumber(first) == second;

    }

}


