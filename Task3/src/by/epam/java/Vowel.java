package by.epam.java;

public class Vowel {
    public static boolean checkVowel(char letter){
        if (letter=='a' || letter=='e' || letter=='y' || letter=='u' || letter=='i' || letter=='0' ||
                letter=='A' || letter=='E' || letter=='Y' || letter=='U' || letter=='I' || letter=='O'){
            return true;
        }
        return false;
    }
    public static boolean checkVowelTwo(char letter){
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
            case 'o': return true;
            default: return false;
        }
    }
    public static boolean checkVowelThree(String letter){
        String elements = "EeYyUuIiOoAa";
        if (elements.contains(letter)){
            return true;
        }
        return false;
    }
    public static boolean checkVowelFour(String letter) {
        String e = "e", y = "y", u = "u", i = "i", o = "o", a = "a";
        String str1 = "E", str2 = "Y", str3 = "U", str4 = "I", str5 = "O", str6 = "A";
        if (e.equals(letter) || y.equals(letter) || u.equals(letter) || i.equals(letter) || o.equals(letter) || a.equals(letter) ||
                str1.equals(letter) || str2.equals(letter) || str3.equals(letter) || str4.equals(letter) || str5.equals(letter) || str6.equals(letter)){
            return true;
        }
        return false;
    }
}
