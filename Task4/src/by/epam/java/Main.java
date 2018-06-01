package by.epam.java;

public class Main {

    public static void main(String[] args) {
        System.out.println("===============Main #1==============");
        int number = 1000;
        System.out.println("Heads : Tails");
        System.out.println(HeadsOrTails.calcHeadsOrTails(number));

        System.out.println("===============Main #2==============");
        int num = 2018;
        System.out.println("Max number: " + ArithmeticFunction.findMaxNumber(num));

        int numberPalindrome = 5402045;
        System.out.println(ArithmeticFunction.checkPalindrome(numberPalindrome));
        System.out.println("===============Main #3==============");



    }
}
