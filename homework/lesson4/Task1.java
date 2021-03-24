package homework.lesson4;

import java.util.Scanner;

/*
Ввести число с помощью сканера. Вывести число сложное или простое. (Простое число делится без остатка только само на себя, или на единицу. Пример - число 5 - простое, так как делится без остатка только на 5 и на 1. Число 9 сложное - так как делится еще и на 3 без остатка.
 */
public class Task1 {
    public static void main(String[] args) {
        checkNumber();
        checkNumber();
    }
    public static void checkNumber() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        boolean check = true;
        for (int i = 2; i < inputNumber / 2; i++) {
            if (inputNumber % i == 0) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("простое");
        } else {
            System.out.println("сложное");
        }
    }
}
//Ввести число с помощью сканера
//Вывести число сложное или простое