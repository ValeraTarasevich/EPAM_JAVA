package by.epam.java;

import java.util.ArrayList;
import java.util.List;

public class Function {

    public static boolean differentOrSameNumber(double a, double b, double c){
        if ((a == b) && (a == c)){
            return false;
        }
        else{
            return true;
        }
    }
    public static boolean differentOrSameNumber(int a, int b, int c){
        if ((a == b) && (a == c)){
            return false;
        }
        else{
            return true;
        }
    }
    public static boolean differentOrSameNumber(float a, float b, float c){
        if ((a == b) && (a == c)){
            return false;
        }
        else{
            return true;
        }
    }
    //====================================================================
    public static double[] countKilo(double a){
        double miliGram;
        double gram;
        double ton;
        miliGram = a * Math.pow(10,6);
        gram = a * Math.pow(10,3);
        ton = a * Math.pow(10,-3);
        return new double[] {miliGram, gram, ton};
    }

    public static float[] countKilo(float a){
        float miliGram;
        float gram;
        float ton;
        miliGram = a * 1000000;
        gram = a * 1000;
        ton = a * 0.001f;
        return new float[]{miliGram,gram,ton};
    }

    static final class MyClassResultInt {
        private final int a;
        private final int b;
        private final double c;

        public MyClassResultInt (int a, int b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public double getC() {
            return c;
        }
    }

    public static MyClassResultInt countKilo(int a){
        int miliGram;
        int gram;
        double ton;
        miliGram = a * 1000000;
        gram = a * 1000;
        ton = a * Math.pow(10, -3);
        return new MyClassResultInt(miliGram,gram,ton);
    }
    //=======================================================
     public static double squareRing(double r1, double r2){
        double pi = Math.PI;
        double s1,s2,s;
        s1 = pi*r1*r1;
        s2 = pi*r2*r2;
        if (r2>r1){
            s = s2-s1;
        }
        else{
            s = s1-s2;
        }
        return s;
    }


}

