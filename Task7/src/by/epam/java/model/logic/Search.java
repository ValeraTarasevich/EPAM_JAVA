package by.epam.java.model.logic;

import by.epam.java.model.entity.container.Basket;
import by.epam.java.model.entity.Product;
import by.epam.java.model.entity.container.CollectionAble;
import by.epam.java.model.entity.container.TruckShop;

public class Search {

    public static Product[] searchProductByColor(CollectionAble collec, String color){

        Product[] products = new Product[collec.getSize()];

        for (int i = 0; i < collec.getSize(); i++){
            if (collec.getElement(i).getColor().equals(color)){
                products[i] = collec.getElement(i);
            }
        }
        return products;
    }
}
