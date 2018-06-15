package by.epam.java.model.logic;

import by.epam.java.model.entity.Basket;
import by.epam.java.model.entity.TruckShop;

public class Sort {

    public static double[] sortTruckForPrice(TruckShop truckShop){

        double[] arr = new double[truckShop.getSize()];

        for(int i = 0; i < truckShop.getSize(); i++){
            arr[i] = truckShop.getElement(i).getPrice();
        }

        for(int i = arr.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static double[] sortBasketForPrice(Basket basket){

        double[] arr = new double[basket.getSize()];

        for(int i = 0; i < basket.getSize(); i++){
            arr[i] = basket.getElement(i).getPrice();
        }

        for(int i = arr.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    double tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

}
