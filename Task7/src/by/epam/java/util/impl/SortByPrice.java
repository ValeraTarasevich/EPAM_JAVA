package by.epam.java.util.impl;
import java.util.Comparator;

import by.epam.java.model.entity.Product;

public class SortByPrice implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}
