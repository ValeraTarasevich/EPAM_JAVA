package by.epam.java.model.entity;

import java.util.Arrays;
import java.util.Objects;

public class Basket {

    private static final int PRIME_NUMBER = 31;
    private Product[] products;
    private int size;



    public Basket(int size) {
        this.size = size;
        products = new Product[this.size];
    }

    public int getSize() {
        return size;
    }

    public void add(int index, Product... prod) {
        for (Product aProd : prod) {
            if (index >= 0 && index < products.length) {
                products[index] = aProd;
                index++;
            } else {
                throw new NullPointerException("Incorrect index at addition");
            }
        }
    }

    public void delete(int index){
        if(index >= 0 && index < products.length){
            products[index] = null;
        }
        else{
            throw new NullPointerException("Incorrect index at delete");
        }
    }

    public void deleteAll() {
        for (int i = 0; i < products.length; i++) {
            if (getElement(i) != null) {
                products[i] = null;
            }
        }
    }

    public int countElement(){
        int count = 0;
        for (int i = 0; i < products.length; i++) {
            if (getElement(i) != null) {
                count++;
            }
        }
        return count;
    }

    public boolean isEmpty(){
        int count = 0;
        for (int i = 0; i < getSize(); i++) {
            if (getElement(i) == null) {
                count++;
            }
        }
        return count == getSize();
    }

    public Product getElement(int index) {
        if (index >= 0 && index < products.length) {
            return products[index];
        }
        throw new NullPointerException("Incorrect index at getElement");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return size == basket.size &&
                Arrays.equals(products, basket.products);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(size);
        result = PRIME_NUMBER * result + Arrays.hashCode(products);
        return result;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Product product1 : products) {
            if (product1 != null)
                str.append(product1.toString()).append('\n');
        }
        return str.toString();

    }
}
