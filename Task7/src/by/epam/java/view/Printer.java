package by.epam.java.view;

import by.epam.java.model.entity.Basket;
import by.epam.java.model.entity.TruckShop;
import by.epam.java.model.entity.TruckShopWithJCF;

public class Printer {

    public static void printBasket(Basket basket){
        System.out.println(basket.toString());
    }

    public static void printTruck(TruckShop truckShop){
        System.out.println(truckShop.toString());
    }

    public static void printTruckJCF(TruckShopWithJCF truck){
        System.out.println(truck.toString());
    }

    public static void printfConsole(String str, double tmp){
        System.out.printf("%s%f", str, tmp);
    }

    public static void printConsole(String str){
        System.out.println(str);
    }

}
