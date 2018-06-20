package by.epam.java.view;

import by.epam.java.model.entity.container.Basket;
import by.epam.java.model.entity.container.CollectionAble;
import by.epam.java.model.entity.container.TruckShop;
import by.epam.java.model.entity.container.TruckShopWithJCF;

public class Printer {

    public static void printCollection(CollectionAble basket){
        System.out.println(basket.toString());
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
