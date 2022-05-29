package HomeWorkLesson3;

import java.util.Arrays;

public class HomeWorkApp3 {
    static final int SIZE = 5;

    public static void main(String[] args) {
        arrayOne();
        arrayTwo();
        arrayThree();
        arrayFour();
        arrayFive(2, 3);
        arraySix();
        arraySeven();
    }

    private static void arrayOne() {
        int[] data = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 1) {
                data[i] = 0;
            } else {
                data[i] = 1;
            }
        }
        System.out.println(Arrays.toString(data));
    }

    private static void arrayTwo() {
        int[] data = new int[100];
        for (int i = 0; i < data.length; i++) {
            data[i] = i + 1;
        }
        System.out.println(Arrays.toString(data));
    }

    private static void arrayThree() {
        int[] data = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 6) {
                data[i] = data[i] * 2;
            }
        }
        System.out.println(Arrays.toString(data));
    }


    private static void arrayFour() {
        int[][] data = new int[SIZE][SIZE];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i == j) {
                    data[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%3d", data[i][j]);
            }
            System.out.println();
        }
    }

    private static int[] arrayFive(int len, int initialValue) {
        int[] data = new int[len];
        for (int i = 0; i < data.length; i++) {
            data[i] = initialValue;
        }
        return data;
    }

    private static void arraySix() {
        int[] data = {-1, 15, 35, 49, -3453453, 169, 0, 7, 34, 18973485, 3, 55, -4};
        Arrays.sort(data);
        int min = data[0];
        int max = data[data.length - 1];
        System.out.println("Минимальный элемент = " + min + ", Максимальный элемент = " + max);
    }

    /*Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    если в массиве есть место, в котором сумма левой и правой части массива равны.*/
    private static boolean arraySeven() {
        int summ = 0;
        int leftSumm = 0;
        int[] data7 = {2, 3, 5, 1, 3, 9, 23};
        for (int i = 0; i < data7.length; i++) {
            summ += data7[i];
        }
        if (summ % 2 != 0) {
            System.out.println("В массиве нет равных частей");
            return false;
        }
        for (int i = 0; i < data7.length; i++) {
            leftSumm += data7[i];
            if (leftSumm == summ / 2) {
                System.out.println("Левая часть тождественна правой и каждая из них равняется " + leftSumm);
                return true;
            }
        }
        return false;
    }
}
