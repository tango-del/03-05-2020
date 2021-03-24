package homework.lesson5;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
    }
}
//Создать массив типа int на 1000 элементов.
//Заполнить его случайными числами.
//Найти сумму четных положительных элементов массива и вывести в консоль.
