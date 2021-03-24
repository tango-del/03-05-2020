package homework.lesson3;

import java.util.Scanner;

/*
2.Вводятся два целых числа. Проверить делится ли первое на второе без остатка. Вывести на экран сообщение об этом, а также остаток (если он есть)(сканер).(деление по модулю %)
 */
public class Task2 {
    public static void main(String[] args) {
        numberDivision();
        numberDivision();
    }
    static void numberDivision() {
        System.out.println("Введите первое число:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        if (a % b == 0) {
            System.out.println("Число " + a + " делённое " + b + " = " + (a / b));
        } else if (a % b != 0) {
            System.out.println("Число " + a + " делённое " + b + " = " + (a / b) + " остаток будет: " + (a % b));
        }
    }
}
