package by.epam.java.controller;

import by.epam.java.logic.Recursion;

public class Main {

    public static void main(String[] args) {

        Recursion rec = new Recursion();

        int number1 = 9191;
        System.out.println("Sum digits of number: " + rec.sumNumber(number1));

        double number2 = 3;
        int degree = 2;
        System.out.println("Pow: " + number2 + " ^ " + degree + " = " + rec.powNumber(number2, degree));

        int first = 22;
        int second = 4;
        System.out.println("Equals number: " + first + " <> " + second + "\t" + rec.equalsNumbersTwo(first, second));
        System.out.println("Equals number: " + first + " <> " + second + "\t" + rec.equalsNumbers(first, second));

        int numberFib = 4;
        System.out.println("Fibonachi: " + rec.fibonachi(numberFib));

        int numTower = 3;
        System.out.println("Count move by Tower of Hanoi: " + rec.countMove(numTower));
        System.out.println("Tower of Hanoi: " + rec.towerOfHanoi(numTower, "A", "C", "B"));

    }
}


