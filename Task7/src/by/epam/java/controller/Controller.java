package by.epam.java.controller;

import by.epam.java.model.entity.Container.Basket;
import by.epam.java.model.entity.Container.TruckShop;
import by.epam.java.model.entity.Container.TruckShopWithJCF;
import by.epam.java.util.Generator;
import by.epam.java.model.logic.*;
import java.util.Arrays;

import static by.epam.java.view.Printer.*;


public class Controller {

    private static int cCar = 1;
    private static int cBear = 2;
    private static int cRobot = 1;

    public static void functionBasket(){

        Basket basket;
        basket = Generator.generateBasket(cCar, cBear, cRobot);

        if (basket.isEmpty()){
            printConsole("Basket is empty!!!");
            return;
        }

        printBasket(basket);

        printConsole("Size basket: " + basket.getSize());
        printfConsole("Sum price: ", Logic.getPriceProductsBasket(basket));
        printConsole("\nMax price: " + Logic.findMax(basket));
        printConsole("Min price: " + Logic.findMin(basket));
        try {
            printConsole("\nPrint certain product with index: \n" + basket.getElement(1));
        }
        catch (NullPointerException ex){
            printConsole(ex.getMessage());
        }

        try {
            basket.delete(2);
        }
        catch (NullPointerException ex){
            printConsole(ex.getMessage());
            return;
        }
        printConsole("\nAfter delete with index: \n" + basket);

        printConsole("Count products: " + basket.countElement());

        basket.deleteAll();
        if (basket.countElement() == 0) {
            printConsole("Delete all products --> success");
        }
//        else {
//            str = "error";
//            printConsole("Delete all products --> " + str + "\n" + basket);
//        }
    }

    public static void functionTruckShop(){

        TruckShop truckShop;
        truckShop = Generator.generateTruckShop(cCar, cBear, cRobot);

        if (truckShop.isEmpty()){
            printConsole("TruckShop is empty!!!");
            return;
        }

        printTruck(truckShop);

        printConsole("Size: " + truckShop.getSize());

        printfConsole("Sum price: ", Logic.getPriceProductsTruck(truckShop));
        printConsole("\nMax price: " + Logic.findMaxTruckShop(truckShop));
        printConsole("Min price: " + Logic.findMinTruckShop(truckShop));
        try {
            printConsole("\nPrint certain product with index: \n" + truckShop.getElement(1));
        }
        catch (NullPointerException ex){
            printConsole(ex.getMessage());
        }
        try {
            truckShop.delete(2);
        }
        catch (NullPointerException ex){
            printConsole(ex.getMessage());
        }
        printConsole("\nAfter delete with index: \n" + truckShop);

        printConsole("Count products: " + truckShop.countElement());

        truckShop.deleteAll();
        if (truckShop.countElement() == 0) {
            printConsole("Delete all products --> success");
        }
    }

    public static void sortProductsByPrice() {

        TruckShop truckShop;
        truckShop = Generator.generateTruckShop(cCar, cBear, cRobot);

        if (truckShop.isEmpty()){
            printConsole("TruckShop is empty!!!");
            return;
        }

        printTruck(truckShop);
        printConsole("Sort not Fixed by price: " + Arrays.toString(Sort.sortTruckForPrice(truckShop)) + "\n");

        Basket basket;
        basket = Generator.generateBasket(cCar, cBear, cRobot);

        if (basket.isEmpty()){
            printConsole("Basket is empty!!!");
            return;
        }

        printBasket(basket);
        printConsole("Sort Fixed by price: " + Arrays.toString(Sort.sortBasketForPrice(basket)) + "\n");
    }

    public static void searchProducts(){
        TruckShop truckShop;
        truckShop = Generator.generateTruckShop(cCar, cBear, cRobot);
        printTruck(truckShop);
        printConsole("Search by color: " + Arrays.toString(Search.searchProductByColor(truckShop, "black")));

        Basket basket;
        basket = Generator.generateBasket(cCar, cBear, cRobot);
        printBasket(basket);
        printConsole("Search by color: " + Arrays.toString(Search.searchProductByColorBasket(basket, "red")));
    }

    public static void functionTruckShopWithJCF() {

        TruckShopWithJCF truck;
        truck = Generator.generateTruckShopWithJCF(cCar, cBear, cRobot);

        if (truck.isEmpty()) {
            printConsole("TruckShopWithJCF is empty!!");
            return;
        }

        printTruckJCF(truck);
        printfConsole("Sum price: ", Logic.getPriceProductsTruckJCF(truck));
        printConsole("\nMax price: " + Logic.findMaxTruckJCF(truck));
        printConsole("Min price: " + Logic.findMinTruckJCF(truck));
        printConsole("\nCount products: " + truck.getSize());

        try {
            truck.delete(1);
        } catch (IndexOutOfBoundsException ex) {
            printConsole("Error with index at delete");
            return;
        }
        printConsole("\nDelete products with index: " + truck);
        printConsole("Count products: " + truck.getSize());
        try {
            printConsole("Get element with index: \n" + truck.getElement(1));
        } catch (IndexOutOfBoundsException ex) {
            printConsole("Error with index at get element");
            return;
        }

        truck.deleteAll();
        if (truck.getSize() == 0) {
            printConsole("Delete all --> success");
        }
    }
 
}
