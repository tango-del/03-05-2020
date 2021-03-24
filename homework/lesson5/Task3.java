package homework.lesson5;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        double[] arr = new double[1000];
        double maxNumber = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 1000;
            if (maxNumber < arr[i] && (int) arr[i] % 2 == 0) {
                maxNumber = arr[i];
                index = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Максимыльный элемент массива: " + maxNumber + " принадлежит индексу: " + index);
    }
}
/*﻿Создать массив типа double на 1000 элементов. Заполнить его случайными числами.
Найти максимальный из элементов массива с четным индексом и вывести в консоль число и его индекс.
*/