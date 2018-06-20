package by.epam.java.model.entity.container;

import by.epam.java.model.entity.Product;

public interface CollectionAble {

    int getSize();
//    void addAll(Product... prod);
    void add(int index, Product... prod);
    void delete(int index);
    void deleteAll();
    int countElement();
    boolean isEmpty();
    Product getElement(int index);


}
