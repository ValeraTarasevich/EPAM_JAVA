package by.epam.java;

public class Main {

    private static final int NUMBER_RANDOM_WELL = 0;
    private static final int NUMBER_RANDOM_GOOD = 1;
    private static final int NUMBER_RANDOM_SAD = 2;
    private static final int NUMBER_RANDOM_BAD = 3;

    public static void main(String[] args) {

        System.out.println("================Main # 1=============");
        double x1 = 4.5, x2 = 3.5, x3 = 1.5,
               y1 = 2.2, y2 = 3.3, y3 = 2.5;
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
            System.out.println("This points aren't rectangular triangle!!!");
        }

        System.out.println("================Main # 2=============");
        int number = 10;
        String string = Dragon.countHeadAndEyes(number);
        if (string != null){
            System.out.println("Count heads and eyes: " + string);
        }
        else{
            System.out.println("You should enter positive integer number (more than 0)!");
        }

        System.out.println("================Main # 3=============");
        System.out.println("\tWith type char:");
        char symbol = 'a';
        char symbol2 = 'b';
        char symbol3 = 'U';
        boolean flag, flagTwo, flagThree, flagFour;
        flag = Vowel.checkVowel(symbol);
        if(flag){
            System.out.println("The letter '" + symbol + "' is vowel.");
        }
        else{
            System.out.println("The letter '" + symbol + "' is consonant.");
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

        flagFour =  Vowel.checkVowelFour(str2);
        if(flagFour){
            System.out.println("The letter '" + str2 + "' is vowel.");
        }
        else{
            System.out.println("The letter '" + str2 + "' is consonant.");
        }

        System.out.println("================Main # 4=============");
        //Mood.generationMood();
        int count = Mood.random();

        switch (count){
            case NUMBER_RANDOM_WELL:
                System.out.println("````¶¶¶¶¶¶¶¶¶¶```\n" +
                        "`¶¶````````````¶¶\n" +
                        "¶¶``¶¶¶````¶¶¶``¶¶\n" +
                        "¶````````````````¶\n" +
                        "¶¶```¶¶¶```¶¶¶``¶¶\n" +
                        "`¶¶````¶¶¶¶¶```¶¶\n" +
                        "````¶¶¶¶¶¶¶¶¶¶```");
                break;
            case NUMBER_RANDOM_GOOD:
                System.out.println("````¶¶¶¶¶¶¶¶¶¶```\n" +
                        "`¶¶````````````¶¶\n" +
                        "¶¶``¶¶¶````¶¶¶``¶¶\n" +
                        "¶````````````````¶\n" +
                        "¶¶````¶¶``¶¶````¶¶\n" +
                        "`¶¶```¶¶¶¶¶¶```¶¶\n" +
                        "````¶¶¶¶¶¶¶¶¶¶```");
                break;
            case NUMBER_RANDOM_SAD:
                System.out.println("````¶¶¶¶¶¶¶¶¶¶```\n" +
                        "`¶¶````````````¶¶\n" +
                        "¶¶``¶¶¶````¶¶¶``¶¶\n" +
                        "¶````````````````¶\n" +
                        "¶¶````¶¶¶¶¶````¶¶\n" +
                        "`¶¶`¶¶¶``¶¶¶`¶¶\n" +
                        "````¶¶¶¶¶¶¶¶¶¶```");
                break;
            case NUMBER_RANDOM_BAD:
                System.out.println("````¶¶¶¶¶¶¶¶¶¶```\n" +
                        "`¶¶````````````¶¶\n" +
                        "¶¶``¶¶¶````¶¶¶``¶¶\n" +
                        "¶````````````````¶\n" +
                        "¶¶````¶¶¶¶¶¶````¶¶\n" +
                        "`¶¶```¶¶``¶¶```¶¶\n" +
                        "````¶¶¶¶¶¶¶¶¶¶```");
                break;
            default: System.out.println("````¶¶¶¶¶¶¶¶¶¶```\n" +
                    "`¶¶````````````¶¶\n" +
                    "¶¶``¶¶¶````¶¶¶``¶¶\n" +
                    "¶````````````````¶\n" +
                    "¶¶````¶¶¶¶¶`````¶¶\n" +
                    "`¶¶````````````¶¶\n" +
                    "````¶¶¶¶¶¶¶¶¶¶```");
            break;
        }

        System.out.println("================Main # 5=============");
    }
}
