package by.epam.java.model.logic;

import by.epam.java.model.entity.Basket;
import by.epam.java.model.entity.Car;
import by.epam.java.model.entity.Product;
import by.epam.java.model.entity.TruckShop;

public class BasketLogic {

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

    public static double getPriceProductsTruck(TruckShop truck){
        if (checkTruck(truck)){
            return -1;
        }
        double sum = 0;
        for (int i = 0; i < truck.getSize(); i++){
            sum += truck.getElement(i).getPrice();
        }
        return sum;
    }

    public static double findMaxTruck(TruckShop truck){
        double max = -1;
        for (int i = 0; i < truck.getSize(); i++){
            if (truck.getElement(i).getPrice() > max){
                max = truck.getElement(i).getPrice();
            }
        }
        return max;
    }

    public static double findMinTruck(TruckShop truck){
        if (checkTruck(truck)){
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

    private static boolean checkTruck(TruckShop truck){
        return truck.getSize() == 0;
    }


}
