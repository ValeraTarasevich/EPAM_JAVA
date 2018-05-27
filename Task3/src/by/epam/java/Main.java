package by.epam.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("================Main # 1=============");

        System.out.println("================Main # 2=============");
        int number = 10, number2 = 205, number3 = 350;
        Dragon.countHeadAndEyes(number);
        Dragon.countHeadAndEyes(number2);
        Dragon.countHeadAndEyes(number3);

        System.out.println("================Main # 3=============");
        System.out.println("\tWith type char:");
        char symbol = 'a';
        char symbol2 = 'b';
        char symbol3 = 'U';
        Vowel.checkVowel(symbol);
        Vowel.checkVowel(symbol2);
        Vowel.checkVowel(symbol3);
        Vowel.checkVowelTwo(symbol);
        Vowel.checkVowelTwo(symbol2);
        Vowel.checkVowelTwo(symbol3);
        System.out.println("\tWith type string:");
        String str = "i";
        String str2 = "j";
        String str3 = "A";
        Vowel.checkVowelThree(str);
        Vowel.checkVowelThree(str2);
        Vowel.checkVowelThree(str3);
        Vowel.checkVowelFour(str);
        Vowel.checkVowelFour(str2);
        Vowel.checkVowelFour(str3);

        System.out.println("================Main # 4=============");
        Mood.generationMood();

        System.out.println("================Main # 5=============");


    }
}
