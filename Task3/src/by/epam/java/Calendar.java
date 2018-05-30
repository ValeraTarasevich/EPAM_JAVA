package by.epam.java;

public class Calendar {

    private static final int DAYS_IN_FEBRUARY = 29;
    private static final int MAX_DAYS_IN_SMALL_MONTH = 30;
    private static final int MAX_DAYS_IN_BIG_MONTH= 31;
    private static final int AUGUST = 8;
    private static final int FEBRUARY = 2;
    private static final int LAST_MONTH = 12;
    private static final int FIRST_DAY = 0;

    private static final int STEP_LEAP_YEAR = 4;
    private static final int STEP_FIND_USUAL_YEAR = 100;
    private static final int STEP_FIND_LEAP_YEAR = 400;


    public static String findNextDay(int day, int month, int year){

        boolean flag = checkYear(year);
        if (((month <= AUGUST) && (month % 2 == 1)) || ((month > AUGUST) && (month % 2 == 0) && (month != LAST_MONTH))) {
            if ((day > FIRST_DAY) && (day < MAX_DAYS_IN_BIG_MONTH)){
                day++;
            }
            else if (day == MAX_DAYS_IN_BIG_MONTH) {
                day = 1;
                month++;
            } else {
                return null;
            }
        }
        else if (((month <= AUGUST) && (month % 2 == 0) && (month != FEBRUARY)) || ((month > AUGUST) && (month % 2 == 1))) {
            if ((day > FIRST_DAY) && (day < MAX_DAYS_IN_SMALL_MONTH)){
                day++;
            }
            else if (day == MAX_DAYS_IN_SMALL_MONTH) {
                day = 1;
                month++;
            } else {
                return null;
            }
        }
        else if (month == LAST_MONTH) {
            if ((day > FIRST_DAY) && (day < MAX_DAYS_IN_BIG_MONTH)){
                day++;
            }
            else if (day == MAX_DAYS_IN_BIG_MONTH) {
                day = 1;
                month = 1;
                year++;
            } else {
                return null;
            }
        }
        else if (month == FEBRUARY){
            if (flag){
                if ((day > FIRST_DAY) && (day < DAYS_IN_FEBRUARY)){
                    day++;
                }
                else if (day == DAYS_IN_FEBRUARY){
                    day = 1;
                    month++;
                }
                else{
                    return null;
                }
            }
            else {
                if ((day > FIRST_DAY) && (day < DAYS_IN_FEBRUARY - 1)){
                    day++;
                }
                else if (day == DAYS_IN_FEBRUARY - 1){
                    day = 1;
                    month++;
                }
                else{
                    return null;
                }
            }
        }

        else {
            return null;
        }
        return day + "-" + month + "-" + year;
    }

    public static boolean checkYear(int year){
        if (year % STEP_LEAP_YEAR == 0){
            if (year % STEP_FIND_USUAL_YEAR == 0){
                if (year % STEP_FIND_LEAP_YEAR == 0){
                    return true;
                }
                return false;   //usual
            }
            return true;
        }
        return false; //usual
    }
}
