package by.epam.java;

import java.util.Random;

public class HeadsOrTails {

    private static final int RANDOM_RANGE = 2;

    public static int random(){
        Random rand = new Random();
        return rand.nextInt(RANDOM_RANGE);
    }

    public static int calcHeadsOrTails(int number){
        int heads = 0;
        int rand;
        while(number != 0){
            rand = random();
            if (rand == 0){
                heads++;
            }
            number--;
        }
        return heads;
    }
}
