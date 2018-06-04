package by.epam.java;

import javax.imageio.stream.MemoryCacheImageOutputStream;

public class Main {

    private static final int NUMBER_RANDOM_WELL = 0;
    private static final int NUMBER_RANDOM_GOOD = 1;
    private static final int NUMBER_RANDOM_SAD = 2;
    private static final int NUMBER_RANDOM_BAD = 3;

    public static void main(String[] args) {

        System.out.println("================Main # 1=============");
        double x1 = 3, x2 = 4, x3 = 6,
               y1 = 3, y2 = 4, y3 = 6;
        boolean flagTriangle, flagRectTriangle;
        flagTriangle = Triangle.findTriangle(Triangle.calcDistance(x1,y1,x2,y2), Triangle.calcDistance(x1,y1,x3,y3), Triangle.calcDistance(x2,y2,x3,y3));
        if (flagTriangle) {
            System.out.println("This points are triangle!!!");
        }
        else{
            System.out.println("This points aren't triangle!!!");
        }

        flagRectTriangle = Triangle.findRectTriangle(Triangle.calcDistance(x1,y1,x2,y2), Triangle.calcDistance(x1,y1,x3,y3), Triangle.calcDistance(x2,y2,x3,y3));
        if (flagRectTriangle) {
            System.out.println("This points are rectangular triangle!!!");
        }
        else{
            System.out.println("This points aren't triangle or not rectangular triangle!!!");
        }

        System.out.println("================Main # 2=============");
//        int number = 150;
//        String string = Dragon.countHeadAndEyes(number);
//        if (string != null){
//            System.out.println("Count heads and eyes: " + string);
//        }
//        else{
//            System.out.println("You should enter positive integer number (more than 0)!");
//        }

        int numDragon = 150;
        System.out.println("Heads: " + Dragon.calcHead(numDragon) + "\nEyes: " + (Dragon.calcHead(numDragon) * 2));

        System.out.println("================Main # 3=============");
        System.out.println("\tWith type char:");
        char symbol = 'a';
        char symbol2 = 'b';
        char symbol3 = 'U';
        boolean flag, flagTwo, flagThree, flagFour , flagFive, flagSix, flagSeven;
        flag = Vowel.checkVowel(symbol);
        if(flag){
            System.out.println("The letter '" + symbol + "' is vowel.");
        }
        else{
            System.out.println("The letter '" + symbol + "' is consonant.");
        }

        flagFive = Vowel.checkVowelCharTwo(symbol3);
        if(flagFive){
            System.out.println("The letter '" + symbol3 + "' is vowel.");
        }
        else{
            System.out.println("The letter '" + symbol3 + "' is consonant.");
        }

        flagTwo =  Vowel.checkVowelTwo(symbol2);
        if(flagTwo){
            System.out.println("The letter '" + symbol2 + "' is vowel.");
        }
        else{
            System.out.println("The letter '" + symbol2 + "' is consonant.");
        }

        System.out.println("\tWith type string:");
        String str = "i";
        String str2 = "j";
        String str3 = "A";

        flagThree =  Vowel.checkVowelThree(str);
        if(flagThree){
            System.out.println("The letter '" + str + "' is vowel.");
        }
        else{
            System.out.println("The letter '" + str + "' is consonant.");
        }

        flagFour =  Vowel.checkVowelFour(str3);
        if(flagFour){
            System.out.println("The letter '" + str3 + "' is vowel.");
        }
        else{
            System.out.println("The letter '" + str3 + "' is consonant.");
        }

        String s = "A";
        flagSix =  Vowel.checkVowelFive(s);
        if(flagSix){
            System.out.println("The letter '" + s + "' is vowel.");
        }
        else{
            System.out.println("The letter '" + s + "' is consonant.");
        }

        System.out.println("================Main # 4=============");
        System.out.println(Mood.generationMood());

        System.out.println("================Main # 5=============");
        int day = 31, month = 11, year = 2018; // because month 11 have max 30 days
        String date = Calendar.findNextDay(day, month, year);
        if (date == null){
            System.out.println("Incorrect number.");
        }
        else {
            System.out.println(date);
        }

        int day1 = 28, month1 = 2, year1 = 2018;
        System.out.println(Calendar.findNextDay(day1, month1, year1));
        int day2 = 29, month2 = 2, year2 = 2016;
        System.out.println(Calendar.findNextDay(day2, month2, year2));
        int day3 = 31, month3 = 12, year3 = 2018;
        System.out.println(Calendar.findNextDay(day3, month3, year3));
    }
}
