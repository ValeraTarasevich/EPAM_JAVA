package by.epam.java;

public class Main {

    public static void main(String[] args) {
        System.out.println("===============Main #1==============");
        int number = 1000;
        int heads = HeadsOrTails.calcHeadsOrTails(number);
        System.out.println("Heads: " + heads + "\nTails: " + (number-heads));

        System.out.println("===============Main #2==============");
        int num = 2018;
        System.out.println("Max number: " + ArithmeticFunction.findMaxNumber(num));
//----------------
        int nPalindrome = 5402045;
        boolean flag = ArithmeticFunction.checkPalindrome(nPalindrome);
        if (flag){
            System.out.println("Number " + nPalindrome + " is Palindrome!");
        }
        else{
            System.out.println("Number " + nPalindrome + " isn't Palindrome!");
        }
//----------------
        int simple = 23;
        boolean flagSimple = ArithmeticFunction.checkSimpleNumber((simple));
        if (flagSimple){
            System.out.println("Number " + simple + " is simple!!");
        }
        else{
            System.out.println("Number " + simple + " isn't simple!!");
        }
//----------------
        int nDivider = 45;
        System.out.println("Number " + nDivider + " have simple divider: " + ArithmeticFunction.findAllSimpleDivider(nDivider));
//----------------
        int nFirst = 4;
        int nSecond = 10;
        System.out.println("Numbers: " + nFirst + " " + nSecond + "\n" + ArithmeticFunction.calcNODandNOK(nFirst,nSecond));
//----------------
        int numDiff = 11223;
        System.out.println("Number " + numDiff + " have " + ArithmeticFunction.calcDifferentNumber(numDiff) + " different number!");

        System.out.println("===============Main #3==============");



    }
}
