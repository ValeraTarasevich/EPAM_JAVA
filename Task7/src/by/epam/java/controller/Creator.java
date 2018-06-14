package by.epam.java.controller;

import by.epam.java.model.entity.*;
import by.epam.java.model.logic.BasketLogic;

import java.util.prefs.BackingStoreException;

public class Creator {

    public static void printMyBasket() {
        int size = 4;

        Car car = new Car(56.4, "plastic", "red", "sedan", 200);
        Car car2 = new Car(199.9, "plastic", "black", "speedcar", 320);
        Bear bear = new Bear(150.4, "fur", "white", 40.3);
        Robot robot = new Robot(503.2, "metal", "black", "fly", 30);

        Basket basket = new Basket(size);
        try {
            basket.add(0, car);
            basket.add(1, car2, bear);
            basket.add(3, robot);
        }
        catch (NullPointerException ex){
            System.out.println(ex.getMessage());
            return;
        }

        if (basket.isEmpty()){
            System.out.println("Basket is empty!!!");
            return;
        }

        System.out.println("Fixed size: " + basket.getSize() + "\n");
        System.out.println(basket);
        System.out.printf("Sum price: %.2f", BasketLogic.getPriceProductsBasket(basket));
        System.out.println("\nMax price: " + BasketLogic.findMax(basket));
        System.out.println("Min price: " + BasketLogic.findMin(basket));
        System.out.println("\nCount products: " + basket.countElement());
        System.out.println("\nPrint certain product with index: \n" + basket.getElement(1));
        try {
            basket.delete(2);
//        basket.remove(car2);
        }
        catch (NullPointerException ex){
            System.out.println(ex.getMessage());
            return;
        }
        System.out.println("\nAfter delete with index: \n" + basket);

        System.out.println("Count products: " + basket.countElement());

        basket.deleteAll();
        if (basket.countElement() == 0) {
            System.out.println("Delete all products --> success");
        }
//        else {
//            str = "error";
//            System.out.println("Delete all products --> " + str + "\n" + basket);
//        }

    }

    public static void printMyTruckShop(){

        Car car = new Car(56.4, "plastic", "red", "sedan", 200);
        Car car2 = new Car(199.9, "plastic", "black", "speedcar", 320);
        Bear bear = new Bear(160.4, "fur", "white", 40.3);
        Robot robot = new Robot(203.2, "metal", "yellow", "swim", 50.1);

        TruckShop truck = new TruckShop();

        truck.add(car);
        truck.add(robot);
        truck.add(car2, bear);

        if(truck.isEmpty()){
            System.out.println("TruckShop is empty!!");
            return;
        }
        System.out.println(truck);
        System.out.printf("Sum price: %.2f", BasketLogic.getPriceProductsTruck(truck));
        System.out.println("\nMax price: " + BasketLogic.findMaxTruck(truck));
        System.out.println("Min price: " + BasketLogic.findMinTruck(truck));
        System.out.println("\nCount products: " + truck.getSize());

        try{
            truck.delete(1);
        }
        catch (IndexOutOfBoundsException ex){
            System.out.println("Error with index at delete");
            return;
        }
        System.out.println("\nDelete products with index: " + truck);
        System.out.println("Count products: " + truck.getSize());
        try {
            System.out.println("Get element with index: \n" + truck.getElement(1));
        }
        catch (IndexOutOfBoundsException ex){
            System.out.println("Error with index at get element");
            return;
        }

        truck.deleteAll();
        if (truck.getSize() == 0) {
            System.out.println("Delete all --> success");
        }

    }

}
