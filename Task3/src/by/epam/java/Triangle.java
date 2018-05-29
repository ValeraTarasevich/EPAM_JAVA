package by.epam.java;

public class Triangle {

    private static final double NUMBER_FOR_ROOT = 0.5;

    public static double calcDistance(double x1, double y1, double x2, double y2){
        return Math.pow(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)), NUMBER_FOR_ROOT);
    }

    public static boolean conditionForFind(double dist1, double dist2, double dist3){
        if (dist1 < (dist2 + dist3)){
            return true;
        }
        return false;
    }

    public static boolean findTriangle(double dist1, double dist2, double dist3) {
        if (conditionForFind(dist1, dist2, dist3) && conditionForFind(dist2, dist1, dist3) && conditionForFind(dist3, dist1, dist2)) {
            return true;
        }
        return false;
    }

    public static boolean conditionForFindRT(double dist1, double dist2, double dist3){
        if (dist1*dist1 == (dist2*dist2 + dist3*dist3)){
            return true;
        }
        return false;
    }

    public static boolean findRectTriangle(double dist1, double dist2, double dist3) {
        if (conditionForFindRT(dist1, dist2, dist3) || conditionForFindRT(dist2, dist1, dist3) || conditionForFindRT(dist3, dist1, dist2)) {
            return true;
        }
        return false;
    }
}
