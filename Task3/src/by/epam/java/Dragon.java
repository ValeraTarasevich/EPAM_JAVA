package by.epam.java;

public class Dragon {

    private static final int MIN_COUNT_YEARS = 0;
    private static final int COUNT_YEARS_200 = 200;
    private static final int MAX_COUNT_YEARS = 300;
 //   private static final int COUNT_EYES = 2;
    private static final int START_COUNT_HEAD = 3;
    private static final int MAX_COUNT_HEAD = 3;
    private static final int MIN_COUNT_HEAD = 2;



    public static int calcHead(int year){
        int heads = START_COUNT_HEAD;
        int countFirst200Years = COUNT_YEARS_200 * MAX_COUNT_HEAD;
        int countFirst300Years =  COUNT_YEARS_200 * MAX_COUNT_HEAD + (MAX_COUNT_YEARS - COUNT_YEARS_200) * MIN_COUNT_HEAD - MAX_COUNT_YEARS;
        if (year > MAX_COUNT_YEARS){
            heads += countFirst300Years + year;
        }
        else if (year > COUNT_YEARS_200){
            heads += countFirst200Years + (year - COUNT_YEARS_200) * MIN_COUNT_HEAD;
        }
        else if (year > MIN_COUNT_YEARS){
            heads += year * MAX_COUNT_HEAD;
        }
        else{
            return 0;
        }
        return heads;
    }

}
