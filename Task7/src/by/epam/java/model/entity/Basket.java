package by.epam.java.model.entity;

public class Basket {

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

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Product product1 : products) {
            if (product1 != null)
                str.append(product1.toString()).append('\n');
        }
        return str.toString();

    }
}
