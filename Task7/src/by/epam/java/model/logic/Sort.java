package by.epam.java.model.logic;

import by.epam.java.model.entity.container.CollectionAble;

public class Sort {

    public static double[] sortForPrice(CollectionAble collec){

        double[] arr = new double[collec.getSize()];

        for(int i = 0; i < collec.getSize(); i++){
            arr[i] = collec.getElement(i).getPrice();
        }

        for(int i = arr.length - 1; i > 0 ; i--) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = false;
                    double tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }

            }
            if (flag){
                return arr;
            }
        }
        return arr;
    }
}
