package by.epam.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("===================Main#1==============================");
        double a = 3.40;
        double b = 3.4;
        double c = 3.4;

        int aa = -3;
        int bb = 3;
        int cc = 3;

        float fa = 2.4f;
        float fb = 2.5f;
        float fc = 2.5f;
        boolean f;
        //f = Function.differentOrSameNumber(a,b,c);
        //f = Function.differentOrSameNumber(aa,bb,cc);
        f = Function.differentOrSameNumber(fa, fb, fc);
        if (f) {
            //System.out.println("Same number: "+ a + " " + b + " " + c);
            //System.out.println("Same number: "+ aa + " " + bb + " " + cc);
            System.out.println("Same number: " + fa + " " + fb + " " + fc);
        } else {
            //System.out.println("Different number: " + a + " " + b + " " + c);
            //System.out.println("Different number: " + aa + " " + bb + " " + cc);
            System.out.println("Different number: " + fa + " " + fb + " " + fc);
        }
        System.out.println("\n===================Main#2==============================");

        double[] mass = Function.countKilo(a);
        System.out.println("Conversion from Kilo (double) --> miligram, gram, ton");
        System.out.println(a + " --> " + mass[0] + "\t" + mass[1] + "\t" + mass[2]);

        Function.MyClassResultInt resInt = Function.countKilo(bb);
        System.out.println("Conversion from Kilo (int) --> miligram, gram, ton");
        System.out.println(bb + " --> " + resInt.getA() + "\t" + resInt.getB() + "\t" + resInt.getC());

        float[] masFloat = Function.countKilo(fa);
        System.out.println("Conversion from Kilo (float) --> miligram, gram, ton");
        System.out.println(fa + " --> " + masFloat[0] + "\t" + masFloat[1] + "\t" + masFloat[2]);

        System.out.println("\n===================Main#3==============================");

        double r1 = 3.2;
        double r2 = 4.1;
        double result;
        result = Function.squareRing(r1, r2);
        System.out.println("Square ring = " + result);

        System.out.println("\n==================Main#4========================");

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number please: ");
//        int number1 = sc.nextInt();
        int number = 5489;
        boolean flag;
        flag = Function.increaseNumber(number);
        if (flag){
            System.out.println("IncreaseNumber: " + number);
        }
        else {
            System.out.println("DecreaseNumber: " + number);
        }

        System.out.println("\n=====================Main#5===========================");
        int numberArith = 123456;
        System.out.println("Number: " + numberArith);
        System.out.print("ArithmeticMedium: ");
        double arith = Function.arithmeticMedium(numberArith);
        System.out.printf("%.3f", arith);
        System.out.print("\nGeometricMedium: ");
        double geom = Function.geometricMedium(numberArith);
        System.out.printf("%.3f", geom);

        System.out.println("\n\n==================Main#6============================");
        int num = 1234567;
        System.out.println("Number: " + num);
        System.out.print("ReverseNumber: ");
        Function.reverseNumber(num);

        System.out.println("\n\n==================Main#7============================");
        int num1 = 10, num2 = 15;
        System.out.println("Number1 = " + num1 + "\tNumber2 = " + num2);
        Function.swap(num1, num2);
    }
}
