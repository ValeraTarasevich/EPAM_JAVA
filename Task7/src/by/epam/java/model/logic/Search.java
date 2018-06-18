package by.epam.java.model.logic;

import by.epam.java.model.entity.Container.Basket;
import by.epam.java.model.entity.Product;
import by.epam.java.model.entity.Container.TruckShop;

public class Search {

    public static Product[] searchProductByColor(TruckShop truckShop, String color){

        Product[] products = new Product[truckShop.getSize()];

        for (int i = 0; i < truckShop.getSize(); i++){
            if (truckShop.getElement(i).getColor().equals(color)){
                products[i] = truckShop.getElement(i);
            }
        }
        return products;
    }
    public static Product[] searchProductByColorBasket(Basket basket, String color){

        Product[] products = new Product[basket.getSize()];

        for (int i = 0; i < basket.getSize(); i++){
            if (basket.getElement(i).getColor().equals(color)){
                products[i] = basket.getElement(i);
            }
        }
        return products;
    }

}
