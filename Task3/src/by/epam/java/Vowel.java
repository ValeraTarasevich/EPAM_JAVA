package by.epam.java;

public class Vowel {
    public static boolean checkVowel(char letter){
        letter = Character.toLowerCase(letter);
        return letter=='a' || letter=='e' || letter=='y'
                || letter=='u' || letter=='i' || letter=='o';
    }

    public static boolean checkVowelCharTwo(char letter){
        letter = Character.toLowerCase(letter);
        boolean flag = false;
        if (letter=='a'){
            flag = true;
        }
        else if (letter=='e'){
            flag = true;
        }
        else if (letter=='y'){
            flag = true;
        }
        else if (letter=='u'){
            flag = true;
        }
        else if (letter=='i'){
            flag = true;
        }
        else if (letter=='o'){
            flag = true;
        }
        return flag;
    }


    public static boolean checkVowelTwo(char letter){
        switch (Character.toLowerCase(letter)){
            case 'a':
            case 'e':
            case 'y':
            case 'u':
            case 'i':
            case 'o': return true;
        }
        return false;
    }
    public static boolean checkVowelThree(String letter){
        return "EeYyUuIiOoAa".contains(letter);
    }

    public static boolean checkVowelFour(String letter) {
        letter = letter.toLowerCase();
        return "e".equals(letter) || "y".equals(letter) || "u".equals(letter)
                || "i".equals(letter) || "o".equals(letter) || "a".equals(letter);
    }

    public static boolean checkVowelFive(String letter){
        return "EeYyUuIiOoAa".indexOf(letter) != -1;
    }

}
