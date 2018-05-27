package by.epam.java;

public class Vowel {
    public static void checkVowel(char letter){
        if (letter=='a' || letter=='e' || letter=='y' || letter=='u' || letter=='i' || letter=='0' ||
                letter=='A' || letter=='E' || letter=='Y' || letter=='U' || letter=='I' || letter=='O'){
            System.out.println("The letter '" + letter + "' is vowel.");
        }
        else{
            System.out.println("The letter '" + letter + "' is consonant.");
        }
    }
    public static void checkVowelTwo(char letter){
        switch (letter){
            case 'a':
            case 'e':
            case 'y':
            case 'u':
            case 'i':
            case 'A':
            case 'E':
            case 'Y':
            case 'U':
            case 'I':
            case 'O':
            case 'o': System.out.println("The letter '" + letter + "' is vowel."); break;
            default: System.out.println("The letter '" + letter + "' is consonant."); break;
        }
    }
    public static void checkVowelThree(String letter){
        String elements = "EeYyUuIiOoAa";
        if (elements.contains(letter)){
            System.out.println("The letter '" + letter + "' is vowel.");
        }
        else {
            System.out.println("The letter '" + letter + "' is consonant.");
        }
    }
    public static void checkVowelFour(String letter) {
        String e = "e", y = "y", u = "u", i = "i", o = "o", a = "a";
        String E = "E", Y = "Y", U = "U", I = "I", O = "O", A = "A";
        if (e.equals(letter) || y.equals(letter) || u.equals(letter) || i.equals(letter) || o.equals(letter) || a.equals(letter) ||
                E.equals(letter) || Y.equals(letter) || U.equals(letter) || I.equals(letter) || O.equals(letter) || A.equals(letter)){
            System.out.println("The letter '" + letter + "' is vowel.");
        }
        else {
            System.out.println("The letter '" + letter + "' is consonant.");
        }
    }
}
