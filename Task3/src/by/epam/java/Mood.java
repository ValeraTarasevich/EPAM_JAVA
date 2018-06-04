package by.epam.java;

import java.util.Random;

public class Mood {

    private static final int RANDOM_RANGE = 5;
    private static final String WELL = ":)";
    private static final String GOOD = ":]";
    private static final String BAD = ":[";
    private static final String SAD = ":(";
    private static final String BORING = ":|";

    public static String generationMood() {
        String result = BORING;
        switch (new Random().nextInt(RANDOM_RANGE)) {
            case 0:
                result = WELL;
                break;
            case 1:
                result = GOOD;
                break;
            case 2:
                result = BAD;
                break;
            case 3:
                result = SAD;
                break;
        }
        return result;
    }
}
