package by.epam.java.model.entity.container;

import by.epam.java.model.entity.Product;

import java.util.Arrays;

public class TruckShop implements CollectionAble{

    private static final int PRIME_NUMBER = 31;
    private static final int DEFAULT_SIZE = 0;

    private Product[] products;

    public TruckShop(){
        products = new Product[DEFAULT_SIZE];
    }
    @Override
    public int getSize() {
        return products.length;
    }

//    public void addAll(Product... prod) {
//        int getSize = getSize();
//        size += prod.length;
//        products = Arrays.copyOf(products, size);
//        System.arraycopy(prod, 0, products, getSize, prod.length);
//    }
//

    public void add(int index, Product... products) {
        try {
            if (index<0 || index>this.products.length){
                throw new NullPointerException();
            }
            Product[] tail = new Product[this.getSize()-index];
            System.arraycopy(this.products, index, tail, 0, tail.length);
            this.products = Arrays.copyOf(this.products, this.products.length+products.length);
            System.arraycopy(products, 0, this.products, index, products.length);
            System.arraycopy(tail, 0, this.products, index+products.length, tail.length);
        } catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Override
    public void delete(int index){
        if(index >= 0 && index < products.length){
            products[index] = null;
        }
        else{
            throw new NullPointerException("Incorrect index at delete");
        }
    }
    @Override
    public void deleteAll() {
        for (int i = 0; i < products.length; i++) {
            if (getElement(i) != null) {
                products[i] = null;
            }
        }
    }
    @Override
    public int countElement(){
        int count = 0;
        for (int i = 0; i < products.length; i++) {
            if (getElement(i) != null) {
                count++;
            }
        }
        return count;
    }
    @Override
    public boolean isEmpty(){
        int count = 0;
        for (int i = 0; i < getSize(); i++) {
            if (getElement(i) == null) {
                count++;
            }
        }
        return count == getSize();
    }
    @Override
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
        TruckShop truckShop = (TruckShop) o;
        return this.getSize() == truckShop.getSize() &&
                Arrays.equals(products, truckShop.products);
    }

    @Override
    public int hashCode() {

        int result = 1;
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
