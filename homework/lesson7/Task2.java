package homework.lesson7;/*
1.Дан массив неизвестной величины.
Пользователь вводит произвольное количество значений
последовательно по одному.
Массив должен быть проинициализирован значениями в том порядке
что вводит пользователь
Например:
a.Ввод числа 1
Создан массив {1}
b.Ввод числа -11
Создан массив {1, -11}
c.Ввод числа 73
Создан массива {1, -11, 73}
На выходе массив вида {1, -11, 73}
*/

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        start();
    }

    static void start() {
        Scanner scanner = new Scanner(System.in);
        int indexValue = 0;
        int inputNumber;
        String cont = "Y";
        int[] arr = new int[indexValue];
        do {
            indexValue++;
            int[] temp = new int[indexValue];
            copyArray(arr, temp);
            System.out.println("enter number");
            inputNumber = scanner.nextInt();
            temp[indexValue - 1] = inputNumber;
            arr = temp;
            System.out.println("creating array...");
            printArray(arr);
            System.out.println("Want to continue? Y or N: ");
            cont = scanner.next().toUpperCase();
        } while (cont.equals("Y"));

    }

    static void copyArray(int[] arr, int[] temp) {
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }
}