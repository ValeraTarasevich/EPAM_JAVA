package by.epam.java;

public class AverageValue {

    public static double calcArithValue(double[][] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                sum += array[i][j];
            }
        }
        return sum / (array.length * array[0].length);
    }

    public static double calcGeomValue(double[][] array){
        double mult = 1;

        if(checkArray(array)){
            return -1;
        }

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if (array[i][j] > 0) {
                    mult *= array[i][j];
                }
            }
        }
        return Math.pow(mult, (double) 1 / (array.length * array[0].length));
    }

    private static boolean checkArray(double[][] array){
        boolean flag = false;
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    flag = true;
                }
            }
        }
        return flag;
    }

}
