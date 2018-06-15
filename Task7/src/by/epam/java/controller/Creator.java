package by.epam.java.controller;

import by.epam.java.model.entity.*;
import by.epam.java.model.logic.Logic;
import by.epam.java.model.logic.Sort;
import by.epam.java.util.impl.SortByPrice;

import java.util.Arrays;
import java.util.TreeSet;

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
        System.out.printf("Sum price: %.2f", Logic.getPriceProductsBasket(basket));
        System.out.println("\nMax price: " + Logic.findMax(basket));
        System.out.println("Min price: " + Logic.findMin(basket));
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
        Bear bear = new Bear(150.4, "fur", "white", 40.3);
        Robot robot = new Robot(503.2, "metal", "black", "fly", 30);

        TruckShop truckShop = new TruckShop();
        try {
            truckShop.add(car);
            truckShop.add(car2, bear);
            truckShop.add(robot);
        }
        catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }

        if (truckShop.isEmpty()){
            System.out.println("TruckShop is empty!!!");
            return;
        }

        System.out.println("Size: " + truckShop.getSize() + "\n");
        System.out.println(truckShop);
        System.out.printf("Sum price: %.2f", Logic.getPriceProductsTruck(truckShop));
        System.out.println("\nMax price: " + Logic.findMaxTruckShop(truckShop));
        System.out.println("Min price: " + Logic.findMinTruckShop(truckShop));
        System.out.println("\nCount products: " + truckShop.countElement());
        try {
            System.out.println("\nPrint certain product with index: \n" + truckShop.getElement(1));
        }
        catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }
        try {
            truckShop.delete(2);
//        basket.remove(car2);
        }
        catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\nAfter delete with index: \n" + truckShop);

        System.out.println("Count products: " + truckShop.countElement());

        truckShop.deleteAll();
        if (truckShop.countElement() == 0) {
            System.out.println("Delete all products --> success");
        }


    }

    public static void printMyTruckShopWithJCF(){

        Car car = new Car(56.4, "plastic", "red", "sedan", 200);
        Car car2 = new Car(199.9, "plastic", "black", "speedcar", 320);
        Bear bear = new Bear(160.4, "fur", "white", 40.3);
        Robot robot = new Robot(203.2, "metal", "yellow", "swim", 50.1);

        TruckShopWithJCF truck = new TruckShopWithJCF();

        truck.add(car);
        truck.add(robot);
        truck.add(car2, bear);

        if(truck.isEmpty()){
            System.out.println("TruckShopWithJCF is empty!!");
            return;
        }
        System.out.println(truck);
        System.out.printf("Sum price: %.2f", Logic.getPriceProductsTruckJCF(truck));
        System.out.println("\nMax price: " + Logic.findMaxTruckJCF(truck));
        System.out.println("Min price: " + Logic.findMinTruckJCF(truck));
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


    public static void sortProductByPice(){

        Car car = new Car(56.4, "plastic", "red", "sedan", 200);
        Car car2 = new Car(199.9, "plastic", "black", "speedcar", 320);
        Bear bear = new Bear(150.2, "fur", "white", 40.3);
        Robot robot = new Robot(203.2, "metal", "yellow", "swim", 50.1);


        TruckShop truckShop = new TruckShop();

        truckShop.add(car, car2, bear, robot);
        System.out.println(truckShop);
        System.out.println("Sort not Fixed: " + Arrays.toString(Sort.sortTruckForPrice(truckShop)));

        Basket basket = new Basket(4);

        basket.add(0, car, car2, bear, robot);
        System.out.println("Sort Fixed: " + Arrays.toString(Sort.sortBasketForPrice(basket)));

    }

    public static void sortProductByPriceJCF(){
        SortByPrice sort = new SortByPrice();
        TreeSet<Product> products = new TreeSet<>(sort);

        Car car = new Car(56.4, "plastic", "red", "sedan", 200);
        Car car2 = new Car(199.9, "plastic", "black", "speedcar", 320);
        Bear bear = new Bear(160.4, "fur", "white", 40.3);
        Robot robot = new Robot(203.2, "metal", "yellow", "swim", 50.1);


        products.add(car);
        products.add(car2);
        products.add(bear);
        products.add(robot);

        System.out.println(products);
        for (Product p : products){
            System.out.println(p.getPrice());
        }



    }




}
