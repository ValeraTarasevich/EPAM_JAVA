package by.epam.java.controller;

import by.epam.java.logic.Recursion;

public class Main {

    public static void main(String[] args) {

        Recursion rec = new Recursion();

        int number1 = 9191;
        System.out.println("Sum digits of number: " + rec.sumNumber(number1));

        double number2 = 3;
        int degree = 1;
        System.out.println("Pow: " + number2 + " ^ " + degree + " = " + rec.powNumber(number2, degree));

        int first = 22;
        int second = 5;
        System.out.println("Equals number: " + first + " <> " + second + "\t" + rec.equalsNumbersTwo(first, second));
        System.out.println("Equals number: " + first + " <> " + second + "\t" + rec.equalsNumbers(first, second));

    }
}


