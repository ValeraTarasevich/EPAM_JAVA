package by.epam.java.model.logic;

import by.epam.java.model.entity.container.CollectionAble;

public class Sort {

    public static double[] sortForPrice(CollectionAble collec) {

        double[] arr = new double[collec.getSize()];

        for (int i = 0; i < collec.getSize(); i++) {
            arr[i] = collec.getElement(i).getPrice();
        }

        for (int i = arr.length - 1; i > 0; i--) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = false;
                    double tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }

            }
            if (flag) {
                return arr;
            }
        }
        return arr;
    }

    public static double[] sortByPriceInsert(CollectionAble collec) {

        double[] arr = new double[collec.getSize()];

        for (int i = 0; i < collec.getSize(); i++) {
            arr[i] = collec.getElement(i).getPrice();
        }

        double tmp;
        for (int i = 1; i < arr.length; i++) {
            tmp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < tmp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = tmp;
        }

        return arr;
    }

    public static double[] sortByPriceSelect(CollectionAble collec) {

        double[] arr = new double[collec.getSize()];

        for (int i = 0; i < collec.getSize(); i++) {
            arr[i] = collec.getElement(i).getPrice();
        }

        for (int i = 0; i < arr.length; i++) {

            double min = arr[i];
            int index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }

            if (i != index) {
                double tmp = arr[i];
                arr[i] = arr[index];
                arr[index] = tmp;
            }

        }
        return arr;
    }

}
