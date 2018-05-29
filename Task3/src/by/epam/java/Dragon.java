package by.epam.java;

public class Dragon {

    private static final int MIN_COUNT_YEARS = 0;
    private static final int COUNT_YEARS = 200;
    private static final int MAX_COUNT_YEARS = 300;
    private static final int COUNT_EYES = 2;
    private static final int START_COUNT_HEAD = 3;
    private static final int MAX_COUNT_HEAD = 3;
    private static final int MIN_COUNT_HEAD = 2;

    public static String countHeadAndEyes(int years){
        int heads, eyes;
        int countFirst200Years = COUNT_YEARS * MAX_COUNT_HEAD;
        int countNext100Years = (MAX_COUNT_YEARS - COUNT_YEARS) * MIN_COUNT_HEAD;
        if (years > MIN_COUNT_YEARS && years <= COUNT_YEARS){
            heads = years * MAX_COUNT_HEAD + START_COUNT_HEAD;
            eyes = heads * COUNT_EYES;
            return heads + " " + eyes;
        }
        else if (years > COUNT_YEARS && years <= MAX_COUNT_YEARS){
            heads = (countFirst200Years) + ((years - COUNT_YEARS) * MIN_COUNT_HEAD) + START_COUNT_HEAD;
            //heads = (COUNT_YEARS * MAX_COUNT_HEAD) + ((years - COUNT_YEARS) * MIN_COUNT_HEAD) + START_COUNT_HEAD;
            eyes = heads * COUNT_EYES;
            return heads + " " + eyes;
        }
        else if (years > MAX_COUNT_YEARS){
            heads = (countFirst200Years) + (countNext100Years) + (years - MAX_COUNT_YEARS) + START_COUNT_HEAD;
            //heads = (COUNT_YEARS * MAX_COUNT_HEAD) + ((MAX_COUNT_YEARS - COUNT_YEARS) * MIN_COUNT_HEAD) + (years - MAX_COUNT_YEARS) + START_COUNT_HEAD;
            eyes = heads * COUNT_EYES;
            return heads + " " + eyes;
        }
        else {
            return null;
        }
    }
}
