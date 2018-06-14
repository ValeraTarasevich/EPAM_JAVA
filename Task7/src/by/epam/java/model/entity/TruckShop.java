package by.epam.java.model.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TruckShop {

    private List<Product> list = new ArrayList<>();

    public void add(Product product){
        list.add(product);
    }

    public void add(Product... prod) {
        list.addAll(Arrays.asList(prod));
    }

    public void delete(int index){
        list.remove(index);
    }

    public int getSize(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public Product getElement(int index){
        return list.get(index);
    }

    public void deleteAll(){
        list.clear();
    }

    public List<Product> getList() {
        return list;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("\n");

        for (Product product : list) {
            if (list != null) {
                builder.append(product.toString()).append("\n");
            }
        }

        return builder.toString();
    }
}
