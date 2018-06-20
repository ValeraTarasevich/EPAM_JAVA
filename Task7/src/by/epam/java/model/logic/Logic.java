package by.epam.java.model.logic;

import by.epam.java.model.entity.container.CollectionAble;
import by.epam.java.model.entity.container.TruckShopWithJCF;

public class Logic {

    public static double getPriceProducts(CollectionAble collec){
        if (checkCollection(collec)){
            return -1;
        }
        double sum = 0;
        for (int i = 0; i < collec.getSize(); i++){
            sum += collec.getElement(i).getPrice();
        }
        return sum;
    }

    public static double findMax(CollectionAble collec){
        double max = -1;
        for (int i = 0; i < collec.getSize(); i++){
            if (collec.getElement(i).getPrice() > max){
                max = collec.getElement(i).getPrice();
            }
        }
        return max;
    }

    private static boolean checkCollection(CollectionAble collec){
        return collec.getSize() == 0;
    }

    public static double findMin(CollectionAble collec){
        if (checkCollection(collec)){
            return -1;
        }
        double min = collec.getElement(0).getPrice();
        for (int i = 1; i < collec.getSize(); i++){
            if (collec.getElement(i).getPrice() < min){
                min = collec.getElement(i).getPrice();
            }
        }
        return min;
    }

    public static double getPriceProductsTruckJCF(TruckShopWithJCF truck){
        if (checkTruckJCF(truck)){
            return -1;
        }
        double sum = 0;
        for (int i = 0; i < truck.getSize(); i++){
            sum += truck.getElement(i).getPrice();
        }
        return sum;
    }

    public static double findMaxTruckJCF(TruckShopWithJCF truck){
        double max = -1;
        for (int i = 0; i < truck.getSize(); i++){
            if (truck.getElement(i).getPrice() > max){
                max = truck.getElement(i).getPrice();
            }
        }
        return max;
    }

    public static double findMinTruckJCF(TruckShopWithJCF truck){
        if (checkTruckJCF(truck)){
            return -1;
        }
        double min = truck.getElement(0).getPrice();
        for (int i = 1; i < truck.getSize(); i++){
            if (truck.getElement(i).getPrice() < min){
                min = truck.getElement(i).getPrice();
            }
        }
        return min;
    }

    private static boolean checkTruckJCF(TruckShopWithJCF truck){
        return truck.getSize() == 0;
    }

}
