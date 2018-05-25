package by.epam.java;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {

        double a = 3.40;
        double b = 3.4;
        double c = 3.4;

        int aa = -3;
        int bb = 3;
        int cc = 3;

        float fa = 2.5f;
        float fb = 2.5f;
        float fc = 2.5f;
        boolean f;

        //f = Function.differentOrSameNumber(a,b,c);
        //f = Function.differentOrSameNumber(aa,bb,cc);
        f = Function.differentOrSameNumber(fa,fb,fc);
        if (f){
            //System.out.println("Different number: "+ a + " " + b + " " + c);
            //System.out.println("Different number: "+ aa + " " + bb + " " + cc);
            System.out.println("Different number: "+ fa + " " + fb + " " + fc);
        }
        else {
            //System.out.println("Same number: " + a + " " + b + " " + c);
            //System.out.println("Same number: " + aa + " " + bb + " " + cc);
            System.out.println("Same number: " + fa + " " + fb + " " + fc);
        }
        System.out.println("=================================================\n");

        double[] mass = Function.countKilo(a);
        System.out.println("Conversion from Kilo (double) --> miligram, gram, ton");
        System.out.println(a + " --> " + mass[0] + "\t" + mass[1] + "\t" + mass[2]);

        Function.MyClassResultInt resInt = Function.countKilo(bb);
        System.out.println("Conversion from Kilo (int) --> miligram, gram, ton");
        System.out.println(bb + " --> " + resInt.getA() + "\t" + resInt.getB() + "\t" + resInt.getC());

        float[] masFloat = Function.countKilo(fa);
        System.out.println("Conversion from Kilo (float) --> miligram, gram, ton");
        System.out.println(fa + " --> " + masFloat[0] + "\t" + masFloat[1] + "\t" + masFloat[2]);

        System.out.println("=================================================");

        double r1 = 3;
        double r2 = 4;
        double result;
        result = Function.squareRing(r1, r2);
        System.out.println("Square ring = " + result);

    }

}
