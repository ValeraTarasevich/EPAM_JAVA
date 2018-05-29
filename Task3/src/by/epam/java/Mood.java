package by.epam.java;

import java.util.Random;

public class Mood {

    private static final int RANDOM_RANGE = 5;
//    private static final int NUMBER_RANDOM_WELL = 0;
//    private static final int NUMBER_RANDOM_GOOD = 1;
//    private static final int NUMBER_RANDOM_SAD = 2;
//    private static final int NUMBER_RANDOM_BAD = 3;

    public static int random(){
        Random rand = new Random();
        return rand.nextInt(RANDOM_RANGE);
    }

//    public static int generationMood(){
//        int count = random();
//     switch (count){
//        case NUMBER_RANDOM_WELL:
//            return count;
//        case NUMBER_RANDOM_GOOD:
//            return count;
//        case NUMBER_RANDOM_SAD:
//            return count;
//        case NUMBER_RANDOM_BAD:
//            return count;
//        default: return count;
//    }
}
