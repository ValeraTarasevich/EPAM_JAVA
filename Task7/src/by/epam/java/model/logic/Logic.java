package by.epam.java.model.logic;

import by.epam.java.model.entity.Container.Basket;
import by.epam.java.model.entity.Container.TruckShop;
import by.epam.java.model.entity.Container.TruckShopWithJCF;

public class Logic {

    public static double getPriceProductsBasket(Basket basket){
        if (checkBasket(basket)){
            return -1;
        }
        double sum = 0;
        for (int i = 0; i < basket.getSize(); i++){
            sum += basket.getElement(i).getPrice();
        }
        return sum;
    }

    public static double findMax(Basket basket){
        double max = -1;
        for (int i = 0; i < basket.getSize(); i++){
            if (basket.getElement(i).getPrice() > max){
                max = basket.getElement(i).getPrice();
            }
        }
        return max;
    }

    private static boolean checkBasket(Basket basket){
        return basket.getSize() == 0;
    }

    public static double findMin(Basket basket){
        if (checkBasket(basket)){
            return -1;
        }
        double min = basket.getElement(0).getPrice();
        for (int i = 1; i < basket.getSize(); i++){
            if (basket.getElement(i).getPrice() < min){
                min = basket.getElement(i).getPrice();
            }
        }
        return min;
    }

    public static double getPriceProductsTruck(TruckShop truckShop){
        if (checkTruckShop(truckShop)){
            return -1;
        }
        double sum = 0;
        for (int i = 0; i < truckShop.getSize(); i++){
            sum += truckShop.getElement(i).getPrice();
        }
        return sum;
    }

    public static double findMaxTruckShop(TruckShop truckShop){
        double max = -1;
        for (int i = 0; i < truckShop.getSize(); i++){
            if (truckShop.getElement(i).getPrice() > max){
                max = truckShop.getElement(i).getPrice();
            }
        }
        return max;
    }

    private static boolean checkTruckShop(TruckShop truckShop){
        return truckShop.getSize() == 0;
    }

    public static double findMinTruckShop(TruckShop truckShop){
        if (checkTruckShop(truckShop)){
            return -1;
        }
        double min = truckShop.getElement(0).getPrice();
        for (int i = 1; i < truckShop.getSize(); i++){
            if (truckShop.getElement(i).getPrice() < min){
                min = truckShop.getElement(i).getPrice();
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
