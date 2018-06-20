package by.epam.java.util;

import by.epam.java.model.entity.container.Basket;
import by.epam.java.model.entity.container.CollectionAble;
import by.epam.java.model.entity.container.TruckShop;
import by.epam.java.model.entity.container.TruckShopWithJCF;

public class Generator {

    public static CollectionAble generateBasket(int cCar, int cBear, int cRobot){


        CollectionAble basket = new Basket(cCar + cBear + cRobot);
        int index = 0;
        for (int i = 0 ; i < cCar; i++){
            basket.add(index, Creator.createCar());
            index++;
        }
        for (int i = 0; i < cBear; i++){
            basket.add(index, Creator.createBear());
            index++;
        }
        for (int i = 0; i < cRobot; i++){
            basket.add(index, Creator.createRobot());
            index++;
        }
        return basket;
    }

    public static CollectionAble generateTruckShop(int cCar, int cBear, int cRobot){

        CollectionAble truckShop = new TruckShop();
        int index = 0;
        for (int i = 0 ; i < cCar; i++){
            truckShop.add(index, Creator.createCar());
            index++;
        }
        for (int i = 0; i < cBear; i++){
            truckShop.add(index, Creator.createBear());
            index++;
        }
        for (int i = 0; i < cRobot; i++){
            truckShop.add(index, Creator.createRobot());
            index++;
        }
        return truckShop;
    }

    public static TruckShopWithJCF generateTruckShopWithJCF(int cCar, int cBear, int cRobot){

        TruckShopWithJCF truckShop = new TruckShopWithJCF();
        for (int i = 0 ; i < cCar; i++){
            truckShop.add(Creator.createCar());
        }
        for (int i = 0; i < cBear; i++){
            truckShop.add(Creator.createBear());
        }
        for (int i = 0; i < cRobot; i++){
            truckShop.add(Creator.createRobot());
        }
        return truckShop;
    }

}
